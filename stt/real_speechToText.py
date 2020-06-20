#set GOOGLE_APPLICATION_CREDENTIALS=C:\Users\jeonjiwon\Desktop\capstone_jiwon\speechtotext-273207-bb7ae3de971d.json
import time
import static

# 음성을 텍스트로 받을 때, 텍스트 명칭
now = time.localtime()
nowDate = time.strftime("%Y-%m-%d %H;%M;%S", time.localtime(time.time()))

# 음성 -> 텍스트 변환
def transcribe_gcs(gcs_uri):
    from google.cloud import speech
    from google.cloud.speech import enums
    from google.cloud.speech import types

    client = speech.SpeechClient()
    audio = types.RecognitionAudio(uri=gcs_uri)
    config = types.RecognitionConfig(
        #인코딩 형식
        encoding=enums.RecognitionConfig.AudioEncoding.LINEAR16,
        #주파수 설정
        sample_rate_hertz=44100,
        language_code='ko-KR',
        audio_channel_count=1,
        enable_separate_recognition_per_channel=True)

    print(audio)
    operation = client.long_running_recognize(config, audio)
    response = operation.result()

    return response

# Deletes a blob from the bucket
def delete_blob(bucket_name, blob_name):
    from google.cloud import storage
    
    storage_client = storage.Client()

    bucket = storage_client.bucket(bucket_name)
    blob = bucket.blob(blob_name)
    blob.delete()

    print("Blob {} deleted.".format(blob_name))

def response():
    # 버킷 파일 접근
    response = transcribe_gcs("gs://speech-bucket-jiwon/record.wav")
    CLASS_CODE = ""
    CLASS_NAME = ""
    FULL_PATH = ""

    if static.classNum == 0:
        CLASS_CODE = '0_ML'
        CLASS_NAME = 'ML_'
    elif static.classNum == 1:
        CLASS_CODE = '1_BIGDATA'
        CLASS_NAME = 'BIGDATA_'
    elif static.classNum == 2:
        CLASS_CODE = '2_CAPSTONE'
        CLASS_NAME = 'CAPSTONE_'
    elif static.classNum == 3:
        CLASS_CODE = '3_SYSTEM'
        CLASS_NAME = 'SYSTEM_'
    else:
        print("fail")
    
    FULL_PATH = CLASS_CODE + "/" + CLASS_NAME
    textPath(FULL_PATH, response)

    bucket_name = 'speech-bucket-jiwon'
    blob_name = 'record.wav'

    delete_blob(bucket_name, blob_name)

    oracleUpload(CLASS_CODE, CLASS_NAME)

# text file auto upload in oracle dataBase
def oracleUpload(CLASS_CODE, CLASS_NAME):
    import cx_Oracle
    # 한글 지원 방법
    import glob, os
    os.putenv('NLS_LANG', '.UTF8')

    file_name = ""

    os.chdir("C:/Users/jeonjiwon/Desktop/capstone_jiwon/textFile/" + CLASS_CODE + "/")
    for file in glob.glob(CLASS_NAME + str(nowDate) + ".txt"):
        file_name = file

    # 연결에 필요한 기본 정보 (유저, 비밀번호, 데이터베이스 서버 주소)
    conn = cx_Oracle.connect('capstone_jiwon/1234@127.0.0.1:1521/Jeonjiwon')
    cursor = conn.cursor()

    sql = 'INSERT INTO TEXT_LIST VALUES(:TEXT_NM)'

    cursor.execute(sql, TEXT_NM = file_name)
    conn.commit()
    cursor.close()
    conn.close()

    print('text db insert')

def textPath(FULL_PATH, response):
    with open("C:/Users/jeonjiwon/Desktop/capstone_jiwon/textFile/" + FULL_PATH + str(nowDate) + ".txt", "w") as script:
        for result in response.results:
            script.write(u'{}'.format(result.alternatives[0].transcript)+"\n")
        
        print("completed")
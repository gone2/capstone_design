#set GOOGLE_APPLICATION_CREDENTIALS=C:\Users\jeonjiwon\Desktop\capstone_jiwon\speechtotext-273207-bb7ae3de971d.json

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
    import time

    # 음성을 텍스트로 받을 때, 텍스트 명칭
    now = time.localtime()
    nowDate = time.strftime("%Y-%m-%d %H;%M;%S", time.localtime(time.time()))

    # 버킷 파일 접근
    response = transcribe_gcs("gs://speech-bucket-jiwon/record.wav")

    with open("C:/Users/jeonjiwon/Desktop/capstone_jiwon/textFile/" + str(nowDate) + ".txt", "w") as script:
        for result in response.results:
            script.write(u'{}'.format(result.alternatives[0].transcript)+"\n")
    print("completed")


    bucket_name = 'speech-bucket-jiwon'
    blob_name = 'record.wav'

    delete_blob(bucket_name, blob_name)
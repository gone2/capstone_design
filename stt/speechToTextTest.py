#set GOOGLE_APPLICATION_CREDENTIALS=C:\Users\jeonjiwon\Desktop\capstone_jiwon\speechtotext-273207-bb7ae3de971d.json

import time

def transcribe_gcs(gcs_uri):

    from google.cloud import speech
    from google.cloud.speech import enums
    from google.cloud.speech import types

    client = speech.SpeechClient()
    audio = types.RecognitionAudio(uri=gcs_uri)
    config = types.RecognitionConfig(
        #인코딩 형식
        #encoding=enums.RecognitionConfig.AudioEncoding.FLAC,
        encoding=enums.RecognitionConfig.AudioEncoding.LINEAR16,
        #주파수 설정
        #sample_rate_hertz=48000,
        sample_rate_hertz=44100,
        language_code='ko-KR',
        audio_channel_count= 2)

    print(audio)
    operation = client.long_running_recognize(config, audio)
    response = operation.result()

    return response
    
now = time.localtime()
nowDate = time.strftime("%Y-%m-%d %H;%M;%S", time.localtime(time.time()))

# 버킷 파일 접근
# response = transcribe_gcs("gs://speech-bucket-jiwon/test_speech.flac")
response = transcribe_gcs("gs://speech-bucket-jiwon/record_test_1.mp3")

with open("C:/Users/jeonjiwon/Desktop/capstone_jiwon/speech_file/" + str(nowDate) + ".txt", "w") as script:
    for result in response.results:
        script.write(u'{}'.format(result.alternatives[0].transcript)+"\n")

print("completed")

# with open(스크립트파일이름, "w") as script:
#     for result in response.results:

#         print(u'Transcript: {}'.format(result.alternatives[0].transcript))
#         print('Confidence: {}'.format(result.alternatives[0].confidence))
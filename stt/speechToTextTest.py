#set GOOGLE_APPLICATION_CREDENTIALS=C:\Users\jeonjiwon\Desktop\capstone_jiwon\speechtotext-273207-bb7ae3de971d.json
    """Asynchronously transcribes the audio file specified by the gcs_uri."""

def transcribe_gcs(gcs_uri):

    from google.cloud import speech
    from google.cloud.speech import enums
    from google.cloud.speech import types

    client = speech.SpeechClient()
    audio = types.RecognitionAudio(uri=gcs_uri)
    config = types.RecognitionConfig(

encoding=enums.RecognitionConfig.AudioEncoding.FLAC,
        sample_rate_hertz=48000,
        language_code='ko-KR',
        audio_channel_count= 2)

    print(audio)
    operation = client.long_running_recognize(config, audio)
    response = operation.result()

    return response
    

response = transcribe_gcs("gs://speech-bucket-jiwon/Audio.flac")

with open("C:/Users/jeonjiwon/Desktop/capstone_jiwon/speech_file/test.txt", "w") as script:
    for result in response.results:
        print(0)
        script.write(u'{}'.format(result.alternatives[0].transcript)+"\n")

print("completed")

# with open(스크립트파일이름, "w") as script:
#     for result in response.results:

#         print(u'Transcript: {}'.format(result.alternatives[0].transcript))
#         print('Confidence: {}'.format(result.alternatives[0].confidence))
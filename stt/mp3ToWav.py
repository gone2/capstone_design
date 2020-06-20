# from os import path
from pydub import AudioSegment
import os
import sendFileToBucket

def setJson():
    os.environ["GOOGLE_APPLICATION_CREDENTIALS"] = r'C:\Users\jeonjiwon\Desktop\capstone_jiwon\speechtotext-273207-bb7ae3de971d.json'

# files                                                                         
src = 'C://Users//jeonjiwon//Downloads//record.mp3'
dst = 'C://Users//jeonjiwon//Desktop//capstone_jiwon//speechFile//record.wav'

# convert wav to mp3                                                            
sound = AudioSegment.from_mp3(src)
sound.export(dst, format="wav")

# local mp3 delete
if os.path.isfile(src):
    os.remove(src)

    print('local mp3 delete okay')


setJson()

bucket = 'speech-bucket-jiwon'
source_file = 'C://Users//jeonjiwon//Desktop//capstone_jiwon//speechFile//record.wav'
destination_blob = 'record.wav'

sendFileToBucket.upload_blob(bucket, source_file, destination_blob)
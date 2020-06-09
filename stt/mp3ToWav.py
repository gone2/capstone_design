# from os import path
from pydub import AudioSegment
import os

# files                                                                         
src = 'C://Users//jeonjiwon//Downloads//record.mp3'
dst = 'C://Users//jeonjiwon//Desktop//capstone_jiwon//speechFile//record.wav'

# convert wav to mp3                                                            
sound = AudioSegment.from_mp3(src)
sound.export(dst, format="wav")

# local mp3 delete
if os.path.isfile(src):
    os.remove(src)

    print('okay')
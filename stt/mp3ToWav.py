from os import path
from pydub import AudioSegment

# files                                                                         
src = 'C://Users//jeonjiwon//Downloads//seongmin.mp3'
dst = 'C://Users//jeonjiwon//Downloads//test_record.wav'

# convert wav to mp3                                                            
sound = AudioSegment.from_mp3(src)
sound.export(dst, format="wav")

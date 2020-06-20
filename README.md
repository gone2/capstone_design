# capstone_design
Capstone Design by Jiwon

 ## setUp
 ```
  pip install pyaudio
  pip install pydub
  
  pip install --upgrade google-api-python-client
  pip install google-cloud
  pip install google-cloud-speech
  pip install google-cloud-storage
 ```

## Description
 - 음성파일을 텍스트 파일로 변환하여 제공해주는 기능
 - 모바일, 웹에서 사용가능한 반응형 웹으로 구현
 - 해당 기능을 활용한 강의 내용 텍스트화 서비스 제작

# FrameWork & Language
 ```
  # Frot-End : Vue.js(Html은 부트스트랩을 이용한 반응형 웹 구현)
  # Back-End : Spring boot
  # Language : Java, Python3.6
  # Database : Oracle DB
 ```
 
# Speech-To-Text
 ```  
  # Google Cloud API 활용한 STT구현
  # Pyaudio를 활용하여 마이크 권한 획득 및 녹음
  # Python을 통해 Google Bucket에 원격 업로드
  
  ** 주의할 점 **
      - KeyRing, Key 생성
      - 원격 스토리지인 버켓 생성 시 키값을 활용하여 권한부여(권한 관련 에러뜨면, 에러에 나타난 계정에 권한 부여해줄것)
 ```

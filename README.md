# capstone_design
Capstone Design by Jiwon

# Description
## 음성파일을 텍스트 파일로 변환하여 제공해주는 기능
## 모바일, 웹에서 사용가능한 반응형 웹으로 구현
## 해당 기능을 활용한 강의 내용 텍스트화 서비스 제작

# FrameWork & Language
## Frot-End : Vue.js(JavaScript)
## Back-End : Spring boot(Java)

# Speech-To-Text
## Google Cloud 활용
## 주의할 점 : KeyRing, Key 생성
## 원격 스토리지인 버켓 생성 시 키값을 활용하여 권한부여(권한 관련 에러뜨면, 에러에 나타난 계정에 권한 부여해줄것)



# 웹에서 만들어진 mp3 파일을 flac으로 변환
# 변환된 음성파일 버켓으로 바로 전송
# 저장되는 텍스트 파일 이름 코드 변경 필요(동적으로)
# 저장된 텍스트 파일 디비에 저장

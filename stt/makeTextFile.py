import static
import time

# nowDate = ""

# def init() : 
#     nowDate = time.strftime("%Y-%m-%d %H:%M:%S", time.localtime(time.time()))

def makeFile():

    now = time.localtime()
# %Y-%m-%d
    nowDate = time.strftime("%Y-%m-%d %H.%M.%S", time.localtime(time.time()))
    # hh = time.strftime("%H", time.localtime(time.time()))
    # mm = time.strftime("%M", time.localtime(time.time()))
    # ss = time.strftime("%S", time.localtime(time.time()))

    print(now)

    filename = 'C:/Users/jeonjiwon/Desktop/capstone_jiwon/speech_file/' + str(nowDate) + '.txt'
    f = open(filename, "w")

    for i in static.RECORDED_STRING:
        f.write(i+"\n")

    f.close()

    #저장 위치 알아야 되고
    #content 줄바꿈이 되어오는지 확인, 아닐경우 배열로 받아서 처리해야함

    
<template>
    <div class="container">
      
      <audio-recorder
            :attempts="1"
            :time="5"
            :before-recording="callback"
            :pause-recording="callback"
            :after-recording="callback"
            :select-record="callback"
            :before-upload="callback"
            :successful-upload="callback"
            :failed-upload="callback"
            :show-upload-button="false"/>
      <div style="margin-top: 2%; margin-left: 30%;">
        <button @click="startSTT">변환</button>
      </div>

      <div id="loading" style="display:none">
        <img src="img/loading.gif" alt="loading" style="margin-top: 20%;">
      </div>
    </div>

</template>

<script>
import axios from 'axios'
var config = require("@/config.js");

export default {
  name: "recording",
  bodyClass: "index-page",
  methods: {
    callback (data) {
    },
    startSTT() {
      alert('텍스트 변환 시작하겠습니다.')
      document.getElementById('loading').style.display="block"
      
      axios.get('/getStt'
      ).then((result) => {
        var self = this
        var data = result.data
        if(data == "sucess") {
          document.getElementById('loading').style.display="none"
          alert("변환이 완료되었습니다.")

          axios.get('/textFileUpload').then((result) => {

          })
        } else {
          document.getElementById('loading').style.display="none"
          return alert("녹취 후 다운로드 받으시고 '변환'버튼을 눌러주세요.")
        }
      });
    }
  }
};
</script>

<style>
.ar-icon {
  padding-top: 0px;
}

.ar {
  margin-top: 3%;
  margin-left: 30%;
}

#loading {
	width: 100%;
	height: 100%;
	top: 0;
	left: 0;
	position: fixed;
	display: block;
	opacity: 0.8;
	background: white;
	z-index: 99;
	text-align: center;
}
</style>
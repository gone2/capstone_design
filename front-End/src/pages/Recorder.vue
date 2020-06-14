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
      <button @click="startSTT">변환</button>
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
        console.debug(data)
      },
      startSTT() {
        axios.get('/getStt'
      ).then((result) => {
        var self = this
        var data = result.data
        alert("tt")
      }).catch((ex) => {
        console.log("ERROR! : ", ex);
      });
      }
    }
};
</script>

<style>
.ar {
  margin-top: 8%;
  margin-left: 5%
}
</style>
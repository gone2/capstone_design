<template>
  <div class="page-header clear-filter" filter-color="orange">
    <parallax class="page-header-image" style="background-image:url('img/header.jpg')"></parallax>
    <div class="container">
      <audio-recorder
        :attempts="3"
        :time="2"
        :before-recording="callback"
        :pause-recording="callback"
        :after-recording="callback"
        :select-record="callback"
        :before-upload="callback"
        :successful-upload="callback"
        :failed-upload="callback"
        :show-upload-button="false"/>
    </div>
  </div>
</template>

<script>

export default {
  name: "recording",
  bodyClass: "index-page",
  methods: {
      callback (data) {
        console.debug(data)
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
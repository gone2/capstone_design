<template>
    <div class="page-header clear-filter" filter-color="orange">
        <parallax class="page-header-image" style="background-image:url('img/header.jpg')"></parallax>

        <div class="container">
            <h3>시스템 공학 캡스톤 디자인</h3>
            <!-- <div>
              <button @click="startRecording">
                <i class="now-ui-icons education_agenda-bookmark"></i> 녹음
              </button>
            </div>
            <template v-if="recorder_visible"> -->
              <Recorder></Recorder>
            <!-- </template>
            <template v-else>

            </template> -->
        </div>
    </div>
</template>
<script>
import { Parallax } from "@/components";
import { Collapse, CollapseItem } from "@/components";
import Recorder from './Recorder';

export default {
  name: "myrecord",
  bodyClass: "index-page",
  components: {
    Parallax,
    Collapse,
    CollapseItem,
    Recorder
  },
  data: _ => ({
    recorder_visible: false
  }),
  methods: {
    startRecording() {
      var self = this
      if(self.recorder_visible){ //보일때
        self.recorder_visible = false
      }
      else{ //안보일때
        self.recorder_visible = true
      }
    }
  },
};
</script>
<style></style>
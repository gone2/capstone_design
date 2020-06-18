<template>
  <div>
    <div class="page-header clear-filter" filter-color="orange">
      <parallax class="page-header-image" style="background-image:url('img/header.jpg')"></parallax>
      <div class="container">
        <div class="content-center brand">
          <div style="margin-bottom: 2%;">
            <router-link to="/classRecord" v-on:click="classOne()" style="font-size: large;">
              <i class="now-ui-icons education_agenda-bookmark"></i> 머신러닝 실무
            </router-link>
          </div>
          <div style="margin-bottom: 2%;">
            <router-link to="/classRecord" style="font-size: large;">
              <i class="now-ui-icons education_agenda-bookmark"></i> 빅데이터 실무
            </router-link>
          </div>
          <div style="margin-bottom: 2%;">
            <router-link to="/classRecord" style="font-size: large;">
              <i class="now-ui-icons education_agenda-bookmark"></i> 시스템 공학 캡스톤 디자인 녹음
            </router-link>
          </div>
          <div style="margin-bottom: 2%;">
            <router-link to="/classRecord" style="font-size: large;">
              <i class="now-ui-icons education_agenda-bookmark"></i> 지능형 프로그래밍
            </router-link>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import { Parallax } from "@/components";
import { Collapse, CollapseItem } from "@/components";
import { classCheck } from "@/classCheck";

export default {
  name: "myrecord",
  bodyClass: "index-page",
  components: {
    Parallax,
    Collapse,
    CollapseItem
  },
  data: _=> ({
        class_num: ''
    }),
  methods: {
    loginCheck() {
      var self = this;
      classCheck.class_num = self.class_num;
    }
  }
};
</script>
<style></style>

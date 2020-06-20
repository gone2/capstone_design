<template>
  <div>
    <div class="page-header clear-filter" filter-color="orange">
      <parallax class="page-header-image" style="background-image:url('img/header.jpg')"></parallax>
      <div class="container">
        <div class="content-center brand">
          <div style="margin-bottom: 2%;" v-for="(item, index) in myClassList" :key="index">
            <router-link to="/classRecord" style="font-size: large;">
              <div v-on:click="getClassIndex(index)">
                <i class="now-ui-icons education_agenda-bookmark"></i>{{item}}
              </div>
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
import { global } from '@/global'
var config = require("@/config.js");

export default {
  name: "myrecord",
  bodyClass: "index-page",
  components: {
    Parallax,
    Collapse,
    CollapseItem
  },
  created() {

    //test
    this.myClassList = global.CLASS_LIST
    
  },
  data: _=> ({
        myClassList: []
    }),
  methods: {
    loginCheck() {
      var self = this;
      classCheck.class_num = self.class_num;
    },
    getClassIndex(intKey){
      global.CLASS_NUM = intKey
    }
  }
};
</script>
<style></style>

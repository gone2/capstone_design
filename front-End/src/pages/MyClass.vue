<template>
  <div>
    <div class="page-header clear-filter" filter-color="orange">
      <!-- 배경 이미지 설정 -->
      <parallax class="page-header-image" style="background-image:url('img/header.jpg')"></parallax>
      <div class="container">
        <div class="content-center brand">
          <collapse :multiple-active="false">
              <collapse-item v-for="(item, index) in classList" :key="index" v-bind:title="item.CLASS_NAME" v-bind:name="index" style="color: white;">
                <h5>개요</h5>
                <div>{{item.CLASS_CONTENTS}}</div>
                <br>
                <hr width =100% color="gray" align="left" size=30/>
                <h5>목표</h5>
                <div>{{item.CLASS_OUTLINE}}</div>
              </collapse-item>
          </collapse>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import { Parallax } from "@/components"
import { Collapse, CollapseItem } from "@/components"
import axios from 'axios'

export default {
  name: "myclass",
  bodyClass: "index-page",
  components: {
    Parallax,
    Collapse,
    CollapseItem
  },
  created() {
    this.getClassList()
  },
  methods: {
    getClassList() {
      var self = this

      axios.post('/myClassInfo'
      ).then((result) => {
        var data = result.data.classData
        self.classList = data
      })
    }
  },
  data: _ => ({
    classList: []
  })
};
</script>
<style></style>

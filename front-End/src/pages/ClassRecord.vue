<template>
    <div class="page-header clear-filter" filter-color="orange">
        <parallax class="page-header-image" style="background-image:url('img/header.jpg')"></parallax>

        <div class="container">
            <div>시스템 공학 캡스톤 디자인</div>
            <router-link to="/recording" style="font-size: large;">
              <i class="now-ui-icons education_agenda-bookmark"></i> 녹음
            </router-link>
        </div>
    </div>
</template>
<script>
import { Parallax } from "@/components";
import { Collapse, CollapseItem } from "@/components";

export default {
  name: "myrecord",
  bodyClass: "index-page",
  components: {
    Parallax,
    Collapse,
    CollapseItem
  }
};
</script>
<style></style>
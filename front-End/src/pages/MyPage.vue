<template>
  <div>
    <div class="page-header clear-filter" filter-color="orange">
      <div class="container">
        <h3 class="title">나의 정보</h3>
        <!-- <p class="category">Photographer</p> -->
        <div class="content">
          <div class="social-description">
            <h2 style="margin-bottom: 5px;">학번</h2>
            <h4 style="margin-bottom: 30px; margin-top: 0px;">   202046010</h4>
          </div>
          <div class="social-description">
            <h2 style="margin-bottom: 5px;">이름</h2>
            <h4 style="margin-bottom: 30px; margin-top: 0px;">   전지원</h4>
          </div>
          <div class="social-description">
            <h2 style="margin-bottom: 5px;">학과</h2>
            <h4 style="margin-bottom: 30px; margin-top: 0px;">   컴퓨터시스템공학과</h4>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
import { Tabs, TabPane } from '@/components';

export default {
  name: 'mypage',
  bodyClass: 'mypage-page',
  components: {
    Tabs,
    TabPane
  }
};
</script>
<style></style>

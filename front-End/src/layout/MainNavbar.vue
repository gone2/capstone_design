<template>
  <navbar
    position="fixed"
    type="primary"
    :transparent="transparent"
    :color-on-scroll="colorOnScroll"
    menu-classes="ml-auto"
  >
    <template slot-scope="{ toggle, isToggled }">
      <router-link v-popover:popover1 class="navbar-brand" to="/MyClass">
        인하공전
      </router-link>
      <el-popover
        ref="popover1"
        popper-class="popover"
        placement="bottom"
        width="200"
        trigger="hover"
      >
        <div class="popover-body">
          전지원의 캡스톤 프로그램 입니다
        </div>
      </el-popover>
    </template>
    <template slot="navbar-menu">
      <li class="nav-item">
        <router-link to="/myclass" class="nav-link"><i class="now-ui-icons education_atom"></i> 나의강의</router-link>
      </li>
      <li class="nav-item">
        <router-link to="/myrecord" class="nav-link"><i class="now-ui-icons education_paper"></i> 녹음된 파일</router-link>
      </li>
      <li class="nav-item">
        <router-link to="/mypage" class="nav-link"><i class="now-ui-icons users_circle-08"></i> 마이페이지</router-link>
      </li>
      <li class="nav-item">
        <a class="nav-link btn btn-neutral"
           href="http://localhost:8080/#/"
           target="_blank">
          <p>로그아웃</p>
        </a>
      </li>
    </template>
  </navbar>
</template>

<script>
import { DropDown, NavbarToggleButton, Navbar, NavLink } from '@/components';
import { Popover } from 'element-ui';
export default {
  name: 'main-navbar',
  props: {
    transparent: Boolean,
    colorOnScroll: Number
  },
  components: {
    DropDown,
    Navbar,
    NavbarToggleButton,
    NavLink,
    [Popover.name]: Popover
  }
};
</script>

<style scoped></style>

<template>
  <div class="page-header clear-filter" filter-color="orange">
    <!-- 백그라운드 이미지 설정 -->
    <div class="page-header-image" style="background-image: url('img/login.jpg')"></div>
    <div class="content">
      <div class="container">
        <div class="col-md-5 ml-auto mr-auto">
          <card type="login" plain>
            <!-- 중앙 아이콘 이미지 설정 -->
            <div slot="header" class="logo-container" style="width: 150px">
              <img v-lazy="'img/school_logo.png'" alt style="width: 150px" />
            </div>

            <!-- 로그인 input -->
            <fg-input
              class="no-border input-lg"
              addon-left-icon="now-ui-icons users_circle-08"
              placeholder="학번"
              v-model="user_id"
            ></fg-input>

            <!-- 비밀번호 input -->
            <fg-input
              class="no-border input-lg"
              addon-left-icon="now-ui-icons text_caps-small"
              placeholder="비밀번호"
              v-model="user_pw"
              type= password
            ></fg-input>

            <!-- 하단 컴포넌트 -->
            <template slot="raw-content">
              <!-- 로그인 버튼 -->
              <div class="card-footer text-center">
                <a
                  href="#/loginCon"
                  v-on:click="loginCheck()"
                  class="btn btn-primary btn-round btn-lg btn-block"
                >로그인</a>
              </div>
              <!-- 도움말 버튼 -->
              <div class="pull-right">
                <h6>
                  <a href="#pablo" class="link footer-link">로그인이 안되시나요?</a>
                </h6>
              </div>
            </template>
          </card>
        </div>
      </div>
    </div>
    <main-footer></main-footer>
  </div>
</template>
<script>
import { Card, Button, FormGroupInput } from "@/components";
import MainFooter from "@/layout/MainFooter";
import { global } from "@/global";
export default {
  name: "login-page",
  bodyClass: "login-page",
  components: {
    Card,
    MainFooter,
    [Button.name]: Button,
    [FormGroupInput.name]: FormGroupInput,
  },
  data: _=> ({
        user_id: '',
        user_pw: '',
    }),
  methods: {
    // 폼에서 입력한 아이디와 비밀번호를 전역변수에 임시저장 후 loginCon 으로 넘김
    loginCheck() {
      var self = this;
      global.tem_id = self.user_id;
      global.tem_pw = self.user_pw;
    }
  }
};
</script>
<style></style>
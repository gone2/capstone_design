<template>
  <div class="container">
    <div class="row">
      <div class="col-md-6 mx-auto py-4 px-0">
        <div class="card p-0">
          <div class="child">
            <img src="@/assets/inhatc_logo.jpg">
          </div>

          <div class="child">
            <div class="card-title text-center">
              <h5 class="mt-5">강의 내용을 확실히 알자!</h5>
            </div>

            <form class="signup">
              <div class="form-group">
                <input type="text" class="inputForm-control" placeholder="   ID">
              </div>
              <div class="form-group">
                <input type="password" class="inputForm-control" placeholder="   PASSWORD">
              </div>
              <button type="button" class="loginBtn btn btn-primary" v-on:click="loginCheck()">Login</button>
              
              <div class="row">
                <div class="col-6 col-sm-6">
                  <a href="#">
                    <p class="text-left pt-2 ml-1">비밀번호찾기</p>
                  </a>
                </div>
                <div class="col-6 col-sm-6">
                  <a href="#">
                    <p class="text-right pt-2 mr-1">회원가입</p>
                  </a>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- <div id="parant" class="card mb-3" style="max-width: 600px;">
    <div class="row no-gutters">
      <div class="col-md-4">
        <img src="../assets/inhatc_logo.jpg" class="card-img">
      </div>
      <div class="col-md-8">
        <div class="card-body">
          <div class="form-group">
            <input type="email" class="form-control" id="exampleInputEmail1" placeholder="ID" aria-describedby="emailHelp">
          </div>
          <div class="form-group">
            <input type="password" class="form-control" placeholder="PASSWORD" id="exampleInputPassword1">
          </div>
          <button id="loginBt" type="button" class="btn btn-outline-info" v-on:click="loginCheck()">LOGIN</button>
        </div>
      </div>
    </div>
  </div> -->
</template>

<script>
import axios from 'axios';

var config = require('@/config.js')

export default {
  name: 'login',

  data: () => ({
    }),

  methods: {
    loginCheck() {
      var self = this

      axios({
        url: config.url + '/api/company',
        crossDomain: true,
        method: 'POST',
        params: {
            userId: '202046010',
            userPw: 'rlatjdalsajdcjddl'
        }
      }).then((result) => {
        var data = result.data.userId;
        if (result.data.result == 200) {
            self.$router.push({
              name: "myclass"
            })
        }
        else {
            self.snackbarMessage = '업체 목록을 가져오지 못했습니다.';
            self.snackbarRed = true;
        }
      }).catch((ex) => {
        console.log("ERROR! : ", ex);
        self.snackbarMessage = '업체 목록을 가져오지 못했습니다.';
      });

    }
  }

}
</script>

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: rgba(1, 162, 255, 0.1)
}

.container {
  margin-right: 25%;
}

.mx-auto {
  margin: 15% 0 0 20%;
  margin-right: 0%;
}

.card {
  border: none;
  border-radius: 0;
  width: 730px !important;
  margin: 0 auto;
  display: block;
}

.child {
  vertical-align: middle;
  display: table-cell;
  margin: 0;
  padding: 0;
}

.signup {
  display: flex;
  flex-flow: column;
  justify-content: center;
  padding: 10px 50px;
  width: 400px;
}

a {
  text-decoration: none !important
}

h5 {
  color: #0199ff;
  margin-bottom: 3px;
  font-weight: bold
}

small {
  color: rgba(0, 0, 0, 0.3)
}

input {
  width: 100%;
  display: block;
  margin-bottom: 7px
}

.inputForm-control {
  border: 1px solid #358bdc75;
  border-radius: 30px;
  background-color: rgba(0, 0, 0, .075);
  letter-spacing: 1px
}

.inputForm-controll:focus {
  border: 0.5px solid #358bdc75;
  border-radius: 30px;
  box-shadow: none;
  background-color: rgba(0, 0, 0, .075);
  color: #000;
  letter-spacing: 1px
}

.loginBtn {
  display: block;
  width: 100%;
  border-radius: 30px;
  border: none;
  background: linear-gradient(to right, rgb(88, 108, 226) 0%, rgb(24, 232, 247) 100%);
  background: -webkit-linear-gradient(left, rgba(88, 108, 226) 0%, rgba(24, 232, 247) 100%)
}

.text-left {
  color: rgba(0, 0, 0, 0.3);
  font-weight: 400
}

.text-right {
  color: #01a2ff;
  font-weight: bold
}

/* #loginBt {
  margin: 20px;
}

body {
  padding: 0%;
  margin: 0%;
}

#parant {
  position: absolute;
  height: 240px;
  width: 700px;
  margin: -150px 0px 0px -200px;
  top: 50%;
  left: 50%;
} */
</style>
<template>
  <div id="header">
      <div class="below_link">
        <div class="home_logo">
          <img id="logo" src="../assets/inhatc_logo2.jpg">
        </div>

        <div class="menubar">
          <ul>
            <li id="title"><router-link to="/myclass">나의강의</router-link></li>
            <li id="title"><router-link to="/myrecord">강의녹음</router-link></li>
          </ul>
        </div>
      </div>

    <div class="above_link">
        <a href="#" id="logoutMt" class="above_second" v-on:click="logout">로그아웃</a>
        <router-link to="mypage" class="above_first">마이페이지</router-link>
    </div>
  </div>
</template>

<script>

import login from '../vuePage/login'

export default {
  name: 'headercom'

,methods: {
    logout: function(evnet) {
      alert("test alert")
      // this.name
    }
  }
}



</script>

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: rgba(1, 162, 255, 0.1)
}

#logo {
    width: 110%;
}

#header {
  display: flex;
}

#menubar {
  width: 20%;
  margin: 2%;
  float: left;
}

.below_link {
    width: 90%;
    margin: 2% 0 0 3%;
}

.home_logo {
    float: left;
    width:20%;
    box-sizing: border-box;
}

.menubar {
    float: left;
    margin-left: 5%;
    width: 45%;
    box-sizing: border-box;
}

ul {
  list-style: none;
  margin:0;
  padding:0;
}

li {
  list-style-type: none;
  float: left;
}

a {
  color: #0199ff;
}

#title {
  margin: 2% 10% 0 10%;
  border : 0;
  float: left;
  font-size: 25px;
  font-weight: bold;
}

.above_link {
  float: right;
  margin: 2% 0 0 0;
  width: 23%;
}

.above_first {
  width: 45%;
  font-weight: bold;
  float: right;
  margin: 2% 0 0 0;
  color: rgba(0, 0, 0, 0.3);
}

.above_second {
  width: 35%;
  font-weight: bold;
  float: right;
  margin: 2% 0 0 0;
  color: rgba(0, 0, 0, 0.3);
}
</style>
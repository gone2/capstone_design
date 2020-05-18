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
        <router-link to="/mypage" class="above_first">마이페이지</router-link>
        <a href="#" class="above_second" v-on:click="test()">로그아웃</a>
    </div>
  </div>
</template>

<script>
export default {
  name: 'headercom',
  methods: {
      test() {
          alert("김성민 똥꾸멍자식")
          
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
    width: 220px;
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
    width: 40%;
    box-sizing: border-box;
}

ul {
  list-style:none;
  margin:0;
  padding:0;
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
  margin: 2% 2% 0 0;
  width: 23%;
}

a {
  color: #0199ff;
}

.above_first {
  font-weight: bold;
  float: right;
  margin: 2% 2% 0 8%;
  color: rgba(0, 0, 0, 0.3);
}

.above_second {
  width: 80px;
  font-weight: bold;
  float: right;
  margin: 2% 2% 0 8%;
  color: rgba(0, 0, 0, 0.3);
}
</style>
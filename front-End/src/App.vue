<template>
  <div id="app">
    <router-view name="header" />
    <div class="wrapper">
      <router-view />
    </div>
    <router-view name="footer" />
  </div>
</template>

<script>
import login from '@/pages/Login.vue'
import request from 'request'

export default {
  name: 'app',
  components: {
    login
  },
  // mounted() {
  //   request('http://localhost:9000/jiwon/login', function (error, response, body) {
  //     window.console.log('error: ', error);
  //     window.console.log('statusCode: ', response && response.statusCode);
  //     window.console.log('body: ', body);
  //   })
  // }
};
</script>

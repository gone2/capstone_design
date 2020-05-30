<template>
  <footer
    class="footer"
    :class="{ [`footer-${type}`]: type }"
    :data-background-color="backgroundColor"
  >
    <div class="container">
      <nav>
        <ul>
          <li>
            <a href="https://cms.itc.ac.kr/site/inhatc/main.do">
              인하공업전문대학
            </a>
          </li>
          <li>
            <a href="https://portal.inhatc.ac.kr/user/login.face">
              Portal
            </a>
          </li>
          <li>
            <a href="http://cyber.inhatc.ac.kr/">
              E-Learing
            </a>
          </li>
        </ul>
      </nav>
      <div class="copyright">
        &copy; {{ year }}, Designed & Coded by
        <a href="https://github.com/gone2" target="_blank" rel="noopener"
          >Jiwon</a
        >
      </div>
    </div>
  </footer>
</template>
<script>
export default {
  props: {
    backgroundColor: String,
    type: String
  },
  data() {
    return {
      year: new Date().getFullYear()
    };
  }
};
</script>
<style></style>

<template>
  <div>
    <div class="page-header clear-filter" filter-color="orange">
      <parallax class="page-header-image" style="background-image:url('img/header.jpg')"></parallax>
      <div class="container">
        <div class="content-center brand">
          <collapse :multiple-active="false">
          <div></div>
            <collapse-item title="마이 리코드" name="1">
              <div><button>녹음 테스트 버튼</button></div>
            </collapse-item>
            <collapse-item title="머신러닝" name="2">
              <div>인공지능(AI) 머신러닝 분야에서 대표적인 알고리즘에 대한 이해와 학습을 하며, 파이썬과 데이터 관련 라이브러리, 크롤링, 머신러닝 라이브러리 등을 통해 AI서비스를 학습한다.</div>
            </collapse-item>
            <collapse-item title="빅데이터" name="3">
              <div>
                다양한 데이터 수집 소프트웨어 도구들이 존재하며 지속적으로 기술 개발이 이루어지고 있음을 숙지하고, 이러한 소프트웨어 도구를 사용하여 빅데이터 분석에 필요한 데이터를 내/외부에서 수집하고 추출, 정제, 변환에 필요한 형태로 수집하는 능력을 배양한다.
                데이터 처리용 프로그램 언어인 JAVA, C/C++, Python 등의 다양한 자료 측정 방법과 기능을 활용하여 빅데이터 분석을 위하여 수집 저장 된 데이터의 기본 통계를 확인하고, 분포 정도를 분석할 수 있는 능력을 배양한다.
                분석 결과를 이해하기 쉽게 그래픽 의미를 이용하여 시각적으로 표현하고 전달함으로써 정보를 명확하고 효과적으로 전달할 수 있는 능력을 배양한다.
              </div>
            </collapse-item>
          </collapse>
        </div>
      </div>
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

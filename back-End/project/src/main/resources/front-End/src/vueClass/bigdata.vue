<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>빅데이터 실무</h2>
        </div>

        <section class="panel">
            <header class="panel-heading">
                <div class="panel-actions">
                    <a href="#" class="fa fa-caret-down"></a>
                    <a href="#" class="fa fa-times"></a>
                </div>

                <h3 class="panel-title">강의 소개</h3>
            </header>
            <p class="panel-subtitle" style="font-weight: bold;">교과목 개요</p>
            <div class="panel-body">
                <p class="text-justify">빅데이터를 수집하여 분석용 데이터를 탐색하고, 그 분석 결과를 시각화 할 수 있는 능력을 습득하여 산업 현장에서 빅데이터
                    관련 직무를 효율적으로 수행할 수 있는 능력을 기르도록 하기 위한 과목이다.
                </p>
            </div>
            <hr width =100% color="blue" align="left" size=30/>
            <p class="panel-subtitle" style="font-weight: bold;">교육 목표</p>
            <div class="panel-body">
                <p class="text-justify">다양한 데이터 수집 소프트웨어 도구들이 존재하며 지속적으로 기술 개발이 이루어지고 있음을 숙지하고,
                    이러한 소프트웨어 도구를 사용하여 빅데이터 분석에 필요한 데이터를 내/외부에서 수집하고 추출, 정제, 변환에 필요한 형태로 수집하는
                    능력을 배양한다.<br>데이터 처리용 프로그램 언어인 JAVA, C/C++, Python 등의 다양한 자료 측정 방법과 기능을 활용하여 빅데이터 분석을
                    위하여 수집 저장 된 데이터의 기본 통계를 확인하고, 분포 정도를 분석할 수 있는 능력을 배양한다.<br>
                    분석 결과를 이해하기 쉽게 그래픽 의미를 이용하여 시각적으로 표현하고 전달함으로써 정보를 명확하고 효과적으로 전달할 수 있는 능력을 배양한다.
                </p>
            </div>
        </section>
    </div>
</template>

<script>

import headercom from '@/components/header'

export default {
    name: 'myclass',

    components: {
        headercom
    }
}

</script>

<style>
.recordList {
    margin: 2% 0 0 5%;
    width: 50%;
}

.list-group-item {
    font-size: 20px;
}

h2 {
    width: 400px;
    margin: 0 0 2% 0;
}

.panel {
    margin-left: 7%;
    width: 80%;
}

p {
    margin-top: 15px;
}
</style>
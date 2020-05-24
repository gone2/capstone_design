<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>지능형 프로그래밍</h2>
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
                <p class="text-justify">인공지능 기초지식과 응용지식을 강의하고 AI 기술을 이용한 관련 프로그램을 분석 및 구현해 본다.
                </p>
            </div>
            <hr width =100% color="blue" align="left" size=30/>
            <p class="panel-subtitle" style="font-weight: bold;">교육 목표</p>
            <div class="panel-body">
                <p class="text-justify">1. 인공지능 시스템 구현 기술들을 알 수 있다.<br>2. 지능형 시스템 구현 원리를 알 수 있다.
                    <br>3. 간단한 지능형 프로그램을 구현 할 수 있다.
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
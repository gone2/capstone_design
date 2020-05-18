<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>나의 강의 목록</h2>
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><router-link to="/">시스템 공학 캡스톤디자인</router-link></li>
                <li class="list-group-item"><router-link to="/">지능형 프로그래밍</router-link></li>
                <li class="list-group-item"><router-link to="/">머신러닝실무</router-link></li>
                <li class="list-group-item"><router-link to="/">빅데이터실무</router-link></li>
            </ul>
        </div>
    </div>
</template>

<script>

import headercom from '../components/header'

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

a {
    color: black;
}

h2 {
    width: 220px;
    margin: 0 0 2% 0;
}
</style>
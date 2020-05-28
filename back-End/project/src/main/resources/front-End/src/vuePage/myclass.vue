<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <h2>나의 강의 목록</h2>
            <ul class="list-group list-group-flush">
                <li class="list-group-item"><router-link to="capstoneClass">시스템 공학 캡스톤디자인</router-link></li>
                <li class="list-group-item"><router-link to="programingClass">지능형 프로그래밍</router-link></li>
                <li class="list-group-item"><router-link to="machineClass">머신러닝 실무</router-link></li>
                <li class="list-group-item"><router-link to="bigdataClass">빅데이터 실무</router-link></li>
            </ul>
        </div>
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
    width: 220px;
    margin: 0 0 2% 0;
}
</style>
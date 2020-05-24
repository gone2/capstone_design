<template>
    <div>
        <headercom></headercom>
        
        <div class=recordList>
            <div style="float: left;">
                <h2>머신러닝 실무</h2>
            </div>
            <div>
                <button type="button" class="mb-xs mt-xs mr-xs btn btn-primary">Text 녹음</button>
            </div>
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

h2 {
    width: 400px;
    margin: 0 0 2% 0;
}
</style>
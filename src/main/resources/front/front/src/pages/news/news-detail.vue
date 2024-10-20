<template>
  <div :style='{"border":"1px solid #9ce3b5","padding":"20px","boxShadow":"0px 2px 6px #ccc,inset 0px 0px 600px 0px #e0f8e8","margin":"20px auto 0","borderRadius":"16px","background":"#fff","width":"1200px","position":"relative"}'>
    <div class="section-title" :style='{"border":"4px solid","boxShadow":"1px 2px 6px #ccc","margin":"20px auto 20px","color":"#fff","borderRadius":"4px","textAlign":"center","background":"linear-gradient(135deg, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%)","width":"100%","fontSize":"30px","lineHeight":"100px","fontWeight":"600"}'>活动公告</div>
    <div class="section-content">
      <div class="content-title">{{detail.title}}</div>
      <div class="content-sub-title">发布时间：{{detail.addtime}}</div>
      <el-divider></el-divider>
      <div class="content-detail" v-html="detail.content"></div>
    </div>
  </div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        detail: {},
      }
    },
    created() {
      this.detail = Object.assign({}, JSON.parse(this.$route.query.detailObj));
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .section {
    width: 900px;
    margin: 0 auto;
  }

  .section-content {
      margin-top: 30px;
  }
  .content-title {
      text-align: center;
      font-size: 22px;
      font-weight: bold;
  }
  .content-sub-title {
      text-align: center;
      margin-top: 20px;
      color: #888888;
      font-size: 14px;
  }
</style>
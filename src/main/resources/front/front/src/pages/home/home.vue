<template>
<div class="home-preview" :style='{"width":"100%","margin":"20px 0 0","flexWrap":"wrap","justifyContent":"space-between","display":"flex"}'>



<div class="recommend" :style='{"border":"0px solid #dfdfdf","boxShadow":"0px 0px 0px #eee","padding":"0","margin":"0","overflow":"hidden","borderRadius":"0px","background":"url(http://codegen.caihongy.cn/20221118/6840d1949de64f4caac19a375cf196a5.jpg)  fixed center top,#f0f0f0","width":"100%","position":"relative","height":"auto","order":"2"}'>
	<div v-if="true" class="idea recommendIdea" :style='{"padding":"0","margin":"0 auto","flexWrap":"wrap","background":"#efefef","display":"flex","width":"1200px","justifyContent":"space-between"}'>
		<div class="box1" :style='{"width":"1200px","position":"absolute","top":"74px","background":"#08b344","height":"1px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
    <div class="title" :style='{"padding":"0","margin":"60px auto 20px","textAlign":"left","background":"none","width":"1200px","lineHeight":"1","position":"relative"}'>
		<span :style='{"padding":"8px 50px 8px  20px ","fontSize":"30px","color":"#fff","textShadow":"0px 0px 0px #eee","background":"linear-gradient(135deg, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%)","fontWeight":"bold"}'>商品信息推荐</span>
	</div>
	
	
	
	
	
	<!-- 样式四 -->
	<div class="list list4 index-pv1" :style='{"width":"1200px","padding":"0px","margin":"40px auto","overflow":"hidden","background":"none","height":"auto"}'>
		<div v-if="shangpinxinxiRecommend.length>0" class="list-item animation-box" @click="toDetail('shangpinxinxiDetail', shangpinxinxiRecommend[0])" :style='{"cursor":"pointer","margin":"0 0px","borderRadius":"4px","background":"#fff","width":"48%","position":"relative","float":"left","height":"570px"}'>
			<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-if="preHttp(shangpinxinxiRecommend[0].shangpintupian)" :src="shangpinxinxiRecommend[0].shangpintupian.split(',')[0]" alt="" />
			<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-else :src="baseUrl + (shangpinxinxiRecommend[0].shangpintupian?shangpinxinxiRecommend[0].shangpintupian.split(',')[0]:'')" alt="" />
			<div class="title line1" :style='{"whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","borderRadius":"0 0 4px 4px","left":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"16px","position":"absolute","textOverflow":"ellipsis"}'>
                <div>{{shangpinxinxiRecommend[0].shangpinmingcheng}}</div>
                <div>{{shangpinxinxiRecommend[0].shangpinfenlei}}</div>
            </div>
		</div>
		<div class="list-body" :style='{"width":"50%","margin":"0 0 10px","float":"right","background":"none","display":"inline-block","height":"275px"}'>
			<div v-if="shangpinxinxiRecommend.length>1" @click="toDetail('shangpinxinxiDetail', shangpinxinxiRecommend[1])" class="list-item animation-box" :style='{"cursor":"pointer","margin":"0","borderRadius":"4px","background":"#fff","display":"inline-block","width":"49%","position":"relative","float":"left","height":"275px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-if="preHttp(shangpinxinxiRecommend[1].shangpintupian)" :src="shangpinxinxiRecommend[1].shangpintupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-else :src="baseUrl + (shangpinxinxiRecommend[1].shangpintupian?shangpinxinxiRecommend[1].shangpintupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","borderRadius":"0 0 4px 4px","left":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"16px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{shangpinxinxiRecommend[1].shangpinmingcheng}}</div>
                    <div>{{shangpinxinxiRecommend[1].shangpinfenlei}}</div>
                </div>
			</div>
			<div v-if="shangpinxinxiRecommend.length>2" @click="toDetail('shangpinxinxiDetail', shangpinxinxiRecommend[2])" class="list-item animation-box" :style='{"cursor":"pointer","margin":"0","borderRadius":"4px","background":"#fff","display":"inline-block","width":"48%","position":"relative","float":"right","height":"275px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-if="preHttp(shangpinxinxiRecommend[2].shangpintupian)" :src="shangpinxinxiRecommend[2].shangpintupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-else :src="baseUrl + (shangpinxinxiRecommend[2].shangpintupian?shangpinxinxiRecommend[2].shangpintupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","borderRadius":"0 0 4px 4px","left":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"16px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{shangpinxinxiRecommend[2].shangpinmingcheng}}</div>
                    <div>{{shangpinxinxiRecommend[2].shangpinfenlei}}</div>
                </div>
			</div>
		</div>
		<div class="list-body" :style='{"width":"50%","margin":"10px 0 0","float":"right","display":"inline-block","height":"275px"}'>
			<div v-if="shangpinxinxiRecommend.length>3" @click="toDetail('shangpinxinxiDetail', shangpinxinxiRecommend[3])" class="list-item animation-box" :style='{"cursor":"pointer","margin":"0px","borderRadius":"4px","background":"#fff","display":"inline-block","width":"49%","position":"relative","float":"left","height":"275px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-if="preHttp(shangpinxinxiRecommend[3].shangpintupian)" :src="shangpinxinxiRecommend[3].shangpintupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-else :src="baseUrl + (shangpinxinxiRecommend[3].shangpintupian?shangpinxinxiRecommend[3].shangpintupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","borderRadius":"0 0 4px 4px","left":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"16px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{shangpinxinxiRecommend[3].shangpinmingcheng}}</div>
                    <div>{{shangpinxinxiRecommend[3].shangpinfenlei}}</div>
                </div>
			</div>
			<div v-if="shangpinxinxiRecommend.length>4" @click="toDetail('shangpinxinxiDetail', shangpinxinxiRecommend[4])" class="list-item animation-box" :style='{"cursor":"pointer","margin":"0","borderRadius":"4px","background":"#fff","display":"inline-block","width":"48%","position":"relative","float":"right","height":"275px"}'>
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-if="preHttp(shangpinxinxiRecommend[4].shangpintupian)" :src="shangpinxinxiRecommend[4].shangpintupian.split(',')[0]" alt="" />
				<img :style='{"width":"100%","objectFit":"cover","borderRadius":"4px","float":"left","height":"100%"}' v-else :src="baseUrl + (shangpinxinxiRecommend[4].shangpintupian?shangpinxinxiRecommend[4].shangpintupian.split(',')[0]:'')" alt="" />
				<div class="title line1" :style='{"whiteSpace":"nowrap","color":"#fff","textAlign":"center","bottom":"0","overflow":"hidden","borderRadius":"0 0 4px 4px","left":"0","background":"rgba(0,0,0,.3)","width":"100%","lineHeight":"44px","fontSize":"16px","position":"absolute","textOverflow":"ellipsis"}'>
                    <div>{{shangpinxinxiRecommend[4].shangpinmingcheng}}</div>
                    <div>{{shangpinxinxiRecommend[4].shangpinfenlei}}</div>
                </div>
			</div>
		</div>
	</div>
	
	
	
	
	
	
	<div @click="moreBtn('shangpinxinxi')" :style='{"border":"0px solid #ffa100","cursor":"pointer","boxShadow":"0px 0px 0px #ddd5c6,inset 0px 0px 0px 0px #ffa100","margin":"40px auto 40px","borderRadius":"0px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221118/85c87f82844444f2b945ecfffbbad360.png) repeat-x","display":"block","width":"1200px","lineHeight":"44px"}'>
		<span :style='{"padding":"0 0 0 10px","borderColor":"#ccc","margin":"0","color":"#333","background":"#eee","borderWidth":"1px 0 1px 1px","display":"inline-block","width":"100px","fontSize":"16px","lineHeight":"44px","borderStyle":"solid","height":"44px"}'>查看更多</span>
		<i v-if="true" :style='{"padding":"0 20px 0 0","borderColor":"#ccc","margin":"0 0 0 -10px","color":"#333","borderWidth":"1px 1px 1px 0px","background":"#eee","display":"inline-block","width":"40px","fontSize":"16px","lineHeight":"44px","borderStyle":"solid","height":"44px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>

	
<div class="news" :style='{"border":"0px solid #dfdfdf","padding":"20px 0","boxShadow":"0px 0px 0px #eee","margin":"40px auto 0px auto","overflow":"hidden","borderRadius":"0px","background":"url(http://codegen.caihongy.cn/20221118/f282d6a058104a0594f1057196141cd5.jpg) fixed no-repeat center top","width":"100%","position":"relative","height":"auto","order":"6"}'>
	<div v-if="true" class="idea newsIdea" :style='{"padding":"0","margin":"0 auto","flexWrap":"wrap","background":"none","display":"flex","width":"1200px","justifyContent":"space-between"}'>
		<div class="box1" :style='{"width":"1200px","margin":"0 auto","position":"absolute","top":"74px","background":"#08b344","height":"1px"}'></div>
		<div class="box2" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box3" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box4" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box5" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box6" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box7" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box8" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box9" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
		<div class="box10" :style='{"width":"20%","background":"#fff","display":"none","height":"80px"}'></div>
	</div>
	
	<div class="title" :style='{"padding":"0","margin":"40px auto","textAlign":"left","background":"none","width":"1200px","lineHeight":"1","position":"relative"}'>
		<span :style='{"padding":"8px 50px 8px  20px ","fontSize":"30px","color":"#fff","textShadow":"0px 0px 0px #eee","background":"linear-gradient(135deg, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%)","fontWeight":"bold"}'>活动公告</span>
	</div>
	
	
	
	
	
	
	
	
	
	
	
	<!-- 样式十 -->
	<div v-if="newsList.length" class="list list10 index-pv1" :style='{"padding":"0px","margin":"0 auto","flexWrap":"wrap","background":"#fff","display":"flex","width":"1200px","justifyContent":"space-between","height":"auto"}'>
	  <div v-if="newsList.length>0" @click="toDetail('newsDetail', newsList[0])" :style='{"cursor":"pointer","padding":"20px 40px","margin":"0","flexWrap":"wrap","background":"#f5f5f5","display":"flex","width":"47%","position":"relative","float":"left","justifyContent":"space-between","height":"auto"}' class="new10-list-item animation-box">
	    <img :style='{"padding":"16px","margin":"0 0 24px","objectFit":"cover","borderRadius":"4px","background":"url(http://codegen.caihongy.cn/20221119/79d7fa9b750445998801a11399d2bc50.png) no-repeat","display":"block","width":"485px","backgroundSize":"100% 100%","height":"180px","order":"4"}' :src="baseUrl + newsList[0].picture" alt="">
		<div :style='{"padding":"0 0px","whiteSpace":"nowrap","overflow":"hidden","color":"#333","width":"100%","fontSize":"18px","lineHeight":"normal","textOverflow":"ellipsis","order":"2"}' class="new9-list-item-title line1">{{newsList[0].title}}</div>
		<div :style='{"width":"100%","margin":"0 0 20px","fontSize":"30px","lineHeight":"24px","color":"#aaa","order":"1"}' class="new9-list-item-time">{{newsList[0].addtime.split(' ')[0]}}</div>
	    <div :style='{"padding":"0","margin":"10px 0","overflow":"hidden","color":"#666","background":"none","width":"100%","fontSize":"14px","lineHeight":"24px","textIndent":"2em","order":"3","height":"72px"}' class="new9-list-item-descript line2">{{newsList[0].introduction}}</div>
		<div :style='{"cursor":"pointer","border":"1px solid #08b344","padding":"0 20px 0 0","margin":"0 10px 10px","color":"#08b344","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221118/1e65a4c4af854727a6b17466c815fd4f.png) no-repeat 100px 13px","display":"inline-block","width":"160px","fontSize":"16px","lineHeight":"38px","order":"5"}' class="new9-list-item-identification">MORE</div>
	  </div>
	  <div v-if="newsList.length>1" :style='{"margin":"20px 20px 20px 0","borderColor":"#ddd","background":"#fff","flexDirection":"column","borderWidth":"1px 0 0 0","display":"flex","width":"47%","position":"relative","borderStyle":"solid","float":"right","justifyContent":"space-between","height":"auto"}'>
	    <div v-for="(item,index) in newsList" v-if="index<4 && index>0" :key="index" @click="toDetail('newsDetail', item)" :style='{"cursor":"pointer","padding":"20px 10px","borderColor":"#ddd","flexWrap":"wrap","background":"none","borderWidth":"0 0 1px","display":"flex","width":"100%","position":"relative","borderStyle":"solid","height":"auto"}' class="new10-list-item animation-box">
	        <div :style='{"padding":"0px","whiteSpace":"nowrap","overflow":"hidden","color":"#333","background":"none","width":"100%","fontSize":"18px","lineHeight":"1","textOverflow":"ellipsis","order":"1"}' class="new9-list-item-title line1">{{ item.title }}</div>
	        <div :style='{"fontSize":"14px","lineHeight":"24px","position":"absolute","right":"20px","color":"#999","top":"56px"}' class="new9-list-item-time">{{ item.addtime.split(' ')[0] }}</div>
			<div :style='{"padding":"0 20% 0 0","overflow":"hidden","color":"#666","background":"url(http://codegen.caihongy.cn/20221118/5f2614a0ca4247c7a52dd7ea8596b89c.png) no-repeat 97% center","width":"100%","fontSize":"14px","lineHeight":"30px","textIndent":"2em","order":"3","height":"60px"}' class="new9-list-item-descript line2">{{ item.introduction }}</div>
			<div :style='{"padding":"0px","margin":"10px 0 0","color":"#999","background":"linear-gradient(135deg, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%)","display":"block","width":"40px","fontSize":"12px","height":"4px","order":"2"}' class="new9-list-item-identification"></div>
	    </div>
	  </div>
	</div>
	
	<div @click="moreBtn('news')" :style='{"border":"0px solid #ffa100","cursor":"pointer","boxShadow":"0px 0px 0px #ddd5c6,inset 0px 0px 0px 0px #ffa100","margin":"40px auto 40px","borderRadius":"0px","textAlign":"center","background":"url(http://codegen.caihongy.cn/20221118/85c87f82844444f2b945ecfffbbad360.png) repeat-x","display":"block","width":"1200px","lineHeight":"44px"}'>
		<span :style='{"padding":"0 0 0 10px","borderColor":"#ccc","margin":"0","color":"#333","background":"#eee","borderWidth":"1px 0 1px 1px","display":"inline-block","width":"100px","fontSize":"16px","lineHeight":"44px","borderStyle":"solid","height":"44px"}'>查看更多</span>
		<i v-if="true" :style='{"padding":"0 20px 0 0","borderColor":"#ccc","margin":"0 0 0 -10px","color":"#333","borderWidth":"1px 1px 1px 0px","background":"#eee","display":"inline-block","width":"40px","fontSize":"16px","lineHeight":"44px","borderStyle":"solid","height":"44px"}' class="el-icon-d-arrow-right"></i>
	</div>
	
</div>




</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
        baseUrl: '',
        newsList: [],
        shangpinxinxiRecommend: [],

      }
    },
    created() {
      this.baseUrl = this.$config.baseUrl;
      this.getNewsList();
      this.getList();
    },
    //方法集合
    methods: {
      preHttp(str) {
          return str && str.substr(0,4)=='http';
      },
		getNewsList() {
			this.$http.get('news/list', {params: {
				page: 1,
				limit: 4,
                sort: 'addtime',
			order: 'desc'}}).then(res => {
				if (res.data.code == 0) {
					this.newsList = res.data.data.list;
					
					
				}
			});
		},
		getList() {
          let autoSortUrl = "";
          autoSortUrl = "shangpinxinxi/autoSort";
			this.$http.get(autoSortUrl, {params: {
				page: 1,
				limit: 6,
			}}).then(res => {
				if (res.data.code == 0) {
					this.shangpinxinxiRecommend = res.data.data.list;
					
					
					// 商品列表样式五
					
				}
			});
			
		},
		toDetail(path, item) {
			this.$router.push({path: '/index/' + path, query: {detailObj: JSON.stringify(item)}});
		},
		moreBtn(path) {
			this.$router.push({path: '/index/' + path});
		}
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.home-preview {
	
		.recommend {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
        }
        
        .list5 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				filter: brightness(1.1);
				transform: rotate(0deg);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				opacity: 0.75;
				transition: all 0.3s ease-in-out 0s;
			}
		}
		
		.news {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list3 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list6 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list6 .swiper-button-next {
				left: auto;
				right: 10px;
			}
			
			.list6 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				filter: brightness(1.1);
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: all 0.3s ease-in-out 0s;
			}
		}
	
		.lists {
			.list3 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list3 .swiper-button-prev::after {
				color: #08b344;
			}
			
			.list3 .swiper-button-next {
				left: auto;
				right: 10px;
        }
        
        .list3 .swiper-button-next::after {
				color: #08b344;
			}
			
			.list5 .swiper-button-prev {
				left: 10px;
				right: auto;
			}
			
			.list5 .swiper-button-prev::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 .swiper-button-next {
            left: auto;
            right: 10px;
			}
			
			.list5 .swiper-button-next::after {
				color: rgb(64, 158, 255);
			}
			
			.list5 {
				.swiper-slide-prev {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-next {
					position: relative;
					z-index: 3;
				}
		
				.swiper-slide-active {
					position: relative;
					z-index: 5;
				}
			}
			
			.index-pv1 .animation-box {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
				z-index: initial;
			}
			
			.index-pv1 .animation-box:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				transition: 0.3s;
				z-index: 1;
			}
			
			.index-pv1 .animation-box img {
				transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
			}
			
			.index-pv1 .animation-box img:hover {
				-webkit-perspective: 1000px;
				perspective: 1000px;
				opacity: 0.75;
				transition: all 0.3s ease-in-out 0s;
			}
		}
	}
</style>

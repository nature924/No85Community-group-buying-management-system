<template>
<div>
	<div :style='{"padding":"12px","boxShadow":"0 0px 6px #ccc","margin":"0px auto","borderColor":"#fff","borderRadius":"0px","background":"linear-gradient(180deg, #eee 0%, #fff 32%, #eee 100%)","borderWidth":"1px 0 1px 0","width":"100%","borderStyle":"solid"}' class="breadcrumb-preview">
		<el-breadcrumb :separator="'Ξ'" :style='{"width":"1200px","margin":"0 auto","fontSize":"14px","lineHeight":"1"}'>
			<el-breadcrumb-item>首页</el-breadcrumb-item>
			<el-breadcrumb-item v-for="(item, index) in breadcrumbItem" :key="index">{{item.name}}</el-breadcrumb-item>
		</el-breadcrumb>
	</div>
	
	<div class="list-preview" :style='{"margin":"0px auto","flexWrap":"wrap","background":"none","display":"flex","width":"1200px","position":"relative","justifyContent":"space-between"}'>
		
		<div class="category-2" :style='{"top":"20px","left":"-110px","flexDirection":"column","display":"flex","width":"100px","position":"absolute","height":"auto"}'>
			<div class="item" :class="swiperIndex == '-1' ? 'active' : ''" @click="getList(1, '全部')" :plain="isPlain">全部</div>
			<div class="item" :class="swiperIndex == index ? 'active' : ''" v-for="(item, index) in fenlei" :key="index" @click="getList(1, item, 'btn' + index)" :ref="'btn' + index" plain>{{item}}</div>
		</div>
	
    <el-form :inline="true" :model="formSearch" class="list-form-pv" :style='{"padding":"10px","margin":"20px auto 0","borderColor":"#9cc0e4","alignItems":"center","display":"flex","borderRadius":"4px","flexWrap":"wrap","background":"#e6eff8","borderWidth":"1px","width":"1200px","borderStyle":"solid","height":"auto","order":"2"}'>
      <el-form-item :style='{"margin":"0 10px"}'>
	    <div class="lable" v-if="true" :style='{"width":"auto","padding":"0 10px","lineHeight":"42px","display":"inline-block"}'>商品名称</div>
        <el-input v-model="formSearch.shangpinmingcheng" placeholder="商品名称" clearable></el-input>
      </el-form-item>
      <el-form-item :style='{"margin":"0 10px"}'>
	    <div class="lable" v-if="true" :style='{"width":"auto","padding":"0 10px","lineHeight":"42px","display":"inline-block"}'>品牌</div>
        <el-input v-model="formSearch.pinpai" placeholder="品牌" clearable></el-input>
      </el-form-item>
      <el-form-item :style='{"margin":"0 10px"}'>
	    <div class="lable" v-if="true" :style='{"width":"auto","padding":"0 10px","lineHeight":"42px","display":"inline-block"}'>商铺名称</div>
        <el-input v-model="formSearch.shangpumingcheng" placeholder="商铺名称" clearable></el-input>
      </el-form-item>
      <el-form-item :style='{"margin":"0 10px"}'>
	    <div class="lable" v-if="true" :style='{"width":"auto","padding":"0 10px","lineHeight":"42px","display":"inline-block"}'>价格</div>
        <el-input v-model="formSearch.pricestart" placeholder="最小价格" clearable></el-input>
      </el-form-item>
      <el-form-item :style='{"margin":"0 10px"}'>
        <el-input v-model="formSearch.priceend" placeholder="最大价格" clearable></el-input>
      </el-form-item>
	  <el-button v-if=" true " :style='{"cursor":"pointer","border":"0px solid #fcbc45","padding":"0px 15px","boxShadow":"0px 0px 0px #d2992f","margin":"0px 10px 0 0","color":"#fff","outline":"none","borderRadius":"4px","background":"#1170d2","width":"auto","fontSize":"14px","lineHeight":"40px","height":"40px"}' type="primary" @click="getList(1, curFenlei)"><i v-if="true" :style='{"color":"#fff","margin":"0 10px 0 0","fontSize":"14px"}' class="el-icon-search"></i>查询</el-button>
	  <el-button v-if="isAuth('shangpinxinxi','新增')" :style='{"cursor":"pointer","border":"0px solid #db961f","padding":"0px 15px","boxShadow":"0px 0px 0px #f8a412","margin":"0px 10px 0 0","color":"#fff","outline":"none","borderRadius":"4px","background":"#08b344","width":"auto","fontSize":"14px","lineHeight":"40px","height":"40px"}' type="primary" @click="add('/index/shangpinxinxiAdd')"><i v-if="true" :style='{"color":"#fff","margin":"0 10px 0 0","fontSize":"14px"}' class="el-icon-circle-plus-outline"></i>添加</el-button>
    </el-form>

	<div class="list" :style='{"width":"100%","margin":"0","background":"none","order":"3"}'>
		<!-- 样式一 -->
		
		<!-- 样式二 -->
		<div class="list2 index-pv1" :style='{"border":"1px solid #9ce3b5","padding":"20px","boxShadow":"0px 0px 0px #ddd,inset 0px 0px 600px 0px #e0f8e8","margin":"20px 0 0","borderRadius":"4px","flexWrap":"wrap","background":"#fff","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<div :style='{"border":"1px solid #ccc","padding":"8px","margin":"0 0 20px","borderRadius":"4px","flexWrap":"wrap","background":"#fff","display":"flex","width":"49%","fontSize":"0","position":"relative","justifyContent":"space-between","height":"auto"}' v-for="(item, index) in dataList" :key="index" @click="toDetail(item)" class="list-item animation-box">
				<img :style='{"cursor":"pointer","padding":"16px","objectFit":"cover","borderRadius":"25%","display":"inline-block","width":"50%","height":"240px"}' v-if="item.shangpintupian && item.shangpintupian.substr(0,4)=='http'" :src="item.shangpintupian" class="image" />
				<img :style='{"cursor":"pointer","padding":"16px","objectFit":"cover","borderRadius":"25%","display":"inline-block","width":"50%","height":"240px"}' v-else :src="baseUrl + (item.shangpintupian?item.shangpintupian.split(',')[0]:'')" class="image" />
				<div class="item-info" :style='{"width":"50%","padding":"20px 20px 0","overflow":"hidden","background":"rgba(255,255,255,1)","display":"inline-block","height":"240px"}'>
					<div :style='{"borderColor":"#08b344","color":"#333","background":"none","borderWidth":"0 0 1px","lineHeight":"32px","fontSize":"14px","borderStyle":"solid"}' class="name ">{{item.shangpinmingcheng}}</div>
					<div :style='{"borderColor":"#08b344","color":"#333","background":"none","borderWidth":"0 0 1px","lineHeight":"32px","fontSize":"14px","borderStyle":"solid"}' class="name ">{{item.shangpinfenlei}}</div>
					<div v-if="item.price" :style='{"padding":"10px","lineHeight":"24px","fontSize":"14px","color":"#c00"}' class="price"><span :style='{"fontSize":"12px"}'>￥</span>{{item.price}}</div>
				</div>
			</div>
		</div>
	</div>

	
	<el-pagination
	  background
	  class="pagination"
	  :pager-count="7"
	  :page-size="pageSize"
	  :page-sizes="pageSizes"
	  prev-text="<"
	  next-text=">"
	  :hide-on-single-page="true"
	  :layout='["total","prev","pager","next","sizes","jumper"].join()'
	  :total="total"
	  :style='{"padding":"0","margin":"20px auto","whiteSpace":"nowrap","color":"#333","width":"1200px","fontWeight":"500","order":"4"}'
	  @current-change="curChange"
      @size-change="sizeChange"
	  @prev-click="prevClick"
	  @next-click="nextClick"
	></el-pagination>

  </div>
</div>
</template>

<script>
  export default {
    //数据集合
    data() {
      return {
	    layouts: '',
		swiperIndex: -1,
        baseUrl: '',
        breadcrumbItem: [
          {
            name: '商品信息'
          }
        ],
        formSearch: {
          shangpinmingcheng: '',
          pinpai: '',
          shangpumingcheng: '',
          price: '',
        },
        fenlei: [],
        dataList: [],
        total: 1,
        pageSize: 12,
		pageSizes: [10,20,30,50],
        totalPage: 1,
        curFenlei: '全部',
        isPlain: false,
        indexQueryCondition: '',
        timeRange: []
      }
    },
    created() {
      this.indexQueryCondition = this.$route.query.indexQueryCondition ? this.$route.query.indexQueryCondition : '';
      this.baseUrl = this.$config.baseUrl;
      this.getFenlei();
      this.getList(1, '全部');
    },
    //方法集合
    methods: {
      add(path) {
        this.$router.push({path: path});
      },
      getFenlei() {
        this.$http.get('option/shangpinfenlei/shangpinfenlei').then(res => {
          if (res.data.code == 0) {
            this.fenlei = res.data.data;
          }
        });
      },
      getList(page, fenlei, ref = '') {
		if(fenlei == '全部') this.swiperIndex = -1;
		for(let i=0;i<this.fenlei.length;i++) {
			if(fenlei == this.fenlei[i]) {
				this.swiperIndex = i;
				break;
			}
		}
        this.curFenlei = fenlei;
        if (this.curFenlei == '全部') {
          this.isPlain = false;
        } else {
          this.isPlain = true;
        }
        let params = {page, limit: this.pageSize};
        let searchWhere = {};
        if (this.formSearch.shangpinmingcheng != '') searchWhere.shangpinmingcheng = '%' + this.formSearch.shangpinmingcheng + '%';
        if (this.formSearch.pinpai != '') searchWhere.pinpai = '%' + this.formSearch.pinpai + '%';
        params['sort'] = 'shangjiariqi';
        params['order'] = 'desc';
        if (this.formSearch.shangpumingcheng != '') searchWhere.shangpumingcheng = '%' + this.formSearch.shangpumingcheng + '%';
        if(this.formSearch.pricestart!='' && this.formSearch.pricestart!=undefined ){
          searchWhere.pricestart = this.formSearch.pricestart
        }
        if(this.formSearch.priceend!='' && this.formSearch.priceend!=undefined){
          searchWhere.priceend = this.formSearch.priceend
        }
        if (this.curFenlei != '全部') searchWhere.shangpinfenlei = this.curFenlei;
        this.$http.get('shangpinxinxi/list', {params: Object.assign(params, searchWhere)}).then(res => {
          if (res.data.code == 0) {
            this.dataList = res.data.data.list;
            this.total = res.data.data.total;
            this.pageSize = res.data.data.pageSize;
            this.totalPage = res.data.data.totalPage;
			
			this.pageSizes = [this.pageSize, this.pageSize*2, this.pageSize*3, this.pageSize*5];
          }
        });
      },
      curChange(page) {
        this.getList(page,this.curFenlei);
      },
      prevClick(page) {
        this.getList(page,this.curFenlei);
      },
      sizeChange(size){
        this.pageSize = size
        this.getList(1,this.curFenlei);
      },
      nextClick(page) {
        this.getList(page,this.curFenlei);
      },
      toDetail(item) {
        this.$router.push({path: '/index/shangpinxinxiDetail', query: {detailObj: JSON.stringify(item)}});
      },
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.list-preview .list-form-pv .el-input {
		width: auto;
	}

	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__separator {
		margin: 0 9px;
		color: #ccc;
		font-weight: 500;
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__inner a {
		color: #333;
		display: inline-block;
	}
	
	.breadcrumb-preview .el-breadcrumb /deep/ .el-breadcrumb__inner {
		color: #999;
		display: inline-block;
	}
	
	.category-1 .item {
		cursor: pointer;
		border: 0px solid #ffd800;
		margin: 0 10px 0 0;
		color: #555;
		white-space: nowrap;
		font-size: 14px;
		line-height: 40px;
		text-overflow: ellipsis;
		border-radius: 30px;
		box-shadow: 0px 0px 0px #ceb44a;
		overflow: hidden;
		background: linear-gradient(180deg, rgba(255,238,161,1) 0%, rgba(255,238,161,1) 51%, rgba(252,213,69,1) 51%, rgba(252,216,69,1) 100%);
		width: 130px;
		text-align: center;
	}
	
	.category-1 .item:hover {
		cursor: pointer;
		border: 0px solid #fcbc45;
		border-radius: 10px;
		margin: 0 10px 0 0;
		color: #333;
		background: linear-gradient(180deg, rgba(255,238,161,1) 0%, rgba(255,238,161,1) 51%, rgba(252,188,69,1) 51%, rgba(252,188,69,1) 100%);
		width: 130px;
		font-size: 14px;
		line-height: 40px;
		text-align: center;
	}
	
	.category-1 .item.active {
		cursor: pointer;
		border: 0px solid #fcbc45;
		border-radius: 10px;
		margin: 0 10px 0 0;
		color: #333;
		background: linear-gradient(180deg, rgba(255,238,161,1) 0%, rgba(255,238,161,1) 51%, rgba(252,188,69,1) 51%, rgba(252,188,69,1) 100%);
		width: 130px;
		font-size: 14px;
		line-height: 40px;
		text-align: center;
	}
	
	.category-2 .item {
		cursor: pointer;
		border-radius: 4px;
		box-shadow: 0;
		margin: 0 0 10px 0;
		color: #fff;
		background: linear-gradient(135deg, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%);
		width: 100%;
		font-size: 14px;
		line-height: 36px;
		text-align: center;
	}
	
	.category-2 .item:hover {
		cursor: pointer;
		border: 1px solid #1170d2;
		border-radius: 4px;
		box-shadow: 0;
		margin: 0 0 10px 0;
		color: #fff;
		background: linear-gradient(135deg, rgba(8,179,68,1) 0%, rgba(17,112,210,1) 100%);
		width: 100%;
		font-size: 14px;
		line-height: 36px;
		text-align: center;
	}
	
	.category-2 .item.active {
		cursor: pointer;
		border: 1px solid #1170d2;
		border-radius: 4px;
		box-shadow: 0;
		margin: 0 0 10px 0;
		color: #fff;
		background: linear-gradient(135deg, rgba(8,179,68,1) 0%, rgba(17,112,210,1) 100%);
		width: 100%;
		font-size: 14px;
		line-height: 36px;
		text-align: center;
	}
	
	.list-form-pv .el-input /deep/ .el-input__inner {
		border: 1px solid #ccc;
		border-radius: 8px;
		padding: 0 10px;
		box-shadow: 1px 1px 1px #ccc;
		margin: 0px;
		outline: none;
		color: #666;
		width: 140px;
		font-size: 14px;
		line-height: 40px;
		height: 40px;
	}
	
	.list-form-pv .el-select /deep/ .el-input__inner {
		border: 1px solid #ccc;
		border-radius: 8px;
		padding: 0 10px;
		box-shadow: 1px 1px 1px #ccc;
		margin: 0px;
		outline: none;
		color: #666;
		width: 140px;
		font-size: 14px;
		line-height: 40px;
		height: 40px;
	}
	
	.list-form-pv .el-date-editor /deep/ .el-input__inner {
		border: 1px solid #ccc;
		border-radius: 8px;
		padding: 0 30px;
		box-shadow: 1px 1px 1px #ccc;
		margin: 0px;
		outline: none;
		color: #666;
		width: 140px;
		font-size: 14px;
		line-height: 40px;
		height: 40px;
	}
	
	.list .index-pv1 .animation-box {
		transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
		z-index: initial;
	}
	
	.list .index-pv1 .animation-box:hover {
		-webkit-perspective: 1000px;
		perspective: 1000px;
		transition: 0.3s;
		z-index: 1;
	}
	
	.list .index-pv1 .animation-box img {
		transform: rotate(0deg) scale(1) skew(0deg, 0deg) translate3d(0px, 0px, 0px);
	}
	
	.list .index-pv1 .animation-box img:hover {
		filter: brightness(1.1) ;
		transform: rotate(0deg)  scale(1.06);
		-webkit-perspective: 1000px;
		perspective: 1000px;
		transition: all 0.3s ease-in-out 0s;
	}
	
	.el-pagination /deep/ .el-pagination__total {
		margin: 0 10px 0 0;
		color: #666;
		font-weight: 400;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-prev {
		border: none;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #666;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-next {
		border: none;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #666;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		min-width: 35px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-prev:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .btn-next:disabled {
		border: none;
		cursor: not-allowed;
		border-radius: 2px;
		padding: 0;
		margin: 0 5px;
		color: #C0C4CC;
		background: #f4f4f5;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pager {
		padding: 0;
		margin: 0;
		display: inline-block;
		vertical-align: top;
	}
	
	.el-pagination /deep/ .el-pager .number {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #666;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: #f4f4f5;
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pager .number:hover {
		cursor: pointer;
		padding: 0 4px;
		margin: 0 5px;
		color: #fff;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: radial-gradient(circle, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%);
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pager .number.active {
		cursor: default;
		padding: 0 4px;
		margin: 0 5px;
		color: #FFF;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		border-radius: 2px;
		background: radial-gradient(circle, rgba(17,112,210,1) 0%, rgba(8,179,68,1) 100%);
		text-align: center;
		min-width: 30px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes {
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input {
		margin: 0 5px;
		width: 100px;
		position: relative;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 25px 0 8px;
		color: #606266;
		display: inline-block;
		font-size: 13px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input span.el-input__suffix {
		top: 0;
		position: absolute;
		right: 0;
		height: 100%;
	}
	
	.el-pagination /deep/ .el-pagination__sizes .el-input .el-input__suffix .el-select__caret {
		cursor: pointer;
		color: #C0C4CC;
		width: 25px;
		font-size: 14px;
		line-height: 28px;
		text-align: center;
	}
	
	.el-pagination /deep/ .el-pagination__jump {
		margin: 0 0 0 24px;
		color: #606266;
		display: inline-block;
		vertical-align: top;
		font-size: 13px;
		line-height: 28px;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__jump .el-input {
		border-radius: 3px;
		padding: 0 2px;
		margin: 0 2px;
		display: inline-block;
		width: 50px;
		font-size: 14px;
		line-height: 18px;
		position: relative;
		text-align: center;
		height: 28px;
	}
	
	.el-pagination /deep/ .el-pagination__jump .el-input .el-input__inner {
		border: 1px solid #DCDFE6;
		cursor: pointer;
		padding: 0 3px;
		color: #606266;
		display: inline-block;
		font-size: 14px;
		line-height: 28px;
		border-radius: 3px;
		outline: 0;
		background: #FFF;
		width: 100%;
		text-align: center;
		height: 28px;
	}
</style>

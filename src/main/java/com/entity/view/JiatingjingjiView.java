package com.entity.view;

import com.entity.JiatingjingjiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 家庭经济信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiatingjingji")
public class JiatingjingjiView extends JiatingjingjiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 家庭类型的值
		*/
		private String jiatingjingjiValue;
		/**
		* 审核状态的值
		*/
		private String jiatingjingjiYesnoValue;



		//级联表 yonghu
			/**
			* 学生姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 学生身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public JiatingjingjiView() {

	}

	public JiatingjingjiView(JiatingjingjiEntity jiatingjingjiEntity) {
		try {
			BeanUtils.copyProperties(this, jiatingjingjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 家庭类型的值
			*/
			public String getJiatingjingjiValue() {
				return jiatingjingjiValue;
			}
			/**
			* 设置： 家庭类型的值
			*/
			public void setJiatingjingjiValue(String jiatingjingjiValue) {
				this.jiatingjingjiValue = jiatingjingjiValue;
			}
			/**
			* 获取： 审核状态的值
			*/
			public String getJiatingjingjiYesnoValue() {
				return jiatingjingjiYesnoValue;
			}
			/**
			* 设置： 审核状态的值
			*/
			public void setJiatingjingjiYesnoValue(String jiatingjingjiYesnoValue) {
				this.jiatingjingjiYesnoValue = jiatingjingjiYesnoValue;
			}












				//级联表的get和set yonghu
					/**
					* 获取： 学生姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 学生身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}




}

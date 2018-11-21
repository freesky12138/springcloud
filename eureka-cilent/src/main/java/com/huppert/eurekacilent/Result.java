package com.huppert.eurekacilent;

import org.springframework.util.StringUtils;

import java.io.Serializable;

public class Result implements Serializable {

	private static final long serialVersionUID = 5925101851082556646L;
	/**
	 * 信息内容
	 */
	private Object content;
	/**
	 * 状态
	 */
	private String status;
	/**
	 * 错误码
	 */
	private String errorCode;
	/**
	 * 错误描述
	 */
	private String errorMsg;

	public enum Status {
		SUCCESS("OK"), ERROR("ERROR");

		private String code;

		private Status(String code) {
			this.code = code;
		}

		public String code() {
			return this.code;
		}
	}

	/**
	 * success
	 */
	public Result() {
		this.status = Status.SUCCESS.code();
	}

	public Result(String content) {
		this.status = Status.SUCCESS.code();
		this.content = content;
	}
	
	public Result(Object content) {
		this.status = Status.SUCCESS.code();
		this.content = content;
	}

	/**
	 * success
	 * 
	 * @param errorCode
	 *            错误码
	 * @param errorMsg
	 *            错误描述
	 */
	public Result(String errorCode, String errorMsg) {
		this(errorCode, errorMsg, Status.ERROR);
	}

	/**
	 * custom
	 * 
	 * @param errorCode
	 *            错误码
	 * @param errorMsg
	 *            错误描述
	 * @param status
	 *            状态
	 */
	public Result(String errorCode, String errorMsg, Status status) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.status = status.code();
	}

	/**
	 * 失败
	 * 
	 * @param code
	 * @param message
	 * @return
	 */
	public Result error(String code, String message) {
		return new Result(code, message, Status.ERROR);
	}

	public Object getContent() {
		return content;
	}

	public Result setContent(Object content) {
		this.content = content;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public Result setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public Result setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public Result setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
		return this;
	}

	public Result setErrorPropertiesMsg(String errorMsg) {
		if(errorMsg.contains(",")) {
			String[] strs = errorMsg.split(",");
			this.errorCode = strs[0];
			this.errorMsg = strs[1];
		} else {
			this.errorMsg = errorMsg;
		}
		//错误状态设置默认值-2018年7月13日14:30:22添加
		if(StringUtils.isEmpty(this.status) || this.status.equals(Status.SUCCESS.code)){
			this.status= Status.ERROR.code;
		}
		return this;
	}
}

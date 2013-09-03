package com.kyu.user.action;

import java.io.File;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @FileName : FileUploadAction.java
 * @Project : struts2_test
 * @Date : 2013. 9. 3.
 * @작성자 : nklee
 * @프로그램설명 :
 */
public class FileUploadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private File fileUpload;
	private String fileUploadContentType;
	private String fileUploadFileName;

	/**
	 * @param fileUpload
	 *            the fileUpload to set
	 */
	public void setFileUpload(File fileUpload) {
		System.out.println("fileName=" + fileUpload.getName());
		this.fileUpload = fileUpload;
	}

	/**
	 * @param fileUploadContentType
	 *            the fileUploadContentType to set
	 */
	public void setFileUploadContentType(String fileUploadContentType) {
		System.out.println("fileUploadContentType=" + fileUploadContentType);
		this.fileUploadContentType = fileUploadContentType;
	}

	/**
	 * @param fileUploadFileName
	 *            the fileUploadFileName to set
	 */
	public void setFileUploadFileName(String fileUploadFileName) {
		System.out.println("fileUploadFileName=" + fileUploadFileName);
		this.fileUploadFileName = fileUploadFileName;
	}

	/**
	 * @return the fileUpload
	 */
	public File getFileUpload() {
		return fileUpload;
	}

	/**
	 * @return the fileUploadContentType
	 */
	public String getFileUploadContentType() {
		return fileUploadContentType;
	}

	/**
	 * @return the fileUploadFileName
	 */
	public String getFileUploadFileName() {
		return fileUploadFileName;
	}

	/**
	 * <pre>
	 * execute
	 *
	 * <pre>
	 * @return
	 * @throws Exception
	 */
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	/**
	 * <pre>
	 * display
	 *
	 * <pre>
	 * @return
	 */
	public String display() {
		return NONE;
	}
}

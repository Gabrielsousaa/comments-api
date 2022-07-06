package com.domain.comments.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {

  private static final long serialVersionUID = 1L;

  private Long timestamp;
  private String message;
  private String error;
  private String path;
  private Integer status;

  public StandardError() {
  }

  public StandardError(Long timestamp, String message, String error, String path, Integer status) {
    this.timestamp = timestamp;
    this.message = message;
    this.error = error;
    this.path = path;
    this.status = status;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}

package com.java.authentication.entity;

import org.springframework.http.HttpStatus;

public class ApiError {
	
		private HttpStatus status;
		private Object errors;

		public ApiError(HttpStatus status, Object errors) {
			super();
			this.status = status;
			this.errors = errors;
		}


		public HttpStatus getStatus() {
			return status;
		}

		public void setStatus(HttpStatus status) {
			this.status = status;
		}

		public Object getErrors() {
			return errors;
		}

		public void setErrors(Object errors) {
			this.errors = errors;
		}
}

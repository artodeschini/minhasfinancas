package org.todeschini.minhas.financas.exception;

public class RegraNegogioException extends RuntimeException {

	private static final long serialVersionUID = -6653210485253037060L;

	public RegraNegogioException() {
		super();
	}

	public RegraNegogioException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RegraNegogioException(String message, Throwable cause) {
		super(message, cause);
	}

	public RegraNegogioException(String message) {
		super(message);
	}

	public RegraNegogioException(Throwable cause) {
		super(cause);
	}

}

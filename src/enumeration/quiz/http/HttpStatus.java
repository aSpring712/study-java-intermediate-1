package enumeration.quiz.http;

/**
 * Http Status
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-17
 * @version 1.0
 */
public enum HttpStatus {

	OK(200, "OK"),
	BAD_REQUEST(400, "Bad Request"),
	NOT_FOUND(404, "Not Found"),
	INTERNAL_SERVER_ERROR(500, "Internal Server Error");

	private final int code;
	private final String message;

	HttpStatus(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public static HttpStatus findByCode(int code) {
		HttpStatus[] values = HttpStatus.values();
		for (HttpStatus status : values) {
			if (status.getCode() == code) {
				return status;
			}
		}
		return null;
	}

	public int getCode() {
		return this.code;
	}

	public String getMessage() {
		return this.message;
	}

	public boolean isSuccess() {
		return code >= 200 && code <= 299;
	}
}
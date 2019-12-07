package com.routemenu.exceptions;

import com.routemenu.exception.ErrorMessage;

public enum ApplicationErrorCode {
	SERVER_ERROR(1000, "Unexpected server error"),
	UNKNOWN_DEVICE(1001, "Request failed because device is not permitted to use transport service."),
	MOBILE_APP_VERSION_NOT_SUPPORTED(1002,
			"You are using an older version of the application. Kindly request you to update to the latest version of the app."),
	SMS_FAILURE(1011, "SMS failure"), USER_REQUEST_INVALID_USER(1100, "No a valid user for raising the request"),
	USER_REQUEST_INVALID_DIRECTION(1101, "Invalid trip direction."),
	USER_REQUEST_INVALID_STATUS(1102, "Invalid trip status."),
	USER_REQUEST_INVALID_TRIP_TIME(1103, "Invalid shift time. Please select a valid shift"),
	USER_REQUEST_INVALID_TRIP_PICKUP_LOCATION(1105, "Invalid trip pick up location."),
	USER_REQUEST_INVALID_TRIP_DROP_LOCATION(1106, "Invalid trip drop location."),
	INVALID_OTP(1107, "Incorrect OTP. Provide correct OTP."),
	MAXIMUM_OTP_ATTEMPT(1107, "Maximum attempts for otp validation done. Press Resend to get new otp."),
	OTP_NOT_VALIDATED(1108, "Otp seems to have expired. Please initiate otp validation again."),
	NOT_USING_AUTHORIZED_EMAIL(1109, "Please use the same email address, you used to validate using otp."),
	NOT_USING_AUTHORIZED_PHONE(1110, "Please use the same phone number, you used to validate using otp."),
	BUSINESS_UNIT_NOT_CONFIGURED(1111, "Configuration for business unit not found");

	private int code;
	private String message;

	ApplicationErrorCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public ErrorMessage getErrorMessage() {
		return new ErrorMessage(code, message);
	}
}

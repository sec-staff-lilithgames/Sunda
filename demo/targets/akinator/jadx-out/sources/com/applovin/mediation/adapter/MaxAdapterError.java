package com.applovin.mediation.adapter;

import com.applovin.impl.mediation.MaxErrorImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxAdapterError extends MaxErrorImpl {
    public static final int ERROR_CODE_INVALID_LOAD_STATE = -5201;
    public static final int ERROR_CODE_MISSING_ACTIVITY = -5601;
    public static final int ERROR_CODE_NO_FILL = 204;
    public static final MaxAdapterError NO_FILL = new MaxAdapterError(204, "No Fill");
    public static final int ERROR_CODE_UNSPECIFIED = -5200;
    public static final MaxAdapterError UNSPECIFIED = new MaxAdapterError(ERROR_CODE_UNSPECIFIED, "Unspecified Error");
    public static final MaxAdapterError INVALID_LOAD_STATE = new MaxAdapterError(-5201, "Invalid Load State");
    public static final int ERROR_CODE_INVALID_CONFIGURATION = -5202;
    public static final MaxAdapterError INVALID_CONFIGURATION = new MaxAdapterError(ERROR_CODE_INVALID_CONFIGURATION, "Invalid Configuration");
    public static final int ERROR_CODE_BAD_REQUEST = -5203;
    public static final MaxAdapterError BAD_REQUEST = new MaxAdapterError(ERROR_CODE_BAD_REQUEST, "Bad Request");
    public static final int ERROR_CODE_NOT_INITIALIZED = -5204;
    public static final MaxAdapterError NOT_INITIALIZED = new MaxAdapterError(ERROR_CODE_NOT_INITIALIZED, "Not Initialized");
    public static final int ERROR_CODE_AD_NOT_READY = -5205;
    public static final MaxAdapterError AD_NOT_READY = new MaxAdapterError(ERROR_CODE_AD_NOT_READY, "Ad Not Ready");
    public static final int ERROR_CODE_TIMEOUT = -5206;
    public static final MaxAdapterError TIMEOUT = new MaxAdapterError(ERROR_CODE_TIMEOUT, "Request Timed Out");
    public static final int ERROR_CODE_NO_CONNECTION = -5207;
    public static final MaxAdapterError NO_CONNECTION = new MaxAdapterError(ERROR_CODE_NO_CONNECTION, "No Connection");
    public static final int ERROR_CODE_SERVER_ERROR = -5208;
    public static final MaxAdapterError SERVER_ERROR = new MaxAdapterError(ERROR_CODE_SERVER_ERROR, "Server Error");
    public static final int ERROR_CODE_INTERNAL_ERROR = -5209;
    public static final MaxAdapterError INTERNAL_ERROR = new MaxAdapterError(ERROR_CODE_INTERNAL_ERROR, "Internal Error");
    public static final int ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT = -5210;
    public static final MaxAdapterError SIGNAL_COLLECTION_TIMEOUT = new MaxAdapterError(ERROR_CODE_SIGNAL_COLLECTION_TIMEOUT, "Signal Collection Timed Out");
    public static final int ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED = -5211;
    public static final MaxAdapterError SIGNAL_COLLECTION_NOT_SUPPORTED = new MaxAdapterError(ERROR_CODE_SIGNAL_COLLECTION_NOT_SUPPORTED, "Signal Collection Not Supported");
    public static final int ERROR_CODE_WEBVIEW_ERROR = -5212;
    public static final MaxAdapterError WEBVIEW_ERROR = new MaxAdapterError(ERROR_CODE_WEBVIEW_ERROR, "WebView Error");
    public static final int ERROR_CODE_AD_EXPIRED = -5213;
    public static final MaxAdapterError AD_EXPIRED = new MaxAdapterError(ERROR_CODE_AD_EXPIRED, "Ad Expired");
    public static final int ERROR_CODE_AD_FREQUENCY_CAPPED = -5214;
    public static final MaxAdapterError AD_FREQUENCY_CAPPED = new MaxAdapterError(ERROR_CODE_AD_FREQUENCY_CAPPED, "Ad Frequency Capped");
    public static final int ERROR_CODE_REWARD_ERROR = -5302;
    public static final MaxAdapterError REWARD_ERROR = new MaxAdapterError(ERROR_CODE_REWARD_ERROR, "Reward Error");
    public static final int ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS = -5400;
    public static final MaxAdapterError MISSING_REQUIRED_NATIVE_AD_ASSETS = new MaxAdapterError(ERROR_CODE_MISSING_REQUIRED_NATIVE_AD_ASSETS, "Missing Native Ad Assets");
    public static final MaxAdapterError MISSING_ACTIVITY = new MaxAdapterError(-5601, "Missing Activity");
    public static final int ERROR_CODE_AD_DISPLAY_FAILED = -4205;
    public static final MaxAdapterError AD_DISPLAY_FAILED = new MaxAdapterError(ERROR_CODE_AD_DISPLAY_FAILED, "Ad Display Failed");

    public MaxAdapterError(int i10) {
        this(i10, "", 0, "");
    }

    public MaxAdapterError(int i10, int i11) {
        this(i10, "", i11, "");
    }

    public MaxAdapterError(int i10, String str) {
        this(i10, str, 0, "");
    }

    public MaxAdapterError(MaxAdapterError maxAdapterError, int i10, String str) {
        this(maxAdapterError.getErrorCode(), maxAdapterError.getErrorMessage(), i10, str);
    }

    public MaxAdapterError(int i10, String str, int i11, String str2) {
        super(i10, str, i11, str2);
    }
}

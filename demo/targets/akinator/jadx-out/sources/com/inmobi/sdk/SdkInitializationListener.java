package com.inmobi.sdk;

import com.inmobi.media.C2959qd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface SdkInitializationListener {
    public static final C2959qd Companion = C2959qd.f33293a;
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final String MISSING_CONTEXT = "Context cannot be null. Please provide a valid context object.";
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    public static final String MISSING_WEBVIEW_DEPENDENCY = "SDK could not be initialized; Required WebView dependency could not be found.";
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";

    void onInitializationComplete(Error error);
}

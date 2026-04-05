package com.inmobi.unification.sdk;

import com.inmobi.media.C2850k6;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface InitializationStatus {
    public static final C2850k6 Companion = C2850k6.f33011a;
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    public static final String SUCCESS = "Success";
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}

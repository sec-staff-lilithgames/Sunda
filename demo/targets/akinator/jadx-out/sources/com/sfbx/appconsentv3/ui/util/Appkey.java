package com.sfbx.appconsentv3.ui.util;

import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Appkey {
    public static final Appkey INSTANCE = new Appkey();
    private static final String REGEX = "^[0-9a-fA-F]{8}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{4}\\b-[0-9a-fA-F]{12}$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);
    private static final String REGEX_FORBIDDEN = "^(0{8}|1{8}|2{8}|3{8}|4{8}|5{8}|6{8}|7{8}|8{8}|9{8})\\b-(0{4}|1{4}|2{4}|3{4}|4{4}|5{4}|6{4}|7{4}|8{4}|9{4})\\b-(0{4}|1{4}|2{4}|3{4}|4{4}|5{4}|6{4}|7{4}|8{4}|9{4})\\b-(0{4}|1{4}|2{4}|3{4}|4{4}|5{4}|6{4}|7{4}|8{4}|9{4})\\b-(0{12}|1{12}|2{12}|3{12}|4{12}|5{12}|6{12}|7{12}|8{12}|9{12})$";
    private static final Pattern PATTERN_FORBIDDEN = Pattern.compile(REGEX_FORBIDDEN);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum AppKeyErrorType {
        INVALID_UUID,
        FORBIDDEN_UUID
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Response {
        public static final Companion Companion = new Companion(null);

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Companion {
            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final Response buildResponse(boolean z10, boolean z11) {
                return (!z10 || z11) ? z11 ? new Error(AppKeyErrorType.FORBIDDEN_UUID) : new Error(AppKeyErrorType.INVALID_UUID) : Success.INSTANCE;
            }

            private Companion() {
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Error extends Response {
            private final AppKeyErrorType errorType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(AppKeyErrorType errorType) {
                super(null);
                e0.checkNotNullParameter(errorType, "errorType");
                this.errorType = errorType;
            }

            public final AppKeyErrorType getErrorType() {
                return this.errorType;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class Success extends Response {
            public static final Success INSTANCE = new Success();

            private Success() {
                super(null);
            }
        }

        public /* synthetic */ Response(u uVar) {
            this();
        }

        private Response() {
        }
    }

    private Appkey() {
    }

    private final boolean isUUID(String str) {
        return PATTERN.matcher(str).matches();
    }

    private final boolean isUUIDForbidden(String str) {
        return PATTERN_FORBIDDEN.matcher(str).matches();
    }

    public final Response isValidAppKey(String appKeyToTest) {
        e0.checkNotNullParameter(appKeyToTest, "appKeyToTest");
        return Response.Companion.buildResponse(isUUID(appKeyToTest), isUUIDForbidden(appKeyToTest));
    }
}

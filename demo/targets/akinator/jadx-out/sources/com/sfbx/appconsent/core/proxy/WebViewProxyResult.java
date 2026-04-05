package com.sfbx.appconsent.core.proxy;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class WebViewProxyResult {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class Error extends WebViewProxyResult {
        private final String errorMessage;
        private final Throwable throwable;

        public /* synthetic */ Error(String str, Throwable th2, u uVar) {
            this(str, th2);
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }

        public /* synthetic */ Error(String str, Throwable th2, int i10, u uVar) {
            this(str, (i10 & 2) != 0 ? null : th2, null);
        }

        private Error(String str, Throwable th2) {
            super(null);
            this.errorMessage = str;
            this.throwable = th2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ErrorFeatureNotPresent extends Error {
        public static final ErrorFeatureNotPresent INSTANCE = new ErrorFeatureNotPresent();

        /* JADX WARN: Multi-variable type inference failed */
        private ErrorFeatureNotPresent() {
            super(WebViewProxyResultKt.getNO_FEATURE_PRESENT_ERROR_DESCRIPTION(), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ErrorInstanceNotAvailable extends Error {
        private final Throwable aThrowable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorInstanceNotAvailable(Throwable aThrowable) {
            super(WebViewProxyResultKt.getNO_INSTANCE_PRESENT_ERROR_DESCRIPTION(), aThrowable, null);
            e0.checkNotNullParameter(aThrowable, "aThrowable");
            this.aThrowable = aThrowable;
        }

        public static /* synthetic */ ErrorInstanceNotAvailable copy$default(ErrorInstanceNotAvailable errorInstanceNotAvailable, Throwable th2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                th2 = errorInstanceNotAvailable.aThrowable;
            }
            return errorInstanceNotAvailable.copy(th2);
        }

        public final Throwable component1() {
            return this.aThrowable;
        }

        public final ErrorInstanceNotAvailable copy(Throwable aThrowable) {
            e0.checkNotNullParameter(aThrowable, "aThrowable");
            return new ErrorInstanceNotAvailable(aThrowable);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ErrorInstanceNotAvailable) && e0.areEqual(this.aThrowable, ((ErrorInstanceNotAvailable) obj).aThrowable);
        }

        public final Throwable getAThrowable() {
            return this.aThrowable;
        }

        public int hashCode() {
            return this.aThrowable.hashCode();
        }

        public String toString() {
            return "ErrorInstanceNotAvailable(aThrowable=" + this.aThrowable + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ErrorPackageManagerNotAvailable extends Error {
        public static final ErrorPackageManagerNotAvailable INSTANCE = new ErrorPackageManagerNotAvailable();

        /* JADX WARN: Multi-variable type inference failed */
        private ErrorPackageManagerNotAvailable() {
            super("No package manager available into the current context", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ErrorPackageNotPresent extends Error {
        public static final ErrorPackageNotPresent INSTANCE = new ErrorPackageNotPresent();

        /* JADX WARN: Multi-variable type inference failed */
        private ErrorPackageNotPresent() {
            super(WebViewProxyResultKt.getNO_PACKAGE_PRESENT_ERROR_DESCRIPTION(), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Success extends WebViewProxyResult {
        public static final Success INSTANCE = new Success();

        private Success() {
            super(null);
        }
    }

    public /* synthetic */ WebViewProxyResult(u uVar) {
        this();
    }

    private WebViewProxyResult() {
    }
}

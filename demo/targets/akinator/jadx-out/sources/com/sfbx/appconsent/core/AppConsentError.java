package com.sfbx.appconsent.core;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class AppConsentError {
    private final Throwable cause;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ConsentCachedError extends AppConsentError {
        /* JADX WARN: Multi-variable type inference failed */
        public ConsentCachedError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public ConsentCachedError(Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ ConsentCachedError(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ConsentError extends AppConsentError {
        /* JADX WARN: Multi-variable type inference failed */
        public ConsentError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public ConsentError(Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ ConsentError(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LoadingCachedError extends AppConsentError {
        /* JADX WARN: Multi-variable type inference failed */
        public LoadingCachedError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public LoadingCachedError(Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ LoadingCachedError(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class LoadingError extends AppConsentError {
        /* JADX WARN: Multi-variable type inference failed */
        public LoadingError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public LoadingError(Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ LoadingError(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ReducerError extends AppConsentError {
        /* JADX WARN: Multi-variable type inference failed */
        public ReducerError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public ReducerError(Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ ReducerError(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SaveExternalIdsCachedError extends AppConsentError {
        /* JADX WARN: Multi-variable type inference failed */
        public SaveExternalIdsCachedError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public SaveExternalIdsCachedError(Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ SaveExternalIdsCachedError(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SaveFloatingPurposesCachedError extends AppConsentError {
        /* JADX WARN: Multi-variable type inference failed */
        public SaveFloatingPurposesCachedError() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public SaveFloatingPurposesCachedError(Throwable th2) {
            super(th2, null);
        }

        public /* synthetic */ SaveFloatingPurposesCachedError(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }
    }

    public /* synthetic */ AppConsentError(Throwable th2, u uVar) {
        this(th2);
    }

    public final Throwable getCause() {
        return this.cause;
    }

    private AppConsentError(Throwable th2) {
        this.cause = th2;
    }

    public /* synthetic */ AppConsentError(Throwable th2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : th2, null);
    }
}

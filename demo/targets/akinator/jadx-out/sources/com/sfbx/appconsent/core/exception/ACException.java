package com.sfbx.appconsent.core.exception;

import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class ACException extends RuntimeException {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ACAppKeyNotFoundException extends ACException {
        /* JADX WARN: Multi-variable type inference failed */
        public ACAppKeyNotFoundException() {
            super(ACExceptionKt.getAppKeyNotFoundMessage(), null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ACCertificationPathValidatorException extends ACException {
        /* JADX WARN: Multi-variable type inference failed */
        public ACCertificationPathValidatorException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ ACCertificationPathValidatorException(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }

        public ACCertificationPathValidatorException(Throwable th2) {
            super(ACExceptionKt.getCertificationPathValidationMessage(), th2, null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ACUnknownException extends ACException {
        /* JADX WARN: Multi-variable type inference failed */
        public ACUnknownException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ ACUnknownException(Throwable th2, int i10, u uVar) {
            this((i10 & 1) != 0 ? null : th2);
        }

        public ACUnknownException(Throwable th2) {
            super(ACExceptionKt.unknownMessage, th2, null);
        }
    }

    public /* synthetic */ ACException(String str, Throwable th2, u uVar) {
        this(str, th2);
    }

    public /* synthetic */ ACException(String str, Throwable th2, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? null : th2, null);
    }

    private ACException(String str, Throwable th2) {
        super(str, th2);
    }
}

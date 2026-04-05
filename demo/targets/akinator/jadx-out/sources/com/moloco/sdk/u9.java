package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public enum u9 implements Internal.EnumLite {
    UNKNOWN(0),
    HTTP_SSL_ERROR(1),
    HTTP_UKNOWN_HOST(2),
    HTTP_REQUEST_TIMEOUT(3),
    HTTP_SOCKET(4),
    ANDROID_WORK_MANAGER_ISSUE(5),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    public static final s9 f47521k = new s9();

    /* renamed from: b, reason: collision with root package name */
    public final int f47523b;

    u9(int i10) {
        this.f47523b = i10;
    }

    public static u9 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 == 1) {
            return HTTP_SSL_ERROR;
        }
        if (i10 == 2) {
            return HTTP_UKNOWN_HOST;
        }
        if (i10 == 3) {
            return HTTP_REQUEST_TIMEOUT;
        }
        if (i10 == 4) {
            return HTTP_SOCKET;
        }
        if (i10 != 5) {
            return null;
        }
        return ANDROID_WORK_MANAGER_ISSUE;
    }

    public static Internal.EnumLiteMap<u9> internalGetValueMap() {
        return f47521k;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return t9.f47496a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f47523b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static u9 valueOf(int i10) {
        return forNumber(i10);
    }
}

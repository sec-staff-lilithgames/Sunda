package com.unity3d.mediation;

import com.ironsource.C3364ne;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class LevelPlayInitError {

    /* renamed from: a, reason: collision with root package name */
    private final int f50664a;

    /* renamed from: b, reason: collision with root package name */
    private final String f50665b;

    public LevelPlayInitError(int i10, String errorMessage) {
        e0.checkNotNullParameter(errorMessage, "errorMessage");
        this.f50664a = i10;
        this.f50665b = errorMessage;
    }

    public final int getErrorCode() {
        return this.f50664a;
    }

    public final String getErrorMessage() {
        return this.f50665b;
    }

    public String toString() {
        return "LevelPlayError(errorCode=" + this.f50664a + ", errorMessage='" + this.f50665b + "')";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LevelPlayInitError(C3364ne sdkError) {
        this(sdkError.c(), sdkError.d());
        e0.checkNotNullParameter(sdkError, "sdkError");
    }
}

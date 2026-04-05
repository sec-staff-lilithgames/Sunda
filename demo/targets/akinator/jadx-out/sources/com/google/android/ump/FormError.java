package com.google.android.ump;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class FormError {

    /* renamed from: a, reason: collision with root package name */
    public final int f29643a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29644b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
        public static final int INTERNAL_ERROR = 1;
        public static final int INTERNET_ERROR = 2;
        public static final int INVALID_OPERATION = 3;
        public static final int TIME_OUT = 4;
    }

    public FormError(int i10, String str) {
        this.f29643a = i10;
        this.f29644b = str;
    }

    public int getErrorCode() {
        return this.f29643a;
    }

    public String getMessage() {
        return this.f29644b;
    }
}

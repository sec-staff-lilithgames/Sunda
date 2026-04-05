package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.aa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3125aa {

    /* renamed from: a, reason: collision with root package name */
    public static final C3125aa f35963a = new C3125aa();

    private C3125aa() {
    }

    public static final <T> T a(T t10, T t11) {
        return t10 == null ? t11 : t10;
    }

    public static final boolean a(Object obj) {
        return a(obj, null, false, 6, null);
    }

    public static final boolean a(Object obj, String errorMessage) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = "reference is null";
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return a(obj, str, z10);
    }

    public static final boolean a(Object obj, String errorMessage, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(errorMessage, "errorMessage");
        if (obj != null) {
            return true;
        }
        if (z10) {
            throw new NullPointerException(errorMessage);
        }
        if (!z10) {
            IronLog.API.error(errorMessage);
            return false;
        }
        throw new tu.t();
    }
}

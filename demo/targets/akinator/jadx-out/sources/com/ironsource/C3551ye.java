package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ye, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3551ye {

    /* renamed from: a, reason: collision with root package name */
    private final C3364ne f39291a;

    /* renamed from: b, reason: collision with root package name */
    private final C3483ue f39292b;

    public C3551ye(C3364ne error) {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        this.f39291a = error;
        this.f39292b = null;
    }

    public final C3364ne a() {
        return this.f39291a;
    }

    public final C3483ue b() {
        return this.f39292b;
    }

    public final boolean c() {
        C3483ue c3483ue;
        if (this.f39291a == null && (c3483ue = this.f39292b) != null) {
            return c3483ue.c().p();
        }
        return false;
    }

    public C3551ye(C3483ue sdkInitResponse) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sdkInitResponse, "sdkInitResponse");
        this.f39292b = sdkInitResponse;
        this.f39291a = null;
    }
}

package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.ya, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3547ya {

    /* renamed from: a, reason: collision with root package name */
    private final C3350n0 f39269a;

    /* renamed from: b, reason: collision with root package name */
    private String f39270b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f39271c;

    public AbstractC3547ya(C3350n0 adTools) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adTools, "adTools");
        this.f39269a = adTools;
        this.f39270b = "";
    }

    public final C3350n0 a() {
        return this.f39269a;
    }

    public final String b() {
        return this.f39270b;
    }

    public final boolean c() {
        return this.f39271c;
    }

    public abstract boolean d();

    public final void a(String str) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "<set-?>");
        this.f39270b = str;
    }

    public final void b(Runnable callback) {
        kotlin.jvm.internal.e0.checkNotNullParameter(callback, "callback");
        this.f39269a.e(callback);
    }

    public final void a(boolean z10) {
        this.f39271c = z10;
    }

    public final void a(Runnable runnable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
        this.f39269a.d(runnable);
    }

    public final void a(C3205f0 adProperties) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adProperties, "adProperties");
        this.f39269a.e().a(new B0(this.f39269a, adProperties, null, 4, null));
    }
}

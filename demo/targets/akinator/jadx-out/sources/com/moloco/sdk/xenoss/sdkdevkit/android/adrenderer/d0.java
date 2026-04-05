package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f47569a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f47570b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47571c;

    /* renamed from: d, reason: collision with root package name */
    public final int f47572d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47573e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47574f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f47575g;

    /* renamed from: h, reason: collision with root package name */
    public final kv.p f47576h;

    public d0() {
        this(false, null, 0, 0, 0, false, false, null, 255, null);
    }

    public final boolean a() {
        return this.f47575g;
    }

    public final boolean b() {
        return this.f47574f;
    }

    public final int c() {
        return this.f47572d;
    }

    public final int d() {
        return this.f47573e;
    }

    public final Boolean e() {
        return this.f47570b;
    }

    public final int f() {
        return this.f47571c;
    }

    public final boolean g() {
        return this.f47569a;
    }

    public final kv.p h() {
        return this.f47576h;
    }

    public d0(boolean z10, Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, kv.p VastRenderer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(VastRenderer, "VastRenderer");
        this.f47569a = z10;
        this.f47570b = bool;
        this.f47571c = i10;
        this.f47572d = i11;
        this.f47573e = i12;
        this.f47574f = z11;
        this.f47575g = z12;
        this.f47576h = VastRenderer;
    }

    public /* synthetic */ d0(boolean z10, Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12, kv.p pVar, int i13, kotlin.jvm.internal.u uVar) {
        this((i13 & 1) != 0 ? true : z10, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? 5 : i10, (i13 & 8) != 0 ? 5 : i11, (i13 & 16) == 0 ? i12 : 5, (i13 & 32) != 0 ? false : z11, (i13 & 64) == 0 ? z12 : false, (i13 & 128) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(0L, (kv.p) null, (kv.p) null, (kv.p) null, (kv.p) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m) null, (kv.p) null, (kv.p) null, (kv.p) null, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j) null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, (Object) null) : pVar);
    }
}

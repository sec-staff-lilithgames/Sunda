package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class i implements kv.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48602b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.a f48603c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f48604e;

    public /* synthetic */ i(kv.a aVar, kv.a aVar2, int i10) {
        this.f48602b = i10;
        this.f48603c = aVar;
        this.f48604e = aVar2;
    }

    @Override // kv.a
    public final Object invoke() {
        switch (this.f48602b) {
            case 0:
                return j.a.C0445a.C0446a.a(this.f48603c, this.f48604e);
            case 1:
                return x.e.a.C0480a.a(this.f48603c, this.f48604e);
            default:
                return x.e.a.b.a(this.f48603c, this.f48604e);
        }
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import p0.j2;
import s2.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class d implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48677b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f48678c;

    public /* synthetic */ d(j2 j2Var, int i10) {
        this.f48677b = i10;
        this.f48678c = j2Var;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        switch (this.f48677b) {
            case 0:
                return h.a(this.f48678c, (v) obj);
            default:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a(this.f48678c, ((Boolean) obj).booleanValue());
        }
    }
}

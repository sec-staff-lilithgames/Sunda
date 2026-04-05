package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer;

import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.v0;
import kotlinx.coroutines.CoroutineScope;
import p0.j2;
import x3.c0;
import x3.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class g implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48699c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f48700e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f48701f;

    public /* synthetic */ g(Object obj, int i10, Object obj2, Object obj3) {
        this.f48698b = i10;
        this.f48699c = obj;
        this.f48700e = obj2;
        this.f48701f = obj3;
    }

    @Override // androidx.lifecycle.v0
    public final void onStateChanged(b1 b1Var, i0 i0Var) {
        switch (this.f48698b) {
            case 0:
                h.a((CoroutineScope) this.f48699c, (c0.e) this.f48700e, (j2) this.f48701f, b1Var, i0Var);
                break;
            case 1:
                l.a((CoroutineScope) this.f48699c, (c0.e) this.f48700e, (j2) this.f48701f, b1Var, i0Var);
                break;
            default:
                c0 c0Var = (c0) this.f48699c;
                j0 j0Var = (j0) this.f48700e;
                g0 g0Var = (g0) this.f48701f;
                c0Var.getClass();
                if (i0Var != i0.upTo(j0Var)) {
                    if (i0Var != i0.ON_DESTROY) {
                        if (i0Var == i0.downFrom(j0Var)) {
                            c0Var.f91551b.remove(g0Var);
                            c0Var.f91550a.run();
                            break;
                        }
                    } else {
                        c0Var.removeMenuProvider(g0Var);
                        break;
                    }
                } else {
                    c0Var.addMenuProvider(g0Var);
                    break;
                }
                break;
        }
    }
}

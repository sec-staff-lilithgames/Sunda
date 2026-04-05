package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l;
import p0.i4;
import p0.k3;
import p0.k4;
import p0.n4;
import p0.v4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final /* synthetic */ class c implements kv.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f49604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f49605c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f49606e;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.f49604b = i10;
        this.f49606e = obj;
        this.f49605c = obj2;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f49604b) {
            case 0:
                return b.c.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h) this.f49606e, (kv.a) this.f49605c, (i1.h) obj, (i1.h) obj2);
            case 1:
                return h.b.a((kv.a) this.f49605c, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e) this.f49606e, (i1.h) obj, (i1.h) obj2);
            case 2:
                return l.c.a((kv.a) this.f49605c, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l) this.f49606e, (i1.h) obj, (i1.h) obj2);
            default:
                i4 i4Var = (i4) this.f49606e;
                v4 v4Var = (v4) this.f49605c;
                int iIntValue = ((Integer) obj).intValue();
                if (obj2 instanceof k4) {
                    k4 k4Var = (k4) obj2;
                    if (!(k4Var.getWrapped() instanceof n4)) {
                        p0.d0.d(v4Var, iIntValue, obj2);
                        i4Var.forgetting(k4Var);
                    }
                } else if (obj2 instanceof k3) {
                    p0.d0.d(v4Var, iIntValue, obj2);
                    ((k3) obj2).release();
                }
                return x0.f87415a;
        }
    }

    public /* synthetic */ c(kv.a aVar, Object obj, int i10) {
        this.f49604b = i10;
        this.f49605c = aVar;
        this.f49606e = obj;
    }
}

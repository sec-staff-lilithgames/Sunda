package com.applovin.impl;

import com.applovin.impl.p3;
import com.applovin.impl.q4;
import com.applovin.impl.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class q9 implements t.a, q4.b, p3.b, t0.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15163b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15164c;

    public /* synthetic */ q9(Object obj, int i10) {
        this.f15163b = i10;
        this.f15164c = obj;
    }

    @Override // com.applovin.impl.p3.b
    public Object a(Object obj) {
        return r3.a((Long) this.f15164c, (Long) obj);
    }

    @Override // t.a, jd.j
    public Object apply(Object obj) {
        switch (this.f15163b) {
            case 0:
                return ((l7) this.f15164c).t((f5) obj);
            default:
                return ((v2) this.f15164c).c((f5) obj);
        }
    }

    @Override // com.applovin.impl.t0.c
    public void a(t0.b bVar) {
        ((t0) this.f15164c).a(bVar);
    }

    @Override // com.applovin.impl.q4.b
    public void a(boolean z10, Object obj, Object obj2) {
        switch (this.f15163b) {
            case 1:
                q4.a((q4.a) this.f15164c, z10, obj, obj2);
                break;
            case 2:
                q4.a((Runnable) this.f15164c, z10, obj, obj2);
                break;
            default:
                ((v1) this.f15164c).a(z10, (Void) obj, (Void) obj2);
                break;
        }
    }
}

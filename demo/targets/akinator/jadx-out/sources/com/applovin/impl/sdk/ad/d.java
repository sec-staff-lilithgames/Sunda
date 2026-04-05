package com.applovin.impl.sdk.ad;

import com.applovin.impl.f5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d implements w3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15362a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15363b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f15362a = i10;
        this.f15363b = obj;
    }

    @Override // w3.b
    public final void accept(Object obj) {
        switch (this.f15362a) {
            case 0:
                ((a) this.f15363b).t((f5) obj);
                break;
            default:
                b.a((String) this.f15363b, (f5) obj);
                break;
        }
    }
}

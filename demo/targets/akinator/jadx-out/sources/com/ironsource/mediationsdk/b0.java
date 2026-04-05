package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdapterBaseInterface f37297c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f37298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f37299f;

    public /* synthetic */ b0(AdapterBaseInterface adapterBaseInterface, String str, List list, int i10) {
        this.f37296b = i10;
        this.f37297c = adapterBaseInterface;
        this.f37298e = str;
        this.f37299f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37296b) {
            case 0:
                c.a(this.f37297c, this.f37298e, this.f37299f);
                break;
            default:
                c.b(this.f37297c, this.f37298e, this.f37299f);
                break;
        }
    }
}

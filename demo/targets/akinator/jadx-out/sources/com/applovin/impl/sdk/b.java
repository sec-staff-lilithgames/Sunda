package com.applovin.impl.sdk;

import com.applovin.impl.d7;
import com.applovin.impl.s1;
import com.applovin.impl.sdk.a;
import com.applovin.impl.v4;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final k f15373a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f15374b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f15375c;

    /* renamed from: d, reason: collision with root package name */
    private d7 f15376d;

    private b(s1 s1Var, a.InterfaceC0038a interfaceC0038a, k kVar) {
        this.f15374b = new WeakReference(s1Var);
        this.f15375c = new WeakReference(interfaceC0038a);
        this.f15373a = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        d();
        this.f15373a.f().a(this);
    }

    public s1 b() {
        return (s1) this.f15374b.get();
    }

    public void d() {
        a();
        s1 s1VarB = b();
        if (s1VarB == null) {
            return;
        }
        s1VarB.setExpired();
        a.InterfaceC0038a interfaceC0038a = (a.InterfaceC0038a) this.f15375c.get();
        if (interfaceC0038a == null) {
            return;
        }
        interfaceC0038a.onAdExpired(s1VarB);
    }

    public static b a(s1 s1Var, a.InterfaceC0038a interfaceC0038a, k kVar) {
        b bVar = new b(s1Var, interfaceC0038a, kVar);
        bVar.a(s1Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j10) {
        a();
        if (((Boolean) this.f15373a.a(v4.f15879a1)).booleanValue() || !this.f15373a.n0().isApplicationPaused()) {
            this.f15376d = d7.a(j10, this.f15373a, new a2.s(this, 13));
        }
    }

    public void a() {
        d7 d7Var = this.f15376d;
        if (d7Var != null) {
            d7Var.a();
            this.f15376d = null;
        }
    }
}

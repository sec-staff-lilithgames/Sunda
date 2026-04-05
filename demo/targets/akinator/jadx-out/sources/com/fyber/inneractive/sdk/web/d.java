package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f26850a;

    public d(i1 i1Var) {
        this.f26850a = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f26850a;
        if (iVar.f26888k) {
            IAlog.a("No user web action detected for : %s blocking.", iVar.f26889l);
            i iVar2 = this.f26850a;
            String strC = iVar2.f26889l.c();
            String strA = this.f26850a.f26889l.a();
            j1 j1Var = iVar2.f26884g;
            if (j1Var != null) {
                j1Var.a(strC, strA);
            }
            IAlog.d("AD_AUTO_CLICK_DETECTED", new Object[0]);
            this.f26850a.f26889l.b();
            this.f26850a.i();
        } else {
            IAlog.a("User web action detected for: %s", iVar.f26889l);
            this.f26850a.f26889l.d();
        }
        this.f26850a.f26889l = null;
    }
}

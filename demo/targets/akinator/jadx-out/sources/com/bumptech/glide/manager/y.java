package com.bumptech.glide.manager;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class y implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f16657a;

    public y(d0 d0Var) {
        this.f16657a = d0Var;
    }

    @Override // com.bumptech.glide.manager.b
    public void onConnectivityChanged(boolean z10) {
        ArrayList arrayList;
        j9.s.assertMainThread();
        synchronized (this.f16657a) {
            arrayList = new ArrayList((HashSet) this.f16657a.f16631c);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((b) it.next()).onConnectivityChanged(z10);
        }
    }
}

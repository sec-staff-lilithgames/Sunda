package com.bumptech.glide.manager;

import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.v1;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n implements m, a1 {

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f16641b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public final k0 f16642c;

    public n(k0 k0Var) {
        this.f16642c = k0Var;
        k0Var.addObserver(this);
    }

    @Override // com.bumptech.glide.manager.m
    public void addListener(o oVar) {
        this.f16641b.add(oVar);
        k0 k0Var = this.f16642c;
        if (k0Var.getCurrentState() == j0.f6614b) {
            oVar.onDestroy();
        } else if (k0Var.getCurrentState().isAtLeast(j0.f6617f)) {
            oVar.onStart();
        } else {
            oVar.onStop();
        }
    }

    @v1(i0.ON_DESTROY)
    public void onDestroy(b1 b1Var) {
        Iterator it = j9.s.getSnapshot(this.f16641b).iterator();
        while (it.hasNext()) {
            ((o) it.next()).onDestroy();
        }
        b1Var.getLifecycle().removeObserver(this);
    }

    @v1(i0.ON_START)
    public void onStart(b1 b1Var) {
        Iterator it = j9.s.getSnapshot(this.f16641b).iterator();
        while (it.hasNext()) {
            ((o) it.next()).onStart();
        }
    }

    @v1(i0.ON_STOP)
    public void onStop(b1 b1Var) {
        Iterator it = j9.s.getSnapshot(this.f16641b).iterator();
        while (it.hasNext()) {
            ((o) it.next()).onStop();
        }
    }

    @Override // com.bumptech.glide.manager.m
    public void removeListener(o oVar) {
        this.f16641b.remove(oVar);
    }
}

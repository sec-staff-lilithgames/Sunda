package com.google.android.material.bottomsheet;

import android.view.View;
import x3.e3;
import x3.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b implements q0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f29020b;

    public b(e eVar) {
        this.f29020b = eVar;
    }

    @Override // x3.q0
    public e3 onApplyWindowInsets(View view, e3 e3Var) {
        e eVar = this.f29020b;
        d dVar = eVar.f29034p;
        if (dVar != null) {
            eVar.f29026h.removeBottomSheetCallback(dVar);
        }
        if (e3Var != null) {
            d dVar2 = new d(eVar.f29029k, e3Var);
            eVar.f29034p = dVar2;
            dVar2.c(eVar.getWindow());
            eVar.f29026h.addBottomSheetCallback(eVar.f29034p);
        }
        return e3Var;
    }
}

package com.google.android.material.datepicker;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class x extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f29235a;

    public x(y yVar) {
        this.f29235a = yVar;
    }

    @Override // com.google.android.material.datepicker.e0
    public void onIncompleteSelectionChanged() {
        Iterator it = this.f29235a.f29174b.iterator();
        while (it.hasNext()) {
            ((e0) it.next()).onIncompleteSelectionChanged();
        }
    }

    @Override // com.google.android.material.datepicker.e0
    public void onSelectionChanged(Object obj) {
        Iterator it = this.f29235a.f29174b.iterator();
        while (it.hasNext()) {
            ((e0) it.next()).onSelectionChanged(obj);
        }
    }
}

package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class h0 extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.l lVar, int i10) {
        g0 g0Var = new g0(recyclerView.getContext());
        g0Var.setTargetPosition(i10);
        startSmoothScroll(g0Var);
    }
}

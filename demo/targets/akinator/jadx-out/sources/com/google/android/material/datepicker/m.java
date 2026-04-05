package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m extends RecyclerView.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f29185a;

    public m(s sVar) {
        this.f29185a = sVar;
        j0.c(null);
        j0.c(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.l lVar) {
        if ((recyclerView.getAdapter() instanceof l0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.f29185a.getClass();
            throw null;
        }
    }
}

package com.digidust.elokence.akinator.graphic;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.f
    public void onLayoutChildren(RecyclerView.j jVar, RecyclerView.l lVar) {
        try {
            super.onLayoutChildren(jVar, lVar);
        } catch (IndexOutOfBoundsException unused) {
            Timber.tag("WCLinearLayoutManager").e("meet a IOOBE in RecyclerView", new Object[0]);
        }
    }

    public WrapContentLinearLayoutManager(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}

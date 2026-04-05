package com.google.android.material.datepicker;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j extends h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f29180b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s sVar, Context context, int i10, int i11) {
        super(context, i10, false);
        this.f29180b = sVar;
        this.f29179a = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(RecyclerView.l lVar, int[] iArr) {
        int i10 = this.f29179a;
        s sVar = this.f29180b;
        if (i10 == 0) {
            iArr[0] = sVar.f29199k.getWidth();
            iArr[1] = sVar.f29199k.getWidth();
        } else {
            iArr[0] = sVar.f29199k.getHeight();
            iArr[1] = sVar.f29199k.getHeight();
        }
    }
}

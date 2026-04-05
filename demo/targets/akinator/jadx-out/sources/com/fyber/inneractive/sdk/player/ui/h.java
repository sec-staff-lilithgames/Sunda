package com.fyber.inneractive.sdk.player.ui;

import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.h1;
import com.fyber.inneractive.sdk.util.m1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements a {
    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i10, int i11, boolean z10, h1 h1Var, int i12, int i13, int i14, int i15) {
        if (h1Var == null) {
            return null;
        }
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int iMin = Math.min(i12, i14) - com.fyber.inneractive.sdk.util.o.b(i15 * 2);
            h1Var.f26780a = iMin;
            h1Var.f26781b = iMin;
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.LANDSCAPE) {
            int iMin2 = Math.min(i12, i14) - com.fyber.inneractive.sdk.util.o.b(i15 * 2);
            h1Var.f26780a = iMin2;
            h1Var.f26781b = (iMin2 * 9) / 16;
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.MRECT) {
            h1Var.f26780a = com.fyber.inneractive.sdk.util.o.b(300);
            h1Var.f26781b = com.fyber.inneractive.sdk.util.o.b(250);
            return h1Var;
        }
        if (unitDisplayType == UnitDisplayType.DEFAULT && z10) {
            m1.a(unitDisplayType, h1Var, i10, i11, i12, i13);
            return h1Var;
        }
        h1Var.f26780a = 0;
        h1Var.f26781b = 0;
        return h1Var;
    }

    @Override // com.fyber.inneractive.sdk.player.ui.a
    public final h1 a(UnitDisplayType unitDisplayType, int i10, int i11, h1 h1Var, int i12, ViewGroup viewGroup) {
        h1 h1Var2 = new h1(0, 0);
        if (unitDisplayType == UnitDisplayType.SQUARE) {
            int i13 = h1Var.f26780a;
            m1.a(unitDisplayType, h1Var2, i10, i11, i13, i13);
            return h1Var2;
        }
        m1.a(unitDisplayType, h1Var2, i10, i11, h1Var.f26780a, h1Var.f26781b);
        return h1Var2;
    }
}

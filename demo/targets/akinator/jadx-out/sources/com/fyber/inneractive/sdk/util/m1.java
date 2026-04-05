package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m1 {
    public static void a(UnitDisplayType unitDisplayType, h1 h1Var, int i10, int i11, int i12, int i13) {
        if (i10 > 0 && i11 > 0) {
            float f10 = i10;
            float f11 = i11;
            float f12 = f10 / f11;
            if (unitDisplayType == UnitDisplayType.SQUARE) {
                i12 = (int) (i13 * f12);
            } else {
                if (Math.abs(f12 - 1.7777778f) >= 0.1f) {
                    Math.abs(f12 - 1.3333334f);
                }
                float fMin = Math.min(i12 / f10, 10.0f);
                float f13 = i13;
                float f14 = fMin * f11;
                if (f13 > f14) {
                    i12 = (int) (fMin * f10);
                    i13 = (int) f14;
                } else {
                    float fMin2 = Math.min(f13 / f11, 10.0f);
                    i12 = (int) (f10 * fMin2);
                    i13 = (int) (fMin2 * f11);
                }
            }
        }
        h1Var.f26780a = i12;
        h1Var.f26781b = i13;
    }
}

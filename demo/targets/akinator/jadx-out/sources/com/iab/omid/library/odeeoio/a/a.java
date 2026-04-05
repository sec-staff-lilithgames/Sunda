package com.iab.omid.library.odeeoio.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {
    public float a(int i10, int i11) {
        if (i11 <= 0 || i10 <= 0) {
            return 0.0f;
        }
        float f10 = i10 / i11;
        if (f10 > 1.0f) {
            return 1.0f;
        }
        return f10;
    }
}

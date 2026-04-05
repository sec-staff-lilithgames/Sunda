package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.df, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3184df implements Lb<Xe, C3468u> {
    @Override // com.ironsource.Lb
    public C3468u a(Xe input) {
        String strH;
        String strI;
        String strG;
        W7 w7E;
        String strC;
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        EnumC3202ef enumC3202efB = input.b();
        N nA = input.a();
        if (nA == null || (strH = nA.h()) == null) {
            strH = "0";
        }
        N nA2 = input.a();
        if (nA2 == null || (strI = nA2.i()) == null) {
            strI = "0";
        }
        N nA3 = input.a();
        if (nA3 == null || (strG = nA3.g()) == null) {
            strG = "0";
        }
        N nA4 = input.a();
        if (nA4 == null || (w7E = nA4.e()) == null) {
            w7E = W7.UnknownProvider;
        }
        N nA5 = input.a();
        return new C3468u(enumC3202efB, strH, strI, strG, w7E, (nA5 == null || (strC = nA5.c()) == null) ? "0" : strC);
    }
}

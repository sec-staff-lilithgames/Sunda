package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.dm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1964dm extends AbstractRunnableC1624Vt {
    public static String[] A05 = {"peP5GJDM9me8QDpiMTE0HYbhk5UQvsuj", "UmJsGkUZcFFvxG21gGzKuNxtLbnsNH0B", "InCZKAYVJ2xyVT3RLHGk", "cxu83bHx4KSubY78z6WW", "55WyHuuOCemh1dLUozRA9kNqY", "hUMsj3tCoCX6inz1bILbzXUTN", "Ib1pT8H4oQaxudtz", "STVRCs5pIYaR1pHj"};
    public final /* synthetic */ S7 A00;
    public final /* synthetic */ S8 A01;
    public final /* synthetic */ SF A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1964dm(SF sf2, ArrayList arrayList, S8 s82, S7 s72, ArrayList arrayList2) {
        this.A02 = sf2;
        this.A03 = arrayList;
        this.A01 = s82;
        this.A00 = s72;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        AtomicBoolean atomicBooleanA0D = SF.A0D(this.A03);
        if (this.A02.A04 instanceof C1937dL) {
            C1937dL c1937dL = (C1937dL) this.A02.A04;
            if (this.A01.A00 == -1) {
                boolean z10 = atomicBooleanA0D.get();
                String[] strArr = A05;
                if (strArr[6].length() == strArr[7].length()) {
                    String[] strArr2 = A05;
                    strArr2[3] = "VVOoEaVD2AhQqE2eihnl";
                    strArr2[2] = "7KTPepw5ZZxiUEMCto3C";
                    if (z10) {
                        c1937dL.A0F().A4h(XG.A01(this.A02.A00));
                    } else {
                        c1937dL.A0F().A4f(XG.A01(this.A02.A00));
                    }
                }
                throw new RuntimeException();
            }
            if (atomicBooleanA0D.get()) {
                LH lhA0F = c1937dL.A0F();
                long jA01 = XG.A01(this.A02.A00);
                S8 s82 = this.A01;
                String[] strArr3 = A05;
                if (strArr3[4].length() == strArr3[5].length()) {
                    String[] strArr4 = A05;
                    strArr4[4] = "xsAs6ZK2AKeTr6tr707KlGvOM";
                    strArr4[5] = "GxI5mwrGpMJ9ldsuxbhmmAcT7";
                    lhA0F.A4i(jA01, s82.A00);
                }
                throw new RuntimeException();
            }
            c1937dL.A0F().A4g(XG.A01(this.A02.A00), this.A01.A00);
        }
        this.A02.A02.post(new C1965dn(this, atomicBooleanA0D));
        SF.A0D(this.A04);
    }
}

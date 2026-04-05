package com.facebook.ads.redexgen.core;

import com.facebook.ads.NativeAd;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.fb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2075fb implements S7 {
    public static String[] A02 = {"XqTxzibSN1zAjaiM9LtVSqsxSG", "xqN5bEwB0Nihon7KSuA", "FVkOY26I4teb9ftOLmk9A45ZS3TS2DIY", "wzTDEcMKt7VvW9W8eKeIWksTnJ0tE", "iGRCr9OHUARnshCNCmKS3XNzEIA09VDm", "MJLgHxMJm3Fw", "S", "m77T1m6dtAhGTcgbhkAg"};
    public final List<C2233iN> A00;
    public final /* synthetic */ C2074fa A01;

    public C2075fb(C2074fa c2074fa, List<C2233iN> list) {
        this.A01 = c2074fa;
        this.A00 = list;
    }

    private void A00() {
        this.A01.A00.A05(true);
        this.A01.A00.A02();
        this.A01.A00.A03(0);
        Iterator<C2233iN> it = this.A00.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A02[4].charAt(3) == 'E') {
                throw new RuntimeException();
            }
            A02[0] = "GKxyFdZ7ADxfGJ";
            if (zHasNext) {
                C1480Qc c1480Qc = new C1480Qc(this.A01.A01, it.next(), null, C1480Qc.A0K(), this.A01.A00.A01());
                if (c1480Qc.A0z() != null && c1480Qc.A0z().A0F() != null) {
                    ((AbstractC2178hL) c1480Qc.A0z().A0F()).A00(c1480Qc);
                }
                this.A01.A00.A04(new NativeAd(this.A01.A01, c1480Qc));
            } else {
                AbstractC1615Vk.A00(new C2076fc(this));
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACh() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.S7
    public final void ACq() {
        A00();
    }
}

package com.facebook.ads.redexgen.core;

import android.view.ViewGroup;
import com.facebook.ads.redexgen.core.AbstractC1484Qg;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class QC<VH extends AbstractC1484Qg> {
    public static byte[] A02;
    public static String[] A03 = {"jUIKGw1ynNKnpAPmELSBfekQdKvvLP7N", "sNNGTv9KS6vRRQA34Mdww0wVckPktM11", "3xVPsODXVzGzX7adQrLtZXDPvj0RZqnv", "LC797JiAE7pTB", "T5D6LMII5PxeSeaFwmiiVgotr7WAYFJE", "TBv1Ih1UUm000Zp3KSd8PMLF2uMFBpSk", "SYlNiiXgaMsNCcAbu", "5Eyk2D6YZF50L"};
    public final QD A01 = new QD();
    public boolean A00 = false;

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 1);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A02 = new byte[]{-73, -69, -123, -88, -41, -54, -58, -39, -54, -69, -50, -54, -36, -122, -118, 84, -125, -94, 118, -99, -94, -104, -118, -99, -103, -85};
    }

    public abstract int A0B();

    public abstract VH A0F(ViewGroup viewGroup, int i10);

    public abstract void A0K(VH vh2, int i10);

    static {
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    private final void A0A(VH holder, int i10, List<Object> payloads) {
        A0K(holder, i10);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final int A0C(int i10) {
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final long A0D(int i10) {
        return -1L;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final VH A0E(ViewGroup viewGroup, int i10) {
        OQ.A01(A08(0, 13, 100));
        VH vh2 = (VH) A0F(viewGroup, i10);
        vh2.A00 = i10;
        OQ.A00();
        return vh2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final void A0G() {
        this.A01.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final void A0H(QE qe2) {
        this.A01.registerObserver(qe2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final void A0I(QE qe2) {
        this.A01.unregisterObserver(qe2);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final void A0J(VH vh2, int i10) {
        vh2.A03 = i10;
        if (A0M()) {
            long jA0D = A0D(i10);
            String[] strArr = A03;
            if (strArr[4].charAt(21) == strArr[2].charAt(21)) {
                throw new RuntimeException();
            }
            A03[0] = "nL6OAJIdW8sl7jDyOoO0QwKhwUxIf89k";
            vh2.A05 = jA0D;
        }
        vh2.A0a(1, 519);
        OQ.A01(A08(13, 13, 51));
        A0A(vh2, i10, vh2.A0R());
        vh2.A0T();
        ViewGroup.LayoutParams layoutParams = vh2.A0H.getLayoutParams();
        if (layoutParams instanceof QP) {
            ((QP) layoutParams).A01 = true;
        }
        OQ.A00();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public void A0L(C09846g c09846g) {
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final boolean A0M() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.QC != com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$Adapter<VH extends com.facebook.ads.redexgen.X.Qg> */
    public final boolean A0N(VH holder) {
        return false;
    }
}

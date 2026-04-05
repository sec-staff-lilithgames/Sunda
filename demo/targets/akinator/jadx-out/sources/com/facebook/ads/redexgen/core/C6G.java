package com.facebook.ads.redexgen.core;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.6G, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6G extends C2116gH {
    public static String[] A01 = {"5vbH5h", "J", "C4GDfN5QjjsYSTm6MxZFmUsCMcA9wBBJ", "6VFwzkwOMMM2Di2Z85K5QmwqwgWhrd8W", "uhhUuQP5WsjWPtKrx", "v18Pv4VwePGedZr395LFzqQB6yfdWBSj", "eHjrumjSh1wPfIUStRl2rH8Zl9vSSm7d", "psLA63BrOeuZ89bQmrhMweOfIVNK7DGd"};
    public final /* synthetic */ C6F A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.C2116gH
    public final int A0O(View view, int i10) {
        QO qoA08 = A08();
        if (!qoA08.A22()) {
            return 0;
        }
        QP qp2 = (QP) view.getLayoutParams();
        int iA0N = A0N(qoA08.A0m(view) - qp2.leftMargin, qoA08.A0p(view) + qp2.rightMargin, qoA08.A0g(), qoA08.A0j() - qoA08.A0h(), i10) + this.A00.A02;
        if (A01[0].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "LE8phwfR0RxAHMOOl0X9IEx3wOgwcDNd";
        strArr[7] = "Bj9ROfqsKQjGAcpCTsOWpU0U4DTJlpud";
        return iA0N;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6G(C6F c6f, C1937dL c1937dL) {
        super(c1937dL);
        this.A00 = c6f;
    }

    @Override // com.facebook.ads.redexgen.core.C2116gH
    public final float A0J(DisplayMetrics displayMetrics) {
        return this.A00.A00 / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.core.C2116gH
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.core.C2116gH
    public final PointF A0P(int i10) {
        return this.A00.A4y(i10);
    }
}

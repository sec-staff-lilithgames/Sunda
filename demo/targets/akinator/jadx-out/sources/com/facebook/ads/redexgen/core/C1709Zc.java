package com.facebook.ads.redexgen.core;

import android.widget.RelativeLayout;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Zc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1709Zc extends RelativeLayout {
    public static InterfaceC1668Xn A05;
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public AbstractC2098fy A00;
    public C1937dL A01;
    public C0K A02;
    public LE A03;
    public C1750aJ A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 60);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{2, 32, 51, 46, 52, 50, 36, 45, 97, 15, 32, 53, 40, 55, 36, 97, 55, 40, 36, 54, 97, 32, 37, 36, 49, 53, 36, 51, 97, 40, 50, 47, 102, 53, 97, 34, 51, 36, 32, 53, 36, 37, 97, 49, 51, 46, 49, 36, 51, 45, 56, 67, 65, 74, 65, 86, 77, 71};
    }

    static {
        A02();
        A08 = (int) (AbstractC1640Wl.A02 * 8.0f);
        A07 = A08 * 10;
        A09 = (int) (AbstractC1640Wl.A02 * 15.0f);
        A05 = new LD();
    }

    public C1709Zc(C1937dL c1937dL) throws IllegalStateException {
        super(c1937dL);
        this.A01 = c1937dL;
        this.A02 = new C0K(c1937dL);
        XP.A0I(this.A02);
        this.A00 = new C09856h();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    private ArrayList<C1904cn> A01(AbstractC2212hy abstractC2212hy) {
        if (abstractC2212hy == null) {
            return new ArrayList<>();
        }
        List<C1391Mp> listA27 = abstractC2212hy.A27();
        ArrayList<C1904cn> arrayList = new ArrayList<>(listA27.size());
        for (int i10 = 0; i10 < listA27.size(); i10++) {
            arrayList.add(new C1904cn(i10, listA27.size(), listA27.get(i10)));
        }
        return arrayList;
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C1480Qc c1480Qc, int i10) {
        ArrayList<C1904cn> arrayListA01 = A01(c1480Qc.A10());
        this.A02.setCardsInfo(arrayListA01);
        this.A03 = new LE(this.A01, arrayListA01, c1480Qc.A10(), this.A01.A02().A0A(), c1480Qc, A05, c1480Qc.A10().A25(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        if (i10 == 0) {
            i10 = AbstractC1640Wl.A04.widthPixels;
        }
        this.A03.A0O(i10 - A07, 16, 0);
        this.A03.A0G();
        setupDotsLayout(c1480Qc, arrayListA01);
    }

    public final void A06(C2010eX c2010eX) {
        if (this.A03 != null) {
            this.A03.A0P(c2010eX);
        } else {
            this.A01.A08().AAy(A00(51, 7, 24), AbstractC1550Sv.A1v, new C1551Sw(A00(0, 51, Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE)));
        }
        this.A02.A20(c2010eX);
    }

    public static InterfaceC1668Xn getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10 && this.A03 != null) {
            this.A03.A0O((i12 - i10) - A07, 16, 0);
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i10) {
        if (this.A04 != null) {
            this.A04.A00(i10);
        }
    }

    private void setupDotsLayout(C1480Qc c1480Qc, ArrayList<C1904cn> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Y(new L5(this));
        this.A04 = new C1750aJ(this.A01, c1480Qc.A10().A1z().A01(), arrayList.size());
        XP.A0I(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A09, 0, 0);
        addView(this.A04, layoutParams);
    }
}

package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public final class FD extends AbstractC1484Qg implements InterfaceC1675Xu {
    public static String[] A08 = {"biNTtjxa0xULALtZEUOcP", "rMVpYr4hwZgX", "y0rebd1hOaNR", "snwXdVXwO66aPvNuuMD2", "jxkMgVVp1g5", "Dcah1JX", "lglxOXHbCZFpcLf1TWQPAMUDis4zLCZx", "n80A5ryznQOlcAJIvKv7FeLq2ck19EHB"};
    public N3 A00;
    public AbstractC2009eW A01;
    public C2010eX A02;
    public C2010eX A03;
    public final int A04;
    public final SparseBooleanArray A05;
    public final C1937dL A06;
    public final C09595h A07;

    public FD(C09595h c09595h, SparseBooleanArray sparseBooleanArray, C2010eX c2010eX, int i10, C1937dL c1937dL, N3 n32) {
        super(c09595h);
        this.A06 = c1937dL;
        this.A07 = c09595h;
        this.A05 = sparseBooleanArray;
        this.A02 = c2010eX;
        this.A04 = i10;
        this.A00 = n32;
    }

    private void A05(US us, XH xh2, String str, C1904cn c1904cn) {
        if (this.A05.get(c1904cn.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            String[] strArr = A08;
            if (strArr[1].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[3] = "sEemyGdXpNnP2WRBMWcD";
            strArr2[0] = "kawPFcVLuq3VyedHvbBIc";
            this.A03 = null;
        }
        this.A01 = new FF(this, str, c1904cn, us, c1904cn.A04(), xh2);
        this.A03 = new C2010eX(this.A07, 10, new WeakReference(this.A01), this.A06);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A07.setOnAssetsLoadedListener(new FE(this, c1904cn));
    }

    public final void A0p(C1904cn c1904cn, US us, SF sf2, XH xh2, String str, int i10, int i11, int i12) {
        int iA02 = c1904cn.A02();
        this.A07.setTag(-1593835536, Integer.valueOf(iA02));
        this.A07.setupNativeCtaExtension(c1904cn);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i10, -2);
        int rightMargin = iA02 == 0 ? i12 : i11;
        if (iA02 < this.A04 - 1) {
            i12 = i11;
        }
        String[] strArr = A08;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[1] = "ng4t5bAKqCWK";
        strArr2[2] = "n9xBZs9SEWUc";
        marginLayoutParams.setMargins(rightMargin, 0, i12, 0);
        String strA08 = c1904cn.A03().A0H().A08();
        String strA09 = c1904cn.A03().A0H().A09();
        this.A07.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A07.A1T()) {
            this.A07.setVideoPlaceholderUrl(strA08);
            this.A07.setVideoUrl(sf2.A0T(strA09));
        } else {
            this.A07.setImageUrl(strA08);
        }
        this.A07.setLayoutParams(marginLayoutParams);
        this.A07.setCTAInfo(c1904cn.A03().A0J(), c1904cn.A04());
        this.A07.A1U(c1904cn.A04());
        A05(us, xh2, str, c1904cn);
    }

    public final void A0q(C2010eX c2010eX) {
        this.A02 = c2010eX;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1675Xu
    public final void AIV() {
        this.A07.A1O();
    }
}

package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ev, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1191Ev extends AbstractC1484Qg implements InterfaceC1675Xu {
    public N3 A00;
    public AbstractC2009eW A01;
    public C2010eX A02;
    public C2010eX A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final SparseBooleanArray A08;
    public final C1937dL A09;
    public final C5Q A0A;

    public C1191Ev(C5Q c5q, SparseBooleanArray sparseBooleanArray, C2010eX c2010eX, int i10, int i11, int i12, int i13, C1937dL c1937dL, N3 n32) {
        super(c5q);
        this.A09 = c1937dL;
        this.A0A = c5q;
        this.A08 = sparseBooleanArray;
        this.A02 = c2010eX;
        this.A04 = i10;
        this.A05 = i11;
        this.A06 = i12;
        this.A07 = i13;
        this.A00 = n32;
    }

    private void A05(US us, XH xh2, String str, C1904cn c1904cn) {
        if (this.A08.get(c1904cn.A02())) {
            return;
        }
        if (this.A03 != null) {
            this.A03.A0V();
            this.A03 = null;
        }
        this.A01 = new C1193Ex(this, str, c1904cn, us, c1904cn.A04(), xh2);
        this.A03 = new C2010eX(this.A0A, 10, new WeakReference(this.A01), this.A09);
        this.A03.A0Y(false);
        this.A03.A0W(100);
        this.A03.A0X(100);
        this.A0A.setOnAssetsLoadedListener(new C1192Ew(this, c1904cn));
    }

    public final KE A0p() {
        return this.A0A.getCtaButton();
    }

    public final void A0q(C1904cn c1904cn, US us, SF sf2, XH xh2, String str) {
        int iA02 = c1904cn.A02();
        this.A0A.setTag(-1593835536, Integer.valueOf(iA02));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04, -2);
        int rightMargin = iA02 == 0 ? this.A05 : this.A06;
        int position = this.A07;
        marginLayoutParams.setMargins(rightMargin, 0, iA02 >= position + (-1) ? this.A05 : this.A06, 0);
        String imageUrl = c1904cn.A03().A0H().A08();
        String strA09 = c1904cn.A03().A0H().A09();
        this.A0A.setIsVideo(!TextUtils.isEmpty(strA09));
        if (this.A0A.A1T()) {
            this.A0A.setVideoPlaceholderUrl(imageUrl);
            this.A0A.setVideoUrl(sf2.A0T(strA09));
        } else {
            this.A0A.setImageUrl(imageUrl);
        }
        this.A0A.setLayoutParams(marginLayoutParams);
        this.A0A.setAdTitleAndDescription(c1904cn.A03().A0I().A0F(), c1904cn.A03().A0I().A04());
        this.A0A.setCTAInfo(c1904cn.A03().A0J(), c1904cn.A04());
        this.A0A.A1W(c1904cn.A04());
        A05(us, xh2, str, c1904cn);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1675Xu
    public final void AIV() {
        this.A0A.A1O();
    }
}

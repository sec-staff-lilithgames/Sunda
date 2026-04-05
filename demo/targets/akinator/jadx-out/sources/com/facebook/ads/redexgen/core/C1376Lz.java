package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Lz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1376Lz extends Y3 {
    public C09083i A00;
    public boolean A01;
    public boolean A02;
    public final ViewGroup A03;
    public final SF A04;
    public final US A05;
    public final E1 A06;
    public final DX A07;
    public final DV A08;
    public final D6 A09;
    public final D3 A0A;
    public final D1 A0B;
    public final AbstractC2009eW A0C;
    public final C2010eX A0D;

    public C1376Lz(C1937dL c1937dL, US us, SF sf2, C1580Ua c1580Ua, View.OnClickListener onClickListener) {
        super(c1937dL, onClickListener);
        this.A02 = false;
        this.A01 = false;
        this.A07 = new DX() { // from class: com.facebook.ads.redexgen.X.63
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C09033d c09033d) {
                if (!U7.A1S(((Y3) this.A00).A01)) {
                    return;
                }
                this.A00.A06.A0h(EnumC1953db.A02, 30);
            }
        };
        this.A08 = new AnonymousClass62(this);
        this.A05 = us;
        this.A04 = sf2;
        this.A0C = A00();
        this.A0D = A07();
        this.A03 = new FrameLayout(c1937dL);
        addView(this.A03, new RelativeLayout.LayoutParams(-1, -1));
        this.A06 = A01(c1580Ua);
        this.A0A = A04();
        this.A09 = A03();
        this.A0B = A06(c1580Ua);
        A0C();
    }

    private MA A00() {
        return new MA(this);
    }

    private E1 A01(C1580Ua c1580Ua) {
        E1 e12 = new E1(super.A01);
        XP.A0I(e12);
        e12.setFunnelLoggingHandler(c1580Ua);
        e12.getEventBus().A03(this.A07, this.A08);
        if (U7.A1U(super.A01)) {
            e12.setVolume(0.0f);
        }
        if (!U7.A1P(super.A01)) {
            e12.setOnClickListener(new Y5(this));
        }
        RelativeLayout.LayoutParams videoLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
        videoLayoutParams.addRule(13);
        addView(e12, videoLayoutParams);
        return e12;
    }

    private D6 A03() {
        D6 d62 = new D6(super.A01);
        d62.setTextColor(-1);
        XP.A0W(d62, false, 12);
        d62.setGravity(17);
        this.A06.A0i(d62);
        return d62;
    }

    private D3 A04() {
        D3 d32 = new D3(super.A01);
        this.A06.A0i(d32);
        return d32;
    }

    private D1 A06(C1580Ua c1580Ua) {
        D1 d12 = new D1(super.A01, c1580Ua, true);
        d12.setBackgroundPaintColor(855638016);
        this.A06.A0i(d12);
        return d12;
    }

    private C2010eX A07() {
        return new C2010eX(this, 50, true, new WeakReference(this.A0C), super.A01);
    }

    private void A08() {
        if (getVisibility() == 0 && this.A01 && hasWindowFocus()) {
            this.A0D.A0U();
        } else {
            this.A0D.A0V();
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y3
    public final void A0A() {
        this.A0D.A0V();
        this.A06.getEventBus().A04(this.A07, this.A08);
        this.A06.A0Z();
        XP.A0H(this.A06);
        if (this.A00 != null) {
            this.A00.A0p();
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y3
    public final void A0B() {
        this.A0B.A09();
        this.A02 = true;
        this.A0D.A0U();
    }

    @Override // com.facebook.ads.redexgen.core.Y3
    public final void A0C() {
        super.A0C();
        if (U7.A1V(super.A01)) {
            XP.A0H(this.A0A);
            this.A0A.setLayoutParams(A00(true, false));
            addView(this.A0A);
        }
        if (U7.A1R(super.A01)) {
            XP.A0H(this.A09);
            this.A09.setLayoutParams(A00(true, true));
            addView(this.A09);
        }
        if (U7.A1T(super.A01)) {
            XP.A0H(this.A0B);
            this.A0B.setLayoutParams(A00(false, false));
            addView(this.A0B);
        }
    }

    @Override // com.facebook.ads.redexgen.core.Y3
    public final boolean A0D() {
        return this.A06.A0o();
    }

    @Override // com.facebook.ads.redexgen.core.Y3
    public final boolean A0E() {
        if (getMeasuredWidth() <= 0 || this.A06.getMeasuredWidth() <= 0) {
            return true;
        }
        int measuredWidth = (int) ((getMeasuredWidth() - this.A06.getMeasuredWidth()) / 2.0d);
        int i10 = Y3.A05;
        int widthGap = Y3.A04;
        return measuredWidth > i10 + (widthGap * 2);
    }

    public final C1376Lz A0F(String str, String str2, String str3, String str4, String str5) {
        this.A06.setVideoURI(this.A04.A0T(str2));
        this.A00 = new C09083i(super.A01, this.A05, this.A06, str);
        if (str3 != null && !TextUtils.isEmpty(str3)) {
            new KZ(this.A03, super.A01).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new M0(this)).A07(str3);
        }
        if (str5 != null) {
            this.A0A.setPlayAccessibilityLabel(str4);
        }
        if (str5 != null) {
            this.A0A.setPauseAccessibilityLabel(str5);
        }
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.Y3
    public int getMediaViewId() {
        return this.A06.getId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A01 = true;
        A08();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A01 = false;
        A08();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        A08();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        A08();
    }
}

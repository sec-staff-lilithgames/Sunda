package com.facebook.ads.redexgen.core;

import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.5q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C09685q extends KL {
    public static String[] A01 = {"jx4KYlgMCzDl9ClzKv", "6Ix4GmMTfvyGvtJf24kawibkIRWRaxha", "zW69YqA5HPweJk44OR41r89kehyD8PUK", "YWeaBtgKCGSZjZhmH64nz1hbm3NBx6WA", "r8zWPPccQcaX84RMJyONYLJrFGke7QKT", "leMtqeNEOkXnn1xJcE4uVuewwh76dLco", "HficAYafh9u7bjEKghLSIT4OmCXpUy86", "1EAnVhI1sEBIq9Q3DhiB3BUE0Cu5Wqiv"};
    public final Runnable A00;

    public C09685q(C1937dL c1937dL, KE ke2, int i10, boolean z10, C1400My c1400My, String str, US us, InterfaceC1668Xn interfaceC1668Xn, C2010eX c2010eX, XH xh2, AbstractC2212hy abstractC2212hy, C1140Cw c1140Cw, C1580Ua c1580Ua, boolean z11) {
        super(c1937dL, ke2, i10, z10, c1400My, false, str, us, interfaceC1668Xn, c2010eX, xh2, abstractC2212hy, c1140Cw, c1580Ua, z11);
        this.A00 = new RunnableC1735a2(this);
        int i11 = getResources().getConfiguration().orientation;
        A07(i11);
        A0D(i11);
        A03();
        A08(i11);
        A0C(i11);
        A0E(i11);
        A0B(i11);
        A02();
        A01();
        A04();
        A0F(((KL) this).A04);
        A09(i11);
        A0A(i11);
        A05(i11);
        this.A0O.addView(this.A0M);
        addView(this.A0O);
    }

    private void A00() {
        A0r(this.A0M, -1291845632, new float[]{72.0f, 72.0f, 72.0f, 72.0f, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    private void A01() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, KL.A0b);
        layoutParams.addRule(3, this.A0I.getId());
        if (this.A0I.getVisibility() == 0) {
            layoutParams.setMargins(0, KL.A0u, 0, 0);
        } else {
            layoutParams.setMargins(0, KL.A0l, 0, 0);
        }
        layoutParams.addRule(14);
        ((AbstractC1728Zv) this).A08.setLayoutParams(layoutParams);
        A0k();
    }

    private void A02() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0I.getLayoutParams();
        layoutParams.addRule(3, this.A0P.getId());
        if (this.A0I.getVisibility() == 0) {
            layoutParams.setMargins(0, KL.A0l, 0, 0);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        this.A0I.setLayoutParams(layoutParams);
    }

    private void A03() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.width = (int) (getResources().getDisplayMetrics().widthPixels * 0.37f);
        layoutParams.addRule(13);
        this.A0N.setLayoutParams(layoutParams);
    }

    private void A04() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0U.getLayoutParams();
        layoutParams.setMargins(0, KL.A0l, 0, 0);
        layoutParams.addRule(3, ((AbstractC1728Zv) this).A08.getId());
        this.A0U.setLayoutParams(layoutParams);
    }

    private void A05(int i10) {
        if (i10 == 1) {
            this.A0M.addView(((AbstractC1728Zv) this).A09);
            this.A0M.addView(this.A0Q);
            this.A0M.addView(this.A0P);
            this.A0M.addView(this.A0I);
            this.A0M.addView(((AbstractC1728Zv) this).A08);
            this.A0M.addView(this.A0U);
            A0u(this.A0M);
            this.A0M.addView(this.A0K);
            this.A0M.addView(this.A0J);
            if (this.A0Y && this.A0W.get()) {
                A0n();
                return;
            }
            return;
        }
        this.A0N.addView(((AbstractC1728Zv) this).A09);
        this.A0N.addView(this.A0Q);
        this.A0N.addView(this.A0P);
        this.A0N.addView(((AbstractC1728Zv) this).A08);
        this.A0N.addView(this.A0U);
        A0u(this.A0N);
        this.A0N.addView(this.A0I);
        this.A0O.addView(this.A0J);
        this.A0O.addView(this.A0N);
        this.A0O.addView(this.A0K);
        if (!this.A0Y) {
            return;
        }
        A0n();
    }

    private void A06(int i10) {
        if (i10 == 2) {
            this.A0F.removeCallbacks(this.A00);
            this.A0M.setLayoutTransition(null);
        }
    }

    private void A07(int i10) {
        if (i10 == 1) {
            ((KL) this).A05 = new CU(this.A0M, 400, 100, 0);
            this.A0W.set(false);
        }
    }

    private void A08(int i10) {
        RelativeLayout.LayoutParams layoutParams;
        if (i10 == 1) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            this.A0M.setGravity(80);
            layoutParams.setMargins(KL.A0l, 0, KL.A0l, 0);
            this.A0M.setPadding(KL.A0n, 0, KL.A0n, 0);
            A00();
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            this.A0M.setGravity(1);
            A0r(this.A0M, 0, null);
        }
        this.A0M.setLayoutParams(layoutParams);
    }

    private void A09(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0K.getLayoutParams();
        if (i10 == 1) {
            layoutParams.removeRule(12);
            layoutParams.removeRule(11);
            layoutParams.setMargins(0, KL.A0m, 0, 0);
            layoutParams.addRule(11);
            layoutParams.addRule(3, this.A0U.getId());
        } else {
            layoutParams.setMargins(0, 0, KL.A0r, 0);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        }
        this.A0K.setLayoutParams(layoutParams);
        this.A0K.setPadding(KL.A0u, KL.A0u, 0, 0);
    }

    private void A0A(int i10) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (i10 == 1) {
            layoutParams.removeRule(12);
            layoutParams.addRule(11);
            layoutParams.addRule(3, this.A0U.getId());
            layoutParams.setMargins(0, KL.A0o, 0, KL.A0l);
            this.A0J.setPadding(0, 0, 0, 0);
        } else {
            layoutParams.removeRule(3);
            layoutParams.setMargins(0, 0, KL.A0l, 0);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            this.A0J.setPadding(0, 0, 0, KL.A0l);
        }
        this.A0J.setLayoutParams(layoutParams);
    }

    private void A0B(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0P.getLayoutParams();
        layoutParams.addRule(14);
        layoutParams.addRule(3, this.A0Q.getId());
        layoutParams.setMargins(KL.A0u, KL.A0u, KL.A0u, 0);
        this.A0P.setTextSize(18.0f);
        this.A0P.setLayoutParams(layoutParams);
        if (i10 == 1) {
            boolean z10 = this.A0W.get();
            if (A01[6].charAt(17) == 'p') {
                throw new RuntimeException();
            }
            A01[2] = "LwMNVJXewPVvHtT8EyPDkqGjMUrnRCOE";
            if (z10) {
                this.A0P.setVisibility(8);
                this.A0P.setMaxLines(2);
                return;
            }
            return;
        }
        this.A0P.setVisibility(0);
        this.A0P.setMaxLines(2);
    }

    private void A0C(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((AbstractC1728Zv) this).A09.getLayoutParams();
        if (i10 == 1) {
            if (this.A0W.get()) {
                ((AbstractC1728Zv) this).A09.setVisibility(8);
            }
            layoutParams.width = KL.A0g;
            layoutParams.height = KL.A0g;
            layoutParams.setMargins(0, (-KL.A0g) / 2, 0, 0);
        } else {
            layoutParams.removeRule(3);
            layoutParams.removeRule(14);
            layoutParams.width = KL.A0h;
            layoutParams.height = KL.A0h;
            layoutParams.setMargins(0, KL.A0l, 0, 0);
            ((AbstractC1728Zv) this).A09.setVisibility(0);
        }
        layoutParams.addRule(14);
        ((AbstractC1728Zv) this).A09.setLayoutParams(layoutParams);
    }

    private void A0D(int i10) {
        if (i10 == 1) {
            this.A0O.setClipChildren(false);
            this.A0O.setClipToPadding(false);
            String[] strArr = A01;
            if (strArr[1].charAt(21) == strArr[3].charAt(21)) {
                throw new RuntimeException();
            }
            A01[5] = "cGbvdTJNONPNbXLhpEbXT6xJPDu44esN";
            this.A0O.setGravity(80);
            return;
        }
        this.A0O.setGravity(8388659);
    }

    private void A0E(int i10) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A0Q.getLayoutParams();
        layoutParams.addRule(14);
        layoutParams.addRule(3, ((AbstractC1728Zv) this).A09.getId());
        layoutParams.setMargins(0, KL.A0m, 0, 0);
        this.A0Q.setTypeface(Typeface.DEFAULT_BOLD);
        this.A0Q.setTextSize(30.0f);
        this.A0Q.setLayoutParams(layoutParams);
        if (i10 == 1) {
            AtomicBoolean atomicBoolean = this.A0W;
            String[] strArr = A01;
            if (strArr[7].charAt(14) == strArr[4].charAt(14)) {
                throw new RuntimeException();
            }
            A01[5] = "mUrLjLxX8ps9KyyklEjsMvbvvfmlYgc4";
            if (atomicBoolean.get()) {
                TextView textView = this.A0Q;
                if (A01[6].charAt(17) != 'p') {
                    A01[5] = "Ry88z4pj2pKB6I6ufE2OgGjTn2NC40NW";
                    textView.setVisibility(8);
                    return;
                } else {
                    A01[2] = "gqkT8dK3xSCWX8L5GFvNij0exRjeTiiQ";
                    textView.setVisibility(3);
                    return;
                }
            }
            return;
        }
        this.A0Q.setVisibility(0);
    }

    private void A0F(TextView textView) {
        if (textView != null) {
            int visibility = textView.getVisibility();
            if (A01[6].charAt(17) == 'p') {
                throw new RuntimeException();
            }
            A01[6] = "mNXbhcpsRbbwGhDffCZ213OdU3Broeit";
            if (visibility != 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.addRule(3, this.A0U.getId());
            layoutParams.setMargins(0, KL.A0u, 0, 0);
            textView.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.KL, com.facebook.ads.redexgen.core.AbstractC1728Zv
    public final void A0h(int i10) {
        super.A0h(i10);
        A06(i10);
        XP.A0Z(this.A0N, ((AbstractC1728Zv) this).A09, this.A0Q, ((AbstractC1728Zv) this).A08, this.A0U, ((KL) this).A04, this.A0P, this.A0K, this.A0J, this.A0I);
        A0D(i10);
        A08(i10);
        A03();
        A0C(i10);
        A0F(((KL) this).A04);
        A04();
        A02();
        A01();
        A0E(i10);
        A0B(i10);
        A09(i10);
        A0A(i10);
        A05(i10);
    }

    @Override // com.facebook.ads.redexgen.core.KL
    public final void A0q(int i10) {
        if (((KL) this).A05 == null || i10 == 2) {
            return;
        }
        ((KL) this).A05.A42(true, false);
        this.A0W.set(true);
        this.A0F.postDelayed(this.A00, 5000L);
    }

    @Override // com.facebook.ads.redexgen.core.KL
    public final void A0s(ViewGroup viewGroup, RelativeLayout relativeLayout, int i10) {
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1728Zv
    public void setInfo(C1398Mw c1398Mw, C1401Mz c1401Mz, String str, String str2, InterfaceC1650Wv interfaceC1650Wv, InterfaceC1737a4 interfaceC1737a4) {
        super.setInfo(c1398Mw, c1401Mz, str, str2, interfaceC1650Wv, interfaceC1737a4);
    }
}

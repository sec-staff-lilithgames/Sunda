package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;

/* renamed from: com.facebook.ads.redexgen.X.26, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass26 extends AbstractC1443Or<C2010eX> implements SM {
    public C1937dL A00;
    public boolean A01;

    public AnonymousClass26(C2010eX c2010eX, C1937dL c1937dL) {
        super(c2010eX);
        this.A00 = c1937dL;
        this.A01 = false;
    }

    private void A00(int i10) {
        if (!this.A01) {
            this.A00.A0F().A3n(i10);
        }
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1624Vt
    public final void A07() {
        C2010eX c2010eXA08 = A08();
        int iIntValue = 0;
        if (c2010eXA08 == null) {
            A00(0);
            return;
        }
        View view = c2010eXA08.A0C;
        AbstractC2009eW abstractC2009eW = (AbstractC2009eW) c2010eXA08.A0E.get();
        int i10 = 1;
        boolean z10 = view == null;
        if (!z10 && abstractC2009eW != null) {
            C2011eY c2011eYA0E = C2010eX.A0E(view, c2010eXA08.A0A, this.A00);
            if (c2011eYA0E.A04()) {
                C2010eX.A05(c2010eXA08);
            } else {
                c2010eXA08.A00 = 0;
            }
            boolean z11 = c2010eXA08.A00 > c2010eXA08.A09;
            boolean wasViewable = c2010eXA08.A05 != null && c2010eXA08.A05.A04();
            if (z11 || !c2011eYA0E.A04()) {
                c2010eXA08.A05 = c2011eYA0E;
            }
            String strValueOf = String.valueOf(c2011eYA0E.A01());
            synchronized (c2010eXA08) {
                if (c2010eXA08.A06.containsKey(strValueOf)) {
                    iIntValue = ((Integer) c2010eXA08.A06.get(strValueOf)).intValue();
                }
                c2010eXA08.A06.put(strValueOf, Integer.valueOf(iIntValue + 1));
            }
            if (z11 && !wasViewable) {
                this.A01 = true;
                c2010eXA08.A03 = System.currentTimeMillis();
                if (c2010eXA08.A07) {
                    this.A00.A0F().A3o();
                }
                abstractC2009eW.A03();
                if (BuildConfigApi.isDebug() && AdInternalSettings.isVisibleAnimation()) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(500L);
                    view.startAnimation(alphaAnimation);
                }
                if (!c2010eXA08.A0F) {
                    return;
                }
            } else if (!z11 && wasViewable) {
                this.A01 = true;
                if (c2010eXA08.A07) {
                    this.A00.A0F().A3K(c2011eYA0E.A02());
                }
                abstractC2009eW.A00();
            } else {
                abstractC2009eW.A02();
                if (!this.A01 && c2010eXA08.A07) {
                    this.A00.A0F().A3m(c2011eYA0E.A02());
                }
                this.A01 = true;
            }
            if (!c2010eXA08.A08 && c2010eXA08.A04 != null) {
                c2010eXA08.A0B.postDelayed(c2010eXA08.A04, c2010eXA08.A02);
                return;
            }
            return;
        }
        if (c2010eXA08.A07) {
            if (!z10) {
                i10 = 2;
            }
            A00(i10);
        }
    }

    @Override // com.facebook.ads.redexgen.core.SM
    public final C1937dL A6e() {
        return this.A00;
    }
}

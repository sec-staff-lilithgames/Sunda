package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.aI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1749aI extends FrameLayout {
    public static String[] A08 = {"Q8PK8a4jCXFMgXydViX", "2t", "0mtDJDWqZSrfiocTEOLDLA", "JwyFxt7bdt7eCUIm0ln", "fPboxvDBMmOISakSS", "MBnzPw5d2FxZEvBrnzM1TlMBrMh4WSuO", "jLpHRmCuYtO7UfmYbZzhe3ed5a74x24O", "3APcS373YHqcuLzV9G"};
    public AbstractC1667Xm A00;
    public YA A01;
    public final AbstractC2212hy A02;
    public final C1937dL A03;
    public final InterfaceC1668Xn A04;
    public final InterfaceC1748aH A05;
    public final E1 A06;
    public final List<View> A07;

    public C1749aI(C1775ai c1775ai, AbstractC2212hy abstractC2212hy, E1 e12, C1140Cw c1140Cw, AbstractC1728Zv abstractC1728Zv, InterfaceC1668Xn interfaceC1668Xn, InterfaceC1748aH interfaceC1748aH) {
        this(c1775ai, abstractC2212hy, e12, interfaceC1668Xn, interfaceC1748aH, c1140Cw, abstractC1728Zv);
    }

    public C1749aI(C1775ai c1775ai, AbstractC2212hy abstractC2212hy, E1 e12, InterfaceC1668Xn interfaceC1668Xn, InterfaceC1748aH interfaceC1748aH, View... viewArr) {
        this(c1775ai.A06(), c1775ai.A0C(), abstractC2212hy, e12, interfaceC1668Xn, interfaceC1748aH, viewArr);
    }

    public C1749aI(C1937dL c1937dL, AbstractC1667Xm abstractC1667Xm, AbstractC2212hy abstractC2212hy, E1 e12, InterfaceC1668Xn interfaceC1668Xn, InterfaceC1748aH interfaceC1748aH, View... viewArr) {
        super(c1937dL);
        this.A07 = new ArrayList();
        this.A03 = c1937dL;
        this.A00 = abstractC1667Xm;
        this.A02 = abstractC2212hy;
        for (View view : viewArr) {
            if (view != null) {
                this.A07.add(view);
            }
        }
        this.A04 = interfaceC1668Xn;
        this.A06 = e12;
        this.A05 = interfaceC1748aH;
        A04();
    }

    private void A04() {
        String strA06;
        RewardData rewardDataA0p = this.A02.A0p();
        if (rewardDataA0p == null) {
            strA06 = this.A02.A22().A05();
        } else {
            strA06 = this.A02.A22().A06(rewardDataA0p.getCurrency(), rewardDataA0p.getQuantity());
        }
        this.A01 = new YA(this.A03, -1, -16777216, strA06, null, this.A02.A22().A04(), this.A02.A22().A03(), XY.A01(XX.REWARD_ICON));
        this.A01.A02.setOnClickListener(new ViewOnClickListenerC1746aF(this));
        this.A01.A01.setOnClickListener(new ViewOnClickListenerC1747aG(this));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(this.A01, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A06 != null) {
            this.A06.A0g(EnumC1945dT.A07);
        }
        this.A05.ACI();
        if (!this.A02.A20().A0V()) {
            this.A02.A28(this.A04);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0024 A[EDGE_INSN: B:23:0x0024->B:8:0x0024 BREAK  A[LOOP:0: B:15:0x004d->B:20:0x0074], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07(android.view.ViewGroup r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.E1 r0 = r7.A06
            r3 = 4
            if (r0 == 0) goto L3e
            com.facebook.ads.redexgen.X.E1 r0 = r7.A06
            boolean r0 = r0.A0r()
            if (r0 != 0) goto L3e
            com.facebook.ads.redexgen.X.E1 r6 = r7.A06
            r5 = 11
            r4 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1749aI.A08
            r0 = 0
            r1 = r2[r0]
            r0 = 3
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L2a
        L24:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1749aI.A08
            java.lang.String r1 = "1Ran1dt8ESvXQPCOL"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "wn"
            r0 = 1
            r2[r0] = r1
            r6.A0m(r4, r4, r5)
            com.facebook.ads.redexgen.X.E1 r0 = r7.A06
            com.facebook.ads.redexgen.core.XP.A0L(r0, r3)
        L3e:
            com.facebook.ads.redexgen.X.Xm r0 = r7.A00
            if (r0 == 0) goto L47
            com.facebook.ads.redexgen.X.Xm r0 = r7.A00
            com.facebook.ads.redexgen.core.XP.A0F(r0)
        L47:
            java.util.List<android.view.View> r0 = r7.A07
            java.util.Iterator r5 = r0.iterator()
        L4d:
            boolean r4 = r5.hasNext()
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1749aI.A08
            r0 = 5
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 31
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L66
            goto L24
        L66:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1749aI.A08
            java.lang.String r1 = "6LHnkwVNW3v3BurcJpp"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "pBsoAnuzgJgS4JAM4BB"
            r0 = 3
            r2[r0] = r1
            if (r4 == 0) goto L81
            java.lang.Object r0 = r5.next()
            android.view.View r0 = (android.view.View) r0
            r0.clearAnimation()
            com.facebook.ads.redexgen.core.XP.A0L(r0, r3)
            goto L4d
        L81:
            r1 = -1
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r1, r1)
            r8.addView(r7, r0)
            com.facebook.ads.redexgen.X.aH r0 = r7.A05
            r0.AE8()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1749aI.A07(android.view.ViewGroup):void");
    }
}

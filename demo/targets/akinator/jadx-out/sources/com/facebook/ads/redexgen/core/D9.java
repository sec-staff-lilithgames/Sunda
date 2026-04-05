package com.facebook.ads.redexgen.core;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class D9 implements InterfaceC1954dc {
    public static String[] A0E = {"2ZSu0wXuDbQnaud22BC", "QCmSLF", "fQxhtf", "E3sU0uCnWEnB3ZcSzOkvj4xNFgaNSXPe", "Ye0yKWwaCEsRuR61siA7kBVWrkv2bkox", "1q930HE08Ni0sTckStF", "wfAs2pJjw0biCEJKLi3nGPcNksloIp8Y", "ZBBhRoR6L"};
    public E1 A01;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final DR A09 = new DR() { // from class: com.facebook.ads.redexgen.X.3P
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Y c3y) {
            this.A00.A07.removeCallbacksAndMessages(null);
            if (this.A00.A0G(EnumC1978e1.A04)) {
                this.A00.A03();
                this.A00.A06(true, false);
            }
            this.A00.A05 = true;
        }
    };
    public final DX A08 = new DX() { // from class: com.facebook.ads.redexgen.X.3L
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C09033d c09033d) {
            this.A00.A02 = true;
            if (this.A00.A03) {
                return;
            }
            this.A00.A03();
            this.A00.A06(false, false);
            this.A00.A05 = true;
        }
    };
    public final DP A0A = new C3K(this);
    public final DM A0B = new DM() { // from class: com.facebook.ads.redexgen.X.3J
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.core.AbstractC1560Tf
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(C3Q c3q) {
            if (this.A00.A04 || !this.A00.A0G(EnumC1978e1.A04)) {
                return;
            }
            this.A00.A03();
            this.A00.A06(true, false);
        }
    };
    public final DG A0C = new C3I(this);
    public final Handler A07 = new Handler();
    public final List<InterfaceC1979e2> A0D = new ArrayList();
    public int A00 = 2000;
    public boolean A02 = false;

    public D9(boolean z10, boolean z11) {
        this.A04 = z10;
        this.A03 = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        this.A07.removeCallbacksAndMessages(null);
        Iterator<InterfaceC1979e2> it = this.A0D.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            if (A0E[7].length() != 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Y40dGjVL9Zscw9FMyiKWKh6z3JvZ0T5u";
            strArr[4] = "hO4VpYUkDoigTR3nwiJ8PFOPPoG0N1QG";
            if (zHasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(boolean z10, boolean z11) {
        Iterator<InterfaceC1979e2> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().A42(z10, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0G(EnumC1978e1 enumC1978e1) {
        Iterator<InterfaceC1979e2> it = this.A0D.iterator();
        while (it.hasNext()) {
            if (it.next().A93() != enumC1978e1) {
                return false;
            }
        }
        return true;
    }

    public final void A0H() {
        this.A0D.clear();
    }

    public final void A0I() {
        if (this.A04) {
            this.A07.removeCallbacksAndMessages(null);
            this.A04 = false;
        }
    }

    public final void A0J() {
        this.A06 = true;
        this.A05 = true;
        A06(false, false);
    }

    public final void A0K(int i10) {
        this.A00 = i10;
    }

    public final void A0L(InterfaceC1979e2 interfaceC1979e2) {
        this.A0D.add(interfaceC1979e2);
    }

    public final boolean A0M() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1954dc
    public final void AAm(E1 e12) {
        this.A01 = e12;
        e12.getEventBus().A03(this.A09, this.A0C, this.A0A, this.A0B, this.A08);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1954dc
    public final void AJk(E1 e12) {
        A03();
        e12.getEventBus().A04(this.A08, this.A0C, this.A0A, this.A0B, this.A09);
        this.A01 = null;
    }
}

package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class LE extends QC<FD> {
    public int A00;
    public int A01;
    public int A02;
    public InterfaceC1668Xn A03;
    public C2010eX A04;
    public String A05;
    public List<C1904cn> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC2212hy A08;
    public final SF A09;
    public final C1937dL A0A;
    public final US A0B;
    public final C1480Qc A0C;
    public final XH A0D;
    public final C09705s A0E;
    public final C1140Cw A0F;

    public LE(C1937dL c1937dL, List<C1904cn> list, AbstractC2212hy abstractC2212hy, US us, C1480Qc c1480Qc, InterfaceC1668Xn interfaceC1668Xn, String str, C09705s c09705s, C1140Cw c1140Cw) {
        this.A0A = c1937dL;
        this.A0B = us;
        this.A0C = c1480Qc;
        this.A09 = c1480Qc.A11();
        this.A04 = c1480Qc.A1B();
        this.A0D = c1480Qc.A1A();
        this.A03 = interfaceC1668Xn;
        this.A08 = abstractC2212hy;
        this.A06 = list;
        this.A05 = str;
        this.A0E = c09705s;
        this.A0F = c1140Cw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final FD A0F(ViewGroup viewGroup, int i10) {
        return new FD(AbstractC1738a6.A00(new C1774ah(this.A0A, this.A0B, this.A03, this.A08, null, this.A04, this.A0D).A0T(this.A0F).A0O(this.A0C).A0W(), this.A0C, this.A05, this.A0E), this.A07, this.A04, this.A06.size(), this.A0A, this.A08.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(FD fd, int i10) {
        C1904cn c1904cn = this.A06.get(i10);
        fd.A0q(this.A04);
        fd.A0p(c1904cn, this.A0B, this.A09, this.A0D, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A06.size();
    }

    public final void A0O(int i10, int i11, int i12) {
        boolean needsUpdate = i10 != this.A00;
        this.A00 = i10;
        this.A02 = i11;
        this.A01 = i12;
        if (needsUpdate) {
            A0G();
        }
    }

    public final void A0P(C2010eX c2010eX) {
        this.A04 = c2010eX;
    }
}

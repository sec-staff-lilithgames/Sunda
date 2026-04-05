package com.facebook.ads.redexgen.core;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class F4 extends QC<C1191Ev> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1667Xm A04;
    public InterfaceC1668Xn A05;
    public String A06;
    public List<C1904cn> A07;
    public boolean A08;
    public final SparseBooleanArray A09 = new SparseBooleanArray();
    public final AbstractC2212hy A0A;
    public final SF A0B;
    public final C1937dL A0C;
    public final US A0D;
    public final XH A0E;
    public final FH A0F;
    public final C2010eX A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public F4(C1937dL c1937dL, List<C1904cn> list, AbstractC2212hy abstractC2212hy, US us, SF sf2, C2010eX c2010eX, XH xh2, InterfaceC1668Xn interfaceC1668Xn, String str, int i10, int i11, int i12, int i13, FH fh2, AbstractC1667Xm abstractC1667Xm) {
        this.A0C = c1937dL;
        this.A0D = us;
        this.A0B = sf2;
        this.A0G = c2010eX;
        this.A0E = xh2;
        this.A05 = interfaceC1668Xn;
        this.A0A = abstractC2212hy;
        this.A07 = list;
        this.A00 = i10;
        this.A03 = i13;
        this.A06 = str;
        this.A01 = i12;
        this.A02 = i11;
        this.A0F = fh2;
        this.A04 = abstractC1667Xm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1191Ev A0F(ViewGroup viewGroup, int i10) {
        return new C1191Ev(AbstractC1834bf.A00(new C1774ah(this.A0C, this.A0D, this.A05, this.A0A, null, this.A0G, this.A0E).A0R(this.A04).A0W(), this.A03, this.A06, this.A0F), this.A09, this.A0G, this.A00, this.A01, this.A02, this.A07.size(), this.A0C, this.A0A.A21());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.QC
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final void A0K(C1191Ev c1191Ev, int i10) {
        c1191Ev.A0q(this.A07.get(i10), this.A0D, this.A0B, this.A0E, this.A06);
        if (!this.A08 && i10 == 0) {
            c1191Ev.AIV();
            this.A08 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.core.QC
    public final int A0B() {
        return this.A07.size();
    }
}

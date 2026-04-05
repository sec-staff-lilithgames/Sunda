package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9Z, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C9Z implements InterfaceC2524nM, C7D {
    public int A00;
    public int A01;
    public long A02;
    public long A04;
    public C7G A05;
    public C10167m A06;
    public InterfaceC1135Cr A07;
    public boolean A08;
    public boolean A09;
    public C2614or[] A0A;
    public final int A0C;

    @MetaExoPlayerCustomization(type = {"NEW_CLASS_ARG"}, value = "D18870411: Adding start stall debug reason")
    public EnumC2190hX A0B = EnumC2190hX.A09;
    public final C6N A0D = new C6N();
    public long A03 = Long.MIN_VALUE;

    public abstract void A1Z();

    public abstract void A1a(long j10, boolean z10) throws C9Y;

    public abstract void A1c(C2614or[] c2614orArr, long j10, long j11) throws C9Y;

    public C9Z(int i10) {
        this.A0C = i10;
    }

    private final int A1O() {
        return this.A00;
    }

    private void A1P(long j10, boolean z10) throws C9Y {
        this.A08 = false;
        this.A02 = j10;
        this.A03 = j10;
        A1a(j10, z10);
    }

    public final int A1Q(long j10) {
        return ((InterfaceC1135Cr) C3M.A01(this.A07)).AJI(j10 - this.A04);
    }

    @MetaExoPlayerCustomization(type = {"FEATURE_LOGIC"}, value = "Keep track of the non-adjusted timestamp")
    public final int A1R(C6N c6n, C2536nY c2536nY, int i10) {
        int iAGf = ((InterfaceC1135Cr) C3M.A01(this.A07)).AGf(c6n, c2536nY, i10);
        if (iAGf == -4) {
            if (c2536nY.A05()) {
                this.A03 = Long.MIN_VALUE;
                return this.A08 ? -4 : -3;
            }
            c2536nY.A00 = c2536nY.A01;
            c2536nY.A01 += this.A04;
            this.A03 = Math.max(this.A03, c2536nY.A01);
        } else if (iAGf == -5) {
            C2614or c2614or = (C2614or) C3M.A01(c6n.A00);
            if (c2614or.A0M != Long.MAX_VALUE) {
                c6n.A00 = c2614or.A07().A0s(c2614or.A0M + this.A04).A14();
            }
        }
        return iAGf;
    }

    public final C9Y A1S(Throwable th2, C2614or c2614or, int i10) {
        return A1T(th2, c2614or, false, i10);
    }

    public final C9Y A1T(Throwable th2, C2614or c2614or, boolean z10, int i10) {
        int iA03 = 4;
        if (c2614or != null && !this.A09) {
            this.A09 = true;
            try {
                int formatSupport = AJb(c2614or);
                iA03 = AnonymousClass76.A03(formatSupport);
            } catch (C9Y unused) {
            } catch (Throwable th3) {
                this.A09 = false;
                throw th3;
            }
            this.A09 = false;
        }
        return C9Y.A04(th2, getName(), A1O(), c2614or, iA03, z10, i10);
    }

    public final C6N A1U() {
        this.A0D.A00();
        return this.A0D;
    }

    public final C7G A1V() {
        return (C7G) C3M.A01(this.A05);
    }

    public final C10167m A1W() {
        return (C10167m) C3M.A01(this.A06);
    }

    public void A1X() throws C9Y {
    }

    public void A1Y() {
    }

    public void A1b(boolean z10, boolean z11) throws C9Y {
    }

    public final boolean A1d() {
        return A9h() ? this.A08 : ((InterfaceC1135Cr) C3M.A01(this.A07)).AAV();
    }

    public final C2614or[] A1e() {
        return (C2614or[]) C3M.A01(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void A5p() {
        C3M.A08(this.A01 == 1);
        this.A0D.A00();
        this.A01 = 0;
        this.A07 = null;
        this.A0A = null;
        this.A08 = false;
        A1Z();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void A6D(C7G c7g, C2614or[] c2614orArr, InterfaceC1135Cr interfaceC1135Cr, long j10, boolean z10, boolean z11, long j11, long j12) throws C9Y {
        C3M.A08(this.A01 == 0);
        this.A05 = c7g;
        this.A01 = 1;
        A1b(z10, z11);
        AHq(c2614orArr, interfaceC1135Cr, j11, j12);
        A1P(j10, z10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final C7D A75() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public C6W A8L() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "D18870411: Adding start stall debug reason")
    public final EnumC2190hX A91() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final int A92() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final InterfaceC1135Cr A95() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM, com.facebook.ads.redexgen.core.C7D
    public final int A9F() {
        return this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass70
    public void A9a(int i10, Object obj) throws C9Y {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final boolean A9h() {
        return this.A03 == Long.MIN_VALUE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void AA1(int i10, C10167m c10167m) {
        this.A00 = i10;
        this.A06 = c10167m;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final boolean AAE() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void ABv() throws IOException {
        ((InterfaceC1135Cr) C3M.A01(this.A07)).ABs();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void AHq(C2614or[] c2614orArr, InterfaceC1135Cr interfaceC1135Cr, long j10, long j11) throws C9Y {
        C3M.A08(!this.A08);
        this.A07 = interfaceC1135Cr;
        if (this.A03 == Long.MIN_VALUE) {
            this.A03 = j10;
        }
        this.A0A = c2614orArr;
        this.A04 = j11;
        A1c(c2614orArr, j10, j11);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void AI2(long j10) throws C9Y {
        A1P(j10, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void AId() {
        this.A08 = true;
    }

    public int AJd() throws C9Y {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void start() throws C9Y {
        C3M.A08(this.A01 == 1);
        this.A01 = 2;
        A1X();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2524nM
    public final void stop() {
        C3M.A08(this.A01 == 2);
        this.A01 = 1;
        A1Y();
    }
}

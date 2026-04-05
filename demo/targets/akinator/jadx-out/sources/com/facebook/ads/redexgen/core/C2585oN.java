package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.oN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2585oN implements C1S {
    public int A00;
    public long A01;
    public long A02;
    public Object A03;
    public Object A04;
    public boolean A05;
    public C2622p0 A06 = C2622p0.A08;
    public static String[] A07 = {"4zGdQbqEEbqON0fsiZAaEQkKoAoKYmna", "yJpzHCnd9V3wUr5Wrx8duzmTaMKaViaS", "6le5bHbrSJ1W0fbLNXPlurR", "jvR1cNhZ0960aRA7pVRRRMqTg6KbIJja", "KqjZe5mn0dP", "Q", "Z7fKuPhHzVcFnrI", "fPry0FIfciS3iZV36uBdTRShtkwqjgIo"};
    public static final String A0D = AbstractC09264a.A0h(0);
    public static final String A0A = AbstractC09264a.A0h(1);
    public static final String A0C = AbstractC09264a.A0h(2);
    public static final String A0B = AbstractC09264a.A0h(3);
    public static final String A09 = AbstractC09264a.A0h(4);
    public static final C1R<C2585oN> A08 = new C1R() { // from class: com.facebook.ads.redexgen.X.oO
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2585oN.A01(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C2585oN A01(Bundle bundle) {
        int i10 = bundle.getInt(A0D, 0);
        long j10 = bundle.getLong(A0A, C.TIME_UNSET);
        long j11 = bundle.getLong(A0C, 0L);
        boolean z10 = bundle.getBoolean(A0B, false);
        Bundle bundle2 = bundle.getBundle(A09);
        C2622p0 c2622p0 = bundle2 != null ? (C2622p0) C2622p0.A09.A6X(bundle2) : C2622p0.A08;
        C2585oN c2585oN = new C2585oN();
        c2585oN.A0G(null, null, i10, j10, j11, c2622p0, z10);
        return c2585oN;
    }

    public final int A03() {
        return this.A06.A00;
    }

    public final int A04(int i10) {
        return this.A06.A07(i10).A00;
    }

    public final int A05(int i10) {
        return this.A06.A07(i10).A04();
    }

    public final int A06(int i10, int i11) {
        return this.A06.A07(i10).A05(i11);
    }

    public final int A07(long j10) {
        return this.A06.A05(j10, this.A01);
    }

    public final int A08(long j10) {
        return this.A06.A06(j10, this.A01);
    }

    public final long A09() {
        return this.A06.A02;
    }

    public final long A0A() {
        return this.A01;
    }

    public final long A0B() {
        return AbstractC09264a.A0P(this.A02);
    }

    public final long A0C() {
        return this.A02;
    }

    public final long A0D(int i10) {
        return this.A06.A07(i10).A03;
    }

    public final long A0E(int i10, int i11) {
        C2623p1 c2623p1A07 = this.A06.A07(i10);
        return c2623p1A07.A00 != -1 ? c2623p1A07.A06[i11] : C.TIME_UNSET;
    }

    public final C2585oN A0F(Object obj, Object obj2, int i10, long j10, long j11) {
        return A0G(obj, obj2, i10, j10, j11, C2622p0.A08, false);
    }

    public final C2585oN A0G(Object obj, Object obj2, int i10, long j10, long j11, C2622p0 c2622p0, boolean z10) {
        this.A03 = obj;
        this.A04 = obj2;
        this.A00 = i10;
        this.A01 = j10;
        this.A02 = j11;
        this.A06 = c2622p0;
        this.A05 = z10;
        return this;
    }

    public final boolean A0H(int i10) {
        return !this.A06.A07(i10).A07();
    }

    @MetaExoPlayerCustomization("Can be removed once MediaPeriodQueue is updated.")
    public final boolean A0I(int i10, int i11) {
        C2623p1 c2623p1 = this.A06.A05[i10];
        return (c2623p1.A00 == -1 || c2623p1.A05[i11] == 0) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        C2585oN c2585oN = (C2585oN) obj;
        if (AbstractC09264a.A1E(this.A03, c2585oN.A03) && AbstractC09264a.A1E(this.A04, c2585oN.A04) && this.A00 == c2585oN.A00 && this.A01 == c2585oN.A01 && this.A02 == c2585oN.A02 && this.A05 == c2585oN.A05 && AbstractC09264a.A1E(this.A06, c2585oN.A06)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        int iHashCode2 = ((7 * 31) + (this.A03 == null ? 0 : this.A03.hashCode())) * 31;
        if (this.A04 != null) {
            Object obj = this.A04;
            String[] strArr = A07;
            if (strArr[3].charAt(31) != strArr[0].charAt(31)) {
                throw new RuntimeException();
            }
            A07[6] = "a7xjZFv85Fgc1YV";
            iHashCode = obj.hashCode();
        }
        return ((((((((((iHashCode2 + iHashCode) * 31) + this.A00) * 31) + ((int) (this.A01 ^ (this.A01 >>> 32)))) * 31) + ((int) (this.A02 ^ (this.A02 >>> 32)))) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A06.hashCode();
    }
}

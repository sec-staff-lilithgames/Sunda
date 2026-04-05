package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.lf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2420lf implements EU, C5H {
    public int A00;
    public int A01;

    @MetaExoPlayerCustomization("Needed for Meta Custom getAvailableSamples")
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public boolean A0A;
    public final C3T A0B;
    public final ES A0C;
    public final C1190Eu A0D;

    @MetaExoPlayerCustomization("Upstream uses Map. Oculus doesn't play well with these collections")
    public final Map<Integer, Long> A0E;
    public final boolean A0F;
    public static final List<Long> A0L = MetaExoPlayerCustomizedCollections.A03(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final List<Long> A0G = MetaExoPlayerCustomizedCollections.A03(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final List<Long> A0H = MetaExoPlayerCustomizedCollections.A03(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final List<Long> A0I = MetaExoPlayerCustomizedCollections.A03(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final List<Long> A0J = MetaExoPlayerCustomizedCollections.A03(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final List<Long> A0K = MetaExoPlayerCustomizedCollections.A03(2800000L, 1800000L, 1400000L, 1100000L, 870000L);

    @Deprecated
    public C2420lf() {
        this(null, Collections.emptyMap(), 2000, C3T.A00, false);
    }

    public C2420lf(Context context, Map<Integer, Long> initialBitrateEstimates, int i10, C3T c3t, boolean z10) {
        this.A0E = MetaExoPlayerCustomizedCollections.A04(initialBitrateEstimates);
        this.A0C = new ES();
        this.A0D = new C1190Eu(i10);
        this.A0B = c3t;
        this.A0F = z10;
        if (context != null) {
            C4D c4dA03 = C4D.A03(context);
            this.A00 = c4dA03.A09();
            this.A04 = A00(this.A00);
            c4dA03.A0A(new C4B() { // from class: com.facebook.ads.redexgen.X.lg
                @Override // com.facebook.ads.redexgen.core.C4B
                public final void AEM(int i11) {
                    this.A00.A01(i11);
                }
            });
            return;
        }
        this.A00 = 0;
        this.A04 = A00(0);
    }

    private long A00(int i10) {
        Long initialBitrateEstimate = this.A0E.get(Integer.valueOf(i10));
        if (initialBitrateEstimate == null) {
            initialBitrateEstimate = this.A0E.get(0);
        }
        if (initialBitrateEstimate == null) {
            initialBitrateEstimate = 1000000L;
        }
        return initialBitrateEstimate.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A01(int i10) {
        int sampleElapsedTimeMs;
        if (this.A00 == 0 || this.A0F) {
            if (this.A0A) {
                i10 = this.A01;
            }
            if (this.A00 == i10) {
                return;
            }
            this.A00 = i10;
            if (i10 == 1 || i10 == 0 || i10 == 8) {
                return;
            }
            this.A04 = A00(i10);
            long jA6B = this.A0B.A6B();
            if (this.A03 > 0) {
                long nowMs = jA6B - this.A07;
                sampleElapsedTimeMs = (int) nowMs;
            } else {
                sampleElapsedTimeMs = 0;
            }
            A02(sampleElapsedTimeMs, this.A06, this.A04);
            this.A07 = jA6B;
            this.A06 = 0L;
            this.A08 = 0L;
            this.A09 = 0L;
            this.A0D.A06();
        }
    }

    private void A02(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.A05) {
            return;
        }
        this.A05 = j11;
        this.A0C.A00(i10, j10, j11);
    }

    public static boolean A04(AnonymousClass56 anonymousClass56, boolean z10) {
        return z10 && !anonymousClass56.A06(8);
    }

    @Override // com.facebook.ads.redexgen.core.C5H
    public final synchronized void ACg(InterfaceC2549nl interfaceC2549nl, AnonymousClass56 anonymousClass56, boolean z10, int i10) {
        if (A04(anonymousClass56, z10)) {
            this.A06 += i10;
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5H
    public final synchronized void AFW(InterfaceC2549nl interfaceC2549nl, AnonymousClass56 anonymousClass56, boolean z10) {
        if (A04(anonymousClass56, z10)) {
            C3M.A08(this.A03 > 0);
            long nowMs = this.A0B.A6B();
            int i10 = (int) (nowMs - this.A07);
            this.A09 += i10;
            this.A08 += this.A06;
            if (i10 > 0) {
                C1190Eu c1190Eu = this.A0D;
                int sampleElapsedTimeMs = (int) Math.sqrt(this.A06);
                c1190Eu.A07(sampleElapsedTimeMs, (this.A06 * 8000.0f) / i10);
                if (this.A09 >= 2000 || this.A08 >= 524288) {
                    this.A04 = (long) this.A0D.A05(0.5f);
                }
                int sampleElapsedTimeMs2 = this.A02;
                this.A02 = sampleElapsedTimeMs2 + 1;
                A02(i10, this.A06, this.A04);
                this.A07 = nowMs;
                this.A06 = 0L;
            }
            int sampleElapsedTimeMs3 = this.A03;
            this.A03 = sampleElapsedTimeMs3 - 1;
        }
    }

    @Override // com.facebook.ads.redexgen.core.C5H
    public final synchronized void AFX(@MetaExoPlayerCustomization InterfaceC2549nl interfaceC2549nl, AnonymousClass56 anonymousClass56, boolean z10, boolean z11) {
        if (A04(anonymousClass56, z10)) {
            if (this.A03 == 0) {
                this.A07 = this.A0B.A6B();
            }
            this.A03++;
        }
    }
}

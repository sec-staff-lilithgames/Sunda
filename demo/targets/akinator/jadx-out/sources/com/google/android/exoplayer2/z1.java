package com.google.android.exoplayer2;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final k3 f28815a = new k3();

    /* renamed from: b, reason: collision with root package name */
    public final l3 f28816b = new l3();

    /* renamed from: c, reason: collision with root package name */
    public final zd.a f28817c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.z f28818d;

    /* renamed from: e, reason: collision with root package name */
    public long f28819e;

    /* renamed from: f, reason: collision with root package name */
    public int f28820f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28821g;

    /* renamed from: h, reason: collision with root package name */
    public x1 f28822h;

    /* renamed from: i, reason: collision with root package name */
    public x1 f28823i;

    /* renamed from: j, reason: collision with root package name */
    public x1 f28824j;

    /* renamed from: k, reason: collision with root package name */
    public int f28825k;

    /* renamed from: l, reason: collision with root package name */
    public Object f28826l;

    /* renamed from: m, reason: collision with root package name */
    public long f28827m;

    public z1(zd.a aVar, com.google.android.exoplayer2.util.z zVar) {
        this.f28817c = aVar;
        this.f28818d = zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static bf.d0 i(com.google.android.exoplayer2.m3 r14, java.lang.Object r15, long r16, long r18, com.google.android.exoplayer2.l3 r20, com.google.android.exoplayer2.k3 r21) {
        /*
            r0 = r16
            r2 = r20
            r4 = r21
            r14.getPeriodByUid(r15, r4)
            int r5 = r4.f27598e
            r14.getWindow(r5, r2)
            int r5 = r14.getIndexOfPeriod(r15)
            r7 = r15
        L13:
            int r3 = r4.getAdGroupCount()
            r6 = -1
            if (r3 == 0) goto L6a
            r8 = 1
            r9 = 0
            if (r3 != r8) goto L24
            boolean r10 = r4.isLivePostrollPlaceholder(r9)
            if (r10 != 0) goto L6a
        L24:
            int r10 = r4.getRemovedAdGroupCount()
            boolean r10 = r4.isServerSideInsertedAdGroup(r10)
            if (r10 == 0) goto L6a
            r10 = 0
            int r12 = r4.getAdGroupIndexForPositionUs(r10)
            if (r12 == r6) goto L37
            goto L6a
        L37:
            long r12 = r4.f27599f
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 != 0) goto L3e
            goto L5a
        L3e:
            int r12 = r3 + (-1)
            boolean r12 = r4.isLivePostrollPlaceholder(r12)
            if (r12 == 0) goto L48
            r12 = 2
            goto L49
        L48:
            r12 = r8
        L49:
            int r3 = r3 - r12
        L4a:
            if (r9 > r3) goto L54
            long r12 = r4.getContentResumeOffsetUs(r9)
            long r10 = r10 + r12
            int r9 = r9 + 1
            goto L4a
        L54:
            long r12 = r4.f27599f
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 > 0) goto L6a
        L5a:
            int r3 = r2.f27662r
            if (r5 > r3) goto L6a
            r14.getPeriod(r5, r4, r8)
            java.lang.Object r3 = r4.f27597c
            java.lang.Object r7 = com.google.android.exoplayer2.util.a.checkNotNull(r3)
            int r5 = r5 + 1
            goto L13
        L6a:
            r14.getPeriodByUid(r7, r4)
            int r8 = r4.getAdGroupIndexForPositionUs(r0)
            if (r8 != r6) goto L7f
            int r14 = r4.getAdGroupIndexAfterPositionUs(r0)
            bf.d0 r0 = new bf.d0
            r10 = r18
            r0.<init>(r7, r10, r14)
            return r0
        L7f:
            r10 = r18
            int r9 = r4.getFirstAdIndexToPlay(r8)
            bf.d0 r6 = new bf.d0
            r6.<init>(r7, r8, r9, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.z1.i(com.google.android.exoplayer2.m3, java.lang.Object, long, long, com.google.android.exoplayer2.l3, com.google.android.exoplayer2.k3):bf.d0");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.y1 a(com.google.android.exoplayer2.m3 r21, com.google.android.exoplayer2.x1 r22, long r23) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.z1.a(com.google.android.exoplayer2.m3, com.google.android.exoplayer2.x1, long):com.google.android.exoplayer2.y1");
    }

    public x1 advancePlayingPeriod() {
        x1 x1Var = this.f28822h;
        if (x1Var == null) {
            return null;
        }
        if (x1Var == this.f28823i) {
            this.f28823i = x1Var.getNext();
        }
        this.f28822h.release();
        int i10 = this.f28825k - 1;
        this.f28825k = i10;
        if (i10 == 0) {
            this.f28824j = null;
            x1 x1Var2 = this.f28822h;
            this.f28826l = x1Var2.f28696b;
            this.f28827m = x1Var2.f28700f.f28764a.f9196d;
        }
        this.f28822h = this.f28822h.getNext();
        h();
        return this.f28822h;
    }

    public x1 advanceReadingPeriod() {
        x1 x1Var = this.f28823i;
        com.google.android.exoplayer2.util.a.checkState((x1Var == null || x1Var.getNext() == null) ? false : true);
        this.f28823i = this.f28823i.getNext();
        h();
        return this.f28823i;
    }

    public final y1 b(m3 m3Var, x1 x1Var, long j10) {
        k3 k3Var;
        y1 y1Var = x1Var.f28700f;
        long rendererOffset = (x1Var.getRendererOffset() + y1Var.f28768e) - j10;
        if (y1Var.f28770g) {
            return a(m3Var, x1Var, rendererOffset);
        }
        y1 y1Var2 = x1Var.f28700f;
        bf.d0 d0Var = y1Var2.f28764a;
        Object obj = d0Var.f9193a;
        int i10 = d0Var.f9197e;
        k3 k3Var2 = this.f28815a;
        m3Var.getPeriodByUid(obj, k3Var2);
        if (!d0Var.isAd()) {
            if (i10 != -1 && k3Var2.isLivePostrollPlaceholder(i10)) {
                return a(m3Var, x1Var, rendererOffset);
            }
            int firstAdIndexToPlay = k3Var2.getFirstAdIndexToPlay(i10);
            boolean z10 = k3Var2.isServerSideInsertedAdGroup(i10) && k3Var2.getAdState(i10, firstAdIndexToPlay) == 3;
            if (firstAdIndexToPlay != k3Var2.getAdCountInAdGroup(i10) && !z10) {
                return d(m3Var, d0Var.f9193a, d0Var.f9197e, firstAdIndexToPlay, y1Var2.f28768e, d0Var.f9196d);
            }
            m3Var.getPeriodByUid(obj, k3Var2);
            long adGroupTimeUs = k3Var2.getAdGroupTimeUs(i10);
            return e(m3Var, d0Var.f9193a, adGroupTimeUs == Long.MIN_VALUE ? k3Var2.f27599f : k3Var2.getContentResumeOffsetUs(i10) + adGroupTimeUs, y1Var2.f28768e, d0Var.f9196d);
        }
        int i11 = d0Var.f9194b;
        int adCountInAdGroup = k3Var2.getAdCountInAdGroup(i11);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = k3Var2.getNextAdIndexToPlay(i11, d0Var.f9195c);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return d(m3Var, d0Var.f9193a, i11, nextAdIndexToPlay, y1Var2.f28766c, d0Var.f9196d);
        }
        long jLongValue = y1Var2.f28766c;
        if (jLongValue == C.TIME_UNSET) {
            Pair<Object, Long> periodPositionUs = m3Var.getPeriodPositionUs(this.f28816b, k3Var2, k3Var2.f27598e, C.TIME_UNSET, Math.max(0L, rendererOffset));
            k3Var = k3Var2;
            if (periodPositionUs == null) {
                return null;
            }
            jLongValue = ((Long) periodPositionUs.second).longValue();
        } else {
            k3Var = k3Var2;
        }
        int i12 = d0Var.f9194b;
        m3Var.getPeriodByUid(obj, k3Var);
        long adGroupTimeUs2 = k3Var.getAdGroupTimeUs(i12);
        return e(m3Var, d0Var.f9193a, Math.max(adGroupTimeUs2 == Long.MIN_VALUE ? k3Var.f27599f : k3Var.getContentResumeOffsetUs(i12) + adGroupTimeUs2, jLongValue), y1Var2.f28766c, d0Var.f9196d);
    }

    public final y1 c(m3 m3Var, bf.d0 d0Var, long j10, long j11) {
        m3Var.getPeriodByUid(d0Var.f9193a, this.f28815a);
        return d0Var.isAd() ? d(m3Var, d0Var.f9193a, d0Var.f9194b, d0Var.f9195c, j10, d0Var.f9196d) : e(m3Var, d0Var.f9193a, j11, j10, d0Var.f9196d);
    }

    public void clear() {
        if (this.f28825k == 0) {
            return;
        }
        x1 next = (x1) com.google.android.exoplayer2.util.a.checkStateNotNull(this.f28822h);
        this.f28826l = next.f28696b;
        this.f28827m = next.f28700f.f28764a.f9196d;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.f28822h = null;
        this.f28824j = null;
        this.f28823i = null;
        this.f28825k = 0;
        h();
    }

    public final y1 d(m3 m3Var, Object obj, int i10, int i11, long j10, long j11) {
        bf.d0 d0Var = new bf.d0(obj, i10, i11, j11);
        Object obj2 = d0Var.f9193a;
        k3 k3Var = this.f28815a;
        k3 periodByUid = m3Var.getPeriodByUid(obj2, k3Var);
        int i12 = d0Var.f9195c;
        int i13 = d0Var.f9194b;
        long adDurationUs = periodByUid.getAdDurationUs(i13, i12);
        long adResumePositionUs = i11 == k3Var.getFirstAdIndexToPlay(i10) ? k3Var.getAdResumePositionUs() : 0L;
        boolean zIsServerSideInsertedAdGroup = k3Var.isServerSideInsertedAdGroup(i13);
        if (adDurationUs != C.TIME_UNSET && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, adDurationUs - 1);
        }
        return new y1(d0Var, adResumePositionUs, j10, C.TIME_UNSET, adDurationUs, zIsServerSideInsertedAdGroup, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.exoplayer2.y1 e(com.google.android.exoplayer2.m3 r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            com.google.android.exoplayer2.k3 r5 = r0.f28815a
            r1.getPeriodByUid(r2, r5)
            int r6 = r5.getAdGroupIndexAfterPositionUs(r3)
            r7 = 0
            r8 = 1
            r9 = -1
            if (r6 == r9) goto L1e
            boolean r10 = r5.isLivePostrollPlaceholder(r6)
            if (r10 == 0) goto L1e
            r10 = r8
            goto L1f
        L1e:
            r10 = r7
        L1f:
            if (r6 != r9) goto L33
            int r11 = r5.getAdGroupCount()
            if (r11 <= 0) goto L4c
            int r11 = r5.getRemovedAdGroupCount()
            boolean r11 = r5.isServerSideInsertedAdGroup(r11)
            if (r11 == 0) goto L4c
            r11 = r8
            goto L4d
        L33:
            boolean r11 = r5.isServerSideInsertedAdGroup(r6)
            if (r11 == 0) goto L4c
            long r11 = r5.getAdGroupTimeUs(r6)
            long r13 = r5.f27599f
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L4c
            boolean r11 = r5.hasPlayedAdGroup(r6)
            if (r11 == 0) goto L4c
            r11 = r8
            r6 = r9
            goto L4d
        L4c:
            r11 = r7
        L4d:
            bf.d0 r13 = new bf.d0
            r14 = r33
            r13.<init>(r2, r14, r6)
            boolean r2 = r13.isAd()
            if (r2 != 0) goto L60
            int r2 = r13.f9197e
            if (r2 != r9) goto L60
            r2 = r8
            goto L61
        L60:
            r2 = r7
        L61:
            boolean r24 = r0.g(r1, r13)
            boolean r25 = r0.f(r1, r13, r2)
            if (r6 == r9) goto L76
            boolean r1 = r5.isServerSideInsertedAdGroup(r6)
            if (r1 == 0) goto L76
            if (r10 != 0) goto L76
            r22 = r8
            goto L78
        L76:
            r22 = r7
        L78:
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r6 == r9) goto L88
            if (r10 != 0) goto L88
            long r9 = r5.getAdGroupTimeUs(r6)
        L85:
            r18 = r9
            goto L8f
        L88:
            if (r11 == 0) goto L8d
            long r9 = r5.f27599f
            goto L85
        L8d:
            r18 = r14
        L8f:
            int r1 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r1 == 0) goto L9d
            r9 = -9223372036854775808
            int r1 = (r18 > r9 ? 1 : (r18 == r9 ? 0 : -1))
            if (r1 != 0) goto L9a
            goto L9d
        L9a:
            r20 = r18
            goto La1
        L9d:
            long r5 = r5.f27599f
            r20 = r5
        La1:
            int r1 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r1 == 0) goto Lb7
            int r1 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r1 < 0) goto Lb7
            if (r25 != 0) goto Lad
            if (r11 != 0) goto Lae
        Lad:
            r7 = r8
        Lae:
            long r3 = (long) r7
            long r3 = r20 - r3
            r5 = 0
            long r3 = java.lang.Math.max(r5, r3)
        Lb7:
            r14 = r3
            com.google.android.exoplayer2.y1 r12 = new com.google.android.exoplayer2.y1
            r16 = r31
            r23 = r2
            r12.<init>(r13, r14, r16, r18, r20, r22, r23, r24, r25)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.z1.e(com.google.android.exoplayer2.m3, java.lang.Object, long, long, long):com.google.android.exoplayer2.y1");
    }

    public x1 enqueueNextMediaPeriodHolder(b3[] b3VarArr, pf.w wVar, qf.c cVar, f2 f2Var, y1 y1Var, pf.x xVar) {
        y1 y1Var2;
        long rendererOffset;
        x1 x1Var = this.f28824j;
        if (x1Var == null) {
            rendererOffset = 1000000000000L;
            y1Var2 = y1Var;
        } else {
            y1Var2 = y1Var;
            rendererOffset = (x1Var.getRendererOffset() + this.f28824j.f28700f.f28768e) - y1Var2.f28765b;
        }
        x1 x1Var2 = new x1(b3VarArr, rendererOffset, wVar, cVar, f2Var, y1Var2, xVar);
        x1 x1Var3 = this.f28824j;
        if (x1Var3 != null) {
            x1Var3.setNext(x1Var2);
        } else {
            this.f28822h = x1Var2;
            this.f28823i = x1Var2;
        }
        this.f28826l = null;
        this.f28824j = x1Var2;
        this.f28825k++;
        h();
        return x1Var2;
    }

    public final boolean f(m3 m3Var, bf.d0 d0Var, boolean z10) {
        int indexOfPeriod = m3Var.getIndexOfPeriod(d0Var.f9193a);
        if (m3Var.getWindow(m3Var.getPeriod(indexOfPeriod, this.f28815a).f27598e, this.f28816b).f27655k) {
            return false;
        }
        return m3Var.isLastPeriod(indexOfPeriod, this.f28815a, this.f28816b, this.f28820f, this.f28821g) && z10;
    }

    public final boolean g(m3 m3Var, bf.d0 d0Var) {
        boolean z10 = !d0Var.isAd() && d0Var.f9197e == -1;
        Object obj = d0Var.f9193a;
        if (z10) {
            if (m3Var.getWindow(m3Var.getPeriodByUid(obj, this.f28815a).f27598e, this.f28816b).f27662r == m3Var.getIndexOfPeriod(obj)) {
                return true;
            }
        }
        return false;
    }

    public x1 getLoadingPeriod() {
        return this.f28824j;
    }

    public y1 getNextMediaPeriodInfo(long j10, k2 k2Var) {
        x1 x1Var = this.f28824j;
        return x1Var == null ? c(k2Var.f27572a, k2Var.f27573b, k2Var.f27574c, k2Var.f27589r) : b(k2Var.f27572a, x1Var, j10);
    }

    public x1 getPlayingPeriod() {
        return this.f28822h;
    }

    public x1 getReadingPeriod() {
        return this.f28823i;
    }

    public y1 getUpdatedMediaPeriodInfo(m3 m3Var, y1 y1Var) {
        boolean z10;
        bf.d0 d0Var = y1Var.f28764a;
        boolean zIsAd = d0Var.isAd();
        int i10 = d0Var.f9197e;
        boolean zIsServerSideInsertedAdGroup = false;
        boolean z11 = !zIsAd && i10 == -1;
        int i11 = d0Var.f9194b;
        boolean zG = g(m3Var, d0Var);
        boolean zF = f(m3Var, d0Var, z11);
        Object obj = y1Var.f28764a.f9193a;
        k3 k3Var = this.f28815a;
        m3Var.getPeriodByUid(obj, k3Var);
        long adGroupTimeUs = (d0Var.isAd() || i10 == -1) ? -9223372036854775807L : k3Var.getAdGroupTimeUs(i10);
        long adDurationUs = d0Var.isAd() ? k3Var.getAdDurationUs(i11, d0Var.f9195c) : (adGroupTimeUs == C.TIME_UNSET || adGroupTimeUs == Long.MIN_VALUE) ? k3Var.getDurationUs() : adGroupTimeUs;
        if (!d0Var.isAd()) {
            if (i10 != -1 && k3Var.isServerSideInsertedAdGroup(i10)) {
                z10 = true;
            }
            return new y1(d0Var, y1Var.f28765b, y1Var.f28766c, adGroupTimeUs, adDurationUs, z10, z11, zG, zF);
        }
        zIsServerSideInsertedAdGroup = k3Var.isServerSideInsertedAdGroup(i11);
        z10 = zIsServerSideInsertedAdGroup;
        return new y1(d0Var, y1Var.f28765b, y1Var.f28766c, adGroupTimeUs, adDurationUs, z10, z11, zG, zF);
    }

    public final void h() {
        x4 x4VarBuilder = b5.builder();
        for (x1 next = this.f28822h; next != null; next = next.getNext()) {
            x4VarBuilder.add((Object) next.f28700f.f28764a);
        }
        x1 x1Var = this.f28823i;
        this.f28818d.post(new androidx.browser.customtabs.g(this, 25, x4VarBuilder, x1Var == null ? null : x1Var.f28700f.f28764a));
    }

    public boolean isLoading(bf.a0 a0Var) {
        x1 x1Var = this.f28824j;
        return x1Var != null && x1Var.f28695a == a0Var;
    }

    public final long j(Object obj, m3 m3Var) {
        int indexOfPeriod;
        k3 k3Var = this.f28815a;
        int i10 = m3Var.getPeriodByUid(obj, k3Var).f27598e;
        Object obj2 = this.f28826l;
        if (obj2 != null && (indexOfPeriod = m3Var.getIndexOfPeriod(obj2)) != -1 && m3Var.getPeriod(indexOfPeriod, k3Var).f27598e == i10) {
            return this.f28827m;
        }
        for (x1 next = this.f28822h; next != null; next = next.getNext()) {
            if (next.f28696b.equals(obj)) {
                return next.f28700f.f28764a.f9196d;
            }
        }
        for (x1 next2 = this.f28822h; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = m3Var.getIndexOfPeriod(next2.f28696b);
            if (indexOfPeriod2 != -1 && m3Var.getPeriod(indexOfPeriod2, k3Var).f27598e == i10) {
                return next2.f28700f.f28764a.f9196d;
            }
        }
        long j10 = this.f28819e;
        this.f28819e = 1 + j10;
        if (this.f28822h == null) {
            this.f28826l = obj;
            this.f28827m = j10;
        }
        return j10;
    }

    public final boolean k(m3 m3Var) {
        m3 m3Var2;
        x1 next = this.f28822h;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = m3Var.getIndexOfPeriod(next.f28696b);
        while (true) {
            m3Var2 = m3Var;
            indexOfPeriod = m3Var2.getNextPeriodIndex(indexOfPeriod, this.f28815a, this.f28816b, this.f28820f, this.f28821g);
            while (next.getNext() != null && !next.f28700f.f28770g) {
                next = next.getNext();
            }
            x1 next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || m3Var2.getIndexOfPeriod(next2.f28696b) != indexOfPeriod) {
                break;
            }
            next = next2;
            m3Var = m3Var2;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.f28700f = getUpdatedMediaPeriodInfo(m3Var2, next.f28700f);
        return !zRemoveAfter;
    }

    public void reevaluateBuffer(long j10) {
        x1 x1Var = this.f28824j;
        if (x1Var != null) {
            x1Var.reevaluateBuffer(j10);
        }
    }

    public boolean removeAfter(x1 x1Var) {
        boolean z10 = false;
        com.google.android.exoplayer2.util.a.checkState(x1Var != null);
        if (x1Var.equals(this.f28824j)) {
            return false;
        }
        this.f28824j = x1Var;
        while (x1Var.getNext() != null) {
            x1Var = x1Var.getNext();
            if (x1Var == this.f28823i) {
                this.f28823i = this.f28822h;
                z10 = true;
            }
            x1Var.release();
            this.f28825k--;
        }
        this.f28824j.setNext(null);
        h();
        return z10;
    }

    public bf.d0 resolveMediaPeriodIdForAds(m3 m3Var, Object obj, long j10) {
        return i(m3Var, obj, j10, j(obj, m3Var), this.f28816b, this.f28815a);
    }

    public bf.d0 resolveMediaPeriodIdForAdsAfterPeriodPositionChange(m3 m3Var, Object obj, long j10) {
        long j11 = j(obj, m3Var);
        k3 k3Var = this.f28815a;
        m3Var.getPeriodByUid(obj, k3Var);
        int i10 = k3Var.f27598e;
        l3 l3Var = this.f28816b;
        m3Var.getWindow(i10, l3Var);
        boolean z10 = false;
        for (int indexOfPeriod = m3Var.getIndexOfPeriod(obj); indexOfPeriod >= l3Var.f27661q; indexOfPeriod--) {
            m3Var.getPeriod(indexOfPeriod, k3Var, true);
            boolean z11 = k3Var.getAdGroupCount() > 0;
            z10 |= z11;
            if (k3Var.getAdGroupIndexForPositionUs(k3Var.f27599f) != -1) {
                obj = com.google.android.exoplayer2.util.a.checkNotNull(k3Var.f27597c);
            }
            if (z10 && (!z11 || k3Var.f27599f != 0)) {
                break;
            }
        }
        return i(m3Var, obj, j10, j11, this.f28816b, this.f28815a);
    }

    public boolean shouldLoadNextMediaPeriod() {
        x1 x1Var = this.f28824j;
        if (x1Var != null) {
            return !x1Var.f28700f.f28772i && x1Var.isFullyBuffered() && this.f28824j.f28700f.f28768e != C.TIME_UNSET && this.f28825k < 100;
        }
        return true;
    }

    public boolean updateQueuedPeriods(m3 m3Var, long j10, long j11) {
        boolean zRemoveAfter;
        y1 updatedMediaPeriodInfo;
        x1 next = this.f28822h;
        x1 x1Var = null;
        while (next != null) {
            y1 y1Var = next.f28700f;
            if (x1Var != null) {
                y1 y1VarB = b(m3Var, x1Var, j10);
                if (y1VarB == null) {
                    zRemoveAfter = removeAfter(x1Var);
                } else if (y1Var.f28765b == y1VarB.f28765b && y1Var.f28764a.equals(y1VarB.f28764a)) {
                    updatedMediaPeriodInfo = y1VarB;
                } else {
                    zRemoveAfter = removeAfter(x1Var);
                }
                return !zRemoveAfter;
            }
            updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(m3Var, y1Var);
            y1 y1VarCopyWithRequestedContentPositionUs = updatedMediaPeriodInfo.copyWithRequestedContentPositionUs(y1Var.f28766c);
            long j12 = updatedMediaPeriodInfo.f28768e;
            next.f28700f = y1VarCopyWithRequestedContentPositionUs;
            long j13 = y1Var.f28768e;
            if (j13 != C.TIME_UNSET && j13 != j12) {
                next.updateClipping();
                return (removeAfter(next) || (next == this.f28823i && !next.f28700f.f28769f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > C.TIME_UNSET ? 1 : (j12 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j12)) ? 1 : (j11 == ((j12 > C.TIME_UNSET ? 1 : (j12 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            x1Var = next;
            next = next.getNext();
        }
        return true;
    }

    public boolean updateRepeatMode(m3 m3Var, int i10) {
        this.f28820f = i10;
        return k(m3Var);
    }

    public boolean updateShuffleModeEnabled(m3 m3Var, boolean z10) {
        this.f28821g = z10;
        return k(m3Var);
    }
}

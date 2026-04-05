package io.bidmachine.media3.exoplayer;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import nh.b5;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c1 {

    /* renamed from: c, reason: collision with root package name */
    public final on.a f61131c;

    /* renamed from: d, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.v f61132d;

    /* renamed from: e, reason: collision with root package name */
    public final y0 f61133e;

    /* renamed from: f, reason: collision with root package name */
    public long f61134f;

    /* renamed from: g, reason: collision with root package name */
    public int f61135g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f61136h;

    /* renamed from: i, reason: collision with root package name */
    public ExoPlayer.b f61137i;

    /* renamed from: j, reason: collision with root package name */
    public z0 f61138j;

    /* renamed from: k, reason: collision with root package name */
    public z0 f61139k;

    /* renamed from: l, reason: collision with root package name */
    public z0 f61140l;

    /* renamed from: m, reason: collision with root package name */
    public z0 f61141m;

    /* renamed from: n, reason: collision with root package name */
    public z0 f61142n;

    /* renamed from: o, reason: collision with root package name */
    public int f61143o;

    /* renamed from: p, reason: collision with root package name */
    public Object f61144p;

    /* renamed from: q, reason: collision with root package name */
    public long f61145q;

    /* renamed from: a, reason: collision with root package name */
    public final gn.r1 f61129a = new gn.r1();

    /* renamed from: b, reason: collision with root package name */
    public final gn.t1 f61130b = new gn.t1();

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f61146r = new ArrayList();

    public c1(on.a aVar, io.bidmachine.media3.common.util.v vVar, y0 y0Var, ExoPlayer.b bVar) {
        this.f61131c = aVar;
        this.f61132d = vVar;
        this.f61133e = y0Var;
        this.f61137i = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ao.k0 k(gn.u1 r14, java.lang.Object r15, long r16, long r18, gn.t1 r20, gn.r1 r21) {
        /*
            r0 = r16
            r2 = r20
            r4 = r21
            r14.getPeriodByUid(r15, r4)
            int r5 = r4.f58110c
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
            long r12 = r4.f58111d
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
            long r12 = r4.f58111d
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 > 0) goto L6a
        L5a:
            int r3 = r2.f58189o
            if (r5 > r3) goto L6a
            r14.getPeriod(r5, r4, r8)
            java.lang.Object r3 = r4.f58109b
            java.lang.Object r7 = io.bidmachine.media3.common.util.a.checkNotNull(r3)
            int r5 = r5 + 1
            goto L13
        L6a:
            r14.getPeriodByUid(r7, r4)
            int r8 = r4.getAdGroupIndexForPositionUs(r0)
            if (r8 != r6) goto L7f
            int r14 = r4.getAdGroupIndexAfterPositionUs(r0)
            ao.k0 r0 = new ao.k0
            r10 = r18
            r0.<init>(r7, r10, r14)
            return r0
        L7f:
            r10 = r18
            int r9 = r4.getFirstAdIndexToPlay(r8)
            ao.k0 r6 = new ao.k0
            r6.<init>(r7, r8, r9, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.c1.k(gn.u1, java.lang.Object, long, long, gn.t1, gn.r1):ao.k0");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.bidmachine.media3.exoplayer.a1 a(gn.u1 r21, io.bidmachine.media3.exoplayer.z0 r22, long r23) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.c1.a(gn.u1, io.bidmachine.media3.exoplayer.z0, long):io.bidmachine.media3.exoplayer.a1");
    }

    public z0 advancePlayingPeriod() {
        z0 z0Var = this.f61138j;
        if (z0Var == null) {
            return null;
        }
        if (z0Var == this.f61139k) {
            this.f61139k = z0Var.getNext();
        }
        z0 z0Var2 = this.f61138j;
        if (z0Var2 == this.f61140l) {
            this.f61140l = z0Var2.getNext();
        }
        this.f61138j.release();
        int i10 = this.f61143o - 1;
        this.f61143o = i10;
        if (i10 == 0) {
            this.f61141m = null;
            z0 z0Var3 = this.f61138j;
            this.f61144p = z0Var3.f61609b;
            this.f61145q = z0Var3.f61615h.f60880a.f7721d;
        }
        this.f61138j = this.f61138j.getNext();
        h();
        return this.f61138j;
    }

    public z0 advancePrewarmingPeriod() {
        this.f61140l = ((z0) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61140l)).getNext();
        h();
        return (z0) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61140l);
    }

    public z0 advanceReadingPeriod() {
        z0 z0Var = this.f61140l;
        z0 z0Var2 = this.f61139k;
        if (z0Var == z0Var2) {
            this.f61140l = ((z0) io.bidmachine.media3.common.util.a.checkStateNotNull(z0Var2)).getNext();
        }
        this.f61139k = ((z0) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61139k)).getNext();
        h();
        return (z0) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61139k);
    }

    public final a1 b(gn.u1 u1Var, z0 z0Var, long j10) {
        gn.r1 r1Var;
        gn.u1 u1Var2;
        a1 a1Var = z0Var.f61615h;
        long rendererOffset = (z0Var.getRendererOffset() + a1Var.f60884e) - j10;
        if (a1Var.f60887h) {
            return a(u1Var, z0Var, rendererOffset);
        }
        a1 a1Var2 = z0Var.f61615h;
        ao.k0 k0Var = a1Var2.f60880a;
        Object obj = k0Var.f7718a;
        int i10 = k0Var.f7722e;
        gn.r1 r1Var2 = this.f61129a;
        u1Var.getPeriodByUid(obj, r1Var2);
        boolean z10 = a1Var2.f60886g;
        if (!k0Var.isAd()) {
            if (i10 != -1 && r1Var2.isLivePostrollPlaceholder(i10)) {
                return a(u1Var, z0Var, rendererOffset);
            }
            int firstAdIndexToPlay = r1Var2.getFirstAdIndexToPlay(i10);
            boolean z11 = r1Var2.isServerSideInsertedAdGroup(i10) && r1Var2.getAdState(i10, firstAdIndexToPlay) == 3;
            if (firstAdIndexToPlay != r1Var2.getAdCountInAdGroup(i10) && !z11) {
                return d(u1Var, k0Var.f7718a, k0Var.f7722e, firstAdIndexToPlay, a1Var2.f60884e, k0Var.f7721d, z10);
            }
            u1Var.getPeriodByUid(obj, r1Var2);
            long adGroupTimeUs = r1Var2.getAdGroupTimeUs(i10);
            return e(u1Var, k0Var.f7718a, adGroupTimeUs == Long.MIN_VALUE ? r1Var2.f58111d : r1Var2.getContentResumeOffsetUs(i10) + adGroupTimeUs, a1Var2.f60884e, k0Var.f7721d, false);
        }
        int i11 = k0Var.f7719b;
        int adCountInAdGroup = r1Var2.getAdCountInAdGroup(i11);
        if (adCountInAdGroup == -1) {
            return null;
        }
        int nextAdIndexToPlay = r1Var2.getNextAdIndexToPlay(i11, k0Var.f7720c);
        if (nextAdIndexToPlay < adCountInAdGroup) {
            return d(u1Var, k0Var.f7718a, i11, nextAdIndexToPlay, a1Var2.f60882c, k0Var.f7721d, z10);
        }
        long jLongValue = a1Var2.f60882c;
        if (jLongValue == C.TIME_UNSET) {
            Pair<Object, Long> periodPositionUs = u1Var.getPeriodPositionUs(this.f61130b, r1Var2, r1Var2.f58110c, C.TIME_UNSET, Math.max(0L, rendererOffset));
            r1Var = r1Var2;
            u1Var2 = u1Var;
            if (periodPositionUs == null) {
                return null;
            }
            jLongValue = ((Long) periodPositionUs.second).longValue();
        } else {
            r1Var = r1Var2;
            u1Var2 = u1Var;
        }
        int i12 = k0Var.f7719b;
        u1Var2.getPeriodByUid(obj, r1Var);
        long adGroupTimeUs2 = r1Var.getAdGroupTimeUs(i12);
        return e(u1Var, k0Var.f7718a, Math.max(adGroupTimeUs2 == Long.MIN_VALUE ? r1Var.f58111d : r1Var.getContentResumeOffsetUs(i12) + adGroupTimeUs2, jLongValue), a1Var2.f60882c, k0Var.f7721d, z10);
    }

    public final a1 c(gn.u1 u1Var, ao.k0 k0Var, long j10, long j11) {
        u1Var.getPeriodByUid(k0Var.f7718a, this.f61129a);
        return k0Var.isAd() ? d(u1Var, k0Var.f7718a, k0Var.f7719b, k0Var.f7720c, j10, k0Var.f7721d, false) : e(u1Var, k0Var.f7718a, j11, j10, k0Var.f7721d, false);
    }

    public void clear() {
        if (this.f61143o == 0) {
            return;
        }
        z0 next = (z0) io.bidmachine.media3.common.util.a.checkStateNotNull(this.f61138j);
        this.f61144p = next.f61609b;
        this.f61145q = next.f61615h.f60880a.f7721d;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.f61138j = null;
        this.f61141m = null;
        this.f61139k = null;
        this.f61140l = null;
        this.f61143o = 0;
        h();
    }

    public final a1 d(gn.u1 u1Var, Object obj, int i10, int i11, long j10, long j11, boolean z10) {
        ao.k0 k0Var = new ao.k0(obj, i10, i11, j11);
        Object obj2 = k0Var.f7718a;
        gn.r1 r1Var = this.f61129a;
        gn.r1 periodByUid = u1Var.getPeriodByUid(obj2, r1Var);
        int i12 = k0Var.f7720c;
        int i13 = k0Var.f7719b;
        long adDurationUs = periodByUid.getAdDurationUs(i13, i12);
        long adResumePositionUs = i11 == r1Var.getFirstAdIndexToPlay(i10) ? r1Var.getAdResumePositionUs() : 0L;
        boolean zIsServerSideInsertedAdGroup = r1Var.isServerSideInsertedAdGroup(i13);
        if (adDurationUs != C.TIME_UNSET && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, adDurationUs - 1);
        }
        return new a1(k0Var, adResumePositionUs, j10, C.TIME_UNSET, adDurationUs, z10, zIsServerSideInsertedAdGroup, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.bidmachine.media3.exoplayer.a1 e(gn.u1 r28, java.lang.Object r29, long r30, long r32, long r34, boolean r36) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            gn.r1 r5 = r0.f61129a
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
            long r13 = r5.f58111d
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
            ao.k0 r13 = new ao.k0
            r14 = r34
            r13.<init>(r2, r14, r6)
            boolean r2 = r13.isAd()
            if (r2 != 0) goto L60
            int r2 = r13.f7722e
            if (r2 != r9) goto L60
            r2 = r8
            goto L61
        L60:
            r2 = r7
        L61:
            boolean r25 = r0.g(r1, r13)
            boolean r26 = r0.f(r1, r13, r2)
            if (r6 == r9) goto L76
            boolean r1 = r5.isServerSideInsertedAdGroup(r6)
            if (r1 == 0) goto L76
            if (r10 != 0) goto L76
            r23 = r8
            goto L78
        L76:
            r23 = r7
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
            long r9 = r5.f58111d
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
            long r5 = r5.f58111d
            r20 = r5
        La1:
            int r1 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r1 == 0) goto Lb7
            int r1 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r1 < 0) goto Lb7
            if (r26 != 0) goto Lad
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
            io.bidmachine.media3.exoplayer.a1 r12 = new io.bidmachine.media3.exoplayer.a1
            r16 = r32
            r22 = r36
            r24 = r2
            r12.<init>(r13, r14, r16, r18, r20, r22, r23, r24, r25, r26)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.c1.e(gn.u1, java.lang.Object, long, long, long, boolean):io.bidmachine.media3.exoplayer.a1");
    }

    public z0 enqueueNextMediaPeriodHolder(a1 a1Var) {
        z0 z0Var = this.f61141m;
        long rendererOffset = z0Var == null ? 1000000000000L : (z0Var.getRendererOffset() + this.f61141m.f61615h.f60884e) - a1Var.f60881b;
        z0 z0VarJ = j(a1Var);
        if (z0VarJ == null) {
            z0VarJ = ((f0) this.f61133e).create(a1Var, rendererOffset);
        } else {
            z0VarJ.f61615h = a1Var;
            z0VarJ.setRendererOffset(rendererOffset);
        }
        z0 z0Var2 = this.f61141m;
        if (z0Var2 != null) {
            z0Var2.setNext(z0VarJ);
        } else {
            this.f61138j = z0VarJ;
            this.f61139k = z0VarJ;
            this.f61140l = z0VarJ;
        }
        this.f61144p = null;
        this.f61141m = z0VarJ;
        this.f61143o++;
        h();
        return z0VarJ;
    }

    public final boolean f(gn.u1 u1Var, ao.k0 k0Var, boolean z10) {
        int indexOfPeriod = u1Var.getIndexOfPeriod(k0Var.f7718a);
        if (u1Var.getWindow(u1Var.getPeriod(indexOfPeriod, this.f61129a).f58110c, this.f61130b).f58183i) {
            return false;
        }
        return u1Var.isLastPeriod(indexOfPeriod, this.f61129a, this.f61130b, this.f61135g, this.f61136h) && z10;
    }

    public final boolean g(gn.u1 u1Var, ao.k0 k0Var) {
        boolean z10 = !k0Var.isAd() && k0Var.f7722e == -1;
        Object obj = k0Var.f7718a;
        if (z10) {
            if (u1Var.getWindow(u1Var.getPeriodByUid(obj, this.f61129a).f58110c, this.f61130b).f58189o == u1Var.getIndexOfPeriod(obj)) {
                return true;
            }
        }
        return false;
    }

    public z0 getLoadingPeriod() {
        return this.f61141m;
    }

    public a1 getNextMediaPeriodInfo(long j10, k1 k1Var) {
        z0 z0Var = this.f61141m;
        return z0Var == null ? c(k1Var.f61303a, k1Var.f61304b, k1Var.f61305c, k1Var.f61321s) : b(k1Var.f61303a, z0Var, j10);
    }

    public z0 getPlayingPeriod() {
        return this.f61138j;
    }

    public z0 getPreloadHolderByMediaPeriod(ao.i0 i0Var) {
        for (int i10 = 0; i10 < this.f61146r.size(); i10++) {
            z0 z0Var = (z0) this.f61146r.get(i10);
            if (z0Var.f61608a == i0Var) {
                return z0Var;
            }
        }
        return null;
    }

    public z0 getPreloadingPeriod() {
        return this.f61142n;
    }

    public z0 getPrewarmingPeriod() {
        return this.f61140l;
    }

    public z0 getReadingPeriod() {
        return this.f61139k;
    }

    public a1 getUpdatedMediaPeriodInfo(gn.u1 u1Var, a1 a1Var) {
        ao.k0 k0Var = a1Var.f60880a;
        boolean zIsAd = k0Var.isAd();
        int i10 = k0Var.f7722e;
        boolean zIsServerSideInsertedAdGroup = false;
        boolean z10 = !zIsAd && i10 == -1;
        int i11 = k0Var.f7719b;
        boolean zG = g(u1Var, k0Var);
        boolean zF = f(u1Var, k0Var, z10);
        Object obj = a1Var.f60880a.f7718a;
        gn.r1 r1Var = this.f61129a;
        u1Var.getPeriodByUid(obj, r1Var);
        long adGroupTimeUs = (k0Var.isAd() || i10 == -1) ? -9223372036854775807L : r1Var.getAdGroupTimeUs(i10);
        long adDurationUs = k0Var.isAd() ? r1Var.getAdDurationUs(i11, k0Var.f7720c) : (adGroupTimeUs == C.TIME_UNSET || adGroupTimeUs == Long.MIN_VALUE) ? r1Var.getDurationUs() : adGroupTimeUs;
        if (k0Var.isAd()) {
            zIsServerSideInsertedAdGroup = r1Var.isServerSideInsertedAdGroup(i11);
        } else if (i10 != -1 && r1Var.isServerSideInsertedAdGroup(i10)) {
            zIsServerSideInsertedAdGroup = true;
        }
        return new a1(k0Var, a1Var.f60881b, a1Var.f60882c, adGroupTimeUs, adDurationUs, a1Var.f60885f, zIsServerSideInsertedAdGroup, z10, zG, zF);
    }

    public final void h() {
        x4 x4VarBuilder = b5.builder();
        for (z0 next = this.f61138j; next != null; next = next.getNext()) {
            x4VarBuilder.add((Object) next.f61615h.f60880a);
        }
        z0 z0Var = this.f61139k;
        this.f61132d.post(new b1(this, 0, x4VarBuilder, z0Var == null ? null : z0Var.f61615h.f60880a));
    }

    public final void i(ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f61146r.size(); i10++) {
            ((z0) this.f61146r.get(i10)).release();
        }
        this.f61146r = arrayList;
        this.f61142n = null;
        maybeUpdatePreloadMediaPeriodHolder();
    }

    public void invalidatePreloadPool(gn.u1 u1Var) {
        z0 z0Var;
        gn.u1 u1Var2;
        Pair<Object, Long> periodPositionUs;
        c1 c1Var;
        a1 a1VarE;
        if (this.f61137i.f60857a == C.TIME_UNSET || (z0Var = this.f61141m) == null) {
            releasePreloadPool();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object obj = z0Var.f61615h.f60880a.f7718a;
        gn.r1 r1Var = this.f61129a;
        int nextWindowIndex = u1Var.getNextWindowIndex(u1Var.getPeriodByUid(obj, r1Var).f58110c, this.f61135g, this.f61136h);
        if (nextWindowIndex != -1) {
            periodPositionUs = u1Var.getPeriodPositionUs(this.f61130b, this.f61129a, nextWindowIndex, C.TIME_UNSET, 0L);
            u1Var2 = u1Var;
        } else {
            u1Var2 = u1Var;
            periodPositionUs = null;
        }
        if (periodPositionUs != null && !u1Var2.getWindow(u1Var2.getPeriodByUid(periodPositionUs.first, r1Var).f58110c, this.f61130b).isLive()) {
            long jM = m(periodPositionUs.first);
            if (jM == -1) {
                jM = this.f61134f;
                this.f61134f = 1 + jM;
            }
            gn.u1 u1Var3 = u1Var2;
            Object obj2 = periodPositionUs.first;
            long jLongValue = ((Long) periodPositionUs.second).longValue();
            ao.k0 k0VarK = k(u1Var3, obj2, jLongValue, jM, this.f61130b, this.f61129a);
            if (k0VarK.isAd()) {
                c1Var = this;
                a1VarE = c1Var.d(u1Var3, k0VarK.f7718a, k0VarK.f7719b, k0VarK.f7720c, jLongValue, k0VarK.f7721d, false);
            } else {
                c1Var = this;
                a1VarE = c1Var.e(u1Var3, k0VarK.f7718a, jLongValue, C.TIME_UNSET, k0VarK.f7721d, false);
            }
            z0 z0VarJ = j(a1VarE);
            if (z0VarJ == null) {
                z0VarJ = ((f0) c1Var.f61133e).create(a1VarE, (z0Var.getRendererOffset() + z0Var.f61615h.f60884e) - a1VarE.f60881b);
            }
            arrayList.add(z0VarJ);
        }
        i(arrayList);
    }

    public boolean isLoading(ao.i0 i0Var) {
        z0 z0Var = this.f61141m;
        return z0Var != null && z0Var.f61608a == i0Var;
    }

    public boolean isPreloading(ao.i0 i0Var) {
        z0 z0Var = this.f61142n;
        return z0Var != null && z0Var.f61608a == i0Var;
    }

    public final z0 j(a1 a1Var) {
        for (int i10 = 0; i10 < this.f61146r.size(); i10++) {
            if (((z0) this.f61146r.get(i10)).canBeUsedForMediaPeriodInfo(a1Var)) {
                return (z0) this.f61146r.remove(i10);
            }
        }
        return null;
    }

    public final long l(gn.u1 u1Var, Object obj) {
        int indexOfPeriod;
        gn.r1 r1Var = this.f61129a;
        int i10 = u1Var.getPeriodByUid(obj, r1Var).f58110c;
        Object obj2 = this.f61144p;
        if (obj2 != null && (indexOfPeriod = u1Var.getIndexOfPeriod(obj2)) != -1 && u1Var.getPeriod(indexOfPeriod, r1Var).f58110c == i10) {
            return this.f61145q;
        }
        for (z0 next = this.f61138j; next != null; next = next.getNext()) {
            if (next.f61609b.equals(obj)) {
                return next.f61615h.f60880a.f7721d;
            }
        }
        for (z0 next2 = this.f61138j; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = u1Var.getIndexOfPeriod(next2.f61609b);
            if (indexOfPeriod2 != -1 && u1Var.getPeriod(indexOfPeriod2, r1Var).f58110c == i10) {
                return next2.f61615h.f60880a.f7721d;
            }
        }
        long jM = m(obj);
        if (jM != -1) {
            return jM;
        }
        long j10 = this.f61134f;
        this.f61134f = 1 + j10;
        if (this.f61138j == null) {
            this.f61144p = obj;
            this.f61145q = j10;
        }
        return j10;
    }

    public final long m(Object obj) {
        for (int i10 = 0; i10 < this.f61146r.size(); i10++) {
            z0 z0Var = (z0) this.f61146r.get(i10);
            if (z0Var.f61609b.equals(obj)) {
                return z0Var.f61615h.f60880a.f7721d;
            }
        }
        return -1L;
    }

    public void maybeUpdatePreloadMediaPeriodHolder() {
        z0 z0Var = this.f61142n;
        if (z0Var == null || z0Var.isFullyPreloaded()) {
            this.f61142n = null;
            for (int i10 = 0; i10 < this.f61146r.size(); i10++) {
                z0 z0Var2 = (z0) this.f61146r.get(i10);
                if (!z0Var2.isFullyPreloaded()) {
                    this.f61142n = z0Var2;
                    return;
                }
            }
        }
    }

    public final int n(gn.u1 u1Var) {
        gn.u1 u1Var2;
        z0 next = this.f61138j;
        if (next == null) {
            return 0;
        }
        int indexOfPeriod = u1Var.getIndexOfPeriod(next.f61609b);
        while (true) {
            u1Var2 = u1Var;
            indexOfPeriod = u1Var2.getNextPeriodIndex(indexOfPeriod, this.f61129a, this.f61130b, this.f61135g, this.f61136h);
            while (((z0) io.bidmachine.media3.common.util.a.checkNotNull(next)).getNext() != null && !next.f61615h.f60887h) {
                next = next.getNext();
            }
            z0 next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || u1Var2.getIndexOfPeriod(next2.f61609b) != indexOfPeriod) {
                break;
            }
            next = next2;
            u1Var = u1Var2;
        }
        int iRemoveAfter = removeAfter(next);
        next.f61615h = getUpdatedMediaPeriodInfo(u1Var2, next.f61615h);
        return iRemoveAfter;
    }

    public void reevaluateBuffer(long j10) {
        z0 z0Var = this.f61141m;
        if (z0Var != null) {
            z0Var.reevaluateBuffer(j10);
        }
    }

    public void releasePreloadPool() {
        if (this.f61146r.isEmpty()) {
            return;
        }
        i(new ArrayList());
    }

    public int removeAfter(z0 z0Var) {
        io.bidmachine.media3.common.util.a.checkStateNotNull(z0Var);
        int i10 = 0;
        if (z0Var.equals(this.f61141m)) {
            return 0;
        }
        this.f61141m = z0Var;
        while (z0Var.getNext() != null) {
            z0Var = (z0) io.bidmachine.media3.common.util.a.checkNotNull(z0Var.getNext());
            if (z0Var == this.f61139k) {
                z0 z0Var2 = this.f61138j;
                this.f61139k = z0Var2;
                this.f61140l = z0Var2;
                i10 = 3;
            }
            if (z0Var == this.f61140l) {
                this.f61140l = this.f61139k;
                i10 |= 2;
            }
            z0Var.release();
            this.f61143o--;
        }
        ((z0) io.bidmachine.media3.common.util.a.checkNotNull(this.f61141m)).setNext(null);
        h();
        return i10;
    }

    public ao.k0 resolveMediaPeriodIdForAds(gn.u1 u1Var, Object obj, long j10) {
        return k(u1Var, obj, j10, l(u1Var, obj), this.f61130b, this.f61129a);
    }

    public ao.k0 resolveMediaPeriodIdForAdsAfterPeriodPositionChange(gn.u1 u1Var, Object obj, long j10) {
        long jL = l(u1Var, obj);
        gn.r1 r1Var = this.f61129a;
        u1Var.getPeriodByUid(obj, r1Var);
        int i10 = r1Var.f58110c;
        gn.t1 t1Var = this.f61130b;
        u1Var.getWindow(i10, t1Var);
        boolean z10 = false;
        for (int indexOfPeriod = u1Var.getIndexOfPeriod(obj); indexOfPeriod >= t1Var.f58188n; indexOfPeriod--) {
            u1Var.getPeriod(indexOfPeriod, r1Var, true);
            boolean z11 = r1Var.getAdGroupCount() > 0;
            z10 |= z11;
            if (r1Var.getAdGroupIndexForPositionUs(r1Var.f58111d) != -1) {
                obj = io.bidmachine.media3.common.util.a.checkNotNull(r1Var.f58109b);
            }
            if (z10 && (!z11 || r1Var.f58111d != 0)) {
                break;
            }
        }
        return k(u1Var, obj, j10, jL, this.f61130b, this.f61129a);
    }

    public boolean shouldLoadNextMediaPeriod() {
        z0 z0Var = this.f61141m;
        if (z0Var != null) {
            return !z0Var.f61615h.f60889j && z0Var.isFullyBuffered() && this.f61141m.f61615h.f60884e != C.TIME_UNSET && this.f61143o < 100;
        }
        return true;
    }

    public void updatePreloadConfiguration(gn.u1 u1Var, ExoPlayer.b bVar) {
        this.f61137i = bVar;
        invalidatePreloadPool(u1Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        return removeAfter(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int updateQueuedPeriods(gn.u1 r17, long r18, long r20, long r22) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            io.bidmachine.media3.exoplayer.z0 r2 = r0.f61138j
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto L9a
            io.bidmachine.media3.exoplayer.a1 r5 = r2.f61615h
            if (r3 != 0) goto L15
            io.bidmachine.media3.exoplayer.a1 r3 = r0.getUpdatedMediaPeriodInfo(r1, r5)
            r6 = r18
            goto L30
        L15:
            r6 = r18
            io.bidmachine.media3.exoplayer.a1 r8 = r0.b(r1, r3, r6)
            if (r8 == 0) goto L95
            long r9 = r5.f60881b
            long r11 = r8.f60881b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L95
            ao.k0 r9 = r5.f60880a
            ao.k0 r10 = r8.f60880a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L95
            r3 = r8
        L30:
            long r8 = r5.f60882c
            io.bidmachine.media3.exoplayer.a1 r8 = r3.copyWithRequestedContentPositionUs(r8)
            long r9 = r3.f60884e
            r2.f61615h = r8
            long r11 = r5.f60884e
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r3 == 0) goto L8c
            int r3 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r3 != 0) goto L4a
            goto L8c
        L4a:
            r2.updateClipping()
            int r1 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r1 != 0) goto L57
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L5b
        L57:
            long r5 = r2.toRendererTime(r9)
        L5b:
            io.bidmachine.media3.exoplayer.z0 r1 = r0.f61139k
            r3 = 1
            r7 = -9223372036854775808
            if (r2 != r1) goto L72
            io.bidmachine.media3.exoplayer.a1 r1 = r2.f61615h
            boolean r1 = r1.f60886g
            if (r1 != 0) goto L72
            int r1 = (r20 > r7 ? 1 : (r20 == r7 ? 0 : -1))
            if (r1 == 0) goto L70
            int r1 = (r20 > r5 ? 1 : (r20 == r5 ? 0 : -1))
            if (r1 < 0) goto L72
        L70:
            r1 = r3
            goto L73
        L72:
            r1 = r4
        L73:
            io.bidmachine.media3.exoplayer.z0 r9 = r0.f61140l
            if (r2 != r9) goto L80
            int r7 = (r22 > r7 ? 1 : (r22 == r7 ? 0 : -1))
            if (r7 == 0) goto L7f
            int r5 = (r22 > r5 ? 1 : (r22 == r5 ? 0 : -1))
            if (r5 < 0) goto L80
        L7f:
            r4 = r3
        L80:
            int r2 = r0.removeAfter(r2)
            if (r2 == 0) goto L87
            return r2
        L87:
            if (r4 == 0) goto L8b
            r1 = r1 | 2
        L8b:
            return r1
        L8c:
            io.bidmachine.media3.exoplayer.z0 r3 = r2.getNext()
            r15 = r3
            r3 = r2
            r2 = r15
            goto L7
        L95:
            int r1 = r0.removeAfter(r3)
            return r1
        L9a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.c1.updateQueuedPeriods(gn.u1, long, long, long):int");
    }

    public int updateRepeatMode(gn.u1 u1Var, int i10) {
        this.f61135g = i10;
        return n(u1Var);
    }

    public int updateShuffleModeEnabled(gn.u1 u1Var, boolean z10) {
        this.f61136h = z10;
        return n(u1Var);
    }
}

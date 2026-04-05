package io.odeeo.internal.b;

import android.os.Handler;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.u0.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0.b f62657a = new y0.b();

    /* renamed from: b, reason: collision with root package name */
    public final y0.d f62658b = new y0.d();

    /* renamed from: c, reason: collision with root package name */
    public final io.odeeo.internal.c.a f62659c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f62660d;

    /* renamed from: e, reason: collision with root package name */
    public long f62661e;

    /* renamed from: f, reason: collision with root package name */
    public int f62662f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62663g;

    /* renamed from: h, reason: collision with root package name */
    public b0 f62664h;

    /* renamed from: i, reason: collision with root package name */
    public b0 f62665i;

    /* renamed from: j, reason: collision with root package name */
    public b0 f62666j;

    /* renamed from: k, reason: collision with root package name */
    public int f62667k;

    /* renamed from: l, reason: collision with root package name */
    public Object f62668l;

    /* renamed from: m, reason: collision with root package name */
    public long f62669m;

    public d0(io.odeeo.internal.c.a aVar, Handler handler) {
        this.f62659c = aVar;
        this.f62660d = handler;
    }

    public b0 advancePlayingPeriod() {
        b0 b0Var = this.f62664h;
        if (b0Var == null) {
            return null;
        }
        if (b0Var == this.f62665i) {
            this.f62665i = b0Var.getNext();
        }
        this.f62664h.release();
        int i10 = this.f62667k - 1;
        this.f62667k = i10;
        if (i10 == 0) {
            this.f62666j = null;
            b0 b0Var2 = this.f62664h;
            this.f62668l = b0Var2.f62618b;
            this.f62669m = b0Var2.f62622f.f62647a.f62450d;
        }
        this.f62664h = this.f62664h.getNext();
        a();
        return this.f62664h;
    }

    public b0 advanceReadingPeriod() {
        b0 b0Var = this.f62665i;
        io.odeeo.internal.q0.a.checkState((b0Var == null || b0Var.getNext() == null) ? false : true);
        this.f62665i = this.f62665i.getNext();
        a();
        return this.f62665i;
    }

    public void clear() {
        if (this.f62667k == 0) {
            return;
        }
        b0 next = (b0) io.odeeo.internal.q0.a.checkStateNotNull(this.f62664h);
        this.f62668l = next.f62618b;
        this.f62669m = next.f62622f.f62647a.f62450d;
        while (next != null) {
            next.release();
            next = next.getNext();
        }
        this.f62664h = null;
        this.f62666j = null;
        this.f62665i = null;
        this.f62667k = 0;
        a();
    }

    public b0 enqueueNextMediaPeriodHolder(q0[] q0VarArr, io.odeeo.internal.n0.k kVar, io.odeeo.internal.p0.b bVar, f0 f0Var, c0 c0Var, io.odeeo.internal.n0.l lVar) {
        c0 c0Var2;
        long rendererOffset;
        b0 b0Var = this.f62666j;
        if (b0Var == null) {
            rendererOffset = 1000000000000L;
            c0Var2 = c0Var;
        } else {
            c0Var2 = c0Var;
            rendererOffset = (b0Var.getRendererOffset() + this.f62666j.f62622f.f62651e) - c0Var2.f62648b;
        }
        b0 b0Var2 = new b0(q0VarArr, rendererOffset, kVar, bVar, f0Var, c0Var2, lVar);
        b0 b0Var3 = this.f62666j;
        if (b0Var3 != null) {
            b0Var3.setNext(b0Var2);
        } else {
            this.f62664h = b0Var2;
            this.f62665i = b0Var2;
        }
        this.f62668l = null;
        this.f62666j = b0Var2;
        this.f62667k++;
        a();
        return b0Var2;
    }

    public b0 getLoadingPeriod() {
        return this.f62666j;
    }

    public c0 getNextMediaPeriodInfo(long j10, j0 j0Var) {
        b0 b0Var = this.f62666j;
        return b0Var == null ? a(j0Var) : a(j0Var.f62757a, b0Var, j10);
    }

    public b0 getPlayingPeriod() {
        return this.f62664h;
    }

    public b0 getReadingPeriod() {
        return this.f62665i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.odeeo.internal.b.c0 getUpdatedMediaPeriodInfo(io.odeeo.internal.b.y0 r16, io.odeeo.internal.b.c0 r17) {
        /*
            r15 = this;
            r1 = r16
            r2 = r17
            io.odeeo.internal.a0.t$a r3 = r2.f62647a
            boolean r12 = r15.a(r3)
            boolean r13 = r15.a(r1, r3)
            boolean r14 = r15.a(r1, r3, r12)
            io.odeeo.internal.a0.t$a r4 = r2.f62647a
            java.lang.Object r4 = r4.f62447a
            io.odeeo.internal.b.y0$b r5 = r15.f62657a
            r1.getPeriodByUid(r4, r5)
            boolean r1 = r3.isAd()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L33
            int r1 = r3.f62451e
            if (r1 != r6) goto L2c
            goto L33
        L2c:
            io.odeeo.internal.b.y0$b r7 = r15.f62657a
            long r7 = r7.getAdGroupTimeUs(r1)
            goto L34
        L33:
            r7 = r4
        L34:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L46
            io.odeeo.internal.b.y0$b r1 = r15.f62657a
            int r4 = r3.f62448b
            int r5 = r3.f62449c
            long r4 = r1.getAdDurationUs(r4, r5)
        L44:
            r9 = r4
            goto L5a
        L46:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L53
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L51
            goto L53
        L51:
            r9 = r7
            goto L5a
        L53:
            io.odeeo.internal.b.y0$b r1 = r15.f62657a
            long r4 = r1.getDurationUs()
            goto L44
        L5a:
            boolean r1 = r3.isAd()
            if (r1 == 0) goto L6a
            io.odeeo.internal.b.y0$b r1 = r15.f62657a
            int r4 = r3.f62448b
            boolean r1 = r1.isServerSideInsertedAdGroup(r4)
        L68:
            r11 = r1
            goto L7a
        L6a:
            int r1 = r3.f62451e
            if (r1 == r6) goto L78
            io.odeeo.internal.b.y0$b r4 = r15.f62657a
            boolean r1 = r4.isServerSideInsertedAdGroup(r1)
            if (r1 == 0) goto L78
            r1 = 1
            goto L68
        L78:
            r1 = 0
            goto L68
        L7a:
            io.odeeo.internal.b.c0 r1 = new io.odeeo.internal.b.c0
            r5 = r3
            long r3 = r2.f62648b
            r16 = r1
            long r0 = r2.f62649c
            r2 = r5
            r5 = r0
            r1 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.b.d0.getUpdatedMediaPeriodInfo(io.odeeo.internal.b.y0, io.odeeo.internal.b.c0):io.odeeo.internal.b.c0");
    }

    public boolean isLoading(io.odeeo.internal.a0.r rVar) {
        b0 b0Var = this.f62666j;
        return b0Var != null && b0Var.f62617a == rVar;
    }

    public void reevaluateBuffer(long j10) {
        b0 b0Var = this.f62666j;
        if (b0Var != null) {
            b0Var.reevaluateBuffer(j10);
        }
    }

    public boolean removeAfter(b0 b0Var) {
        boolean z10 = false;
        io.odeeo.internal.q0.a.checkState(b0Var != null);
        if (b0Var.equals(this.f62666j)) {
            return false;
        }
        this.f62666j = b0Var;
        while (b0Var.getNext() != null) {
            b0Var = b0Var.getNext();
            if (b0Var == this.f62665i) {
                this.f62665i = this.f62664h;
                z10 = true;
            }
            b0Var.release();
            this.f62667k--;
        }
        this.f62666j.setNext(null);
        a();
        return z10;
    }

    public t.a resolveMediaPeriodIdForAds(y0 y0Var, Object obj, long j10) {
        return a(y0Var, obj, j10, a(y0Var, obj), this.f62657a);
    }

    public boolean shouldLoadNextMediaPeriod() {
        b0 b0Var = this.f62666j;
        if (b0Var != null) {
            return !b0Var.f62622f.f62655i && b0Var.isFullyBuffered() && this.f62666j.f62622f.f62651e != C.TIME_UNSET && this.f62667k < 100;
        }
        return true;
    }

    public boolean updateQueuedPeriods(y0 y0Var, long j10, long j11) {
        boolean zRemoveAfter;
        c0 updatedMediaPeriodInfo;
        b0 next = this.f62664h;
        b0 b0Var = null;
        while (next != null) {
            c0 c0Var = next.f62622f;
            if (b0Var != null) {
                c0 c0VarA = a(y0Var, b0Var, j10);
                if (c0VarA == null) {
                    zRemoveAfter = removeAfter(b0Var);
                } else if (a(c0Var, c0VarA)) {
                    updatedMediaPeriodInfo = c0VarA;
                } else {
                    zRemoveAfter = removeAfter(b0Var);
                }
                return !zRemoveAfter;
            }
            updatedMediaPeriodInfo = getUpdatedMediaPeriodInfo(y0Var, c0Var);
            next.f62622f = updatedMediaPeriodInfo.copyWithRequestedContentPositionUs(c0Var.f62649c);
            if (!a(c0Var.f62651e, updatedMediaPeriodInfo.f62651e)) {
                next.updateClipping();
                long j12 = updatedMediaPeriodInfo.f62651e;
                return (removeAfter(next) || (next == this.f62665i && !next.f62622f.f62652f && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j12 > C.TIME_UNSET ? 1 : (j12 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j12)) ? 1 : (j11 == ((j12 > C.TIME_UNSET ? 1 : (j12 == C.TIME_UNSET ? 0 : -1)) == 0 ? Long.MAX_VALUE : next.toRendererTime(j12)) ? 0 : -1)) >= 0))) ? false : true;
            }
            b0Var = next;
            next = next.getNext();
        }
        return true;
    }

    public boolean updateRepeatMode(y0 y0Var, int i10) {
        this.f62662f = i10;
        return a(y0Var);
    }

    public boolean updateShuffleModeEnabled(y0 y0Var, boolean z10) {
        this.f62663g = z10;
        return a(y0Var);
    }

    public final boolean a(long j10, long j11) {
        return j10 == C.TIME_UNSET || j10 == j11;
    }

    public final void a() {
        if (this.f62659c != null) {
            h1.a aVarBuilder = h1.builder();
            for (b0 next = this.f62664h; next != null; next = next.getNext()) {
                aVarBuilder.add((h1.a) next.f62622f.f62647a);
            }
            b0 b0Var = this.f62665i;
            this.f62660d.post(new io.bidmachine.media3.exoplayer.b1(this, 7, aVarBuilder, b0Var == null ? null : b0Var.f62622f.f62647a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(h1.a aVar, t.a aVar2) {
        this.f62659c.updateMediaPeriodQueueInfo(aVar.build(), aVar2);
    }

    public static t.a a(y0 y0Var, Object obj, long j10, long j11, y0.b bVar) {
        y0Var.getPeriodByUid(obj, bVar);
        int adGroupIndexForPositionUs = bVar.getAdGroupIndexForPositionUs(j10);
        if (adGroupIndexForPositionUs == -1) {
            return new t.a(obj, j11, bVar.getAdGroupIndexAfterPositionUs(j10));
        }
        return new t.a(obj, adGroupIndexForPositionUs, bVar.getFirstAdIndexToPlay(adGroupIndexForPositionUs), j11);
    }

    public final long a(y0 y0Var, Object obj) {
        int indexOfPeriod;
        int i10 = y0Var.getPeriodByUid(obj, this.f62657a).f63077c;
        Object obj2 = this.f62668l;
        if (obj2 != null && (indexOfPeriod = y0Var.getIndexOfPeriod(obj2)) != -1 && y0Var.getPeriod(indexOfPeriod, this.f62657a).f63077c == i10) {
            return this.f62669m;
        }
        for (b0 next = this.f62664h; next != null; next = next.getNext()) {
            if (next.f62618b.equals(obj)) {
                return next.f62622f.f62647a.f62450d;
            }
        }
        for (b0 next2 = this.f62664h; next2 != null; next2 = next2.getNext()) {
            int indexOfPeriod2 = y0Var.getIndexOfPeriod(next2.f62618b);
            if (indexOfPeriod2 != -1 && y0Var.getPeriod(indexOfPeriod2, this.f62657a).f63077c == i10) {
                return next2.f62622f.f62647a.f62450d;
            }
        }
        long j10 = this.f62661e;
        this.f62661e = 1 + j10;
        if (this.f62664h == null) {
            this.f62668l = obj;
            this.f62669m = j10;
        }
        return j10;
    }

    public final boolean a(c0 c0Var, c0 c0Var2) {
        return c0Var.f62648b == c0Var2.f62648b && c0Var.f62647a.equals(c0Var2.f62647a);
    }

    public final boolean a(y0 y0Var) {
        y0 y0Var2;
        b0 next = this.f62664h;
        if (next == null) {
            return true;
        }
        int indexOfPeriod = y0Var.getIndexOfPeriod(next.f62618b);
        while (true) {
            y0Var2 = y0Var;
            indexOfPeriod = y0Var2.getNextPeriodIndex(indexOfPeriod, this.f62657a, this.f62658b, this.f62662f, this.f62663g);
            while (next.getNext() != null && !next.f62622f.f62653g) {
                next = next.getNext();
            }
            b0 next2 = next.getNext();
            if (indexOfPeriod == -1 || next2 == null || y0Var2.getIndexOfPeriod(next2.f62618b) != indexOfPeriod) {
                break;
            }
            next = next2;
            y0Var = y0Var2;
        }
        boolean zRemoveAfter = removeAfter(next);
        next.f62622f = getUpdatedMediaPeriodInfo(y0Var2, next.f62622f);
        return !zRemoveAfter;
    }

    public final c0 a(j0 j0Var) {
        return a(j0Var.f62757a, j0Var.f62758b, j0Var.f62759c, j0Var.f62775s);
    }

    public final c0 a(y0 y0Var, b0 b0Var, long j10) {
        d0 d0Var;
        y0 y0Var2;
        Object obj;
        long j11;
        long j12;
        c0 c0Var = b0Var.f62622f;
        long rendererOffset = (b0Var.getRendererOffset() + c0Var.f62651e) - j10;
        boolean z10 = c0Var.f62653g;
        long j13 = C.TIME_UNSET;
        if (z10) {
            int nextPeriodIndex = y0Var.getNextPeriodIndex(y0Var.getIndexOfPeriod(c0Var.f62647a.f62447a), this.f62657a, this.f62658b, this.f62662f, this.f62663g);
            if (nextPeriodIndex == -1) {
                return null;
            }
            int i10 = y0Var.getPeriod(nextPeriodIndex, this.f62657a, true).f63077c;
            Object obj2 = this.f62657a.f63076b;
            long j14 = c0Var.f62647a.f62450d;
            if (y0Var.getWindow(i10, this.f62658b).f63104o == nextPeriodIndex) {
                Pair<Object, Long> periodPosition = y0Var.getPeriodPosition(this.f62658b, this.f62657a, i10, C.TIME_UNSET, Math.max(0L, rendererOffset));
                if (periodPosition == null) {
                    return null;
                }
                Object obj3 = periodPosition.first;
                long jLongValue = ((Long) periodPosition.second).longValue();
                b0 next = b0Var.getNext();
                if (next != null && next.f62618b.equals(obj3)) {
                    j12 = next.f62622f.f62647a.f62450d;
                } else {
                    j12 = this.f62661e;
                    this.f62661e = 1 + j12;
                }
                j14 = j12;
                obj = obj3;
                j11 = jLongValue;
            } else {
                obj = obj2;
                j11 = 0;
                j13 = 0;
            }
            return a(y0Var, a(y0Var, obj, j11, j14, this.f62657a), j13, j11);
        }
        t.a aVar = c0Var.f62647a;
        y0Var.getPeriodByUid(aVar.f62447a, this.f62657a);
        if (aVar.isAd()) {
            int i11 = aVar.f62448b;
            int adCountInAdGroup = this.f62657a.getAdCountInAdGroup(i11);
            if (adCountInAdGroup == -1) {
                return null;
            }
            int nextAdIndexToPlay = this.f62657a.getNextAdIndexToPlay(i11, aVar.f62449c);
            if (nextAdIndexToPlay < adCountInAdGroup) {
                return a(y0Var, aVar.f62447a, i11, nextAdIndexToPlay, c0Var.f62649c, aVar.f62450d);
            }
            long jLongValue2 = c0Var.f62649c;
            if (jLongValue2 == C.TIME_UNSET) {
                y0.d dVar = this.f62658b;
                y0.b bVar = this.f62657a;
                int i12 = bVar.f63077c;
                long jMax = Math.max(0L, rendererOffset);
                d0Var = this;
                y0Var2 = y0Var;
                Pair<Object, Long> periodPosition2 = y0Var2.getPeriodPosition(dVar, bVar, i12, C.TIME_UNSET, jMax);
                if (periodPosition2 == null) {
                    return null;
                }
                jLongValue2 = ((Long) periodPosition2.second).longValue();
            } else {
                d0Var = this;
                y0Var2 = y0Var;
            }
            return d0Var.a(y0Var2, aVar.f62447a, Math.max(d0Var.a(y0Var2, aVar.f62447a, aVar.f62448b), jLongValue2), c0Var.f62649c, aVar.f62450d);
        }
        int firstAdIndexToPlay = this.f62657a.getFirstAdIndexToPlay(aVar.f62451e);
        if (firstAdIndexToPlay == this.f62657a.getAdCountInAdGroup(aVar.f62451e)) {
            return a(y0Var, aVar.f62447a, a(y0Var, aVar.f62447a, aVar.f62451e), c0Var.f62651e, aVar.f62450d);
        }
        return a(y0Var, aVar.f62447a, aVar.f62451e, firstAdIndexToPlay, c0Var.f62651e, aVar.f62450d);
    }

    public final c0 a(y0 y0Var, t.a aVar, long j10, long j11) {
        y0Var.getPeriodByUid(aVar.f62447a, this.f62657a);
        if (aVar.isAd()) {
            return a(y0Var, aVar.f62447a, aVar.f62448b, aVar.f62449c, j10, aVar.f62450d);
        }
        return a(y0Var, aVar.f62447a, j11, j10, aVar.f62450d);
    }

    public final c0 a(y0 y0Var, Object obj, int i10, int i11, long j10, long j11) {
        t.a aVar = new t.a(obj, i10, i11, j11);
        long adDurationUs = y0Var.getPeriodByUid(aVar.f62447a, this.f62657a).getAdDurationUs(aVar.f62448b, aVar.f62449c);
        long adResumePositionUs = i11 == this.f62657a.getFirstAdIndexToPlay(i10) ? this.f62657a.getAdResumePositionUs() : 0L;
        boolean zIsServerSideInsertedAdGroup = this.f62657a.isServerSideInsertedAdGroup(aVar.f62448b);
        if (adDurationUs != C.TIME_UNSET && adResumePositionUs >= adDurationUs) {
            adResumePositionUs = Math.max(0L, adDurationUs - 1);
        }
        return new c0(aVar, adResumePositionUs, j10, C.TIME_UNSET, adDurationUs, zIsServerSideInsertedAdGroup, false, false, false);
    }

    public final c0 a(y0 y0Var, Object obj, long j10, long j11, long j12) {
        long jMax = j10;
        y0Var.getPeriodByUid(obj, this.f62657a);
        int adGroupIndexAfterPositionUs = this.f62657a.getAdGroupIndexAfterPositionUs(jMax);
        t.a aVar = new t.a(obj, j12, adGroupIndexAfterPositionUs);
        boolean zA = a(aVar);
        boolean zA2 = a(y0Var, aVar);
        boolean zA3 = a(y0Var, aVar, zA);
        boolean z10 = adGroupIndexAfterPositionUs != -1 && this.f62657a.isServerSideInsertedAdGroup(adGroupIndexAfterPositionUs);
        long adGroupTimeUs = adGroupIndexAfterPositionUs != -1 ? this.f62657a.getAdGroupTimeUs(adGroupIndexAfterPositionUs) : -9223372036854775807L;
        long j13 = (adGroupTimeUs == C.TIME_UNSET || adGroupTimeUs == Long.MIN_VALUE) ? this.f62657a.f63078d : adGroupTimeUs;
        if (j13 != C.TIME_UNSET && jMax >= j13) {
            jMax = Math.max(0L, j13 - 1);
        }
        return new c0(aVar, jMax, j11, adGroupTimeUs, j13, z10, zA, zA2, zA3);
    }

    public final boolean a(t.a aVar) {
        return !aVar.isAd() && aVar.f62451e == -1;
    }

    public final boolean a(y0 y0Var, t.a aVar) {
        if (a(aVar)) {
            return y0Var.getWindow(y0Var.getPeriodByUid(aVar.f62447a, this.f62657a).f63077c, this.f62658b).f63105p == y0Var.getIndexOfPeriod(aVar.f62447a);
        }
        return false;
    }

    public final boolean a(y0 y0Var, t.a aVar, boolean z10) {
        int indexOfPeriod = y0Var.getIndexOfPeriod(aVar.f62447a);
        return !y0Var.getWindow(y0Var.getPeriod(indexOfPeriod, this.f62657a).f63077c, this.f62658b).f63098i && y0Var.isLastPeriod(indexOfPeriod, this.f62657a, this.f62658b, this.f62662f, this.f62663g) && z10;
    }

    public final long a(y0 y0Var, Object obj, int i10) {
        y0Var.getPeriodByUid(obj, this.f62657a);
        long adGroupTimeUs = this.f62657a.getAdGroupTimeUs(i10);
        if (adGroupTimeUs == Long.MIN_VALUE) {
            return this.f62657a.f63078d;
        }
        return this.f62657a.getContentResumeOffsetUs(i10) + adGroupTimeUs;
    }
}

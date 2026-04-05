package io.odeeo.internal.a0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.a0.t;
import io.odeeo.internal.b.y0;
import io.odeeo.internal.b.z;
import io.odeeo.internal.u0.e2;
import io.odeeo.internal.u0.f2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends f<Integer> {

    /* renamed from: u, reason: collision with root package name */
    public static final io.odeeo.internal.b.z f62472u = new z.c().setMediaId("MergingMediaSource").build();

    /* renamed from: j, reason: collision with root package name */
    public final boolean f62473j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f62474k;

    /* renamed from: l, reason: collision with root package name */
    public final t[] f62475l;

    /* renamed from: m, reason: collision with root package name */
    public final y0[] f62476m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList<t> f62477n;

    /* renamed from: o, reason: collision with root package name */
    public final h f62478o;

    /* renamed from: p, reason: collision with root package name */
    public final Map<Object, Long> f62479p;

    /* renamed from: q, reason: collision with root package name */
    public final e2<Object, d> f62480q;

    /* renamed from: r, reason: collision with root package name */
    public int f62481r;

    /* renamed from: s, reason: collision with root package name */
    public long[][] f62482s;

    /* renamed from: t, reason: collision with root package name */
    public b f62483t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends l {

        /* renamed from: d, reason: collision with root package name */
        public final long[] f62484d;

        /* renamed from: e, reason: collision with root package name */
        public final long[] f62485e;

        public a(y0 y0Var, Map<Object, Long> map) {
            super(y0Var);
            int windowCount = y0Var.getWindowCount();
            this.f62485e = new long[y0Var.getWindowCount()];
            y0.d dVar = new y0.d();
            for (int i10 = 0; i10 < windowCount; i10++) {
                this.f62485e[i10] = y0Var.getWindow(i10, dVar).f63103n;
            }
            int periodCount = y0Var.getPeriodCount();
            this.f62484d = new long[periodCount];
            y0.b bVar = new y0.b();
            for (int i11 = 0; i11 < periodCount; i11++) {
                y0Var.getPeriod(i11, bVar, true);
                long jLongValue = ((Long) io.odeeo.internal.q0.a.checkNotNull(map.get(bVar.f63076b))).longValue();
                long[] jArr = this.f62484d;
                jLongValue = jLongValue == Long.MIN_VALUE ? bVar.f63078d : jLongValue;
                jArr[i11] = jLongValue;
                long j10 = bVar.f63078d;
                if (j10 != C.TIME_UNSET) {
                    long[] jArr2 = this.f62485e;
                    int i12 = bVar.f63077c;
                    jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
                }
            }
        }

        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        public y0.b getPeriod(int i10, y0.b bVar, boolean z10) {
            super.getPeriod(i10, bVar, z10);
            bVar.f63078d = this.f62484d[i10];
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // io.odeeo.internal.a0.l, io.odeeo.internal.b.y0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public io.odeeo.internal.b.y0.d getWindow(int r5, io.odeeo.internal.b.y0.d r6, long r7) {
            /*
                r4 = this;
                super.getWindow(r5, r6, r7)
                long[] r7 = r4.f62485e
                r0 = r7[r5]
                r6.f63103n = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f63102m
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f63102m
            L20:
                r6.f63102m = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.a0.x.a.getWindow(int, io.odeeo.internal.b.y0$d, long):io.odeeo.internal.b.y0$d");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f62486a;

        public b(int i10) {
            this.f62486a = i10;
        }
    }

    public x(t... tVarArr) {
        this(false, tVarArr);
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public r createPeriod(t.a aVar, io.odeeo.internal.p0.b bVar, long j10) {
        int length = this.f62475l.length;
        r[] rVarArr = new r[length];
        int indexOfPeriod = this.f62476m[0].getIndexOfPeriod(aVar.f62447a);
        for (int i10 = 0; i10 < length; i10++) {
            rVarArr[i10] = this.f62475l[i10].createPeriod(aVar.copyWithPeriodUid(this.f62476m[i10].getUidOfPeriod(indexOfPeriod)), bVar, j10 - this.f62482s[indexOfPeriod][i10]);
        }
        w wVar = new w(this.f62478o, this.f62482s[indexOfPeriod], rVarArr);
        if (!this.f62474k) {
            return wVar;
        }
        d dVar = new d(wVar, true, 0L, ((Long) io.odeeo.internal.q0.a.checkNotNull(this.f62479p.get(aVar.f62447a))).longValue());
        this.f62480q.put(aVar.f62447a, dVar);
        return dVar;
    }

    public final void d() {
        y0.b bVar = new y0.b();
        for (int i10 = 0; i10 < this.f62481r; i10++) {
            long j10 = -this.f62476m[0].getPeriod(i10, bVar).getPositionInWindowUs();
            int i11 = 1;
            while (true) {
                y0[] y0VarArr = this.f62476m;
                if (i11 < y0VarArr.length) {
                    this.f62482s[i10][i11] = j10 - (-y0VarArr[i11].getPeriod(i10, bVar).getPositionInWindowUs());
                    i11++;
                }
            }
        }
    }

    public final void e() {
        y0[] y0VarArr;
        y0.b bVar = new y0.b();
        for (int i10 = 0; i10 < this.f62481r; i10++) {
            int i11 = 0;
            long j10 = Long.MIN_VALUE;
            while (true) {
                y0VarArr = this.f62476m;
                if (i11 >= y0VarArr.length) {
                    break;
                }
                long durationUs = y0VarArr[i11].getPeriod(i10, bVar).getDurationUs();
                if (durationUs != C.TIME_UNSET) {
                    long j11 = durationUs + this.f62482s[i10][i11];
                    if (j10 == Long.MIN_VALUE || j11 < j10) {
                        j10 = j11;
                    }
                }
                i11++;
            }
            Object uidOfPeriod = y0VarArr[0].getUidOfPeriod(i10);
            this.f62479p.put(uidOfPeriod, Long.valueOf(j10));
            Iterator<d> it = this.f62480q.get(uidOfPeriod).iterator();
            while (it.hasNext()) {
                it.next().updateClipping(0L, j10);
            }
        }
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public io.odeeo.internal.b.z getMediaItem() {
        t[] tVarArr = this.f62475l;
        return tVarArr.length > 0 ? tVarArr[0].getMediaItem() : f62472u;
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        b bVar = this.f62483t;
        if (bVar != null) {
            throw bVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a
    public void prepareSourceInternal(io.odeeo.internal.p0.b0 b0Var) {
        super.prepareSourceInternal(b0Var);
        for (int i10 = 0; i10 < this.f62475l.length; i10++) {
            a((x) Integer.valueOf(i10), this.f62475l[i10]);
        }
    }

    @Override // io.odeeo.internal.a0.a, io.odeeo.internal.a0.t
    public void releasePeriod(r rVar) {
        if (this.f62474k) {
            d dVar = (d) rVar;
            Iterator<Map.Entry<Object, d>> it = this.f62480q.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, d> next = it.next();
                if (next.getValue().equals(dVar)) {
                    this.f62480q.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            rVar = dVar.f62277a;
        }
        w wVar = (w) rVar;
        int i10 = 0;
        while (true) {
            t[] tVarArr = this.f62475l;
            if (i10 >= tVarArr.length) {
                return;
            }
            tVarArr[i10].releasePeriod(wVar.getChildPeriod(i10));
            i10++;
        }
    }

    @Override // io.odeeo.internal.a0.f, io.odeeo.internal.a0.a
    public void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f62476m, (Object) null);
        this.f62481r = -1;
        this.f62483t = null;
        this.f62477n.clear();
        Collections.addAll(this.f62477n, this.f62475l);
    }

    public x(boolean z10, t... tVarArr) {
        this(z10, false, tVarArr);
    }

    @Override // io.odeeo.internal.a0.f
    public void a(Integer num, t tVar, y0 y0Var) {
        if (this.f62483t != null) {
            return;
        }
        if (this.f62481r == -1) {
            this.f62481r = y0Var.getPeriodCount();
        } else if (y0Var.getPeriodCount() != this.f62481r) {
            this.f62483t = new b(0);
            return;
        }
        if (this.f62482s.length == 0) {
            this.f62482s = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f62481r, this.f62476m.length);
        }
        this.f62477n.remove(tVar);
        this.f62476m[num.intValue()] = y0Var;
        if (this.f62477n.isEmpty()) {
            if (this.f62473j) {
                d();
            }
            y0 aVar = this.f62476m[0];
            if (this.f62474k) {
                e();
                aVar = new a(aVar, this.f62479p);
            }
            a(aVar);
        }
    }

    public x(boolean z10, boolean z11, t... tVarArr) {
        this(z10, z11, new i(), tVarArr);
    }

    public x(boolean z10, boolean z11, h hVar, t... tVarArr) {
        this.f62473j = z10;
        this.f62474k = z11;
        this.f62475l = tVarArr;
        this.f62478o = hVar;
        this.f62477n = new ArrayList<>(Arrays.asList(tVarArr));
        this.f62481r = -1;
        this.f62476m = new y0[tVarArr.length];
        this.f62482s = new long[0][];
        this.f62479p = new HashMap();
        this.f62480q = f2.hashKeys().arrayListValues().build();
    }

    @Override // io.odeeo.internal.a0.f
    public t.a a(Integer num, t.a aVar) {
        if (num.intValue() == 0) {
            return aVar;
        }
        return null;
    }
}

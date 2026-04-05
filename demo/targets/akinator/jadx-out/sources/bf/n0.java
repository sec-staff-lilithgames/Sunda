package bf;

import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import nh.c8;
import nh.yc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 extends i {

    /* renamed from: v, reason: collision with root package name */
    public static final u1 f9340v = new com.google.android.exoplayer2.h1().setMediaId("MergingMediaSource").build();

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9341k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f9342l;

    /* renamed from: m, reason: collision with root package name */
    public final f0[] f9343m;

    /* renamed from: n, reason: collision with root package name */
    public final m3[] f9344n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f9345o;

    /* renamed from: p, reason: collision with root package name */
    public final k f9346p;

    /* renamed from: q, reason: collision with root package name */
    public final HashMap f9347q;

    /* renamed from: r, reason: collision with root package name */
    public final c8 f9348r;

    /* renamed from: s, reason: collision with root package name */
    public int f9349s;

    /* renamed from: t, reason: collision with root package name */
    public long[][] f9350t;

    /* renamed from: u, reason: collision with root package name */
    public b f9351u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends q {

        /* renamed from: h, reason: collision with root package name */
        public final long[] f9352h;

        /* renamed from: i, reason: collision with root package name */
        public final long[] f9353i;

        public a(m3 m3Var, Map<Object, Long> map) {
            super(m3Var);
            int windowCount = m3Var.getWindowCount();
            this.f9353i = new long[m3Var.getWindowCount()];
            l3 l3Var = new l3();
            for (int i10 = 0; i10 < windowCount; i10++) {
                this.f9353i[i10] = m3Var.getWindow(i10, l3Var).f27660p;
            }
            int periodCount = m3Var.getPeriodCount();
            this.f9352h = new long[periodCount];
            k3 k3Var = new k3();
            for (int i11 = 0; i11 < periodCount; i11++) {
                m3Var.getPeriod(i11, k3Var, true);
                long jLongValue = ((Long) com.google.android.exoplayer2.util.a.checkNotNull(map.get(k3Var.f27597c))).longValue();
                long[] jArr = this.f9352h;
                jLongValue = jLongValue == Long.MIN_VALUE ? k3Var.f27599f : jLongValue;
                jArr[i11] = jLongValue;
                long j10 = k3Var.f27599f;
                if (j10 != C.TIME_UNSET) {
                    long[] jArr2 = this.f9353i;
                    int i12 = k3Var.f27598e;
                    jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
                }
            }
        }

        @Override // bf.q, com.google.android.exoplayer2.m3
        public k3 getPeriod(int i10, k3 k3Var, boolean z10) {
            super.getPeriod(i10, k3Var, z10);
            k3Var.f27599f = this.f9352h[i10];
            return k3Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // bf.q, com.google.android.exoplayer2.m3
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.google.android.exoplayer2.l3 getWindow(int r5, com.google.android.exoplayer2.l3 r6, long r7) {
            /*
                r4 = this;
                super.getWindow(r5, r6, r7)
                long[] r7 = r4.f9353i
                r0 = r7[r5]
                r6.f27660p = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f27659o
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f27659o
            L20:
                r6.f27659o = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: bf.n0.a.getWindow(int, com.google.android.exoplayer2.l3, long):com.google.android.exoplayer2.l3");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends IOException {
        public b(int i10) {
        }
    }

    public n0(f0... f0VarArr) {
        this(false, f0VarArr);
    }

    @Override // bf.a
    public final void c(qf.c1 c1Var) {
        this.f9270j = c1Var;
        this.f9269i = com.google.android.exoplayer2.util.n1.createHandlerForCurrentLooper();
        int i10 = 0;
        while (true) {
            f0[] f0VarArr = this.f9343m;
            if (i10 >= f0VarArr.length) {
                return;
            }
            i(Integer.valueOf(i10), f0VarArr[i10]);
            i10++;
        }
    }

    @Override // bf.i, bf.a, bf.f0
    public a0 createPeriod(d0 d0Var, qf.c cVar, long j10) {
        f0[] f0VarArr = this.f9343m;
        int length = f0VarArr.length;
        a0[] a0VarArr = new a0[length];
        m3[] m3VarArr = this.f9344n;
        m3 m3Var = m3VarArr[0];
        Object obj = d0Var.f9193a;
        int indexOfPeriod = m3Var.getIndexOfPeriod(obj);
        for (int i10 = 0; i10 < length; i10++) {
            a0VarArr[i10] = f0VarArr[i10].createPeriod(d0Var.copyWithPeriodUid(m3VarArr[i10].getUidOfPeriod(indexOfPeriod)), cVar, j10 - this.f9350t[indexOfPeriod][i10]);
        }
        m0 m0Var = new m0(this.f9346p, this.f9350t[indexOfPeriod], a0VarArr);
        if (!this.f9342l) {
            return m0Var;
        }
        d dVar = new d(m0Var, true, 0L, ((Long) com.google.android.exoplayer2.util.a.checkNotNull((Long) this.f9347q.get(obj))).longValue());
        this.f9348r.put(obj, dVar);
        return dVar;
    }

    @Override // bf.i
    public final d0 e(Object obj, d0 d0Var) {
        if (((Integer) obj).intValue() == 0) {
            return d0Var;
        }
        return null;
    }

    @Override // bf.i, bf.a, bf.f0
    public /* bridge */ /* synthetic */ m3 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // bf.i, bf.a, bf.f0
    public u1 getMediaItem() {
        f0[] f0VarArr = this.f9343m;
        return f0VarArr.length > 0 ? f0VarArr[0].getMediaItem() : f9340v;
    }

    @Override // bf.i
    public final void h(Object obj, f0 f0Var, m3 m3Var) {
        HashMap map;
        Integer num = (Integer) obj;
        if (this.f9351u != null) {
            return;
        }
        if (this.f9349s == -1) {
            this.f9349s = m3Var.getPeriodCount();
        } else if (m3Var.getPeriodCount() != this.f9349s) {
            this.f9351u = new b(0);
            return;
        }
        int length = this.f9350t.length;
        m3[] m3VarArr = this.f9344n;
        if (length == 0) {
            this.f9350t = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f9349s, m3VarArr.length);
        }
        ArrayList arrayList = this.f9345o;
        arrayList.remove(f0Var);
        m3VarArr[num.intValue()] = m3Var;
        if (arrayList.isEmpty()) {
            if (this.f9341k) {
                k3 k3Var = new k3();
                for (int i10 = 0; i10 < this.f9349s; i10++) {
                    long j10 = -m3VarArr[0].getPeriod(i10, k3Var).getPositionInWindowUs();
                    for (int i11 = 1; i11 < m3VarArr.length; i11++) {
                        this.f9350t[i10][i11] = j10 - (-m3VarArr[i11].getPeriod(i10, k3Var).getPositionInWindowUs());
                    }
                }
            }
            m3 aVar = m3VarArr[0];
            if (this.f9342l) {
                k3 k3Var2 = new k3();
                int i12 = 0;
                while (true) {
                    int i13 = this.f9349s;
                    map = this.f9347q;
                    if (i12 >= i13) {
                        break;
                    }
                    long j11 = Long.MIN_VALUE;
                    for (int i14 = 0; i14 < m3VarArr.length; i14++) {
                        long durationUs = m3VarArr[i14].getPeriod(i12, k3Var2).getDurationUs();
                        if (durationUs != C.TIME_UNSET) {
                            long j12 = durationUs + this.f9350t[i12][i14];
                            if (j11 == Long.MIN_VALUE || j12 < j11) {
                                j11 = j12;
                            }
                        }
                    }
                    Object uidOfPeriod = m3VarArr[0].getUidOfPeriod(i12);
                    map.put(uidOfPeriod, Long.valueOf(j11));
                    Iterator<Object> it = this.f9348r.get(uidOfPeriod).iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).updateClipping(0L, j11);
                    }
                    i12++;
                }
                aVar = new a(aVar, map);
            }
            d(aVar);
        }
    }

    @Override // bf.i, bf.a, bf.f0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // bf.i, bf.a, bf.f0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        b bVar = this.f9351u;
        if (bVar != null) {
            throw bVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // bf.i, bf.a, bf.f0
    public void releasePeriod(a0 a0Var) {
        if (this.f9342l) {
            d dVar = (d) a0Var;
            c8 c8Var = this.f9348r;
            Iterator<Map.Entry<Object, Object>> it = c8Var.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, Object> next = it.next();
                if (((d) next.getValue()).equals(dVar)) {
                    c8Var.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            a0Var = dVar.f9201b;
        }
        m0 m0Var = (m0) a0Var;
        int i10 = 0;
        while (true) {
            f0[] f0VarArr = this.f9343m;
            if (i10 >= f0VarArr.length) {
                return;
            }
            f0VarArr[i10].releasePeriod(m0Var.getChildPeriod(i10));
            i10++;
        }
    }

    @Override // bf.i, bf.a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f9344n, (Object) null);
        this.f9349s = -1;
        this.f9351u = null;
        ArrayList arrayList = this.f9345o;
        arrayList.clear();
        Collections.addAll(arrayList, this.f9343m);
    }

    public n0(boolean z10, f0... f0VarArr) {
        this(z10, false, f0VarArr);
    }

    public n0(boolean z10, boolean z11, f0... f0VarArr) {
        this(z10, z11, new l(), f0VarArr);
    }

    public n0(boolean z10, boolean z11, k kVar, f0... f0VarArr) {
        this.f9341k = z10;
        this.f9342l = z11;
        this.f9343m = f0VarArr;
        this.f9346p = kVar;
        this.f9345o = new ArrayList(Arrays.asList(f0VarArr));
        this.f9349s = -1;
        this.f9344n = new m3[f0VarArr.length];
        this.f9350t = new long[0][];
        this.f9347q = new HashMap();
        this.f9348r = yc.hashKeys().arrayListValues().build();
    }
}

package ao;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nh.c8;
import nh.yc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w0 extends j {

    /* renamed from: w, reason: collision with root package name */
    public static final gn.p0 f7869w = new gn.c0().setMediaId("MergingMediaSource").build();

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7870k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7871l;

    /* renamed from: m, reason: collision with root package name */
    public final m0[] f7872m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7873n;

    /* renamed from: o, reason: collision with root package name */
    public final gn.u1[] f7874o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f7875p;

    /* renamed from: q, reason: collision with root package name */
    public final l f7876q;

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f7877r;

    /* renamed from: s, reason: collision with root package name */
    public final c8 f7878s;

    /* renamed from: t, reason: collision with root package name */
    public int f7879t;

    /* renamed from: u, reason: collision with root package name */
    public long[][] f7880u;

    /* renamed from: v, reason: collision with root package name */
    public b f7881v;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends y {

        /* renamed from: f, reason: collision with root package name */
        public final long[] f7882f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f7883g;

        public a(gn.u1 u1Var, Map<Object, Long> map) {
            super(u1Var);
            int windowCount = u1Var.getWindowCount();
            this.f7883g = new long[u1Var.getWindowCount()];
            gn.t1 t1Var = new gn.t1();
            for (int i10 = 0; i10 < windowCount; i10++) {
                this.f7883g[i10] = u1Var.getWindow(i10, t1Var).f58187m;
            }
            int periodCount = u1Var.getPeriodCount();
            this.f7882f = new long[periodCount];
            gn.r1 r1Var = new gn.r1();
            for (int i11 = 0; i11 < periodCount; i11++) {
                u1Var.getPeriod(i11, r1Var, true);
                long jLongValue = ((Long) io.bidmachine.media3.common.util.a.checkNotNull(map.get(r1Var.f58109b))).longValue();
                long[] jArr = this.f7882f;
                jLongValue = jLongValue == Long.MIN_VALUE ? r1Var.f58111d : jLongValue;
                jArr[i11] = jLongValue;
                long j10 = r1Var.f58111d;
                if (j10 != C.TIME_UNSET) {
                    long[] jArr2 = this.f7883g;
                    int i12 = r1Var.f58110c;
                    jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
                }
            }
        }

        @Override // ao.y, gn.u1
        public gn.r1 getPeriod(int i10, gn.r1 r1Var, boolean z10) {
            super.getPeriod(i10, r1Var, z10);
            r1Var.f58111d = this.f7882f[i10];
            return r1Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        @Override // ao.y, gn.u1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public gn.t1 getWindow(int r5, gn.t1 r6, long r7) {
            /*
                r4 = this;
                super.getWindow(r5, r6, r7)
                long[] r7 = r4.f7883g
                r0 = r7[r5]
                r6.f58187m = r0
                r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
                if (r5 == 0) goto L1e
                long r2 = r6.f58186l
                int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                if (r5 != 0) goto L19
                goto L1e
            L19:
                long r7 = java.lang.Math.min(r2, r0)
                goto L20
            L1e:
                long r7 = r6.f58186l
            L20:
                r6.f58186l = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ao.w0.a.getWindow(int, gn.t1, long):gn.t1");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends IOException {
        public b(int i10) {
        }
    }

    public w0(m0... m0VarArr) {
        this(false, m0VarArr);
    }

    @Override // ao.j, ao.a, ao.m0
    public boolean canUpdateMediaItem(gn.p0 p0Var) {
        m0[] m0VarArr = this.f7872m;
        return m0VarArr.length > 0 && m0VarArr[0].canUpdateMediaItem(p0Var);
    }

    @Override // ao.j, ao.a, ao.m0
    public i0 createPeriod(k0 k0Var, go.c cVar, long j10) {
        m0[] m0VarArr = this.f7872m;
        int length = m0VarArr.length;
        i0[] i0VarArr = new i0[length];
        gn.u1[] u1VarArr = this.f7874o;
        gn.u1 u1Var = u1VarArr[0];
        Object obj = k0Var.f7718a;
        int indexOfPeriod = u1Var.getIndexOfPeriod(obj);
        for (int i10 = 0; i10 < length; i10++) {
            k0 k0VarCopyWithPeriodUid = k0Var.copyWithPeriodUid(u1VarArr[i10].getUidOfPeriod(indexOfPeriod));
            i0VarArr[i10] = m0VarArr[i10].createPeriod(k0VarCopyWithPeriodUid, cVar, j10 - this.f7880u[indexOfPeriod][i10]);
            ((List) this.f7873n.get(i10)).add(new x0(k0VarCopyWithPeriodUid, i0VarArr[i10]));
        }
        v0 v0Var = new v0(this.f7876q, this.f7880u[indexOfPeriod], i0VarArr);
        if (!this.f7871l) {
            return v0Var;
        }
        e eVar = new e(v0Var, false, 0L, ((Long) io.bidmachine.media3.common.util.a.checkNotNull((Long) this.f7877r.get(obj))).longValue());
        this.f7878s.put(obj, eVar);
        return eVar;
    }

    @Override // ao.a
    public final void e(ln.g0 g0Var) {
        this.f7702j = g0Var;
        this.f7701i = io.bidmachine.media3.common.util.a1.createHandlerForCurrentLooper();
        int i10 = 0;
        while (true) {
            m0[] m0VarArr = this.f7872m;
            if (i10 >= m0VarArr.length) {
                return;
            }
            k(Integer.valueOf(i10), m0VarArr[i10]);
            i10++;
        }
    }

    @Override // ao.j
    public final k0 g(Object obj, k0 k0Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f7873n;
        List list = (List) arrayList.get(iIntValue);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((x0) list.get(i10)).f7892a.equals(k0Var)) {
                return ((x0) ((List) arrayList.get(0)).get(i10)).f7892a;
            }
        }
        return null;
    }

    @Override // ao.j, ao.a, ao.m0
    public /* bridge */ /* synthetic */ gn.u1 getInitialTimeline() {
        return super.getInitialTimeline();
    }

    @Override // ao.j, ao.a, ao.m0
    public gn.p0 getMediaItem() {
        m0[] m0VarArr = this.f7872m;
        return m0VarArr.length > 0 ? m0VarArr[0].getMediaItem() : f7869w;
    }

    @Override // ao.j, ao.a, ao.m0
    public /* bridge */ /* synthetic */ boolean isSingleWindow() {
        return super.isSingleWindow();
    }

    @Override // ao.j
    public final void j(Object obj, m0 m0Var, gn.u1 u1Var) {
        HashMap map;
        Integer num = (Integer) obj;
        if (this.f7881v != null) {
            return;
        }
        if (this.f7879t == -1) {
            this.f7879t = u1Var.getPeriodCount();
        } else if (u1Var.getPeriodCount() != this.f7879t) {
            this.f7881v = new b(0);
            return;
        }
        int length = this.f7880u.length;
        gn.u1[] u1VarArr = this.f7874o;
        if (length == 0) {
            this.f7880u = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f7879t, u1VarArr.length);
        }
        ArrayList arrayList = this.f7875p;
        arrayList.remove(m0Var);
        u1VarArr[num.intValue()] = u1Var;
        if (arrayList.isEmpty()) {
            if (this.f7870k) {
                gn.r1 r1Var = new gn.r1();
                for (int i10 = 0; i10 < this.f7879t; i10++) {
                    long j10 = -u1VarArr[0].getPeriod(i10, r1Var).getPositionInWindowUs();
                    for (int i11 = 1; i11 < u1VarArr.length; i11++) {
                        this.f7880u[i10][i11] = j10 - (-u1VarArr[i11].getPeriod(i10, r1Var).getPositionInWindowUs());
                    }
                }
            }
            gn.u1 aVar = u1VarArr[0];
            if (this.f7871l) {
                gn.r1 r1Var2 = new gn.r1();
                int i12 = 0;
                while (true) {
                    int i13 = this.f7879t;
                    map = this.f7877r;
                    if (i12 >= i13) {
                        break;
                    }
                    long j11 = Long.MIN_VALUE;
                    for (int i14 = 0; i14 < u1VarArr.length; i14++) {
                        long durationUs = u1VarArr[i14].getPeriod(i12, r1Var2).getDurationUs();
                        if (durationUs != C.TIME_UNSET) {
                            long j12 = durationUs + this.f7880u[i12][i14];
                            if (j11 == Long.MIN_VALUE || j12 < j11) {
                                j11 = j12;
                            }
                        }
                    }
                    Object uidOfPeriod = u1VarArr[0].getUidOfPeriod(i12);
                    map.put(uidOfPeriod, Long.valueOf(j11));
                    Iterator<Object> it = this.f7878s.get(uidOfPeriod).iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).updateClipping(0L, j11);
                    }
                    i12++;
                }
                aVar = new a(aVar, map);
            }
            f(aVar);
        }
    }

    @Override // ao.j, ao.a, ao.m0
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        b bVar = this.f7881v;
        if (bVar != null) {
            throw bVar;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // ao.j, ao.a, ao.m0
    public void releasePeriod(i0 i0Var) {
        if (this.f7871l) {
            e eVar = (e) i0Var;
            c8 c8Var = this.f7878s;
            Iterator<Map.Entry<Object, Object>> it = c8Var.entries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Object, Object> next = it.next();
                if (((e) next.getValue()).equals(eVar)) {
                    c8Var.remove(next.getKey(), next.getValue());
                    break;
                }
            }
            i0Var = eVar.f7614b;
        }
        v0 v0Var = (v0) i0Var;
        int i10 = 0;
        while (true) {
            m0[] m0VarArr = this.f7872m;
            if (i10 >= m0VarArr.length) {
                return;
            }
            List list = (List) this.f7873n.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                if (((x0) list.get(i11)).f7893b.equals(i0Var)) {
                    list.remove(i11);
                    break;
                }
                i11++;
            }
            m0VarArr[i10].releasePeriod(v0Var.getChildPeriod(i10));
            i10++;
        }
    }

    @Override // ao.j, ao.a
    public final void releaseSourceInternal() {
        super.releaseSourceInternal();
        Arrays.fill(this.f7874o, (Object) null);
        this.f7879t = -1;
        this.f7881v = null;
        ArrayList arrayList = this.f7875p;
        arrayList.clear();
        Collections.addAll(arrayList, this.f7872m);
    }

    @Override // ao.j, ao.a, ao.m0
    public void updateMediaItem(gn.p0 p0Var) {
        this.f7872m[0].updateMediaItem(p0Var);
    }

    public w0(boolean z10, m0... m0VarArr) {
        this(z10, false, m0VarArr);
    }

    public w0(boolean z10, boolean z11, m0... m0VarArr) {
        this(z10, z11, new m(), m0VarArr);
    }

    public w0(boolean z10, boolean z11, l lVar, m0... m0VarArr) {
        this.f7870k = z10;
        this.f7871l = z11;
        this.f7872m = m0VarArr;
        this.f7876q = lVar;
        this.f7875p = new ArrayList(Arrays.asList(m0VarArr));
        this.f7879t = -1;
        this.f7873n = new ArrayList(m0VarArr.length);
        for (int i10 = 0; i10 < m0VarArr.length; i10++) {
            this.f7873n.add(new ArrayList());
        }
        this.f7874o = new gn.u1[m0VarArr.length];
        this.f7880u = new long[0][];
        this.f7877r = new HashMap();
        this.f7878s = yc.hashKeys().arrayListValues().build();
    }
}

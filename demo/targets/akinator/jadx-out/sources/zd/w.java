package zd;

import bf.d0;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.util.n1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w implements b0 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.android.exoplayer2.w f97886i = new com.google.android.exoplayer2.w(5);

    /* renamed from: j, reason: collision with root package name */
    public static final Random f97887j = new Random();

    /* renamed from: a, reason: collision with root package name */
    public final l3 f97888a;

    /* renamed from: b, reason: collision with root package name */
    public final k3 f97889b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f97890c;

    /* renamed from: d, reason: collision with root package name */
    public final v2 f97891d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f97892e;

    /* renamed from: f, reason: collision with root package name */
    public m3 f97893f;

    /* renamed from: g, reason: collision with root package name */
    public String f97894g;

    /* renamed from: h, reason: collision with root package name */
    public long f97895h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f97896a;

        /* renamed from: b, reason: collision with root package name */
        public int f97897b;

        /* renamed from: c, reason: collision with root package name */
        public long f97898c;

        /* renamed from: d, reason: collision with root package name */
        public final d0 f97899d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f97900e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f97901f;

        public a(String str, int i10, d0 d0Var) {
            this.f97896a = str;
            this.f97897b = i10;
            this.f97898c = d0Var == null ? -1L : d0Var.f9196d;
            if (d0Var == null || !d0Var.isAd()) {
                return;
            }
            this.f97899d = d0Var;
        }

        public boolean belongsToSession(int i10, d0 d0Var) {
            if (d0Var == null) {
                return i10 == this.f97897b;
            }
            long j10 = d0Var.f9196d;
            d0 d0Var2 = this.f97899d;
            return d0Var2 == null ? !d0Var.isAd() && j10 == this.f97898c : j10 == d0Var2.f9196d && d0Var.f9194b == d0Var2.f9194b && d0Var.f9195c == d0Var2.f9195c;
        }

        public boolean isFinishedAtEventTime(b bVar) {
            d0 d0Var = bVar.f97800d;
            m3 m3Var = bVar.f97798b;
            d0 d0Var2 = bVar.f97800d;
            if (d0Var == null) {
                return this.f97897b != bVar.f97799c;
            }
            long j10 = this.f97898c;
            if (j10 == -1) {
                return false;
            }
            if (d0Var.f9196d > j10) {
                return true;
            }
            d0 d0Var3 = this.f97899d;
            if (d0Var3 == null) {
                return false;
            }
            int indexOfPeriod = m3Var.getIndexOfPeriod(d0Var.f9193a);
            int indexOfPeriod2 = m3Var.getIndexOfPeriod(d0Var3.f9193a);
            if (d0Var2.f9196d < d0Var3.f9196d || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!d0Var2.isAd()) {
                int i10 = d0Var2.f9197e;
                return i10 == -1 || i10 > d0Var3.f9194b;
            }
            int i11 = d0Var2.f9194b;
            int i12 = d0Var2.f9195c;
            int i13 = d0Var3.f9194b;
            return i11 > i13 || (i11 == i13 && i12 > d0Var3.f9195c);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void maybeSetWindowSequenceNumber(int r7, bf.d0 r8) {
            /*
                r6 = this;
                long r0 = r6.f97898c
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L33
                int r0 = r6.f97897b
                if (r7 != r0) goto L33
                if (r8 == 0) goto L33
                long r7 = r8.f9196d
                com.google.android.exoplayer2.w r0 = zd.w.f97886i
                zd.w r0 = zd.w.this
                java.util.HashMap r1 = r0.f97890c
                java.lang.String r4 = r0.f97894g
                java.lang.Object r1 = r1.get(r4)
                zd.w$a r1 = (zd.w.a) r1
                if (r1 == 0) goto L27
                long r4 = r1.f97898c
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 == 0) goto L27
                goto L2d
            L27:
                long r0 = r0.f97895h
                r2 = 1
                long r4 = r0 + r2
            L2d:
                int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r0 < 0) goto L33
                r6.f97898c = r7
            L33:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: zd.w.a.maybeSetWindowSequenceNumber(int, bf.d0):void");
        }

        public boolean tryResolvingToNewTimeline(m3 m3Var, m3 m3Var2) {
            int i10 = this.f97897b;
            if (i10 < m3Var.getWindowCount()) {
                w wVar = w.this;
                l3 l3Var = wVar.f97888a;
                l3 l3Var2 = wVar.f97888a;
                m3Var.getWindow(i10, l3Var);
                for (int i11 = l3Var2.f27661q; i11 <= l3Var2.f27662r; i11++) {
                    int indexOfPeriod = m3Var2.getIndexOfPeriod(m3Var.getUidOfPeriod(i11));
                    if (indexOfPeriod != -1) {
                        i10 = m3Var2.getPeriod(indexOfPeriod, wVar.f97889b).f27598e;
                        break;
                    }
                }
                i10 = -1;
            } else if (i10 >= m3Var2.getWindowCount()) {
                i10 = -1;
            }
            this.f97897b = i10;
            if (i10 == -1) {
                return false;
            }
            d0 d0Var = this.f97899d;
            return d0Var == null || m3Var2.getIndexOfPeriod(d0Var.f9193a) != -1;
        }
    }

    public w() {
        this(f97886i);
    }

    public final void a(a aVar) {
        long j10 = aVar.f97898c;
        if (j10 != -1) {
            this.f97895h = j10;
        }
        this.f97894g = null;
    }

    public final a b(int i10, d0 d0Var) {
        HashMap map = this.f97890c;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : map.values()) {
            aVar2.maybeSetWindowSequenceNumber(i10, d0Var);
            if (aVar2.belongsToSession(i10, d0Var)) {
                long j11 = aVar2.f97898c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) n1.castNonNull(aVar)).f97899d != null && aVar2.f97899d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f97891d.get();
        a aVar3 = new a(str, i10, d0Var);
        map.put(str, aVar3);
        return aVar3;
    }

    @Override // zd.b0
    public synchronized boolean belongsToSession(b bVar, String str) {
        a aVar = (a) this.f97890c.get(str);
        if (aVar == null) {
            return false;
        }
        aVar.maybeSetWindowSequenceNumber(bVar.f97799c, bVar.f97800d);
        return aVar.belongsToSession(bVar.f97799c, bVar.f97800d);
    }

    public final void c(b bVar) {
        d0 d0Var;
        m3 m3Var = bVar.f97798b;
        int i10 = bVar.f97799c;
        d0 d0Var2 = bVar.f97800d;
        boolean zIsEmpty = m3Var.isEmpty();
        HashMap map = this.f97890c;
        if (zIsEmpty) {
            String str = this.f97894g;
            if (str != null) {
                a((a) com.google.android.exoplayer2.util.a.checkNotNull((a) map.get(str)));
                return;
            }
            return;
        }
        a aVar = (a) map.get(this.f97894g);
        String str2 = b(i10, d0Var2).f97896a;
        this.f97894g = str2;
        updateSessions(bVar);
        if (d0Var2 == null || !d0Var2.isAd()) {
            return;
        }
        if (aVar != null && aVar.f97898c == d0Var2.f9196d && (d0Var = aVar.f97899d) != null && d0Var.f9194b == d0Var2.f9194b && d0Var.f9195c == d0Var2.f9195c) {
            return;
        }
        ((z) this.f97892e).onAdPlaybackStarted(bVar, b(i10, new d0(d0Var2.f9193a, d0Var2.f9196d)).f97896a, str2);
    }

    @Override // zd.b0
    public synchronized void finishAllSessions(b bVar) {
        a0 a0Var;
        try {
            String str = this.f97894g;
            if (str != null) {
                a((a) com.google.android.exoplayer2.util.a.checkNotNull((a) this.f97890c.get(str)));
            }
            Iterator it = this.f97890c.values().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                it.remove();
                if (aVar.f97900e && (a0Var = this.f97892e) != null) {
                    ((z) a0Var).onSessionFinished(bVar, aVar.f97896a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // zd.b0
    public synchronized String getActiveSessionId() {
        return this.f97894g;
    }

    @Override // zd.b0
    public synchronized String getSessionForMediaPeriodId(m3 m3Var, d0 d0Var) {
        return b(m3Var.getPeriodByUid(d0Var.f9193a, this.f97889b).f27598e, d0Var).f97896a;
    }

    @Override // zd.b0
    public void setListener(a0 a0Var) {
        this.f97892e = a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:12:0x0028, B:21:0x003a, B:23:0x0046, B:25:0x004c, B:15:0x002f, B:31:0x0057, B:33:0x0063, B:34:0x0067, B:36:0x006c, B:38:0x0072, B:40:0x0089, B:41:0x00db, B:43:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x00f9), top: B:53:0x0005 }] */
    @Override // zd.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void updateSessions(zd.b r23) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd.w.updateSessions(zd.b):void");
    }

    @Override // zd.b0
    public synchronized void updateSessionsWithDiscontinuity(b bVar, int i10) {
        try {
            com.google.android.exoplayer2.util.a.checkNotNull(this.f97892e);
            boolean z10 = i10 == 0;
            Iterator it = this.f97890c.values().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.isFinishedAtEventTime(bVar)) {
                    it.remove();
                    if (aVar.f97900e) {
                        boolean zEquals = aVar.f97896a.equals(this.f97894g);
                        boolean z11 = z10 && zEquals && aVar.f97901f;
                        if (zEquals) {
                            a(aVar);
                        }
                        ((z) this.f97892e).onSessionFinished(bVar, aVar.f97896a, z11);
                    }
                }
            }
            c(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // zd.b0
    public synchronized void updateSessionsWithTimelineChange(b bVar) {
        try {
            com.google.android.exoplayer2.util.a.checkNotNull(this.f97892e);
            m3 m3Var = this.f97893f;
            this.f97893f = bVar.f97798b;
            Iterator it = this.f97890c.values().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (!aVar.tryResolvingToNewTimeline(m3Var, this.f97893f) || aVar.isFinishedAtEventTime(bVar)) {
                    it.remove();
                    if (aVar.f97900e) {
                        if (aVar.f97896a.equals(this.f97894g)) {
                            a(aVar);
                        }
                        ((z) this.f97892e).onSessionFinished(bVar, aVar.f97896a, false);
                    }
                }
            }
            c(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public w(v2 v2Var) {
        this.f97891d = v2Var;
        this.f97888a = new l3();
        this.f97889b = new k3();
        this.f97890c = new HashMap();
        this.f97893f = m3.f27695b;
        this.f97895h = -1L;
    }
}

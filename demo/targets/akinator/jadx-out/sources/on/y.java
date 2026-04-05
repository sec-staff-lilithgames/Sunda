package on;

import ao.k0;
import gn.r1;
import gn.t1;
import gn.u1;
import io.bidmachine.media3.common.util.a1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y implements e0 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.android.exoplayer2.w f79701i = new com.google.android.exoplayer2.w(4);

    /* renamed from: j, reason: collision with root package name */
    public static final Random f79702j = new Random();

    /* renamed from: a, reason: collision with root package name */
    public final t1 f79703a;

    /* renamed from: b, reason: collision with root package name */
    public final r1 f79704b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f79705c;

    /* renamed from: d, reason: collision with root package name */
    public final v2 f79706d;

    /* renamed from: e, reason: collision with root package name */
    public d0 f79707e;

    /* renamed from: f, reason: collision with root package name */
    public u1 f79708f;

    /* renamed from: g, reason: collision with root package name */
    public String f79709g;

    /* renamed from: h, reason: collision with root package name */
    public long f79710h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f79711a;

        /* renamed from: b, reason: collision with root package name */
        public int f79712b;

        /* renamed from: c, reason: collision with root package name */
        public long f79713c;

        /* renamed from: d, reason: collision with root package name */
        public final k0 f79714d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f79715e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f79716f;

        public a(String str, int i10, k0 k0Var) {
            this.f79711a = str;
            this.f79712b = i10;
            this.f79713c = k0Var == null ? -1L : k0Var.f7721d;
            if (k0Var == null || !k0Var.isAd()) {
                return;
            }
            this.f79714d = k0Var;
        }

        public boolean belongsToSession(int i10, k0 k0Var) {
            if (k0Var == null) {
                return i10 == this.f79712b;
            }
            long j10 = k0Var.f7721d;
            k0 k0Var2 = this.f79714d;
            return k0Var2 == null ? !k0Var.isAd() && j10 == this.f79713c : j10 == k0Var2.f7721d && k0Var.f7719b == k0Var2.f7719b && k0Var.f7720c == k0Var2.f7720c;
        }

        public boolean isFinishedAtEventTime(b bVar) {
            k0 k0Var = bVar.f79579d;
            u1 u1Var = bVar.f79577b;
            k0 k0Var2 = bVar.f79579d;
            if (k0Var == null) {
                return this.f79712b != bVar.f79578c;
            }
            long j10 = this.f79713c;
            if (j10 == -1) {
                return false;
            }
            if (k0Var.f7721d > j10) {
                return true;
            }
            k0 k0Var3 = this.f79714d;
            if (k0Var3 == null) {
                return false;
            }
            int indexOfPeriod = u1Var.getIndexOfPeriod(k0Var.f7718a);
            int indexOfPeriod2 = u1Var.getIndexOfPeriod(k0Var3.f7718a);
            if (k0Var2.f7721d < k0Var3.f7721d || indexOfPeriod < indexOfPeriod2) {
                return false;
            }
            if (indexOfPeriod > indexOfPeriod2) {
                return true;
            }
            if (!k0Var2.isAd()) {
                int i10 = k0Var2.f7722e;
                return i10 == -1 || i10 > k0Var3.f7719b;
            }
            int i11 = k0Var2.f7719b;
            int i12 = k0Var2.f7720c;
            int i13 = k0Var3.f7719b;
            return i11 > i13 || (i11 == i13 && i12 > k0Var3.f7720c);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void maybeSetWindowSequenceNumber(int r7, ao.k0 r8) {
            /*
                r6 = this;
                long r0 = r6.f79713c
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L33
                int r0 = r6.f79712b
                if (r7 != r0) goto L33
                if (r8 == 0) goto L33
                long r7 = r8.f7721d
                com.google.android.exoplayer2.w r0 = on.y.f79701i
                on.y r0 = on.y.this
                java.util.HashMap r1 = r0.f79705c
                java.lang.String r4 = r0.f79709g
                java.lang.Object r1 = r1.get(r4)
                on.y$a r1 = (on.y.a) r1
                if (r1 == 0) goto L27
                long r4 = r1.f79713c
                int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r1 == 0) goto L27
                goto L2d
            L27:
                long r0 = r0.f79710h
                r2 = 1
                long r4 = r0 + r2
            L2d:
                int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r0 < 0) goto L33
                r6.f79713c = r7
            L33:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: on.y.a.maybeSetWindowSequenceNumber(int, ao.k0):void");
        }

        public boolean tryResolvingToNewTimeline(u1 u1Var, u1 u1Var2) {
            int i10 = this.f79712b;
            if (i10 < u1Var.getWindowCount()) {
                y yVar = y.this;
                t1 t1Var = yVar.f79703a;
                t1 t1Var2 = yVar.f79703a;
                u1Var.getWindow(i10, t1Var);
                for (int i11 = t1Var2.f58188n; i11 <= t1Var2.f58189o; i11++) {
                    int indexOfPeriod = u1Var2.getIndexOfPeriod(u1Var.getUidOfPeriod(i11));
                    if (indexOfPeriod != -1) {
                        i10 = u1Var2.getPeriod(indexOfPeriod, yVar.f79704b).f58110c;
                        break;
                    }
                }
                i10 = -1;
            } else if (i10 >= u1Var2.getWindowCount()) {
                i10 = -1;
            }
            this.f79712b = i10;
            if (i10 == -1) {
                return false;
            }
            k0 k0Var = this.f79714d;
            return k0Var == null || u1Var2.getIndexOfPeriod(k0Var.f7718a) != -1;
        }
    }

    public y() {
        this(f79701i);
    }

    public final void a(a aVar) {
        long j10 = aVar.f79713c;
        if (j10 != -1) {
            this.f79710h = j10;
        }
        this.f79709g = null;
    }

    public final a b(int i10, k0 k0Var) {
        HashMap map = this.f79705c;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : map.values()) {
            aVar2.maybeSetWindowSequenceNumber(i10, k0Var);
            if (aVar2.belongsToSession(i10, k0Var)) {
                long j11 = aVar2.f79713c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) a1.castNonNull(aVar)).f79714d != null && aVar2.f79714d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f79706d.get();
        a aVar3 = new a(str, i10, k0Var);
        map.put(str, aVar3);
        return aVar3;
    }

    @Override // on.e0
    public synchronized boolean belongsToSession(b bVar, String str) {
        a aVar = (a) this.f79705c.get(str);
        if (aVar == null) {
            return false;
        }
        aVar.maybeSetWindowSequenceNumber(bVar.f79578c, bVar.f79579d);
        return aVar.belongsToSession(bVar.f79578c, bVar.f79579d);
    }

    public final void c(b bVar) {
        k0 k0Var;
        u1 u1Var = bVar.f79577b;
        int i10 = bVar.f79578c;
        k0 k0Var2 = bVar.f79579d;
        boolean zIsEmpty = u1Var.isEmpty();
        HashMap map = this.f79705c;
        if (zIsEmpty) {
            String str = this.f79709g;
            if (str != null) {
                a((a) io.bidmachine.media3.common.util.a.checkNotNull((a) map.get(str)));
                return;
            }
            return;
        }
        a aVar = (a) map.get(this.f79709g);
        String str2 = b(i10, k0Var2).f79711a;
        this.f79709g = str2;
        updateSessions(bVar);
        if (k0Var2 == null || !k0Var2.isAd()) {
            return;
        }
        if (aVar != null && aVar.f79713c == k0Var2.f7721d && (k0Var = aVar.f79714d) != null && k0Var.f7719b == k0Var2.f7719b && k0Var.f7720c == k0Var2.f7720c) {
            return;
        }
        ((c0) this.f79707e).onAdPlaybackStarted(bVar, b(i10, new k0(k0Var2.f7718a, k0Var2.f7721d)).f79711a, str2);
    }

    @Override // on.e0
    public synchronized void finishAllSessions(b bVar) {
        d0 d0Var;
        try {
            String str = this.f79709g;
            if (str != null) {
                a((a) io.bidmachine.media3.common.util.a.checkNotNull((a) this.f79705c.get(str)));
            }
            Iterator it = this.f79705c.values().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                it.remove();
                if (aVar.f79715e && (d0Var = this.f79707e) != null) {
                    ((c0) d0Var).onSessionFinished(bVar, aVar.f79711a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // on.e0
    public synchronized String getActiveSessionId() {
        return this.f79709g;
    }

    @Override // on.e0
    public synchronized String getSessionForMediaPeriodId(u1 u1Var, k0 k0Var) {
        return b(u1Var.getPeriodByUid(k0Var.f7718a, this.f79704b).f58110c, k0Var).f79711a;
    }

    @Override // on.e0
    public void setListener(d0 d0Var) {
        this.f79707e = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:10:0x0018, B:12:0x0028, B:21:0x003a, B:23:0x0046, B:25:0x004c, B:15:0x002f, B:31:0x0057, B:33:0x0063, B:34:0x0067, B:36:0x006c, B:38:0x0072, B:40:0x0089, B:41:0x00db, B:43:0x00df, B:44:0x00eb, B:46:0x00f5, B:48:0x00f9), top: B:53:0x0005 }] */
    @Override // on.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void updateSessions(on.b r23) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: on.y.updateSessions(on.b):void");
    }

    @Override // on.e0
    public synchronized void updateSessionsWithDiscontinuity(b bVar, int i10) {
        try {
            io.bidmachine.media3.common.util.a.checkNotNull(this.f79707e);
            boolean z10 = i10 == 0;
            Iterator it = this.f79705c.values().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (aVar.isFinishedAtEventTime(bVar)) {
                    it.remove();
                    if (aVar.f79715e) {
                        boolean zEquals = aVar.f79711a.equals(this.f79709g);
                        boolean z11 = z10 && zEquals && aVar.f79716f;
                        if (zEquals) {
                            a(aVar);
                        }
                        ((c0) this.f79707e).onSessionFinished(bVar, aVar.f79711a, z11);
                    }
                }
            }
            c(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // on.e0
    public synchronized void updateSessionsWithTimelineChange(b bVar) {
        try {
            io.bidmachine.media3.common.util.a.checkNotNull(this.f79707e);
            u1 u1Var = this.f79708f;
            this.f79708f = bVar.f79577b;
            Iterator it = this.f79705c.values().iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (!aVar.tryResolvingToNewTimeline(u1Var, this.f79708f) || aVar.isFinishedAtEventTime(bVar)) {
                    it.remove();
                    if (aVar.f79715e) {
                        if (aVar.f79711a.equals(this.f79709g)) {
                            a(aVar);
                        }
                        ((c0) this.f79707e).onSessionFinished(bVar, aVar.f79711a, false);
                    }
                }
            }
            c(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public y(v2 v2Var) {
        this.f79706d = v2Var;
        this.f79703a = new t1();
        this.f79704b = new r1();
        this.f79705c = new HashMap();
        this.f79708f = u1.f58195a;
        this.f79710h = -1L;
    }
}

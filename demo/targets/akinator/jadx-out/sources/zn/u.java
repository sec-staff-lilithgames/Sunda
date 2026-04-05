package zn;

import android.net.Uri;
import gn.j0;
import gn.l1;
import gn.p0;
import go.b0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.o0;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import ln.m;
import mn.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class u implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ln.m f98390a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f98391b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f98392c;

    /* renamed from: d, reason: collision with root package name */
    public final e.a f98393d;

    /* renamed from: e, reason: collision with root package name */
    public final mn.f f98394e;

    /* renamed from: f, reason: collision with root package name */
    public final l1 f98395f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f98396g;

    /* renamed from: h, reason: collision with root package name */
    public final long f98397h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f98398i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f98399j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements mn.g {

        /* renamed from: b, reason: collision with root package name */
        public final m f98400b;

        /* renamed from: c, reason: collision with root package name */
        public final long f98401c;

        /* renamed from: e, reason: collision with root package name */
        public final int f98402e;

        /* renamed from: f, reason: collision with root package name */
        public long f98403f;

        /* renamed from: g, reason: collision with root package name */
        public int f98404g;

        public a(m mVar, long j10, int i10, long j11, int i11) {
            this.f98400b = mVar;
            this.f98401c = j10;
            this.f98402e = i10;
            this.f98403f = j11;
            this.f98404g = i11;
        }

        public final float a() {
            long j10 = this.f98401c;
            if (j10 != -1 && j10 != 0) {
                return (this.f98403f * 100.0f) / j10;
            }
            int i10 = this.f98402e;
            if (i10 != 0) {
                return (this.f98404g * 100.0f) / i10;
            }
            return -1.0f;
        }

        @Override // mn.g
        public void onProgress(long j10, long j11, long j12) {
            long j13 = this.f98403f + j12;
            this.f98403f = j13;
            ((i) this.f98400b).onProgress(this.f98401c, j13, a());
        }

        public void onSegmentDownloaded() {
            this.f98404g++;
            ((i) this.f98400b).onProgress(this.f98401c, this.f98403f, a());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b implements Comparable {

        /* renamed from: b, reason: collision with root package name */
        public final long f98405b;

        /* renamed from: c, reason: collision with root package name */
        public final ln.m f98406c;

        public b(long j10, ln.m mVar) {
            this.f98405b = j10;
            this.f98406c = mVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            return a1.compareLong(this.f98405b, bVar.f98405b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends o0 {

        /* renamed from: j, reason: collision with root package name */
        public final b f98407j;

        /* renamed from: k, reason: collision with root package name */
        public final mn.e f98408k;

        /* renamed from: l, reason: collision with root package name */
        public final a f98409l;

        /* renamed from: m, reason: collision with root package name */
        public final byte[] f98410m;

        /* renamed from: n, reason: collision with root package name */
        public final mn.h f98411n;

        public c(b bVar, mn.e eVar, a aVar, byte[] bArr) {
            this.f98407j = bVar;
            this.f98408k = eVar;
            this.f98409l = aVar;
            this.f98410m = bArr;
            this.f98411n = new mn.h(eVar, bVar.f98406c, bArr, aVar);
        }

        @Override // io.bidmachine.media3.common.util.o0
        public final void a() {
            this.f98411n.cancel();
        }

        @Override // io.bidmachine.media3.common.util.o0
        public final Object b() throws IOException {
            this.f98411n.cache();
            a aVar = this.f98409l;
            if (aVar == null) {
                return null;
            }
            aVar.onSegmentDownloaded();
            return null;
        }
    }

    @Deprecated
    public u(p0 p0Var, b0 b0Var, e.a aVar, Executor executor) {
        this(p0Var, b0Var, aVar, executor, 20000L);
    }

    public static ln.m c(Uri uri) {
        return new m.a().setUri(uri).setFlags(1).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.util.List r17, mn.f r18, long r19) {
        /*
            r0 = r17
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = 0
            r3 = r2
        L9:
            int r4 = r0.size()
            if (r2 >= r4) goto Lb4
            java.lang.Object r4 = r0.get(r2)
            zn.u$b r4 = (zn.u.b) r4
            ln.m r5 = r4.f98406c
            ln.m r6 = r4.f98406c
            r7 = r18
            li.a r7 = (li.a) r7
            java.lang.String r5 = r7.buildCacheKey(r5)
            java.lang.Object r7 = r1.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L2b
            r8 = 0
            goto L35
        L2b:
            int r8 = r7.intValue()
            java.lang.Object r8 = r0.get(r8)
            zn.u$b r8 = (zn.u.b) r8
        L35:
            if (r8 == 0) goto La4
            long r9 = r8.f98405b
            ln.m r8 = r8.f98406c
            long r11 = r4.f98405b
            long r13 = r9 + r19
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 > 0) goto La4
            android.net.Uri r11 = r8.f73467a
            android.net.Uri r12 = r6.f73467a
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto La4
            long r11 = r8.f73473g
            r13 = -1
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto La4
            r15 = r13
            long r13 = r8.f73472f
            long r13 = r13 + r11
            long r11 = r6.f73472f
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto La4
            java.lang.String r11 = r8.f73474h
            java.lang.String r12 = r6.f73474h
            boolean r11 = java.util.Objects.equals(r11, r12)
            if (r11 == 0) goto La4
            int r11 = r8.f73475i
            int r12 = r6.f73475i
            if (r11 != r12) goto La4
            int r11 = r8.f73469c
            int r12 = r6.f73469c
            if (r11 != r12) goto La4
            java.util.Map r11 = r8.f73471e
            java.util.Map r12 = r6.f73471e
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto La4
            long r4 = r6.f73473g
            int r6 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r6 != 0) goto L87
            r13 = r15
            goto L8b
        L87:
            long r11 = r8.f73473g
            long r13 = r11 + r4
        L8b:
            r4 = 0
            ln.m r4 = r8.subrange(r4, r13)
            java.lang.Object r5 = io.bidmachine.media3.common.util.a.checkNotNull(r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            zn.u$b r6 = new zn.u$b
            r6.<init>(r9, r4)
            r0.set(r5, r6)
            goto Lb0
        La4:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r1.put(r5, r6)
            r0.set(r3, r4)
            int r3 = r3 + 1
        Lb0:
            int r2 = r2 + 1
            goto L9
        Lb4:
            int r1 = r0.size()
            io.bidmachine.media3.common.util.a1.removeRange(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.u.e(java.util.List, mn.f, long):void");
    }

    public final void a(o0 o0Var) {
        synchronized (this.f98398i) {
            try {
                if (this.f98399j) {
                    throw new InterruptedException();
                }
                this.f98398i.add(o0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:23|37|24|(2:27|(2:29|45)(3:44|31|32))(2:26|46)|30) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        r0 = (java.lang.Throwable) io.bidmachine.media3.common.util.a.checkNotNull(r4.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
    
        if ((r0 instanceof gn.l1.a) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r0 instanceof java.io.IOException) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        io.bidmachine.media3.common.util.a1.sneakyThrow(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        throw ((java.io.IOException) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
    
        r3.blockUntilFinished();
        g(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(io.bidmachine.media3.common.util.o0 r3, boolean r4) throws java.lang.Throwable {
        /*
            r2 = this;
            if (r4 == 0) goto L20
            r3.run()
            java.lang.Object r3 = r3.get()     // Catch: java.util.concurrent.ExecutionException -> La
            return r3
        La:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()
            java.lang.Object r0 = io.bidmachine.media3.common.util.a.checkNotNull(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            boolean r1 = r0 instanceof java.io.IOException
            if (r1 != 0) goto L1d
            io.bidmachine.media3.common.util.a1.sneakyThrow(r4)
            goto L20
        L1d:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L20:
            boolean r4 = r2.f98399j
            if (r4 != 0) goto L6a
            gn.l1 r4 = r2.f98395f
            if (r4 == 0) goto L2d
            r0 = -4000(0xfffffffffffff060, float:NaN)
            r4.proceed(r0)
        L2d:
            r2.a(r3)
            java.util.concurrent.Executor r4 = r2.f98396g
            r4.execute(r3)
            java.lang.Object r4 = r3.get()     // Catch: java.lang.Throwable -> L40 java.util.concurrent.ExecutionException -> L42
            r3.blockUntilFinished()
            r2.g(r3)
            return r4
        L40:
            r4 = move-exception
            goto L63
        L42:
            r4 = move-exception
            java.lang.Throwable r0 = r4.getCause()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r0 = io.bidmachine.media3.common.util.a.checkNotNull(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L40
            boolean r1 = r0 instanceof gn.l1.a     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L52
            goto L59
        L52:
            boolean r1 = r0 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L60
            io.bidmachine.media3.common.util.a1.sneakyThrow(r4)     // Catch: java.lang.Throwable -> L40
        L59:
            r3.blockUntilFinished()
            r2.g(r3)
            goto L20
        L60:
            java.io.IOException r0 = (java.io.IOException) r0     // Catch: java.lang.Throwable -> L40
            throw r0     // Catch: java.lang.Throwable -> L40
        L63:
            r3.blockUntilFinished()
            r2.g(r3)
            throw r4
        L6a:
            java.lang.InterruptedException r3 = new java.lang.InterruptedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: zn.u.b(io.bidmachine.media3.common.util.o0, boolean):java.lang.Object");
    }

    @Override // zn.n
    public void cancel() {
        synchronized (this.f98398i) {
            try {
                this.f98399j = true;
                for (int i10 = 0; i10 < this.f98398i.size(); i10++) {
                    ((o0) this.f98398i.get(i10)).cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract ArrayList d(mn.e eVar, p pVar, boolean z10);

    @Override // zn.n
    public final void download(m mVar) throws InterruptedException, IOException {
        mn.e eVarCreateDataSourceForDownloading;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        l1 l1Var = this.f98395f;
        if (l1Var != null) {
            l1Var.add(-4000);
        }
        int i10 = 0;
        try {
            mn.e eVarCreateDataSourceForDownloading2 = this.f98393d.createDataSourceForDownloading();
            p pVar = (p) b(new t(this, eVarCreateDataSourceForDownloading2, this.f98390a), false);
            if (!this.f98392c.isEmpty()) {
                pVar = (p) pVar.copy(this.f98392c);
            }
            ArrayList arrayListD = d(eVarCreateDataSourceForDownloading2, pVar, false);
            Collections.sort(arrayListD);
            e(arrayListD, this.f98394e, this.f98397h);
            int size = arrayListD.size();
            int size2 = arrayListD.size() - 1;
            if (size2 >= 0) {
                ln.m mVar2 = ((b) arrayListD.get(size2)).f98406c;
                ((li.a) this.f98394e).buildCacheKey(mVar2);
                if (mVar2.f73473g != -1) {
                    throw null;
                }
                throw null;
            }
            a aVar = mVar != null ? new a(mVar, 0L, size, 0L, 0) : null;
            arrayDeque.addAll(arrayListD);
            while (!this.f98399j && !arrayDeque.isEmpty()) {
                l1 l1Var2 = this.f98395f;
                if (l1Var2 != null) {
                    l1Var2.proceed(-4000);
                }
                if (arrayDeque2.isEmpty()) {
                    eVarCreateDataSourceForDownloading = this.f98393d.createDataSourceForDownloading();
                    bArr = new byte[131072];
                } else {
                    c cVar = (c) arrayDeque2.removeFirst();
                    eVarCreateDataSourceForDownloading = cVar.f98408k;
                    bArr = cVar.f98410m;
                }
                c cVar2 = new c((b) arrayDeque.removeFirst(), eVarCreateDataSourceForDownloading, aVar, bArr);
                a(cVar2);
                this.f98396g.execute(cVar2);
                for (int size3 = this.f98398i.size() - 1; size3 >= 0; size3--) {
                    c cVar3 = (c) this.f98398i.get(size3);
                    if (arrayDeque.isEmpty() || cVar3.isDone()) {
                        try {
                            cVar3.get();
                            f(size3);
                            arrayDeque2.addLast(cVar3);
                        } catch (ExecutionException e10) {
                            Throwable th2 = (Throwable) io.bidmachine.media3.common.util.a.checkNotNull(e10.getCause());
                            if (th2 instanceof l1.a) {
                                arrayDeque.addFirst(cVar3.f98407j);
                                f(size3);
                                arrayDeque2.addLast(cVar3);
                            } else {
                                if (th2 instanceof IOException) {
                                    throw ((IOException) th2);
                                }
                                a1.sneakyThrow(th2);
                            }
                        }
                    }
                }
                cVar2.blockUntilStarted();
            }
            while (i10 < this.f98398i.size()) {
                ((o0) this.f98398i.get(i10)).cancel(true);
                i10++;
            }
            for (int size4 = this.f98398i.size() - 1; size4 >= 0; size4--) {
                ((o0) this.f98398i.get(size4)).blockUntilFinished();
                f(size4);
            }
            l1 l1Var3 = this.f98395f;
            if (l1Var3 != null) {
                l1Var3.remove(-4000);
            }
        } catch (Throwable th3) {
            while (i10 < this.f98398i.size()) {
                ((o0) this.f98398i.get(i10)).cancel(true);
                i10++;
            }
            for (int size5 = this.f98398i.size() - 1; size5 >= 0; size5--) {
                ((o0) this.f98398i.get(size5)).blockUntilFinished();
                f(size5);
            }
            l1 l1Var4 = this.f98395f;
            if (l1Var4 != null) {
                l1Var4.remove(-4000);
            }
            throw th3;
        }
    }

    public final void f(int i10) {
        synchronized (this.f98398i) {
            this.f98398i.remove(i10);
        }
    }

    public final void g(o0 o0Var) {
        synchronized (this.f98398i) {
            this.f98398i.remove(o0Var);
        }
    }

    @Override // zn.n
    public final void remove() {
        mn.f fVar = this.f98394e;
        ln.m mVar = this.f98390a;
        mn.e eVarCreateDataSourceForRemovingDownload = this.f98393d.createDataSourceForRemovingDownload();
        try {
            try {
                ArrayList arrayListD = d(eVarCreateDataSourceForRemovingDownload, (p) b(new t(this, eVarCreateDataSourceForRemovingDownload, mVar), true), true);
                if (arrayListD.size() <= 0) {
                    ((li.a) fVar).buildCacheKey(mVar);
                    throw null;
                }
                ((li.a) fVar).buildCacheKey(((b) arrayListD.get(0)).f98406c);
                throw null;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                ((li.a) fVar).buildCacheKey(mVar);
                throw null;
            }
        } catch (Exception unused2) {
            ((li.a) fVar).buildCacheKey(mVar);
            throw null;
        }
    }

    public u(p0 p0Var, b0 b0Var, e.a aVar, Executor executor, long j10) {
        io.bidmachine.media3.common.util.a.checkNotNull(p0Var.f58053b);
        j0 j0Var = p0Var.f58053b;
        this.f98390a = c(j0Var.f57963a);
        this.f98391b = b0Var;
        this.f98392c = new ArrayList(j0Var.f57967e);
        this.f98393d = aVar;
        this.f98396g = executor;
        aVar.getCache();
        if (io.bidmachine.media3.common.util.a.checkNotNull(null) != null) {
            throw new ClassCastException();
        }
        this.f98394e = aVar.getCacheKeyFactory();
        this.f98395f = aVar.getUpstreamPriorityTaskManager();
        this.f98398i = new ArrayList();
        this.f98397h = a1.msToUs(j10);
    }
}

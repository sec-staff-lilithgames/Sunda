package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.h;
import com.mbridge.msdk.thrid.okhttp.internal.connection.f;
import com.mbridge.msdk.thrid.okhttp.n;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: o, reason: collision with root package name */
    static final /* synthetic */ boolean f43354o = true;

    /* renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.a f43355a;

    /* renamed from: b, reason: collision with root package name */
    private f.a f43356b;

    /* renamed from: c, reason: collision with root package name */
    private a0 f43357c;

    /* renamed from: d, reason: collision with root package name */
    private final h f43358d;

    /* renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.d f43359e;

    /* renamed from: f, reason: collision with root package name */
    public final n f43360f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f43361g;

    /* renamed from: h, reason: collision with root package name */
    private final f f43362h;

    /* renamed from: i, reason: collision with root package name */
    private int f43363i;

    /* renamed from: j, reason: collision with root package name */
    private c f43364j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f43365k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f43366l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f43367m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.thrid.okhttp.internal.http.c f43368n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends WeakReference<g> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f43369a;

        public a(g gVar, Object obj) {
            super(gVar);
            this.f43369a = obj;
        }
    }

    public g(h hVar, com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.d dVar, n nVar, Object obj) {
        this.f43358d = hVar;
        this.f43355a = aVar;
        this.f43359e = dVar;
        this.f43360f = nVar;
        this.f43362h = new f(aVar, i(), dVar, nVar);
        this.f43361g = obj;
    }

    private Socket g() {
        if (!f43354o && !Thread.holdsLock(this.f43358d)) {
            throw new AssertionError();
        }
        c cVar = this.f43364j;
        if (cVar == null || !cVar.f43336k) {
            return null;
        }
        return a(false, false, true);
    }

    private d i() {
        return com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(this.f43358d);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c a(t tVar, r.a aVar, boolean z10) {
        try {
            com.mbridge.msdk.thrid.okhttp.internal.http.c cVarA = a(aVar.a(), aVar.b(), aVar.c(), tVar.t(), tVar.z(), z10).a(tVar, aVar, this);
            synchronized (this.f43358d) {
                this.f43368n = cVarA;
            }
            return cVarA;
        } catch (IOException e10) {
            throw new e(e10);
        }
    }

    public com.mbridge.msdk.thrid.okhttp.internal.http.c b() {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        synchronized (this.f43358d) {
            cVar = this.f43368n;
        }
        return cVar;
    }

    public synchronized c c() {
        return this.f43364j;
    }

    public boolean d() {
        if (this.f43357c != null) {
            return true;
        }
        f.a aVar = this.f43356b;
        return (aVar != null && aVar.b()) || this.f43362h.a();
    }

    public void e() throws IOException {
        c cVar;
        Socket socketA;
        synchronized (this.f43358d) {
            cVar = this.f43364j;
            socketA = a(true, false, false);
            if (this.f43364j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f43360f.connectionReleased(this.f43359e, cVar);
        }
    }

    public void f() throws IOException {
        c cVar;
        Socket socketA;
        synchronized (this.f43358d) {
            cVar = this.f43364j;
            socketA = a(false, true, false);
            if (this.f43364j != null) {
                cVar = null;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(this.f43359e, (IOException) null);
            this.f43360f.connectionReleased(this.f43359e, cVar);
            this.f43360f.callEnd(this.f43359e);
        }
    }

    public a0 h() {
        return this.f43357c;
    }

    public String toString() {
        c cVarC = c();
        return cVarC != null ? cVarC.toString() : this.f43355a.toString();
    }

    public Socket b(c cVar) {
        if (!f43354o && !Thread.holdsLock(this.f43358d)) {
            throw new AssertionError();
        }
        if (this.f43368n == null && this.f43364j.f43339n.size() == 1) {
            Reference<g> reference = this.f43364j.f43339n.get(0);
            Socket socketA = a(true, false, false);
            this.f43364j = cVar;
            cVar.f43339n.add(reference);
            return socketA;
        }
        throw new IllegalStateException();
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) throws Throwable {
        while (true) {
            c cVarA = a(i10, i11, i12, i13, z10);
            boolean z12 = z10;
            int i14 = i13;
            int i15 = i12;
            int i16 = i11;
            int i17 = i10;
            synchronized (this.f43358d) {
                try {
                    if (cVarA.f43337l == 0 && !cVarA.f()) {
                        return cVarA;
                    }
                    if (cVarA.a(z11)) {
                        return cVarA;
                    }
                    e();
                    i10 = i17;
                    i11 = i16;
                    i12 = i15;
                    i13 = i14;
                    z10 = z12;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private c a(int i10, int i11, int i12, int i13, boolean z10) throws Throwable {
        c cVar;
        Socket socketG;
        c cVar2;
        Socket socketA;
        a0 a0VarC;
        boolean z11;
        boolean z12;
        c cVar3;
        f.a aVar;
        synchronized (this.f43358d) {
            try {
                if (!this.f43366l) {
                    if (this.f43368n == null) {
                        if (!this.f43367m) {
                            cVar = this.f43364j;
                            socketG = g();
                            cVar2 = this.f43364j;
                            socketA = null;
                            if (cVar2 != null) {
                                cVar = null;
                            } else {
                                cVar2 = null;
                            }
                            if (!this.f43365k) {
                                cVar = null;
                            }
                            if (cVar2 == null) {
                                com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(this.f43358d, this.f43355a, this, null);
                                c cVar4 = this.f43364j;
                                if (cVar4 != null) {
                                    z11 = true;
                                    cVar2 = cVar4;
                                    a0VarC = null;
                                } else {
                                    a0VarC = this.f43357c;
                                }
                            } else {
                                a0VarC = null;
                            }
                            z11 = false;
                        } else {
                            throw new IOException("Canceled");
                        }
                    } else {
                        throw new IllegalStateException("codec != null");
                    }
                } else {
                    throw new IllegalStateException("released");
                }
            } finally {
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketG);
        if (cVar != null) {
            this.f43360f.connectionReleased(this.f43359e, cVar);
        }
        if (z11) {
            this.f43360f.connectionAcquired(this.f43359e, cVar2);
        }
        if (cVar2 != null) {
            this.f43357c = this.f43364j.c();
            return cVar2;
        }
        if (a0VarC != null || ((aVar = this.f43356b) != null && aVar.b())) {
            z12 = false;
        } else {
            this.f43356b = this.f43362h.c();
            z12 = true;
        }
        synchronized (this.f43358d) {
            try {
                if (this.f43367m) {
                    throw new IOException("Canceled");
                }
                if (z12) {
                    List<a0> listA = this.f43356b.a();
                    int size = listA.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            break;
                        }
                        a0 a0Var = listA.get(i14);
                        com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(this.f43358d, this.f43355a, this, a0Var);
                        c cVar5 = this.f43364j;
                        if (cVar5 != null) {
                            this.f43357c = a0Var;
                            z11 = true;
                            cVar2 = cVar5;
                            break;
                        }
                        i14++;
                    }
                }
                if (!z11) {
                    if (a0VarC == null) {
                        a0VarC = this.f43356b.c();
                    }
                    this.f43357c = a0VarC;
                    this.f43363i = 0;
                    cVar2 = new c(this.f43358d, a0VarC);
                    a(cVar2, false);
                }
                cVar3 = cVar2;
            } finally {
            }
        }
        if (z11) {
            this.f43360f.connectionAcquired(this.f43359e, cVar3);
            return cVar3;
        }
        cVar3.a(i10, i11, i12, i13, z10, this.f43359e, this.f43360f);
        i().a(cVar3.c());
        synchronized (this.f43358d) {
            try {
                this.f43365k = true;
                com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.b(this.f43358d, cVar3);
                if (cVar3.f()) {
                    socketA = com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(this.f43358d, this.f43355a, this);
                    cVar3 = this.f43364j;
                }
            } finally {
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        this.f43360f.connectionAcquired(this.f43359e, cVar3);
        return cVar3;
    }

    public void a(boolean z10, com.mbridge.msdk.thrid.okhttp.internal.http.c cVar, long j10, IOException iOException) throws IOException {
        c cVar2;
        Socket socketA;
        boolean z11;
        this.f43360f.responseBodyEnd(this.f43359e, j10);
        synchronized (this.f43358d) {
            if (cVar != null) {
                try {
                    if (cVar == this.f43368n) {
                        if (!z10) {
                            this.f43364j.f43337l++;
                        }
                        cVar2 = this.f43364j;
                        socketA = a(z10, false, true);
                        if (this.f43364j != null) {
                            cVar2 = null;
                        }
                        z11 = this.f43366l;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            throw new IllegalStateException("expected " + this.f43368n + " but was " + cVar);
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar2 != null) {
            this.f43360f.connectionReleased(this.f43359e, cVar2);
        }
        if (iOException != null) {
            this.f43360f.callFailed(this.f43359e, com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(this.f43359e, iOException));
        } else if (z11) {
            com.mbridge.msdk.thrid.okhttp.internal.a.f43285a.a(this.f43359e, (IOException) null);
            this.f43360f.callEnd(this.f43359e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.Socket a(boolean r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = com.mbridge.msdk.thrid.okhttp.internal.connection.g.f43354o
            if (r0 != 0) goto L13
            com.mbridge.msdk.thrid.okhttp.h r0 = r1.f43358d
            boolean r0 = java.lang.Thread.holdsLock(r0)
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L13:
            r0 = 0
            if (r4 == 0) goto L18
            r1.f43368n = r0
        L18:
            r4 = 1
            if (r3 == 0) goto L1d
            r1.f43366l = r4
        L1d:
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r3 = r1.f43364j
            if (r3 == 0) goto L5d
            if (r2 == 0) goto L25
            r3.f43336k = r4
        L25:
            com.mbridge.msdk.thrid.okhttp.internal.http.c r2 = r1.f43368n
            if (r2 != 0) goto L5d
            boolean r2 = r1.f43366l
            if (r2 != 0) goto L31
            boolean r2 = r3.f43336k
            if (r2 == 0) goto L5d
        L31:
            r1.a(r3)
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f43364j
            java.util.List<java.lang.ref.Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> r2 = r2.f43339n
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L59
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f43364j
            long r3 = java.lang.System.nanoTime()
            r2.f43340o = r3
            com.mbridge.msdk.thrid.okhttp.internal.a r2 = com.mbridge.msdk.thrid.okhttp.internal.a.f43285a
            com.mbridge.msdk.thrid.okhttp.h r3 = r1.f43358d
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r4 = r1.f43364j
            boolean r2 = r2.a(r3, r4)
            if (r2 == 0) goto L59
            com.mbridge.msdk.thrid.okhttp.internal.connection.c r2 = r1.f43364j
            java.net.Socket r2 = r2.g()
            goto L5a
        L59:
            r2 = r0
        L5a:
            r1.f43364j = r0
            return r2
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.connection.g.a(boolean, boolean, boolean):java.net.Socket");
    }

    public void a() throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.c cVar;
        c cVar2;
        synchronized (this.f43358d) {
            this.f43367m = true;
            cVar = this.f43368n;
            cVar2 = this.f43364j;
        }
        if (cVar != null) {
            cVar.cancel();
        } else if (cVar2 != null) {
            cVar2.d();
        }
    }

    public void a(IOException iOException) throws IOException {
        c cVar;
        boolean z10;
        Socket socketA;
        synchronized (this.f43358d) {
            try {
                cVar = null;
                if (iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.n) {
                    com.mbridge.msdk.thrid.okhttp.internal.http2.b bVar = ((com.mbridge.msdk.thrid.okhttp.internal.http2.n) iOException).f43605a;
                    if (bVar == com.mbridge.msdk.thrid.okhttp.internal.http2.b.REFUSED_STREAM) {
                        int i10 = this.f43363i + 1;
                        this.f43363i = i10;
                        if (i10 > 1) {
                            this.f43357c = null;
                            z10 = true;
                        }
                        z10 = false;
                    } else {
                        if (bVar != com.mbridge.msdk.thrid.okhttp.internal.http2.b.CANCEL) {
                            this.f43357c = null;
                            z10 = true;
                        }
                        z10 = false;
                    }
                } else {
                    c cVar2 = this.f43364j;
                    if (cVar2 != null && (!cVar2.f() || (iOException instanceof com.mbridge.msdk.thrid.okhttp.internal.http2.a))) {
                        if (this.f43364j.f43337l == 0) {
                            a0 a0Var = this.f43357c;
                            if (a0Var != null && iOException != null) {
                                this.f43362h.a(a0Var, iOException);
                            }
                            this.f43357c = null;
                        }
                        z10 = true;
                    }
                    z10 = false;
                }
                c cVar3 = this.f43364j;
                socketA = a(z10, false, true);
                if (this.f43364j == null && this.f43365k) {
                    cVar = cVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(socketA);
        if (cVar != null) {
            this.f43360f.connectionReleased(this.f43359e, cVar);
        }
    }

    public void a(c cVar, boolean z10) {
        if (!f43354o && !Thread.holdsLock(this.f43358d)) {
            throw new AssertionError();
        }
        if (this.f43364j == null) {
            this.f43364j = cVar;
            this.f43365k = z10;
            cVar.f43339n.add(new a(this, this.f43361g));
            return;
        }
        throw new IllegalStateException();
    }

    private void a(c cVar) {
        int size = cVar.f43339n.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (cVar.f43339n.get(i10).get() == this) {
                cVar.f43339n.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }
}

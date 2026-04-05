package p8;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import nh.jh;
import q.b4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e0 implements l0, r8.n, n0 {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f80749i = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final androidx.localbroadcastmanager.content.b f80750a;

    /* renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.f f80751b;

    /* renamed from: c, reason: collision with root package name */
    public final r8.o f80752c;

    /* renamed from: d, reason: collision with root package name */
    public final b4 f80753d;

    /* renamed from: e, reason: collision with root package name */
    public final jh f80754e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f80755f;

    /* renamed from: g, reason: collision with root package name */
    public final com.android.billingclient.api.n f80756g;

    /* renamed from: h, reason: collision with root package name */
    public final e f80757h;

    public e0(r8.o oVar, r8.a aVar, s8.h hVar, s8.h hVar2, s8.h hVar3, s8.h hVar4, boolean z10) throws Throwable {
        this.f80752c = oVar;
        c0 c0Var = new c0(aVar);
        this.f80755f = c0Var;
        e eVar = new e(z10);
        this.f80757h = eVar;
        synchronized (this) {
            try {
                try {
                    synchronized (eVar) {
                        try {
                            eVar.f80747e = this;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    }
                    this.f80751b = new com.bumptech.glide.f();
                    this.f80750a = new androidx.localbroadcastmanager.content.b(13);
                    this.f80753d = new b4(hVar, hVar2, hVar3, hVar4, this, this);
                    this.f80756g = new com.android.billingclient.api.n(c0Var);
                    jh jhVar = new jh();
                    jhVar.f76406b = new Handler(Looper.getMainLooper(), new y0());
                    this.f80754e = jhVar;
                    oVar.setResourceRemovedListener(this);
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    public static void b(String str, long j10, m0 m0Var) {
        StringBuilder sbT = a.b.t(str, " in ");
        sbT.append(j9.l.getElapsedMillis(j10));
        sbT.append("ms, key: ");
        sbT.append(m0Var);
        Log.v("Engine", sbT.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o0 a(m0 m0Var, boolean z10, long j10) throws Throwable {
        Throwable th2;
        o0 o0Var;
        e0 e0Var;
        m0 m0Var2;
        o0 o0Var2;
        if (z10) {
            e eVar = this.f80757h;
            synchronized (eVar) {
                try {
                    d dVar = (d) eVar.f80745c.get(m0Var);
                    if (dVar == null) {
                        o0Var = null;
                    } else {
                        o0Var = (o0) dVar.get();
                        if (o0Var == null) {
                            try {
                                eVar.b(dVar);
                            } catch (Throwable th3) {
                                th2 = th3;
                                while (true) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                    }
                                    th2 = th4;
                                }
                            }
                        }
                    }
                    if (o0Var != null) {
                        o0Var.a();
                    }
                    if (o0Var != null) {
                        if (f80749i) {
                            b("Loaded resource from active resources", j10, m0Var);
                        }
                        return o0Var;
                    }
                    v0 v0VarRemove = this.f80752c.remove(m0Var);
                    if (v0VarRemove == null) {
                        e0Var = this;
                        m0Var2 = m0Var;
                        o0Var2 = null;
                    } else if (v0VarRemove instanceof o0) {
                        o0Var2 = (o0) v0VarRemove;
                        e0Var = this;
                        m0Var2 = m0Var;
                    } else {
                        e0Var = this;
                        m0Var2 = m0Var;
                        o0Var2 = new o0(v0VarRemove, true, true, m0Var2, e0Var);
                    }
                    if (o0Var2 != null) {
                        o0Var2.a();
                        e0Var.f80757h.a(m0Var2, o0Var2);
                    }
                    if (o0Var2 != null) {
                        if (f80749i) {
                            b("Loaded resource from cache", j10, m0Var2);
                        }
                        return o0Var2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
        }
        return null;
    }

    public final d0 c(com.bumptech.glide.h hVar, Object obj, n8.q qVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.l lVar, z zVar, Map map, boolean z10, boolean z11, n8.v vVar, boolean z12, boolean z13, boolean z14, boolean z15, f9.j jVar, Executor executor, m0 m0Var, long j10) {
        androidx.localbroadcastmanager.content.b bVar = this.f80750a;
        k0 k0Var = (k0) ((HashMap) (z15 ? bVar.f6757b : bVar.f6756a)).get(m0Var);
        if (k0Var != null) {
            k0Var.a(jVar, executor);
            if (f80749i) {
                b("Added to existing load", j10, m0Var);
            }
            return new d0(this, jVar, k0Var);
        }
        k0 k0Var2 = (k0) j9.q.checkNotNull((k0) ((w3.f) this.f80753d.f82050g).acquire());
        synchronized (k0Var2) {
            k0Var2.f80790n = m0Var;
            k0Var2.f80791o = z12;
            k0Var2.f80792p = z13;
            k0Var2.f80793q = z14;
            k0Var2.f80794r = z15;
        }
        com.android.billingclient.api.n nVar = this.f80756g;
        r rVar = (r) j9.q.checkNotNull((r) ((w3.f) nVar.f12752c).acquire());
        int i12 = nVar.f12750a;
        nVar.f12750a = i12 + 1;
        l lVar2 = rVar.f80855b;
        o oVar = rVar.f80858f;
        lVar2.f80805c = hVar;
        lVar2.f80806d = obj;
        lVar2.f80816n = qVar;
        lVar2.f80807e = i10;
        lVar2.f80808f = i11;
        lVar2.f80818p = zVar;
        lVar2.f80809g = cls;
        lVar2.f80810h = oVar;
        lVar2.f80813k = cls2;
        lVar2.f80817o = lVar;
        lVar2.f80811i = vVar;
        lVar2.f80812j = map;
        lVar2.f80819q = z10;
        lVar2.f80820r = z11;
        rVar.f80862j = hVar;
        rVar.f80863k = qVar;
        rVar.f80864l = lVar;
        rVar.f80865m = m0Var;
        rVar.f80866n = i10;
        rVar.f80867o = i11;
        rVar.f80868p = zVar;
        rVar.f80874v = z15;
        rVar.f80869q = vVar;
        rVar.f80870r = k0Var2;
        rVar.f80871s = i12;
        rVar.f80872t = q.f80844b;
        rVar.f80875w = obj;
        androidx.localbroadcastmanager.content.b bVar2 = this.f80750a;
        bVar2.getClass();
        ((HashMap) (k0Var2.f80794r ? bVar2.f6757b : bVar2.f6756a)).put(m0Var, k0Var2);
        k0Var2.a(jVar, executor);
        k0Var2.start(rVar);
        if (f80749i) {
            b("Started new load", j10, m0Var);
        }
        return new d0(this, jVar, k0Var2);
    }

    public void clearDiskCache() {
        this.f80755f.getDiskCache().clear();
    }

    public <R> d0 load(com.bumptech.glide.h hVar, Object obj, n8.q qVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.l lVar, z zVar, Map<Class<?>, n8.z> map, boolean z10, boolean z11, n8.v vVar, boolean z12, boolean z13, boolean z14, boolean z15, f9.j jVar, Executor executor) {
        long logTime = f80749i ? j9.l.getLogTime() : 0L;
        this.f80751b.getClass();
        m0 m0Var = new m0(obj, qVar, i10, i11, map, cls, cls2, vVar);
        synchronized (this) {
            try {
                o0 o0VarA = a(m0Var, z12, logTime);
                if (o0VarA == null) {
                    return c(hVar, obj, qVar, i10, i11, cls, cls2, lVar, zVar, map, z10, z11, vVar, z12, z13, z14, z15, jVar, executor, m0Var, logTime);
                }
                ((f9.k) jVar).onResourceReady(o0VarA, n8.a.f75827g, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p8.l0
    public synchronized void onEngineJobCancelled(k0 k0Var, n8.q qVar) {
        androidx.localbroadcastmanager.content.b bVar = this.f80750a;
        bVar.getClass();
        HashMap map = (HashMap) (k0Var.f80794r ? bVar.f6757b : bVar.f6756a);
        if (k0Var.equals(map.get(qVar))) {
            map.remove(qVar);
        }
    }

    @Override // p8.l0
    public synchronized void onEngineJobComplete(k0 k0Var, n8.q qVar, o0 o0Var) {
        if (o0Var != null) {
            try {
                if (o0Var.f80832b) {
                    this.f80757h.a(qVar, o0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        androidx.localbroadcastmanager.content.b bVar = this.f80750a;
        bVar.getClass();
        HashMap map = (HashMap) (k0Var.f80794r ? bVar.f6757b : bVar.f6756a);
        if (k0Var.equals(map.get(qVar))) {
            map.remove(qVar);
        }
    }

    @Override // p8.n0
    public void onResourceReleased(n8.q qVar, o0 o0Var) {
        e eVar = this.f80757h;
        synchronized (eVar) {
            d dVar = (d) eVar.f80745c.remove(qVar);
            if (dVar != null) {
                dVar.f80739c = null;
                dVar.clear();
            }
        }
        if (o0Var.f80832b) {
            this.f80752c.put(qVar, o0Var);
        } else {
            this.f80754e.a(o0Var, false);
        }
    }

    @Override // r8.n
    public void onResourceRemoved(v0 v0Var) {
        this.f80754e.a(v0Var, true);
    }

    public void release(v0 v0Var) {
        if (!(v0Var instanceof o0)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((o0) v0Var).b();
    }

    public void shutdown() {
        b4 b4Var = this.f80753d;
        j9.h.shutdownAndAwaitTermination((s8.h) b4Var.f82044a);
        j9.h.shutdownAndAwaitTermination((s8.h) b4Var.f82045b);
        j9.h.shutdownAndAwaitTermination((s8.h) b4Var.f82046c);
        j9.h.shutdownAndAwaitTermination((s8.h) b4Var.f82047d);
        c0 c0Var = this.f80755f;
        synchronized (c0Var) {
            if (c0Var.f80736b != null) {
                c0Var.f80736b.clear();
            }
        }
        e eVar = this.f80757h;
        eVar.f80748f = true;
        ExecutorService executorService = eVar.f80744b;
        if (executorService != null) {
            j9.h.shutdownAndAwaitTermination(executorService);
        }
    }
}

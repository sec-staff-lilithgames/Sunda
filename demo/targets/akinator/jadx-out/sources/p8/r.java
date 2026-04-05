package p8;

import android.os.Build;
import android.util.Log;
import androidx.appcompat.app.i1;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.util.ArrayList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class r implements j, Runnable, Comparable, k9.f {
    public Object A;
    public n8.a B;
    public com.bumptech.glide.load.data.e C;
    public volatile k D;
    public volatile boolean E;
    public volatile boolean F;
    public boolean G;
    public int H;

    /* renamed from: f, reason: collision with root package name */
    public final o f80858f;

    /* renamed from: g, reason: collision with root package name */
    public final w3.f f80859g;

    /* renamed from: j, reason: collision with root package name */
    public com.bumptech.glide.h f80862j;

    /* renamed from: k, reason: collision with root package name */
    public n8.q f80863k;

    /* renamed from: l, reason: collision with root package name */
    public com.bumptech.glide.l f80864l;

    /* renamed from: m, reason: collision with root package name */
    public m0 f80865m;

    /* renamed from: n, reason: collision with root package name */
    public int f80866n;

    /* renamed from: o, reason: collision with root package name */
    public int f80867o;

    /* renamed from: p, reason: collision with root package name */
    public z f80868p;

    /* renamed from: q, reason: collision with root package name */
    public n8.v f80869q;

    /* renamed from: r, reason: collision with root package name */
    public k0 f80870r;

    /* renamed from: s, reason: collision with root package name */
    public int f80871s;

    /* renamed from: t, reason: collision with root package name */
    public q f80872t;

    /* renamed from: u, reason: collision with root package name */
    public long f80873u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f80874v;

    /* renamed from: w, reason: collision with root package name */
    public Object f80875w;

    /* renamed from: x, reason: collision with root package name */
    public Thread f80876x;

    /* renamed from: y, reason: collision with root package name */
    public n8.q f80877y;

    /* renamed from: z, reason: collision with root package name */
    public n8.q f80878z;

    /* renamed from: b, reason: collision with root package name */
    public final l f80855b = new l();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f80856c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final k9.k f80857e = k9.k.newInstance();

    /* renamed from: h, reason: collision with root package name */
    public final i1 f80860h = new i1();

    /* renamed from: i, reason: collision with root package name */
    public final p f80861i = new p();

    public r(c0 c0Var, w3.f fVar) {
        this.f80858f = c0Var;
        this.f80859g = fVar;
    }

    public final v0 a(Object obj, n8.a aVar) {
        Class<?> cls = obj.getClass();
        l lVar = this.f80855b;
        s0 loadPath = lVar.f80805c.getRegistry().getLoadPath(cls, lVar.f80809g, lVar.f80813k);
        n8.v vVar = this.f80869q;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z10 = aVar == n8.a.f75826f || lVar.f80820r;
            n8.u uVar = x8.a0.f91796i;
            Boolean bool = (Boolean) vVar.get(uVar);
            if (bool == null || (bool.booleanValue() && !z10)) {
                vVar = new n8.v();
                vVar.putAll(this.f80869q);
                vVar.set(uVar, Boolean.valueOf(z10));
            }
        }
        n8.v vVar2 = vVar;
        com.bumptech.glide.load.data.g rewinder = this.f80862j.getRegistry().getRewinder(obj);
        try {
            return loadPath.load(rewinder, vVar2, this.f80866n, this.f80867o, new n(this, aVar));
        } finally {
            rewinder.cleanup();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p8.r.b():void");
    }

    public final k c() {
        int iC = b3.h.c(this.H);
        l lVar = this.f80855b;
        if (iC == 1) {
            return new w0(lVar, this);
        }
        if (iC == 2) {
            return new g(lVar.a(), lVar, this);
        }
        if (iC == 3) {
            return new a1(lVar, this);
        }
        if (iC == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(o2.D(this.H)));
    }

    public void cancel() {
        this.F = true;
        k kVar = this.D;
        if (kVar != null) {
            kVar.cancel();
        }
    }

    public final int d(int i10) {
        int iC = b3.h.c(i10);
        if (iC == 0) {
            if (this.f80868p.decodeCachedResource()) {
                return 2;
            }
            return d(2);
        }
        if (iC == 1) {
            if (this.f80868p.decodeCachedData()) {
                return 3;
            }
            return d(3);
        }
        if (iC == 2) {
            return this.f80874v ? 6 : 4;
        }
        if (iC == 3 || iC == 5) {
            return 6;
        }
        throw new IllegalArgumentException("Unrecognized stage: ".concat(o2.D(i10)));
    }

    public final void e(long j10, String str, String str2) {
        StringBuilder sbT = a.b.t(str, " in ");
        sbT.append(j9.l.getElapsedMillis(j10));
        sbT.append(", load key: ");
        sbT.append(this.f80865m);
        sbT.append(str2 != null ? ", ".concat(str2) : "");
        sbT.append(", thread: ");
        sbT.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbT.toString());
    }

    public final void f() {
        boolean zA;
        j();
        this.f80870r.onLoadFailed(new q0("Failed to load resource", new ArrayList(this.f80856c)));
        p pVar = this.f80861i;
        synchronized (pVar) {
            pVar.f80841c = true;
            zA = pVar.a();
        }
        if (zA) {
            g();
        }
    }

    public final void g() {
        p pVar = this.f80861i;
        synchronized (pVar) {
            pVar.f80840b = false;
            pVar.f80839a = false;
            pVar.f80841c = false;
        }
        i1 i1Var = this.f80860h;
        i1Var.f4754a = null;
        i1Var.f4755b = null;
        i1Var.f4756c = null;
        l lVar = this.f80855b;
        lVar.f80805c = null;
        lVar.f80806d = null;
        lVar.f80816n = null;
        lVar.f80809g = null;
        lVar.f80813k = null;
        lVar.f80811i = null;
        lVar.f80817o = null;
        lVar.f80812j = null;
        lVar.f80818p = null;
        lVar.f80803a.clear();
        lVar.f80814l = false;
        lVar.f80804b.clear();
        lVar.f80815m = false;
        this.E = false;
        this.f80862j = null;
        this.f80863k = null;
        this.f80869q = null;
        this.f80864l = null;
        this.f80865m = null;
        this.f80870r = null;
        this.H = 0;
        this.D = null;
        this.f80876x = null;
        this.f80877y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.f80873u = 0L;
        this.F = false;
        this.f80875w = null;
        this.f80856c.clear();
        this.f80859g.release(this);
    }

    @Override // k9.f
    public k9.k getVerifier() {
        return this.f80857e;
    }

    public final void h() {
        this.f80876x = Thread.currentThread();
        this.f80873u = j9.l.getLogTime();
        boolean zStartNext = false;
        while (!this.F && this.D != null && !(zStartNext = this.D.startNext())) {
            this.H = d(this.H);
            this.D = c();
            if (this.H == 4) {
                this.f80872t = q.f80845c;
                this.f80870r.reschedule(this);
                return;
            }
        }
        if ((this.H == 6 || this.F) && !zStartNext) {
            f();
        }
    }

    public final void i() {
        int iOrdinal = this.f80872t.ordinal();
        if (iOrdinal == 0) {
            this.H = d(1);
            this.D = c();
            h();
        } else if (iOrdinal == 1) {
            h();
        } else if (iOrdinal == 2) {
            b();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f80872t);
        }
    }

    @Override // p8.j
    public void onDataFetcherFailed(n8.q qVar, Exception exc, com.bumptech.glide.load.data.e eVar, n8.a aVar) {
        eVar.cleanup();
        q0 q0Var = new q0("Fetching data failed", exc);
        Class<Object> dataClass = eVar.getDataClass();
        q0Var.f80850c = qVar;
        q0Var.f80851e = aVar;
        q0Var.f80852f = dataClass;
        this.f80856c.add(q0Var);
        if (Thread.currentThread() == this.f80876x) {
            h();
        } else {
            this.f80872t = q.f80845c;
            this.f80870r.reschedule(this);
        }
    }

    @Override // p8.j
    public void onDataFetcherReady(n8.q qVar, Object obj, com.bumptech.glide.load.data.e eVar, n8.a aVar, n8.q qVar2) {
        this.f80877y = qVar;
        this.A = obj;
        this.C = eVar;
        this.B = aVar;
        this.f80878z = qVar2;
        this.G = qVar != this.f80855b.a().get(0);
        if (Thread.currentThread() != this.f80876x) {
            this.f80872t = q.f80846e;
            this.f80870r.reschedule(this);
        } else {
            k9.i.beginSection("DecodeJob.decodeFromRetrievedData");
            try {
                b();
            } finally {
                k9.i.endSection();
            }
        }
    }

    @Override // p8.j
    public void reschedule() {
        this.f80872t = q.f80845c;
        this.f80870r.reschedule(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        k9.i.beginSectionFormat("DecodeJob#run(reason=%s, model=%s)", this.f80872t, this.f80875w);
        com.bumptech.glide.load.data.e eVar = this.C;
        try {
            try {
                try {
                    if (this.F) {
                        f();
                        if (eVar != null) {
                            eVar.cleanup();
                        }
                        k9.i.endSection();
                        return;
                    }
                    i();
                    if (eVar != null) {
                        eVar.cleanup();
                    }
                    k9.i.endSection();
                } catch (f e10) {
                    throw e10;
                }
            } catch (Throwable th2) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.F + ", stage: " + o2.D(this.H), th2);
                }
                if (this.H != 5) {
                    this.f80856c.add(th2);
                    f();
                }
                if (!this.F) {
                    throw th2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (eVar != null) {
                eVar.cleanup();
            }
            k9.i.endSection();
            throw th3;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(r rVar) {
        int iOrdinal = this.f80864l.ordinal() - rVar.f80864l.ordinal();
        return iOrdinal == 0 ? this.f80871s - rVar.f80871s : iOrdinal;
    }

    public final void j() {
        this.f80857e.throwIfRecycled();
        if (this.E) {
            throw new IllegalStateException(SUvoXnn.YGfUYdZGvdXz, this.f80856c.isEmpty() ? null : (Throwable) j1.o2.e(1, this.f80856c));
        }
        this.E = true;
    }
}

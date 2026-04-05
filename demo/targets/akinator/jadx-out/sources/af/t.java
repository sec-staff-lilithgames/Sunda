package af;

import com.applovin.impl.ga;
import com.google.android.exoplayer2.o1;
import com.google.android.exoplayer2.u1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.util.x0;
import com.google.android.exoplayer2.util.z0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import qf.t;
import rf.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t implements q {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4384a;

    /* renamed from: b, reason: collision with root package name */
    public final qf.t f4385b;

    /* renamed from: c, reason: collision with root package name */
    public final rf.e f4386c;

    /* renamed from: d, reason: collision with root package name */
    public final rf.h f4387d;

    /* renamed from: e, reason: collision with root package name */
    public final x0 f4388e;

    /* renamed from: f, reason: collision with root package name */
    public p f4389f;

    /* renamed from: g, reason: collision with root package name */
    public volatile s f4390g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f4391h;

    public t(u1 u1Var, e.a aVar) {
        this(u1Var, aVar, new ga(2));
    }

    @Override // af.q
    public void cancel() {
        this.f4391h = true;
        s sVar = this.f4390g;
        if (sVar != null) {
            sVar.cancel(true);
        }
    }

    @Override // af.q
    public void download(p pVar) throws InterruptedException, IOException {
        this.f4389f = pVar;
        x0 x0Var = this.f4388e;
        if (x0Var != null) {
            x0Var.add(-1000);
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.f4391h) {
                    break;
                }
                this.f4390g = new s(this);
                x0 x0Var2 = this.f4388e;
                if (x0Var2 != null) {
                    x0Var2.proceed(-1000);
                }
                this.f4384a.execute(this.f4390g);
                try {
                    this.f4390g.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable th2 = (Throwable) com.google.android.exoplayer2.util.a.checkNotNull(e10.getCause());
                    if (!(th2 instanceof x0.a)) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        n1.sneakyThrow(th2);
                    }
                }
            } catch (Throwable th3) {
                ((z0) com.google.android.exoplayer2.util.a.checkNotNull(this.f4390g)).blockUntilFinished();
                x0 x0Var3 = this.f4388e;
                if (x0Var3 != null) {
                    x0Var3.remove(-1000);
                }
                throw th3;
            }
        }
        ((z0) com.google.android.exoplayer2.util.a.checkNotNull(this.f4390g)).blockUntilFinished();
        x0 x0Var4 = this.f4388e;
        if (x0Var4 != null) {
            x0Var4.remove(-1000);
        }
    }

    @Override // af.q
    public void remove() {
        rf.e eVar = this.f4386c;
        eVar.getCache();
        ((pe.a) eVar.getCacheKeyFactory()).buildCacheKey(this.f4385b);
        throw null;
    }

    public t(u1 u1Var, e.a aVar, Executor executor) {
        this.f4384a = (Executor) com.google.android.exoplayer2.util.a.checkNotNull(executor);
        com.google.android.exoplayer2.util.a.checkNotNull(u1Var.f28113c);
        t.a aVar2 = new t.a();
        o1 o1Var = u1Var.f28113c;
        qf.t tVarBuild = aVar2.setUri(o1Var.f27860b).setKey(o1Var.f27865h).setFlags(4).build();
        this.f4385b = tVarBuild;
        rf.e eVarCreateDataSourceForDownloading = aVar.createDataSourceForDownloading();
        this.f4386c = eVarCreateDataSourceForDownloading;
        this.f4387d = new rf.h(eVarCreateDataSourceForDownloading, tVarBuild, null, new g(this, 1));
        this.f4388e = aVar.getUpstreamPriorityTaskManager();
    }
}

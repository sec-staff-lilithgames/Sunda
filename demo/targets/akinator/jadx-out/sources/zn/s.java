package zn;

import com.applovin.impl.ga;
import gn.j0;
import gn.l1;
import gn.p0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.o0;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import ln.m;
import mn.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f98379a;

    /* renamed from: b, reason: collision with root package name */
    public final ln.m f98380b;

    /* renamed from: c, reason: collision with root package name */
    public final mn.e f98381c;

    /* renamed from: d, reason: collision with root package name */
    public final mn.h f98382d;

    /* renamed from: e, reason: collision with root package name */
    public final l1 f98383e;

    /* renamed from: f, reason: collision with root package name */
    public m f98384f;

    /* renamed from: g, reason: collision with root package name */
    public volatile r f98385g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f98386h;

    public s(p0 p0Var, e.a aVar) {
        this(p0Var, aVar, new ga(2));
    }

    @Override // zn.n
    public void cancel() {
        this.f98386h = true;
        r rVar = this.f98385g;
        if (rVar != null) {
            rVar.cancel(true);
        }
    }

    @Override // zn.n
    public void download(m mVar) throws InterruptedException, IOException {
        this.f98384f = mVar;
        l1 l1Var = this.f98383e;
        if (l1Var != null) {
            l1Var.add(-4000);
        }
        boolean z10 = false;
        while (!z10) {
            try {
                if (this.f98386h) {
                    break;
                }
                this.f98385g = new r(this);
                l1 l1Var2 = this.f98383e;
                if (l1Var2 != null) {
                    l1Var2.proceed(-4000);
                }
                this.f98379a.execute(this.f98385g);
                try {
                    this.f98385g.get();
                    z10 = true;
                } catch (ExecutionException e10) {
                    Throwable th2 = (Throwable) io.bidmachine.media3.common.util.a.checkNotNull(e10.getCause());
                    if (!(th2 instanceof l1.a)) {
                        if (th2 instanceof IOException) {
                            throw ((IOException) th2);
                        }
                        a1.sneakyThrow(th2);
                    }
                }
            } catch (Throwable th3) {
                ((o0) io.bidmachine.media3.common.util.a.checkNotNull(this.f98385g)).blockUntilFinished();
                l1 l1Var3 = this.f98383e;
                if (l1Var3 != null) {
                    l1Var3.remove(-4000);
                }
                throw th3;
            }
        }
        ((o0) io.bidmachine.media3.common.util.a.checkNotNull(this.f98385g)).blockUntilFinished();
        l1 l1Var4 = this.f98383e;
        if (l1Var4 != null) {
            l1Var4.remove(-4000);
        }
    }

    @Override // zn.n
    public void remove() {
        mn.e eVar = this.f98381c;
        eVar.getCache();
        ((li.a) eVar.getCacheKeyFactory()).buildCacheKey(this.f98380b);
        throw null;
    }

    public s(p0 p0Var, e.a aVar, Executor executor) {
        this.f98379a = (Executor) io.bidmachine.media3.common.util.a.checkNotNull(executor);
        io.bidmachine.media3.common.util.a.checkNotNull(p0Var.f58053b);
        m.a aVar2 = new m.a();
        j0 j0Var = p0Var.f58053b;
        ln.m mVarBuild = aVar2.setUri(j0Var.f57963a).setKey(j0Var.f57968f).setFlags(4).build();
        this.f98380b = mVarBuild;
        mn.e eVarCreateDataSourceForDownloading = aVar.createDataSourceForDownloading();
        this.f98381c = eVarCreateDataSourceForDownloading;
        this.f98382d = new mn.h(eVarCreateDataSourceForDownloading, mVarBuild, null, new z9.h(this));
        this.f98383e = aVar.getUpstreamPriorityTaskManager();
    }
}

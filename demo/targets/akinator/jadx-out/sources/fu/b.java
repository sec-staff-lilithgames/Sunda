package fu;

import java.util.concurrent.TimeUnit;
import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends m0.a {

    /* renamed from: b, reason: collision with root package name */
    public final tt.f f56004b;

    /* renamed from: c, reason: collision with root package name */
    public final pt.b f56005c;

    /* renamed from: e, reason: collision with root package name */
    public final tt.f f56006e;

    /* renamed from: f, reason: collision with root package name */
    public final d f56007f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f56008g;

    public b(d dVar) {
        this.f56007f = dVar;
        tt.f fVar = new tt.f();
        this.f56004b = fVar;
        pt.b bVar = new pt.b();
        this.f56005c = bVar;
        tt.f fVar2 = new tt.f();
        this.f56006e = fVar2;
        fVar2.add(fVar);
        fVar2.add(bVar);
    }

    @Override // mt.m0.a, pt.c
    public void dispose() {
        if (this.f56008g) {
            return;
        }
        this.f56008g = true;
        this.f56006e.dispose();
    }

    @Override // mt.m0.a, pt.c
    public boolean isDisposed() {
        return this.f56008g;
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable) {
        return this.f56008g ? tt.e.f87354b : this.f56007f.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.f56004b);
    }

    @Override // mt.m0.a
    public pt.c schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (this.f56008g) {
            return tt.e.f87354b;
        }
        return this.f56007f.scheduleActual(runnable, j10, timeUnit, this.f56005c);
    }
}

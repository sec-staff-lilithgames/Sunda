package es;

import java.util.concurrent.atomic.AtomicLong;
import xr.bf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final b0 f55103b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.m f55104c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f55105e;

    public u(k0 k0Var, b0 b0Var, wr.m mVar) {
        this.f55105e = k0Var;
        this.f55103b = b0Var;
        this.f55104c = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        k0 k0Var = this.f55105e;
        k0Var.f55065l = Long.valueOf(((bf) k0Var.f55062i).currentTimeNanos());
        for (r rVar : this.f55105e.f55059f.f55100b.values()) {
            androidx.localbroadcastmanager.content.b bVar = rVar.f55096c;
            ((AtomicLong) bVar.f6756a).set(0L);
            ((AtomicLong) bVar.f6757b).set(0L);
            androidx.localbroadcastmanager.content.b bVar2 = rVar.f55095b;
            rVar.f55095b = rVar.f55096c;
            rVar.f55096c = bVar2;
        }
        for (i0 i0Var : i0.forConfig(this.f55103b, this.f55104c)) {
            k0 k0Var2 = this.f55105e;
            i0Var.ejectOutliers(k0Var2.f55059f, k0Var2.f55065l.longValue());
        }
        k0 k0Var3 = this.f55105e;
        s sVar = k0Var3.f55059f;
        Long l9 = k0Var3.f55065l;
        for (r rVar2 : sVar.f55100b.values()) {
            if (!rVar2.d()) {
                int i10 = rVar2.f55098e;
                rVar2.f55098e = i10 == 0 ? 0 : i10 - 1;
            }
            if (rVar2.d() && rVar2.maxEjectionTimeElapsed(l9.longValue())) {
                rVar2.e();
            }
        }
    }
}

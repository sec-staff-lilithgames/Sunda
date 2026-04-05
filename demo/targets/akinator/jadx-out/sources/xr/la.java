package xr;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class la extends b3.f {

    /* renamed from: a, reason: collision with root package name */
    public final na f92768a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f92769b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ na f92770c;

    public la(na naVar, na naVar2) {
        this.f92770c = naVar;
        this.f92768a = (na) mh.p1.checkNotNull(naVar2, "pickFirstLeafLoadBalancer");
    }

    @Override // wr.b3.f
    public wr.c3 pickSubchannel(b3.d dVar) {
        if (this.f92769b.compareAndSet(false, true)) {
            wr.u6 synchronizationContext = this.f92770c.f92816f.getSynchronizationContext();
            na naVar = this.f92768a;
            Objects.requireNonNull(naVar);
            synchronizationContext.execute(new on.w(naVar, 26));
        }
        return wr.c3.withNoResult();
    }
}

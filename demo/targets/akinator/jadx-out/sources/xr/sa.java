package xr;

import java.util.concurrent.atomic.AtomicBoolean;
import wr.b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class sa extends b3.f {

    /* renamed from: a, reason: collision with root package name */
    public final b3.e f92991a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f92992b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ta f92993c;

    public sa(ta taVar, b3.e eVar) {
        this.f92993c = taVar;
        this.f92991a = (b3.e) mh.p1.checkNotNull(eVar, "subchannel");
    }

    @Override // wr.b3.f
    public wr.c3 pickSubchannel(b3.d dVar) {
        if (this.f92992b.compareAndSet(false, true)) {
            this.f92993c.f93035f.getSynchronizationContext().execute(new ra(this));
        }
        return wr.c3.withNoResult();
    }
}

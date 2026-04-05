package kotlinx.coroutines.flow.internal;

import kv.p;
import zu.k;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class DownstreamExceptionContext implements m {
    private final /* synthetic */ m $$delegate_0;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f71890e;

    public DownstreamExceptionContext(Throwable th2, m mVar) {
        this.$$delegate_0 = mVar;
        this.f71890e = th2;
    }

    @Override // zu.m
    public <R> R fold(R r10, p pVar) {
        return (R) this.$$delegate_0.fold(r10, pVar);
    }

    @Override // zu.m
    public <E extends k> E get(l lVar) {
        return (E) this.$$delegate_0.get(lVar);
    }

    @Override // zu.m
    public m minusKey(l lVar) {
        return this.$$delegate_0.minusKey(lVar);
    }

    @Override // zu.m
    public m plus(m mVar) {
        return this.$$delegate_0.plus(mVar);
    }
}

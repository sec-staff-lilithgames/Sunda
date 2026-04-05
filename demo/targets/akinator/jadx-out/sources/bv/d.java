package bv;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class d extends a {
    private final zu.m _context;
    private transient zu.d<Object> intercepted;

    public d(zu.d<Object> dVar, zu.m mVar) {
        super(dVar);
        this._context = mVar;
    }

    @Override // bv.a, zu.d
    public zu.m getContext() {
        zu.m mVar = this._context;
        e0.checkNotNull(mVar);
        return mVar;
    }

    public final zu.d<Object> intercepted() {
        zu.d<Object> dVarInterceptContinuation = this.intercepted;
        if (dVarInterceptContinuation == null) {
            zu.g gVar = (zu.g) getContext().get(zu.f.f98853b);
            if (gVar == null || (dVarInterceptContinuation = gVar.interceptContinuation(this)) == null) {
                dVarInterceptContinuation = this;
            }
            this.intercepted = dVarInterceptContinuation;
        }
        return dVarInterceptContinuation;
    }

    @Override // bv.a
    public void releaseIntercepted() {
        zu.d<?> dVar = this.intercepted;
        if (dVar != null && dVar != this) {
            zu.k kVar = getContext().get(zu.f.f98853b);
            e0.checkNotNull(kVar);
            ((zu.g) kVar).releaseInterceptedContinuation(dVar);
        }
        this.intercepted = c.f11342b;
    }

    public d(zu.d<Object> dVar) {
        this(dVar, dVar != null ? dVar.getContext() : null);
    }
}

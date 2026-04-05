package kotlinx.coroutines.flow.internal;

import av.e;
import bv.d;
import bv.h;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kv.q;
import sv.d0;
import tu.x0;
import tu.z;
import zu.k;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SafeCollector<T> extends d implements FlowCollector<T> {
    public final m collectContext;
    public final int collectContextSize;
    public final FlowCollector<T> collector;
    private zu.d<? super x0> completion_;
    private m lastEmissionContext;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeCollector(FlowCollector<? super T> flowCollector, m mVar) {
        super(NoOpContinuation.INSTANCE, n.f98854b);
        this.collector = flowCollector;
        this.collectContext = mVar;
        this.collectContextSize = ((Number) mVar.fold(0, new a1.n(10))).intValue();
    }

    private final void checkContext(m mVar, m mVar2, T t10) {
        if (mVar2 instanceof DownstreamExceptionContext) {
            exceptionTransparencyViolated((DownstreamExceptionContext) mVar2, t10);
        }
        SafeCollector_commonKt.checkContext(this, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int collectContextSize$lambda$0(int i10, k kVar) {
        return i10 + 1;
    }

    private final void exceptionTransparencyViolated(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        throw new IllegalStateException(d0.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.f71890e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t10, zu.d<? super x0> dVar) {
        try {
            Object objEmit = emit(dVar, (zu.d<? super x0>) t10);
            if (objEmit == e.getCOROUTINE_SUSPENDED()) {
                h.probeCoroutineSuspended(dVar);
            }
            return objEmit == e.getCOROUTINE_SUSPENDED() ? objEmit : x0.f87415a;
        } catch (Throwable th2) {
            this.lastEmissionContext = new DownstreamExceptionContext(th2, dVar.getContext());
            throw th2;
        }
    }

    @Override // bv.a, bv.e
    public bv.e getCallerFrame() {
        zu.d<? super x0> dVar = this.completion_;
        if (dVar instanceof bv.e) {
            return (bv.e) dVar;
        }
        return null;
    }

    @Override // bv.d, bv.a, zu.d
    public m getContext() {
        m mVar = this.lastEmissionContext;
        return mVar == null ? n.f98854b : mVar;
    }

    @Override // bv.a, bv.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // bv.a
    public Object invokeSuspend(Object obj) {
        Throwable thM7134exceptionOrNullimpl = z.m7134exceptionOrNullimpl(obj);
        if (thM7134exceptionOrNullimpl != null) {
            this.lastEmissionContext = new DownstreamExceptionContext(thM7134exceptionOrNullimpl, getContext());
        }
        zu.d<? super x0> dVar = this.completion_;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return e.getCOROUTINE_SUSPENDED();
    }

    @Override // bv.d, bv.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    private final Object emit(zu.d<? super x0> dVar, T t10) {
        m context = dVar.getContext();
        JobKt.ensureActive(context);
        m mVar = this.lastEmissionContext;
        if (mVar != context) {
            checkContext(context, mVar, t10);
            this.lastEmissionContext = context;
        }
        this.completion_ = dVar;
        q qVar = SafeCollectorKt.emitFun;
        FlowCollector<T> flowCollector = this.collector;
        e0.checkNotNull(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        e0.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(flowCollector, t10, this);
        if (!e0.areEqual(objInvoke, e.getCOROUTINE_SUSPENDED())) {
            this.completion_ = null;
        }
        return objInvoke;
    }
}

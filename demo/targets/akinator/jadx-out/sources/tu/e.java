package tu;

import kotlin.jvm.internal.h1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends c implements zu.d {

    /* renamed from: b, reason: collision with root package name */
    public kv.q f87374b;

    /* renamed from: c, reason: collision with root package name */
    public Object f87375c;

    /* renamed from: e, reason: collision with root package name */
    public zu.d f87376e;

    /* renamed from: f, reason: collision with root package name */
    public Object f87377f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(kv.q block, Object obj) {
        super(null);
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        this.f87374b = block;
        this.f87375c = obj;
        kotlin.jvm.internal.e0.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f87376e = this;
        this.f87377f = b.f87360a;
    }

    @Override // tu.c
    public Object callRecursive(Object obj, zu.d<Object> dVar) {
        kotlin.jvm.internal.e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f87376e = dVar;
        this.f87375c = obj;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return coroutine_suspended;
    }

    @Override // zu.d
    public zu.m getContext() {
        return zu.n.f98854b;
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        this.f87376e = null;
        this.f87377f = obj;
    }

    public final Object runCallLoop() {
        while (true) {
            Object obj = this.f87377f;
            zu.d dVar = this.f87376e;
            if (dVar == null) {
                a0.throwOnFailure(obj);
                return obj;
            }
            if (z.m7133equalsimpl0(b.f87360a, obj)) {
                try {
                    kv.q qVar = this.f87374b;
                    Object obj2 = this.f87375c;
                    Object objWrapWithContinuationImpl = !(qVar instanceof bv.a) ? av.b.wrapWithContinuationImpl(qVar, this, obj2, dVar) : ((kv.q) h1.beforeCheckcastToFunctionOfArity(qVar, 3)).invoke(this, obj2, dVar);
                    if (objWrapWithContinuationImpl != av.e.getCOROUTINE_SUSPENDED()) {
                        dVar.resumeWith(z.m7131constructorimpl(objWrapWithContinuationImpl));
                    }
                } catch (Throwable th2) {
                    int i10 = z.f87419c;
                    dVar.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
                }
            } else {
                this.f87377f = b.f87360a;
                dVar.resumeWith(obj);
            }
        }
    }

    @Override // tu.c
    public <U, S> Object callRecursive(a aVar, U u10, zu.d<? super S> dVar) {
        kv.q block$kotlin_stdlib = aVar.getBlock$kotlin_stdlib();
        kotlin.jvm.internal.e0.checkNotNull(block$kotlin_stdlib, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>");
        kv.q qVar = this.f87374b;
        if (block$kotlin_stdlib != qVar) {
            this.f87374b = block$kotlin_stdlib;
            kotlin.jvm.internal.e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f87376e = new d(zu.n.f98854b, this, qVar, dVar);
        } else {
            kotlin.jvm.internal.e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f87376e = dVar;
        }
        this.f87375c = u10;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return coroutine_suspended;
    }
}

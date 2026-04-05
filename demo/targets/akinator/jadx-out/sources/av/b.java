package av;

import bv.h;
import bv.k;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kv.l;
import kv.p;
import kv.q;
import tu.a0;
import tu.x0;
import zu.m;
import zu.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends k {

        /* renamed from: i, reason: collision with root package name */
        public int f8227i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ l f8228j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(zu.d dVar, l lVar) {
            super(dVar);
            this.f8228j = lVar;
            e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.f8227i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f8227i = 2;
                a0.throwOnFailure(obj);
                return obj;
            }
            this.f8227i = 1;
            a0.throwOnFailure(obj);
            l lVar = this.f8228j;
            e0.checkNotNull(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((l) h1.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: av.b$b, reason: collision with other inner class name */
    public static final class C0008b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public int f8229i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ l f8230j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0008b(zu.d dVar, m mVar, l lVar) {
            super(dVar, mVar);
            this.f8230j = lVar;
            e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.f8229i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f8229i = 2;
                a0.throwOnFailure(obj);
                return obj;
            }
            this.f8229i = 1;
            a0.throwOnFailure(obj);
            l lVar = this.f8230j;
            e0.checkNotNull(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((l) h1.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends k {

        /* renamed from: i, reason: collision with root package name */
        public int f8231i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p f8232j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Object f8233k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(zu.d dVar, p pVar, Object obj) {
            super(dVar);
            this.f8232j = pVar;
            this.f8233k = obj;
            e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.f8231i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f8231i = 2;
                a0.throwOnFailure(obj);
                return obj;
            }
            this.f8231i = 1;
            a0.throwOnFailure(obj);
            p pVar = this.f8232j;
            e0.checkNotNull(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((p) h1.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(this.f8233k, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public int f8234i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ p f8235j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Object f8236k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(zu.d dVar, m mVar, p pVar, Object obj) {
            super(dVar, mVar);
            this.f8235j = pVar;
            this.f8236k = obj;
            e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.f8234i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed");
                }
                this.f8234i = 2;
                a0.throwOnFailure(obj);
                return obj;
            }
            this.f8234i = 1;
            a0.throwOnFailure(obj);
            p pVar = this.f8235j;
            e0.checkNotNull(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
            return ((p) h1.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(this.f8236k, this);
        }
    }

    public static final bv.a a(zu.d dVar) {
        m context = dVar.getContext();
        if (context == n.f98854b) {
            e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            return new av.c(dVar);
        }
        e0.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        return new av.d(dVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> zu.d<x0> createCoroutineUnintercepted(l lVar, zu.d<? super T> completion) {
        e0.checkNotNullParameter(lVar, KGUkpTlXZlJLy.TtTQbsxXVVA);
        e0.checkNotNullParameter(completion, "completion");
        zu.d<?> dVarProbeCoroutineCreated = h.probeCoroutineCreated(completion);
        if (lVar instanceof bv.a) {
            return ((bv.a) lVar).create(dVarProbeCoroutineCreated);
        }
        m context = dVarProbeCoroutineCreated.getContext();
        return context == n.f98854b ? new a(dVarProbeCoroutineCreated, lVar) : new C0008b(dVarProbeCoroutineCreated, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> zu.d<T> intercepted(zu.d<? super T> dVar) {
        zu.d<T> dVar2;
        e0.checkNotNullParameter(dVar, "<this>");
        bv.d dVar3 = dVar instanceof bv.d ? (bv.d) dVar : null;
        return (dVar3 == null || (dVar2 = (zu.d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }

    public static final <T> Object wrapWithContinuationImpl(l lVar, zu.d<? super T> completion) {
        e0.checkNotNullParameter(lVar, "<this>");
        e0.checkNotNullParameter(completion, "completion");
        return ((l) h1.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(a(h.probeCoroutineCreated(completion)));
    }

    public static <R, T> Object wrapWithContinuationImpl(p pVar, R r10, zu.d<? super T> completion) {
        e0.checkNotNullParameter(pVar, "<this>");
        e0.checkNotNullParameter(completion, "completion");
        return ((p) h1.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r10, a(h.probeCoroutineCreated(completion)));
    }

    public static <R, P, T> Object wrapWithContinuationImpl(q qVar, R r10, P p10, zu.d<? super T> completion) {
        e0.checkNotNullParameter(qVar, "<this>");
        e0.checkNotNullParameter(completion, "completion");
        return ((q) h1.beforeCheckcastToFunctionOfArity(qVar, 3)).invoke(r10, p10, a(h.probeCoroutineCreated(completion)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <R, T> zu.d<x0> createCoroutineUnintercepted(p pVar, R r10, zu.d<? super T> completion) {
        e0.checkNotNullParameter(pVar, "<this>");
        e0.checkNotNullParameter(completion, "completion");
        zu.d<?> dVarProbeCoroutineCreated = h.probeCoroutineCreated(completion);
        if (pVar instanceof bv.a) {
            return ((bv.a) pVar).create(r10, dVarProbeCoroutineCreated);
        }
        m context = dVarProbeCoroutineCreated.getContext();
        if (context == n.f98854b) {
            return new c(dVarProbeCoroutineCreated, pVar, r10);
        }
        return new d(dVarProbeCoroutineCreated, context, pVar, r10);
    }
}

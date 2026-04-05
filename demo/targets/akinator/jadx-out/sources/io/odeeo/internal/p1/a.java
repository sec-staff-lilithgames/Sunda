package io.odeeo.internal.p1;

import av.e;
import bv.f;
import bv.n;
import io.odeeo.internal.a.c;
import java.lang.Throwable;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a<V, E extends Throwable, P> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineDispatcher f65785a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "io.odeeo.sdk.usecase.ResultParamUseCase$invoke$2", f = "ResultUseCase.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.odeeo.internal.p1.a$a, reason: collision with other inner class name */
    public static final class C0636a extends n implements p {

        /* renamed from: a, reason: collision with root package name */
        public int f65786a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a<V, E, P> f65787b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ P f65788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0636a(a<V, E, P> aVar, P p10, d<? super C0636a> dVar) {
            super(2, dVar);
            this.f65787b = aVar;
            this.f65788c = p10;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new C0636a(this.f65787b, this.f65788c, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f65786a;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                a<V, E, P> aVar = this.f65787b;
                P p10 = this.f65788c;
                this.f65786a = 1;
                obj = aVar.execute(p10, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            c cVar = (c) obj;
            if (cVar instanceof io.odeeo.internal.a.a) {
            }
            return cVar;
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super c<? extends V, ? extends E>> dVar) {
            return ((C0636a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public a(CoroutineDispatcher dispatcher) {
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        this.f65785a = dispatcher;
    }

    public abstract Object execute(P p10, d<? super c<? extends V, ? extends E>> dVar);

    public final Object invoke(P p10, d<? super c<? extends V, ? extends E>> dVar) {
        return BuildersKt.withContext(this.f65785a, new C0636a(this, p10, null), dVar);
    }
}

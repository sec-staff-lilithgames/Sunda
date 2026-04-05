package kotlinx.coroutines.selects;

import av.b;
import av.e;
import bv.f;
import bv.n;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kv.p;
import tu.a0;
import tu.x0;
import tu.z;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class UnbiasedSelectBuilderImpl<R> extends UnbiasedSelectImplementation<R> {
    private final CancellableContinuationImpl<R> cont;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @f(c = "kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1", f = "SelectOld.kt", i = {}, l = {TokenParametersOuterClass$TokenParameters.IGNITEVERSION_FIELD_NUMBER}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$initSelectResult$1, reason: invalid class name */
    public static final class AnonymousClass1 extends n implements p {
        int label;
        final /* synthetic */ UnbiasedSelectBuilderImpl<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UnbiasedSelectBuilderImpl<R> unbiasedSelectBuilderImpl, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = unbiasedSelectBuilderImpl;
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            x0 x0Var = x0.f87415a;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    UnbiasedSelectBuilderImpl<R> unbiasedSelectBuilderImpl = this.this$0;
                    this.label = 1;
                    obj = unbiasedSelectBuilderImpl.doSelect(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                SelectOldKt.resumeUndispatched(((UnbiasedSelectBuilderImpl) this.this$0).cont, obj);
                return x0Var;
            } catch (Throwable th2) {
                SelectOldKt.resumeUndispatchedWithException(((UnbiasedSelectBuilderImpl) this.this$0).cont, th2);
                return x0Var;
            }
        }

        @Override // kv.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }
    }

    public UnbiasedSelectBuilderImpl(d<? super R> dVar) {
        super(dVar.getContext());
        this.cont = new CancellableContinuationImpl<>(b.intercepted(dVar), 1);
    }

    public final void handleBuilderException(Throwable th2) {
        CancellableContinuationImpl<R> cancellableContinuationImpl = this.cont;
        int i10 = z.f87419c;
        cancellableContinuationImpl.resumeWith(z.m7131constructorimpl(a0.createFailure(th2)));
    }

    public final Object initSelectResult() {
        if (this.cont.isCompleted()) {
            return this.cont.getResult();
        }
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(getContext()), null, CoroutineStart.UNDISPATCHED, new AnonymousClass1(this, null), 1, null);
        return this.cont.getResult();
    }
}

package o0;

import c0.i0;
import c0.m2;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77347i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f77348j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(q qVar, zu.d dVar) {
        super(2, dVar);
        this.f77348j = qVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new l(this.f77348j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77347i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            c0.e eVar = this.f77348j.f77364h;
            Float fBoxFloat = bv.b.boxFloat(1.0f);
            m2 m2VarTween$default = c0.o.tween$default(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE, 0, i0.getFastOutSlowInEasing(), 2, null);
            this.f77347i = 1;
            if (c0.e.animateTo$default(eVar, fBoxFloat, m2VarTween$default, null, null, this, 12, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

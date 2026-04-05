package y9;

import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import y9.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends bv.n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f94163i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f94164j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f94165k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, int i10, zu.d dVar) {
        super(2, dVar);
        this.f94164j = fVar;
        this.f94165k = i10;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c(this.f94164j, this.f94165k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f94163i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            f fVar = this.f94164j;
            f.a aVar = new f.a(fVar, fVar, fVar.f94173c, this.f94165k, fVar.f94176g);
            this.f94163i = 1;
            if (aVar.execute(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

package a7;

import kotlinx.coroutines.CoroutineScope;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f4133i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f4134j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l7.i f4135k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(q qVar, l7.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f4134j = qVar;
        this.f4135k = iVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new r(this.f4134j, this.f4135k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f4133i;
        q qVar = this.f4134j;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            this.f4133i = 1;
            obj = q.access$executeMain(qVar, this.f4135k, 0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        if (((l7.k) obj) instanceof l7.f) {
            qVar.getLogger();
        }
        return obj;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super l7.k> dVar) {
        return ((r) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

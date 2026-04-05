package q5;

import kotlin.jvm.internal.b1;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public b1 f82421i;

    /* renamed from: j, reason: collision with root package name */
    public int f82422j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f82423k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ q f82424l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b1 b1Var, q qVar, zu.d<? super h> dVar) {
        super(2, dVar);
        this.f82423k = b1Var;
        this.f82424l = qVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new h(this.f82423k, this.f82424l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        b1 b1Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f82422j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            b1 b1Var2 = this.f82423k;
            this.f82421i = b1Var2;
            this.f82422j = 1;
            Object objAcquire = this.f82424l.acquire(this);
            if (objAcquire == coroutine_suspended) {
                return coroutine_suspended;
            }
            b1Var = b1Var2;
            obj = objAcquire;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b1Var = this.f82421i;
            tu.a0.throwOnFailure(obj);
        }
        b1Var.f71816b = obj;
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

package y6;

import bv.n;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import r6.l;
import sh.n1;
import tu.a0;
import tu.x0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f94091i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f94092j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b0 f94093k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f94094l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n1 f94095m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(l lVar, b0 b0Var, AtomicInteger atomicInteger, n1 n1Var, zu.d dVar) {
        super(2, dVar);
        this.f94092j = lVar;
        this.f94093k = b0Var;
        this.f94094l = atomicInteger;
        this.f94095m = n1Var;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c(this.f94092j, this.f94093k, this.f94094l, this.f94095m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f94091i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            this.f94091i = 1;
            obj = i.access$awaitConstraintsNotMet(this.f94092j, this.f94093k, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        this.f94094l.set(((Number) obj).intValue());
        this.f94095m.cancel(true);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

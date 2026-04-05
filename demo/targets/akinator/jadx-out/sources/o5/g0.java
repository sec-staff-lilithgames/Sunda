package o5;

import java.util.Arrays;
import java.util.Set;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Set f77572i;

    /* renamed from: j, reason: collision with root package name */
    public int f77573j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String[] f77574k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f0 f77575l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(String[] strArr, f0 f0Var, zu.d dVar) {
        super(2, dVar);
        this.f77574k = strArr;
        this.f77575l = f0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new g0(this.f77574k, this.f77575l, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Set<String> set;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77573j;
        f0 f0Var = this.f77575l;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            String[] strArr = this.f77574k;
            Set<String> of2 = uu.c2.setOf(Arrays.copyOf(strArr, strArr.length));
            MutableSharedFlow mutableSharedFlow = f0Var.f77554h;
            this.f77572i = of2;
            this.f77573j = 1;
            if (mutableSharedFlow.emit(of2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            set = of2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = this.f77572i;
            tu.a0.throwOnFailure(obj);
        }
        f0Var.getInvalidationTracker().notifyObserversByTableNames$room_runtime_release(set);
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((g0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

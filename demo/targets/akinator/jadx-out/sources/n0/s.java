package n0;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f75184i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0.o f75185j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList f75186k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(f0.o oVar, SnapshotStateList snapshotStateList, zu.d dVar) {
        super(2, dVar);
        this.f75185j = oVar;
        this.f75186k = snapshotStateList;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new s(this.f75185j, this.f75186k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f75184i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            Flow<f0.n> interactions = this.f75185j.getInteractions();
            r rVar = new r(this.f75186k);
            this.f75184i = 1;
            if (interactions.collect(rVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((s) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

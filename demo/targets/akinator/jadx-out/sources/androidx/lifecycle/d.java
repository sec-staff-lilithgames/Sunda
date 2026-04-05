package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f6536i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f6537j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, zu.d dVar) {
        super(2, dVar);
        this.f6537j = fVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f6537j, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6536i;
        f fVar = this.f6537j;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            long j10 = fVar.f6566c;
            this.f6536i = 1;
            if (DelayKt.delay(j10, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        if (!fVar.f6564a.hasActiveObservers()) {
            Job job = fVar.f6569f;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            fVar.f6569f = null;
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

package nr;

import av.e;
import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f77193i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77194j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f77195k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f77196l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Runnable f77197m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(long j10, b bVar, Runnable runnable, d dVar) {
        super(2, dVar);
        this.f77195k = j10;
        this.f77196l = bVar;
        this.f77197m = runnable;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        a aVar = new a(this.f77195k, this.f77196l, this.f77197m, dVar);
        aVar.f77194j = obj;
        return aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Runnable runnable = this.f77197m;
        Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
        int i10 = this.f77193i;
        if (i10 == 0) {
            a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f77194j;
            long j10 = this.f77195k;
            if (j10 > 0) {
                this.f77194j = coroutineScope;
                this.f77193i = 1;
                if (DelayKt.delay(j10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
        }
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
        this.f77196l.cancel(runnable);
        return x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Mutex f6571i;

    /* renamed from: j, reason: collision with root package name */
    public kv.p f6572j;

    /* renamed from: k, reason: collision with root package name */
    public int f6573k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Mutex f6574l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kv.p f6575m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(Mutex mutex, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f6574l = mutex;
        this.f6575m = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new f2(this.f6574l, this.f6575m, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Mutex mutex;
        kv.p pVar;
        Mutex mutex2;
        Throwable th2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f6573k;
        try {
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                mutex = this.f6574l;
                this.f6571i = mutex;
                pVar = this.f6575m;
                this.f6572j = pVar;
                this.f6573k = 1;
                if (mutex.lock(null, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = this.f6571i;
                try {
                    tu.a0.throwOnFailure(obj);
                    mutex2.unlock(null);
                    return tu.x0.f87415a;
                } catch (Throwable th3) {
                    th2 = th3;
                    mutex2.unlock(null);
                    throw th2;
                }
            }
            pVar = this.f6572j;
            Mutex mutex3 = this.f6571i;
            tu.a0.throwOnFailure(obj);
            mutex = mutex3;
            e2 e2Var = new e2(pVar, null);
            this.f6571i = mutex;
            this.f6572j = null;
            this.f6573k = 2;
            if (CoroutineScopeKt.coroutineScope(e2Var, this) != coroutine_suspended) {
                mutex2 = mutex;
                mutex2.unlock(null);
                return tu.x0.f87415a;
            }
            return coroutine_suspended;
        } catch (Throwable th4) {
            mutex2 = mutex;
            th2 = th4;
            mutex2.unlock(null);
            throw th2;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((f2) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

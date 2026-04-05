package c0;

import c0.v0;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Mutex f11661i;

    /* renamed from: j, reason: collision with root package name */
    public Object f11662j;

    /* renamed from: k, reason: collision with root package name */
    public Object f11663k;

    /* renamed from: l, reason: collision with root package name */
    public v0 f11664l;

    /* renamed from: m, reason: collision with root package name */
    public int f11665m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f11666n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u0 f11667o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v0 f11668p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kv.p f11669q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11670r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u0 u0Var, v0 v0Var, kv.p pVar, Object obj, zu.d dVar) {
        super(2, dVar);
        this.f11667o = u0Var;
        this.f11668p = v0Var;
        this.f11669q = pVar;
        this.f11670r = obj;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        x0 x0Var = new x0(this.f11667o, this.f11668p, this.f11669q, this.f11670r, dVar);
        x0Var.f11666n = obj;
        return x0Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        Object obj2;
        v0.a aVar;
        Mutex mutex;
        kv.p pVar;
        v0 v0Var2;
        Throwable th2;
        v0.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f11665m;
        try {
            try {
                if (r12 == 0) {
                    tu.a0.throwOnFailure(obj);
                    zu.k kVar = ((CoroutineScope) this.f11666n).getCoroutineContext().get(Job.Key);
                    kotlin.jvm.internal.e0.checkNotNull(kVar);
                    v0.a aVar3 = new v0.a(this.f11667o, (Job) kVar);
                    v0Var = this.f11668p;
                    v0.access$tryMutateOrCancel(v0Var, aVar3);
                    Mutex mutex2 = v0Var.f11642b;
                    this.f11666n = aVar3;
                    this.f11661i = mutex2;
                    kv.p pVar2 = this.f11669q;
                    this.f11662j = pVar2;
                    Object obj3 = this.f11670r;
                    this.f11663k = obj3;
                    this.f11664l = v0Var;
                    this.f11665m = 1;
                    if (mutex2.lock(null, this) != coroutine_suspended) {
                        obj2 = obj3;
                        aVar = aVar3;
                        mutex = mutex2;
                        pVar = pVar2;
                    }
                    return coroutine_suspended;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v0Var2 = (v0) this.f11662j;
                    mutex = this.f11661i;
                    aVar2 = (v0.a) this.f11666n;
                    try {
                        tu.a0.throwOnFailure(obj);
                        atomicReference2 = v0Var2.f11641a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        mutex.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = v0Var2.f11641a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                v0 v0Var3 = this.f11664l;
                obj2 = this.f11663k;
                pVar = (kv.p) this.f11662j;
                Mutex mutex3 = this.f11661i;
                aVar = (v0.a) this.f11666n;
                tu.a0.throwOnFailure(obj);
                v0Var = v0Var3;
                mutex = mutex3;
                this.f11666n = aVar;
                this.f11661i = mutex;
                this.f11662j = v0Var;
                this.f11663k = null;
                this.f11664l = null;
                this.f11665m = 2;
                Object objInvoke = pVar.invoke(obj2, this);
                if (objInvoke != coroutine_suspended) {
                    v0Var2 = v0Var;
                    obj = objInvoke;
                    aVar2 = aVar;
                    atomicReference2 = v0Var2.f11641a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    mutex.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                v0Var2 = v0Var;
                th2 = th4;
                aVar2 = aVar;
                atomicReference = v0Var2.f11641a;
                while (!atomicReference.compareAndSet(aVar2, null) && atomicReference.get() == aVar2) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            r12.unlock(null);
            throw th5;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((x0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

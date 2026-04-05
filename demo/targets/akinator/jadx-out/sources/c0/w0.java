package c0;

import c0.v0;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Mutex f11648i;

    /* renamed from: j, reason: collision with root package name */
    public Object f11649j;

    /* renamed from: k, reason: collision with root package name */
    public v0 f11650k;

    /* renamed from: l, reason: collision with root package name */
    public int f11651l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f11652m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ u0 f11653n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v0 f11654o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kv.l f11655p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var, v0 v0Var, kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f11653n = u0Var;
        this.f11654o = v0Var;
        this.f11655p = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        w0 w0Var = new w0(this.f11653n, this.f11654o, this.f11655p, dVar);
        w0Var.f11652m = obj;
        return w0Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        Mutex mutex;
        kv.l lVar;
        v0.a aVar;
        Mutex mutex2;
        v0 v0Var2;
        Throwable th2;
        v0.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f11651l;
        try {
            try {
                if (r12 == 0) {
                    tu.a0.throwOnFailure(obj);
                    zu.k kVar = ((CoroutineScope) this.f11652m).getCoroutineContext().get(Job.Key);
                    kotlin.jvm.internal.e0.checkNotNull(kVar);
                    v0.a aVar3 = new v0.a(this.f11653n, (Job) kVar);
                    v0Var = this.f11654o;
                    v0.access$tryMutateOrCancel(v0Var, aVar3);
                    mutex = v0Var.f11642b;
                    this.f11652m = aVar3;
                    this.f11648i = mutex;
                    kv.l lVar2 = this.f11655p;
                    this.f11649j = lVar2;
                    this.f11650k = v0Var;
                    this.f11651l = 1;
                    if (mutex.lock(null, this) != coroutine_suspended) {
                        lVar = lVar2;
                        aVar = aVar3;
                    }
                    return coroutine_suspended;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v0Var2 = (v0) this.f11649j;
                    mutex2 = this.f11648i;
                    aVar2 = (v0.a) this.f11652m;
                    try {
                        tu.a0.throwOnFailure(obj);
                        atomicReference2 = v0Var2.f11641a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        mutex2.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = v0Var2.f11641a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                v0 v0Var3 = this.f11650k;
                lVar = (kv.l) this.f11649j;
                mutex = this.f11648i;
                aVar = (v0.a) this.f11652m;
                tu.a0.throwOnFailure(obj);
                v0Var = v0Var3;
                this.f11652m = aVar;
                this.f11648i = mutex2;
                this.f11649j = v0Var;
                this.f11650k = null;
                this.f11651l = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke != coroutine_suspended) {
                    v0Var2 = v0Var;
                    obj = objInvoke;
                    aVar2 = aVar;
                    atomicReference2 = v0Var2.f11641a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    mutex2.unlock(null);
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
            mutex2 = mutex;
        } catch (Throwable th5) {
            r12.unlock(null);
            throw th5;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((w0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

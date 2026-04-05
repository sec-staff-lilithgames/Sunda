package d0;

import d0.m3;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Mutex f51522i;

    /* renamed from: j, reason: collision with root package name */
    public Object f51523j;

    /* renamed from: k, reason: collision with root package name */
    public m3 f51524k;

    /* renamed from: l, reason: collision with root package name */
    public int f51525l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f51526m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l3 f51527n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m3 f51528o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kv.l f51529p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(l3 l3Var, m3 m3Var, kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f51527n = l3Var;
        this.f51528o = m3Var;
        this.f51529p = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        n3 n3Var = new n3(this.f51527n, this.f51528o, this.f51529p, dVar);
        n3Var.f51526m = obj;
        return n3Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        m3 m3Var;
        Mutex mutex;
        kv.l lVar;
        m3.a aVar;
        Mutex mutex2;
        m3 m3Var2;
        Throwable th2;
        m3.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f51525l;
        try {
            try {
                if (r12 == 0) {
                    tu.a0.throwOnFailure(obj);
                    zu.k kVar = ((CoroutineScope) this.f51526m).getCoroutineContext().get(Job.Key);
                    kotlin.jvm.internal.e0.checkNotNull(kVar);
                    m3.a aVar3 = new m3.a(this.f51527n, (Job) kVar);
                    m3Var = this.f51528o;
                    m3.access$tryMutateOrCancel(m3Var, aVar3);
                    mutex = m3Var.f51504b;
                    this.f51526m = aVar3;
                    this.f51522i = mutex;
                    kv.l lVar2 = this.f51529p;
                    this.f51523j = lVar2;
                    this.f51524k = m3Var;
                    this.f51525l = 1;
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
                    m3Var2 = (m3) this.f51523j;
                    mutex2 = this.f51522i;
                    aVar2 = (m3.a) this.f51526m;
                    try {
                        tu.a0.throwOnFailure(obj);
                        atomicReference2 = m3Var2.f51503a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        mutex2.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = m3Var2.f51503a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                m3 m3Var3 = this.f51524k;
                lVar = (kv.l) this.f51523j;
                mutex = this.f51522i;
                aVar = (m3.a) this.f51526m;
                tu.a0.throwOnFailure(obj);
                m3Var = m3Var3;
                this.f51526m = aVar;
                this.f51522i = mutex2;
                this.f51523j = m3Var;
                this.f51524k = null;
                this.f51525l = 2;
                Object objInvoke = lVar.invoke(this);
                if (objInvoke != coroutine_suspended) {
                    m3Var2 = m3Var;
                    obj = objInvoke;
                    aVar2 = aVar;
                    atomicReference2 = m3Var2.f51503a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    mutex2.unlock(null);
                    return obj;
                }
                return coroutine_suspended;
            } catch (Throwable th4) {
                m3Var2 = m3Var;
                th2 = th4;
                aVar2 = aVar;
                atomicReference = m3Var2.f51503a;
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
        return ((n3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

package d0;

import d0.m3;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Mutex f51544i;

    /* renamed from: j, reason: collision with root package name */
    public Object f51545j;

    /* renamed from: k, reason: collision with root package name */
    public Object f51546k;

    /* renamed from: l, reason: collision with root package name */
    public m3 f51547l;

    /* renamed from: m, reason: collision with root package name */
    public int f51548m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f51549n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l3 f51550o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m3 f51551p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kv.p f51552q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f51553r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(l3 l3Var, m3 m3Var, kv.p pVar, Object obj, zu.d dVar) {
        super(2, dVar);
        this.f51550o = l3Var;
        this.f51551p = m3Var;
        this.f51552q = pVar;
        this.f51553r = obj;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        o3 o3Var = new o3(this.f51550o, this.f51551p, this.f51552q, this.f51553r, dVar);
        o3Var.f51549n = obj;
        return o3Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.sync.Mutex] */
    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        m3 m3Var;
        Object obj2;
        m3.a aVar;
        Mutex mutex;
        kv.p pVar;
        m3 m3Var2;
        Throwable th2;
        m3.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        ?? r12 = this.f51548m;
        try {
            try {
                if (r12 == 0) {
                    tu.a0.throwOnFailure(obj);
                    zu.k kVar = ((CoroutineScope) this.f51549n).getCoroutineContext().get(Job.Key);
                    kotlin.jvm.internal.e0.checkNotNull(kVar);
                    m3.a aVar3 = new m3.a(this.f51550o, (Job) kVar);
                    m3Var = this.f51551p;
                    m3.access$tryMutateOrCancel(m3Var, aVar3);
                    Mutex mutex2 = m3Var.f51504b;
                    this.f51549n = aVar3;
                    this.f51544i = mutex2;
                    kv.p pVar2 = this.f51552q;
                    this.f51545j = pVar2;
                    Object obj3 = this.f51553r;
                    this.f51546k = obj3;
                    this.f51547l = m3Var;
                    this.f51548m = 1;
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
                    m3Var2 = (m3) this.f51545j;
                    mutex = this.f51544i;
                    aVar2 = (m3.a) this.f51549n;
                    try {
                        tu.a0.throwOnFailure(obj);
                        atomicReference2 = m3Var2.f51503a;
                        while (!atomicReference2.compareAndSet(aVar2, null) && atomicReference2.get() == aVar2) {
                        }
                        mutex.unlock(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = m3Var2.f51503a;
                        while (!atomicReference.compareAndSet(aVar2, null)) {
                        }
                        throw th2;
                    }
                }
                m3 m3Var3 = this.f51547l;
                obj2 = this.f51546k;
                pVar = (kv.p) this.f51545j;
                Mutex mutex3 = this.f51544i;
                aVar = (m3.a) this.f51549n;
                tu.a0.throwOnFailure(obj);
                m3Var = m3Var3;
                mutex = mutex3;
                this.f51549n = aVar;
                this.f51544i = mutex;
                this.f51545j = m3Var;
                this.f51546k = null;
                this.f51547l = null;
                this.f51548m = 2;
                Object objInvoke = pVar.invoke(obj2, this);
                if (objInvoke != coroutine_suspended) {
                    m3Var2 = m3Var;
                    obj = objInvoke;
                    aVar2 = aVar;
                    atomicReference2 = m3Var2.f51503a;
                    while (!atomicReference2.compareAndSet(aVar2, null)) {
                    }
                    mutex.unlock(null);
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
        } catch (Throwable th5) {
            r12.unlock(null);
            throw th5;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<Object> dVar) {
        return ((o3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

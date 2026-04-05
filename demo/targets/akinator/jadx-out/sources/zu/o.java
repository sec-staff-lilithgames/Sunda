package zu;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import qm.zMPW.GalEuEfxjome;
import tu.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements d, bv.e {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f98855c;

    /* renamed from: b, reason: collision with root package name */
    public final d f98856b;
    private volatile Object result;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
        f98855c = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "result");
    }

    public o(d<Object> dVar, Object obj) {
        e0.checkNotNullParameter(dVar, GalEuEfxjome.BDRuBKiZRau);
        this.f98856b = dVar;
        this.result = obj;
    }

    @Override // bv.e
    public bv.e getCallerFrame() {
        d dVar = this.f98856b;
        if (dVar instanceof bv.e) {
            return (bv.e) dVar;
        }
        return null;
    }

    @Override // zu.d
    public m getContext() {
        return this.f98856b.getContext();
    }

    public final Object getOrThrow() throws Throwable {
        Object obj = this.result;
        av.a aVar = av.a.f8223c;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f98855c;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, coroutine_suspended)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return av.e.getCOROUTINE_SUSPENDED();
        }
        if (obj == av.a.f8224e) {
            return av.e.getCOROUTINE_SUSPENDED();
        }
        if (obj instanceof y) {
            throw ((y) obj).f87416b;
        }
        return obj;
    }

    @Override // bv.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // zu.d
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            av.a aVar = av.a.f8223c;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f98855c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            if (obj2 != av.e.getCOROUTINE_SUSPENDED()) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f98855c;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            av.a aVar2 = av.a.f8224e;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutine_suspended, aVar2)) {
                if (atomicReferenceFieldUpdater2.get(this) != coroutine_suspended) {
                    break;
                }
            }
            this.f98856b.resumeWith(obj);
            return;
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f98856b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(d<Object> delegate) {
        this(delegate, av.a.f8223c);
        e0.checkNotNullParameter(delegate, "delegate");
    }
}

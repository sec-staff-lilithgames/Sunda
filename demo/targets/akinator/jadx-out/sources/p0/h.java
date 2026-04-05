package p0;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h implements d2 {

    /* renamed from: b, reason: collision with root package name */
    public final kv.a f80223b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f80224c;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f80225e;

    /* renamed from: f, reason: collision with root package name */
    public final z0.a f80226f;

    /* renamed from: g, reason: collision with root package name */
    public z.t0 f80227g;

    /* renamed from: h, reason: collision with root package name */
    public z.t0 f80228h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public kv.l f80229a;

        /* renamed from: b, reason: collision with root package name */
        public CancellableContinuation f80230b;

        public a(kv.l lVar, CancellableContinuation<Object> cancellableContinuation) {
            this.f80229a = lVar;
            this.f80230b = cancellableContinuation;
        }

        public final void cancel() {
            this.f80229a = null;
            this.f80230b = null;
        }

        public final void resume(long j10) {
            CancellableContinuation cancellableContinuation;
            Object objM7131constructorimpl;
            kv.l lVar = this.f80229a;
            if (lVar == null || (cancellableContinuation = this.f80230b) == null) {
                return;
            }
            try {
                int i10 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(lVar.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            cancellableContinuation.resumeWith(objM7131constructorimpl);
        }

        public final void resumeWithException(Throwable th2) {
            CancellableContinuation cancellableContinuation = this.f80230b;
            if (cancellableContinuation != null) {
                int i10 = tu.z.f87419c;
                cancellableContinuation.resumeWith(tu.z.m7131constructorimpl(tu.a0.createFailure(th2)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void cancel$default(h hVar, CancellationException cancellationException, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cancellationException = new CancellationException("clock cancelled");
        }
        hVar.cancel(cancellationException);
    }

    public final void a(Throwable th2) {
        int i10;
        synchronized (this.f80224c) {
            try {
                if (this.f80225e != null) {
                    return;
                }
                this.f80225e = th2;
                z.t0 t0Var = this.f80227g;
                Object[] objArr = t0Var.f96812a;
                int i11 = t0Var.f96813b;
                for (int i12 = 0; i12 < i11; i12++) {
                    ((a) objArr[i12]).resumeWithException(th2);
                }
                this.f80227g.clear();
                z0.a aVar = this.f80226f;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, g.m5806access$packimpl(aVar, ((i10 >>> 27) & 15) + 1, 0)));
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void cancel(CancellationException cancellationException) {
        a(cancellationException);
    }

    @Override // p0.d2, zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) b2.fold(this, r10, pVar);
    }

    @Override // p0.d2, zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) b2.get(this, lVar);
    }

    public final boolean getHasAwaiters() {
        return (this.f80226f.get() & 134217727) > 0;
    }

    @Override // p0.d2, zu.k
    public /* bridge */ /* synthetic */ zu.l getKey() {
        return super.getKey();
    }

    @Override // p0.d2, zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return b2.minusKey(this, lVar);
    }

    @Override // p0.d2, zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return b2.plus(this, mVar);
    }

    public final void sendFrame(long j10) {
        int i10;
        int i11;
        synchronized (this.f80224c) {
            try {
                z.t0 t0Var = this.f80227g;
                this.f80227g = this.f80228h;
                this.f80228h = t0Var;
                z0.a aVar = this.f80226f;
                do {
                    i10 = aVar.get();
                } while (!aVar.compareAndSet(i10, g.m5806access$packimpl(aVar, ((i10 >>> 27) & 15) + 1, 0)));
                int size = t0Var.getSize();
                for (i11 = 0; i11 < size; i11++) {
                    ((a) t0Var.get(i11)).resume(j10);
                }
                t0Var.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p0.d2
    public <R> Object withFrameNanos(kv.l lVar, zu.d<? super R> dVar) {
        int i10;
        int i11;
        boolean z10 = true;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        a aVar = new a(lVar, cancellableContinuationImpl);
        kotlin.jvm.internal.z0 z0Var = new kotlin.jvm.internal.z0();
        z0Var.f71866b = -1;
        synchronized (this.f80224c) {
            Throwable th2 = this.f80225e;
            if (th2 != null) {
                int i12 = tu.z.f87419c;
                cancellableContinuationImpl.resumeWith(tu.z.m7131constructorimpl(tu.a0.createFailure(th2)));
            } else {
                z0.a aVar2 = this.f80226f;
                do {
                    i10 = aVar2.get();
                    i11 = i10 + 1;
                } while (!aVar2.compareAndSet(i10, i11));
                if ((134217727 & i11) != 1) {
                    z10 = false;
                }
                z0Var.f71866b = (i11 >>> 27) & 15;
                this.f80227g.add(aVar);
                cancellableContinuationImpl.invokeOnCancellation(new i(aVar, this, z0Var));
                if (z10 && this.f80223b != null) {
                    try {
                        this.f80223b.invoke();
                    } catch (Throwable th3) {
                        a(th3);
                    }
                }
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    public h(kv.a aVar) {
        this.f80223b = aVar;
        this.f80224c = new Object();
        this.f80226f = g.m5808constructorimpl();
        int i10 = 0;
        int i11 = 1;
        kotlin.jvm.internal.u uVar = null;
        this.f80227g = new z.t0(i10, i11, uVar);
        this.f80228h = new z.t0(i10, i11, uVar);
    }

    public /* synthetic */ h(kv.a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : aVar);
    }
}

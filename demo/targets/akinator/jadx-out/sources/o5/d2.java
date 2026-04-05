package o5;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 implements zu.k {

    /* renamed from: e, reason: collision with root package name */
    public static final a f77529e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final zu.g f77530b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f77531c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements zu.l {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    public d2(zu.g transactionDispatcher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(transactionDispatcher, "transactionDispatcher");
        this.f77530b = transactionDispatcher;
        this.f77531c = new AtomicInteger(0);
    }

    public final void acquire() {
        this.f77531c.incrementAndGet();
    }

    @Override // zu.k, zu.m
    public <R> R fold(R r10, kv.p pVar) {
        return (R) zu.j.fold(this, r10, pVar);
    }

    @Override // zu.k, zu.m
    public <E extends zu.k> E get(zu.l lVar) {
        return (E) zu.j.get(this, lVar);
    }

    @Override // zu.k
    public zu.l getKey() {
        return f77529e;
    }

    public final zu.g getTransactionDispatcher$room_runtime_release() {
        return this.f77530b;
    }

    @Override // zu.k, zu.m
    public zu.m minusKey(zu.l lVar) {
        return zu.j.minusKey(this, lVar);
    }

    @Override // zu.k, zu.m
    public zu.m plus(zu.m mVar) {
        return zu.j.plus(this, mVar);
    }

    public final void release() {
        if (this.f77531c.decrementAndGet() < 0) {
            throw new IllegalStateException("Transaction was never started or was already released.");
        }
    }
}

package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ra extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: m, reason: collision with root package name */
    public static final qa f10923m;

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10924b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10925c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10926e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10927f;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10929h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10930i;

    /* renamed from: j, reason: collision with root package name */
    public pt.c f10931j;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f10933l;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReference f10932k = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    public final iu.d f10928g = new iu.d();

    static {
        qa qaVar = new qa(null, -1L, 1);
        f10923m = qaVar;
        qaVar.cancel();
    }

    public ra(mt.i0 i0Var, st.o oVar, int i10, boolean z10) {
        this.f10924b = i0Var;
        this.f10925c = oVar;
        this.f10926e = i10;
        this.f10927f = z10;
    }

    public final void a() {
        qa qaVar;
        AtomicReference atomicReference = this.f10932k;
        qa qaVar2 = (qa) atomicReference.get();
        qa qaVar3 = f10923m;
        if (qaVar2 == qaVar3 || (qaVar = (qa) atomicReference.getAndSet(qaVar3)) == qaVar3 || qaVar == null) {
            return;
        }
        qaVar.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bu.ra.b():void");
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10930i) {
            return;
        }
        this.f10930i = true;
        this.f10931j.dispose();
        a();
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10930i;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10929h) {
            return;
        }
        this.f10929h = true;
        b();
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10929h || !this.f10928g.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!this.f10927f) {
            a();
        }
        this.f10929h = true;
        b();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        long j10 = this.f10933l + 1;
        this.f10933l = j10;
        qa qaVar = (qa) this.f10932k.get();
        if (qaVar != null) {
            qaVar.cancel();
        }
        try {
            mt.g0 g0Var = (mt.g0) ut.o0.requireNonNull(this.f10925c.apply(obj), "The ObservableSource returned is null");
            qa qaVar2 = new qa(this, j10, this.f10926e);
            while (true) {
                qa qaVar3 = (qa) this.f10932k.get();
                if (qaVar3 == f10923m) {
                    return;
                }
                AtomicReference atomicReference = this.f10932k;
                while (!atomicReference.compareAndSet(qaVar3, qaVar2)) {
                    if (atomicReference.get() != qaVar3) {
                        break;
                    }
                }
                g0Var.subscribe(qaVar2);
                return;
            }
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            this.f10931j.dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.validate(this.f10931j, cVar)) {
            this.f10931j = cVar;
            this.f10924b.onSubscribe(this);
        }
    }
}

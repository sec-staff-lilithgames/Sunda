package bu;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t0 extends a implements mt.i0 {

    /* renamed from: m, reason: collision with root package name */
    public static final r0[] f10993m = new r0[0];

    /* renamed from: n, reason: collision with root package name */
    public static final r0[] f10994n = new r0[0];

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f10995c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10996e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f10997f;

    /* renamed from: g, reason: collision with root package name */
    public volatile long f10998g;

    /* renamed from: h, reason: collision with root package name */
    public final s0 f10999h;

    /* renamed from: i, reason: collision with root package name */
    public s0 f11000i;

    /* renamed from: j, reason: collision with root package name */
    public int f11001j;

    /* renamed from: k, reason: collision with root package name */
    public Throwable f11002k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f11003l;

    public t0(mt.b0 b0Var, int i10) {
        super(b0Var);
        this.f10996e = i10;
        this.f10995c = new AtomicBoolean();
        s0 s0Var = new s0(i10, 0);
        this.f10999h = s0Var;
        this.f11000i = s0Var;
        this.f10997f = new AtomicReference(f10993m);
    }

    public final void d(r0 r0Var) {
        if (r0Var.getAndIncrement() != 0) {
            return;
        }
        long j10 = r0Var.f10885g;
        int i10 = r0Var.f10884f;
        s0 s0Var = r0Var.f10883e;
        mt.i0 i0Var = r0Var.f10881b;
        int i11 = this.f10996e;
        int iAddAndGet = 1;
        while (!r0Var.f10886h) {
            boolean z10 = this.f11003l;
            boolean z11 = this.f10998g == j10;
            if (z10 && z11) {
                r0Var.f10883e = null;
                Throwable th2 = this.f11002k;
                if (th2 != null) {
                    i0Var.onError(th2);
                    return;
                } else {
                    i0Var.onComplete();
                    return;
                }
            }
            if (z11) {
                r0Var.f10885g = j10;
                r0Var.f10884f = i10;
                r0Var.f10883e = s0Var;
                iAddAndGet = r0Var.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                if (i10 == i11) {
                    s0Var = (s0) s0Var.f10942b;
                    i10 = 0;
                }
                i0Var.onNext(((Object[]) s0Var.f10941a)[i10]);
                i10++;
                j10++;
            }
        }
        r0Var.f10883e = null;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        this.f11003l = true;
        for (r0 r0Var : (r0[]) this.f10997f.getAndSet(f10994n)) {
            d(r0Var);
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        this.f11002k = th2;
        this.f11003l = true;
        for (r0 r0Var : (r0[]) this.f10997f.getAndSet(f10994n)) {
            d(r0Var);
        }
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        int i10 = this.f11001j;
        if (i10 == this.f10996e) {
            s0 s0Var = new s0(i10, 0);
            ((Object[]) s0Var.f10941a)[0] = obj;
            this.f11001j = 1;
            this.f11000i.f10942b = s0Var;
            this.f11000i = s0Var;
        } else {
            ((Object[]) this.f11000i.f10941a)[i10] = obj;
            this.f11001j = i10 + 1;
        }
        this.f10998g++;
        for (r0 r0Var : (r0[]) this.f10997f.get()) {
            d(r0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mt.b0
    public final void subscribeActual(mt.i0 i0Var) {
        r0 r0Var = new r0(i0Var, this);
        i0Var.onSubscribe(r0Var);
        loop0: while (true) {
            AtomicReference atomicReference = this.f10997f;
            r0[] r0VarArr = (r0[]) atomicReference.get();
            if (r0VarArr != f10994n) {
                int length = r0VarArr.length;
                r0[] r0VarArr2 = new r0[length + 1];
                System.arraycopy(r0VarArr, 0, r0VarArr2, 0, length);
                r0VarArr2[length] = r0Var;
                while (!atomicReference.compareAndSet(r0VarArr, r0VarArr2)) {
                    if (atomicReference.get() != r0VarArr) {
                        break;
                    }
                }
                break loop0;
            }
            break;
        }
        AtomicBoolean atomicBoolean = this.f10995c;
        if (atomicBoolean.get() || !atomicBoolean.compareAndSet(false, true)) {
            d(r0Var);
        } else {
            this.f10053b.subscribe(this);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
    }
}

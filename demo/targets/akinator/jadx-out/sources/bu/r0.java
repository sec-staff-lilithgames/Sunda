package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10881b;

    /* renamed from: c, reason: collision with root package name */
    public final t0 f10882c;

    /* renamed from: e, reason: collision with root package name */
    public s0 f10883e;

    /* renamed from: f, reason: collision with root package name */
    public int f10884f;

    /* renamed from: g, reason: collision with root package name */
    public long f10885g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10886h;

    public r0(mt.i0 i0Var, t0 t0Var) {
        this.f10881b = i0Var;
        this.f10882c = t0Var;
        this.f10883e = t0Var.f10999h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pt.c
    public void dispose() {
        r0[] r0VarArr;
        if (this.f10886h) {
            return;
        }
        this.f10886h = true;
        AtomicReference atomicReference = this.f10882c.f10997f;
        while (true) {
            r0[] r0VarArr2 = (r0[]) atomicReference.get();
            int length = r0VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (r0VarArr2[i10] == this) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                r0VarArr = t0.f10993m;
            } else {
                r0[] r0VarArr3 = new r0[length - 1];
                System.arraycopy(r0VarArr2, 0, r0VarArr3, 0, i10);
                System.arraycopy(r0VarArr2, i10 + 1, r0VarArr3, i10, (length - i10) - 1);
                r0VarArr = r0VarArr3;
            }
            while (!atomicReference.compareAndSet(r0VarArr2, r0VarArr)) {
                if (atomicReference.get() != r0VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10886h;
    }
}

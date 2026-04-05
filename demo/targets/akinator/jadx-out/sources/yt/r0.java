package yt;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 extends AtomicInteger implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f96221b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f96222c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f96223e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public bu.s0 f96224f;

    /* renamed from: g, reason: collision with root package name */
    public int f96225g;

    /* renamed from: h, reason: collision with root package name */
    public long f96226h;

    public r0(tw.c cVar, s0 s0Var) {
        this.f96221b = cVar;
        this.f96222c = s0Var;
        this.f96224f = s0Var.f96297i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tw.d
    public void cancel() {
        r0[] r0VarArr;
        if (this.f96223e.getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
            AtomicReference atomicReference = this.f96222c.f96295g;
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
                    r0VarArr = s0.f96291n;
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
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.addCancel(this.f96223e, j10);
            this.f96222c.e(this);
        }
    }
}

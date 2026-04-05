package bu;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q8 extends ArrayList implements i8 {

    /* renamed from: b, reason: collision with root package name */
    public volatile int f10858b;

    @Override // bu.i8
    public void complete() {
        add(iu.u.complete());
        this.f10858b++;
    }

    @Override // bu.i8
    public void error(Throwable th2) {
        add(iu.u.error(th2));
        this.f10858b++;
    }

    @Override // bu.i8
    public void next(Object obj) {
        add(iu.u.next(obj));
        this.f10858b++;
    }

    @Override // bu.i8
    public void replay(e8 e8Var) {
        if (e8Var.getAndIncrement() != 0) {
            return;
        }
        mt.i0 i0Var = e8Var.f10262c;
        int iAddAndGet = 1;
        while (!e8Var.isDisposed()) {
            int i10 = this.f10858b;
            Integer num = (Integer) e8Var.f10263e;
            int iIntValue = num != null ? num.intValue() : 0;
            while (iIntValue < i10) {
                if (iu.u.accept(get(iIntValue), i0Var) || e8Var.isDisposed()) {
                    return;
                } else {
                    iIntValue++;
                }
            }
            e8Var.f10263e = Integer.valueOf(iIntValue);
            iAddAndGet = e8Var.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }
}

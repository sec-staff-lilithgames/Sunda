package sh;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f85892c;

    /* renamed from: d, reason: collision with root package name */
    public final n1[] f85893d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f85890a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f85891b = true;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f85894e = 0;

    public z0(n1[] n1VarArr) {
        this.f85893d = n1VarArr;
        this.f85892c = new AtomicInteger(n1VarArr.length);
    }

    public final void a() {
        if (this.f85892c.decrementAndGet() == 0 && this.f85890a) {
            for (n1 n1Var : this.f85893d) {
                if (n1Var != null) {
                    n1Var.cancel(this.f85891b);
                }
            }
        }
    }
}

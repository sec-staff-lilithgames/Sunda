package p6;

import n6.c0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f80686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f80687c;

    public a(b bVar, b0 b0Var) {
        this.f80687c = bVar;
        this.f80686b = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        c0 c0Var = c0.get();
        String str = b.f80688e;
        StringBuilder sb2 = new StringBuilder("Scheduling work ");
        b0 b0Var = this.f80686b;
        sb2.append(b0Var.f89053a);
        c0Var.debug(str, sb2.toString());
        this.f80687c.f80689a.schedule(b0Var);
    }
}

package xr;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class k7 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh.a2 f92736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u8 f92737c;

    public k7(u8 u8Var, sh.a2 a2Var) {
        this.f92737c = u8Var;
        this.f92736b = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        wr.x1 x1Var = new wr.x1();
        u8 u8Var = this.f92737c;
        u8Var.T.a(x1Var);
        u8Var.U.c(x1Var);
        wr.x1 target = x1Var.setTarget(u8Var.f93099b);
        wr.f0 f0Var = (wr.f0) u8Var.f93131x.f10942b;
        if (f0Var == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
        target.setState(f0Var);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(u8Var.H);
        arrayList.addAll(u8Var.K);
        x1Var.setSubchannels(arrayList);
        this.f92736b.set(x1Var.build());
    }
}

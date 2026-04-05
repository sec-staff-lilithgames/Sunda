package xr;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sh.a2 f93256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f93257c;

    public y5(i6 i6Var, sh.a2 a2Var) {
        this.f93257c = i6Var;
        this.f93256b = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        wr.x1 x1Var = new wr.x1();
        List<wr.f1> groups = this.f93257c.f92621n.getGroups();
        ArrayList arrayList = new ArrayList(this.f93257c.f92628u);
        x1Var.setTarget(groups.toString()).setState(this.f93257c.f92632y.getState());
        x1Var.setSockets(arrayList);
        this.f93257c.f92616i.a(x1Var);
        this.f93257c.f92617j.c(x1Var);
        this.f93256b.set(x1Var.build());
    }
}

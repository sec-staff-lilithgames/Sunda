package xr;

import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f93008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f93009c;

    public t5(i6 i6Var, List list) {
        this.f93009c = i6Var;
        this.f93008b = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        b6 b6Var;
        SocketAddress currentAddress = this.f93009c.f92621n.getCurrentAddress();
        this.f93009c.f92621n.updateGroups(this.f93008b);
        this.f93009c.f92622o = this.f93008b;
        wr.f0 state = this.f93009c.f92632y.getState();
        wr.f0 f0Var = wr.f0.f90913c;
        if ((state != f0Var && this.f93009c.f92632y.getState() != wr.f0.f90912b) || this.f93009c.f92621n.seekTo(currentAddress)) {
            b6Var = null;
        } else if (this.f93009c.f92632y.getState() == f0Var) {
            b6Var = this.f93009c.f92631x;
            this.f93009c.f92631x = null;
            this.f93009c.f92621n.reset();
            i6.a(this.f93009c, wr.f0.f90915f);
        } else {
            this.f93009c.f92630w.shutdown(wr.m6.f91047o.withDescription("InternalSubchannel closed pending transport due to address change"));
            i6 i6Var = this.f93009c;
            i6Var.f92630w = null;
            i6Var.f92621n.reset();
            i6.b(this.f93009c);
            b6Var = null;
        }
        if (b6Var != null) {
            i6 i6Var2 = this.f93009c;
            if (i6Var2.f92626s != null) {
                i6Var2.f92627t.shutdown(wr.m6.f91047o.withDescription("InternalSubchannel closed transport early due to address change"));
                this.f93009c.f92626s.cancel();
                i6 i6Var3 = this.f93009c;
                i6Var3.f92626s = null;
                i6Var3.f92627t = null;
            }
            i6 i6Var4 = this.f93009c;
            i6Var4.f92627t = b6Var;
            i6Var4.f92626s = i6Var4.f92620m.schedule(new s5(this), 5L, TimeUnit.SECONDS, i6Var4.f92614g);
        }
    }
}

package xr;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x5 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f93232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i6 f93233c;

    public x5(i6 i6Var, wr.m6 m6Var) {
        this.f93233c = i6Var;
        this.f93232b = m6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        Iterator it = new ArrayList(this.f93233c.f92628u).iterator();
        while (it.hasNext()) {
            ((h9) it.next()).shutdownNow(this.f93232b);
        }
    }
}

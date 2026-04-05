package xr;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8 f92705b;

    public j8(q8 q8Var) {
        this.f92705b = q8Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        if (this.f92705b.f92924a.get() == u8.f93095r0) {
            this.f92705b.f92924a.set(null);
        }
        LinkedHashSet linkedHashSet = this.f92705b.f92927d.I;
        if (linkedHashSet != null) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((p8) it.next()).cancel("Channel is forcefully shutdown", null);
            }
        }
        e6.w0 w0Var = this.f92705b.f92927d.M;
        wr.m6 m6Var = u8.f93091n0;
        w0Var.a(m6Var);
        synchronized (w0Var.f53883a) {
            arrayList = new ArrayList((HashSet) w0Var.f53884b);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((k1) it2.next()).cancel(m6Var);
        }
        ((u8) w0Var.f53886d).L.shutdownNow(m6Var);
    }
}

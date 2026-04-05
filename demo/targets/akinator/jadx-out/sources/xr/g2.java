package xr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g2 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f92543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(u2 u2Var, t2 t2Var) {
        super(u2Var.f93074c);
        this.f92543c = t2Var;
    }

    @Override // xr.c2
    public void runInContext() {
        List list;
        t2 t2Var = this.f92543c;
        t2Var.getClass();
        List arrayList = new ArrayList();
        while (true) {
            synchronized (t2Var) {
                try {
                    if (t2Var.f93003c.isEmpty()) {
                        t2Var.f93003c = null;
                        t2Var.f93002b = true;
                        return;
                    } else {
                        list = t2Var.f93003c;
                        t2Var.f93003c = arrayList;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}

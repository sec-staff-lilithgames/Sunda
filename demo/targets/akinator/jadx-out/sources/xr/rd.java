package xr;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class rd implements de {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zd f92970a;

    public rd(zd zdVar) {
        this.f92970a = zdVar;
    }

    @Override // xr.de
    public void serverShutdown() {
        synchronized (this.f92970a.f93351p) {
            try {
                if (this.f92970a.f93348m) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f92970a.f93353r);
                zd zdVar = this.f92970a;
                wr.m6 m6Var = zdVar.f93347l;
                zdVar.f93348m = true;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ge geVar = (ge) it.next();
                    if (m6Var == null) {
                        geVar.shutdown();
                    } else {
                        geVar.shutdownNow(m6Var);
                    }
                }
                synchronized (this.f92970a.f93351p) {
                    zd zdVar2 = this.f92970a;
                    zdVar2.f93352q = true;
                    zdVar2.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.de
    public he transportCreated(ge geVar) {
        synchronized (this.f92970a.f93351p) {
            this.f92970a.f93353r.add(geVar);
        }
        yd ydVar = new yd(this.f92970a, geVar);
        ydVar.init();
        return ydVar;
    }
}

package xr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class u3 implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f93081a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f93082b;

    /* renamed from: c, reason: collision with root package name */
    public List f93083c = new ArrayList();

    public u3(m1 m1Var) {
        this.f93081a = m1Var;
    }

    public final void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f93082b) {
                    runnable.run();
                } else {
                    this.f93083c.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.m1
    public void closed(wr.m6 m6Var, l1 l1Var, wr.e4 e4Var) {
        a(new t3(this, m6Var, l1Var, e4Var));
    }

    public void drainPendingCallbacks() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                try {
                    if (this.f93083c.isEmpty()) {
                        this.f93083c = null;
                        this.f93082b = true;
                        return;
                    } else {
                        list = this.f93083c;
                        this.f93083c = arrayList;
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

    @Override // xr.m1
    public void headersRead(wr.e4 e4Var) {
        a(new s3(this, e4Var));
    }

    @Override // xr.m1, xr.we
    public void messagesAvailable(ve veVar) {
        if (this.f93082b) {
            this.f93081a.messagesAvailable(veVar);
        } else {
            a(new q3(this, veVar));
        }
    }

    @Override // xr.m1, xr.we
    public void onReady() {
        if (this.f93082b) {
            this.f93081a.onReady();
        } else {
            a(new r3(this));
        }
    }
}

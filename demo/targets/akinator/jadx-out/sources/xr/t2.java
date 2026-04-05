package xr;

import java.util.ArrayList;
import java.util.List;
import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t2 extends p.a {

    /* renamed from: a, reason: collision with root package name */
    public final p.a f93001a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f93002b;

    /* renamed from: c, reason: collision with root package name */
    public List f93003c = new ArrayList();

    public t2(p.a aVar) {
        this.f93001a = aVar;
    }

    public final void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f93002b) {
                    runnable.run();
                } else {
                    this.f93003c.add(runnable);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // wr.p.a
    public void onClose(wr.m6 m6Var, wr.e4 e4Var) {
        a(new r2(this, m6Var, e4Var));
    }

    @Override // wr.p.a
    public void onHeaders(wr.e4 e4Var) {
        if (this.f93002b) {
            this.f93001a.onHeaders(e4Var);
        } else {
            a(new p2(this, e4Var));
        }
    }

    @Override // wr.p.a
    public void onMessage(Object obj) {
        if (this.f93002b) {
            this.f93001a.onMessage(obj);
        } else {
            a(new q2(this, obj));
        }
    }

    @Override // wr.p.a
    public void onReady() {
        if (this.f93002b) {
            this.f93001a.onReady();
        } else {
            a(new s2(this));
        }
    }
}

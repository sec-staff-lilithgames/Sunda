package ds;

import java.util.concurrent.ArrayBlockingQueue;
import mh.p1;
import wr.e4;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f52607a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f52608b;

    public h(i iVar) {
        this.f52608b = iVar;
    }

    @Override // ds.l
    public final void a() {
        this.f52608b.f52611e.request(1);
    }

    @Override // wr.p.a
    public void onClose(m6 m6Var, e4 e4Var) {
        i iVar = this.f52608b;
        ArrayBlockingQueue arrayBlockingQueue = iVar.f52609b;
        p1.checkState(!this.f52607a, "ClientCall already closed");
        if (m6Var.isOk()) {
            arrayBlockingQueue.add(iVar);
        } else {
            arrayBlockingQueue.add(m6Var.asRuntimeException(e4Var));
        }
        this.f52607a = true;
    }

    @Override // wr.p.a
    public void onMessage(Object obj) {
        p1.checkState(!this.f52607a, "ClientCall already closed");
        this.f52608b.f52609b.add(obj);
    }

    @Override // wr.p.a
    public void onHeaders(e4 e4Var) {
    }
}

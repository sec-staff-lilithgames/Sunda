package aw;

import aw.g;
import java.io.IOException;
import pw.b1;
import pw.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends u {

    /* renamed from: b, reason: collision with root package name */
    public boolean f8303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f8304c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g.c f8305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b1 b1Var, g gVar, g.c cVar) {
        super(b1Var);
        this.f8304c = gVar;
        this.f8305e = cVar;
    }

    @Override // pw.u, pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this.f8303b) {
            return;
        }
        this.f8303b = true;
        g gVar = this.f8304c;
        g.c cVar = this.f8305e;
        synchronized (gVar) {
            cVar.setLockingSourceCount$okhttp(cVar.getLockingSourceCount$okhttp() - 1);
            if (cVar.getLockingSourceCount$okhttp() == 0 && cVar.getZombie$okhttp()) {
                gVar.removeEntry$okhttp(cVar);
            }
        }
    }
}

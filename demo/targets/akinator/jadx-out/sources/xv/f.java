package xv;

import java.io.IOException;
import xv.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f extends pw.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f93619c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e.d f93620e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, e.d dVar, pw.z0 z0Var) {
        super(z0Var);
        this.f93619c = eVar;
        this.f93620e = dVar;
    }

    @Override // pw.t, pw.z0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        e eVar = this.f93619c;
        e.d dVar = this.f93620e;
        synchronized (eVar) {
            if (dVar.getDone()) {
                return;
            }
            dVar.setDone(true);
            eVar.setWriteSuccessCount$okhttp(eVar.getWriteSuccessCount$okhttp() + 1);
            super.close();
            this.f93620e.f93609a.commit();
        }
    }
}

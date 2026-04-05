package r5;

import kotlin.jvm.internal.e0;
import kv.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b implements q5.f {

    /* renamed from: b, reason: collision with root package name */
    public final c f83784b;

    public b(c supportDriver) {
        e0.checkNotNullParameter(supportDriver, "supportDriver");
        this.f83784b = supportDriver;
    }

    @Override // q5.f, java.lang.AutoCloseable
    public void close() {
        this.f83784b.getOpenHelper().close();
    }

    public final c getSupportDriver$room_runtime_release() {
        return this.f83784b;
    }

    @Override // q5.f
    public <R> Object useConnection(boolean z10, p pVar, zu.d<? super R> dVar) {
        c cVar = this.f83784b;
        String databaseName = cVar.getOpenHelper().getDatabaseName();
        if (databaseName == null) {
            databaseName = ":memory:";
        }
        return pVar.invoke(new d(cVar.open(databaseName)), dVar);
    }
}

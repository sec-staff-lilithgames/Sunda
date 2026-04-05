package q5;

import kotlin.jvm.internal.e0;
import o6.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: b, reason: collision with root package name */
    public final x5.c f82402b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82403c;

    /* renamed from: e, reason: collision with root package name */
    public final tu.o f82404e;

    public a(x5.c driver, String fileName) {
        e0.checkNotNullParameter(driver, "driver");
        e0.checkNotNullParameter(fileName, "fileName");
        this.f82402b = driver;
        this.f82403c = fileName;
        this.f82404e = tu.q.lazy(new v0(this, 4));
    }

    @Override // q5.f, java.lang.AutoCloseable
    public void close() {
        ((b) this.f82404e.getValue()).getDelegate().close();
    }

    @Override // q5.f
    public <R> Object useConnection(boolean z10, kv.p pVar, zu.d<? super R> dVar) {
        return pVar.invoke((b) this.f82404e.getValue(), dVar);
    }
}

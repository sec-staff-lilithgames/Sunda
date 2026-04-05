package xv;

import java.io.IOException;
import xv.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends pw.u {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e.a f93579b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(pw.b1 b1Var, e.a aVar) {
        super(b1Var);
        this.f93579b = aVar;
    }

    @Override // pw.u, pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f93579b.getSnapshot().close();
        super.close();
    }
}

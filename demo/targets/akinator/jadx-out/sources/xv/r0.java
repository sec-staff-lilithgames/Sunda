package xv;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f93817c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pw.l f93818d;

    public r0(j0 j0Var, pw.l lVar) {
        this.f93817c = j0Var;
        this.f93818d = lVar;
    }

    @Override // xv.u0
    public long contentLength() {
        return this.f93818d.size();
    }

    @Override // xv.u0
    public j0 contentType() {
        return this.f93817c;
    }

    @Override // xv.u0
    public void writeTo(pw.j sink) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        sink.write(this.f93818d);
    }
}

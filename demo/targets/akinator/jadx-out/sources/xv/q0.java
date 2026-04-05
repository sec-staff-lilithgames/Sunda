package xv;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f93813c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pw.r f93814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pw.n0 f93815e;

    public q0(pw.n0 n0Var, pw.r rVar, j0 j0Var) {
        this.f93813c = j0Var;
        this.f93814d = rVar;
        this.f93815e = n0Var;
    }

    @Override // xv.u0
    public long contentLength() {
        Long size = this.f93814d.metadata(this.f93815e).getSize();
        if (size != null) {
            return size.longValue();
        }
        return -1L;
    }

    @Override // xv.u0
    public j0 contentType() {
        return this.f93813c;
    }

    @Override // xv.u0
    public void writeTo(pw.j sink) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        pw.b1 b1VarSource = this.f93814d.source(this.f93815e);
        try {
            sink.writeAll(b1VarSource);
            gv.d.closeFinally(b1VarSource, null);
        } finally {
        }
    }
}

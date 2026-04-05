package xv;

import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f93802c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f93803d;

    public p0(j0 j0Var, File file) {
        this.f93802c = j0Var;
        this.f93803d = file;
    }

    @Override // xv.u0
    public long contentLength() {
        return this.f93803d.length();
    }

    @Override // xv.u0
    public j0 contentType() {
        return this.f93802c;
    }

    @Override // xv.u0
    public void writeTo(pw.j sink) throws FileNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        pw.b1 b1VarSource = pw.h0.source(this.f93803d);
        try {
            sink.writeAll(b1VarSource);
            gv.d.closeFinally(b1VarSource, null);
        } finally {
        }
    }
}

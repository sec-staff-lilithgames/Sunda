package xv;

import java.io.FileDescriptor;
import java.io.FileInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f93831c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FileDescriptor f93832d;

    public s0(FileDescriptor fileDescriptor, j0 j0Var) {
        this.f93831c = j0Var;
        this.f93832d = fileDescriptor;
    }

    @Override // xv.u0
    public j0 contentType() {
        return this.f93831c;
    }

    @Override // xv.u0
    public boolean isOneShot() {
        return true;
    }

    @Override // xv.u0
    public void writeTo(pw.j sink) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        FileInputStream fileInputStream = new FileInputStream(this.f93832d);
        try {
            sink.getBuffer().writeAll(pw.h0.source(fileInputStream));
            gv.d.closeFinally(fileInputStream, null);
        } finally {
        }
    }
}

package dw;

import kotlin.jvm.internal.e0;
import pw.h0;
import pw.w;
import xv.j0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final u0 f52912c;

    public h(u0 delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.f52912c = delegate;
    }

    @Override // xv.u0
    public long contentLength() {
        return -1L;
    }

    @Override // xv.u0
    public j0 contentType() {
        return this.f52912c.contentType();
    }

    public final u0 getDelegate() {
        return this.f52912c;
    }

    @Override // xv.u0
    public boolean isOneShot() {
        return this.f52912c.isOneShot();
    }

    @Override // xv.u0
    public void writeTo(pw.j sink) {
        e0.checkNotNullParameter(sink, "sink");
        pw.j jVarBuffer = h0.buffer(new w(sink));
        try {
            this.f52912c.writeTo(jVarBuffer);
            gv.d.closeFinally(jVarBuffer, null);
        } finally {
        }
    }
}

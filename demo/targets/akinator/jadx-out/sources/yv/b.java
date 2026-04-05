package yv;

import kotlin.jvm.internal.e0;
import pw.b1;
import pw.d1;
import pw.h0;
import pw.k;
import xv.j0;
import xv.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends w0 implements b1 {

    /* renamed from: e, reason: collision with root package name */
    public final j0 f96662e;

    /* renamed from: f, reason: collision with root package name */
    public final long f96663f;

    public b(j0 j0Var, long j10) {
        this.f96662e = j0Var;
        this.f96663f = j10;
    }

    @Override // xv.w0
    public long contentLength() {
        return this.f96663f;
    }

    @Override // xv.w0
    public j0 contentType() {
        return this.f96662e;
    }

    @Override // pw.b1
    public long read(pw.g sink, long j10) {
        e0.checkNotNullParameter(sink, "sink");
        throw new IllegalStateException("Unreadable ResponseBody! These Response objects have bodies that are stripped:\n * Response.cacheResponse\n * Response.networkResponse\n * Response.priorResponse\n * EventSourceListener\n * WebSocketListener\n(It is safe to call contentType() and contentLength() on these response bodies.)");
    }

    @Override // xv.w0
    public k source() {
        return h0.buffer(this);
    }

    @Override // pw.b1
    public d1 timeout() {
        return d1.f81884f;
    }

    @Override // xv.w0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}

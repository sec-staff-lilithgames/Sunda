package aw;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import pw.b1;
import pw.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f8239b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pw.k f8240c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f8241e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pw.j f8242f;

    public b(pw.k kVar, d dVar, pw.j jVar) {
        this.f8240c = kVar;
        this.f8241e = dVar;
        this.f8242f = jVar;
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f8239b && !yv.i.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.f8239b = true;
            this.f8241e.abort();
        }
        this.f8240c.close();
    }

    @Override // pw.b1
    public long read(pw.g sink, long j10) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        try {
            long j11 = this.f8240c.read(sink, j10);
            pw.j jVar = this.f8242f;
            if (j11 != -1) {
                sink.copyTo(jVar.getBuffer(), sink.size() - j11, j11);
                jVar.emitCompleteSegments();
                return j11;
            }
            if (!this.f8239b) {
                this.f8239b = true;
                jVar.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (this.f8239b) {
                throw e10;
            }
            this.f8239b = true;
            this.f8241e.abort();
            throw e10;
        }
    }

    @Override // pw.b1
    public d1 timeout() {
        return this.f8240c.timeout();
    }
}

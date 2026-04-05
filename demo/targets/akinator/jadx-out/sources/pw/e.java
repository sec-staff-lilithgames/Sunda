package pw;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e implements b1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f81889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f81890c;

    public e(c cVar, b1 b1Var) {
        this.f81889b = cVar;
        this.f81890c = b1Var;
    }

    @Override // pw.b1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        b1 b1Var = this.f81890c;
        c cVar = this.f81889b;
        cVar.enter();
        try {
            b1Var.close();
            if (cVar.exit()) {
                throw cVar.access$newTimeoutException(null);
            }
        } catch (IOException e10) {
            if (!cVar.exit()) {
                throw e10;
            }
            throw cVar.access$newTimeoutException(e10);
        } finally {
            cVar.exit();
        }
    }

    @Override // pw.b1
    public long read(g sink, long j10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(sink, "sink");
        b1 b1Var = this.f81890c;
        c cVar = this.f81889b;
        cVar.enter();
        try {
            long j11 = b1Var.read(sink, j10);
            if (cVar.exit()) {
                throw cVar.access$newTimeoutException(null);
            }
            return j11;
        } catch (IOException e10) {
            if (cVar.exit()) {
                throw cVar.access$newTimeoutException(e10);
            }
            throw e10;
        } finally {
            cVar.exit();
        }
    }

    public String toString() {
        return "AsyncTimeout.source(" + this.f81890c + ')';
    }

    @Override // pw.b1
    public c timeout() {
        return this.f81889b;
    }
}

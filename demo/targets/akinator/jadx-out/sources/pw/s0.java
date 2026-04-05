package pw;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f81979b;

    public s0(t0 t0Var) {
        this.f81979b = t0Var;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f81979b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        t0 t0Var = this.f81979b;
        if (t0Var.f81983e) {
            return;
        }
        t0Var.flush();
    }

    public String toString() {
        return this.f81979b + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        t0 t0Var = this.f81979b;
        if (t0Var.f81983e) {
            throw new IOException("closed");
        }
        t0Var.f81982c.writeByte((int) ((byte) i10));
        t0Var.emitCompleteSegments();
    }

    @Override // java.io.OutputStream
    public void write(byte[] data, int i10, int i11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        t0 t0Var = this.f81979b;
        if (!t0Var.f81983e) {
            t0Var.f81982c.write(data, i10, i11);
            t0Var.emitCompleteSegments();
            return;
        }
        throw new IOException("closed");
    }
}

package pw;

import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f81910b;

    public i(g gVar) {
        this.f81910b = gVar;
    }

    public String toString() {
        return this.f81910b + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f81910b.writeByte(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] data, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        this.f81910b.write(data, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}

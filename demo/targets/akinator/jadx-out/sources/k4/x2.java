package k4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final FileOutputStream f70560b;

    public x2(FileOutputStream fileOutputStream) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fileOutputStream, "fileOutputStream");
        this.f70560b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.f70560b.flush();
    }

    public final FileOutputStream getFileOutputStream() {
        return this.f70560b;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f70560b.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] b10) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(b10, "b");
        this.f70560b.write(b10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(bytes, "bytes");
        this.f70560b.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}

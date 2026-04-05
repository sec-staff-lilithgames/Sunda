package ph;

import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f81296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Writer f81297c;

    public f(e eVar, Writer writer) {
        this.f81296b = eVar;
        this.f81297c = writer;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81297c.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        this.f81297c.flush();
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        this.f81296b.append((char) i10);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        throw new UnsupportedOperationException();
    }
}

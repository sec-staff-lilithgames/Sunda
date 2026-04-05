package cc;

import ic.j0;
import java.io.IOException;
import java.io.Writer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends Writer implements ic.a {

    /* renamed from: b, reason: collision with root package name */
    public final j0 f12106b;

    public p(ic.b bVar) {
        this.f12106b = new j0(bVar);
    }

    @Override // ic.a
    public ic.b bufferRecycler() {
        return this.f12106b.bufferRecycler();
    }

    public String getAndClear() throws IOException {
        j0 j0Var = this.f12106b;
        String strContentsAsString = j0Var.contentsAsString();
        j0Var.releaseBuffers();
        return strContentsAsString;
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws IOException {
        this.f12106b.append(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        this.f12106b.append(cArr, i10, i11);
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        this.f12106b.append((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        write(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        this.f12106b.append(str, 0, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        String string = charSequence.toString();
        this.f12106b.append(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        this.f12106b.append(str, i10, i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        String string = charSequence.subSequence(i10, i11).toString();
        this.f12106b.append(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}

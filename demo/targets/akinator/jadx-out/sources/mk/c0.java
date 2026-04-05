package mk;

import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final Appendable f74758b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f74759c = new b0();

    public c0(Appendable appendable) {
        this.f74758b = appendable;
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        this.f74758b.append((char) i10);
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        Objects.requireNonNull(str);
        this.f74758b.append(str, i10, i11 + i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        this.f74758b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        this.f74758b.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        b0 b0Var = this.f74759c;
        b0Var.f74750b = cArr;
        b0Var.f74751c = null;
        this.f74758b.append(b0Var, i10, i11 + i10);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}

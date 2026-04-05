package ph;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final Appendable f81278b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f81279c;

    public a(Appendable appendable) {
        this.f81278b = (Appendable) p1.checkNotNull(appendable);
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f81279c = true;
        Appendable appendable = this.f81278b;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    public final void d() throws IOException {
        if (this.f81279c) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        d();
        Appendable appendable = this.f81278b;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) throws IOException {
        d();
        this.f81278b.append(new String(cArr, i10, i11));
    }

    @Override // java.io.Writer
    public void write(int i10) throws IOException {
        d();
        this.f81278b.append((char) i10);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) throws IOException {
        d();
        this.f81278b.append(c10);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        p1.checkNotNull(str);
        d();
        this.f81278b.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        d();
        this.f81278b.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) throws IOException {
        d();
        this.f81278b.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) throws IOException {
        p1.checkNotNull(str);
        d();
        this.f81278b.append(str, i10, i11 + i10);
    }
}

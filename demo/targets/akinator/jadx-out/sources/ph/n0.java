package ph;

import java.io.Writer;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n0 extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public static final n0 f81336b = new n0();

    public String toString() {
        return "CharStreams.nullWriter()";
    }

    @Override // java.io.Writer
    public void write(int i10) {
    }

    @Override // java.io.Writer
    public void write(char[] cArr) {
        p1.checkNotNull(cArr);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        p1.checkPositionIndexes(i10, i11 + i10, cArr.length);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        return this;
    }

    @Override // java.io.Writer
    public void write(String str) {
        p1.checkNotNull(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        p1.checkPositionIndexes(i10, i11, charSequence == null ? 4 : charSequence.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(String str, int i10, int i11) {
        p1.checkPositionIndexes(i10, i11 + i10, str.length());
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }
}

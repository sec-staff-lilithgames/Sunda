package ph;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k extends o {

    /* renamed from: f, reason: collision with root package name */
    public final o f81316f;

    /* renamed from: g, reason: collision with root package name */
    public final String f81317g;

    /* renamed from: h, reason: collision with root package name */
    public final int f81318h;

    public k(n nVar, String str, int i10) {
        this.f81316f = (o) p1.checkNotNull(nVar);
        this.f81317g = (String) p1.checkNotNull(str);
        this.f81318h = i10;
        p1.checkArgument(i10 > 0, "Cannot add a separator after every %s chars", i10);
    }

    @Override // ph.o
    public final int a(byte[] bArr, CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(charSequence.length());
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (this.f81317g.indexOf(cCharAt) < 0) {
                sb2.append(cCharAt);
            }
        }
        return this.f81316f.a(bArr, sb2);
    }

    @Override // ph.o
    public final void b(Appendable appendable, byte[] bArr, int i10, int i11) {
        p1.checkNotNull(appendable);
        String str = this.f81317g;
        p1.checkNotNull(str);
        int i12 = this.f81318h;
        p1.checkArgument(i12 > 0);
        this.f81316f.b(new e(i12, appendable, str), bArr, i10, i11);
    }

    @Override // ph.o
    public final int c(int i10) {
        return this.f81316f.c(i10);
    }

    @Override // ph.o
    public boolean canDecode(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            char cCharAt = charSequence.charAt(i10);
            if (this.f81317g.indexOf(cCharAt) < 0) {
                sb2.append(cCharAt);
            }
        }
        return this.f81316f.canDecode(sb2);
    }

    @Override // ph.o
    public final int d(int i10) {
        int iD = this.f81316f.d(i10);
        return (qh.f.divide(Math.max(0, iD - 1), this.f81318h, RoundingMode.FLOOR) * this.f81317g.length()) + iD;
    }

    @Override // ph.o
    public InputStream decodingStream(Reader reader) {
        p1.checkNotNull(reader);
        String str = this.f81317g;
        p1.checkNotNull(str);
        return this.f81316f.decodingStream(new d(reader, str));
    }

    @Override // ph.o
    public final CharSequence e(CharSequence charSequence) {
        return this.f81316f.e(charSequence);
    }

    @Override // ph.o
    public OutputStream encodingStream(Writer writer) {
        p1.checkNotNull(writer);
        String str = this.f81317g;
        p1.checkNotNull(str);
        int i10 = this.f81318h;
        p1.checkArgument(i10 > 0);
        return this.f81316f.encodingStream(new f(new e(i10, writer, str), writer));
    }

    @Override // ph.o
    public o ignoreCase() {
        return this.f81316f.ignoreCase().withSeparator(this.f81317g, this.f81318h);
    }

    @Override // ph.o
    public o lowerCase() {
        return this.f81316f.lowerCase().withSeparator(this.f81317g, this.f81318h);
    }

    @Override // ph.o
    public o omitPadding() {
        return this.f81316f.omitPadding().withSeparator(this.f81317g, this.f81318h);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f81316f);
        sb2.append(".withSeparator(\"");
        sb2.append(this.f81317g);
        sb2.append("\", ");
        return a.b.f(this.f81318h, ")", sb2);
    }

    @Override // ph.o
    public o upperCase() {
        return this.f81316f.upperCase().withSeparator(this.f81317g, this.f81318h);
    }

    @Override // ph.o
    public o withPadChar(char c10) {
        return this.f81316f.withPadChar(c10).withSeparator(this.f81317g, this.f81318h);
    }

    @Override // ph.o
    public o withSeparator(String str, int i10) {
        throw new UnsupportedOperationException("Already have a separator");
    }
}

package ph;

import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import j1.o2;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Objects;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n extends o {

    /* renamed from: f, reason: collision with root package name */
    public final g f81331f;

    /* renamed from: g, reason: collision with root package name */
    public final Character f81332g;

    /* renamed from: h, reason: collision with root package name */
    public volatile o f81333h;

    /* renamed from: i, reason: collision with root package name */
    public volatile o f81334i;

    /* renamed from: j, reason: collision with root package name */
    public volatile o f81335j;

    public n(g gVar, Character ch2) {
        this.f81331f = (g) p1.checkNotNull(gVar);
        p1.checkArgument(ch2 == null || !gVar.matches(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
        this.f81332g = ch2;
    }

    @Override // ph.o
    public int a(byte[] bArr, CharSequence charSequence) throws j {
        p1.checkNotNull(bArr);
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        g gVar = this.f81331f;
        boolean[] zArr = gVar.f81308h;
        int i10 = gVar.f81304d;
        int i11 = gVar.f81305e;
        if (!zArr[length % i11]) {
            throw new j("Invalid input length " + charSequenceE.length());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < charSequenceE.length(); i13 += i11) {
            long jA = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < i11; i15++) {
                jA <<= i10;
                if (i13 + i15 < charSequenceE.length()) {
                    jA |= gVar.a(charSequenceE.charAt(i14 + i13));
                    i14++;
                }
            }
            int i16 = gVar.f81306f;
            int i17 = (i16 * 8) - (i14 * i10);
            int i18 = (i16 - 1) * 8;
            while (i18 >= i17) {
                bArr[i12] = (byte) ((jA >>> i18) & 255);
                i18 -= 8;
                i12++;
            }
        }
        return i12;
    }

    @Override // ph.o
    public void b(Appendable appendable, byte[] bArr, int i10, int i11) {
        p1.checkNotNull(appendable);
        p1.checkPositionIndexes(i10, i10 + i11, bArr.length);
        int i12 = 0;
        while (i12 < i11) {
            g gVar = this.f81331f;
            f(appendable, bArr, i10 + i12, Math.min(gVar.f81306f, i11 - i12));
            i12 += gVar.f81306f;
        }
    }

    @Override // ph.o
    public final int c(int i10) {
        return (int) (((this.f81331f.f81304d * i10) + 7) / 8);
    }

    @Override // ph.o
    public boolean canDecode(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        g gVar = this.f81331f;
        if (gVar.f81308h[length % gVar.f81305e]) {
            for (int i10 = 0; i10 < charSequenceE.length(); i10++) {
                char cCharAt = charSequenceE.charAt(i10);
                if (cCharAt <= 127 && gVar.f81307g[cCharAt] != -1) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ph.o
    public final int d(int i10) {
        g gVar = this.f81331f;
        return qh.f.divide(i10, gVar.f81306f, RoundingMode.CEILING) * gVar.f81305e;
    }

    @Override // ph.o
    public InputStream decodingStream(Reader reader) {
        p1.checkNotNull(reader);
        return new m(this, reader);
    }

    @Override // ph.o
    public final CharSequence e(CharSequence charSequence) {
        p1.checkNotNull(charSequence);
        Character ch2 = this.f81332g;
        if (ch2 == null) {
            return charSequence;
        }
        char cCharValue = ch2.charValue();
        int length = charSequence.length() - 1;
        while (length >= 0 && charSequence.charAt(length) == cCharValue) {
            length--;
        }
        return charSequence.subSequence(0, length + 1);
    }

    @Override // ph.o
    public OutputStream encodingStream(Writer writer) {
        p1.checkNotNull(writer);
        return new l(this, writer);
    }

    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f81331f.equals(nVar.f81331f) && Objects.equals(this.f81332g, nVar.f81332g)) {
                return true;
            }
        }
        return false;
    }

    public final void f(Appendable appendable, byte[] bArr, int i10, int i11) {
        p1.checkNotNull(appendable);
        p1.checkPositionIndexes(i10, i10 + i11, bArr.length);
        g gVar = this.f81331f;
        int i12 = gVar.f81306f;
        int i13 = gVar.f81304d;
        int i14 = 0;
        p1.checkArgument(i11 <= i12);
        long j10 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j10 = (j10 | (bArr[i10 + i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) << 8;
        }
        int i16 = ((i11 + 1) * 8) - i13;
        while (i14 < i11 * 8) {
            appendable.append(gVar.f81302b[((int) (j10 >>> (i16 - i14))) & gVar.f81303c]);
            i14 += i13;
        }
        Character ch2 = this.f81332g;
        if (ch2 != null) {
            while (i14 < gVar.f81306f * 8) {
                appendable.append(ch2.charValue());
                i14 += i13;
            }
        }
    }

    public o g(g gVar, Character ch2) {
        return new n(gVar, ch2);
    }

    public int hashCode() {
        return this.f81331f.hashCode() ^ Objects.hashCode(this.f81332g);
    }

    @Override // ph.o
    public o ignoreCase() {
        o oVarG = this.f81335j;
        if (oVarG == null) {
            g gVarB = this.f81331f.b();
            oVarG = gVarB == this.f81331f ? this : g(gVarB, this.f81332g);
            this.f81335j = oVarG;
        }
        return oVarG;
    }

    @Override // ph.o
    public o lowerCase() {
        boolean z10;
        o oVarG = this.f81334i;
        if (oVarG == null) {
            g gVarB = this.f81331f;
            char[] cArr = gVarB.f81302b;
            int length = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (mh.c.isUpperCase(cArr[i10])) {
                    char[] cArr2 = gVarB.f81302b;
                    int length2 = cArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            z10 = false;
                            break;
                        }
                        if (mh.c.isLowerCase(cArr2[i11])) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                    p1.checkState(!z10, "Cannot call lowerCase() on a mixed-case alphabet");
                    char[] cArr3 = new char[cArr.length];
                    for (int i12 = 0; i12 < cArr.length; i12++) {
                        cArr3[i12] = mh.c.toLowerCase(cArr[i12]);
                    }
                    g gVar = new g(o2.o(new StringBuilder(), gVarB.f81301a, ".lowerCase()"), cArr3);
                    gVarB = gVarB.f81309i ? gVar.b() : gVar;
                } else {
                    i10++;
                }
            }
            oVarG = gVarB == this.f81331f ? this : g(gVarB, this.f81332g);
            this.f81334i = oVarG;
        }
        return oVarG;
    }

    @Override // ph.o
    public o omitPadding() {
        return this.f81332g == null ? this : g(this.f81331f, null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        g gVar = this.f81331f;
        sb2.append(gVar);
        if (8 % gVar.f81304d != 0) {
            Character ch2 = this.f81332g;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // ph.o
    public o upperCase() {
        boolean z10;
        o oVarG = this.f81333h;
        if (oVarG == null) {
            g gVarB = this.f81331f;
            char[] cArr = gVarB.f81302b;
            int length = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (mh.c.isLowerCase(cArr[i10])) {
                    char[] cArr2 = gVarB.f81302b;
                    int length2 = cArr2.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length2) {
                            z10 = false;
                            break;
                        }
                        if (mh.c.isUpperCase(cArr2[i11])) {
                            z10 = true;
                            break;
                        }
                        i11++;
                    }
                    p1.checkState(!z10, "Cannot call upperCase() on a mixed-case alphabet");
                    char[] cArr3 = new char[cArr.length];
                    for (int i12 = 0; i12 < cArr.length; i12++) {
                        cArr3[i12] = mh.c.toUpperCase(cArr[i12]);
                    }
                    g gVar = new g(o2.o(new StringBuilder(), gVarB.f81301a, ".upperCase()"), cArr3);
                    gVarB = gVarB.f81309i ? gVar.b() : gVar;
                } else {
                    i10++;
                }
            }
            oVarG = gVarB == this.f81331f ? this : g(gVarB, this.f81332g);
            this.f81333h = oVarG;
        }
        return oVarG;
    }

    @Override // ph.o
    public o withPadChar(char c10) {
        Character ch2;
        g gVar = this.f81331f;
        return (8 % gVar.f81304d == 0 || ((ch2 = this.f81332g) != null && ch2.charValue() == c10)) ? this : g(gVar, Character.valueOf(c10));
    }

    @Override // ph.o
    public o withSeparator(String str, int i10) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            p1.checkArgument(!this.f81331f.matches(str.charAt(i11)), "Separator (%s) cannot contain alphabet characters", str);
        }
        Character ch2 = this.f81332g;
        if (ch2 != null) {
            p1.checkArgument(str.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
        }
        return new k(this, str, i10);
    }

    public n(String str, String str2) {
        this(new g(str, str2.toCharArray()), Character.valueOf(G5.T));
    }
}

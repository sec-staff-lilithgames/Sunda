package ph;

import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import java.io.IOException;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends n {
    public i(String str, String str2) {
        this(new g(str, str2.toCharArray()), Character.valueOf(G5.T));
    }

    @Override // ph.n, ph.o
    public final int a(byte[] bArr, CharSequence charSequence) throws j {
        p1.checkNotNull(bArr);
        CharSequence charSequenceE = e(charSequence);
        int length = charSequenceE.length();
        g gVar = this.f81331f;
        if (!gVar.f81308h[length % gVar.f81305e]) {
            throw new j("Invalid input length " + charSequenceE.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequenceE.length()) {
            int i12 = i10 + 2;
            int iA = (gVar.a(charSequenceE.charAt(i10 + 1)) << 12) | (gVar.a(charSequenceE.charAt(i10)) << 18);
            int i13 = i11 + 1;
            bArr[i11] = (byte) (iA >>> 16);
            if (i12 < charSequenceE.length()) {
                int i14 = i10 + 3;
                int iA2 = iA | (gVar.a(charSequenceE.charAt(i12)) << 6);
                int i15 = i11 + 2;
                bArr[i13] = (byte) ((iA2 >>> 8) & 255);
                if (i14 < charSequenceE.length()) {
                    i10 += 4;
                    i11 += 3;
                    bArr[i15] = (byte) ((iA2 | gVar.a(charSequenceE.charAt(i14))) & 255);
                } else {
                    i11 = i15;
                    i10 = i14;
                }
            } else {
                i11 = i13;
                i10 = i12;
            }
        }
        return i11;
    }

    @Override // ph.n, ph.o
    public final void b(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        p1.checkNotNull(appendable);
        int i12 = i10 + i11;
        p1.checkPositionIndexes(i10, i12, bArr.length);
        while (i11 >= 3) {
            int i13 = i10 + 2;
            int i14 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16);
            i10 += 3;
            int i15 = i14 | (bArr[i13] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            g gVar = this.f81331f;
            char[] cArr = gVar.f81302b;
            char[] cArr2 = gVar.f81302b;
            appendable.append(cArr[i15 >>> 18]);
            appendable.append(cArr2[(i15 >>> 12) & 63]);
            appendable.append(cArr2[(i15 >>> 6) & 63]);
            appendable.append(cArr2[i15 & 63]);
            i11 -= 3;
        }
        if (i10 < i12) {
            f(appendable, bArr, i10, i12 - i10);
        }
    }

    @Override // ph.n
    public final o g(g gVar, Character ch2) {
        return new i(gVar, ch2);
    }

    public i(g gVar, Character ch2) {
        super(gVar, ch2);
        p1.checkArgument(gVar.f81302b.length == 64);
    }
}

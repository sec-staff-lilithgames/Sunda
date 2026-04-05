package ph;

import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h extends n {

    /* renamed from: k, reason: collision with root package name */
    public final char[] f81310k;

    public h(g gVar) {
        super(gVar, (Character) null);
        this.f81310k = new char[512];
        p1.checkArgument(gVar.f81302b.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr = this.f81310k;
            char[] cArr2 = gVar.f81302b;
            cArr[i10] = cArr2[i10 >>> 4];
            cArr[i10 | NotificationCompat.FLAG_LOCAL_ONLY] = cArr2[i10 & 15];
        }
    }

    @Override // ph.n, ph.o
    public final int a(byte[] bArr, CharSequence charSequence) throws j {
        p1.checkNotNull(bArr);
        if (charSequence.length() % 2 == 1) {
            throw new j("Invalid input length " + charSequence.length());
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            g gVar = this.f81331f;
            bArr[i11] = (byte) ((gVar.a(cCharAt) << 4) | gVar.a(charSequence.charAt(i10 + 1)));
            i10 += 2;
            i11++;
        }
        return i11;
    }

    @Override // ph.n, ph.o
    public final void b(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        p1.checkNotNull(appendable);
        p1.checkPositionIndexes(i10, i10 + i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i10 + i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            char[] cArr = this.f81310k;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | NotificationCompat.FLAG_LOCAL_ONLY]);
        }
    }

    @Override // ph.n
    public final o g(g gVar, Character ch2) {
        return new h(gVar);
    }
}

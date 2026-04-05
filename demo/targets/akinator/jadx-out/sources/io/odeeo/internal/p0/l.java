package io.odeeo.internal.p0;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l {
    public static void closeQuietly(i iVar) {
        if (iVar != null) {
            try {
                iVar.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(i iVar, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = iVar.read(bArr, i11, i10 - i11);
            if (i12 == -1) {
                throw new IllegalStateException(w0.i.a(i11, i10, "Not enough data could be read: ", " < "));
            }
            i11 += i12;
        }
        return bArr;
    }

    public static byte[] readToEnd(i iVar) throws IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i10 = 0;
        int i11 = 0;
        while (i10 != -1) {
            if (i11 == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i10 = iVar.read(bArrCopyOf, i11, bArrCopyOf.length - i11);
            if (i10 != -1) {
                i11 += i10;
            }
        }
        return Arrays.copyOf(bArrCopyOf, i11);
    }
}

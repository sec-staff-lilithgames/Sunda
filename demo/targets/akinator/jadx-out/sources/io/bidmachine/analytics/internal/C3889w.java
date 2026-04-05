package io.bidmachine.analytics.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: io.bidmachine.analytics.internal.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3889w implements B {
    @Override // io.bidmachine.analytics.internal.B
    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return a("HMACSHA256", bArr, bArr3, bArr2, 32);
    }

    private final byte[] a(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) throws IllegalStateException, GeneralSecurityException {
        Mac mac = Mac.getInstance(str);
        if (i10 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i10];
        mac.init(new SecretKeySpec(mac.doFinal(bArr), str));
        byte[] bArrDoFinal = new byte[0];
        int i11 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            if (bArr3 != null) {
                mac.update(bArr3);
            }
            mac.update((byte) i11);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= i10) {
                System.arraycopy(bArrDoFinal, 0, bArr4, length, i10 - length);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i11++;
        }
    }
}

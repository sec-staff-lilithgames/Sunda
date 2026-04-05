package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhrl {
    private static final Charset zza = Charset.forName(C.UTF8_NAME);

    public static byte[] zza(String str, int i10) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzhrk zzhrkVar = new zzhrk(2, new byte[(length * 3) / 4]);
        if (!zzhrkVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i11 = zzhrkVar.zzb;
        byte[] bArr = zzhrkVar.zza;
        if (i11 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }
}

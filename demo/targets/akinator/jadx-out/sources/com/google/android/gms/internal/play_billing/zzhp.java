package com.google.android.gms.internal.play_billing;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.BKC.KerkSviMAy;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhp {
    static final Charset zza;
    public static final byte[] zzb;

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    static {
        Charset.forName(KerkSviMAy.kDLYrKsWMhftRJC);
        zza = Charset.forName(C.UTF8_NAME);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzgl(bArr, 0, 0, false, null).zza(0);
        } catch (zzhr e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}

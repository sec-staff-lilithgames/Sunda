package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbce extends zzbbw {
    private MessageDigest zzb;
    private final int zzc;
    private final int zzd;

    public zzbce(int i10) {
        int i11 = i10 >> 3;
        this.zzc = (i10 & 7) > 0 ? i11 + 1 : i11;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzbbw
    public final byte[] zza(String str) {
        synchronized (this.zza) {
            try {
                MessageDigest messageDigestZzb = zzb();
                this.zzb = messageDigestZzb;
                if (messageDigestZzb == null) {
                    return new byte[0];
                }
                messageDigestZzb.reset();
                this.zzb.update(str.getBytes(Charset.forName(C.UTF8_NAME)));
                byte[] bArrDigest = this.zzb.digest();
                int length = bArrDigest.length;
                int i10 = this.zzc;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i11 = this.zzd & 7;
                if (i11 > 0) {
                    long j10 = 0;
                    for (int i12 = 0; i12 < length; i12++) {
                        if (i12 > 0) {
                            j10 <<= 8;
                        }
                        j10 += bArr[i12] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                    }
                    long j11 = j10 >>> (8 - i11);
                    while (true) {
                        i10--;
                        if (i10 < 0) {
                            break;
                        }
                        bArr[i10] = (byte) (255 & j11);
                        j11 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

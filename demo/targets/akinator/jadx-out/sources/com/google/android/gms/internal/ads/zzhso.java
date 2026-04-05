package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhso implements zzhik {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    @Override // com.google.android.gms.internal.ads.zzhik
    public final byte[] zza(byte[] bArr, int i10) throws IllegalStateException, GeneralSecurityException {
        if (i10 > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.zza;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i10);
    }

    public final /* synthetic */ String zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Key zzc() {
        return this.zzc;
    }

    public zzhso(String str, Key key) throws GeneralSecurityException {
        int i10;
        zzhsn zzhsnVar = new zzhsn(this);
        this.zza = zzhsnVar;
        if (zzhcy.zza(2)) {
            this.zzb = str;
            this.zzc = key;
            if (key.getEncoded().length >= 16) {
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            i10 = 20;
                            this.zzd = i10;
                            zzhsnVar.get();
                            return;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            i10 = 28;
                            this.zzd = i10;
                            zzhsnVar.get();
                            return;
                        }
                        break;
                    case 392315118:
                        if (str.equals(PtLatqAYjEFT.XitWUe)) {
                            i10 = 32;
                            this.zzd = i10;
                            zzhsnVar.get();
                            return;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            i10 = 48;
                            this.zzd = i10;
                            zzhsnVar.get();
                            return;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            i10 = 64;
                            this.zzd = i10;
                            zzhsnVar.get();
                            return;
                        }
                        break;
                }
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}

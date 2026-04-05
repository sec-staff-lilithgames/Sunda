package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfz extends zzft {
    private zzgf zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfz() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.zzb;
        String str = zzep.zza;
        System.arraycopy(bArr2, this.zzc, bArr, i10, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzh(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) throws IOException {
        zzf(zzgfVar);
        this.zza = zzgfVar;
        Uri uriNormalizeScheme = zzgfVar.zza.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        zzgmd.zzf("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = zzep.zza;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw zzat.zza("Unexpected URI format: ".concat(String.valueOf(uriNormalizeScheme)), null);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e10) {
                throw zzat.zza("Error while parsing Base64 encoded string: ".concat(String.valueOf(str2)), e10);
            }
        } else {
            this.zzb = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j10 = zzgfVar.zze;
        int length = this.zzb.length;
        if (j10 > length) {
            this.zzb = null;
            throw new zzgc(2008);
        }
        int i10 = (int) j10;
        this.zzc = i10;
        int i11 = length - i10;
        this.zzd = i11;
        long j11 = zzgfVar.zzf;
        if (j11 != -1) {
            this.zzd = (int) Math.min(i11, j11);
        }
        zzg(zzgfVar);
        return j11 != -1 ? j11 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        zzgf zzgfVar = this.zza;
        if (zzgfVar != null) {
            return zzgfVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzi();
        }
        this.zza = null;
    }
}

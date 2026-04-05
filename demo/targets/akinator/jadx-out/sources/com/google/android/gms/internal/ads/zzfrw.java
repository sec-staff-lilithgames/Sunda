package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfrw extends zzfrt {
    private String zza;
    private boolean zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private byte zzf;

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zza(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zzb(boolean z10) {
        this.zzb = z10;
        this.zzf = (byte) (this.zzf | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zzc(boolean z10) {
        this.zzc = true;
        this.zzf = (byte) (this.zzf | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zzd(boolean z10) {
        this.zzf = (byte) (this.zzf | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zze(long j10) {
        this.zzd = 100L;
        this.zzf = (byte) (this.zzf | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zzf(boolean z10) {
        this.zzf = (byte) (this.zzf | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfrt zzg(long j10) {
        this.zze = 300L;
        this.zzf = (byte) (this.zzf | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfrt
    public final zzfru zzh() {
        String str;
        if (this.zzf == 63 && (str = this.zza) != null) {
            return new zzfrx(str, this.zzb, this.zzc, false, this.zzd, false, this.zze, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.zza == null) {
            sb2.append(" clientVersion");
        }
        if ((this.zzf & 1) == 0) {
            sb2.append(" shouldGetAdvertisingId");
        }
        if ((this.zzf & 2) == 0) {
            sb2.append(" isGooglePlayServicesAvailable");
        }
        if ((this.zzf & 4) == 0) {
            sb2.append(" enableQuerySignalsTimeout");
        }
        if ((this.zzf & 8) == 0) {
            sb2.append(" querySignalsTimeoutMs");
        }
        if ((this.zzf & 16) == 0) {
            sb2.append(" enableQuerySignalsCache");
        }
        if ((this.zzf & 32) == 0) {
            sb2.append(" querySignalsCacheTtlSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbdr {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbdr(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        this.zza = inputStream;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = j10;
        this.zze = z12;
    }

    public static zzbdr zza(InputStream inputStream, boolean z10, boolean z11, long j10, boolean z12) {
        return new zzbdr(inputStream, z10, z11, j10, z12);
    }

    public final InputStream zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzd;
    }

    public final boolean zzf() {
        return this.zze;
    }
}

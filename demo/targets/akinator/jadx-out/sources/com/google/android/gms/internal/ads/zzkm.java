package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzkm {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkm() {
        this.zza = C.TIME_UNSET;
        this.zzb = -3.4028235E38f;
        this.zzc = C.TIME_UNSET;
    }

    public final zzkm zza(long j10) {
        this.zza = j10;
        return this;
    }

    public final zzkm zzb(float f10) {
        boolean z10 = true;
        if (f10 <= 0.0f && f10 != -3.4028235E38f) {
            z10 = false;
        }
        zzgmd.zza(z10);
        this.zzb = f10;
        return this;
    }

    public final zzkm zzc(long j10) {
        boolean z10 = true;
        if (j10 < 0) {
            if (j10 == C.TIME_UNSET) {
                j10 = -9223372036854775807L;
            } else {
                z10 = false;
            }
        }
        zzgmd.zza(z10);
        this.zzc = j10;
        return this;
    }

    public final zzkn zzd() {
        return new zzkn(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzkm(zzkn zzknVar, byte[] bArr) {
        this.zza = zzknVar.zza;
        this.zzb = zzknVar.zzb;
        this.zzc = zzknVar.zzc;
    }
}

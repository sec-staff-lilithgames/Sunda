package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzpk {
    private boolean zza;
    private boolean zzb;
    private boolean zzc;

    public final zzpk zza(boolean z10) {
        this.zza = true;
        return this;
    }

    public final zzpk zzb(boolean z10) {
        this.zzb = z10;
        return this;
    }

    public final zzpk zzc(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzpl zzd() {
        if (this.zza || !(this.zzb || this.zzc)) {
            return new zzpl(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public final /* synthetic */ boolean zze() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzf() {
        return this.zzb;
    }

    public final /* synthetic */ boolean zzg() {
        return this.zzc;
    }
}

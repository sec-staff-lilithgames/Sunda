package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaw {
    private final zzr zza = new zzr();

    public final zzaw zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzaw zzb(int i10, boolean z10) {
        if (z10) {
            this.zza.zza(i10);
        }
        return this;
    }

    public final zzaw zzc(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.zza.zza(iArr[i10]);
        }
        return this;
    }

    public final zzaw zzd(zzax zzaxVar) {
        zzs zzsVarZza = zzaxVar.zza();
        for (int i10 = 0; i10 < zzsVarZza.zzb(); i10++) {
            this.zza.zza(zzsVarZza.zzc(i10));
        }
        return this;
    }

    public final zzax zze() {
        return new zzax(this.zza.zzb(), null);
    }
}

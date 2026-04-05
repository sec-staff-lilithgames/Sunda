package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhz implements zzko {
    private final zzly zza;
    private final zzhy zzb;
    private zzln zzc;
    private zzko zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhz(zzhy zzhyVar, zzdc zzdcVar) {
        this.zzb = zzhyVar;
        this.zza = new zzly(zzdcVar);
    }

    public final void zza() {
        this.zzf = true;
        this.zza.zza();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zzb();
    }

    public final void zzc(long j10) {
        this.zza.zzc(j10);
    }

    public final void zzd(zzln zzlnVar) throws zzib {
        zzko zzkoVar;
        zzko zzkoVarZzd = zzlnVar.zzd();
        if (zzkoVarZzd == null || zzkoVarZzd == (zzkoVar = this.zzd)) {
            return;
        }
        if (zzkoVar != null) {
            throw zzib.zzc(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzkoVarZzd;
        this.zzc = zzlnVar;
        zzkoVarZzd.zzi(this.zza.zzj());
    }

    public final void zze(zzln zzlnVar) {
        if (zzlnVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long zzf(boolean r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzln r0 = r5.zzc
            if (r0 == 0) goto L69
            boolean r0 = r0.zzZ()
            if (r0 != 0) goto L69
            if (r6 == 0) goto L15
            com.google.android.gms.internal.ads.zzln r0 = r5.zzc
            int r0 = r0.zze()
            r1 = 2
            if (r0 != r1) goto L69
        L15:
            com.google.android.gms.internal.ads.zzln r0 = r5.zzc
            boolean r0 = r0.zzY()
            if (r0 != 0) goto L28
            if (r6 != 0) goto L69
            com.google.android.gms.internal.ads.zzln r6 = r5.zzc
            boolean r6 = r6.zzdb()
            if (r6 == 0) goto L28
            goto L69
        L28:
            com.google.android.gms.internal.ads.zzko r6 = r5.zzd
            r6.getClass()
            long r0 = r6.zzg()
            boolean r2 = r5.zze
            if (r2 == 0) goto L4d
            com.google.android.gms.internal.ads.zzly r2 = r5.zza
            long r3 = r2.zzg()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L43
            r2.zzb()
            goto L75
        L43:
            r3 = 0
            r5.zze = r3
            boolean r3 = r5.zzf
            if (r3 == 0) goto L4d
            r2.zza()
        L4d:
            com.google.android.gms.internal.ads.zzly r2 = r5.zza
            r2.zzc(r0)
            com.google.android.gms.internal.ads.zzav r6 = r6.zzj()
            com.google.android.gms.internal.ads.zzav r0 = r2.zzj()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L75
            r2.zzi(r6)
            com.google.android.gms.internal.ads.zzhy r0 = r5.zzb
            r0.zzc(r6)
            goto L75
        L69:
            r6 = 1
            r5.zze = r6
            boolean r6 = r5.zzf
            if (r6 == 0) goto L75
            com.google.android.gms.internal.ads.zzly r6 = r5.zza
            r6.zza()
        L75:
            long r0 = r5.zzg()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhz.zzf(boolean):long");
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final long zzg() {
        if (this.zze) {
            return this.zza.zzg();
        }
        zzko zzkoVar = this.zzd;
        zzkoVar.getClass();
        return zzkoVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final boolean zzh() {
        if (this.zze) {
            return false;
        }
        zzko zzkoVar = this.zzd;
        zzkoVar.getClass();
        return zzkoVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final void zzi(zzav zzavVar) {
        zzko zzkoVar = this.zzd;
        if (zzkoVar != null) {
            zzkoVar.zzi(zzavVar);
            zzavVar = this.zzd.zzj();
        }
        this.zza.zzi(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzko
    public final zzav zzj() {
        zzko zzkoVar = this.zzd;
        return zzkoVar != null ? zzkoVar.zzj() : this.zza.zzj();
    }
}

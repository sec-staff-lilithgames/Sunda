package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaef implements zzada {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzadd zzf;
    private zzaem zzg;

    public zzaef(int i10, int i11, String str) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        int i10 = this.zza;
        zzgmd.zzh((i10 == -1 || this.zzb == -1) ? false : true);
        int i11 = this.zzb;
        zzeg zzegVar = new zzeg(i11);
        ((zzacr) zzadbVar).zzh(zzegVar.zzi(), 0, i11, false);
        return zzegVar.zzt() == i10;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zzf = zzaddVar;
        zzaem zzaemVarZzu = zzaddVar.zzu(1024, 4);
        this.zzg = zzaemVarZzu;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzl(str);
        zztVar.zzm(str);
        zzaemVarZzu.zzu(zztVar.zzM());
        this.zzf.zzv();
        this.zzf.zzw(new zzaeg(C.TIME_UNSET));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        int i10 = this.zze;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaem zzaemVar = this.zzg;
        zzaemVar.getClass();
        int iZzy = zzaemVar.zzy(zzadbVar, 1024, true);
        if (iZzy == -1) {
            this.zze = 2;
            this.zzg.zzx(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZzy;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        if (j10 == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }
}

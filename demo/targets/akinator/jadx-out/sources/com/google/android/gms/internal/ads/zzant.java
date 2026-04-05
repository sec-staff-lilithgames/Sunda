package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzant {
    private final List zza;
    private final zzaem[] zzc;
    private final String zzb = "video/mp2t";
    private final zzfq zzd = new zzfq(new zzfp() { // from class: com.google.android.gms.internal.ads.zzans
        @Override // com.google.android.gms.internal.ads.zzfp
        public final /* synthetic */ void zza(long j10, zzeg zzegVar) {
            this.zza.zzf(j10, zzegVar);
        }
    });

    public zzant(List list, String str) {
        this.zza = list;
        this.zzc = new zzaem[list.size()];
    }

    public final void zza(zzadd zzaddVar, zzaoe zzaoeVar) {
        int i10 = 0;
        while (true) {
            zzaem[] zzaemVarArr = this.zzc;
            if (i10 >= zzaemVarArr.length) {
                return;
            }
            zzaoeVar.zza();
            zzaem zzaemVarZzu = zzaddVar.zzu(zzaoeVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i10);
            String str = zzvVar.zzo;
            boolean z10 = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z10 = false;
            }
            zzgmd.zzf(z10, "Invalid closed caption MIME type provided: %s", str);
            String strZzc = zzvVar.zza;
            if (strZzc == null) {
                strZzc = zzaoeVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(strZzc);
            zztVar.zzl(this.zzb);
            zztVar.zzm(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzJ(zzvVar.zzL);
            zztVar.zzp(zzvVar.zzr);
            zzaemVarZzu.zzu(zztVar.zzM());
            zzaemVarArr[i10] = zzaemVarZzu;
            i10++;
        }
    }

    public final void zzb(int i10) {
        this.zzd.zza(i10);
    }

    public final void zzc(long j10, zzeg zzegVar) {
        this.zzd.zzc(j10, zzegVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    public final /* synthetic */ void zzf(long j10, zzeg zzegVar) {
        zzacn.zza(j10, zzegVar, this.zzc);
    }
}

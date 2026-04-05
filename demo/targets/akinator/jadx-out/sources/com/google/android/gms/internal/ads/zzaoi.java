package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaoi {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzaem[] zzc;
    private final zzfq zzd;

    public zzaoi(List list, String str) {
        this.zza = list;
        this.zzc = new zzaem[list.size()];
        zzfq zzfqVar = new zzfq(new zzfp() { // from class: com.google.android.gms.internal.ads.zzaoh
            @Override // com.google.android.gms.internal.ads.zzfp
            public final /* synthetic */ void zza(long j10, zzeg zzegVar) {
                this.zza.zzc(j10, zzegVar);
            }
        });
        this.zzd = zzfqVar;
        zzfqVar.zza(3);
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
            zzt zztVar = new zzt();
            zztVar.zza(zzaoeVar.zzc());
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

    public final void zzb(long j10, zzeg zzegVar) {
        if (zzegVar.zzd() < 9) {
            return;
        }
        int iZzB = zzegVar.zzB();
        int iZzB2 = zzegVar.zzB();
        int iZzs = zzegVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j10, zzegVar);
        }
    }

    public final /* synthetic */ void zzc(long j10, zzeg zzegVar) {
        zzacn.zzb(j10, zzegVar, this.zzc);
    }
}

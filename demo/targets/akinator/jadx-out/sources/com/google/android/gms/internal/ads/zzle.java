package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzle {
    private final zzpc zza;
    private final zzld zze;
    private final zzmi zzh;
    private final zzdm zzi;
    private boolean zzj;
    private zzgz zzk;
    private zzwn zzl = new zzwn(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzle(zzld zzldVar, zzmi zzmiVar, zzdm zzdmVar, zzpc zzpcVar) {
        this.zza = zzpcVar;
        this.zze = zzldVar;
        this.zzh = zzmiVar;
        this.zzi = zzdmVar;
    }

    private final void zzr() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzlb zzlbVar = (zzlb) it.next();
            if (zzlbVar.zzc.isEmpty()) {
                zzs(zzlbVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzlb zzlbVar) {
        zzla zzlaVar = (zzla) this.zzf.get(zzlbVar);
        if (zzlaVar != null) {
            zzlaVar.zza.zzr(zzlaVar.zzb);
        }
    }

    private final void zzt(int i10, int i11) {
        while (true) {
            i11--;
            if (i11 < i10) {
                return;
            }
            zzlb zzlbVar = (zzlb) this.zzb.remove(i11);
            this.zzd.remove(zzlbVar.zzb);
            zzu(i11, -zzlbVar.zza.zzz().zza());
            zzlbVar.zze = true;
            if (this.zzj) {
                zzw(zzlbVar);
            }
        }
    }

    private final void zzu(int i10, int i11) {
        while (true) {
            List list = this.zzb;
            if (i10 >= list.size()) {
                return;
            }
            ((zzlb) list.get(i10)).zzd += i11;
            i10++;
        }
    }

    private final void zzv(zzlb zzlbVar) {
        zzup zzupVar = zzlbVar.zza;
        zzuv zzuvVar = new zzuv() { // from class: com.google.android.gms.internal.ads.zzlc
            @Override // com.google.android.gms.internal.ads.zzuv
            public final /* synthetic */ void zza(zzuw zzuwVar, zzbf zzbfVar) {
                this.zza.zzi(zzuwVar, zzbfVar);
            }
        };
        zzkz zzkzVar = new zzkz(this, zzlbVar);
        this.zzf.put(zzlbVar, new zzla(zzupVar, zzuvVar, zzkzVar));
        zzupVar.zzl(new Handler(zzep.zze(), null), zzkzVar);
        zzupVar.zzn(new Handler(zzep.zze(), null), zzkzVar);
        zzupVar.zzp(zzuvVar, this.zzk, this.zza);
    }

    private final void zzw(zzlb zzlbVar) {
        if (zzlbVar.zze && zzlbVar.zzc.isEmpty()) {
            zzla zzlaVar = (zzla) this.zzf.remove(zzlbVar);
            zzlaVar.getClass();
            zzuw zzuwVar = zzlaVar.zza;
            zzuwVar.zzs(zzlaVar.zzb);
            zzkz zzkzVar = zzlaVar.zzc;
            zzuwVar.zzm(zzkzVar);
            zzuwVar.zzo(zzkzVar);
            this.zzg.remove(zzlbVar);
        }
    }

    public final zzbf zza(int i10, int i11, List list) {
        zzgmd.zza(i10 >= 0 && i10 <= i11 && i11 <= zzc());
        zzgmd.zza(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((zzlb) this.zzb.get(i12)).zza.zzA((zzak) list.get(i12 - i10));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final void zzd(zzgz zzgzVar) {
        zzgmd.zzh(!this.zzj);
        this.zzk = zzgzVar;
        int i10 = 0;
        while (true) {
            List list = this.zzb;
            if (i10 >= list.size()) {
                this.zzj = true;
                return;
            }
            zzlb zzlbVar = (zzlb) list.get(i10);
            zzv(zzlbVar);
            this.zzg.add(zzlbVar);
            i10++;
        }
    }

    public final zzus zze(zzuu zzuuVar, zzyv zzyvVar, long j10) {
        int i10 = zzll.zzb;
        Pair pair = (Pair) zzuuVar.zza;
        Object obj = pair.first;
        zzuu zzuuVarZza = zzuuVar.zza(pair.second);
        zzlb zzlbVar = (zzlb) this.zzd.get(obj);
        zzlbVar.getClass();
        this.zzg.add(zzlbVar);
        zzla zzlaVar = (zzla) this.zzf.get(zzlbVar);
        if (zzlaVar != null) {
            zzlaVar.zza.zzq(zzlaVar.zzb);
        }
        zzlbVar.zzc.add(zzuuVarZza);
        zzum zzumVarZzC = zzlbVar.zza.zzG(zzuuVarZza, zzyvVar, j10);
        this.zzc.put(zzumVarZzC, zzlbVar);
        zzr();
        return zzumVarZzC;
    }

    public final void zzf(zzus zzusVar) {
        IdentityHashMap identityHashMap = this.zzc;
        zzlb zzlbVar = (zzlb) identityHashMap.remove(zzusVar);
        zzlbVar.getClass();
        zzlbVar.zza.zzD(zzusVar);
        zzlbVar.zzc.remove(((zzum) zzusVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzlbVar);
    }

    public final void zzg() {
        for (zzla zzlaVar : this.zzf.values()) {
            try {
                zzlaVar.zza.zzs(zzlaVar.zzb);
            } catch (RuntimeException e10) {
                zzdt.zzf("MediaSourceList", "Failed to release child source.", e10);
            }
            zzuw zzuwVar = zzlaVar.zza;
            zzkz zzkzVar = zzlaVar.zzc;
            zzuwVar.zzm(zzkzVar);
            zzuwVar.zzo(zzkzVar);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final zzbf zzh() {
        List list = this.zzb;
        if (list.isEmpty()) {
            return zzbf.zza;
        }
        int iZza = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzlb zzlbVar = (zzlb) list.get(i10);
            zzlbVar.zzd = iZza;
            iZza += zzlbVar.zza.zzz().zza();
        }
        return new zzll(list, this.zzl);
    }

    public final /* synthetic */ void zzi(zzuw zzuwVar, zzbf zzbfVar) {
        this.zze.zzo();
    }

    public final /* synthetic */ zzmi zzj() {
        return this.zzh;
    }

    public final /* synthetic */ zzdm zzk() {
        return this.zzi;
    }

    public final zzbf zzl(List list, zzwn zzwnVar) {
        List list2 = this.zzb;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzwnVar);
    }

    public final zzbf zzm(int i10, List list, zzwn zzwnVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwnVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                zzlb zzlbVar = (zzlb) list.get(i11 - i10);
                if (i11 > 0) {
                    zzlb zzlbVar2 = (zzlb) this.zzb.get(i11 - 1);
                    zzlbVar.zzc(zzlbVar2.zza.zzz().zza() + zzlbVar2.zzd);
                } else {
                    zzlbVar.zzc(0);
                }
                zzu(i11, zzlbVar.zza.zzz().zza());
                this.zzb.add(i11, zzlbVar);
                this.zzd.put(zzlbVar.zzb, zzlbVar);
                if (this.zzj) {
                    zzv(zzlbVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzlbVar);
                    } else {
                        zzs(zzlbVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzbf zzn(int i10, int i11, zzwn zzwnVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11 && i11 <= zzc()) {
            z10 = true;
        }
        zzgmd.zza(z10);
        this.zzl = zzwnVar;
        zzt(i10, i11);
        return zzh();
    }

    public final zzbf zzo(int i10, int i11, int i12, zzwn zzwnVar) {
        zzgmd.zza(zzc() >= 0);
        this.zzl = null;
        return zzh();
    }

    public final zzbf zzp(zzwn zzwnVar) {
        int iZzc = zzc();
        if (zzwnVar.zza() != iZzc) {
            zzwnVar = zzwnVar.zzh().zzf(0, iZzc);
        }
        this.zzl = zzwnVar;
        return zzh();
    }

    public final zzwn zzq() {
        return this.zzl;
    }
}

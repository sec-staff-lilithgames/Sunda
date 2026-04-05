package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzon {
    private final zzbd zza;
    private zzgpe zzb = zzgpe.zzi();
    private zzgph zzc = zzgph.zza();
    private zzuu zzd;
    private zzuu zze;
    private zzuu zzf;

    public zzon(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    private final void zzj(zzbf zzbfVar) {
        zzgpg zzgpgVar = new zzgpg();
        if (this.zzb.isEmpty()) {
            zzk(zzgpgVar, this.zze, zzbfVar);
            if (!Objects.equals(this.zzf, this.zze)) {
                zzk(zzgpgVar, this.zzf, zzbfVar);
            }
            if (!Objects.equals(this.zzd, this.zze) && !Objects.equals(this.zzd, this.zzf)) {
                zzk(zzgpgVar, this.zzd, zzbfVar);
            }
        } else {
            for (int i10 = 0; i10 < this.zzb.size(); i10++) {
                zzk(zzgpgVar, (zzuu) this.zzb.get(i10), zzbfVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzgpgVar, this.zzd, zzbfVar);
            }
        }
        this.zzc = zzgpgVar.zzc();
    }

    private final void zzk(zzgpg zzgpgVar, zzuu zzuuVar, zzbf zzbfVar) {
        if (zzuuVar == null) {
            return;
        }
        if (zzbfVar.zze(zzuuVar.zza) != -1) {
            zzgpgVar.zza(zzuuVar, zzbfVar);
            return;
        }
        zzbf zzbfVar2 = (zzbf) this.zzc.get(zzuuVar);
        if (zzbfVar2 != null) {
            zzgpgVar.zza(zzuuVar, zzbfVar2);
        }
    }

    private static zzuu zzl(zzbb zzbbVar, zzgpe zzgpeVar, zzuu zzuuVar, zzbd zzbdVar) {
        zzbf zzbfVarZzq = zzbbVar.zzq();
        int iZzr = zzbbVar.zzr();
        Object objZzf = zzbfVarZzq.zzg() ? null : zzbfVarZzq.zzf(iZzr);
        int iZzf = -1;
        if (!zzbbVar.zzx() && !zzbfVarZzq.zzg()) {
            iZzf = zzbfVarZzq.zzd(iZzr, zzbdVar, false).zzf(zzep.zzq(zzbbVar.zzu()));
        }
        int i10 = iZzf;
        for (int i11 = 0; i11 < zzgpeVar.size(); i11++) {
            zzuu zzuuVar2 = (zzuu) zzgpeVar.get(i11);
            if (zzm(zzuuVar2, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i10)) {
                return zzuuVar2;
            }
        }
        if (zzgpeVar.isEmpty() && zzuuVar != null && zzm(zzuuVar, objZzf, zzbbVar.zzx(), zzbbVar.zzy(), zzbbVar.zzz(), i10)) {
            return zzuuVar;
        }
        return null;
    }

    private static boolean zzm(zzuu zzuuVar, Object obj, boolean z10, int i10, int i11, int i12) {
        if (zzuuVar.zza.equals(obj)) {
            return z10 ? zzuuVar.zzb == i10 && zzuuVar.zzc == i11 : zzuuVar.zzb == -1 && zzuuVar.zze == i12;
        }
        return false;
    }

    public final zzuu zza() {
        return this.zzd;
    }

    public final zzuu zzb() {
        return this.zze;
    }

    public final zzuu zzc() {
        return this.zzf;
    }

    public final zzuu zzd() {
        Object next;
        Object objLast;
        if (this.zzb.isEmpty()) {
            return null;
        }
        List list = this.zzb;
        if (list != null) {
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            objLast = list.get(list.size() - 1);
        } else if (list instanceof SortedSet) {
            objLast = ((SortedSet) list).last();
        } else {
            Iterator it = list.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            objLast = next;
        }
        return (zzuu) objLast;
    }

    public final zzbf zze(zzuu zzuuVar) {
        return (zzbf) this.zzc.get(zzuuVar);
    }

    public final void zzf(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzg(zzbb zzbbVar) {
        this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        zzj(zzbbVar.zzq());
    }

    public final void zzh(List list, zzuu zzuuVar, zzbb zzbbVar) {
        this.zzb = zzgpe.zzq(list);
        if (!list.isEmpty()) {
            this.zze = (zzuu) list.get(0);
            zzuuVar.getClass();
            this.zzf = zzuuVar;
        }
        if (this.zzd == null) {
            this.zzd = zzl(zzbbVar, this.zzb, this.zze, this.zza);
        }
        zzj(zzbbVar.zzq());
    }

    public final /* synthetic */ zzgpe zzi() {
        return this.zzb;
    }
}

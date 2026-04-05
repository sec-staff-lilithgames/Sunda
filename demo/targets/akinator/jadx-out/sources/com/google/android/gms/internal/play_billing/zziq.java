package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zziq implements zzix {
    private final zzim zza;
    private final zzjj zzb;
    private final boolean zzc;
    private final zzgx zzd;

    private zziq(zzjj zzjjVar, zzgx zzgxVar, zzim zzimVar) {
        this.zzb = zzjjVar;
        this.zzc = zzimVar instanceof zzhh;
        this.zzd = zzgxVar;
        this.zza = zzimVar;
    }

    public static zziq zzc(zzjj zzjjVar, zzgx zzgxVar, zzim zzimVar) {
        return new zziq(zzjjVar, zzgxVar, zzimVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zza(Object obj) {
        int iZzb = ((zzhk) obj).zzc.zzb();
        return this.zzc ? iZzb + ((zzhh) obj).zzb.zzc() : iZzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final int zzb(Object obj) {
        int iHashCode = ((zzhk) obj).zzc.hashCode();
        return this.zzc ? (iHashCode * 53) + ((zzhh) obj).zzb.zza.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final Object zze() {
        zzim zzimVar = this.zza;
        return zzimVar instanceof zzhk ? ((zzhk) zzimVar).zzp() : zzimVar.zzI().zzh();
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzf(Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzg(Object obj, Object obj2) {
        zziz.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            zziz.zzo(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzfz zzfzVar) throws IOException {
        zzhk zzhkVar = (zzhk) obj;
        if (zzhkVar.zzc == zzjk.zzc()) {
            zzhkVar.zzc = zzjk.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final void zzi(Object obj, zzjw zzjwVar) throws IOException {
        Iterator itZze = ((zzhh) obj).zzb.zze();
        while (itZze.hasNext()) {
            Map.Entry entry = (Map.Entry) itZze.next();
            zzha zzhaVar = (zzha) entry.getKey();
            if (zzhaVar.zzc() != zzjv.MESSAGE || zzhaVar.zze() || zzhaVar.zzd()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof zzht) {
                zzjwVar.zzw(zzhaVar.zza(), ((zzht) entry).zza().zzb());
            } else {
                zzjwVar.zzw(zzhaVar.zza(), entry.getValue());
            }
        }
        ((zzhk) obj).zzc.zzk(zzjwVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzj(Object obj, Object obj2) {
        if (!((zzhk) obj).zzc.equals(((zzhk) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((zzhh) obj).zzb.equals(((zzhh) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzix
    public final boolean zzk(Object obj) {
        return ((zzhh) obj).zzb.zzh();
    }
}

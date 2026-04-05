package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaz implements Comparator {
    final /* synthetic */ zzai zza;
    final /* synthetic */ zzg zzb;

    public zzaz(zzai zzaiVar, zzg zzgVar) {
        this.zza = zzaiVar;
        this.zzb = zzgVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzao zzaoVar = (zzao) obj;
        zzao zzaoVar2 = (zzao) obj2;
        if (zzaoVar instanceof zzat) {
            return !(zzaoVar2 instanceof zzat) ? 1 : 0;
        }
        if (zzaoVar2 instanceof zzat) {
            return -1;
        }
        zzai zzaiVar = this.zza;
        return zzaiVar == null ? zzaoVar.zzc().compareTo(zzaoVar2.zzc()) : (int) zzh.zzi(zzaiVar.zza(this.zzb, Arrays.asList(zzaoVar, zzaoVar2)).zzd().doubleValue());
    }
}

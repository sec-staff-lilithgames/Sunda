package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzcrn {
    private final zzctm zza;
    private final View zzb;
    private final zzffv zzc;
    private final zzcgy zzd;

    public zzcrn(View view, zzcgy zzcgyVar, zzctm zzctmVar, zzffv zzffvVar) {
        this.zzb = view;
        this.zzd = zzcgyVar;
        this.zza = zzctmVar;
        this.zzc = zzffvVar;
    }

    public final zzcgy zza() {
        return this.zzd;
    }

    public final View zzb() {
        return this.zzb;
    }

    public final zzctm zzc() {
        return this.zza;
    }

    public final zzffv zzd() {
        return this.zzc;
    }

    public zzdaa zze(Set set) {
        return new zzdaa(set);
    }
}

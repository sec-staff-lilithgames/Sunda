package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgqu extends zzgnf {
    final transient zzgmv zza;

    public zzgqu(Map map, zzgmv zzgmvVar) {
        super(map);
        this.zza = zzgmvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnf, com.google.android.gms.internal.ads.zzgnw
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgnw, com.google.android.gms.internal.ads.zzgnz
    public final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgnw, com.google.android.gms.internal.ads.zzgnz
    public final Map zzl() {
        return zzm();
    }
}

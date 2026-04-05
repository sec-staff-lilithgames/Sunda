package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcqi implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;

    private zzcqi(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar3;
    }

    public static zzcqi zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3) {
        return new zzcqi(zzifqVar, zzifqVar2, zzifqVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((JSONObject) this.zzb.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new zzdgn((zzcqb) this.zza.zzb(), zzfjn.zzc()));
        zzifp.zzb(setSingleton);
        return setSingleton;
    }
}

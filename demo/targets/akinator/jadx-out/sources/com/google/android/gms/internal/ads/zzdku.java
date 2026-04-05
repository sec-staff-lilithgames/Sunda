package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdku implements zzifh {
    private final zzifq zza;

    private zzdku(zzifq zzifqVar, zzifq zzifqVar2) {
        this.zza = zzifqVar;
    }

    public static zzdku zza(zzifq zzifqVar, zzifq zzifqVar2) {
        return new zzdku(zzifqVar, zzifqVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        VersionInfoParcel versionInfoParcelZza = ((zzckk) this.zza).zza();
        com.google.android.gms.ads.internal.zzt.zzc();
        return new zzbar(UUID.randomUUID().toString(), versionInfoParcelZza, "native", new JSONObject(), false, true);
    }
}

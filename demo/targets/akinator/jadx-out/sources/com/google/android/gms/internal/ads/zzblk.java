package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzblk implements zzblx {
    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgy zzcgyVar = (zzcgy) obj;
        if (map.containsKey("start")) {
            zzcgyVar.zzP().zzr();
        } else if (map.containsKey("stop")) {
            zzcgyVar.zzP().zzs();
        } else if (map.containsKey("cancel")) {
            zzcgyVar.zzP().zzt();
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcyj {
    public static final zzbzt zza(Context context, VersionInfoParcel versionInfoParcel, zzffu zzffuVar, zzbzp zzbzpVar) {
        zzbzq zzbzqVar = zzffuVar.zzA;
        if (zzbzqVar == null) {
            return null;
        }
        zzffz zzffzVar = zzffuVar.zzs;
        return new zzbzo(context, versionInfoParcel, zzbzqVar, zzffzVar != null ? zzffzVar.zzb : null, zzbzpVar);
    }
}

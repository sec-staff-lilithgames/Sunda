package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public final class zzbfa {
    public static final void zza(zzbez zzbezVar, zzbex zzbexVar) {
        if (zzbexVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbexVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbezVar.zza(zzbexVar.zzb(), zzbexVar.zzc(), zzbexVar.zza(), zzbexVar.zzd());
    }
}

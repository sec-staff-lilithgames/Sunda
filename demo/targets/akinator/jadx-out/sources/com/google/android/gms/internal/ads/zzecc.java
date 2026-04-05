package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzecc implements zzdbu {
    private final Context zza;
    private final zzcaf zzb;

    public zzecc(Context context, zzcaf zzcafVar) {
        this.zza = context;
        this.zzb = zzcafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdU(zzfgf zzfgfVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str = zzfgfVar.zzb.zzb.zze;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zzcaf zzcafVar = this.zzb;
        Context context = this.zza;
        zzcafVar.zzc(context, zzfgfVar.zza.zza.zzd);
        zzcafVar.zzm(context, str);
    }

    @Override // com.google.android.gms.internal.ads.zzdbu
    public final void zzdT(zzbxj zzbxjVar) {
    }
}

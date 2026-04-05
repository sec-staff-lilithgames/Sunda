package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcpk implements zzguf {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcpq zzb;

    public zzcpk(zzcpq zzcpqVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzcpqVar);
        this.zzb = zzcpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzcpq zzcpqVar = this.zzb;
        zzcpqVar.zzu().zza(zzcpqVar.zzt().zzb(zzcpqVar.zzr(), zzcpqVar.zzs(), false, this.zza, null, zzcpqVar.zzp(), zzcpqVar.zzw()), null);
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str = this.zza;
        String str2 = (String) obj;
        zzcpq zzcpqVar = this.zzb;
        zzcpqVar.zzu().zza(zzcpqVar.zzt().zzb(zzcpqVar.zzr(), zzcpqVar.zzs(), false, str, str2, zzcpqVar.zzp(), zzcpqVar.zzw()), zzcpqVar.zzv());
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfan implements zzifh {
    public static zzeyd zza(Context context, zzcay zzcayVar, zzcaz zzcazVar, Object obj, zzezf zzezfVar, zzezz zzezzVar, zzifb zzifbVar, zzifb zzifbVar2, zzifb zzifbVar3, zzifb zzifbVar4, zzifb zzifbVar5, zzifb zzifbVar6, zzifb zzifbVar7, Executor executor, zzflm zzflmVar, zzdvi zzdviVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzezs) obj);
        hashSet.add(zzezfVar);
        hashSet.add(zzezzVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgr)).booleanValue()) {
            hashSet.add((zzeya) zzifbVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgs)).booleanValue()) {
            hashSet.add((zzeya) zzifbVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgu)).booleanValue()) {
            hashSet.add((zzeya) zzifbVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgv)).booleanValue()) {
            hashSet.add((zzeya) zzifbVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdz)).booleanValue()) {
            hashSet.add((zzeya) zzifbVar7.zzb());
        }
        return new zzeyd(context, executor, hashSet, zzflmVar, zzdviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzetf implements zzifh {
    public static zzetf zza() {
        return zzete.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* synthetic */ Object zzb() {
        List arrayList = new ArrayList();
        zzbel zzbelVar = zzbeu.zzmL;
        if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).isEmpty()) {
            arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).split(","));
        }
        zzifp.zzb(arrayList);
        return arrayList;
    }
}

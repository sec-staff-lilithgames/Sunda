package com.google.android.gms.internal.ads;

import android.content.Context;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfhk {
    public static void zza(int i10, Throwable th2, String str) {
        String strL = o2.l(i10, "Ad failed to load : ", new StringBuilder(String.valueOf(i10).length() + 20));
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strL);
        com.google.android.gms.ads.internal.util.zze.zzb(str, th2);
        if (i10 == 3) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, str);
    }

    public static void zzb(Context context, boolean z10) {
        if (z10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("This request is sent from a test device.");
            return;
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        String strZzD = com.google.android.gms.ads.internal.util.client.zzf.zzD(context);
        String strO = a.b.o(new StringBuilder(String.valueOf(strZzD).length() + 102), "Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"", strZzD, "\")) to get test ads on this device.");
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(strO);
    }
}

package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzeku {
    final String zza;
    final String zzb;
    int zzc;
    long zzd;
    final Integer zze;

    public zzeku(String str, String str2, int i10, long j10, Integer num) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = j10;
        this.zze = num;
    }

    public final String toString() {
        Integer num;
        String str = this.zza;
        int i10 = this.zzc;
        long j10 = this.zzd;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(i10).length() + 1 + String.valueOf(j10).length());
        sb2.append(str);
        sb2.append(".");
        sb2.append(i10);
        sb2.append(".");
        sb2.append(j10);
        String string = sb2.toString();
        String str2 = this.zzb;
        if (!TextUtils.isEmpty(str2)) {
            string = a.b.o(new StringBuilder(string.length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbT)).booleanValue() || (num = this.zze) == null || TextUtils.isEmpty(str2)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder(string.length() + 1 + num.toString().length());
        sb3.append(string);
        sb3.append(".");
        sb3.append(num);
        return sb3.toString();
    }
}

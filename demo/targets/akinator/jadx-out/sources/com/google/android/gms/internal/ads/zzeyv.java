package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeyv implements zzexy {
    final String zza;
    final int zzb;

    public /* synthetic */ zzeyv(String str, int i10, byte[] bArr) {
        this.zza = str;
        this.zzb = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcxq zzcxqVar = (zzcxq) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlu)).booleanValue()) {
            String str = this.zza;
            if (!TextUtils.isEmpty(str)) {
                zzcxqVar.zza.putString("topics", str);
            }
            int i10 = this.zzb;
            if (i10 != -1) {
                zzcxqVar.zza.putInt("atps", i10);
            }
        }
    }
}

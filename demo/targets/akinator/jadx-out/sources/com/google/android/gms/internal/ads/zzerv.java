package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzerv implements zzexy {
    private final Integer zza;

    private zzerv(Integer num) {
        this.zza = num;
    }

    public static /* synthetic */ zzerv zzc(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlb)).booleanValue()) {
            return new zzerv(null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        int extensionVersion = 0;
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzle)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzld)).intValue() && i10 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzerv(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzcxq zzcxqVar = (zzcxq) obj;
        if (num != null) {
            zzcxqVar.zza.putInt("aos", num.intValue());
        }
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.unity3d.ads.beta.xyn.RnJusJ;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhk {
    final zzic zza;

    public zzhk(zzpg zzpgVar) {
        this.zza = zzpgVar.zzag();
    }

    public final boolean zza() {
        try {
            zzic zzicVar = this.zza;
            PackageManagerWrapper packageManagerWrapperPackageManager = Wrappers.packageManager(zzicVar.zzaY());
            if (packageManagerWrapperPackageManager != null) {
                return packageManagerWrapperPackageManager.getPackageInfo("com.android.vending", 128).versionCode >= 80837300;
            }
            zzicVar.zzaV().zzk().zza(RnJusJ.sJSJQkMynfT);
            return false;
        } catch (Exception e10) {
            this.zza.zzaV().zzk().zzb("Failed to retrieve Play Store version for Install Referrer", e10);
            return false;
        }
    }
}

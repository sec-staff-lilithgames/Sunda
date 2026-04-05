package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzewn implements zzeya {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    public zzewn(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzeya
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sh.n1 zza() throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            r9 = this;
            android.content.pm.ApplicationInfo r0 = r9.zza
            java.lang.String r2 = r0.packageName
            android.content.pm.PackageInfo r0 = r9.zzb
            r1 = 0
            if (r0 != 0) goto Lb
            r3 = r1
            goto L11
        Lb:
            int r3 = r0.versionCode
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L11:
            if (r0 != 0) goto L15
            r4 = r1
            goto L18
        L15:
            java.lang.String r0 = r0.versionName
            r4 = r0
        L18:
            android.content.Context r0 = r9.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            com.google.android.gms.internal.ads.zzfuz r5 = com.google.android.gms.ads.internal.util.zzs.zza     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = com.google.android.gms.common.wrappers.Wrappers.packageManager(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            java.lang.CharSequence r0 = r0.getApplicationLabel(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2a
            r5 = r0
            goto L2b
        L2a:
            r5 = r1
        L2b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r0 < r6) goto L77
            com.google.android.gms.internal.ads.zzbel r0 = com.google.android.gms.internal.ads.zzbeu.zznN
            com.google.android.gms.internal.ads.zzbes r6 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r6.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L77
            android.content.Context r0 = r9.zzc     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            android.content.pm.InstallSourceInfo r0 = r0.getInstallSourceInfo(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            if (r0 == 0) goto L77
            java.lang.String r6 = r0.getInstallingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            if (r7 == 0) goto L5f
            java.lang.String r7 = "No installing package name found"
            com.google.android.gms.ads.internal.util.zze.zza(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r6 = r1
        L5f:
            java.lang.String r7 = r0.getInitiatingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
            if (r0 == 0) goto L85
            java.lang.String r0 = "No initiating package name found"
            com.google.android.gms.ads.internal.util.zze.zza(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L70
        L6e:
            r7 = r1
            goto L85
        L70:
            r0 = move-exception
            r1 = r7
            goto L7b
        L73:
            r0 = move-exception
            goto L7b
        L75:
            r0 = move-exception
            goto L7a
        L77:
            r6 = r1
            r7 = r6
            goto L85
        L7a:
            r6 = r1
        L7b:
            java.lang.String r7 = "PackageInfoSignalSource.getInstallSourceInfo"
            com.google.android.gms.internal.ads.zzcbj r8 = com.google.android.gms.ads.internal.zzt.zzh()
            r8.zzg(r0, r7)
            goto L6e
        L85:
            com.google.android.gms.internal.ads.zzewo r1 = new com.google.android.gms.internal.ads.zzewo
            r1.<init>(r2, r3, r4, r5, r6, r7)
            sh.n1 r0 = com.google.android.gms.internal.ads.zzgui.zza(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewn.zza():sh.n1");
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 29;
    }
}

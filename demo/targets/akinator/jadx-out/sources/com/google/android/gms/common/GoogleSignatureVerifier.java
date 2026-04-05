package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class GoogleSignatureVerifier {
    private static GoogleSignatureVerifier zza;
    private static volatile Set zzb;
    private static volatile Set zzc;
    private final Context zzd;
    private volatile String zze;

    public GoogleSignatureVerifier(Context context) {
        this.zzd = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier getInstance(Context context) {
        Preconditions.checkNotNull(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (zza == null) {
                    zzn.zze(context);
                    zza = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zza;
    }

    public static final zzj zza(PackageInfo packageInfo, zzj... zzjVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < zzjVarArr.length; i10++) {
                if (zzjVarArr[i10].equals(zzkVar)) {
                    return zzjVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean zzb(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (!z10) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z10 ? zza(packageInfo2, zzm.zza) : zza(packageInfo2, zzm.zza[0])) != null) {
                return true;
            }
        }
        return false;
    }

    private final zzw zzc(String str, boolean z10, boolean z11) throws PackageManager.NameNotFoundException {
        zzw zzwVarZzc;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return zzw.zzc("null pkg");
        }
        if (str.equals(this.zze)) {
            return zzw.zzb();
        }
        if (zzn.zzg()) {
            zzwVarZzc = zzn.zzb(str, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.zzd.getPackageManager().getPackageInfo(str, 64);
                boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd);
                if (packageInfo == null) {
                    zzwVarZzc = zzw.zzc("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        zzwVarZzc = zzw.zzc("single cert required");
                    } else {
                        zzk zzkVar = new zzk(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        zzw zzwVarZza = zzn.zza(str2, zzkVar, zHonorsDebugCertificates, false);
                        zzwVarZzc = (!zzwVarZza.zza || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !zzn.zza(str2, zzkVar, false, true).zza) ? zzwVarZza : zzw.zzc("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e10) {
                return zzw.zzd("no pkg ".concat(str), e10);
            }
        }
        if (zzwVarZzc.zza) {
            this.zze = str;
        }
        return zzwVarZzc;
    }

    public boolean isGooglePublicSignedPackage(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (zzb(packageInfo, false)) {
            return true;
        }
        if (zzb(packageInfo, true)) {
            if (GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean isPackageGoogleSigned(String str) throws PackageManager.NameNotFoundException {
        zzw zzwVarZzc = zzc(str, false, false);
        zzwVarZzc.zze();
        return zzwVarZzc.zza;
    }

    public boolean isUidGoogleSigned(int i10) throws PackageManager.NameNotFoundException {
        zzw zzwVarZzc;
        int length;
        String[] packagesForUid = this.zzd.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            zzwVarZzc = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Preconditions.checkNotNull(zzwVarZzc);
                    break;
                }
                zzwVarZzc = zzc(packagesForUid[i11], false, false);
                if (zzwVarZzc.zza) {
                    break;
                }
                i11++;
            }
        } else {
            zzwVarZzc = zzw.zzc("no pkgs");
        }
        zzwVarZzc.zze();
        return zzwVarZzc.zza;
    }
}

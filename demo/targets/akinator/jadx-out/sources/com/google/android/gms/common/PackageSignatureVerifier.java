package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.Y1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class PackageSignatureVerifier {
    static volatile zzab zza;
    private static zzac zzb;

    private static zzac zza(Context context) {
        zzac zzacVar;
        synchronized (PackageSignatureVerifier.class) {
            try {
                if (zzb == null) {
                    zzb = new zzac(context);
                }
                zzacVar = zzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzacVar;
    }

    public PackageVerificationResult queryPackageSignatureVerified(Context context, String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (!zzn.zzf()) {
            throw new zzad();
        }
        String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : Y1.f35726f);
        if (zza != null && zza.zza.equals(strConcat)) {
            return zza.zzb;
        }
        zza(context);
        zzw zzwVarZzc = zzn.zzc(str, zHonorsDebugCertificates, false, false);
        if (zzwVarZzc.zza) {
            zza = new zzab(strConcat, PackageVerificationResult.zzd(str, zzwVarZzc.zzd));
            return zza.zzb;
        }
        Preconditions.checkNotNull(zzwVarZzc.zzb);
        return PackageVerificationResult.zza(str, zzwVarZzc.zzb, zzwVarZzc.zzc);
    }

    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context, String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e10) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (packageVerificationResultQueryPackageSignatureVerified2.zzc()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e10);
            }
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}

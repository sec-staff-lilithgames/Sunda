package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzazu {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final zzgvb zzgvbVarZze = zzgvb.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzazt
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzgvb zzgvbVar = zzgvbVarZze;
                if (list2 == null) {
                    zzgvbVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ApkChecksum apkChecksumA = com.bytedance.adsdk.ugeno.zz.cm.a.a(list2.get(i10));
                        if (apkChecksumA.getType() == 8) {
                            zzgvbVar.zza(zzayg.zza(apkChecksumA.getValue()));
                            return;
                        }
                    }
                    zzgvbVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzgvbVar.zza((Object) null);
                }
            }
        });
        return (String) zzgvbVarZze.get();
    }
}

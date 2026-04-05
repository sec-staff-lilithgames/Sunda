package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzavv implements PackageManager$OnChecksumsReadyListener {
    final zzgvb zza = zzgvb.zze();

    public final void onChecksumsReady(List list) {
        if (list == null) {
            this.zza.zza("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum apkChecksumA = com.bytedance.adsdk.ugeno.zz.cm.a.a(list.get(i10));
                if (apkChecksumA.getType() == 8) {
                    zzgvb zzgvbVar = this.zza;
                    zzgrz zzgrzVarZzi = zzgrz.zzn().zzi();
                    byte[] value = apkChecksumA.getValue();
                    zzgvbVar.zza(zzgrzVarZzi.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zza("");
    }
}

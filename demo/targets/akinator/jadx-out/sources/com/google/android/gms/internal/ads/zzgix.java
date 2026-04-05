package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgix implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzgiz zza;

    public zzgix(zzgiz zzgizVar) {
        Objects.requireNonNull(zzgizVar);
        this.zza = zzgizVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        zzgiz zzgizVar = this.zza;
        synchronized (zzgizVar) {
            try {
                if (z10) {
                    zzgizVar.zzg(System.currentTimeMillis());
                    zzgizVar.zzj(true);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzgizVar.zzh() > 0 && jCurrentTimeMillis >= zzgizVar.zzh()) {
                        zzgizVar.zzi(jCurrentTimeMillis - zzgizVar.zzh());
                    }
                    zzgizVar.zzj(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

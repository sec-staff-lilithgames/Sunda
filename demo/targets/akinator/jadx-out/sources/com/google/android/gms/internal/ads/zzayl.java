package com.google.android.gms.internal.ads;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzayl implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzaym zza;

    public zzayl(zzaym zzaymVar) {
        Objects.requireNonNull(zzaymVar);
        this.zza = zzaymVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            zzaym zzaymVar = this.zza;
            zzaymVar.zze(System.currentTimeMillis());
            zzaymVar.zzh(true);
            return;
        }
        zzaym zzaymVar2 = this.zza;
        long jZzf = zzaymVar2.zzf();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jZzf > 0 && jCurrentTimeMillis >= zzaymVar2.zzf()) {
            zzaymVar2.zzg(jCurrentTimeMillis - zzaymVar2.zzf());
        }
        zzaymVar2.zzh(false);
    }
}

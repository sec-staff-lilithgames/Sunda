package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzayb implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzayd zzb;

    public zzayb(zzayd zzaydVar, int i10, boolean z10) {
        this.zza = i10;
        Objects.requireNonNull(zzaydVar);
        this.zzb = zzaydVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzauz zzauzVarZza;
        int i10 = this.zza;
        zzayd zzaydVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            Context context = zzaydVar.zza;
            zzauzVarZza = zzfrz.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused2) {
            zzauzVarZza = null;
        }
        zzayd zzaydVar2 = this.zzb;
        zzaydVar2.zzs(zzauzVarZza);
        int i11 = this.zza;
        if (i11 < 4) {
            if (zzauzVarZza != null && zzauzVarZza.zza() && !zzauzVarZza.zzb().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzauzVarZza.zzg() && zzauzVarZza.zzh().zza() && zzauzVarZza.zzh().zzb() != -2) {
                return;
            }
            zzaydVar2.zzp(i11 + 1, true);
        }
    }
}

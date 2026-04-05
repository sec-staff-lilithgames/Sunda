package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlinx.coroutines.DebugKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzob {
    final /* synthetic */ zzoc zza;

    public zzob(zzoc zzocVar) {
        Objects.requireNonNull(zzocVar);
        this.zza = zzocVar;
    }

    public final void zza() {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzp(zzicVar.zzaZ().currentTimeMillis())) {
            zzicVar.zzd().zzg.zzb(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                zzicVar.zzaV().zzk().zza("Detected application was in foreground");
                zzc(zzicVar.zzaZ().currentTimeMillis(), false);
            }
        }
    }

    public final void zzb(long j10, boolean z10) {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        zzocVar.zzj();
        zzic zzicVar = zzocVar.zzu;
        if (zzicVar.zzd().zzp(j10)) {
            zzicVar.zzd().zzg.zzb(true);
            zzocVar.zzu.zzv().zzi();
        }
        zzicVar.zzd().zzk.zzb(j10);
        if (zzicVar.zzd().zzg.zza()) {
            zzc(j10, z10);
        }
    }

    public final void zzc(long j10, boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zzoc zzocVar = this.zza;
        zzocVar.zzg();
        if (zzocVar.zzu.zzB()) {
            zzic zzicVar = zzocVar.zzu;
            zzicVar.zzd().zzk.zzb(j10);
            zzicVar.zzaV().zzk().zzb("Session started, time", Long.valueOf(zzicVar.zzaZ().elapsedRealtime()));
            long j11 = j10 / 1000;
            zzic zzicVar2 = zzocVar.zzu;
            zzicVar2.zzj().zzN(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", Long.valueOf(j11), j10);
            zzicVar.zzd().zzl.zzb(j11);
            zzicVar.zzd().zzg.zzb(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            zzicVar2.zzj().zzG(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j10, bundle);
            String strZza = zzicVar.zzd().zzq.zza();
            if (TextUtils.isEmpty(strZza)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strZza);
            zzicVar2.zzj().zzG(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j10, bundle2);
        }
    }
}

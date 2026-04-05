package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzt extends zzai {
    private final zzr zza;

    public zzt(zzr zzrVar) {
        super("internal.logger");
        this.zza = zzrVar;
        this.zze.put("log", new zzs(this, false, true));
        this.zze.put(NotificationCompat.GROUP_KEY_SILENT, new zzp(this, NotificationCompat.GROUP_KEY_SILENT));
        ((zzai) this.zze.get(NotificationCompat.GROUP_KEY_SILENT)).zzm("log", new zzs(this, true, true));
        this.zze.put("unmonitored", new zzq(this, "unmonitored"));
        ((zzai) this.zze.get("unmonitored")).zzm("log", new zzs(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        return zzao.zzf;
    }

    public final /* synthetic */ zzr zzb() {
        return this.zza;
    }
}

package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzpb implements zzpo {
    final /* synthetic */ zzpg zza;

    public zzpb(zzpg zzpgVar) {
        Objects.requireNonNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzpo
    public final void zza(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzaW().zzj(new zzpa(this, str, str2, bundle));
            return;
        }
        zzpg zzpgVar = this.zza;
        if (zzpgVar.zzax() != null) {
            zzpgVar.zzax().zzaV().zzb().zzb("AppId not known when logging event", str2);
        }
    }
}

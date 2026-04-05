package com.google.android.gms.internal.measurement;

import androidx.core.app.NotificationCompat;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzp extends zzai {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzp(zzt zztVar, String str) {
        super(NotificationCompat.GROUP_KEY_SILENT);
        Objects.requireNonNull(zztVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao zza(zzg zzgVar, List list) {
        return this;
    }
}

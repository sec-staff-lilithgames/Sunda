package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzoa extends zzoe {
    public zzoa() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzoe
    public final void zza() {
        if (!zzb()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                Map.Entry entryZzd = zzd(i10);
                if (((zzlv) ((zzob) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(Collections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zzlv) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}

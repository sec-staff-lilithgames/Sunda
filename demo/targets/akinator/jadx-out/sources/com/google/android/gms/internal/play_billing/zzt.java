package com.google.android.gms.internal.play_billing;

import a.b;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzt extends zzq {
    final /* synthetic */ zzu zzg;

    public zzt(zzu zzuVar) {
        this.zzg = zzuVar;
    }

    @Override // com.google.android.gms.internal.play_billing.zzq
    public final String zza() {
        zzr zzrVar = (zzr) this.zzg.zza.get();
        return zzrVar == null ? "Completer object has been garbage collected, future will fail soon" : b.l("tag=[", String.valueOf(zzrVar.zza), C3191e4.i.f36531e);
    }
}

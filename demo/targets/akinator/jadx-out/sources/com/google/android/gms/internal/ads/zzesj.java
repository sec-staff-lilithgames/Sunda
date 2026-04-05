package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzesj implements zzeya {
    private final zzfcu zza;

    public zzesj(zzfcu zzfcuVar) {
        this.zza = zzfcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        zzfcu zzfcuVar = this.zza;
        if (zzfcuVar == null) {
            return zzgui.zza(new zzesi(null));
        }
        String strZza = zzfcuVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgui.zza(new zzesi(null)) : zzgui.zza(new zzesi(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 15;
    }
}

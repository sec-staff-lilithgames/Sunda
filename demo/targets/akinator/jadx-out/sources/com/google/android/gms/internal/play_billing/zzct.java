package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzct extends zzbi implements Serializable {
    private static final zzct zza;
    private static final zzct zzb;
    private final transient zzco zzc;

    static {
        int i10 = zzco.zzd;
        zza = new zzct(zzdk.zza);
        zzb = new zzct(zzco.zzm(zzdh.zza()));
    }

    public zzct(zzco zzcoVar) {
        this.zzc = zzcoVar;
    }

    public static zzct zza() {
        return zzb;
    }

    public static zzct zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdj
    public final /* bridge */ /* synthetic */ Set zzc() {
        return this.zzc.isEmpty() ? zzdq.zza : new zzdr(this.zzc, zzdg.zza);
    }
}

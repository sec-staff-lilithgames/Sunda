package com.google.android.gms.internal.gtm;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzvl extends zzvq {
    private static final zzvl zza = new zzvl(zzvq.zze());
    private final AtomicReference zzb;

    public zzvl(zzvq zzvqVar) {
        this.zzb = new AtomicReference(zzvqVar);
    }

    public static final zzvl zzb() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzvq
    public final zzuo zza() {
        return ((zzvq) this.zzb.get()).zza();
    }

    @Override // com.google.android.gms.internal.gtm.zzvq
    public final zzwc zzc() {
        return ((zzvq) this.zzb.get()).zzc();
    }

    @Override // com.google.android.gms.internal.gtm.zzvq
    public final boolean zzd(String str, Level level, boolean z10) {
        ((zzvq) this.zzb.get()).zzd(str, level, z10);
        return false;
    }
}

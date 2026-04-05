package com.google.android.gms.internal.gtm;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzvm implements zzvf {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzuw zzd;
    private final int zze;

    private zzvm(String str, boolean z10, int i10, Level level, boolean z11, Set set, zzuw zzuwVar) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzuwVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzvf
    public final zzum zza(String str) {
        return new zzvp(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
    }

    public final zzvm zzb(boolean z10) {
        Set set = this.zzc;
        zzuw zzuwVar = this.zzd;
        return new zzvm(this.zza, true, 2, Level.OFF, false, set, zzuwVar);
    }

    private zzvm() {
        this("", true, 2, Level.ALL, false, zzvp.zzb, zzvp.zzc);
    }
}

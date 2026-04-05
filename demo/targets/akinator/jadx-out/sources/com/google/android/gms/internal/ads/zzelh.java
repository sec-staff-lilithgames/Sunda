package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzelh implements zzdjl {
    final /* synthetic */ zzehn zza;
    final /* synthetic */ zzffu zzb;

    public zzelh(zzeli zzeliVar, zzehn zzehnVar, zzffu zzffuVar) {
        this.zza = zzehnVar;
        this.zzb = zzffuVar;
        Objects.requireNonNull(zzeliVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdjl
    public final void zza(boolean z10, Context context, zzczb zzczbVar) throws zzdjk {
        try {
            zzfhl zzfhlVar = (zzfhl) this.zza.zzb;
            zzfhlVar.zzs(z10);
            zzfhlVar.zzw(context);
        } catch (zzfgu e10) {
            throw new zzdjk(e10.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjl
    public final zzffu zzb() {
        return this.zzb;
    }
}

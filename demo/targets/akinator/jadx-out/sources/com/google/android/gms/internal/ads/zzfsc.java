package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfsc {
    private final Context zza;
    private final Looper zzb;

    public zzfsc(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfsm zzfsmVarZza = zzfso.zza();
        Context context = this.zza;
        zzfsmVarZza.zza(context.getPackageName());
        zzfsmVarZza.zzc(2);
        zzfsk zzfskVarZza = zzfsl.zza();
        zzfskVarZza.zza(str);
        zzfskVarZza.zzb(2);
        zzfsmVarZza.zzb(zzfskVarZza);
        new zzfsd(context, this.zzb, (zzfso) zzfsmVarZza.zzbu()).zza();
    }
}

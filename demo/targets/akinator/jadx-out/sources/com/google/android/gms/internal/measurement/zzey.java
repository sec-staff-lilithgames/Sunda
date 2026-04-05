package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzey extends zzeq {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzco zzb;
    final /* synthetic */ zzfa zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzey(zzfa zzfaVar, Activity activity, zzco zzcoVar) {
        super(zzfaVar.zza, true);
        this.zza = activity;
        this.zzb = zzcoVar;
        Objects.requireNonNull(zzfaVar);
        this.zzc = zzfaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() throws RemoteException {
        ((zzcr) Preconditions.checkNotNull(this.zzc.zza.zzQ())).onActivitySaveInstanceStateByScionActivityInfo(zzdf.zza(this.zza), this.zzb, this.zzi);
    }
}

package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdr extends zzeq {
    final /* synthetic */ Context zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzfb zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzfb zzfbVar, Context context, Bundle bundle) {
        super(zzfbVar, true);
        this.zza = context;
        this.zzb = bundle;
        Objects.requireNonNull(zzfbVar);
        this.zzc = zzfbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeq
    public final void zza() {
        try {
            Context context = this.zza;
            Preconditions.checkNotNull(context);
            String strZza = com.google.android.gms.measurement.internal.zzhu.zza(context);
            Preconditions.checkNotNull(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(strZza)) {
                strZza = com.google.android.gms.measurement.internal.zzhu.zza(context);
            }
            Boolean boolZzc = com.google.android.gms.measurement.internal.zzhu.zzc("google_analytics_force_disable_updates", resources, strZza);
            zzfb zzfbVar = this.zzc;
            zzfbVar.zzR(zzfbVar.zzc(context, boolZzc == null || !boolZzc.booleanValue()));
            if (zzfbVar.zzQ() == null) {
                Log.w(zzfbVar.zzO(), "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID);
            ((zzcr) Preconditions.checkNotNull(zzfbVar.zzQ())).initialize(ObjectWrapper.wrap(context), new zzdd(133005L, Math.max(localVersion, r0), Boolean.TRUE.equals(boolZzc) || DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID) < localVersion, this.zzb, com.google.android.gms.measurement.internal.zzhu.zza(context)), this.zzh);
        } catch (Exception e10) {
            this.zzc.zzN(e10, true, false);
        }
    }
}

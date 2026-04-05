package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.Objects;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfxl implements zzgtq {
    final /* synthetic */ Context zza;
    final /* synthetic */ View zzb;
    final /* synthetic */ Activity zzc;
    final /* synthetic */ zzfxn zzd;

    public zzfxl(zzfxn zzfxnVar, Context context, String str, View view, Activity activity) {
        this.zza = context;
        this.zzb = view;
        this.zzc = activity;
        Objects.requireNonNull(zzfxnVar);
        this.zzd = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final /* bridge */ /* synthetic */ n1 zza(Object obj) throws Exception {
        return this.zzd.zzg().zzc(this.zza, null, this.zzb, this.zzc);
    }
}

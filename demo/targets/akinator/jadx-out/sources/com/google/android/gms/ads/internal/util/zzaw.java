package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaw implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    public zzaw(zzax zzaxVar, Context context, String str, boolean z10, boolean z11) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z10;
        this.zzd = z11;
        Objects.requireNonNull(zzaxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        Context context = this.zza;
        AlertDialog.Builder builderZzO = zzs.zzO(context);
        builderZzO.setMessage(this.zzb);
        if (this.zzc) {
            builderZzO.setTitle("Error");
        } else {
            builderZzO.setTitle("Info");
        }
        if (this.zzd) {
            builderZzO.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzO.setPositiveButton("Learn More", new zzav(this, context));
            builderZzO.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzO.create().show();
    }
}

package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgiv extends BroadcastReceiver implements zzgia, zzfzj {
    private final Context zza;
    private final ExecutorService zzb;
    private boolean zzc = true;

    public zzgiv(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    private final synchronized void zzg(boolean z10) {
        this.zzc = z10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzg(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzg(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final n1 zza() {
        return zzgui.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgiu
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzf();
                return null;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzb(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzc(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzd(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final /* synthetic */ Void zzf() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.zza.registerReceiver(this, intentFilter);
        return null;
    }
}

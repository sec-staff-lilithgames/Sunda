package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgij implements zzgia, zzfzj {
    private final Context zza;
    private final zzgjd zzb;
    private final zzgus zzc;
    private final zzfxt zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private n1 zzf = zzgui.zza(null);

    public zzgij(Context context, zzgjd zzgjdVar, zzgus zzgusVar, zzfxt zzfxtVar) {
        this.zza = context;
        this.zzb = zzgjdVar;
        this.zzc = zzgusVar;
        this.zzd = zzfxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final n1 zza() {
        return (this.zze.getAndSet(true) || !this.zzd.zzc()) ? zzgui.zzb() : this.zzc.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgii
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzb(Map map) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzc(Map map, Context context, View view) {
        map.put("gs", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzd(Map map) {
        map.put("gs", this.zzf);
    }

    public final /* synthetic */ void zze() {
        n1 n1VarSubmit = this.zzc.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzgih
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzf();
            }
        });
        this.zzb.zze(53, n1VarSubmit);
        this.zzf = n1VarSubmit;
    }

    public final /* synthetic */ zzauz zzf() {
        Context context = this.zza;
        try {
            return zzfrz.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
        } catch (Throwable unused) {
            return null;
        }
    }
}

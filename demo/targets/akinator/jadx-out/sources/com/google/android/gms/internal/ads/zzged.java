package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzged implements zzgab {
    private final zzifb zza;
    private final zzifb zzb;
    private final zzifb zzc;
    private final boolean zzd;
    private final long zze;

    public zzged(zzifb zzifbVar, zzifb zzifbVar2, zzifb zzifbVar3, boolean z10, long j10) {
        this.zza = zzifbVar;
        this.zzb = zzifbVar2;
        this.zzc = zzifbVar3;
        this.zzd = z10;
        this.zze = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzgab
    public final String zza() {
        return ((zzgfh) this.zzb.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgab
    public final n1 zzb() {
        if (this.zzd) {
            return (zzgua) zzgui.zzj((zzgua) zzgui.zzg(zzgua.zzw(((zzgew) this.zza.zzb()).zza()), Throwable.class, zzgec.zza, zzguz.zza()), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzgea
                @Override // com.google.android.gms.internal.ads.zzgtq
                public final /* synthetic */ n1 zza(Object obj) {
                    return this.zza.zzh((zzgev) obj);
                }
            }, zzguz.zza());
        }
        n1 n1VarZzb = ((zzgfh) this.zzb.zzb()).zzb();
        long j10 = this.zze;
        if (j10 > 0) {
            ((ScheduledExecutorService) this.zzc.zzb()).schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzgeb
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    this.zza.zzi();
                    return null;
                }
            }, j10, TimeUnit.MILLISECONDS);
            return n1VarZzb;
        }
        ((zzgew) this.zza.zzb()).zza();
        return n1VarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgab
    public final n1 zzc(Context context) {
        return ((zzgfh) this.zzb.zzb()).zzc(context);
    }

    @Override // com.google.android.gms.internal.ads.zzgab
    public final n1 zzd(Context context, String str, View view, Activity activity) {
        return ((zzgfh) this.zzb.zzb()).zzd(context, null, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzgab
    public final n1 zze(Context context, String str, View view, Activity activity) {
        return ((zzgfh) this.zzb.zzb()).zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgab
    public final void zzf(InputEvent inputEvent) {
        ((zzgfh) this.zzb.zzb()).zzf(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzgab
    public final int zzg() {
        return ((zzgfh) this.zzb.zzb()).zzg();
    }

    public final /* synthetic */ n1 zzh(zzgev zzgevVar) {
        return ((zzgfh) this.zzb.zzb()).zzb();
    }

    public final /* synthetic */ Object zzi() {
        ((zzgew) this.zza.zzb()).zza();
        return null;
    }
}

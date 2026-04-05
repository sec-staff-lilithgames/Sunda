package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgfp implements zzgfh {
    private final zzftl zza;
    private final zzggu zzb;
    private final zzght zzc;
    private final File zzd;
    private final zzgjd zze;
    private final ExecutorService zzf;
    private final AtomicReference zzg = new AtomicReference("3.-1");

    public zzgfp(zzftl zzftlVar, zzggu zzgguVar, zzght zzghtVar, zzgjd zzgjdVar, ExecutorService executorService, File file) {
        this.zza = zzftlVar;
        this.zzb = zzgguVar;
        this.zzc = zzghtVar;
        this.zze = zzgjdVar;
        this.zzd = file;
        this.zzf = executorService;
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final String zza() {
        return (String) this.zzg.get();
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final n1 zzb() {
        return (zzgua) zzgui.zzk((zzgua) zzgui.zzg(zzgua.zzw(this.zzb.zza()), Throwable.class, zzgfo.zza, zzguz.zza()), new zzglu() { // from class: com.google.android.gms.internal.ads.zzgfj
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzh((zzgaa) obj);
                return null;
            }
        }, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final n1 zzc(final Context context) {
        return zzgui.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgfk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzi(context);
            }
        }, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final n1 zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgui.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgfl
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzj(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final n1 zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgui.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgfm
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final void zzf(InputEvent inputEvent) {
        zzfrv zzfrvVarZzb = this.zza.zzb();
        if (zzfrvVarZzb == null) {
            this.zze.zzb(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                zzfrvVarZzb.zzd(null, (MotionEvent) inputEvent);
            } catch (zzftk e10) {
                this.zze.zzd(15005, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfh
    public final int zzg() {
        return 3;
    }

    public final /* synthetic */ Void zzh(final zzgaa zzgaaVar) {
        if (!this.zzc.zzb(zzgaaVar) || zzgaaVar == null) {
            this.zze.zzb(15003);
            throw new zzgfi(1);
        }
        zzggu zzgguVar = this.zzb;
        File fileZzg = zzgguVar.zzg();
        if (Build.VERSION.SDK_INT >= 34) {
            fileZzg.setReadOnly();
        }
        final zzftb zzftbVar = new zzftb(zzgaaVar.zza(), fileZzg, zzgguVar.zze(), this.zzd);
        this.zze.zzf(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgfn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzl(zzftbVar, zzgaaVar);
            }
        });
        return null;
    }

    public final /* synthetic */ String zzi(Context context) {
        zzfrv zzfrvVarZzb = this.zza.zzb();
        if (zzfrvVarZzb == null) {
            this.zze.zzb(15004);
            return "";
        }
        String strZza = zzfrvVarZzb.zza(context, null);
        if (strZza != null) {
            return strZza;
        }
        this.zze.zzb(15006);
        return "";
    }

    public final /* synthetic */ String zzj(Context context, String str, View view, Activity activity) {
        zzfrv zzfrvVarZzb = this.zza.zzb();
        if (zzfrvVarZzb == null) {
            this.zze.zzb(15004);
            return "";
        }
        String strZzb = zzfrvVarZzb.zzb(context, null, view, activity);
        if (strZzb != null) {
            return strZzb;
        }
        this.zze.zzb(15007);
        return "";
    }

    public final /* synthetic */ String zzk(Context context, String str, View view, Activity activity) {
        zzfrv zzfrvVarZzb = this.zza.zzb();
        if (zzfrvVarZzb == null) {
            this.zze.zzb(15004);
            return "";
        }
        String strZzc = zzfrvVarZzb.zzc(context, null, str, view, null);
        if (strZzc != null) {
            return strZzc;
        }
        this.zze.zzb(15008);
        return "";
    }

    public final /* synthetic */ void zzl(zzftb zzftbVar, zzgaa zzgaaVar) {
        if (!this.zza.zza(zzftbVar)) {
            throw new zzgfi(2);
        }
        this.zzg.set("2.".concat(String.valueOf(zzgaaVar.zza().zza())));
    }
}

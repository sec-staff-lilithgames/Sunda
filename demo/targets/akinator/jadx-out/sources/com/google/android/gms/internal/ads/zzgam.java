package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgam implements zzfzj {
    private final zzfxt zza;
    private final zzgai zzb;
    private final zzgac zzc;
    private final ExecutorService zzd;
    private final zzgjd zze;
    private final AtomicReference zzf = new AtomicReference();

    public zzgam(zzfxt zzfxtVar, zzgai zzgaiVar, zzgac zzgacVar, ExecutorService executorService, zzgjd zzgjdVar) {
        this.zza = zzfxtVar;
        this.zzb = zzgaiVar;
        this.zzc = zzgacVar;
        this.zzd = executorService;
        this.zze = zzgjdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzj
    public final n1 zza() {
        zzgai zzgaiVar = this.zzb;
        zzfxt zzfxtVar = this.zza;
        zzgua zzguaVar = (zzgua) zzgui.zzk(zzgua.zzw(zzgaiVar.zzb(zzfxtVar.zzC(), zzfxtVar.zza())), new zzglu() { // from class: com.google.android.gms.internal.ads.zzgal
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                zzgab zzgabVar = (zzgab) obj;
                this.zza.zzf(zzgabVar);
                return zzgabVar;
            }
        }, zzguz.zza());
        zzgui.zzr(zzguaVar, new zzgak(this), this.zzd);
        return zzguaVar;
    }

    public final n1 zzb(Context context) {
        return ((zzgab) this.zzf.get()).zzc(context);
    }

    public final n1 zzc(Context context, String str, View view, Activity activity) {
        return ((zzgab) this.zzf.get()).zzd(context, null, view, activity);
    }

    public final n1 zzd(Context context, String str, View view, Activity activity) {
        return ((zzgab) this.zzf.get()).zze(context, str, view, null);
    }

    public final void zze(InputEvent inputEvent) {
        zzgab zzgabVar = (zzgab) this.zzf.get();
        if (zzgabVar == null) {
            this.zze.zzb(54);
        } else {
            zzgabVar.zzf(inputEvent);
        }
    }

    public final /* synthetic */ zzgab zzf(zzgab zzgabVar) {
        this.zzf.set(zzgabVar);
        return zzgabVar;
    }

    public final /* synthetic */ zzgac zzg() {
        return this.zzc;
    }

    public final int zzh() {
        zzgab zzgabVar = (zzgab) this.zzf.get();
        if (zzgabVar == null) {
            return 1;
        }
        return zzgabVar.zzg();
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdmp {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfgn zzc;
    private final zzdlv zzd;
    private final zzdlq zze;
    private final zzdnd zzf;
    private final zzdnl zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbhx zzj;
    private final zzdln zzk;

    public zzdmp(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfgn zzfgnVar, zzdlv zzdlvVar, zzdlq zzdlqVar, zzdnd zzdndVar, zzdnl zzdnlVar, Executor executor, Executor executor2, zzdln zzdlnVar) {
        this.zzb = zzgVar;
        this.zzc = zzfgnVar;
        this.zzj = zzfgnVar.zzj;
        this.zzd = zzdlvVar;
        this.zze = zzdlqVar;
        this.zzf = zzdndVar;
        this.zzg = zzdnlVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdlnVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z10) {
        View viewZzJ = z10 ? this.zze.zzJ() : this.zze.zzK();
        if (viewZzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewZzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewZzJ.getParent()).removeView(viewZzJ);
        }
        viewGroup.addView(viewZzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzes)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdnn zzdnnVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzf(zzdnnVar);
            }
        });
    }

    public final void zzb(zzdnn zzdnnVar) {
        zzdnd zzdndVar;
        if (zzdnnVar == null || (zzdndVar = this.zzf) == null || zzdnnVar.zzdF() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdnnVar.zzdF().addView(zzdndVar.zza());
        } catch (zzchn e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
        }
    }

    public final void zzc(zzdnn zzdnnVar) {
        if (zzdnnVar == null) {
            return;
        }
        Context context = zzdnnVar.zzdJ().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdnl zzdnlVar = this.zzg;
            if (zzdnlVar == null || zzdnnVar.zzdF() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdnlVar.zza(zzdnnVar.zzdF(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzchn e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e10);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzdnn r11) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdmp.zzf(com.google.android.gms.internal.ads.zzdnn):void");
    }

    public final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdlq zzdlqVar = this.zze;
        if (zzdlqVar.zzJ() != null) {
            boolean z10 = viewGroup != null;
            if (zzdlqVar.zzx() == 2 || zzdlqVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdlqVar.zzx()), z10);
            } else if (zzdlqVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z10);
                zzgVar.zzr(str, "1", z10);
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import o3.c;
import sh.n1;
import x3.e3;
import x3.t3;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeql implements zzeya {
    private final zzeya zza;
    private final zzfgn zzb;
    private final Context zzc;
    private final zzcbj zzd;

    public zzeql(zzeso zzesoVar, zzfgn zzfgnVar, Context context, zzcbj zzcbjVar) {
        this.zza = zzesoVar;
        this.zzb = zzfgnVar;
        this.zzc = context;
        this.zzd = zzcbjVar;
    }

    private final c zzd(float f10) {
        Window window;
        View decorView;
        e3 rootWindowInsets;
        c insets = c.f77431e;
        if (f10 == 0.0f) {
            return insets;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowManager windowManager = (WindowManager) this.zzc.getSystemService("window");
            if (windowManager != null) {
                insets = c.toCompatInsets(windowManager.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets.Type.statusBars() | WindowInsets.Type.displayCutout() | WindowInsets.Type.navigationBars() | WindowInsets.Type.captionBar()));
            }
        } else {
            Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
            if (activityZzd != null && (window = activityZzd.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = z1.getRootWindowInsets(decorView)) != null) {
                insets = rootWindowInsets.getInsets(t3.systemBars() | t3.displayCutout());
            }
        }
        return c.of((int) Math.ceil(insets.f77432a / f10), (int) Math.ceil(insets.f77433b / f10), (int) Math.ceil(insets.f77434c / f10), (int) Math.ceil(insets.f77435d / f10));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return zzgui.zzk(this.zza.zza(), new zzglu() { // from class: com.google.android.gms.internal.ads.zzeqk
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzeyj) obj);
            }
        }, zzcbv.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 7;
    }

    public final /* synthetic */ zzeqm zzc(zzeyj zzeyjVar) {
        String str;
        boolean z10;
        int i10;
        String strZzu;
        float f10;
        int i11;
        int i12;
        int i13;
        WindowManager windowManager;
        int iWidth;
        int iHeight;
        DisplayMetrics displayMetrics;
        zzfgn zzfgnVar = this.zzb;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfgnVar.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
            str = null;
            z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z13 = zzrVar2.zzi;
                if (!z13 && !z11) {
                    str = zzrVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (!z12) {
                        z10 = true;
                    }
                    z12 = true;
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z10 = zzrVar.zzi;
        }
        Context context = this.zzc;
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            i10 = 0;
            strZzu = null;
            f10 = 0.0f;
            i11 = 0;
        } else {
            zzcbj zzcbjVar = this.zzd;
            f10 = displayMetrics.density;
            i11 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            strZzu = zzcbjVar.zzo().zzu();
        }
        c cVarZzd = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzop)).booleanValue() || Build.VERSION.SDK_INT < 35) ? null : zzd(f10);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoq)).booleanValue() && (i13 = Build.VERSION.SDK_INT) <= 34 && i13 >= 28 && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
            if (i13 >= 30) {
                WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                iWidth = currentWindowMetrics.getBounds().width();
                iHeight = currentWindowMetrics.getBounds().height();
            } else {
                Point point = new Point();
                windowManager.getDefaultDisplay().getRealSize(point);
                iWidth = point.x;
                iHeight = point.y;
            }
            i10 = iHeight;
            i11 = iWidth;
            cVarZzd = zzd(f10);
        }
        int i14 = i10;
        StringBuilder sb2 = new StringBuilder();
        if (zzrVarArr != null) {
            boolean z14 = false;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar3 : zzrVarArr) {
                if (zzrVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append("|");
                    }
                    int i15 = zzrVar3.zze;
                    if (i15 == -1) {
                        i15 = f10 != 0.0f ? (int) (zzrVar3.zzf / f10) : -1;
                    }
                    sb2.append(i15);
                    sb2.append("x");
                    int i16 = zzrVar3.zzb;
                    if (i16 == -2) {
                        i16 = f10 != 0.0f ? (int) (zzrVar3.zzc / f10) : -2;
                    }
                    sb2.append(i16);
                }
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i12 = 0;
                    sb2.insert(0, "|");
                } else {
                    i12 = 0;
                }
                sb2.insert(i12, "320x50");
            }
        }
        return new zzeqm(zzrVar, str, z10, sb2.toString(), f10, i11, i14, strZzu, zzfgnVar.zzr, cVarZzd);
    }
}

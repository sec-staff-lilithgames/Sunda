package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcci;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzci {
    private final View zza;
    private Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final ViewTreeObserver.OnGlobalLayoutListener zzf;

    public zzci(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzb = activity;
        this.zza = view;
        this.zzf = onGlobalLayoutListener;
    }

    private final void zzf() {
        if (this.zzc) {
            return;
        }
        Activity activity = this.zzb;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            ViewTreeObserver viewTreeObserverZzh = zzh(activity);
            if (viewTreeObserverZzh != null) {
                viewTreeObserverZzh.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.zza;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.zzf;
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcci.zza(view, onGlobalLayoutListener2);
        this.zzc = true;
    }

    private final void zzg() {
        Activity activity = this.zzb;
        if (activity != null && this.zzc) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            ViewTreeObserver viewTreeObserverZzh = zzh(activity);
            if (viewTreeObserverZzh != null) {
                viewTreeObserverZzh.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzc = false;
        }
    }

    private static ViewTreeObserver zzh(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void zza(Activity activity) {
        this.zzb = activity;
    }

    public final void zzb() {
        this.zze = true;
        if (this.zzd) {
            zzf();
        }
    }

    public final void zzc() {
        this.zze = false;
        zzg();
    }

    public final void zzd() {
        this.zzd = true;
        if (this.zze) {
            zzf();
        }
    }

    public final void zze() {
        this.zzd = false;
        zzg();
    }
}

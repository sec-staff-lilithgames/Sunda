package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import b0.e2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdnl {
    private final zzdse zza;
    private final zzdqt zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdnl(zzdse zzdseVar, zzdqt zzdqtVar) {
        this.zza = zzdseVar;
        this.zzb = zzdqtVar;
    }

    private static final int zzf(Context context, String str, int i10) throws NumberFormatException {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i10);
    }

    public final View zza(final View view, final WindowManager windowManager) throws zzchn {
        zzcgy zzcgyVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcgyVarZza.zzE().setVisibility(4);
        zzcgyVarZza.zzE().setContentDescription("policy_validator");
        zzcgyVarZza.zzab("/sendMessageToSdk", new zzblx() { // from class: com.google.android.gms.internal.ads.zzdnk
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcgy) obj, map);
            }
        });
        zzcgyVarZza.zzab("/hideValidatorOverlay", new zzblx() { // from class: com.google.android.gms.internal.ads.zzdnf
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcgy) obj, map);
            }
        });
        zzcgyVarZza.zzab("/open", new zzbmk(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcgyVarZza);
        zzblx zzblxVar = new zzblx() { // from class: com.google.android.gms.internal.ads.zzdng
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
                this.zza.zzd(view, windowManager, (zzcgy) obj, map);
            }
        };
        zzdqt zzdqtVar = this.zzb;
        zzdqtVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzblxVar);
        zzdqtVar.zzh(new WeakReference(zzcgyVarZza), "/showValidatorOverlay", zzdnh.zza);
        return zzcgyVarZza.zzE();
    }

    public final /* synthetic */ void zzb(zzcgy zzcgyVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcgy zzcgyVar, Map map) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzcgyVar.zzE().setVisibility(8);
        if (zzcgyVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzcgyVar.zzE());
        }
        zzcgyVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zzd(final View view, final WindowManager windowManager, zzcgy zzcgyVar, final Map map) throws NumberFormatException {
        final zzcgy zzcgyVar2;
        zzcgyVar.zzP().zzG(new zzciu() { // from class: com.google.android.gms.internal.ads.zzdnj
            @Override // com.google.android.gms.internal.ads.zzciu
            public final /* synthetic */ void zza(boolean z10, int i10, String str, String str2) {
                this.zza.zze(map, z10, i10, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziV)).intValue());
        int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziW)).intValue());
        int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
        int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
        zzcgyVar.zzaf(zzcji.zzc(iZzf, iZzf2));
        try {
            zzcgyVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziX)).booleanValue());
            zzcgyVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziY)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams layoutParamsZzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
        layoutParamsZzk.x = iZzf3;
        layoutParamsZzk.y = iZzf4;
        windowManager.updateViewLayout(zzcgyVar.zzE(), layoutParamsZzk);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i10 = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - iZzf4;
            zzcgyVar2 = zzcgyVar;
            this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdni
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final /* synthetic */ void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        zzcgy zzcgyVar3 = zzcgyVar2;
                        if (zzcgyVar3.zzE().getWindowToken() == null) {
                            return;
                        }
                        int i11 = i10;
                        WindowManager.LayoutParams layoutParams = layoutParamsZzk;
                        String str2 = str;
                        if ("1".equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i11;
                        } else {
                            layoutParams.y = rect2.top - i11;
                        }
                        windowManager.updateViewLayout(zzcgyVar3.zzE(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.zzc);
            }
        } else {
            zzcgyVar2 = zzcgyVar;
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        zzcgyVar2.loadUrl(str2);
    }

    public final /* synthetic */ void zze(Map map, boolean z10, int i10, String str, String str2) {
        HashMap mapS = e2.s("messageType", "validatorHtmlLoaded");
        mapS.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", mapS);
    }
}

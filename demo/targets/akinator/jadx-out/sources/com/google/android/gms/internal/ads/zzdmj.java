package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdmj extends zzbir implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdnn {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdll zze;
    private zzbaw zzf;

    public zzdmj(View view, HashMap map, HashMap map2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcci.zza(view, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcci.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : map2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzbaw(view.getContext(), view);
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdll zzdllVar = this.zze;
        if (zzdllVar != null) {
            zzdllVar.zzi(view, zzdJ(), zzj(), zzk(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdll zzdllVar = this.zze;
        if (zzdllVar != null) {
            zzdllVar.zzu(zzdJ(), zzj(), zzk(), zzdll.zzI(zzdJ()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdll zzdllVar = this.zze;
        if (zzdllVar != null) {
            zzdllVar.zzu(zzdJ(), zzj(), zzk(), zzdll.zzI(zzdJ()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdll zzdllVar = this.zze;
        if (zzdllVar != null) {
            zzdllVar.zzk(view, motionEvent, zzdJ());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbis
    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdll)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdll zzdllVar = this.zze;
        if (zzdllVar != null) {
            zzdllVar.zzh(this);
        }
        zzdll zzdllVar2 = (zzdll) objUnwrap;
        if (!zzdllVar2.zzJ()) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        } else {
            this.zze = zzdllVar2;
            zzdllVar2.zzg(this);
            this.zze.zzN(zzdJ());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbis
    public final synchronized void zzc() {
        zzdll zzdllVar = this.zze;
        if (zzdllVar != null) {
            zzdllVar.zzh(this);
            this.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbis
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        try {
            if (this.zze != null) {
                Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (!(objUnwrap instanceof View)) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.zze.zzx((View) objUnwrap);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final FrameLayout zzdF() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final View zzdJ() {
        return (View) this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final zzbaw zzh() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized void zzi(String str, View view, boolean z10) {
        this.zzd.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.zzb.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized Map zzj() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized Map zzk() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized Map zzl() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized View zzm(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized String zzn() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized IObjectWrapper zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized JSONObject zzp() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized JSONObject zzq() {
        zzdll zzdllVar = this.zze;
        if (zzdllVar == null) {
            return null;
        }
        return zzdllVar.zzw(zzdJ(), zzj(), zzk());
    }
}

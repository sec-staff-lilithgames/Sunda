package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdml extends zzbil implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdnn {
    public static final zzgpe zza = zzgpe.zzl("2011", "1009", "3010");
    private final String zzb;
    private FrameLayout zzd;
    private FrameLayout zze;
    private final zzgus zzf;
    private View zzg;
    private zzdll zzi;
    private zzbaw zzj;
    private zzbif zzl;
    private boolean zzm;
    private GestureDetector zzo;
    private Map zzc = new HashMap();
    private IObjectWrapper zzk = null;
    private boolean zzn = false;
    private final int zzh = ModuleDescriptor.MODULE_VERSION;

    public zzdml(FrameLayout frameLayout, FrameLayout frameLayout2, int i10) {
        String str;
        this.zzd = frameLayout;
        this.zze = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.zzb = str;
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcci.zza(frameLayout, this);
        com.google.android.gms.ads.internal.zzt.zzC();
        zzcci.zzb(frameLayout, this);
        this.zzf = zzcbv.zzf;
        this.zzj = new zzbaw(this.zzd.getContext(), this.zzd);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    private final synchronized void zzt() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmA)).booleanValue() || this.zzi.zzG() == 0) {
            return;
        }
        this.zzo = new GestureDetector(this.zzd.getContext(), new zzdmt(this.zzi, this));
    }

    private final synchronized void zzu() {
        this.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzs();
            }
        });
    }

    private final synchronized void zzv(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.zze.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.zze.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Encountered invalid base64 watermark.", e10);
                    }
                }
            }
            this.zze.addView(frameLayout);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdll zzdllVar = this.zzi;
        if (zzdllVar == null || !zzdllVar.zzH()) {
            return;
        }
        this.zzi.zzz();
        this.zzi.zzi(view, this.zzd, zzj(), zzk(), false);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdll zzdllVar = this.zzi;
        if (zzdllVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdllVar.zzu(frameLayout, zzj(), zzk(), zzdll.zzI(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdll zzdllVar = this.zzi;
        if (zzdllVar != null) {
            FrameLayout frameLayout = this.zzd;
            zzdllVar.zzu(frameLayout, zzj(), zzk(), zzdll.zzI(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdll zzdllVar = this.zzi;
        if (zzdllVar != null) {
            zzdllVar.zzk(view, motionEvent, this.zzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmA)).booleanValue() && this.zzo != null && this.zzi.zzG() != 0) {
                this.zzo.onTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void zzb(String str, IObjectWrapper iObjectWrapper) {
        zzi(str, (View) ObjectWrapper.unwrap(iObjectWrapper), true);
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized IObjectWrapper zzc(String str) {
        return ObjectWrapper.wrap(zzm(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void zzd(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof zzdll)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdll zzdllVar = this.zzi;
        if (zzdllVar != null) {
            zzdllVar.zzh(this);
        }
        zzu();
        zzdll zzdllVar2 = (zzdll) objUnwrap;
        this.zzi = zzdllVar2;
        zzdllVar2.zzg(this);
        this.zzi.zzN(this.zzd);
        this.zzi.zzO(this.zze);
        if (this.zzm) {
            this.zzi.zzP().zzb(this.zzl);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzev)).booleanValue() && !TextUtils.isEmpty(this.zzi.zzK())) {
            zzv(this.zzi.zzK());
        }
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final FrameLayout zzdF() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void zzdG(IObjectWrapper iObjectWrapper) {
        if (this.zzn) {
            return;
        }
        this.zzk = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final void zzdH(IObjectWrapper iObjectWrapper) {
        onTouch(this.zzd, (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void zzdI(zzbif zzbifVar) {
        if (!this.zzn) {
            this.zzm = true;
            this.zzl = zzbifVar;
            zzdll zzdllVar = this.zzi;
            if (zzdllVar != null) {
                zzdllVar.zzP().zzb(zzbifVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final /* synthetic */ View zzdJ() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void zze() {
        try {
            if (this.zzn) {
                return;
            }
            zzdll zzdllVar = this.zzi;
            if (zzdllVar != null) {
                zzdllVar.zzh(this);
                this.zzi = null;
            }
            this.zzc.clear();
            this.zzd.removeAllViews();
            this.zze.removeAllViews();
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzg = null;
            this.zzj = null;
            this.zzn = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void zzf(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbim
    public final synchronized void zzg(IObjectWrapper iObjectWrapper) {
        this.zzi.zzx((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final zzbaw zzh() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized void zzi(String str, View view, boolean z10) {
        if (!this.zzn) {
            if (view == null) {
                this.zzc.remove(str);
                return;
            }
            this.zzc.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.zza(this.zzh)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized Map zzj() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized Map zzk() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized Map zzl() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized View zzm(String str) {
        WeakReference weakReference;
        if (!this.zzn && (weakReference = (WeakReference) this.zzc.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized String zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final IObjectWrapper zzo() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized JSONObject zzp() {
        zzdll zzdllVar = this.zzi;
        if (zzdllVar == null) {
            return null;
        }
        return zzdllVar.zzv(this.zzd, zzj(), zzk());
    }

    @Override // com.google.android.gms.internal.ads.zzdnn
    public final synchronized JSONObject zzq() {
        zzdll zzdllVar = this.zzi;
        if (zzdllVar == null) {
            return null;
        }
        return zzdllVar.zzw(this.zzd, zzj(), zzk());
    }

    public final FrameLayout zzr() {
        return this.zzd;
    }

    public final /* synthetic */ void zzs() {
        if (this.zzg == null) {
            View view = new View(this.zzd.getContext());
            this.zzg = view;
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        }
        if (this.zzd != this.zzg.getParent()) {
            this.zzd.addView(this.zzg);
        }
    }
}

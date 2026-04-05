package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdkk implements zzdly {
    private com.google.android.gms.ads.internal.client.zzdf zzC;
    private final zzdbd zzD;
    private final zzdmr zzE;
    private final com.google.android.gms.ads.internal.zzb zzF;
    private final zzcxi zzG;
    private final Context zza;
    private final zzdma zzb;
    private final JSONObject zzc;
    private final zzdqt zzd;
    private final zzdlq zze;
    private final zzaxa zzf;
    private final zzczg zzg;
    private final zzcym zzh;
    private final zzdgt zzi;
    private final zzffu zzj;
    private final VersionInfoParcel zzk;
    private final zzfgn zzl;
    private final zzcqb zzm;
    private final zzdmv zzn;
    private final Clock zzo;
    private final zzdgp zzp;
    private final zzfng zzq;
    private final zzdsj zzr;
    private final zzflm zzs;
    private final zzegj zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdkk(Context context, zzdma zzdmaVar, JSONObject jSONObject, zzdqt zzdqtVar, zzdlq zzdlqVar, zzaxa zzaxaVar, zzczg zzczgVar, zzcym zzcymVar, zzdgt zzdgtVar, zzffu zzffuVar, VersionInfoParcel versionInfoParcel, zzfgn zzfgnVar, zzcqb zzcqbVar, zzdmv zzdmvVar, Clock clock, zzdgp zzdgpVar, zzfng zzfngVar, zzflm zzflmVar, zzegj zzegjVar, zzdsj zzdsjVar, zzdmr zzdmrVar, zzdbd zzdbdVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzt zzbztVar, zzcxi zzcxiVar) {
        this.zza = context;
        this.zzb = zzdmaVar;
        this.zzc = jSONObject;
        this.zzd = zzdqtVar;
        this.zze = zzdlqVar;
        this.zzf = zzaxaVar;
        this.zzg = zzczgVar;
        this.zzh = zzcymVar;
        this.zzi = zzdgtVar;
        this.zzj = zzffuVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfgnVar;
        this.zzm = zzcqbVar;
        this.zzn = zzdmvVar;
        this.zzo = clock;
        this.zzp = zzdgpVar;
        this.zzq = zzfngVar;
        this.zzs = zzflmVar;
        this.zzt = zzegjVar;
        this.zzr = zzdsjVar;
        this.zzE = zzdmrVar;
        this.zzD = zzdbdVar;
        this.zzF = zzbVar;
        this.zzG = zzcxiVar;
    }

    private final boolean zzG(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final String zzH(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzx = this.zze.zzx();
        if (iZzx == 1) {
            return "1099";
        }
        if (iZzx == 2) {
            return "2099";
        }
        if (iZzx != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzI() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final void zzJ() {
        com.google.android.gms.ads.internal.zzb zzbVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoB)).booleanValue() || (zzbVar = this.zzF) == null) {
            return;
        }
        zzbVar.zza();
    }

    private final boolean zzK(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10, View view) throws JSONException {
        JSONException jSONException;
        zzcxi zzcxiVar;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeb)).booleanValue()) {
                try {
                    jSONObject6.put("view_signals", str);
                } catch (JSONException e10) {
                    jSONException = e10;
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create impression JSON.", jSONException);
                    return false;
                }
            }
            jSONObject6.put("policy_validator_enabled", z10);
            jSONObject6.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(this.zza));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoD)).booleanValue() && (zzcxiVar = this.zzG) != null && zzcxiVar.zza() > 0) {
                jSONObject6.put("placement_id", zzcxiVar.zza());
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjx)).booleanValue()) {
                this.zzd.zzd("/clickRecorded", new zzdkh(this, null));
            } else {
                this.zzd.zzd("/logScionEvent", new zzdkg(this, null));
            }
            zzdqt zzdqtVar = this.zzd;
            zzdqtVar.zzd("/nativeImpression", new zzdki(this, view, null));
            try {
                zzdqtVar.zzd("/nativeImpressionFlowControl", new zzdkj(this, this.zzq, this.zzj.zzax, this.zzs, null));
                zzcby.zza(zzdqtVar.zzc("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
                if (this.zzu) {
                    return true;
                }
                this.zzu = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zza, this.zzk.afmaVersion, this.zzj.zzC.toString(), this.zzl.zzg);
                return true;
            } catch (JSONException e11) {
                e = e11;
                jSONException = e;
                int i102 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create impression JSON.", jSONException);
                return false;
            }
        } catch (JSONException e12) {
            e = e12;
        }
    }

    private final String zzL(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeb)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzb().zzj(this.zza, view, null);
        } catch (Exception unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Exception getting data.");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzA() {
        this.zzd.zzb();
    }

    public final /* synthetic */ void zzB(View view) {
        this.zzE.zza(view, this.zzj);
    }

    public final /* synthetic */ zzczg zzC() {
        return this.zzg;
    }

    public final /* synthetic */ zzcym zzD() {
        return this.zzh;
    }

    public final /* synthetic */ zzdgt zzE() {
        return this.zzi;
    }

    public final /* synthetic */ zzdbd zzF() {
        return this.zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zza(View view, Map map, Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzo(this);
        boolean zZza = com.google.android.gms.ads.internal.util.zzbs.zza(this.zzk.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZza) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZza) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzb(View view, Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzc(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String strZzH = zzH(view, map);
        zzi(true == ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzei)).booleanValue() ? view2 : view, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strZzH, com.google.android.gms.ads.internal.util.zzbs.zzf(strZzH, context, this.zzz, this.zzy), null, z10, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzd(String str) throws JSONException {
        zzi(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zze(Bundle bundle) throws JSONException {
        if (bundle == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Click data is null. No click is reported.");
        } else if (zzG("click_reporting")) {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzi(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzbb.zza().zzl(bundle, null), false, false);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzf(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.zzc;
        boolean z11 = false;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmA)).booleanValue()) {
                z11 = true;
            }
        }
        if (!z11) {
            if (!this.zzx) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzI()) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view2);
        boolean z12 = z11;
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view2);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view2);
        String strZzH = zzH(view, map);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbs.zzf(strZzH, context, this.zzz, this.zzy);
        if (z12) {
            try {
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i10);
                    } catch (Exception e10) {
                        e = e10;
                        int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while grabbing custom click gesture signals.", e);
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                        zzi(view2, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strZzH, jSONObjectZzf, null, z10, true);
                    }
                } catch (Exception e11) {
                    e = e11;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e12) {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while adding CustomClickGestureSignals to adJson.", e12);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e12, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzi(view2, jSONObjectZzb, jSONObjectZze, jSONObjectZzc, jSONObjectZzd, strZzH, jSONObjectZzf, null, z10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzg() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final boolean zzh() {
        return zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, view2);
        long jCurrentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzc(motionEventObtain);
        motionEventObtain.recycle();
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzk(Bundle bundle) {
        if (bundle == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Touch event data is null. No touch event is reported.");
        } else {
            if (!zzG("touch_reporting")) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.zzf.zzb().zze((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            zzJ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            return jSONObject;
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad view signals JSON.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        JSONObject jSONObjectZzl = zzl(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzI()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZzl != null) {
                jSONObject.put("nas", jSONObjectZzl);
            }
            return jSONObject;
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native click meta data JSON.", e10);
            return jSONObject;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzn() throws JSONException {
        zzK(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzo(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdmv zzdmvVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdmvVar);
        view.setClickable(true);
        zzdmvVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzp(zzbjz zzbjzVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zza(zzbjzVar);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzq() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzr(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdjVar == null) {
                zzdlq zzdlqVar = this.zze;
                if (zzdlqVar.zzF() != null) {
                    this.zzw = true;
                    this.zzq.zzb(zzdlqVar.zzF().zzf(), this.zzj.zzax, this.zzs, null);
                    zzt();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzb(zzdjVar.zzf(), this.zzj.zzax, this.zzs, null);
            zzt();
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzC = zzdfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzt() {
        try {
            com.google.android.gms.ads.internal.client.zzdf zzdfVar = this.zzC;
            if (zzdfVar != null) {
                zzdfVar.zze();
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final int zzu() {
        zzbhx zzbhxVar = this.zzl.zzj;
        if (zzbhxVar == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmA)).booleanValue()) {
            return zzbhxVar.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final boolean zzv() {
        if (zzu() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmA)).booleanValue()) {
            return this.zzl.zzj.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        zzK(com.google.android.gms.ads.internal.util.zzbs.zzb(context, view), com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbs.zzc(view), com.google.android.gms.ads.internal.util.zzbs.zzd(context, view), zzL(view), null, com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) throws JSONException {
        Context context = this.zza;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(context, view);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(view);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(context, view);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzj);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            jSONObject.put("asset_view_signal", jSONObjectZze);
            jSONObject.put("ad_view_signal", jSONObjectZzb);
            jSONObject.put("scroll_view_signal", jSONObjectZzc);
            jSONObject.put("lock_screen_signal", jSONObjectZzd);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeb)).booleanValue()) {
                jSONObject.put("view_signals", zzL(view));
            }
            jSONObject.put("policy_validator_enabled", zZzi);
            jSONObject.put("screen", com.google.android.gms.ads.internal.util.zzbs.zzj(context));
            zzcby.zza(this.zzd.zzc("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging");
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create native ad signals logging JSON.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzy() throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.zzc);
            zzcby.zza(this.zzd.zzc("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final boolean zzz(Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzK(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmw)).booleanValue() ? zzL(null) : null, com.google.android.gms.ads.internal.client.zzbb.zza().zzl(bundle, null), false, null);
        }
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    public final void zzi(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) throws JSONException {
        String strZzg;
        try {
            zzJ();
            JSONObject jSONObject7 = new JSONObject();
            JSONObject jSONObject8 = this.zzc;
            jSONObject7.put("ad", jSONObject8);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            zzdma zzdmaVar = this.zzb;
            zzdlq zzdlqVar = this.zze;
            jSONObject7.put("has_custom_click_handler", zzdmaVar.zzg(zzdlqVar.zzS()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", zzdlqVar.zzx());
            jSONObject9.put(duhsDlGWdBkekB.aTKT, z10);
            zzbhx zzbhxVar = this.zzl.zzj;
            jSONObject9.put("custom_mute_requested", zzbhxVar != null && zzbhxVar.zzg);
            jSONObject9.put("custom_mute_enabled", (zzdlqVar.zzE().isEmpty() || zzdlqVar.zzF() == null) ? false : true);
            if (this.zzn.zzb() != null && jSONObject8.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject9.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzI()) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject9.put("is_custom_click_gesture", true);
            }
            jSONObject9.put("has_custom_click_handler", zzdmaVar.zzg(zzdlqVar.zzS()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject8.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzg = this.zzf.zzb().zzg(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception obtaining click signals", e10);
                strZzg = null;
            }
            jSONObject9.put("click_signals", strZzg);
            jSONObject9.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjB)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjC)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject9);
            JSONObject jSONObject10 = new JSONObject();
            long jCurrentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject10.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject10);
            if (this.zzj.zzb()) {
                JSONObject jSONObject11 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzc(string, this.zze);
                }
            }
            zzcby.zza(this.zzd.zzc("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to create click JSON.", e11);
        }
    }
}

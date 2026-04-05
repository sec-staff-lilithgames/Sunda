package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdns implements zzdly, zzddq {
    private final zzbry zza;
    private final zzczg zzb;
    private final zzdbh zzc;
    private final zzcym zzd;
    private final zzdgt zze;
    private final Context zzf;
    private final zzffu zzg;
    private final VersionInfoParcel zzh;
    private final zzfgn zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbru zzm;
    private final zzbrv zzn;

    public zzdns(zzbru zzbruVar, zzbrv zzbrvVar, zzbry zzbryVar, zzczg zzczgVar, zzdbh zzdbhVar, zzcym zzcymVar, zzdgt zzdgtVar, Context context, zzffu zzffuVar, VersionInfoParcel versionInfoParcel, zzfgn zzfgnVar) {
        this.zzm = zzbruVar;
        this.zzn = zzbrvVar;
        this.zza = zzbryVar;
        this.zzb = zzczgVar;
        this.zzc = zzdbhVar;
        this.zzd = zzcymVar;
        this.zze = zzdgtVar;
        this.zzf = context;
        this.zzg = zzffuVar;
        this.zzh = versionInfoParcel;
        this.zzi = zzfgnVar;
    }

    private static final HashMap zzB(Map map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        map2.put((String) entry.getKey(), view);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map2;
    }

    private final void zzi(View view) {
        try {
            zzbry zzbryVar = this.zza;
            if (zzbryVar != null && !zzbryVar.zzu()) {
                zzbryVar.zzw(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlM)).booleanValue()) {
                    this.zze.zzdz();
                    return;
                }
                return;
            }
            zzbru zzbruVar = this.zzm;
            if (zzbruVar != null && !zzbruVar.zzq()) {
                zzbruVar.zzn(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlM)).booleanValue()) {
                    this.zze.zzdz();
                    return;
                }
                return;
            }
            zzbrv zzbrvVar = this.zzn;
            if (zzbrvVar == null || zzbrvVar.zzo()) {
                return;
            }
            zzbrvVar.zzl(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlM)).booleanValue()) {
                this.zze.zzdz();
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call handleClick", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzA() {
        try {
            zzbry zzbryVar = this.zza;
            if (zzbryVar != null) {
                zzbryVar.zzC();
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call destroy", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf A[Catch: RemoteException -> 0x002b, JSONException -> 0x0047, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0047, blocks: (B:49:0x00b4, B:50:0x00c9, B:52:0x00cf), top: B:71:0x00b4 }] */
    @Override // com.google.android.gms.internal.ads.zzdly
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdns.zza(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzb(View view, Map map) {
        try {
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(view);
            zzbry zzbryVar = this.zza;
            if (zzbryVar != null) {
                zzbryVar.zzy(iObjectWrapperWrap);
                return;
            }
            zzbru zzbruVar = this.zzm;
            if (zzbruVar != null) {
                zzbruVar.zzs(iObjectWrapperWrap);
                return;
            }
            zzbrv zzbrvVar = this.zzn;
            if (zzbrvVar != null) {
                zzbrvVar.zzq(iObjectWrapperWrap);
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call untrackView", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzc(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType) {
        if (this.zzk && this.zzg.zzL) {
            return;
        }
        zzi(view);
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdL() {
        try {
            zzbry zzbryVar = this.zza;
            if (zzbryVar == null || !zzbryVar.zzt()) {
                return;
            }
            zzffu zzffuVar = this.zzg;
            if (zzffuVar.zze != 4 && !zzffuVar.zzaD) {
                return;
            }
            zzbryVar.zzv();
            this.zzb.zza();
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to report impression from an adapter", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzf(View view, View view2, Map map, Map map2, boolean z10, ImageView.ScaleType scaleType, int i10) {
        if (!this.zzk) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (this.zzg.zzL) {
            zzi(view2);
        } else {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzg() {
        this.zzk = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final boolean zzh() {
        return this.zzg.zzL;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final JSONObject zzl(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final JSONObject zzm(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzr(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzs(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzt() {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final int zzu() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final boolean zzv() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzw(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = com.google.android.gms.ads.internal.zzt.zzo().zzg(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzg);
            }
            if (this.zzl) {
                zzbry zzbryVar = this.zza;
                if (zzbryVar == null) {
                    zzbru zzbruVar = this.zzm;
                    if (zzbruVar != null && !zzbruVar.zzp()) {
                        zzbruVar.zzm();
                        this.zzb.zza();
                        return;
                    }
                    zzbrv zzbrvVar = this.zzn;
                    if (zzbrvVar == null || zzbrvVar.zzn()) {
                        return;
                    }
                    zzbrvVar.zzk();
                    this.zzb.zza();
                    return;
                }
                zzffu zzffuVar = this.zzg;
                if (zzffuVar.zzaD) {
                    if (zzbryVar.zzt()) {
                        return;
                    }
                    zzbryVar.zzv();
                    this.zzb.zza();
                    return;
                }
                if (zzbryVar.zzt() && zzffuVar.zze == 4) {
                    this.zzc.zza();
                } else {
                    zzbryVar.zzv();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to call recordImpression", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final boolean zzz(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzdM() {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzn() {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzy() {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzd(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zze(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzk(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzo(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzp(zzbjz zzbjzVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzj(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdly
    public final void zzx(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }
}

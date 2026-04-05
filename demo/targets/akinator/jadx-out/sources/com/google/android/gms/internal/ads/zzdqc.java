package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import z.f;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdqc extends zzbjb {
    private final Context zza;
    private final zzdlq zzb;
    private zzdmp zzc;
    private zzdll zzd;

    public zzdqc(Context context, zzdlq zzdlqVar, zzdmp zzdmpVar, zzdll zzdllVar) {
        this.zza = context;
        this.zzb = zzdlqVar;
        this.zzc = zzdmpVar;
        this.zzd = zzdllVar;
    }

    public final /* synthetic */ zzdll zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final String zze(String str) {
        return (String) this.zzb.zzad().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final zzbii zzf(String str) {
        return (zzbii) this.zzb.zzaa().get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final List zzg() {
        try {
            zzdlq zzdlqVar = this.zzb;
            t1 t1VarZzaa = zzdlqVar.zzaa();
            t1 t1VarZzad = zzdlqVar.zzad();
            String[] strArr = new String[t1VarZzaa.size() + t1VarZzad.size()];
            int i10 = 0;
            for (int i11 = 0; i11 < t1VarZzaa.size(); i11++) {
                strArr[i10] = (String) t1VarZzaa.keyAt(i11);
                i10++;
            }
            for (int i12 = 0; i12 < t1VarZzad.size(); i12++) {
                strArr[i10] = (String) t1VarZzad.keyAt(i12);
                i10++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "InternalNativeCustomTemplateAdShim.getAvailableAssetNames");
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final String zzh() {
        return this.zzb.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzi(String str) {
        zzdll zzdllVar = this.zzd;
        if (zzdllVar != null) {
            zzdllVar.zza(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzj() {
        zzdll zzdllVar = this.zzd;
        if (zzdllVar != null) {
            zzdllVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final com.google.android.gms.ads.internal.client.zzed zzk() {
        return this.zzb.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzl() {
        zzdll zzdllVar = this.zzd;
        if (zzdllVar != null) {
            zzdllVar.zzd();
        }
        this.zzd = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final IObjectWrapper zzm() {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final boolean zzn(IObjectWrapper iObjectWrapper) throws SecurityException {
        zzdmp zzdmpVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdmpVar = this.zzc) == null || !zzdmpVar.zzd((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzT().zzaq(new zzdqb(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final boolean zzo() {
        zzdll zzdllVar = this.zzd;
        if (zzdllVar != null && !zzdllVar.zzM()) {
            return false;
        }
        zzdlq zzdlqVar = this.zzb;
        return zzdlqVar.zzW() != null && zzdlqVar.zzT() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final boolean zzp() {
        zzdlq zzdlqVar = this.zzb;
        zzehf zzehfVarZzZ = zzdlqVar.zzZ();
        if (zzehfVarZzZ == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zze(zzehfVarZzZ.zza());
        if (zzdlqVar.zzW() == null) {
            return true;
        }
        zzdlqVar.zzW().zze("onSdkLoaded", new f());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzq(IObjectWrapper iObjectWrapper) throws SecurityException {
        zzdll zzdllVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof View) || this.zzb.zzZ() == null || (zzdllVar = this.zzd) == null) {
            return;
        }
        zzdllVar.zzN((View) objUnwrap);
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final void zzr() {
        try {
            String strZzac = this.zzb.zzac();
            if (Objects.equals(strZzac, "Google")) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(strZzac)) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdll zzdllVar = this.zzd;
                if (zzdllVar != null) {
                    zzdllVar.zzL(strZzac, false);
                }
            }
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final zzbif zzs() throws RemoteException {
        try {
            return this.zzd.zzP().zza();
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "InternalNativeCustomTemplateAdShim.getMediaContent");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjc
    public final boolean zzt(IObjectWrapper iObjectWrapper) throws SecurityException {
        zzdmp zzdmpVar;
        Object objUnwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(objUnwrap instanceof ViewGroup) || (zzdmpVar = this.zzc) == null || !zzdmpVar.zze((ViewGroup) objUnwrap)) {
            return false;
        }
        this.zzb.zzU().zzaq(new zzdqb(this, NativeCustomFormatAd.ASSET_NAME_VIDEO));
        return true;
    }
}

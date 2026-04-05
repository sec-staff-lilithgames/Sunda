package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdhh;
import com.google.android.gms.internal.ads.zzdvc;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzw implements zzdhh {
    private final zzdvc zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    public zzw(zzdvc zzdvcVar, zzv zzvVar, String str, int i10) {
        this.zza = zzdvcVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzd(zzbj zzbjVar) {
        String strOptString;
        if (zzbjVar == null || this.zzd == 2) {
            return;
        }
        if (TextUtils.isEmpty(zzbjVar.zzc)) {
            this.zzb.zza(this.zzc, zzbjVar.zzb, this.zza);
            return;
        }
        try {
            strOptString = new JSONObject(zzbjVar.zzc).optString("request_id");
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.zzb.zza(strOptString, zzbjVar.zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zze(String str) {
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbfx extends QueryInfoGenerationCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbfz zzb;

    public zzbfx(zzbfz zzbfzVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzbfzVar);
        this.zzb = zzbfzVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbfz zzbfzVar = this.zzb;
            zzbfzVar.zzi().postMessage(zzbfzVar.zze(this.zza, str).toString(), null);
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Error Response JSON: ", e10);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbfz zzbfzVar = this.zzb;
            zzbfzVar.zzi().postMessage(zzbfzVar.zzf(this.zza, query).toString(), null);
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating PACT Signal Response JSON: ", e10);
        }
    }
}

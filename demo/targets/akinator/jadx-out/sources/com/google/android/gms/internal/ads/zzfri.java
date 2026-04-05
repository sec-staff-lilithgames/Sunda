package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfri extends zzfrd {
    public zzfri(zzfqw zzfqwVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfqwVar, hashSet, jSONObject, j10);
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfqw zzfqwVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfqo.zzg(jSONObject, zzfqwVar.zzd())) {
            return null;
        }
        zzfqwVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfre, android.os.AsyncTask
    /* renamed from: zza */
    public final void onPostExecute(String str) {
        zzfps zzfpsVarZza;
        if (!TextUtils.isEmpty(str) && (zzfpsVarZza = zzfps.zza()) != null) {
            for (zzfoy zzfoyVar : zzfpsVarZza.zze()) {
                if (((zzfrd) this).zza.contains(zzfoyVar.zzh())) {
                    zzfoyVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}

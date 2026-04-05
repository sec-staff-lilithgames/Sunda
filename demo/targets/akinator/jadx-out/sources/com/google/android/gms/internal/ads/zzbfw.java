package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import androidx.browser.customtabs.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbfw extends e {
    private final AtomicBoolean zza = new AtomicBoolean(false);
    private final List zzb = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkT)).split(","));
    private final zzbfz zzc;
    private final e zzd;
    private final zzdvn zze;

    public zzbfw(zzbfz zzbfzVar, e eVar, zzdvn zzdvnVar) {
        this.zzd = eVar;
        this.zzc = zzbfzVar;
        this.zze = zzdvnVar;
    }

    private final void zzb(String str) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zze(this.zze, null, "pact_action", new Pair("pe", str));
    }

    @Override // androidx.browser.customtabs.e
    public final void extraCallback(String str, Bundle bundle) {
        e eVar = this.zzd;
        if (eVar != null) {
            eVar.extraCallback(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.e
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        e eVar = this.zzd;
        if (eVar != null) {
            return eVar.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // androidx.browser.customtabs.e
    public final void onActivityResized(int i10, int i11, Bundle bundle) {
        e eVar = this.zzd;
        if (eVar != null) {
            eVar.onActivityResized(i10, i11, bundle);
        }
    }

    @Override // androidx.browser.customtabs.e
    public final void onMessageChannelReady(Bundle bundle) {
        this.zza.set(false);
        e eVar = this.zzd;
        if (eVar != null) {
            eVar.onMessageChannelReady(bundle);
        }
    }

    @Override // androidx.browser.customtabs.e
    public final void onNavigationEvent(int i10, Bundle bundle) {
        this.zza.set(false);
        e eVar = this.zzd;
        if (eVar != null) {
            eVar.onNavigationEvent(i10, bundle);
        }
        zzbfz zzbfzVar = this.zzc;
        zzbfzVar.zzg(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        List list = this.zzb;
        if (list == null || !list.contains(String.valueOf(i10))) {
            return;
        }
        zzbfzVar.zzc();
        zzb("pact_reqpmc");
    }

    @Override // androidx.browser.customtabs.e
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.zza.set(true);
                zzb("pact_con");
                this.zzc.zzd(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e10);
        }
        e eVar = this.zzd;
        if (eVar != null) {
            eVar.onPostMessage(str, bundle);
        }
    }

    @Override // androidx.browser.customtabs.e
    public final void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
        e eVar = this.zzd;
        if (eVar != null) {
            eVar.onRelationshipValidationResult(i10, uri, z10, bundle);
        }
    }

    public final Boolean zza() {
        return Boolean.valueOf(this.zza.get());
    }
}

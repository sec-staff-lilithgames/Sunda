package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import org.json.JSONObject;
import p0.o2;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdoj {
    private final zzgus zza;
    private final zzdoy zzb;
    private final zzdpd zzc;
    private final zzdvc zzd;

    public zzdoj(zzgus zzgusVar, zzdoy zzdoyVar, zzdpd zzdpdVar, zzdvc zzdvcVar) {
        this.zza = zzgusVar;
        this.zzb = zzdoyVar;
        this.zzc = zzdpdVar;
        this.zzd = zzdvcVar;
    }

    private final n1 zze(n1 n1Var, zzduq zzduqVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            zzgui.zzr(n1Var, new zzdog(this, zzduqVar), this.zza);
        }
        return n1Var;
    }

    private static final boolean zzf(JSONObject jSONObject) {
        return jSONObject.optInt("template_id") == 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final sh.n1 zza(final com.google.android.gms.internal.ads.zzfgf r15, final com.google.android.gms.internal.ads.zzffu r16, final org.json.JSONObject r17, com.google.android.gms.ads.internal.zzb r18, com.google.android.gms.internal.ads.zzbzt r19) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdoj.zza(com.google.android.gms.internal.ads.zzfgf, com.google.android.gms.internal.ads.zzffu, org.json.JSONObject, com.google.android.gms.ads.internal.zzb, com.google.android.gms.internal.ads.zzbzt):sh.n1");
    }

    public final /* synthetic */ zzdlq zzb(zzfgf zzfgfVar, zzffu zzffuVar, JSONObject jSONObject) throws zzekz {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcC)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzd.zze(), zzduq.NATIVE_ASSETS_LOADING_BASIC_START.zza());
        }
        zzdlq zzdlqVar = new zzdlq();
        zzdlqVar.zza(jSONObject.optInt("template_id", -1));
        zzdlqVar.zzl(jSONObject.optString("custom_template_id"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings");
        zzdlqVar.zzv(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("omid_partner_name") : null);
        zzfgn zzfgnVar = zzfgfVar.zza.zza;
        if (!zzfgnVar.zzh.contains(Integer.toString(zzdlqVar.zzx()))) {
            int iZzx = zzdlqVar.zzx();
            throw new zzekz(1, o2.l(iZzx, "Invalid template ID: ", new StringBuilder(String.valueOf(iZzx).length() + 21)));
        }
        if (zzdlqVar.zzx() == 3) {
            if (zzdlqVar.zzS() == null) {
                throw new zzekz(1, "No custom template id for custom template ad response.");
            }
            if (!zzfgnVar.zzi.contains(zzdlqVar.zzS())) {
                throw new zzekz(1, "Unexpected custom template id in the response.");
            }
        }
        zzdlqVar.zzi(jSONObject.optDouble(CampaignEx.JSON_KEY_STAR, -1.0d));
        String strOptString = jSONObject.optString("headline", null);
        if (zzffuVar.zzM) {
            com.google.android.gms.ads.internal.zzt.zzc();
            String strZzC = com.google.android.gms.ads.internal.util.zzs.zzC();
            strOptString = a.b.o(new StringBuilder(String.valueOf(strZzC).length() + 3 + String.valueOf(strOptString).length()), strZzC, " : ", strOptString);
        }
        zzdlqVar.zzs("headline", strOptString);
        zzdlqVar.zzs("body", jSONObject.optString("body", null));
        zzdlqVar.zzs("call_to_action", jSONObject.optString("call_to_action", null));
        zzdlqVar.zzs(C3191e4.h.U, jSONObject.optString(C3191e4.h.U, null));
        zzdlqVar.zzs("price", jSONObject.optString("price", null));
        zzdlqVar.zzs(C3191e4.h.F0, jSONObject.optString(C3191e4.h.F0, null));
        return zzdlqVar;
    }

    public final /* synthetic */ zzdlq zzc(n1 n1Var, n1 n1Var2, n1 n1Var3, n1 n1Var4, n1 n1Var5, JSONObject jSONObject, n1 n1Var6, n1 n1Var7, n1 n1Var8, n1 n1Var9, n1 n1Var10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcx)).booleanValue()) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(this.zzd.zze(), zzduq.RENDERING_NATIVE_ASSETS_LOADING_END.zza());
        }
        zzdlq zzdlqVar = (zzdlq) n1Var.get();
        zzdlqVar.zzd((List) n1Var2.get());
        zzdlqVar.zzj((zzbii) n1Var3.get());
        zzdlqVar.zzk((zzbii) n1Var4.get());
        zzdlqVar.zzc((zzbib) n1Var5.get());
        zzdlqVar.zze(zzdoy.zzl(jSONObject));
        zzdlqVar.zzf(zzdoy.zzk(jSONObject));
        zzcgy zzcgyVar = (zzcgy) n1Var6.get();
        if (zzcgyVar != null) {
            zzdlqVar.zzm(zzcgyVar);
            zzdlqVar.zzg(zzcgyVar.zzE());
            zzdlqVar.zzb(zzcgyVar.zzh());
        }
        zzdlqVar.zzH().putAll((Bundle) n1Var7.get());
        zzcgy zzcgyVar2 = (zzcgy) n1Var8.get();
        if (zzcgyVar2 != null) {
            zzdlqVar.zzn(zzcgyVar2);
            zzdlqVar.zzh(zzcgyVar2.zzE());
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfW)).booleanValue() || zzf(jSONObject)) {
            zzcgy zzcgyVar3 = (zzcgy) n1Var9.get();
            if (zzcgyVar3 != null) {
                zzdlqVar.zzo(zzcgyVar3);
            }
        } else {
            zzdlqVar.zzp(n1Var9);
            zzdlqVar.zzr(new zzcca());
        }
        for (zzdpa zzdpaVar : (List) n1Var10.get()) {
            if (zzdpaVar.zza != 1) {
                zzdlqVar.zzt(zzdpaVar.zzb, zzdpaVar.zzd);
            } else {
                zzdlqVar.zzs(zzdpaVar.zzb, zzdpaVar.zzc);
            }
        }
        return zzdlqVar;
    }

    public final /* synthetic */ zzdvc zzd() {
        return this.zzd;
    }
}

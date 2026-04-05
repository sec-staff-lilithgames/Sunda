package com.google.android.gms.internal.ads;

import b3.h;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzbou extends zzbpf, zzbot {
    @Override // com.google.android.gms.internal.ads.zzbpf
    void zza(String str);

    @Override // com.google.android.gms.internal.ads.zzbpf
    default void zzb(String str, JSONObject jSONObject) {
        zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbpf
    default void zzc(String str, String str2) {
        zza(o2.r(new StringBuilder(o2.C(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    default void zzd(String str, JSONObject jSONObject) {
        StringBuilder sbB = h.b("(window.AFMA_ReceiveMessage || function() {})('", str, "',", jSONObject.toString(), ");");
        String string = sbB.toString();
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Dispatching AFMA event: ".concat(string));
        zza(sbB.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    default void zze(String str, Map map) {
        try {
            zzd(str, com.google.android.gms.ads.internal.client.zzbb.zza().zzk(map));
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(VPCjETNfjxu.midxXwdL);
        }
    }
}

package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfov {
    private final zzfph zza;
    private final zzfph zzb;
    private final boolean zzc;
    private final zzfoz zzd;
    private final zzfpc zze;

    private zzfov(zzfoz zzfozVar, zzfpc zzfpcVar, zzfph zzfphVar, zzfph zzfphVar2, boolean z10) {
        this.zzd = zzfozVar;
        this.zze = zzfpcVar;
        this.zza = zzfphVar;
        if (zzfphVar2 == null) {
            this.zzb = zzfph.NONE;
        } else {
            this.zzb = zzfphVar2;
        }
        this.zzc = z10;
    }

    public static zzfov zza(zzfoz zzfozVar, zzfpc zzfpcVar, zzfph zzfphVar, zzfph zzfphVar2, boolean z10) {
        zzfqs.zzb(zzfozVar, "CreativeType is null");
        zzfqs.zzb(zzfpcVar, "ImpressionType is null");
        zzfqs.zzb(zzfphVar, "Impression owner is null");
        if (zzfphVar == zzfph.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (zzfozVar == zzfoz.DEFINED_BY_JAVASCRIPT && zzfphVar == zzfph.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (zzfpcVar == zzfpc.DEFINED_BY_JAVASCRIPT && zzfphVar == zzfph.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        return new zzfov(zzfozVar, zzfpcVar, zzfphVar, zzfphVar2, z10);
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfqo.zzc(jSONObject, "impressionOwner", this.zza);
        zzfqo.zzc(jSONObject, "mediaEventsOwner", this.zzb);
        zzfqo.zzc(jSONObject, "creativeType", this.zzd);
        zzfqo.zzc(jSONObject, "impressionType", this.zze);
        zzfqo.zzc(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.zzc));
        return jSONObject;
    }
}

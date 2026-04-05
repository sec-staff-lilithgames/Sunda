package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfvm {
    private final zzfvi zza;

    public final /* synthetic */ zzfvk zza() {
        zzhwo zzhwoVarZzbu = this.zza.zzbu();
        e0.checkNotNullExpressionValue(zzhwoVarZzbu, "build(...)");
        return (zzfvk) zzhwoVarZzbu;
    }

    public final /* synthetic */ zzhzs zzb() {
        Map mapZzb = this.zza.zzb();
        e0.checkNotNullExpressionValue(mapZzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new zzhzs(mapZzb);
    }

    public final void zzc(zzhzs zzhzsVar, String key, zzfvg value) {
        e0.checkNotNullParameter(zzhzsVar, "<this>");
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(zzhzs zzhzsVar, String key) {
        e0.checkNotNullParameter(zzhzsVar, "<this>");
        e0.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}

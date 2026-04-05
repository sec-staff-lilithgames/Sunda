package com.google.android.gms.internal.ads;

import android.util.Base64;
import m5.d;
import m5.f;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzeyt implements zzgtq {
    static final /* synthetic */ zzeyt zza = new zzeyt();

    private /* synthetic */ zzeyt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final /* synthetic */ n1 zza(Object obj) {
        d dVar = (d) obj;
        if (dVar == null) {
            return zzgui.zza(new zzeyv("", 1, null));
        }
        zzial zzialVarZzc = zziam.zzc();
        for (f fVar : dVar.getTopics()) {
            zziaj zziajVarZzc = zziak.zzc();
            zziajVarZzc.zza(fVar.getTopicId());
            zziajVarZzc.zzb(fVar.getModelVersion());
            zziajVarZzc.zzc(fVar.getTaxonomyVersion());
            zzialVarZzc.zza((zziak) zziajVarZzc.zzbu());
        }
        return zzgui.zza(new zzeyv(Base64.encodeToString(((zziam) zzialVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}

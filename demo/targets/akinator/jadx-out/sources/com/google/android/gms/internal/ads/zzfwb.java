package com.google.android.gms.internal.ads;

import av.e;
import bv.n;
import kotlin.jvm.internal.e0;
import kv.p;
import tu.a0;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfwb extends n implements p {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfvg zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfwb(zzfvg zzfvgVar, d dVar) {
        super(2, dVar);
        this.zzb = zzfvgVar;
    }

    @Override // bv.a
    public final d create(Object obj, d dVar) {
        zzfwb zzfwbVar = new zzfwb(this.zzb, dVar);
        zzfwbVar.zza = obj;
        return zzfwbVar;
    }

    @Override // kv.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfwb) create((zzfvk) obj, (d) obj2)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        zzfvm zzfvmVarZza = zzfvl.zza((zzfvi) ((zzfvk) this.zza).zzcc());
        zzhzs zzhzsVarZzb = zzfvmVarZza.zzb();
        zzfvg zzfvgVar = this.zzb;
        String strZza = zzfvgVar.zza();
        e0.checkNotNullExpressionValue(strZza, "getGwsQueryId(...)");
        zzfvmVarZza.zzc(zzhzsVarZzb, strZza, zzfvgVar);
        return zzfvmVarZza.zza();
    }
}

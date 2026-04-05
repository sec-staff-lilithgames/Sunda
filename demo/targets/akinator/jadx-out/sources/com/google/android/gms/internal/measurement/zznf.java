package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import java.io.IOException;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zznf {
    private final zzne zza;

    private zznf(zzot zzotVar, Object obj, zzot zzotVar2, Object obj2) {
        this.zza = new zzne(zzotVar, "", zzotVar2, "");
    }

    public static void zzb(zzlm zzlmVar, zzne zzneVar, Object obj, Object obj2) throws IOException {
        zzlw.zzf(zzlmVar, zzneVar.zza, 1, obj);
        zzlw.zzf(zzlmVar, zzneVar.zzc, 2, obj2);
    }

    public static int zzc(zzne zzneVar, Object obj, Object obj2) {
        return zzlw.zzh(zzneVar.zza, 1, obj) + zzlw.zzh(zzneVar.zzc, 2, obj2);
    }

    public final int zzd(int i10, Object obj, Object obj2) {
        zzne zzneVar = this.zza;
        int iZzz = zzlm.zzz(i10 << 3);
        int iZzc = zzc(zzneVar, obj, obj2);
        return a.C(iZzc, iZzc, iZzz);
    }

    public final zzne zze() {
        return this.zza;
    }

    public static zznf zza(zzot zzotVar, Object obj, zzot zzotVar2, Object obj2) {
        String str = QpyI.KIVFknJPgU;
        return new zznf(zzotVar, str, zzotVar2, str);
    }
}

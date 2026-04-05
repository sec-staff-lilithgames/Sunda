package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzglu;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzaq implements zzglu {
    static final /* synthetic */ zzaq zza = new zzaq();

    private /* synthetic */ zzaq() {
    }

    @Override // com.google.android.gms.internal.ads.zzglu
    public final /* synthetic */ Object apply(Object obj) {
        int i10 = zzau.zze;
        return ((JSONObject) obj).optString("nas");
    }
}

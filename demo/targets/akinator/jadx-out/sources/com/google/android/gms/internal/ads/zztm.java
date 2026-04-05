package com.google.android.gms.internal.ads;

import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zztm implements zztp {
    static final /* synthetic */ zztm zza = new zztm();

    private /* synthetic */ zztm() {
    }

    @Override // com.google.android.gms.internal.ads.zztp
    public final /* synthetic */ int zza(Object obj) {
        int i10 = zztq.zza;
        String str = ((zzsy) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}

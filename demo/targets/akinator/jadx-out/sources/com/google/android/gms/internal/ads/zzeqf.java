package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzeqf implements zzgtq {
    static final /* synthetic */ zzeqf zza = new zzeqf();

    private /* synthetic */ zzeqf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final /* synthetic */ n1 zza(Object obj) {
        return ((Throwable) obj) instanceof TimeoutException ? zzgui.zza(new zzeqi(Integer.toString(17))) : zzgui.zza(new zzeqi(null));
    }
}

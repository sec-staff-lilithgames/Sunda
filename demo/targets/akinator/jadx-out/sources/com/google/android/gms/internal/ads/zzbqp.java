package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbqp {
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbqn();
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzbqo();
    private final zzbqb zzc;

    public zzbqp(Context context, VersionInfoParcel versionInfoParcel, String str, zzflp zzflpVar) {
        this.zzc = new zzbqb(context, versionInfoParcel, str, zza, zzb, zzflpVar);
    }

    public final zzbqf zza(String str, zzbqi zzbqiVar, zzbqh zzbqhVar) {
        return new zzbqt(this.zzc, str, zzbqiVar, zzbqhVar);
    }

    public final zzbqy zzb() {
        return new zzbqy(this.zzc);
    }
}

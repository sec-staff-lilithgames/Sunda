package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzevj implements zzexy {
    private final Boolean zza;

    public zzevj(Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Boolean bool = this.zza;
        zzcxq zzcxqVar = (zzcxq) obj;
        if (bool != null) {
            zzcxqVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}

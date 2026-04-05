package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
enum zzd {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final zzcr zzp;
    private final int zzr;

    static {
        zzcq zzcqVar = new zzcq();
        for (zzd zzdVar : values()) {
            zzcqVar.zza(Integer.valueOf(zzdVar.zzr), zzdVar);
        }
        zzp = zzcqVar.zzb();
    }

    zzd(int i10) {
        this.zzr = i10;
    }

    public static zzd zza(int i10) {
        zzcr zzcrVar = zzp;
        Integer numValueOf = Integer.valueOf(i10);
        return !zzcrVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (zzd) zzcrVar.get(numValueOf);
    }
}

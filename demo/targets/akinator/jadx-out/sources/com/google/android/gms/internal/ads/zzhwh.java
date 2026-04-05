package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhwh implements zzhxx {
    private static final zzhwh zza = new zzhwh();

    private zzhwh() {
    }

    public static zzhwh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhxx
    public final boolean zzb(Class cls) {
        return zzhwo.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzhxx
    public final zzhxw zzc(Class cls) {
        if (!zzhwo.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzhxw) zzhwo.zzbt(cls.asSubclass(zzhwo.class)).zzbs();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}

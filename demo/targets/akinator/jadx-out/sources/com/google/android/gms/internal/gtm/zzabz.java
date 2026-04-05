package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzabz implements zzadj {
    private static final zzabz zza = new zzabz();

    private zzabz() {
    }

    public static zzabz zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.gtm.zzadj
    public final zzadi zzb(Class cls) {
        if (!zzacf.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzadi) zzacf.zzad(cls.asSubclass(zzacf.class)).zzb(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzadj
    public final boolean zzc(Class cls) {
        return zzacf.class.isAssignableFrom(cls);
    }
}

package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public enum zzago implements zzach {
    UNKNOWN(0),
    SUCCESS(1),
    FAILURE(2),
    CANCEL(3);

    private static final zzaci zze = new zzaci() { // from class: com.google.android.gms.internal.gtm.zzagn
        @Override // com.google.android.gms.internal.gtm.zzaci
        public final /* synthetic */ zzach zza(int i10) {
            if (i10 == 0) {
                return zzago.UNKNOWN;
            }
            if (i10 == 1) {
                return zzago.SUCCESS;
            }
            if (i10 == 2) {
                return zzago.FAILURE;
            }
            if (i10 != 3) {
                return null;
            }
            return zzago.CANCEL;
        }
    };
    private final int zzg;

    zzago(int i10) {
        this.zzg = i10;
    }

    public static zzaci zzb() {
        return zze;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.gtm.zzach
    public final int zza() {
        return this.zzg;
    }
}

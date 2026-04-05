package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public enum zzahl implements zzach {
    TOMBSTONE_UNSPECIFIED(0),
    TOMBSTONE_RETAIN(1),
    TOMBSTONE_DROP(2);

    private static final zzaci zzd = new zzaci() { // from class: com.google.android.gms.internal.gtm.zzahk
        @Override // com.google.android.gms.internal.gtm.zzaci
        public final /* synthetic */ zzach zza(int i10) {
            if (i10 == 0) {
                return zzahl.TOMBSTONE_UNSPECIFIED;
            }
            if (i10 == 1) {
                return zzahl.TOMBSTONE_RETAIN;
            }
            if (i10 != 2) {
                return null;
            }
            return zzahl.TOMBSTONE_DROP;
        }
    };
    private final int zzf;

    zzahl(int i10) {
        this.zzf = i10;
    }

    public static zzaci zzb() {
        return zzd;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.gtm.zzach
    public final int zza() {
        return this.zzf;
    }
}

package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public enum zzafs implements zzach {
    DF_NONE(0),
    DF_HTTPHEADER(1),
    DF_COOKIE(2),
    DF_URL(3),
    DF_CGI_ARGS(4),
    DF_HOST_ORDER(5),
    DF_BYTE_SWAPPED(6),
    DF_LOGGING_ELEMENT_TYPE_ID(7);

    private static final zzaci zzi = new zzaci() { // from class: com.google.android.gms.internal.gtm.zzafr
        @Override // com.google.android.gms.internal.gtm.zzaci
        public final /* synthetic */ zzach zza(int i10) {
            switch (i10) {
                case 0:
                    return zzafs.DF_NONE;
                case 1:
                    return zzafs.DF_HTTPHEADER;
                case 2:
                    return zzafs.DF_COOKIE;
                case 3:
                    return zzafs.DF_URL;
                case 4:
                    return zzafs.DF_CGI_ARGS;
                case 5:
                    return zzafs.DF_HOST_ORDER;
                case 6:
                    return zzafs.DF_BYTE_SWAPPED;
                case 7:
                    return zzafs.DF_LOGGING_ELEMENT_TYPE_ID;
                default:
                    return null;
            }
        }
    };
    private final int zzk;

    zzafs(int i10) {
        this.zzk = i10;
    }

    public static zzaci zzb() {
        return zzi;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzk);
    }

    @Override // com.google.android.gms.internal.gtm.zzach
    public final int zza() {
        return this.zzk;
    }
}

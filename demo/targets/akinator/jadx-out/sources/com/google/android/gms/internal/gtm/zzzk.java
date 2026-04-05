package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzzk implements zzacj {
    static final zzacj zza = new zzzk();

    private zzzk() {
    }

    @Override // com.google.android.gms.internal.gtm.zzacj
    public final boolean zza(int i10) {
        zzzl zzzlVar;
        zzzl zzzlVar2 = zzzl.EDITION_UNKNOWN;
        if (i10 == 0) {
            zzzlVar = zzzl.EDITION_UNKNOWN;
        } else if (i10 == 1) {
            zzzlVar = zzzl.EDITION_1_TEST_ONLY;
        } else if (i10 == 2) {
            zzzlVar = zzzl.EDITION_2_TEST_ONLY;
        } else if (i10 == 900) {
            zzzlVar = zzzl.EDITION_LEGACY;
        } else if (i10 != Integer.MAX_VALUE) {
            switch (i10) {
                case 998:
                    zzzlVar = zzzl.EDITION_PROTO2;
                    break;
                case 999:
                    zzzlVar = zzzl.EDITION_PROTO3;
                    break;
                case 1000:
                    zzzlVar = zzzl.EDITION_2023;
                    break;
                case 1001:
                    zzzlVar = zzzl.EDITION_2024;
                    break;
                default:
                    switch (i10) {
                        case 99997:
                            zzzlVar = zzzl.EDITION_99997_TEST_ONLY;
                            break;
                        case 99998:
                            zzzlVar = zzzl.EDITION_99998_TEST_ONLY;
                            break;
                        case 99999:
                            zzzlVar = zzzl.EDITION_99999_TEST_ONLY;
                            break;
                        default:
                            zzzlVar = null;
                            break;
                    }
            }
        } else {
            zzzlVar = zzzl.EDITION_MAX;
        }
        return zzzlVar != null;
    }
}

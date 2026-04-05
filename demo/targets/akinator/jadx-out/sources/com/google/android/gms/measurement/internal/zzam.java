package com.google.android.gms.measurement.internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
enum zzam {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    TCF('7'),
    REMOTE_ENFORCED_DEFAULT('8'),
    FAILSAFE('9');

    private final char zzk;

    zzam(char c10) {
        this.zzk = c10;
    }

    public static zzam zza(char c10) {
        for (zzam zzamVar : values()) {
            if (zzamVar.zzk == c10) {
                return zzamVar;
            }
        }
        return UNSET;
    }

    public final /* synthetic */ char zzb() {
        return this.zzk;
    }
}

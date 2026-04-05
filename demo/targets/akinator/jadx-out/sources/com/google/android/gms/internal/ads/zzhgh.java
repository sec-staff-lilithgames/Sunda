package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhgh extends RuntimeException {
    public zzhgh(String str) {
        super(str);
    }

    public static Object zza(zzhgg zzhggVar) {
        try {
            return zzhggVar.zza();
        } catch (Exception e10) {
            throw new zzhgh(e10);
        }
    }

    public zzhgh(String str, Throwable th2) {
        super(str, th2);
    }

    public zzhgh(Throwable th2) {
        super(th2);
    }
}

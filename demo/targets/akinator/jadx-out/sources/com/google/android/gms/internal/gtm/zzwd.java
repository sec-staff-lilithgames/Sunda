package com.google.android.gms.internal.gtm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwd {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzwh zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.gtm.zzwh] */
    static {
        zzwi zzwiVar;
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                zzwiVar = new zzwi();
                break;
            }
            zzwiVar = null;
            try {
                zzwiVar = (zzwh) Class.forName(zza[i10]).asSubclass(zzwh.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzwiVar != null) {
                break;
            } else {
                i10++;
            }
        }
        zzb = zzwiVar;
    }

    public static StackTraceElement zza(Class cls, int i10) {
        zzwe.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}

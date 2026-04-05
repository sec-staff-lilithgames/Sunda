package com.google.android.gms.internal.gtm;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzvg extends zzvc {
    private static final boolean zza = zza.zza();
    private static final boolean zzb;
    private static final zzvb zzc;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    final class zza {
        public static boolean zza() {
            return zzvg.zzt();
        }
    }

    static {
        String str = Build.FINGERPRINT;
        boolean z10 = true;
        if (str != null && !"robolectric".equals(str)) {
            z10 = false;
        }
        zzb = z10;
        zzc = new zzvb() { // from class: com.google.android.gms.internal.gtm.zzvg.1
            @Override // com.google.android.gms.internal.gtm.zzvb
            public zzuh zza(Class<?> cls, int i10) {
                return zzuh.zza;
            }

            @Override // com.google.android.gms.internal.gtm.zzvb
            public String zzb(Class cls) {
                StackTraceElement stackTraceElementZza;
                if (zzvg.zza) {
                    try {
                        if (cls.equals(zzvg.zzp())) {
                            return VMStack.getStackClass2().getName();
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!zzvg.zzb || (stackTraceElementZza = zzwd.zza(cls, 1)) == null) {
                    return null;
                }
                return stackTraceElementZza.getClassName();
            }
        };
    }

    public static Class<?> zzp() {
        return VMStack.getStackClass2();
    }

    public static String zzq() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean zzt() {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            return zza.class.getName().equals(zzq());
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzvc
    public zzum zze(String str) {
        return zzvk.zzb(str);
    }

    @Override // com.google.android.gms.internal.gtm.zzvc
    public zzvb zzh() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.gtm.zzvc
    public zzvq zzj() {
        return zzvl.zzb();
    }

    @Override // com.google.android.gms.internal.gtm.zzvc
    public String zzm() {
        return "platform: Android";
    }
}

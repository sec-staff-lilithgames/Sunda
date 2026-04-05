package com.google.android.gms.internal.gtm;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzva {
    private static final zzvc zza = zzb(zzvc.zzd);

    private static zzvc zzb(String[] strArr) {
        zzvg zzvgVar;
        try {
            zzvgVar = zzvh.zza;
        } catch (NoClassDefFoundError unused) {
            zzvgVar = null;
        }
        if (zzvgVar != null) {
            return zzvgVar;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzvc) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th2) {
                th = th2;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb2.append('\n');
                sb2.append(str);
                sb2.append(": ");
                sb2.append(th);
            }
        }
        throw new IllegalStateException(sb2.insert(0, "No logging platforms found:").toString());
    }
}

package com.google.android.gms.internal.ads;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgmu {
    public static String zza(String str) {
        return str == null ? "" : str;
    }

    public static String zzb(String str) {
        if (zzgmc.zza(str)) {
            return null;
        }
        return str;
    }

    public static boolean zzc(String str) {
        return zzgmc.zza(str);
    }

    public static String zzd(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder(str.length() + (objArr.length * 16));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i10 >= length || (iIndexOf = str.indexOf("%s", i11)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i11, iIndexOf);
            sb2.append(zze(objArr[i10]));
            i11 = iIndexOf + 2;
            i10++;
        }
        sb2.append((CharSequence) str, i11, str.length());
        if (i10 < length) {
            String str2 = " [";
            while (i10 < objArr.length) {
                sb2.append(str2);
                sb2.append(zze(objArr[i10]));
                i10++;
                str2 = ", ";
            }
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2.toString();
    }

    private static String zze(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        try {
            return obj.toString();
        } catch (Exception e10) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strO = a.b.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strO), (Throwable) e10);
            String name2 = e10.getClass().getName();
            StringBuilder sb2 = new StringBuilder(strO.length() + 8 + name2.length() + 1);
            com.google.android.gms.internal.play_billing.a.B(sb2, "<", strO, " threw ", name2);
            sb2.append(">");
            return sb2.toString();
        }
    }
}

package com.google.android.gms.internal.location;

import com.google.android.gms.internal.play_billing.a;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbn {
    public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                string = AbstractJsonLexerKt.NULL;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String string2 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String strValueOf = String.valueOf(string2);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", strValueOf.length() != 0 ? "Exception during lenientFormat for ".concat(strValueOf) : new String("Exception during lenientFormat for "), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 9 + name2.length());
                    a.B(sb3, "<", string2, " threw ", name2);
                    sb3.append(">");
                    string = sb3.toString();
                }
            }
            objArr[i11] = string;
            i11++;
        }
        StringBuilder sb4 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb4.append((CharSequence) str, i12, iIndexOf);
            sb4.append(objArr[i10]);
            i10++;
            i12 = iIndexOf + 2;
        }
        sb4.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb4.append(", ");
                sb4.append(objArr[i13]);
            }
            sb4.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb4.toString();
    }
}

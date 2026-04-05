package jc;

import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class p0 extends o0 {
    public p0(boolean z10) {
        if (z10) {
            String simpleName = getClass().getSimpleName();
            Logger.getLogger(getClass().getName()).warning(e3.g.l("PropertyNamingStrategy.", simpleName, " is used but it has been deprecated due to risk of deadlock. Consider using PropertyNamingStrategies.", simpleName, " instead. See https://github.com/FasterXML/jackson-databind/issues/2715 for more details."));
        }
    }

    public static String a(String str, char c10) {
        int length;
        if (str == null || (length = str.length()) == 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder((length >> 1) + length);
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            char lowerCase = Character.toLowerCase(cCharAt);
            if (lowerCase == cCharAt) {
                if (i10 > 1) {
                    sb2.insert(sb2.length() - 1, c10);
                }
                i10 = 0;
            } else {
                if (i10 == 0 && i11 > 0) {
                    sb2.append(c10);
                }
                i10++;
            }
            sb2.append(lowerCase);
        }
        return sb2.toString();
    }

    @Override // jc.o0
    public String nameForConstructorParameter(lc.z zVar, rc.q qVar, String str) {
        return translate(str);
    }

    @Override // jc.o0
    public String nameForField(lc.z zVar, rc.i iVar, String str) {
        return translate(str);
    }

    @Override // jc.o0
    public String nameForGetterMethod(lc.z zVar, rc.m mVar, String str) {
        return translate(str);
    }

    @Override // jc.o0
    public String nameForSetterMethod(lc.z zVar, rc.m mVar, String str) {
        return translate(str);
    }

    public abstract String translate(String str);
}

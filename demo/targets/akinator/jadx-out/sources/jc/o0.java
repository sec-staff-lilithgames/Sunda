package jc;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class o0 implements Serializable {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends p0 {
        public a() {
            super(true);
        }

        @Override // jc.p0
        public String translate(String str) {
            return p0.a(str, '-');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends p0 {
        public b() {
            super(true);
        }

        @Override // jc.p0
        public String translate(String str) {
            return str.toLowerCase();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends p0 {
        public c() {
            super(true);
        }

        @Override // jc.p0
        public String translate(String str) {
            return p0.a(str, '.');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends p0 {
        public d() {
            super(true);
        }

        @Override // jc.p0
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length * 2);
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < length; i11++) {
                char cCharAt = str.charAt(i11);
                if (i11 > 0 || cCharAt != '_') {
                    if (Character.isUpperCase(cCharAt)) {
                        if (!z10 && i10 > 0 && sb2.charAt(i10 - 1) != '_') {
                            sb2.append('_');
                            i10++;
                        }
                        cCharAt = Character.toLowerCase(cCharAt);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    sb2.append(cCharAt);
                    i10++;
                }
            }
            return i10 > 0 ? sb2.toString() : str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends p0 {
        public e() {
            super(true);
        }

        @Override // jc.p0
        public String translate(String str) {
            char cCharAt;
            char upperCase;
            if (str == null || str.isEmpty() || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.setCharAt(0, upperCase);
            return sb2.toString();
        }
    }

    static {
        new o0();
        new e();
        new d();
        new b();
        new a();
        new c();
    }

    public String nameForConstructorParameter(lc.z zVar, rc.q qVar, String str) {
        return str;
    }

    public String nameForField(lc.z zVar, rc.i iVar, String str) {
        return str;
    }

    public String nameForGetterMethod(lc.z zVar, rc.m mVar, String str) {
        return str;
    }

    public String nameForSetterMethod(lc.z zVar, rc.m mVar, String str) {
        return str;
    }
}

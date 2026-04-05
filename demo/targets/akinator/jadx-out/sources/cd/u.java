package cd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class u implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final s f12207b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends StringTokenizer {

        /* renamed from: a, reason: collision with root package name */
        public final String f12208a;

        /* renamed from: b, reason: collision with root package name */
        public int f12209b;

        /* renamed from: c, reason: collision with root package name */
        public String f12210c;

        public a(String str) {
            super(str, "<,>", true);
            this.f12208a = str;
        }

        public String getAllInput() {
            return this.f12208a;
        }

        public String getRemainingInput() {
            return this.f12208a.substring(this.f12209b);
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this.f12210c != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this.f12210c;
            if (str != null) {
                this.f12210c = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.f12209b = strNextToken.length() + this.f12209b;
            return strNextToken.trim();
        }

        public void pushBack(String str) {
            this.f12210c = str;
        }
    }

    public u(s sVar) {
        this.f12207b = sVar;
    }

    public static IllegalArgumentException a(a aVar, String str) {
        StringBuilder sbB = b3.h.b("Failed to parse type ", b(aVar.getAllInput()), " (remaining: ", b(aVar.getRemainingInput()), "): ");
        sbB.append(str);
        return new IllegalArgumentException(sbB.toString());
    }

    public static String b(String str) {
        return str.length() <= 1000 ? a.b.l("'", str, "'") : String.format("'%s...'[truncated %d charaters]", str.substring(0, 1000), Integer.valueOf(str.length() - 1000));
    }

    public final jc.o c(a aVar, int i10) {
        s sVar = this.f12207b;
        if (!aVar.hasMoreTokens()) {
            throw a(aVar, "Unexpected end-of-string");
        }
        String strNextToken = aVar.nextToken();
        try {
            Class<?> clsFindClass = sVar.findClass(strNextToken);
            if (aVar.hasMoreTokens()) {
                String strNextToken2 = aVar.nextToken();
                if ("<".equals(strNextToken2)) {
                    int i11 = i10 - 1;
                    if (i11 < 0) {
                        throw a(aVar, "too deeply nested; exceeds maximum of 1000 nesting levels");
                    }
                    ArrayList arrayList = new ArrayList();
                    while (aVar.hasMoreTokens()) {
                        arrayList.add(c(aVar, i11));
                        if (!aVar.hasMoreTokens()) {
                            break;
                        }
                        String strNextToken3 = aVar.nextToken();
                        if (">".equals(strNextToken3)) {
                            return sVar.d(null, clsFindClass, r.create(clsFindClass, arrayList));
                        }
                        if (!",".equals(strNextToken3)) {
                            throw a(aVar, "Unexpected token '" + strNextToken3 + "', expected ',' or '>')");
                        }
                    }
                    throw a(aVar, "Unexpected end-of-string");
                }
                aVar.pushBack(strNextToken2);
            }
            return sVar.d(null, clsFindClass, r.emptyBindings());
        } catch (Exception e10) {
            dd.i.throwIfRTE(e10);
            throw a(aVar, "Cannot locate class '" + strNextToken + "', problem: " + e10.getMessage());
        }
    }

    public jc.o parse(String str) throws IllegalArgumentException {
        if (str.length() > 64000) {
            throw new IllegalArgumentException(String.format("Failed to parse type %s: too long (%d characters), maximum length allowed: %d", b(str), Integer.valueOf(str.length()), 64000));
        }
        a aVar = new a(str.trim());
        jc.o oVarC = c(aVar, 1000);
        if (aVar.hasMoreTokens()) {
            throw a(aVar, "Unexpected tokens after complete type");
        }
        return oVarC;
    }

    public u withFactory(s sVar) {
        return sVar == this.f12207b ? this : new u(sVar);
    }
}

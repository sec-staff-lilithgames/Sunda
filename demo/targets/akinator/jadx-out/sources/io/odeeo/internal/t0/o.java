package io.odeeo.internal.t0;

import com.ironsource.G5;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f66441a;

        /* renamed from: b, reason: collision with root package name */
        public final a f66442b;

        /* renamed from: c, reason: collision with root package name */
        public a f66443c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f66444d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public String f66445a;

            /* renamed from: b, reason: collision with root package name */
            public Object f66446b;

            /* renamed from: c, reason: collision with root package name */
            public a f66447c;

            public a() {
            }
        }

        public final a a() {
            a aVar = new a();
            this.f66443c.f66447c = aVar;
            this.f66443c = aVar;
            return aVar;
        }

        public b add(String str, Object obj) {
            return a(str, obj);
        }

        public b addValue(Object obj) {
            return a(obj);
        }

        public b omitNullValues() {
            this.f66444d = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.f66444d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f66441a);
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String str = "";
            for (a aVar = this.f66442b.f66447c; aVar != null; aVar = aVar.f66447c) {
                Object obj = aVar.f66446b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f66445a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append(G5.T);
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
            return sb2.toString();
        }

        public b(String str) {
            a aVar = new a();
            this.f66442b = aVar;
            this.f66443c = aVar;
            this.f66444d = false;
            this.f66441a = (String) u.checkNotNull(str);
        }

        public b add(String str, boolean z10) {
            return a(str, String.valueOf(z10));
        }

        public b addValue(boolean z10) {
            return a(String.valueOf(z10));
        }

        public final b a(Object obj) {
            a().f66446b = obj;
            return this;
        }

        public b add(String str, char c10) {
            return a(str, String.valueOf(c10));
        }

        public b addValue(char c10) {
            return a(String.valueOf(c10));
        }

        public b add(String str, double d10) {
            return a(str, String.valueOf(d10));
        }

        public b addValue(double d10) {
            return a(String.valueOf(d10));
        }

        public final b a(String str, Object obj) {
            a aVarA = a();
            aVarA.f66446b = obj;
            aVarA.f66445a = (String) u.checkNotNull(str);
            return this;
        }

        public b add(String str, float f10) {
            return a(str, String.valueOf(f10));
        }

        public b addValue(float f10) {
            return a(String.valueOf(f10));
        }

        public b add(String str, int i10) {
            return a(str, String.valueOf(i10));
        }

        public b addValue(int i10) {
            return a(String.valueOf(i10));
        }

        public b add(String str, long j10) {
            return a(str, String.valueOf(j10));
        }

        public b addValue(long j10) {
            return a(String.valueOf(j10));
        }
    }

    public static <T> T firstNonNull(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        if (t11 != null) {
            return t11;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static b toStringHelper(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }

    public static b toStringHelper(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b toStringHelper(String str) {
        return new b(str);
    }
}

package xv;

import j1.o2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f93670e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final sv.x f93671f = new sv.x("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g, reason: collision with root package name */
    public static final sv.x f93672g = new sv.x(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f93673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f93674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f93675c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f93676d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        @tu.f
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final j0 m7932deprecated_get(String mediaType) {
            kotlin.jvm.internal.e0.checkNotNullParameter(mediaType, "mediaType");
            return get(mediaType);
        }

        @tu.f
        /* renamed from: -deprecated_parse, reason: not valid java name */
        public final j0 m7933deprecated_parse(String mediaType) {
            kotlin.jvm.internal.e0.checkNotNullParameter(mediaType, "mediaType");
            return parse(mediaType);
        }

        public final j0 get(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            sv.t tVarMatchAt = j0.f93671f.matchAt(str, 0);
            if (tVarMatchAt == null) {
                throw new IllegalArgumentException(o2.f(AbstractJsonLexerKt.STRING, "No subtype found for: \"", str));
            }
            String str2 = tVarMatchAt.getGroupValues().get(1);
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            String lowerCase2 = tVarMatchAt.getGroupValues().get(2).toLowerCase(locale);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            int last = tVarMatchAt.getRange().getLast();
            while (true) {
                int i10 = last + 1;
                if (i10 >= str.length()) {
                    return new j0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
                }
                sv.t tVarMatchAt2 = j0.f93672g.matchAt(str, i10);
                if (tVarMatchAt2 == null) {
                    StringBuilder sb2 = new StringBuilder("Parameter is not formatted correctly: \"");
                    String strSubstring = str.substring(i10);
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    throw new IllegalArgumentException(p0.o2.q(sb2, str, AbstractJsonLexerKt.STRING).toString());
                }
                sv.o oVar = ((sv.v) tVarMatchAt2.getGroups()).get(1);
                String value = oVar != null ? oVar.getValue() : null;
                if (value == null) {
                    last = tVarMatchAt2.getRange().getLast();
                } else {
                    sv.o oVar2 = ((sv.v) tVarMatchAt2.getGroups()).get(2);
                    String value2 = oVar2 != null ? oVar2.getValue() : null;
                    if (value2 == null) {
                        sv.o oVar3 = ((sv.v) tVarMatchAt2.getGroups()).get(3);
                        kotlin.jvm.internal.e0.checkNotNull(oVar3);
                        value2 = oVar3.getValue();
                    } else if (sv.n0.startsWith$default((CharSequence) value2, '\'', false, 2, (Object) null) && sv.n0.endsWith$default((CharSequence) value2, '\'', false, 2, (Object) null) && value2.length() > 2) {
                        value2 = value2.substring(1, value2.length() - 1);
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue(value2, "substring(...)");
                    }
                    arrayList.add(value);
                    arrayList.add(value2);
                    last = tVarMatchAt2.getRange().getLast();
                }
            }
        }

        public final j0 parse(String str) {
            kotlin.jvm.internal.e0.checkNotNullParameter(str, "<this>");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public j0(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mediaType, "mediaType");
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        kotlin.jvm.internal.e0.checkNotNullParameter(subtype, "subtype");
        kotlin.jvm.internal.e0.checkNotNullParameter(parameterNamesAndValues, "parameterNamesAndValues");
        this.f93673a = mediaType;
        this.f93674b = type;
        this.f93675c = subtype;
        this.f93676d = parameterNamesAndValues;
    }

    public static /* synthetic */ Charset charset$default(j0 j0Var, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return j0Var.charset(charset);
    }

    public static final j0 get(String str) {
        return f93670e.get(str);
    }

    public static final j0 parse(String str) {
        return f93670e.parse(str);
    }

    @tu.f
    /* renamed from: -deprecated_subtype, reason: not valid java name */
    public final String m7930deprecated_subtype() {
        return this.f93675c;
    }

    @tu.f
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final String m7931deprecated_type() {
        return this.f93674b;
    }

    public final Charset charset() {
        return charset$default(this, null, 1, null);
    }

    public boolean equals(Object obj) {
        return (obj instanceof j0) && kotlin.jvm.internal.e0.areEqual(((j0) obj).f93673a, this.f93673a);
    }

    public final String getMediaType$okhttp() {
        return this.f93673a;
    }

    public int hashCode() {
        return this.f93673a.hashCode();
    }

    public final String parameter(String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        String[] strArr = this.f93676d;
        int i10 = 0;
        int progressionLastElement = dv.d.getProgressionLastElement(0, strArr.length - 1, 2);
        if (progressionLastElement < 0) {
            return null;
        }
        while (!sv.k0.equals(strArr[i10], name, true)) {
            if (i10 == progressionLastElement) {
                return null;
            }
            i10 += 2;
        }
        return strArr[i10 + 1];
    }

    public final String subtype() {
        return this.f93675c;
    }

    public String toString() {
        return this.f93673a;
    }

    public final String type() {
        return this.f93674b;
    }

    public final Charset charset(Charset charset) {
        String strParameter = parameter("charset");
        if (strParameter == null) {
            return charset;
        }
        try {
            return Charset.forName(strParameter);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}

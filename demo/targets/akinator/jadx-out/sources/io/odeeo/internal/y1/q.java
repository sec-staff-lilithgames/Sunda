package io.odeeo.internal.y1;

import com.ironsource.C3271ic;
import io.odeeo.internal.a2.x;
import io.odeeo.internal.a2.y;
import io.odeeo.internal.y1.n;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p0.o2;
import xv.f0;
import xv.g0;
import xv.j0;
import xv.k0;
import xv.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Method f67681a;

    /* renamed from: b, reason: collision with root package name */
    public final g0 f67682b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67683c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67684d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f67685e;

    /* renamed from: f, reason: collision with root package name */
    public final j0 f67686f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f67687g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f67688h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f67689i;

    /* renamed from: j, reason: collision with root package name */
    public final n<?>[] f67690j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f67691k;

    public q(a aVar) {
        this.f67681a = aVar.f67695b;
        this.f67682b = aVar.f67694a.f67722c;
        this.f67683c = aVar.f67707n;
        this.f67684d = aVar.f67711r;
        this.f67685e = aVar.f67712s;
        this.f67686f = aVar.f67713t;
        this.f67687g = aVar.f67708o;
        this.f67688h = aVar.f67709p;
        this.f67689i = aVar.f67710q;
        this.f67690j = aVar.f67715v;
        this.f67691k = aVar.f67716w;
    }

    public static q a(s sVar, Method method) {
        return new a(sVar, method).a();
    }

    public o0 a(Object[] objArr) throws IOException {
        n<?>[] nVarArr = this.f67690j;
        int length = objArr.length;
        if (length != nVarArr.length) {
            throw new IllegalArgumentException(a.b.f(nVarArr.length, ")", o2.t(length, "Argument count (", ") doesn't match expected count (")));
        }
        p pVar = new p(this.f67683c, this.f67682b, this.f67684d, this.f67685e, this.f67686f, this.f67687g, this.f67688h, this.f67689i);
        if (this.f67691k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            nVarArr[i10].a(pVar, objArr[i10]);
        }
        return pVar.a().tag((Class<? super Class>) j.class, (Class) new j(this.f67681a, arrayList)).build();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: x, reason: collision with root package name */
        public static final Pattern f67692x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y, reason: collision with root package name */
        public static final Pattern f67693y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a, reason: collision with root package name */
        public final s f67694a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f67695b;

        /* renamed from: c, reason: collision with root package name */
        public final Annotation[] f67696c;

        /* renamed from: d, reason: collision with root package name */
        public final Annotation[][] f67697d;

        /* renamed from: e, reason: collision with root package name */
        public final Type[] f67698e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f67699f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f67700g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f67701h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f67702i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f67703j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f67704k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f67705l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f67706m;

        /* renamed from: n, reason: collision with root package name */
        public String f67707n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f67708o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f67709p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f67710q;

        /* renamed from: r, reason: collision with root package name */
        public String f67711r;

        /* renamed from: s, reason: collision with root package name */
        public f0 f67712s;

        /* renamed from: t, reason: collision with root package name */
        public j0 f67713t;

        /* renamed from: u, reason: collision with root package name */
        public Set<String> f67714u;

        /* renamed from: v, reason: collision with root package name */
        public n<?>[] f67715v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f67716w;

        public a(s sVar, Method method) {
            this.f67694a = sVar;
            this.f67695b = method;
            this.f67696c = method.getAnnotations();
            this.f67698e = method.getGenericParameterTypes();
            this.f67697d = method.getParameterAnnotations();
        }

        public q a() {
            for (Annotation annotation : this.f67696c) {
                a(annotation);
            }
            if (this.f67707n == null) {
                throw w.a(this.f67695b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f67708o) {
                if (this.f67710q) {
                    throw w.a(this.f67695b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.f67709p) {
                    throw w.a(this.f67695b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.f67697d.length;
            this.f67715v = new n[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.f67715v[i11] = a(i11, this.f67698e[i11], this.f67697d[i11], i11 == i10);
                i11++;
            }
            if (this.f67711r == null && !this.f67706m) {
                throw w.a(this.f67695b, "Missing either @%s URL or @Url parameter.", this.f67707n);
            }
            boolean z10 = this.f67709p;
            if (!z10 && !this.f67710q && !this.f67708o && this.f67701h) {
                throw w.a(this.f67695b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.f67699f) {
                throw w.a(this.f67695b, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.f67710q || this.f67700g) {
                return new q(this);
            }
            throw w.a(this.f67695b, "Multipart method must contain at least one @Part.", new Object[0]);
        }

        public final void a(Annotation annotation) {
            if (annotation instanceof io.odeeo.internal.a2.b) {
                a("DELETE", ((io.odeeo.internal.a2.b) annotation).value(), false);
                return;
            }
            if (annotation instanceof io.odeeo.internal.a2.f) {
                a(C3271ic.f36943a, ((io.odeeo.internal.a2.f) annotation).value(), false);
                return;
            }
            if (annotation instanceof io.odeeo.internal.a2.g) {
                a("HEAD", ((io.odeeo.internal.a2.g) annotation).value(), false);
                return;
            }
            if (annotation instanceof io.odeeo.internal.a2.n) {
                a("PATCH", ((io.odeeo.internal.a2.n) annotation).value(), true);
                return;
            }
            if (annotation instanceof io.odeeo.internal.a2.o) {
                a(C3271ic.f36944b, ((io.odeeo.internal.a2.o) annotation).value(), true);
                return;
            }
            if (annotation instanceof io.odeeo.internal.a2.p) {
                a("PUT", ((io.odeeo.internal.a2.p) annotation).value(), true);
                return;
            }
            if (annotation instanceof io.odeeo.internal.a2.m) {
                a("OPTIONS", ((io.odeeo.internal.a2.m) annotation).value(), false);
                return;
            }
            if (annotation instanceof io.odeeo.internal.a2.h) {
                io.odeeo.internal.a2.h hVar = (io.odeeo.internal.a2.h) annotation;
                a(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof io.odeeo.internal.a2.k) {
                String[] strArrValue = ((io.odeeo.internal.a2.k) annotation).value();
                if (strArrValue.length != 0) {
                    this.f67712s = a(strArrValue);
                    return;
                }
                throw w.a(this.f67695b, "@Headers annotation is empty.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.l) {
                if (!this.f67709p) {
                    this.f67710q = true;
                    return;
                }
                throw w.a(this.f67695b, "Only one encoding annotation is allowed.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.e) {
                if (!this.f67710q) {
                    this.f67709p = true;
                    return;
                }
                throw w.a(this.f67695b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        public final void a(String str, String str2, boolean z10) {
            String str3 = this.f67707n;
            if (str3 == null) {
                this.f67707n = str;
                this.f67708o = z10;
                if (str2.isEmpty()) {
                    return;
                }
                int iIndexOf = str2.indexOf(63);
                if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                    String strSubstring = str2.substring(iIndexOf + 1);
                    if (f67692x.matcher(strSubstring).find()) {
                        throw w.a(this.f67695b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                    }
                }
                this.f67711r = str2;
                this.f67714u = a(str2);
                return;
            }
            throw w.a(this.f67695b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final f0 a(String[] strArr) {
            f0.a aVar = new f0.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf != -1 && iIndexOf != 0 && iIndexOf != str.length() - 1) {
                    String strSubstring = str.substring(0, iIndexOf);
                    String strTrim = str.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            this.f67713t = j0.get(strTrim);
                        } catch (IllegalArgumentException e10) {
                            throw w.a(this.f67695b, e10, "Malformed content type: %s", strTrim);
                        }
                    } else {
                        aVar.add(strSubstring, strTrim);
                    }
                } else {
                    throw w.a(this.f67695b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
            }
            return aVar.build();
        }

        public final n<?> a(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            n<?> nVar;
            if (annotationArr != null) {
                nVar = null;
                for (Annotation annotation : annotationArr) {
                    n<?> nVarA = a(i10, type, annotationArr, annotation);
                    if (nVarA != null) {
                        if (nVar != null) {
                            throw w.a(this.f67695b, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        nVar = nVarA;
                    }
                }
            } else {
                nVar = null;
            }
            if (nVar != null) {
                return nVar;
            }
            if (z10) {
                try {
                    if (w.b(type) == zu.d.class) {
                        this.f67716w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw w.a(this.f67695b, i10, "No Retrofit annotation found.", new Object[0]);
        }

        public final n<?> a(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof y) {
                a(i10, type);
                if (!this.f67706m) {
                    if (!this.f67702i) {
                        if (!this.f67703j) {
                            if (!this.f67704k) {
                                if (!this.f67705l) {
                                    if (this.f67711r == null) {
                                        this.f67706m = true;
                                        if (type != g0.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                            throw w.a(this.f67695b, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                        }
                                        return new n.p(this.f67695b, i10);
                                    }
                                    throw w.a(this.f67695b, i10, "@Url cannot be used with @%s URL", this.f67707n);
                                }
                                throw w.a(this.f67695b, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw w.a(this.f67695b, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw w.a(this.f67695b, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw w.a(this.f67695b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw w.a(this.f67695b, i10, "Multiple @Url method annotations found.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.s) {
                a(i10, type);
                if (!this.f67703j) {
                    if (!this.f67704k) {
                        if (!this.f67705l) {
                            if (!this.f67706m) {
                                if (this.f67711r != null) {
                                    this.f67702i = true;
                                    io.odeeo.internal.a2.s sVar = (io.odeeo.internal.a2.s) annotation;
                                    String strValue = sVar.value();
                                    a(i10, strValue);
                                    return new n.k(this.f67695b, i10, strValue, this.f67694a.stringConverter(type, annotationArr), sVar.encoded());
                                }
                                throw w.a(this.f67695b, i10, "@Path can only be used with relative url on @%s", this.f67707n);
                            }
                            throw w.a(this.f67695b, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw w.a(this.f67695b, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw w.a(this.f67695b, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw w.a(this.f67695b, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.t) {
                a(i10, type);
                io.odeeo.internal.a2.t tVar = (io.odeeo.internal.a2.t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> clsB = w.b(type);
                this.f67703j = true;
                if (Iterable.class.isAssignableFrom(clsB)) {
                    if (type instanceof ParameterizedType) {
                        return new n.l(strValue2, this.f67694a.stringConverter(w.b(0, (ParameterizedType) type), annotationArr), zEncoded).b();
                    }
                    throw w.a(this.f67695b, i10, clsB.getSimpleName() + " must include generic type (e.g., " + clsB.getSimpleName() + "<String>)", new Object[0]);
                }
                if (clsB.isArray()) {
                    return new n.l(strValue2, this.f67694a.stringConverter(a(clsB.getComponentType()), annotationArr), zEncoded).a();
                }
                return new n.l(strValue2, this.f67694a.stringConverter(type, annotationArr), zEncoded);
            }
            if (annotation instanceof io.odeeo.internal.a2.v) {
                a(i10, type);
                boolean zEncoded2 = ((io.odeeo.internal.a2.v) annotation).encoded();
                Class<?> clsB2 = w.b(type);
                this.f67704k = true;
                if (Iterable.class.isAssignableFrom(clsB2)) {
                    if (type instanceof ParameterizedType) {
                        return new n.C0694n(this.f67694a.stringConverter(w.b(0, (ParameterizedType) type), annotationArr), zEncoded2).b();
                    }
                    throw w.a(this.f67695b, i10, clsB2.getSimpleName() + " must include generic type (e.g., " + clsB2.getSimpleName() + "<String>)", new Object[0]);
                }
                if (clsB2.isArray()) {
                    return new n.C0694n(this.f67694a.stringConverter(a(clsB2.getComponentType()), annotationArr), zEncoded2).a();
                }
                return new n.C0694n(this.f67694a.stringConverter(type, annotationArr), zEncoded2);
            }
            if (annotation instanceof io.odeeo.internal.a2.u) {
                a(i10, type);
                Class<?> clsB3 = w.b(type);
                this.f67705l = true;
                if (Map.class.isAssignableFrom(clsB3)) {
                    Type typeB = w.b(type, clsB3, Map.class);
                    if (typeB instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) typeB;
                        Type typeB2 = w.b(0, parameterizedType);
                        if (String.class == typeB2) {
                            return new n.m(this.f67695b, i10, this.f67694a.stringConverter(w.b(1, parameterizedType), annotationArr), ((io.odeeo.internal.a2.u) annotation).encoded());
                        }
                        throw w.a(this.f67695b, i10, "@QueryMap keys must be of type String: " + typeB2, new Object[0]);
                    }
                    throw w.a(this.f67695b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw w.a(this.f67695b, i10, "@QueryMap parameter type must be Map.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.i) {
                a(i10, type);
                String strValue3 = ((io.odeeo.internal.a2.i) annotation).value();
                Class<?> clsB4 = w.b(type);
                if (Iterable.class.isAssignableFrom(clsB4)) {
                    if (type instanceof ParameterizedType) {
                        return new n.f(strValue3, this.f67694a.stringConverter(w.b(0, (ParameterizedType) type), annotationArr)).b();
                    }
                    throw w.a(this.f67695b, i10, clsB4.getSimpleName() + " must include generic type (e.g., " + clsB4.getSimpleName() + "<String>)", new Object[0]);
                }
                if (clsB4.isArray()) {
                    return new n.f(strValue3, this.f67694a.stringConverter(a(clsB4.getComponentType()), annotationArr)).a();
                }
                return new n.f(strValue3, this.f67694a.stringConverter(type, annotationArr));
            }
            if (annotation instanceof io.odeeo.internal.a2.j) {
                if (type == f0.class) {
                    return new n.h(this.f67695b, i10);
                }
                a(i10, type);
                Class<?> clsB5 = w.b(type);
                if (Map.class.isAssignableFrom(clsB5)) {
                    Type typeB3 = w.b(type, clsB5, Map.class);
                    if (typeB3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) typeB3;
                        Type typeB4 = w.b(0, parameterizedType2);
                        if (String.class == typeB4) {
                            return new n.g(this.f67695b, i10, this.f67694a.stringConverter(w.b(1, parameterizedType2), annotationArr));
                        }
                        throw w.a(this.f67695b, i10, "@HeaderMap keys must be of type String: " + typeB4, new Object[0]);
                    }
                    throw w.a(this.f67695b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw w.a(this.f67695b, i10, "@HeaderMap parameter type must be Map.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.c) {
                a(i10, type);
                if (this.f67709p) {
                    io.odeeo.internal.a2.c cVar = (io.odeeo.internal.a2.c) annotation;
                    String strValue4 = cVar.value();
                    boolean zEncoded3 = cVar.encoded();
                    this.f67699f = true;
                    Class<?> clsB6 = w.b(type);
                    if (Iterable.class.isAssignableFrom(clsB6)) {
                        if (type instanceof ParameterizedType) {
                            return new n.d(strValue4, this.f67694a.stringConverter(w.b(0, (ParameterizedType) type), annotationArr), zEncoded3).b();
                        }
                        throw w.a(this.f67695b, i10, clsB6.getSimpleName() + " must include generic type (e.g., " + clsB6.getSimpleName() + "<String>)", new Object[0]);
                    }
                    if (clsB6.isArray()) {
                        return new n.d(strValue4, this.f67694a.stringConverter(a(clsB6.getComponentType()), annotationArr), zEncoded3).a();
                    }
                    return new n.d(strValue4, this.f67694a.stringConverter(type, annotationArr), zEncoded3);
                }
                throw w.a(this.f67695b, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.d) {
                a(i10, type);
                if (this.f67709p) {
                    Class<?> clsB7 = w.b(type);
                    if (Map.class.isAssignableFrom(clsB7)) {
                        Type typeB5 = w.b(type, clsB7, Map.class);
                        if (typeB5 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) typeB5;
                            Type typeB6 = w.b(0, parameterizedType3);
                            if (String.class == typeB6) {
                                f fVarStringConverter = this.f67694a.stringConverter(w.b(1, parameterizedType3), annotationArr);
                                this.f67699f = true;
                                return new n.e(this.f67695b, i10, fVarStringConverter, ((io.odeeo.internal.a2.d) annotation).encoded());
                            }
                            throw w.a(this.f67695b, i10, "@FieldMap keys must be of type String: " + typeB6, new Object[0]);
                        }
                        throw w.a(this.f67695b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw w.a(this.f67695b, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw w.a(this.f67695b, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.q) {
                a(i10, type);
                if (this.f67710q) {
                    io.odeeo.internal.a2.q qVar = (io.odeeo.internal.a2.q) annotation;
                    this.f67700g = true;
                    String strValue5 = qVar.value();
                    Class<?> clsB8 = w.b(type);
                    if (strValue5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(clsB8)) {
                            if (type instanceof ParameterizedType) {
                                if (k0.c.class.isAssignableFrom(w.b(w.b(0, (ParameterizedType) type)))) {
                                    return n.o.f67660a.b();
                                }
                                throw w.a(this.f67695b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw w.a(this.f67695b, i10, clsB8.getSimpleName() + " must include generic type (e.g., " + clsB8.getSimpleName() + "<String>)", new Object[0]);
                        }
                        if (clsB8.isArray()) {
                            if (k0.c.class.isAssignableFrom(clsB8.getComponentType())) {
                                return n.o.f67660a.a();
                            }
                            throw w.a(this.f67695b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        if (k0.c.class.isAssignableFrom(clsB8)) {
                            return n.o.f67660a;
                        }
                        throw w.a(this.f67695b, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    f0 f0VarOf = f0.of("Content-Disposition", a.b.l("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar.encoding());
                    if (Iterable.class.isAssignableFrom(clsB8)) {
                        if (type instanceof ParameterizedType) {
                            Type typeB7 = w.b(0, (ParameterizedType) type);
                            if (!k0.c.class.isAssignableFrom(w.b(typeB7))) {
                                return new n.i(this.f67695b, i10, f0VarOf, this.f67694a.requestBodyConverter(typeB7, annotationArr, this.f67696c)).b();
                            }
                            throw w.a(this.f67695b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw w.a(this.f67695b, i10, clsB8.getSimpleName() + " must include generic type (e.g., " + clsB8.getSimpleName() + "<String>)", new Object[0]);
                    }
                    if (clsB8.isArray()) {
                        Class<?> clsA = a(clsB8.getComponentType());
                        if (!k0.c.class.isAssignableFrom(clsA)) {
                            return new n.i(this.f67695b, i10, f0VarOf, this.f67694a.requestBodyConverter(clsA, annotationArr, this.f67696c)).a();
                        }
                        throw w.a(this.f67695b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    if (!k0.c.class.isAssignableFrom(clsB8)) {
                        return new n.i(this.f67695b, i10, f0VarOf, this.f67694a.requestBodyConverter(type, annotationArr, this.f67696c));
                    }
                    throw w.a(this.f67695b, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                throw w.a(this.f67695b, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.r) {
                a(i10, type);
                if (this.f67710q) {
                    this.f67700g = true;
                    Class<?> clsB9 = w.b(type);
                    if (Map.class.isAssignableFrom(clsB9)) {
                        Type typeB8 = w.b(type, clsB9, Map.class);
                        if (typeB8 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) typeB8;
                            Type typeB9 = w.b(0, parameterizedType4);
                            if (String.class == typeB9) {
                                Type typeB10 = w.b(1, parameterizedType4);
                                if (!k0.c.class.isAssignableFrom(w.b(typeB10))) {
                                    return new n.j(this.f67695b, i10, this.f67694a.requestBodyConverter(typeB10, annotationArr, this.f67696c), ((io.odeeo.internal.a2.r) annotation).encoding());
                                }
                                throw w.a(this.f67695b, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw w.a(this.f67695b, i10, "@PartMap keys must be of type String: " + typeB9, new Object[0]);
                        }
                        throw w.a(this.f67695b, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw w.a(this.f67695b, i10, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw w.a(this.f67695b, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            }
            if (annotation instanceof io.odeeo.internal.a2.a) {
                a(i10, type);
                if (!this.f67709p && !this.f67710q) {
                    if (!this.f67701h) {
                        try {
                            f fVarRequestBodyConverter = this.f67694a.requestBodyConverter(type, annotationArr, this.f67696c);
                            this.f67701h = true;
                            return new n.c(this.f67695b, i10, fVarRequestBodyConverter);
                        } catch (RuntimeException e10) {
                            throw w.a(this.f67695b, e10, i10, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw w.a(this.f67695b, i10, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw w.a(this.f67695b, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            }
            if (!(annotation instanceof x)) {
                return null;
            }
            a(i10, type);
            Class<?> clsB10 = w.b(type);
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                n<?> nVar = this.f67715v[i11];
                if ((nVar instanceof n.q) && ((n.q) nVar).f67663a.equals(clsB10)) {
                    throw w.a(this.f67695b, i10, "@Tag type " + clsB10.getName() + " is duplicate of parameter #" + (i11 + 1) + " and would always overwrite its value.", new Object[0]);
                }
            }
            return new n.q(clsB10);
        }

        public final void a(int i10, Type type) {
            if (w.c(type)) {
                throw w.a(this.f67695b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        public final void a(int i10, String str) {
            if (f67693y.matcher(str).matches()) {
                if (!this.f67714u.contains(str)) {
                    throw w.a(this.f67695b, i10, "URL \"%s\" does not contain \"{%s}\".", this.f67711r, str);
                }
                return;
            }
            throw w.a(this.f67695b, i10, "@Path parameter name must match %s. Found: %s", f67692x.pattern(), str);
        }

        public static Set<String> a(String str) {
            Matcher matcher = f67692x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        public static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }
    }
}

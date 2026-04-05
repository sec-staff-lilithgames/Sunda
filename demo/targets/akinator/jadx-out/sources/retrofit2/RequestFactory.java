package retrofit2;

import com.ironsource.C3271ic;
import hx.b;
import hx.c;
import hx.e;
import hx.f;
import hx.g;
import hx.h;
import hx.i;
import hx.j;
import hx.k;
import hx.l;
import hx.m;
import hx.n;
import hx.o;
import hx.p;
import hx.q;
import hx.r;
import hx.s;
import hx.t;
import hx.u;
import hx.v;
import hx.x;
import hx.y;
import j1.o2;
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
import retrofit2.ParameterHandler;
import xv.f0;
import xv.g0;
import xv.j0;
import xv.k0;
import xv.o0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class RequestFactory {
    private final g0 baseUrl;
    private final j0 contentType;
    private final boolean hasBody;
    private final f0 headers;
    final String httpMethod;
    private final boolean isFormEncoded;
    final boolean isKotlinSuspendFunction;
    private final boolean isMultipart;
    private final Method method;
    private final ParameterHandler<?>[] parameterHandlers;
    private final String relativeUrl;
    private final Class<?> service;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Builder {
        j0 contentType;
        boolean gotBody;
        boolean gotField;
        boolean gotPart;
        boolean gotPath;
        boolean gotQuery;
        boolean gotQueryMap;
        boolean gotQueryName;
        boolean gotUrl;
        boolean hasBody;
        f0 headers;
        String httpMethod;
        boolean isFormEncoded;
        boolean isKotlinSuspendFunction;
        boolean isMultipart;
        final Method method;
        final Annotation[] methodAnnotations;
        final Annotation[][] parameterAnnotationsArray;
        ParameterHandler<?>[] parameterHandlers;
        final Type[] parameterTypes;
        String relativeUrl;
        Set<String> relativeUrlParamNames;
        final Retrofit retrofit;
        final Class<?> service;
        private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);

        public Builder(Retrofit retrofit, Class<?> cls, Method method) {
            this.retrofit = retrofit;
            this.service = cls;
            this.method = method;
            this.methodAnnotations = method.getAnnotations();
            this.parameterTypes = method.getGenericParameterTypes();
            this.parameterAnnotationsArray = method.getParameterAnnotations();
        }

        private static Class<?> boxIfPrimitive(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private f0 parseHeaders(String[] strArr, boolean z10) {
            f0.a aVar = new f0.a();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw Utils.methodError(this.method, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    try {
                        this.contentType = j0.get(strTrim);
                    } catch (IllegalArgumentException e10) {
                        throw Utils.methodError(this.method, e10, "Malformed content type: %s", strTrim);
                    }
                } else if (z10) {
                    aVar.addUnsafeNonAscii(strSubstring, strTrim);
                } else {
                    aVar.add(strSubstring, strTrim);
                }
            }
            return aVar.build();
        }

        private void parseHttpMethodAndPath(String str, String str2, boolean z10) {
            String str3 = this.httpMethod;
            if (str3 != null) {
                throw Utils.methodError(this.method, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.httpMethod = str;
            this.hasBody = z10;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (PARAM_URL_REGEX.matcher(strSubstring).find()) {
                    throw Utils.methodError(this.method, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.relativeUrl = str2;
            this.relativeUrlParamNames = parsePathParameters(str2);
        }

        private void parseMethodAnnotation(Annotation annotation) {
            if (annotation instanceof b) {
                parseHttpMethodAndPath("DELETE", ((b) annotation).value(), false);
                return;
            }
            if (annotation instanceof f) {
                parseHttpMethodAndPath(C3271ic.f36943a, ((f) annotation).value(), false);
                return;
            }
            if (annotation instanceof g) {
                parseHttpMethodAndPath("HEAD", ((g) annotation).value(), false);
                return;
            }
            if (annotation instanceof n) {
                parseHttpMethodAndPath("PATCH", ((n) annotation).value(), true);
                return;
            }
            if (annotation instanceof o) {
                parseHttpMethodAndPath(C3271ic.f36944b, ((o) annotation).value(), true);
                return;
            }
            if (annotation instanceof p) {
                parseHttpMethodAndPath("PUT", ((p) annotation).value(), true);
                return;
            }
            if (annotation instanceof m) {
                parseHttpMethodAndPath("OPTIONS", ((m) annotation).value(), false);
                return;
            }
            if (annotation instanceof h) {
                h hVar = (h) annotation;
                parseHttpMethodAndPath(hVar.method(), hVar.path(), hVar.hasBody());
                return;
            }
            if (annotation instanceof k) {
                k kVar = (k) annotation;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw Utils.methodError(this.method, "@Headers annotation is empty.", new Object[0]);
                }
                this.headers = parseHeaders(strArrValue, kVar.allowUnsafeNonAsciiValues());
                return;
            }
            if (annotation instanceof l) {
                if (this.isFormEncoded) {
                    throw Utils.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isMultipart = true;
            } else if (annotation instanceof e) {
                if (this.isMultipart) {
                    throw Utils.methodError(this.method, "Only one encoding annotation is allowed.", new Object[0]);
                }
                this.isFormEncoded = true;
            }
        }

        private ParameterHandler<?> parseParameter(int i10, Type type, Annotation[] annotationArr, boolean z10) {
            ParameterHandler<?> parameterHandler;
            if (annotationArr != null) {
                parameterHandler = null;
                for (Annotation annotation : annotationArr) {
                    ParameterHandler<?> parameterAnnotation = parseParameterAnnotation(i10, type, annotationArr, annotation);
                    if (parameterAnnotation != null) {
                        if (parameterHandler != null) {
                            throw Utils.parameterError(this.method, i10, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        parameterHandler = parameterAnnotation;
                    }
                }
            } else {
                parameterHandler = null;
            }
            if (parameterHandler != null) {
                return parameterHandler;
            }
            if (z10) {
                try {
                    if (Utils.getRawType(type) == d.class) {
                        this.isKotlinSuspendFunction = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw Utils.parameterError(this.method, i10, "No Retrofit annotation found.", new Object[0]);
        }

        private ParameterHandler<?> parseParameterAnnotation(int i10, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof y) {
                validateResolvableType(i10, type);
                if (this.gotUrl) {
                    throw Utils.parameterError(this.method, i10, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.gotPath) {
                    throw Utils.parameterError(this.method, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.gotQuery) {
                    throw Utils.parameterError(this.method, i10, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw Utils.parameterError(this.method, i10, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw Utils.parameterError(this.method, i10, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.relativeUrl != null) {
                    throw Utils.parameterError(this.method, i10, "@Url cannot be used with @%s URL", this.httpMethod);
                }
                this.gotUrl = true;
                if (type == g0.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                    return new ParameterHandler.RelativeUrl(this.method, i10);
                }
                throw Utils.parameterError(this.method, i10, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
            }
            if (annotation instanceof s) {
                validateResolvableType(i10, type);
                if (this.gotQuery) {
                    throw Utils.parameterError(this.method, i10, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.gotQueryName) {
                    throw Utils.parameterError(this.method, i10, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.gotQueryMap) {
                    throw Utils.parameterError(this.method, i10, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.gotUrl) {
                    throw Utils.parameterError(this.method, i10, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.relativeUrl == null) {
                    throw Utils.parameterError(this.method, i10, "@Path can only be used with relative url on @%s", this.httpMethod);
                }
                this.gotPath = true;
                s sVar = (s) annotation;
                String strValue = sVar.value();
                validatePathName(i10, strValue);
                return new ParameterHandler.Path(this.method, i10, strValue, this.retrofit.stringConverter(type, annotationArr), sVar.encoded());
            }
            if (annotation instanceof t) {
                validateResolvableType(i10, type);
                t tVar = (t) annotation;
                String strValue2 = tVar.value();
                boolean zEncoded = tVar.encoded();
                Class<?> rawType = Utils.getRawType(type);
                this.gotQuery = true;
                if (!Iterable.class.isAssignableFrom(rawType)) {
                    if (!rawType.isArray()) {
                        return new ParameterHandler.Query(strValue2, this.retrofit.stringConverter(type, annotationArr), zEncoded);
                    }
                    return new ParameterHandler.Query(strValue2, this.retrofit.stringConverter(boxIfPrimitive(rawType.getComponentType()), annotationArr), zEncoded).array();
                }
                if (type instanceof ParameterizedType) {
                    return new ParameterHandler.Query(strValue2, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), zEncoded).iterable();
                }
                throw Utils.parameterError(this.method, i10, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof v) {
                validateResolvableType(i10, type);
                boolean zEncoded2 = ((v) annotation).encoded();
                Class<?> rawType2 = Utils.getRawType(type);
                this.gotQueryName = true;
                if (!Iterable.class.isAssignableFrom(rawType2)) {
                    if (!rawType2.isArray()) {
                        return new ParameterHandler.QueryName(this.retrofit.stringConverter(type, annotationArr), zEncoded2);
                    }
                    return new ParameterHandler.QueryName(this.retrofit.stringConverter(boxIfPrimitive(rawType2.getComponentType()), annotationArr), zEncoded2).array();
                }
                if (type instanceof ParameterizedType) {
                    return new ParameterHandler.QueryName(this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), zEncoded2).iterable();
                }
                throw Utils.parameterError(this.method, i10, rawType2.getSimpleName() + " must include generic type (e.g., " + rawType2.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof u) {
                validateResolvableType(i10, type);
                Class<?> rawType3 = Utils.getRawType(type);
                this.gotQueryMap = true;
                if (!Map.class.isAssignableFrom(rawType3)) {
                    throw Utils.parameterError(this.method, i10, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type supertype = Utils.getSupertype(type, rawType3, Map.class);
                if (!(supertype instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) supertype;
                Type parameterUpperBound = Utils.getParameterUpperBound(0, parameterizedType);
                if (String.class == parameterUpperBound) {
                    return new ParameterHandler.QueryMap(this.method, i10, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType), annotationArr), ((u) annotation).encoded());
                }
                throw Utils.parameterError(this.method, i10, "@QueryMap keys must be of type String: " + parameterUpperBound, new Object[0]);
            }
            if (annotation instanceof i) {
                validateResolvableType(i10, type);
                i iVar = (i) annotation;
                String strValue3 = iVar.value();
                Class<?> rawType4 = Utils.getRawType(type);
                if (!Iterable.class.isAssignableFrom(rawType4)) {
                    if (!rawType4.isArray()) {
                        return new ParameterHandler.Header(strValue3, this.retrofit.stringConverter(type, annotationArr), iVar.allowUnsafeNonAsciiValues());
                    }
                    return new ParameterHandler.Header(strValue3, this.retrofit.stringConverter(boxIfPrimitive(rawType4.getComponentType()), annotationArr), iVar.allowUnsafeNonAsciiValues()).array();
                }
                if (type instanceof ParameterizedType) {
                    return new ParameterHandler.Header(strValue3, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), iVar.allowUnsafeNonAsciiValues()).iterable();
                }
                throw Utils.parameterError(this.method, i10, rawType4.getSimpleName() + " must include generic type (e.g., " + rawType4.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof j) {
                if (type == f0.class) {
                    return new ParameterHandler.Headers(this.method, i10);
                }
                validateResolvableType(i10, type);
                Class<?> rawType5 = Utils.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType5)) {
                    throw Utils.parameterError(this.method, i10, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                }
                Type supertype2 = Utils.getSupertype(type, rawType5, Map.class);
                if (!(supertype2 instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) supertype2;
                Type parameterUpperBound2 = Utils.getParameterUpperBound(0, parameterizedType2);
                if (String.class == parameterUpperBound2) {
                    return new ParameterHandler.HeaderMap(this.method, i10, this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType2), annotationArr), ((j) annotation).allowUnsafeNonAsciiValues());
                }
                throw Utils.parameterError(this.method, i10, "@HeaderMap keys must be of type String: " + parameterUpperBound2, new Object[0]);
            }
            if (annotation instanceof c) {
                validateResolvableType(i10, type);
                if (!this.isFormEncoded) {
                    throw Utils.parameterError(this.method, i10, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                c cVar = (c) annotation;
                String strValue4 = cVar.value();
                boolean zEncoded3 = cVar.encoded();
                this.gotField = true;
                Class<?> rawType6 = Utils.getRawType(type);
                if (!Iterable.class.isAssignableFrom(rawType6)) {
                    if (!rawType6.isArray()) {
                        return new ParameterHandler.Field(strValue4, this.retrofit.stringConverter(type, annotationArr), zEncoded3);
                    }
                    return new ParameterHandler.Field(strValue4, this.retrofit.stringConverter(boxIfPrimitive(rawType6.getComponentType()), annotationArr), zEncoded3).array();
                }
                if (type instanceof ParameterizedType) {
                    return new ParameterHandler.Field(strValue4, this.retrofit.stringConverter(Utils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr), zEncoded3).iterable();
                }
                throw Utils.parameterError(this.method, i10, rawType6.getSimpleName() + " must include generic type (e.g., " + rawType6.getSimpleName() + "<String>)", new Object[0]);
            }
            if (annotation instanceof hx.d) {
                validateResolvableType(i10, type);
                if (!this.isFormEncoded) {
                    throw Utils.parameterError(this.method, i10, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> rawType7 = Utils.getRawType(type);
                if (!Map.class.isAssignableFrom(rawType7)) {
                    throw Utils.parameterError(this.method, i10, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type supertype3 = Utils.getSupertype(type, rawType7, Map.class);
                if (!(supertype3 instanceof ParameterizedType)) {
                    throw Utils.parameterError(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) supertype3;
                Type parameterUpperBound3 = Utils.getParameterUpperBound(0, parameterizedType3);
                if (String.class == parameterUpperBound3) {
                    Converter converterStringConverter = this.retrofit.stringConverter(Utils.getParameterUpperBound(1, parameterizedType3), annotationArr);
                    this.gotField = true;
                    return new ParameterHandler.FieldMap(this.method, i10, converterStringConverter, ((hx.d) annotation).encoded());
                }
                throw Utils.parameterError(this.method, i10, "@FieldMap keys must be of type String: " + parameterUpperBound3, new Object[0]);
            }
            if (!(annotation instanceof q)) {
                if (annotation instanceof r) {
                    validateResolvableType(i10, type);
                    if (!this.isMultipart) {
                        throw Utils.parameterError(this.method, i10, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                    }
                    this.gotPart = true;
                    Class<?> rawType8 = Utils.getRawType(type);
                    if (!Map.class.isAssignableFrom(rawType8)) {
                        throw Utils.parameterError(this.method, i10, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    Type supertype4 = Utils.getSupertype(type, rawType8, Map.class);
                    if (!(supertype4 instanceof ParameterizedType)) {
                        throw Utils.parameterError(this.method, i10, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    ParameterizedType parameterizedType4 = (ParameterizedType) supertype4;
                    Type parameterUpperBound4 = Utils.getParameterUpperBound(0, parameterizedType4);
                    if (String.class != parameterUpperBound4) {
                        throw Utils.parameterError(this.method, i10, "@PartMap keys must be of type String: " + parameterUpperBound4, new Object[0]);
                    }
                    Type parameterUpperBound5 = Utils.getParameterUpperBound(1, parameterizedType4);
                    if (k0.c.class.isAssignableFrom(Utils.getRawType(parameterUpperBound5))) {
                        throw Utils.parameterError(this.method, i10, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new ParameterHandler.PartMap(this.method, i10, this.retrofit.requestBodyConverter(parameterUpperBound5, annotationArr, this.methodAnnotations), ((r) annotation).encoding());
                }
                if (annotation instanceof hx.a) {
                    validateResolvableType(i10, type);
                    if (this.isFormEncoded || this.isMultipart) {
                        throw Utils.parameterError(this.method, i10, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    }
                    if (this.gotBody) {
                        throw Utils.parameterError(this.method, i10, "Multiple @Body method annotations found.", new Object[0]);
                    }
                    try {
                        Converter converterRequestBodyConverter = this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations);
                        this.gotBody = true;
                        return new ParameterHandler.Body(this.method, i10, converterRequestBodyConverter);
                    } catch (RuntimeException e10) {
                        throw Utils.parameterError(this.method, e10, i10, "Unable to create @Body converter for %s", type);
                    }
                }
                if (!(annotation instanceof x)) {
                    return null;
                }
                validateResolvableType(i10, type);
                Class<?> clsBoxIfPrimitive = boxIfPrimitive(Utils.getRawType(type));
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    ParameterHandler<?> parameterHandler = this.parameterHandlers[i11];
                    if ((parameterHandler instanceof ParameterHandler.Tag) && ((ParameterHandler.Tag) parameterHandler).cls.equals(clsBoxIfPrimitive)) {
                        Method method = this.method;
                        StringBuilder sb2 = new StringBuilder("@Tag type ");
                        a.b.z(clsBoxIfPrimitive, sb2, " is duplicate of ");
                        throw Utils.parameterError(method, i10, o2.o(sb2, Platform.reflection.describeMethodParameter(this.method, i11), " and would always overwrite its value."), new Object[0]);
                    }
                }
                return new ParameterHandler.Tag(clsBoxIfPrimitive);
            }
            validateResolvableType(i10, type);
            if (!this.isMultipart) {
                throw Utils.parameterError(this.method, i10, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            }
            q qVar = (q) annotation;
            this.gotPart = true;
            String strValue5 = qVar.value();
            Class<?> rawType9 = Utils.getRawType(type);
            if (strValue5.isEmpty()) {
                if (!Iterable.class.isAssignableFrom(rawType9)) {
                    if (rawType9.isArray()) {
                        if (k0.c.class.isAssignableFrom(rawType9.getComponentType())) {
                            return ParameterHandler.RawPart.INSTANCE.array();
                        }
                        throw Utils.parameterError(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                    if (k0.c.class.isAssignableFrom(rawType9)) {
                        return ParameterHandler.RawPart.INSTANCE;
                    }
                    throw Utils.parameterError(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                if (type instanceof ParameterizedType) {
                    if (k0.c.class.isAssignableFrom(Utils.getRawType(Utils.getParameterUpperBound(0, (ParameterizedType) type)))) {
                        return ParameterHandler.RawPart.INSTANCE.iterable();
                    }
                    throw Utils.parameterError(this.method, i10, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                }
                throw Utils.parameterError(this.method, i10, rawType9.getSimpleName() + " must include generic type (e.g., " + rawType9.getSimpleName() + "<String>)", new Object[0]);
            }
            f0 f0VarOf = f0.of("Content-Disposition", a.b.l("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar.encoding());
            if (!Iterable.class.isAssignableFrom(rawType9)) {
                if (!rawType9.isArray()) {
                    if (k0.c.class.isAssignableFrom(rawType9)) {
                        throw Utils.parameterError(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new ParameterHandler.Part(this.method, i10, f0VarOf, this.retrofit.requestBodyConverter(type, annotationArr, this.methodAnnotations));
                }
                Class<?> clsBoxIfPrimitive2 = boxIfPrimitive(rawType9.getComponentType());
                if (k0.c.class.isAssignableFrom(clsBoxIfPrimitive2)) {
                    throw Utils.parameterError(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new ParameterHandler.Part(this.method, i10, f0VarOf, this.retrofit.requestBodyConverter(clsBoxIfPrimitive2, annotationArr, this.methodAnnotations)).array();
            }
            if (type instanceof ParameterizedType) {
                Type parameterUpperBound6 = Utils.getParameterUpperBound(0, (ParameterizedType) type);
                if (k0.c.class.isAssignableFrom(Utils.getRawType(parameterUpperBound6))) {
                    throw Utils.parameterError(this.method, i10, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new ParameterHandler.Part(this.method, i10, f0VarOf, this.retrofit.requestBodyConverter(parameterUpperBound6, annotationArr, this.methodAnnotations)).iterable();
            }
            throw Utils.parameterError(this.method, i10, rawType9.getSimpleName() + " must include generic type (e.g., " + rawType9.getSimpleName() + "<String>)", new Object[0]);
        }

        public static Set<String> parsePathParameters(String str) {
            Matcher matcher = PARAM_URL_REGEX.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void validatePathName(int i10, String str) {
            if (!PARAM_NAME_REGEX.matcher(str).matches()) {
                throw Utils.parameterError(this.method, i10, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
            }
            if (!this.relativeUrlParamNames.contains(str)) {
                throw Utils.parameterError(this.method, i10, "URL \"%s\" does not contain \"{%s}\".", this.relativeUrl, str);
            }
        }

        private void validateResolvableType(int i10, Type type) {
            if (Utils.hasUnresolvableType(type)) {
                throw Utils.parameterError(this.method, i10, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        public RequestFactory build() {
            for (Annotation annotation : this.methodAnnotations) {
                parseMethodAnnotation(annotation);
            }
            if (this.httpMethod == null) {
                throw Utils.methodError(this.method, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.hasBody) {
                if (this.isMultipart) {
                    throw Utils.methodError(this.method, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
                if (this.isFormEncoded) {
                    throw Utils.methodError(this.method, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                }
            }
            int length = this.parameterAnnotationsArray.length;
            this.parameterHandlers = new ParameterHandler[length];
            int i10 = length - 1;
            int i11 = 0;
            while (i11 < length) {
                this.parameterHandlers[i11] = parseParameter(i11, this.parameterTypes[i11], this.parameterAnnotationsArray[i11], i11 == i10);
                i11++;
            }
            if (this.relativeUrl == null && !this.gotUrl) {
                throw Utils.methodError(this.method, "Missing either @%s URL or @Url parameter.", this.httpMethod);
            }
            boolean z10 = this.isFormEncoded;
            if (!z10 && !this.isMultipart && !this.hasBody && this.gotBody) {
                throw Utils.methodError(this.method, "Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z10 && !this.gotField) {
                throw Utils.methodError(this.method, "Form-encoded method must contain at least one @Field.", new Object[0]);
            }
            if (!this.isMultipart || this.gotPart) {
                return new RequestFactory(this);
            }
            throw Utils.methodError(this.method, "Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    public RequestFactory(Builder builder) {
        this.service = builder.service;
        this.method = builder.method;
        this.baseUrl = builder.retrofit.baseUrl;
        this.httpMethod = builder.httpMethod;
        this.relativeUrl = builder.relativeUrl;
        this.headers = builder.headers;
        this.contentType = builder.contentType;
        this.hasBody = builder.hasBody;
        this.isFormEncoded = builder.isFormEncoded;
        this.isMultipart = builder.isMultipart;
        this.parameterHandlers = builder.parameterHandlers;
        this.isKotlinSuspendFunction = builder.isKotlinSuspendFunction;
    }

    public static RequestFactory parseAnnotations(Retrofit retrofit, Class<?> cls, Method method) {
        return new Builder(retrofit, cls, method).build();
    }

    public o0 create(Object obj, Object[] objArr) throws IOException {
        ParameterHandler<?>[] parameterHandlerArr = this.parameterHandlers;
        int length = objArr.length;
        if (length != parameterHandlerArr.length) {
            throw new IllegalArgumentException(a.b.f(parameterHandlerArr.length, ")", p0.o2.t(length, "Argument count (", ") doesn't match expected count (")));
        }
        RequestBuilder requestBuilder = new RequestBuilder(this.httpMethod, this.baseUrl, this.relativeUrl, this.headers, this.contentType, this.hasBody, this.isFormEncoded, this.isMultipart);
        if (this.isKotlinSuspendFunction) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(objArr[i10]);
            parameterHandlerArr[i10].apply(requestBuilder, objArr[i10]);
        }
        return requestBuilder.get().tag((Class<? super Class>) Invocation.class, (Class) new Invocation(this.service, obj, this.method, arrayList)).build();
    }
}

package retrofit2;

import a.b;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import j1.o2;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import xv.f0;
import xv.k0;
import xv.u0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
abstract class ParameterHandler<T> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Body<T> extends ParameterHandler<T> {
        private final Converter<T, u0> converter;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f84300p;

        public Body(Method method, int i10, Converter<T, u0> converter) {
            this.method = method;
            this.f84300p = i10;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t10) {
            if (t10 == null) {
                throw Utils.parameterError(this.method, this.f84300p, "Body parameter value must not be null.", new Object[0]);
            }
            try {
                requestBuilder.setBody(this.converter.convert(t10));
            } catch (IOException e10) {
                throw Utils.parameterError(this.method, e10, this.f84300p, o2.k(t10, "Unable to convert ", " to RequestBody"), new Object[0]);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Field<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Field(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addFormField(this.name, strConvert, this.encoded);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class FieldMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f84301p;
        private final Converter<T, String> valueConverter;

        public FieldMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f84301p = i10;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f84301p, "Field map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f84301p, "Field map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f84301p, b.l("Field map contained null value for key '", key, "'."), new Object[0]);
                }
                String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw Utils.parameterError(this.method, this.f84301p, "Field map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addFormField(key, strConvert, this.encoded);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Header<T> extends ParameterHandler<T> {
        private final boolean allowUnsafeNonAsciiValues;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Header(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.allowUnsafeNonAsciiValues = z10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addHeader(this.name, strConvert, this.allowUnsafeNonAsciiValues);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class HeaderMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean allowUnsafeNonAsciiValues;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f84302p;
        private final Converter<T, String> valueConverter;

        public HeaderMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f84302p = i10;
            this.valueConverter = converter;
            this.allowUnsafeNonAsciiValues = z10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f84302p, "Header map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f84302p, "Header map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f84302p, b.l("Header map contained null value for key '", key, "'."), new Object[0]);
                }
                requestBuilder.addHeader(key, this.valueConverter.convert(value), this.allowUnsafeNonAsciiValues);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Headers extends ParameterHandler<f0> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f84303p;

        public Headers(Method method, int i10) {
            this.method = method;
            this.f84303p = i10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, f0 f0Var) {
            if (f0Var == null) {
                throw Utils.parameterError(this.method, this.f84303p, "Headers parameter must not be null.", new Object[0]);
            }
            requestBuilder.addHeaders(f0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Part<T> extends ParameterHandler<T> {
        private final Converter<T, u0> converter;
        private final f0 headers;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f84304p;

        public Part(Method method, int i10, f0 f0Var, Converter<T, u0> converter) {
            this.method = method;
            this.f84304p = i10;
            this.headers = f0Var;
            this.converter = converter;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t10) {
            if (t10 == null) {
                return;
            }
            try {
                requestBuilder.addPart(this.headers, this.converter.convert(t10));
            } catch (IOException e10) {
                throw Utils.parameterError(this.method, this.f84304p, o2.k(t10, "Unable to convert ", " to RequestBody"), e10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class PartMap<T> extends ParameterHandler<Map<String, T>> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f84305p;
        private final String transferEncoding;
        private final Converter<T, u0> valueConverter;

        public PartMap(Method method, int i10, Converter<T, u0> converter, String str) {
            this.method = method;
            this.f84305p = i10;
            this.valueConverter = converter;
            this.transferEncoding = str;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f84305p, "Part map was null.", new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f84305p, "Part map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f84305p, b.l("Part map contained null value for key '", key, "'."), new Object[0]);
                }
                requestBuilder.addPart(f0.of("Content-Disposition", b.l("form-data; name=\"", key, "\""), "Content-Transfer-Encoding", this.transferEncoding), this.valueConverter.convert(value));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Path<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Method method;
        private final String name;

        /* renamed from: p, reason: collision with root package name */
        private final int f84306p;
        private final Converter<T, String> valueConverter;

        public Path(Method method, int i10, String str, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f84306p = i10;
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            if (t10 == null) {
                throw Utils.parameterError(this.method, this.f84306p, o2.o(new StringBuilder("Path parameter \""), this.name, "\" value must not be null."), new Object[0]);
            }
            requestBuilder.addPathParam(this.name, this.valueConverter.convert(t10), this.encoded);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Query<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final String name;
        private final Converter<T, String> valueConverter;

        public Query(String str, Converter<T, String> converter, boolean z10) {
            Objects.requireNonNull(str, "name == null");
            this.name = str;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            String strConvert;
            if (t10 == null || (strConvert = this.valueConverter.convert(t10)) == null) {
                return;
            }
            requestBuilder.addQueryParam(this.name, strConvert, this.encoded);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class QueryMap<T> extends ParameterHandler<Map<String, T>> {
        private final boolean encoded;
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f84307p;
        private final Converter<T, String> valueConverter;

        public QueryMap(Method method, int i10, Converter<T, String> converter, boolean z10) {
            this.method = method;
            this.f84307p = i10;
            this.valueConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Map<String, T> map) throws IOException {
            if (map == null) {
                throw Utils.parameterError(this.method, this.f84307p, LJjmO.XOjJa, new Object[0]);
            }
            for (Map.Entry<String, T> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key == null) {
                    throw Utils.parameterError(this.method, this.f84307p, "Query map contained null key.", new Object[0]);
                }
                T value = entry.getValue();
                if (value == null) {
                    throw Utils.parameterError(this.method, this.f84307p, b.l("Query map contained null value for key '", key, "'."), new Object[0]);
                }
                String strConvert = this.valueConverter.convert(value);
                if (strConvert == null) {
                    throw Utils.parameterError(this.method, this.f84307p, "Query map value '" + value + "' converted to null by " + this.valueConverter.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                }
                requestBuilder.addQueryParam(key, strConvert, this.encoded);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class QueryName<T> extends ParameterHandler<T> {
        private final boolean encoded;
        private final Converter<T, String> nameConverter;

        public QueryName(Converter<T, String> converter, boolean z10) {
            this.nameConverter = converter;
            this.encoded = z10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t10) throws IOException {
            if (t10 == null) {
                return;
            }
            requestBuilder.addQueryParam(this.nameConverter.convert(t10), null, this.encoded);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class RawPart extends ParameterHandler<k0.c> {
        static final RawPart INSTANCE = new RawPart();

        private RawPart() {
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, k0.c cVar) {
            if (cVar != null) {
                requestBuilder.addPart(cVar);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class RelativeUrl extends ParameterHandler<Object> {
        private final Method method;

        /* renamed from: p, reason: collision with root package name */
        private final int f84308p;

        public RelativeUrl(Method method, int i10) {
            this.method = method;
            this.f84308p = i10;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, Object obj) {
            if (obj == null) {
                throw Utils.parameterError(this.method, this.f84308p, "@Url parameter is null.", new Object[0]);
            }
            requestBuilder.setRelativeUrl(obj);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Tag<T> extends ParameterHandler<T> {
        final Class<T> cls;

        public Tag(Class<T> cls) {
            this.cls = cls;
        }

        @Override // retrofit2.ParameterHandler
        public void apply(RequestBuilder requestBuilder, T t10) {
            requestBuilder.addTag(this.cls, t10);
        }
    }

    public abstract void apply(RequestBuilder requestBuilder, T t10) throws IOException;

    public final ParameterHandler<Object> array() {
        return new ParameterHandler<Object>() { // from class: retrofit2.ParameterHandler.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, Object obj) throws IOException {
                if (obj == null) {
                    return;
                }
                int length = Array.getLength(obj);
                for (int i10 = 0; i10 < length; i10++) {
                    ParameterHandler.this.apply(requestBuilder, Array.get(obj, i10));
                }
            }
        };
    }

    public final ParameterHandler<Iterable<T>> iterable() {
        return new ParameterHandler<Iterable<T>>() { // from class: retrofit2.ParameterHandler.1
            @Override // retrofit2.ParameterHandler
            public void apply(RequestBuilder requestBuilder, Iterable<T> iterable) throws IOException {
                if (iterable == null) {
                    return;
                }
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    ParameterHandler.this.apply(requestBuilder, it.next());
                }
            }
        };
    }
}

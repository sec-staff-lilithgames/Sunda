package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Gson {
    static final boolean DEFAULT_COMPLEX_MAP_KEYS = false;
    static final boolean DEFAULT_ESCAPE_HTML = true;
    static final boolean DEFAULT_JSON_NON_EXECUTABLE = false;
    static final boolean DEFAULT_SERIALIZE_NULLS = false;
    static final boolean DEFAULT_SPECIALIZE_FLOAT_VALUES = false;
    static final c0 DEFAULT_STRICTNESS = null;
    static final boolean DEFAULT_USE_JDK_UNSAFE = true;
    private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";
    final List<l0> builderFactories;
    final List<l0> builderHierarchyFactories;
    final boolean complexMapKeySerialization;
    private final mk.b constructorConstructor;
    final String datePattern;
    final int dateStyle;
    final Excluder excluder;
    final List<l0> factories;
    final FieldNamingStrategy fieldNamingStrategy;
    final k formattingStyle;
    final boolean generateNonExecutableJson;
    final boolean htmlSafe;
    final Map<Type, Object> instanceCreators;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;
    final z longSerializationPolicy;
    final i0 numberToNumberStrategy;
    final i0 objectToNumberStrategy;
    final List<b0> reflectionFilters;
    final boolean serializeNulls;
    final boolean serializeSpecialFloatingPointValues;
    final c0 strictness;
    private final ThreadLocal<Map<pk.a<?>, k0>> threadLocalAdapterResults;
    final int timeStyle;
    private final ConcurrentMap<pk.a<?>, k0> typeTokenCache;
    final boolean useJdkUnsafe;
    static final k DEFAULT_FORMATTING_STYLE = k.f30059d;
    static final String DEFAULT_DATE_PATTERN = null;
    static final FieldNamingStrategy DEFAULT_FIELD_NAMING_STRATEGY = j.f30056b;
    static final i0 DEFAULT_OBJECT_TO_NUMBER_STRATEGY = h0.f29919b;
    static final i0 DEFAULT_NUMBER_TO_NUMBER_STRATEGY = h0.f29920c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends k0 {
        @Override // com.google.gson.k0
        public Number read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Long.valueOf(jsonReader.nextLong());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // com.google.gson.k0
        public void write(JsonWriter jsonWriter, Number number) throws IOException {
            if (number == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(number.toString());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends com.google.gson.internal.bind.x {

        /* renamed from: a, reason: collision with root package name */
        public k0 f29909a = null;

        @Override // com.google.gson.internal.bind.x
        public k0 getSerializationDelegate() {
            k0 k0Var = this.f29909a;
            if (k0Var != null) {
                return k0Var;
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        @Override // com.google.gson.k0
        public Object read(JsonReader jsonReader) throws IOException {
            k0 k0Var = this.f29909a;
            if (k0Var != null) {
                return k0Var.read(jsonReader);
            }
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }

        public void setDelegate(k0 k0Var) {
            if (this.f29909a != null) {
                throw new AssertionError("Delegate is already set");
            }
            this.f29909a = k0Var;
        }

        @Override // com.google.gson.k0
        public void write(JsonWriter jsonWriter, Object obj) throws IOException {
            k0 k0Var = this.f29909a;
            if (k0Var == null) {
                throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
            }
            k0Var.write(jsonWriter, obj);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Gson() {
        Excluder excluder = Excluder.f29922i;
        FieldNamingStrategy fieldNamingStrategy = DEFAULT_FIELD_NAMING_STRATEGY;
        Map map = Collections.EMPTY_MAP;
        k kVar = DEFAULT_FORMATTING_STYLE;
        c0 c0Var = DEFAULT_STRICTNESS;
        String str = DEFAULT_DATE_PATTERN;
        List list = Collections.EMPTY_LIST;
        this(excluder, fieldNamingStrategy, map, false, false, false, true, kVar, c0Var, false, true, z.f30071b, str, 2, 2, list, list, list, DEFAULT_OBJECT_TO_NUMBER_STRATEGY, DEFAULT_NUMBER_TO_NUMBER_STRATEGY, list);
    }

    private static void assertFullConsumption(Object obj, JsonReader jsonReader) {
        if (obj != null) {
            try {
                if (jsonReader.peek() == JsonToken.END_DOCUMENT) {
                } else {
                    throw new w("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e10) {
                throw new w(e10);
            } catch (IOException e11) {
                throw new r(e11);
            }
        }
    }

    private static k0 atomicLongAdapter(k0 k0Var) {
        return new n(k0Var).nullSafe();
    }

    private static k0 atomicLongArrayAdapter(k0 k0Var) {
        return new o(k0Var).nullSafe();
    }

    public static void checkValidFloatingPoint(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private k0 doubleAdapter(boolean z10) {
        return z10 ? TypeAdapters.f29957m : new l();
    }

    private k0 floatAdapter(boolean z10) {
        return z10 ? TypeAdapters.f29956l : new m();
    }

    private static k0 longAdapter(z zVar) {
        return zVar == z.f30071b ? TypeAdapters.f29955k : new a();
    }

    @Deprecated
    public Excluder excluder() {
        return this.excluder;
    }

    public FieldNamingStrategy fieldNamingStrategy() {
        return this.fieldNamingStrategy;
    }

    public <T> T fromJson(String str, Class<T> cls) throws w {
        return (T) fromJson(str, pk.a.get((Class) cls));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        r2.setDelegate(r4);
        r0.put(r7, r4);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> com.google.gson.k0 getAdapter(pk.a<T> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentMap<pk.a<?>, com.google.gson.k0> r0 = r6.typeTokenCache
            java.lang.Object r0 = r0.get(r7)
            com.google.gson.k0 r0 = (com.google.gson.k0) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            java.lang.ThreadLocal<java.util.Map<pk.a<?>, com.google.gson.k0>> r0 = r6.threadLocalAdapterResults
            java.lang.Object r0 = r0.get()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L26
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.ThreadLocal<java.util.Map<pk.a<?>, com.google.gson.k0>> r1 = r6.threadLocalAdapterResults
            r1.set(r0)
            r1 = 1
            goto L30
        L26:
            java.lang.Object r1 = r0.get(r7)
            com.google.gson.k0 r1 = (com.google.gson.k0) r1
            if (r1 == 0) goto L2f
            return r1
        L2f:
            r1 = 0
        L30:
            com.google.gson.Gson$b r2 = new com.google.gson.Gson$b     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r2)     // Catch: java.lang.Throwable -> L58
            java.util.List<com.google.gson.l0> r3 = r6.factories     // Catch: java.lang.Throwable -> L58
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L58
            r4 = 0
        L3f:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L5a
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L58
            com.google.gson.l0 r4 = (com.google.gson.l0) r4     // Catch: java.lang.Throwable -> L58
            com.google.gson.k0 r4 = r4.create(r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L3f
            r2.setDelegate(r4)     // Catch: java.lang.Throwable -> L58
            r0.put(r7, r4)     // Catch: java.lang.Throwable -> L58
            goto L5a
        L58:
            r7 = move-exception
            goto L7f
        L5a:
            if (r1 == 0) goto L61
            java.lang.ThreadLocal<java.util.Map<pk.a<?>, com.google.gson.k0>> r2 = r6.threadLocalAdapterResults
            r2.remove()
        L61:
            if (r4 == 0) goto L6b
            if (r1 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<pk.a<?>, com.google.gson.k0> r7 = r6.typeTokenCache
            r7.putAll(r0)
        L6a:
            return r4
        L6b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "GSON (2.13.2) cannot handle "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
        L7f:
            if (r1 == 0) goto L86
            java.lang.ThreadLocal<java.util.Map<pk.a<?>, com.google.gson.k0>> r0 = r6.threadLocalAdapterResults
            r0.remove()
        L86:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.Gson.getAdapter(pk.a):com.google.gson.k0");
    }

    public <T> k0 getDelegateAdapter(l0 l0Var, pk.a<T> aVar) {
        Objects.requireNonNull(l0Var, "skipPast must not be null");
        Objects.requireNonNull(aVar, "type must not be null");
        if (this.jsonAdapterFactory.isClassJsonAdapterFactory(aVar, l0Var)) {
            l0Var = this.jsonAdapterFactory;
        }
        boolean z10 = false;
        for (l0 l0Var2 : this.factories) {
            if (z10) {
                k0 k0VarCreate = l0Var2.create(this, aVar);
                if (k0VarCreate != null) {
                    return k0VarCreate;
                }
            } else if (l0Var2 == l0Var) {
                z10 = true;
            }
        }
        if (!z10) {
            return getAdapter(aVar);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + aVar);
    }

    public boolean htmlSafe() {
        return this.htmlSafe;
    }

    public GsonBuilder newBuilder() {
        return new GsonBuilder(this);
    }

    public JsonReader newJsonReader(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        c0 c0Var = this.strictness;
        if (c0Var == null) {
            c0Var = c0.f29916c;
        }
        jsonReader.setStrictness(c0Var);
        return jsonReader;
    }

    public JsonWriter newJsonWriter(Writer writer) throws IOException {
        if (this.generateNonExecutableJson) {
            writer.write(JSON_NON_EXECUTABLE_PREFIX);
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        jsonWriter.setFormattingStyle(this.formattingStyle);
        jsonWriter.setHtmlSafe(this.htmlSafe);
        c0 c0Var = this.strictness;
        if (c0Var == null) {
            c0Var = c0.f29916c;
        }
        jsonWriter.setStrictness(c0Var);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        return jsonWriter;
    }

    public boolean serializeNulls() {
        return this.serializeNulls;
    }

    public String toJson(Object obj) {
        return obj == null ? toJson((q) s.f30067b) : toJson(obj, obj.getClass());
    }

    public q toJsonTree(Object obj) {
        return obj == null ? s.f30067b : toJsonTree(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.serializeNulls + ",factories:" + this.factories + ",instanceCreators:" + this.constructorConstructor + "}";
    }

    public <T> T fromJson(String str, Type type) throws w {
        return (T) fromJson(str, pk.a.get(type));
    }

    public <T> T fromJson(String str, pk.a<T> aVar) throws w {
        if (str == null) {
            return null;
        }
        return (T) fromJson(new StringReader(str), aVar);
    }

    public String toJson(Object obj, Type type) throws r {
        StringBuilder sb2 = new StringBuilder();
        toJson(obj, type, sb2);
        return sb2.toString();
    }

    public q toJsonTree(Object obj, Type type) throws r {
        com.google.gson.internal.bind.l lVar = new com.google.gson.internal.bind.l();
        toJson(obj, type, lVar);
        return lVar.get();
    }

    public <T> T fromJson(Reader reader, Class<T> cls) throws w, r {
        return (T) fromJson(reader, pk.a.get((Class) cls));
    }

    public Gson(Excluder excluder, FieldNamingStrategy fieldNamingStrategy, Map<Type, Object> map, boolean z10, boolean z11, boolean z12, boolean z13, k kVar, c0 c0Var, boolean z14, boolean z15, z zVar, String str, int i10, int i11, List<l0> list, List<l0> list2, List<l0> list3, i0 i0Var, i0 i0Var2, List<b0> list4) {
        this.threadLocalAdapterResults = new ThreadLocal<>();
        this.typeTokenCache = new ConcurrentHashMap();
        this.excluder = excluder;
        this.fieldNamingStrategy = fieldNamingStrategy;
        this.instanceCreators = map;
        mk.b bVar = new mk.b(map, z15, list4);
        this.constructorConstructor = bVar;
        this.serializeNulls = z10;
        this.complexMapKeySerialization = z11;
        this.generateNonExecutableJson = z12;
        this.htmlSafe = z13;
        this.formattingStyle = kVar;
        this.strictness = c0Var;
        this.serializeSpecialFloatingPointValues = z14;
        this.useJdkUnsafe = z15;
        this.longSerializationPolicy = zVar;
        this.datePattern = str;
        this.dateStyle = i10;
        this.timeStyle = i11;
        this.builderFactories = list;
        this.builderHierarchyFactories = list2;
        this.objectToNumberStrategy = i0Var;
        this.numberToNumberStrategy = i0Var2;
        this.reflectionFilters = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.C);
        arrayList.add(com.google.gson.internal.bind.q.getFactory(i0Var));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f29962r);
        arrayList.add(TypeAdapters.f29951g);
        arrayList.add(TypeAdapters.f29948d);
        arrayList.add(TypeAdapters.f29949e);
        arrayList.add(TypeAdapters.f29950f);
        k0 k0VarLongAdapter = longAdapter(zVar);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, k0VarLongAdapter));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, doubleAdapter(z14)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, floatAdapter(z14)));
        arrayList.add(com.google.gson.internal.bind.o.getFactory(i0Var2));
        arrayList.add(TypeAdapters.f29952h);
        arrayList.add(TypeAdapters.f29953i);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, atomicLongAdapter(k0VarLongAdapter)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, atomicLongArrayAdapter(k0VarLongAdapter)));
        arrayList.add(TypeAdapters.f29954j);
        arrayList.add(TypeAdapters.f29958n);
        arrayList.add(TypeAdapters.f29963s);
        arrayList.add(TypeAdapters.f29964t);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.f29959o));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.f29960p));
        arrayList.add(TypeAdapters.newFactory(mk.j.class, TypeAdapters.f29961q));
        arrayList.add(TypeAdapters.f29965u);
        arrayList.add(TypeAdapters.f29966v);
        arrayList.add(TypeAdapters.f29968x);
        arrayList.add(TypeAdapters.f29969y);
        arrayList.add(TypeAdapters.A);
        arrayList.add(TypeAdapters.f29967w);
        arrayList.add(TypeAdapters.f29946b);
        arrayList.add(com.google.gson.internal.bind.d.f29987c);
        arrayList.add(TypeAdapters.f29970z);
        if (com.google.gson.internal.sql.c.f30050a) {
            arrayList.add(com.google.gson.internal.sql.c.f30054e);
            arrayList.add(com.google.gson.internal.sql.c.f30053d);
            arrayList.add(com.google.gson.internal.sql.c.f30055f);
        }
        arrayList.add(ArrayTypeAdapter.f29929c);
        arrayList.add(TypeAdapters.f29945a);
        arrayList.add(new CollectionTypeAdapterFactory(bVar));
        arrayList.add(new MapTypeAdapterFactory(bVar, z11));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(bVar);
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.D);
        arrayList.add(new ReflectiveTypeAdapterFactory(bVar, fieldNamingStrategy, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.factories = Collections.unmodifiableList(arrayList);
    }

    public <T> T fromJson(Reader reader, Type type) throws w, r {
        return (T) fromJson(reader, pk.a.get(type));
    }

    public void toJson(Object obj, Appendable appendable) throws r {
        if (obj != null) {
            toJson(obj, obj.getClass(), appendable);
        } else {
            toJson((q) s.f30067b, appendable);
        }
    }

    public <T> T fromJson(Reader reader, pk.a<T> aVar) throws w, r {
        JsonReader jsonReaderNewJsonReader = newJsonReader(reader);
        T t10 = (T) fromJson(jsonReaderNewJsonReader, aVar);
        assertFullConsumption(t10, jsonReaderNewJsonReader);
        return t10;
    }

    public void toJson(Object obj, Type type, Appendable appendable) throws r {
        try {
            toJson(obj, type, newJsonWriter(mk.d0.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    public <T> T fromJson(JsonReader jsonReader, Type type) throws w, r {
        return (T) fromJson(jsonReader, pk.a.get(type));
    }

    public <T> T fromJson(JsonReader jsonReader, pk.a<T> aVar) throws w, r {
        boolean z10;
        c0 strictness = jsonReader.getStrictness();
        c0 c0Var = this.strictness;
        if (c0Var != null) {
            jsonReader.setStrictness(c0Var);
        } else if (jsonReader.getStrictness() == c0.f29916c) {
            jsonReader.setStrictness(c0.f29915b);
        }
        try {
            try {
                try {
                    try {
                        jsonReader.peek();
                        z10 = false;
                        try {
                            k0 adapter = getAdapter(aVar);
                            T t10 = (T) adapter.read(jsonReader);
                            Class clsWrap = mk.w.wrap(aVar.getRawType());
                            if (t10 != null && !clsWrap.isInstance(t10)) {
                                throw new ClassCastException("Type adapter '" + adapter + "' returned wrong type; requested " + aVar.getRawType() + " but got instance of " + t10.getClass() + "\nVerify that the adapter was registered for the correct type.");
                            }
                            return t10;
                        } catch (EOFException e10) {
                            e = e10;
                            if (z10) {
                                jsonReader.setStrictness(strictness);
                                return null;
                            }
                            throw new w(e);
                        }
                    } finally {
                        jsonReader.setStrictness(strictness);
                    }
                } catch (EOFException e11) {
                    e = e11;
                    z10 = true;
                }
            } catch (IOException e12) {
                throw new w(e12);
            }
        } catch (AssertionError e13) {
            throw new AssertionError("AssertionError (GSON 2.13.2): " + e13.getMessage(), e13);
        } catch (IllegalStateException e14) {
            throw new w(e14);
        }
    }

    public void toJson(Object obj, Type type, JsonWriter jsonWriter) throws r {
        k0 adapter = getAdapter(pk.a.get(type));
        c0 strictness = jsonWriter.getStrictness();
        c0 c0Var = this.strictness;
        if (c0Var != null) {
            jsonWriter.setStrictness(c0Var);
        } else if (jsonWriter.getStrictness() == c0.f29916c) {
            jsonWriter.setStrictness(c0.f29915b);
        }
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        try {
            try {
                try {
                    adapter.write(jsonWriter, obj);
                } catch (IOException e10) {
                    throw new r(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public <T> k0 getAdapter(Class<T> cls) {
        return getAdapter(pk.a.get((Class) cls));
    }

    public String toJson(q qVar) throws r {
        StringBuilder sb2 = new StringBuilder();
        toJson(qVar, (Appendable) sb2);
        return sb2.toString();
    }

    public <T> T fromJson(q qVar, Class<T> cls) throws w {
        return (T) fromJson(qVar, pk.a.get((Class) cls));
    }

    public <T> T fromJson(q qVar, Type type) throws w {
        return (T) fromJson(qVar, pk.a.get(type));
    }

    public void toJson(q qVar, Appendable appendable) throws r {
        try {
            toJson(qVar, newJsonWriter(mk.d0.writerForAppendable(appendable)));
        } catch (IOException e10) {
            throw new r(e10);
        }
    }

    public <T> T fromJson(q qVar, pk.a<T> aVar) throws w {
        if (qVar == null) {
            return null;
        }
        return (T) fromJson(new com.google.gson.internal.bind.j(qVar), aVar);
    }

    public void toJson(q qVar, JsonWriter jsonWriter) throws r {
        c0 strictness = jsonWriter.getStrictness();
        boolean zIsHtmlSafe = jsonWriter.isHtmlSafe();
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setHtmlSafe(this.htmlSafe);
        jsonWriter.setSerializeNulls(this.serializeNulls);
        c0 c0Var = this.strictness;
        if (c0Var != null) {
            jsonWriter.setStrictness(c0Var);
        } else if (jsonWriter.getStrictness() == c0.f29916c) {
            jsonWriter.setStrictness(c0.f29915b);
        }
        try {
            try {
                mk.d0.write(qVar, jsonWriter);
            } catch (IOException e10) {
                throw new r(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e11.getMessage(), e11);
            }
        } finally {
            jsonWriter.setStrictness(strictness);
            jsonWriter.setHtmlSafe(zIsHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }
}

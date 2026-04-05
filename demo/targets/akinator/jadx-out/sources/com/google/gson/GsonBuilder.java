package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class GsonBuilder {
    private boolean complexMapKeySerialization;
    private String datePattern;
    private int dateStyle;
    private boolean escapeHtmlChars;
    private Excluder excluder;
    private final List<l0> factories;
    private FieldNamingStrategy fieldNamingPolicy;
    private k formattingStyle;
    private boolean generateNonExecutableJson;
    private final List<l0> hierarchyFactories;
    private final Map<Type, Object> instanceCreators;
    private z longSerializationPolicy;
    private i0 numberToNumberStrategy;
    private i0 objectToNumberStrategy;
    private final ArrayDeque<b0> reflectionFilters;
    private boolean serializeNulls;
    private boolean serializeSpecialFloatingPointValues;
    private c0 strictness;
    private int timeStyle;
    private boolean useJdkUnsafe;

    public GsonBuilder() {
        this.excluder = Excluder.f29922i;
        this.longSerializationPolicy = z.f30071b;
        this.fieldNamingPolicy = j.f30056b;
        this.instanceCreators = new HashMap();
        this.factories = new ArrayList();
        this.hierarchyFactories = new ArrayList();
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.formattingStyle = Gson.DEFAULT_FORMATTING_STYLE;
        this.generateNonExecutableJson = false;
        this.strictness = Gson.DEFAULT_STRICTNESS;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        this.reflectionFilters = new ArrayDeque<>();
    }

    private static void addTypeAdaptersForDate(String str, int i10, int i11, List<l0> list) {
        l0 l0VarCreateAdapterFactory;
        l0 l0VarCreateAdapterFactory2;
        boolean z10 = com.google.gson.internal.sql.c.f30050a;
        com.google.gson.internal.bind.b bVar = com.google.gson.internal.bind.c.f29985b;
        l0 l0VarCreateAdapterFactory3 = null;
        if (str != null && !str.trim().isEmpty()) {
            l0VarCreateAdapterFactory = bVar.createAdapterFactory(str);
            if (z10) {
                l0VarCreateAdapterFactory3 = com.google.gson.internal.sql.c.f30052c.createAdapterFactory(str);
                l0VarCreateAdapterFactory2 = com.google.gson.internal.sql.c.f30051b.createAdapterFactory(str);
            } else {
                l0VarCreateAdapterFactory2 = null;
            }
        } else {
            if (i10 == 2 && i11 == 2) {
                return;
            }
            l0 l0VarCreateAdapterFactory4 = bVar.createAdapterFactory(i10, i11);
            if (z10) {
                l0VarCreateAdapterFactory3 = com.google.gson.internal.sql.c.f30052c.createAdapterFactory(i10, i11);
                l0 l0VarCreateAdapterFactory5 = com.google.gson.internal.sql.c.f30051b.createAdapterFactory(i10, i11);
                l0VarCreateAdapterFactory = l0VarCreateAdapterFactory4;
                l0VarCreateAdapterFactory2 = l0VarCreateAdapterFactory5;
            } else {
                l0VarCreateAdapterFactory = l0VarCreateAdapterFactory4;
                l0VarCreateAdapterFactory2 = null;
            }
        }
        list.add(l0VarCreateAdapterFactory);
        if (z10) {
            list.add(l0VarCreateAdapterFactory3);
            list.add(l0VarCreateAdapterFactory2);
        }
    }

    private static int checkDateFormatStyle(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException(a.b.e(i10, "Invalid style: "));
        }
        return i10;
    }

    private static boolean hasNonOverridableAdapter(Type type) {
        return type == Object.class;
    }

    public GsonBuilder addDeserializationExclusionStrategy(a aVar) {
        Objects.requireNonNull(aVar);
        this.excluder = this.excluder.withExclusionStrategy(aVar, false, true);
        return this;
    }

    public GsonBuilder addReflectionAccessFilter(b0 b0Var) {
        Objects.requireNonNull(b0Var);
        this.reflectionFilters.addFirst(b0Var);
        return this;
    }

    public GsonBuilder addSerializationExclusionStrategy(a aVar) {
        Objects.requireNonNull(aVar);
        this.excluder = this.excluder.withExclusionStrategy(aVar, true, false);
        return this;
    }

    public Gson create() {
        ArrayList arrayList = new ArrayList(this.hierarchyFactories.size() + this.factories.size() + 3);
        arrayList.addAll(this.factories);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.hierarchyFactories);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        addTypeAdaptersForDate(this.datePattern, this.dateStyle, this.timeStyle, arrayList);
        return new Gson(this.excluder, this.fieldNamingPolicy, new HashMap(this.instanceCreators), this.serializeNulls, this.complexMapKeySerialization, this.generateNonExecutableJson, this.escapeHtmlChars, this.formattingStyle, this.strictness, this.serializeSpecialFloatingPointValues, this.useJdkUnsafe, this.longSerializationPolicy, this.datePattern, this.dateStyle, this.timeStyle, new ArrayList(this.factories), new ArrayList(this.hierarchyFactories), arrayList, this.objectToNumberStrategy, this.numberToNumberStrategy, new ArrayList(this.reflectionFilters));
    }

    public GsonBuilder disableHtmlEscaping() {
        this.escapeHtmlChars = false;
        return this;
    }

    public GsonBuilder disableInnerClassSerialization() {
        this.excluder = this.excluder.disableInnerClassSerialization();
        return this;
    }

    public GsonBuilder disableJdkUnsafe() {
        this.useJdkUnsafe = false;
        return this;
    }

    public GsonBuilder enableComplexMapKeySerialization() {
        this.complexMapKeySerialization = true;
        return this;
    }

    public GsonBuilder excludeFieldsWithModifiers(int... iArr) {
        Objects.requireNonNull(iArr);
        this.excluder = this.excluder.withModifiers(iArr);
        return this;
    }

    public GsonBuilder excludeFieldsWithoutExposeAnnotation() {
        this.excluder = this.excluder.excludeFieldsWithoutExposeAnnotation();
        return this;
    }

    public GsonBuilder generateNonExecutableJson() {
        this.generateNonExecutableJson = true;
        return this;
    }

    public GsonBuilder registerTypeAdapter(Type type, Object obj) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(obj);
        if (!(obj instanceof k0)) {
            throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
        }
        if (hasNonOverridableAdapter(type)) {
            throw new IllegalArgumentException("Cannot override built-in adapter for " + type);
        }
        if (obj instanceof k0) {
            this.factories.add(TypeAdapters.newFactory(pk.a.get(type), (k0) obj));
        }
        return this;
    }

    public GsonBuilder registerTypeAdapterFactory(l0 l0Var) {
        Objects.requireNonNull(l0Var);
        this.factories.add(l0Var);
        return this;
    }

    public GsonBuilder registerTypeHierarchyAdapter(Class<?> cls, Object obj) {
        Objects.requireNonNull(cls);
        Objects.requireNonNull(obj);
        if (obj instanceof k0) {
            if (obj instanceof k0) {
                this.factories.add(TypeAdapters.newTypeHierarchyFactory(cls, (k0) obj));
            }
            return this;
        }
        throw new IllegalArgumentException("Class " + obj.getClass().getName() + " does not implement any supported type adapter class or interface");
    }

    public GsonBuilder serializeNulls() {
        this.serializeNulls = true;
        return this;
    }

    public GsonBuilder serializeSpecialFloatingPointValues() {
        this.serializeSpecialFloatingPointValues = true;
        return this;
    }

    public GsonBuilder setDateFormat(String str) {
        if (str != null) {
            try {
                new SimpleDateFormat(str);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException(a.b.l("The date pattern '", str, "' is not valid"), e10);
            }
        }
        this.datePattern = str;
        return this;
    }

    public GsonBuilder setExclusionStrategies(a... aVarArr) {
        Objects.requireNonNull(aVarArr);
        for (a aVar : aVarArr) {
            this.excluder = this.excluder.withExclusionStrategy(null, true, true);
        }
        return this;
    }

    public GsonBuilder setFieldNamingPolicy(j jVar) {
        return setFieldNamingStrategy(jVar);
    }

    public GsonBuilder setFieldNamingStrategy(FieldNamingStrategy fieldNamingStrategy) {
        Objects.requireNonNull(fieldNamingStrategy);
        this.fieldNamingPolicy = fieldNamingStrategy;
        return this;
    }

    public GsonBuilder setFormattingStyle(k kVar) {
        Objects.requireNonNull(kVar);
        this.formattingStyle = kVar;
        return this;
    }

    @Deprecated
    public GsonBuilder setLenient() {
        return setStrictness(c0.f29915b);
    }

    public GsonBuilder setLongSerializationPolicy(z zVar) {
        Objects.requireNonNull(zVar);
        this.longSerializationPolicy = zVar;
        return this;
    }

    public GsonBuilder setNumberToNumberStrategy(i0 i0Var) {
        Objects.requireNonNull(i0Var);
        this.numberToNumberStrategy = i0Var;
        return this;
    }

    public GsonBuilder setObjectToNumberStrategy(i0 i0Var) {
        Objects.requireNonNull(i0Var);
        this.objectToNumberStrategy = i0Var;
        return this;
    }

    public GsonBuilder setPrettyPrinting() {
        return setFormattingStyle(k.f30060e);
    }

    public GsonBuilder setStrictness(c0 c0Var) {
        Objects.requireNonNull(c0Var);
        this.strictness = c0Var;
        return this;
    }

    public GsonBuilder setVersion(double d10) {
        if (!Double.isNaN(d10) && d10 >= 0.0d) {
            this.excluder = this.excluder.withVersion(d10);
            return this;
        }
        throw new IllegalArgumentException("Invalid version: " + d10);
    }

    @Deprecated
    public GsonBuilder setDateFormat(int i10) {
        this.dateStyle = checkDateFormatStyle(i10);
        this.datePattern = null;
        return this;
    }

    public GsonBuilder setDateFormat(int i10, int i11) {
        this.dateStyle = checkDateFormatStyle(i10);
        this.timeStyle = checkDateFormatStyle(i11);
        this.datePattern = null;
        return this;
    }

    public GsonBuilder(Gson gson) {
        this.excluder = Excluder.f29922i;
        this.longSerializationPolicy = z.f30071b;
        this.fieldNamingPolicy = j.f30056b;
        HashMap map = new HashMap();
        this.instanceCreators = map;
        ArrayList arrayList = new ArrayList();
        this.factories = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.hierarchyFactories = arrayList2;
        this.serializeNulls = false;
        this.datePattern = Gson.DEFAULT_DATE_PATTERN;
        this.dateStyle = 2;
        this.timeStyle = 2;
        this.complexMapKeySerialization = false;
        this.serializeSpecialFloatingPointValues = false;
        this.escapeHtmlChars = true;
        this.formattingStyle = Gson.DEFAULT_FORMATTING_STYLE;
        this.generateNonExecutableJson = false;
        this.strictness = Gson.DEFAULT_STRICTNESS;
        this.useJdkUnsafe = true;
        this.objectToNumberStrategy = Gson.DEFAULT_OBJECT_TO_NUMBER_STRATEGY;
        this.numberToNumberStrategy = Gson.DEFAULT_NUMBER_TO_NUMBER_STRATEGY;
        ArrayDeque<b0> arrayDeque = new ArrayDeque<>();
        this.reflectionFilters = arrayDeque;
        this.excluder = gson.excluder;
        this.fieldNamingPolicy = gson.fieldNamingStrategy;
        map.putAll(gson.instanceCreators);
        this.serializeNulls = gson.serializeNulls;
        this.complexMapKeySerialization = gson.complexMapKeySerialization;
        this.generateNonExecutableJson = gson.generateNonExecutableJson;
        this.escapeHtmlChars = gson.htmlSafe;
        this.formattingStyle = gson.formattingStyle;
        this.strictness = gson.strictness;
        this.serializeSpecialFloatingPointValues = gson.serializeSpecialFloatingPointValues;
        this.longSerializationPolicy = gson.longSerializationPolicy;
        this.datePattern = gson.datePattern;
        this.dateStyle = gson.dateStyle;
        this.timeStyle = gson.timeStyle;
        arrayList.addAll(gson.builderFactories);
        arrayList2.addAll(gson.builderHierarchyFactories);
        this.useJdkUnsafe = gson.useJdkUnsafe;
        this.objectToNumberStrategy = gson.objectToNumberStrategy;
        this.numberToNumberStrategy = gson.numberToNumberStrategy;
        arrayDeque.addAll(gson.reflectionFilters);
    }
}

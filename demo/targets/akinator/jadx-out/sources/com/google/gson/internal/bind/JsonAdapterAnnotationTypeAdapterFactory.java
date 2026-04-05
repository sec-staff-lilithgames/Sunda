package com.google.gson.internal.bind;

import com.google.gson.Gson;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements com.google.gson.l0 {

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.gson.l0 f29933e;

    /* renamed from: b, reason: collision with root package name */
    public final mk.b f29934b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f29935c = new ConcurrentHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class DummyTypeAdapterFactory implements com.google.gson.l0 {
        private DummyTypeAdapterFactory() {
        }

        @Override // com.google.gson.l0
        public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i10) {
            this();
        }
    }

    static {
        int i10 = 0;
        f29933e = new DummyTypeAdapterFactory(i10);
        new DummyTypeAdapterFactory(i10);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(mk.b bVar) {
        this.f29934b = bVar;
    }

    public final com.google.gson.k0 a(mk.b bVar, Gson gson, pk.a aVar, lk.b bVar2, boolean z10) {
        com.google.gson.k0 k0VarCreate;
        Object objConstruct = bVar.get(pk.a.get(bVar2.value()), true).construct();
        boolean zNullSafe = bVar2.nullSafe();
        if (objConstruct instanceof com.google.gson.k0) {
            k0VarCreate = (com.google.gson.k0) objConstruct;
        } else {
            if (!(objConstruct instanceof com.google.gson.l0)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objConstruct.getClass().getName() + " as a @JsonAdapter for " + aVar.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            com.google.gson.l0 l0Var = (com.google.gson.l0) objConstruct;
            if (z10) {
                com.google.gson.l0 l0Var2 = (com.google.gson.l0) this.f29935c.putIfAbsent(aVar.getRawType(), l0Var);
                if (l0Var2 != null) {
                    l0Var = l0Var2;
                }
            }
            k0VarCreate = l0Var.create(gson, aVar);
        }
        return (k0VarCreate == null || !zNullSafe) ? k0VarCreate : k0VarCreate.nullSafe();
    }

    @Override // com.google.gson.l0
    public <T> com.google.gson.k0 create(Gson gson, pk.a<T> aVar) {
        lk.b bVar = (lk.b) aVar.getRawType().getAnnotation(lk.b.class);
        if (bVar == null) {
            return null;
        }
        return a(this.f29934b, gson, aVar, bVar, true);
    }

    public boolean isClassJsonAdapterFactory(pk.a<?> aVar, com.google.gson.l0 l0Var) {
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(l0Var);
        if (l0Var != f29933e) {
            Class<? super Object> rawType = aVar.getRawType();
            ConcurrentHashMap concurrentHashMap = this.f29935c;
            com.google.gson.l0 l0Var2 = (com.google.gson.l0) concurrentHashMap.get(rawType);
            if (l0Var2 == null) {
                lk.b bVar = (lk.b) rawType.getAnnotation(lk.b.class);
                if (bVar == null) {
                    return false;
                }
                Class clsValue = bVar.value();
                if (!com.google.gson.l0.class.isAssignableFrom(clsValue)) {
                    return false;
                }
                com.google.gson.l0 l0Var3 = (com.google.gson.l0) this.f29934b.get(pk.a.get(clsValue), true).construct();
                com.google.gson.l0 l0Var4 = (com.google.gson.l0) concurrentHashMap.putIfAbsent(rawType, l0Var3);
                if (l0Var4 != null) {
                    l0Var3 = l0Var4;
                }
                if (l0Var3 != l0Var) {
                    return false;
                }
            } else if (l0Var2 != l0Var) {
                return false;
            }
        }
        return true;
    }
}

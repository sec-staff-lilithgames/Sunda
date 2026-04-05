package io.odeeo.internal.u0;

import io.odeeo.internal.u0.c3;
import io.odeeo.internal.u0.h1;
import io.odeeo.internal.u0.j1;
import io.odeeo.internal.u0.n1;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i1<K, V> extends n1<K, V> implements y1<K, V> {
    private static final long serialVersionUID = 0;

    /* renamed from: h, reason: collision with root package name */
    public transient i1<V, K> f66858h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a<K, V> extends n1.c<K, V> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.n1.c
        public /* bridge */ /* synthetic */ n1.c put(Object obj, Object obj2) {
            return put((a<K, V>) obj, obj2);
        }

        @Override // io.odeeo.internal.u0.n1.c
        public i1<K, V> build() {
            return (i1) super.build();
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> orderKeysBy(Comparator<? super K> comparator) {
            super.orderKeysBy((Comparator) comparator);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy((Comparator) comparator);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> put(K k10, V v10) {
            super.put((a<K, V>) k10, (K) v10);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.n1.c
        public /* bridge */ /* synthetic */ n1.c putAll(Object obj, Iterable iterable) {
            return putAll((a<K, V>) obj, iterable);
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.odeeo.internal.u0.n1.c
        public /* bridge */ /* synthetic */ n1.c putAll(Object obj, Object[] objArr) {
            return putAll((a<K, V>) obj, objArr);
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> putAll(K k10, Iterable<? extends V> iterable) {
            super.putAll((a<K, V>) k10, (Iterable) iterable);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> putAll(K k10, V... vArr) {
            super.putAll((a<K, V>) k10, (Object[]) vArr);
            return this;
        }

        @Override // io.odeeo.internal.u0.n1.c
        public a<K, V> putAll(e2<? extends K, ? extends V> e2Var) {
            super.putAll((e2) e2Var);
            return this;
        }
    }

    public i1(j1<K, h1<V>> j1Var, int i10) {
        super(j1Var, i10);
    }

    public static <K, V> i1<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        j1.b bVar = new j1.b(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            h1 h1VarCopyOf = comparator == null ? h1.copyOf((Collection) value) : h1.sortedCopyOf(comparator, value);
            if (!h1VarCopyOf.isEmpty()) {
                bVar.put(key, h1VarCopyOf);
                size += h1VarCopyOf.size();
            }
        }
        return new i1<>(bVar.build(), size);
    }

    public static <K, V> a<K, V> builder() {
        return new a<>();
    }

    public static <K, V> i1<K, V> copyOf(e2<? extends K, ? extends V> e2Var) {
        if (e2Var.isEmpty()) {
            return of();
        }
        if (e2Var instanceof i1) {
            i1<K, V> i1Var = (i1) e2Var;
            if (!i1Var.l()) {
                return i1Var;
            }
        }
        return a(e2Var.asMap().entrySet(), null);
    }

    public static <K, V> i1<K, V> of() {
        return d0.f66647i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, ClassNotFoundException, IOException, IllegalArgumentException {
        objectInputStream.defaultReadObject();
        int i10 = objectInputStream.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException(a.b.e(i10, "Invalid key count "));
        }
        j1.b bVarBuilder = j1.builder();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object object = objectInputStream.readObject();
            int i13 = objectInputStream.readInt();
            if (i13 <= 0) {
                throw new InvalidObjectException(a.b.e(i13, "Invalid value count "));
            }
            h1.a aVarBuilder = h1.builder();
            for (int i14 = 0; i14 < i13; i14++) {
                aVarBuilder.add((h1.a) objectInputStream.readObject());
            }
            bVarBuilder.put(object, aVarBuilder.build());
            i11 += i13;
        }
        try {
            n1.e.f66973a.a((c3.b<n1>) this, (Object) bVarBuilder.build());
            n1.e.f66974b.a((c3.b<n1>) this, i11);
        } catch (IllegalArgumentException e10) {
            throw ((InvalidObjectException) new InvalidObjectException(e10.getMessage()).initCause(e10));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        c3.a(this, objectOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ d1 get(Object obj) {
        return get((i1<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i1<V, K> n() {
        a aVarBuilder = builder();
        q3 it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVarBuilder.put((a) entry.getValue(), entry.getKey());
        }
        i1<V, K> i1VarBuild = aVarBuilder.build();
        i1VarBuild.f66858h = this;
        return i1VarBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public /* bridge */ /* synthetic */ d1 replaceValues(Object obj, Iterable iterable) {
        return replaceValues((i1<K, V>) obj, iterable);
    }

    public static <K, V> i1<K, V> of(K k10, V v10) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        return aVarBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((i1<K, V>) obj);
    }

    @Override // io.odeeo.internal.u0.n1
    public i1<V, K> inverse() {
        i1<V, K> i1Var = this.f66858h;
        if (i1Var != null) {
            return i1Var;
        }
        i1<V, K> i1VarN = n();
        this.f66858h = i1VarN;
        return i1VarN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((i1<K, V>) obj, iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public /* bridge */ /* synthetic */ List get(Object obj) {
        return get((i1<K, V>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public /* bridge */ /* synthetic */ List replaceValues(Object obj, Iterable iterable) {
        return replaceValues((i1<K, V>) obj, iterable);
    }

    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    public h1<V> get(K k10) {
        h1<V> h1Var = (h1) this.f66960f.get(k10);
        return h1Var == null ? h1.of() : h1Var;
    }

    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public h1<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.u0.n1, io.odeeo.internal.u0.g, io.odeeo.internal.u0.e2, io.odeeo.internal.u0.y1
    @Deprecated
    public h1<V> replaceValues(K k10, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> i1<K, V> of(K k10, V v10, K k11, V v11) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        aVarBuilder.put((a) k11, (K) v11);
        return aVarBuilder.build();
    }

    public static <K, V> i1<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().putAll((Iterable) iterable).build();
    }

    public static <K, V> i1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        aVarBuilder.put((a) k11, (K) v11);
        aVarBuilder.put((a) k12, (K) v12);
        return aVarBuilder.build();
    }

    public static <K, V> i1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        aVarBuilder.put((a) k11, (K) v11);
        aVarBuilder.put((a) k12, (K) v12);
        aVarBuilder.put((a) k13, (K) v13);
        return aVarBuilder.build();
    }

    public static <K, V> i1<K, V> of(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        a aVarBuilder = builder();
        aVarBuilder.put((a) k10, (K) v10);
        aVarBuilder.put((a) k11, (K) v11);
        aVarBuilder.put((a) k12, (K) v12);
        aVarBuilder.put((a) k13, (K) v13);
        aVarBuilder.put((a) k14, (K) v14);
        return aVarBuilder.build();
    }
}

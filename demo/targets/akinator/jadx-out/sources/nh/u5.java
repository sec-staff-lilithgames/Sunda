package nh;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class u5 {

    /* renamed from: a, reason: collision with root package name */
    public AbstractMap f76681a;

    /* renamed from: b, reason: collision with root package name */
    public Comparator f76682b;

    /* renamed from: c, reason: collision with root package name */
    public Comparator f76683c;

    /* renamed from: d, reason: collision with root package name */
    public int f76684d = 4;

    public u5() {
    }

    public final void a(u5 u5Var) {
        AbstractMap abstractMap = u5Var.f76681a;
        if (abstractMap != null) {
            for (Map.Entry entry : abstractMap.entrySet()) {
                putAll(entry.getKey(), ((t4) entry.getValue()).build());
            }
        }
    }

    public int b(Iterable iterable, int i10) {
        return iterable instanceof Collection ? Math.max(i10, ((Collection) iterable).size()) : i10;
    }

    public y5 build() {
        b5 b5VarF;
        AbstractMap abstractMap = this.f76681a;
        if (abstractMap == null) {
            return d5.of();
        }
        Collection<Map.Entry> collectionEntrySet = abstractMap.entrySet();
        Comparator comparator = this.f76682b;
        if (comparator != null) {
            collectionEntrySet = we.from(comparator).onResultOf(wa.f76739b).immutableSortedCopy(collectionEntrySet);
        }
        Comparator comparator2 = this.f76683c;
        if (collectionEntrySet.isEmpty()) {
            return d5.of();
        }
        g5 g5Var = new g5(collectionEntrySet.size());
        int size = 0;
        for (Map.Entry entry : collectionEntrySet) {
            Object key = entry.getKey();
            x4 x4Var = (x4) entry.getValue();
            if (comparator2 == null) {
                b5VarF = x4Var.build();
            } else {
                x4Var.f76622c = true;
                Arrays.sort(x4Var.f76620a, 0, x4Var.f76621b, comparator2);
                b5VarF = b5.f(x4Var.f76621b, x4Var.f76620a);
            }
            g5Var.put(key, b5VarF);
            size += b5VarF.size();
        }
        return new d5(size, g5Var.buildOrThrow());
    }

    public t4 c(int i10) {
        return b5.builderWithExpectedSize(i10);
    }

    public u5 expectedValuesPerKey(int i10) {
        jh.i.o(i10, "expectedValuesPerKey");
        this.f76684d = Math.max(i10, 1);
        return this;
    }

    public u5 orderKeysBy(Comparator<Object> comparator) {
        this.f76682b = (Comparator) mh.p1.checkNotNull(comparator);
        return this;
    }

    public u5 orderValuesBy(Comparator<Object> comparator) {
        this.f76683c = (Comparator) mh.p1.checkNotNull(comparator);
        return this;
    }

    public u5 put(Object obj, Object obj2) {
        jh.i.i(obj, obj2);
        AbstractMap abstractMapCreate = this.f76681a;
        if (abstractMapCreate == null) {
            abstractMapCreate = f2.create();
            this.f76681a = abstractMapCreate;
        }
        t4 t4VarC = (t4) abstractMapCreate.get(obj);
        if (t4VarC == null) {
            t4VarC = c(this.f76684d);
            AbstractMap abstractMapCreate2 = this.f76681a;
            if (abstractMapCreate2 == null) {
                abstractMapCreate2 = f2.create();
                this.f76681a = abstractMapCreate2;
            }
            abstractMapCreate2.put(obj, t4VarC);
        }
        t4VarC.add(obj2);
        return this;
    }

    public u5 putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
        Iterator<? extends Map.Entry<Object, Object>> it = iterable.iterator();
        while (it.hasNext()) {
            put(it.next());
        }
        return this;
    }

    public u5(int i10) {
        if (i10 > 0) {
            this.f76681a = ec.newLinkedHashMapWithExpectedSize(i10);
        }
    }

    public u5 putAll(Object obj, Iterable<Object> iterable) {
        if (obj != null) {
            Iterator<Object> it = iterable.iterator();
            if (it.hasNext()) {
                AbstractMap abstractMapCreate = this.f76681a;
                if (abstractMapCreate == null) {
                    abstractMapCreate = f2.create();
                    this.f76681a = abstractMapCreate;
                }
                t4 t4VarC = (t4) abstractMapCreate.get(obj);
                if (t4VarC == null) {
                    t4VarC = c(b(iterable, this.f76684d));
                    AbstractMap abstractMapCreate2 = this.f76681a;
                    if (abstractMapCreate2 == null) {
                        abstractMapCreate2 = f2.create();
                        this.f76681a = abstractMapCreate2;
                    }
                    abstractMapCreate2.put(obj, t4VarC);
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    jh.i.i(obj, next);
                    t4VarC.add(next);
                }
            }
            return this;
        }
        throw new NullPointerException("null key in entry: null=" + i7.toString(iterable));
    }

    public u5 put(Map.Entry<Object, Object> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    public u5 putAll(Object obj, Object... objArr) {
        return putAll(obj, Arrays.asList(objArr));
    }

    public u5 putAll(fc fcVar) {
        for (Map.Entry<Object, Collection<Object>> entry : fcVar.asMap().entrySet()) {
            putAll(entry.getKey(), entry.getValue());
        }
        return this;
    }
}

package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public ya f22948a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22949b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f22950c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22951d;

    public z5(ya yaVar) {
        this.f22948a = yaVar;
    }

    public static Object d(a6 a6Var, Object obj) {
        if (obj != null && a6Var.getLiteJavaType() == cd.MESSAGE) {
            if (a6Var.isRepeated()) {
                if (!(obj instanceof List)) {
                    throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
                }
                List arrayList = (List) obj;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    Object obj2 = arrayList.get(i10);
                    Object objBuild = obj2 instanceof MessageLite.Builder ? ((MessageLite.Builder) obj2).build() : obj2;
                    if (objBuild != obj2) {
                        if (arrayList == obj) {
                            arrayList = new ArrayList(arrayList);
                        }
                        arrayList.set(i10, objBuild);
                    }
                }
                return arrayList;
            }
            if (obj instanceof MessageLite.Builder) {
                return ((MessageLite.Builder) obj).build();
            }
        }
        return obj;
    }

    public static void e(ya yaVar) {
        for (int i10 = 0; i10 < yaVar.getNumArrayEntries(); i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = yaVar.getArrayEntryAt(i10);
            arrayEntryAt.setValue(d((a6) arrayEntryAt.getKey(), arrayEntryAt.getValue()));
        }
        for (Map.Entry<Comparable<Object>, Object> entry : yaVar.getOverflowEntries()) {
            entry.setValue(d((a6) entry.getKey(), entry.getValue()));
        }
    }

    public static void f(a6 a6Var, Object obj) {
        if (b6.h(a6Var.getLiteType(), obj)) {
            return;
        }
        if (a6Var.getLiteType().getJavaType() != cd.MESSAGE || !(obj instanceof MessageLite.Builder)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(a6Var.getNumber()), a6Var.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static <T extends a6> z5 fromFieldSet(b6 b6Var) {
        z5 z5Var = new z5(b6.a(b6Var.f21943a, true));
        z5Var.f22949b = b6Var.f21945c;
        return z5Var;
    }

    public final void a() {
        if (this.f22950c) {
            return;
        }
        this.f22948a = b6.a(this.f22948a, true);
        this.f22950c = true;
    }

    public void addRepeatedField(a6 a6Var, Object obj) {
        List arrayList;
        a();
        if (!a6Var.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.f22951d = this.f22951d || (obj instanceof MessageLite.Builder);
        f(a6Var, obj);
        Object field = getField(a6Var);
        if (field == null) {
            arrayList = new ArrayList();
            this.f22948a.put((Comparable<Object>) a6Var, (Object) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public final Object b(a6 a6Var, int i10) {
        if (!a6Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object value = this.f22948a.get(a6Var);
        if (value instanceof b8) {
            value = ((b8) value).getValue();
        }
        if (value != null) {
            return ((List) value).get(i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public b6 build() {
        if (this.f22948a.isEmpty()) {
            return b6.emptySet();
        }
        this.f22950c = false;
        ya yaVarA = this.f22948a;
        if (this.f22951d) {
            yaVarA = b6.a(yaVarA, false);
            e(yaVarA);
        }
        b6 b6Var = new b6(yaVarA);
        b6Var.f21945c = this.f22949b;
        return b6Var;
    }

    public final void c(Map.Entry entry) {
        a6 a6Var = (a6) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof b8) {
            value = ((b8) value).getValue();
        }
        if (a6Var.isRepeated()) {
            Object field = getField(a6Var);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(b6.c(it.next()));
            }
            this.f22948a.put((Comparable<Object>) a6Var, field);
            return;
        }
        if (a6Var.getLiteJavaType() != cd.MESSAGE) {
            this.f22948a.put((Comparable<Object>) a6Var, b6.c(value));
            return;
        }
        Object field2 = getField(a6Var);
        if (field2 == null) {
            this.f22948a.put((Comparable<Object>) a6Var, b6.c(value));
        } else if (field2 instanceof MessageLite.Builder) {
            a6Var.internalMergeFrom((MessageLite.Builder) field2, (MessageLite) value);
        } else {
            this.f22948a.put((Comparable<Object>) a6Var, (Object) a6Var.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
        }
    }

    public void clearField(a6 a6Var) {
        a();
        this.f22948a.remove(a6Var);
        if (this.f22948a.isEmpty()) {
            this.f22949b = false;
        }
    }

    public Map<a6, Object> getAllFields() {
        if (!this.f22949b) {
            return this.f22948a.isImmutable() ? this.f22948a : Collections.unmodifiableMap(this.f22948a);
        }
        ya yaVarA = b6.a(this.f22948a, false);
        if (this.f22948a.isImmutable()) {
            yaVarA.makeImmutable();
            return yaVarA;
        }
        e(yaVarA);
        return yaVarA;
    }

    public Object getField(a6 a6Var) {
        Object value = this.f22948a.get(a6Var);
        if (value instanceof b8) {
            value = ((b8) value).getValue();
        }
        return d(a6Var, value);
    }

    public Object getRepeatedField(a6 a6Var, int i10) {
        if (this.f22951d) {
            a();
        }
        Object objB = b(a6Var, i10);
        return objB instanceof MessageLite.Builder ? ((MessageLite.Builder) objB).build() : objB;
    }

    public int getRepeatedFieldCount(a6 a6Var) {
        if (!a6Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(a6Var);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public boolean hasField(a6 a6Var) {
        if (a6Var.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f22948a.get(a6Var) != null;
    }

    public boolean isInitialized() {
        int i10 = 0;
        while (true) {
            if (i10 >= this.f22948a.getNumArrayEntries()) {
                Iterator<Map.Entry<Comparable<Object>, Object>> it = this.f22948a.getOverflowEntries().iterator();
                while (it.hasNext()) {
                    if (!b6.g(it.next())) {
                    }
                }
                return true;
            }
            if (!b6.g(this.f22948a.getArrayEntryAt(i10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public void mergeFrom(b6 b6Var) {
        gb gbVar;
        a();
        int i10 = 0;
        while (true) {
            gb gbVar2 = b6Var.f21943a;
            gbVar = b6Var.f21943a;
            if (i10 >= gbVar2.getNumArrayEntries()) {
                break;
            }
            c(gbVar.getArrayEntryAt(i10));
            i10++;
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = gbVar.getOverflowEntries().iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public void setField(a6 a6Var, Object obj) {
        a();
        if (!a6Var.isRepeated()) {
            f(a6Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                f(a6Var, next);
                this.f22951d = this.f22951d || (next instanceof MessageLite.Builder);
            }
            obj = arrayList;
        }
        if (obj instanceof b8) {
            this.f22949b = true;
        }
        this.f22951d = this.f22951d || (obj instanceof MessageLite.Builder);
        this.f22948a.put((Comparable<Object>) a6Var, obj);
    }

    public void setRepeatedField(a6 a6Var, int i10, Object obj) {
        a();
        if (!a6Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        this.f22951d = this.f22951d || (obj instanceof MessageLite.Builder);
        Object field = getField(a6Var);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        f(a6Var, obj);
        ((List) field).set(i10, obj);
    }
}

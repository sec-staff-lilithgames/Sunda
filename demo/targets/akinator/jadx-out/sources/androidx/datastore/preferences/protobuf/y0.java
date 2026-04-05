package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public p3 f6130a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6131b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6132c = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6133d;

    public y0(p3 p3Var) {
        this.f6130a = p3Var;
    }

    public static Object e(Object obj, boolean z10) {
        if (!(obj instanceof q2)) {
            return obj;
        }
        q2 q2Var = (q2) obj;
        return z10 ? q2Var.buildPartial() : q2Var.build();
    }

    public static Object f(z0 z0Var, Object obj, boolean z10) {
        if (obj == null) {
            return obj;
        }
        h1 h1Var = (h1) z0Var;
        if (h1Var.getLiteJavaType() != s4.MESSAGE) {
            return obj;
        }
        if (!h1Var.isRepeated()) {
            return e(obj, z10);
        }
        if (!(obj instanceof List)) {
            throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
        }
        List arrayList = (List) obj;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Object obj2 = arrayList.get(i10);
            Object objE = e(obj2, z10);
            if (objE != obj2) {
                if (arrayList == obj) {
                    arrayList = new ArrayList(arrayList);
                }
                arrayList.set(i10, objE);
            }
        }
        return arrayList;
    }

    public static <T extends z0> y0 fromFieldSet(a1 a1Var) {
        y0 y0Var = new y0(a1.a(a1Var.f5797a, true, false));
        y0Var.f6131b = a1Var.f5799c;
        return y0Var;
    }

    public static void g(p3 p3Var, boolean z10) {
        int numArrayEntries = p3Var.getNumArrayEntries();
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = p3Var.getArrayEntryAt(i10);
            arrayEntryAt.setValue(f((z0) arrayEntryAt.getKey(), arrayEntryAt.getValue(), z10));
        }
        for (Map.Entry<Comparable<Object>, Object> entry : p3Var.getOverflowEntries()) {
            entry.setValue(f((z0) entry.getKey(), entry.getValue(), z10));
        }
    }

    public static void h(h1 h1Var, Object obj) {
        if (a1.h(h1Var.getLiteType(), obj)) {
            return;
        }
        if (h1Var.getLiteType().getJavaType() != s4.MESSAGE || !(obj instanceof q2)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(h1Var.getNumber()), h1Var.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public final a1 a(boolean z10) {
        if (this.f6130a.isEmpty()) {
            return a1.emptySet();
        }
        this.f6132c = false;
        p3 p3VarA = this.f6130a;
        if (this.f6133d) {
            p3VarA = a1.a(p3VarA, false, false);
            g(p3VarA, z10);
        }
        a1 a1Var = new a1(p3VarA);
        a1Var.f5799c = this.f6131b;
        return a1Var;
    }

    public void addRepeatedField(z0 z0Var, Object obj) {
        List arrayList;
        b();
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        this.f6133d = this.f6133d || (obj instanceof q2);
        h(h1Var, obj);
        Object objC = c(h1Var);
        if (objC == null) {
            arrayList = new ArrayList();
            this.f6130a.put((Comparable<Object>) h1Var, (Object) arrayList);
        } else {
            arrayList = (List) objC;
        }
        arrayList.add(obj);
    }

    public final void b() {
        if (this.f6132c) {
            return;
        }
        this.f6130a = a1.a(this.f6130a, true, false);
        this.f6132c = true;
    }

    public a1 build() {
        return a(false);
    }

    public a1 buildPartial() {
        return a(true);
    }

    public final Object c(z0 z0Var) {
        Object obj = this.f6130a.get(z0Var);
        return obj instanceof y1 ? ((y1) obj).getValue() : obj;
    }

    public void clearField(z0 z0Var) {
        b();
        this.f6130a.remove(z0Var);
        if (this.f6130a.isEmpty()) {
            this.f6131b = false;
        }
    }

    public final void d(Map.Entry entry) {
        z0 z0Var = (z0) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof y1;
        h1 h1Var = (h1) z0Var;
        if (h1Var.isRepeated()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            List arrayList = (List) c(h1Var);
            List list = (List) value;
            int size = list.size();
            if (arrayList == null) {
                arrayList = new ArrayList(size);
                this.f6130a.put((Comparable<Object>) h1Var, (Object) arrayList);
            }
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(a1.c(list.get(i10)));
            }
            return;
        }
        if (h1Var.getLiteJavaType() != s4.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f6130a.put((Comparable<Object>) h1Var, a1.c(value));
            return;
        }
        Object objC = c(h1Var);
        if (objC == null) {
            this.f6130a.put((Comparable<Object>) h1Var, a1.c(value));
            if (z10) {
                this.f6131b = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((y1) value).getValue();
        }
        if (objC instanceof q2) {
            h1Var.internalMergeFrom((q2) objC, (r2) value);
        } else {
            this.f6130a.put((Comparable<Object>) h1Var, (Object) h1Var.internalMergeFrom(((r2) objC).toBuilder(), (r2) value).build());
        }
    }

    public Map<z0, Object> getAllFields() {
        if (!this.f6131b) {
            return this.f6130a.isImmutable() ? this.f6130a : Collections.unmodifiableMap(this.f6130a);
        }
        p3 p3VarA = a1.a(this.f6130a, false, true);
        if (this.f6130a.isImmutable()) {
            p3VarA.makeImmutable();
            return p3VarA;
        }
        g(p3VarA, true);
        return p3VarA;
    }

    public Object getField(z0 z0Var) {
        return f(z0Var, c(z0Var), true);
    }

    public Object getRepeatedField(z0 z0Var, int i10) {
        if (this.f6133d) {
            b();
        }
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object objC = c(h1Var);
        if (objC != null) {
            return e(((List) objC).get(i10), true);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(z0 z0Var) {
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
        }
        Object objC = c(h1Var);
        if (objC == null) {
            return 0;
        }
        return ((List) objC).size();
    }

    public boolean hasField(z0 z0Var) {
        h1 h1Var = (h1) z0Var;
        if (h1Var.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f6130a.get(h1Var) != null;
    }

    public boolean isInitialized() {
        int numArrayEntries = this.f6130a.getNumArrayEntries();
        int i10 = 0;
        while (true) {
            if (i10 >= numArrayEntries) {
                Iterator<Map.Entry<Comparable<Object>, Object>> it = this.f6130a.getOverflowEntries().iterator();
                while (it.hasNext()) {
                    if (!a1.g(it.next())) {
                    }
                }
                return true;
            }
            if (!a1.g(this.f6130a.getArrayEntryAt(i10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public void mergeFrom(a1 a1Var) {
        b();
        v3 v3Var = a1Var.f5797a;
        v3 v3Var2 = a1Var.f5797a;
        int numArrayEntries = v3Var.getNumArrayEntries();
        for (int i10 = 0; i10 < numArrayEntries; i10++) {
            d(v3Var2.getArrayEntryAt(i10));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = v3Var2.getOverflowEntries().iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    public void setField(z0 z0Var, Object obj) {
        b();
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            h(h1Var, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList((List) obj);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = arrayList.get(i10);
                h(h1Var, obj2);
                this.f6133d = this.f6133d || (obj2 instanceof q2);
            }
            obj = arrayList;
        }
        if (obj instanceof y1) {
            this.f6131b = true;
        }
        this.f6133d = this.f6133d || (obj instanceof q2);
        this.f6130a.put((Comparable<Object>) h1Var, obj);
    }

    public void setRepeatedField(z0 z0Var, int i10, Object obj) {
        b();
        h1 h1Var = (h1) z0Var;
        if (!h1Var.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        this.f6133d = this.f6133d || (obj instanceof q2);
        Object objC = c(h1Var);
        if (objC == null) {
            throw new IndexOutOfBoundsException();
        }
        h(h1Var, obj);
        ((List) objC).set(i10, obj);
    }
}

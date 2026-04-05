package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k2 extends LinkedHashMap {

    /* renamed from: c, reason: collision with root package name */
    public static final k2 f5937c;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5938b = true;

    static {
        k2 k2Var = new k2();
        f5937c = k2Var;
        k2Var.makeImmutable();
    }

    public static <K, V> k2 emptyMapField() {
        return f5937c;
    }

    public final void a() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto Lc
        La:
            r7 = r0
            goto L5b
        Lc:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L18
        L16:
            r7 = r1
            goto L5b
        L18:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L37
            goto L16
        L37:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L54
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L54
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L58
        L54:
            boolean r3 = r4.equals(r3)
        L58:
            if (r3 != 0) goto L20
            goto L16
        L5b:
            if (r7 == 0) goto L5e
            return r0
        L5e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.k2.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        Iterator it = entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            int iHashCode2 = key instanceof byte[] ? t1.hashCode((byte[]) key) : key.hashCode();
            Object value = entry.getValue();
            iHashCode += (value instanceof byte[] ? t1.hashCode((byte[]) value) : value.hashCode()) ^ iHashCode2;
        }
        return iHashCode;
    }

    public boolean isMutable() {
        return this.f5938b;
    }

    public void makeImmutable() {
        this.f5938b = false;
    }

    public void mergeFrom(k2 k2Var) {
        a();
        if (k2Var.isEmpty()) {
            return;
        }
        putAll(k2Var);
    }

    public k2 mutableCopy() {
        if (isEmpty()) {
            return new k2();
        }
        k2 k2Var = new k2(this);
        k2Var.f5938b = true;
        return k2Var;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        a();
        Charset charset = t1.f6006a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<Object, Object> map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = t1.f6006a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        a();
        return super.remove(obj);
    }

    public Object put(Map.Entry<Object, Object> entry) {
        return put(entry.getKey(), entry.getValue());
    }
}

package o4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import o4.j;
import tu.v;
import uu.o1;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends j {

    /* renamed from: a, reason: collision with root package name */
    public final Map f77475a;

    /* renamed from: b, reason: collision with root package name */
    public final b f77476b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // o4.j
    public Map<j.a, Object> asMap() {
        v vVar;
        Set<Map.Entry> setEntrySet = this.f77475a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
                vVar = new v(key, bArrCopyOf);
            } else {
                vVar = new v(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return a.immutableMap(linkedHashMap);
    }

    public final void checkNotFrozen$datastore_preferences_core_release() {
        if (this.f77476b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core_release();
        this.f77475a.clear();
    }

    @Override // o4.j
    public <T> boolean contains(j.a key) {
        e0.checkNotNullParameter(key, "key");
        return this.f77475a.containsKey(key);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof o4.d
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            o4.d r7 = (o4.d) r7
            java.util.Map r7 = r7.f77475a
            java.util.Map r0 = r6.f77475a
            r2 = 1
            if (r7 != r0) goto L10
            return r2
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            return r1
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            return r2
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = kotlin.jvm.internal.e0.areEqual(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.d.equals(java.lang.Object):boolean");
    }

    public final void freeze$datastore_preferences_core_release() {
        this.f77476b.set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o4.j
    public <T> T get(j.a key) {
        e0.checkNotNullParameter(key, "key");
        T t10 = (T) this.f77475a.get(key);
        if (!(t10 instanceof byte[])) {
            return t10;
        }
        byte[] bArr = (byte[]) t10;
        T t11 = (T) Arrays.copyOf(bArr, bArr.length);
        e0.checkNotNullExpressionValue(t11, "copyOf(this, size)");
        return t11;
    }

    public final Map<j.a, Object> getPreferencesMap$datastore_preferences_core_release() {
        return this.f77475a;
    }

    public int hashCode() {
        Iterator it = this.f77475a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final void minusAssign(j.a key) {
        e0.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        remove(key);
    }

    public final void plusAssign(j prefs) {
        e0.checkNotNullParameter(prefs, "prefs");
        checkNotFrozen$datastore_preferences_core_release();
        this.f77475a.putAll(prefs.asMap());
    }

    public final void putAll(j.b... pairs) {
        e0.checkNotNullParameter(pairs, "pairs");
        checkNotFrozen$datastore_preferences_core_release();
        for (j.b bVar : pairs) {
            setUnchecked$datastore_preferences_core_release(bVar.getKey$datastore_preferences_core_release(), bVar.getValue$datastore_preferences_core_release());
        }
    }

    public final <T> T remove(j.a key) {
        e0.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        return (T) this.f77475a.remove(key);
    }

    public final <T> void set(j.a key, T t10) {
        e0.checkNotNullParameter(key, "key");
        setUnchecked$datastore_preferences_core_release(key, t10);
    }

    public final void setUnchecked$datastore_preferences_core_release(j.a key, Object obj) {
        e0.checkNotNullParameter(key, "key");
        checkNotFrozen$datastore_preferences_core_release();
        if (obj == null) {
            remove(key);
            return;
        }
        boolean z10 = obj instanceof Set;
        Map map = this.f77475a;
        if (z10) {
            map.put(key, a.immutableCopyOfSet((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            map.put(key, obj);
            return;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        e0.checkNotNullExpressionValue(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return y0.joinToString$default(this.f77475a.entrySet(), ",\n", "{\n", "\n}", 0, null, c.f77474e, 24, null);
    }

    public /* synthetic */ d(Map map, boolean z10, int i10, u uVar) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    public final void plusAssign(j.b pair) {
        e0.checkNotNullParameter(pair, "pair");
        checkNotFrozen$datastore_preferences_core_release();
        putAll(pair);
    }

    public d(Map<j.a, Object> preferencesMap, boolean z10) {
        e0.checkNotNullParameter(preferencesMap, "preferencesMap");
        this.f77475a = preferencesMap;
        this.f77476b = new b(z10);
    }
}

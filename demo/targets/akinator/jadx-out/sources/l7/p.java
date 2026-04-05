package l7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import p0.o2;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements Iterable, lv.a {

    /* renamed from: c, reason: collision with root package name */
    public static final p f72638c;

    /* renamed from: b, reason: collision with root package name */
    public final Map f72639b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f72640a;

        public a() {
            this.f72640a = new LinkedHashMap();
        }

        public static /* synthetic */ a set$default(a aVar, String str, Object obj, String str2, int i10, Object obj2) {
            if ((i10 & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return aVar.set(str, obj, str2);
        }

        public final p build() {
            return new p(q7.c.toImmutableMap(this.f72640a), null);
        }

        public final a remove(String str) {
            this.f72640a.remove(str);
            return this;
        }

        public final a set(String str, Object obj) {
            return set$default(this, str, obj, null, 4, null);
        }

        public final a set(String str, Object obj, String str2) {
            this.f72640a.put(str, new c(obj, str2));
            return this;
        }

        public a(p pVar) {
            this.f72640a = p1.toMutableMap(pVar.f72639b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Object f72641a;

        /* renamed from: b, reason: collision with root package name */
        public final String f72642b;

        public c(Object obj, String str) {
            this.f72641a = obj;
            this.f72642b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return e0.areEqual(this.f72641a, cVar.f72641a) && e0.areEqual(this.f72642b, cVar.f72642b);
        }

        public final String getMemoryCacheKey() {
            return this.f72642b;
        }

        public final Object getValue() {
            return this.f72641a;
        }

        public int hashCode() {
            Object obj = this.f72641a;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f72642b;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Entry(value=");
            sb2.append(this.f72641a);
            sb2.append(", memoryCacheKey=");
            return o2.q(sb2, this.f72642b, ')');
        }
    }

    static {
        new b(null);
        f72638c = new p();
    }

    public /* synthetic */ p(Map map, kotlin.jvm.internal.u uVar) {
        this(map);
    }

    public final c entry(String str) {
        return (c) this.f72639b.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return e0.areEqual(this.f72639b, ((p) obj).f72639b);
        }
        return false;
    }

    public int hashCode() {
        return this.f72639b.hashCode();
    }

    public final boolean isEmpty() {
        return this.f72639b.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<tu.v> iterator() {
        Map map = this.f72639b;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(tu.e0.to((String) entry.getKey(), (c) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String memoryCacheKey(String str) {
        c cVar = (c) this.f72639b.get(str);
        if (cVar != null) {
            return cVar.getMemoryCacheKey();
        }
        return null;
    }

    public final Map<String, String> memoryCacheKeys() {
        if (isEmpty()) {
            return p1.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : this.f72639b.entrySet()) {
            String memoryCacheKey = ((c) entry.getValue()).getMemoryCacheKey();
            if (memoryCacheKey != null) {
                linkedHashMap.put(entry.getKey(), memoryCacheKey);
            }
        }
        return linkedHashMap;
    }

    public final a newBuilder() {
        return new a(this);
    }

    public final int size() {
        return this.f72639b.size();
    }

    public String toString() {
        return j1.o2.q(new StringBuilder("Parameters(entries="), this.f72639b, ')');
    }

    public final <T> T value(String str) {
        c cVar = (c) this.f72639b.get(str);
        if (cVar != null) {
            return (T) cVar.getValue();
        }
        return null;
    }

    public final Map<String, Object> values() {
        if (isEmpty()) {
            return p1.emptyMap();
        }
        Map map = this.f72639b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(o1.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((c) entry.getValue()).getValue());
        }
        return linkedHashMap;
    }

    public p(Map map) {
        this.f72639b = map;
    }

    public p() {
        this(p1.emptyMap());
    }
}

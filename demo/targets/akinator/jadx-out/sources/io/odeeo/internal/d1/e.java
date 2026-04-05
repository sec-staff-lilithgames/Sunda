package io.odeeo.internal.d1;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import qv.v;
import tu.e0;
import uu.o1;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends ArrayList<Map.Entry<? extends String, ? extends String>> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f63657a;

    /* renamed from: b, reason: collision with root package name */
    public static int f63658b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map<String, String> f63659c;

    static {
        e eVar = new e();
        f63657a = eVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(eVar, 10)), 16));
        Iterator<Map.Entry<? extends String, ? extends String>> it = eVar.iterator();
        while (it.hasNext()) {
            Map.Entry<? extends String, ? extends String> next = it.next();
            tu.v vVar = e0.to(kotlin.jvm.internal.e0.stringPlus("x-", next.getKey()), next.getValue());
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        f63659c = linkedHashMap;
    }

    public final void add(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        int length = value.length() + key.length();
        int i10 = f63658b + length;
        f63658b = i10;
        if (i10 <= 200) {
            add(new AbstractMap.SimpleEntry(key, value));
        } else {
            io.odeeo.internal.b2.a.i(a.b.l("Unable to add Custom Attribute '", key, "': All added Custom Attributes should be no more than 200 characters long."), new Object[0]);
            f63658b -= length;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        super.clear();
        f63658b = 0;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry<String, String>) obj);
        }
        return false;
    }

    public final List<Map.Entry<String, String>> getAllByKey(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<? extends String, ? extends String>> it = iterator();
        while (it.hasNext()) {
            Map.Entry<? extends String, ? extends String> next = it.next();
            if (kotlin.jvm.internal.e0.areEqual(next.getKey(), key)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final Map<String, String> getAttributeMap() {
        return f63659c;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final int getTotalLength$odeeoSdk_release() {
        return f63658b;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Map.Entry) {
            return indexOf((Map.Entry<String, String>) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Map.Entry) {
            return lastIndexOf((Map.Entry<String, String>) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ Map.Entry<String, String> remove(int i10) {
        return removeAt(i10);
    }

    public /* bridge */ Map.Entry<String, String> removeAt(int i10) {
        return (Map.Entry) remove(i10);
    }

    public final void removeByKey(String key) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        int size = size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            if (kotlin.jvm.internal.e0.areEqual(get(size).getKey(), key)) {
                f63658b -= get(size).getValue().length() + key.length();
                remove(size);
            }
            if (i10 < 0) {
                return;
            } else {
                size = i10;
            }
        }
    }

    public final void setTotalLength$odeeoSdk_release(int i10) {
        f63658b = i10;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(Map.Entry<String, String> entry) {
        return super.contains((Object) entry);
    }

    public /* bridge */ int indexOf(Map.Entry<String, String> entry) {
        return super.indexOf((Object) entry);
    }

    public /* bridge */ int lastIndexOf(Map.Entry<String, String> entry) {
        return super.lastIndexOf((Object) entry);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry<String, String>) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(Map.Entry<String, String> entry) {
        return super.remove((Object) entry);
    }

    public final List<Map.Entry<String, String>> getAllAttributes() {
        return this;
    }
}

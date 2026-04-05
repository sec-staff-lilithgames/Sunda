package io.ktor.util;

import be.nVUQ.UupKET;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kv.p;
import tu.x0;
import uu.c2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class StringValuesBuilderImpl implements StringValuesBuilder {
    private final boolean caseInsensitiveName;
    private final Map<String, List<String>> values;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.StringValuesBuilderImpl$appendAll$1, reason: invalid class name */
    public static final class AnonymousClass1 extends f0 implements p {
        public AnonymousClass1() {
            super(2);
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (List<String>) obj2);
            return x0.f87415a;
        }

        public final void invoke(String name, List<String> values) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(values, "values");
            StringValuesBuilderImpl.this.appendAll(name, values);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.StringValuesBuilderImpl$appendMissing$1, reason: invalid class name and case insensitive filesystem */
    public static final class C39961 extends f0 implements p {
        public C39961() {
            super(2);
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, (List<String>) obj2);
            return x0.f87415a;
        }

        public final void invoke(String name, List<String> values) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(values, "values");
            StringValuesBuilderImpl.this.appendMissing(name, values);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringValuesBuilderImpl() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    private final List<String> ensureListForKey(String str) {
        List<String> list = this.values.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        validateName(str);
        this.values.put(str, arrayList);
        return arrayList;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void append(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        validateValue(value);
        ensureListForKey(name).add(value);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(StringValues stringValues) {
        e0.checkNotNullParameter(stringValues, UupKET.EZLQLqDkST);
        stringValues.forEach(new AnonymousClass1());
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendMissing(StringValues stringValues) {
        e0.checkNotNullParameter(stringValues, "stringValues");
        stringValues.forEach(new C39961());
    }

    @Override // io.ktor.util.StringValuesBuilder
    public StringValues build() {
        return new StringValuesImpl(this.caseInsensitiveName, this.values);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void clear() {
        this.values.clear();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(String name) {
        e0.checkNotNullParameter(name, "name");
        return this.values.containsKey(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public Set<Map.Entry<String, List<String>>> entries() {
        return CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    @Override // io.ktor.util.StringValuesBuilder
    public String get(String name) {
        e0.checkNotNullParameter(name, "name");
        List<String> all = getAll(name);
        if (all != null) {
            return (String) y0.firstOrNull((List) all);
        }
        return null;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public List<String> getAll(String name) {
        e0.checkNotNullParameter(name, "name");
        return this.values.get(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final Map<String, List<String>> getValues() {
        return this.values;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public Set<String> names() {
        return this.values.keySet();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void remove(String name) {
        e0.checkNotNullParameter(name, "name");
        this.values.remove(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void removeKeysWithNoEntries() {
        Map<String, List<String>> map = this.values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            remove((String) ((Map.Entry) it.next()).getKey());
        }
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void set(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        validateValue(value);
        List<String> listEnsureListForKey = ensureListForKey(name);
        listEnsureListForKey.clear();
        listEnsureListForKey.add(value);
    }

    public void validateName(String name) {
        e0.checkNotNullParameter(name, "name");
    }

    public void validateValue(String value) {
        e0.checkNotNullParameter(value, "value");
    }

    public StringValuesBuilderImpl(boolean z10, int i10) {
        this.caseInsensitiveName = z10;
        this.values = z10 ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap<>(i10);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(String name, Iterable<String> values) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
        List<String> listEnsureListForKey = ensureListForKey(name);
        for (String str : values) {
            validateValue(str);
            listEnsureListForKey.add(str);
        }
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendMissing(String name, Iterable<String> values) {
        Set setEmptySet;
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
        List<String> list = this.values.get(name);
        if (list == null || (setEmptySet = y0.toSet(list)) == null) {
            setEmptySet = c2.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : values) {
            if (!setEmptySet.contains(str)) {
                arrayList.add(str);
            }
        }
        appendAll(name, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        List<String> list = this.values.get(name);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean remove(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        List<String> list = this.values.get(name);
        if (list != null) {
            return list.remove(value);
        }
        return false;
    }

    public /* synthetic */ StringValuesBuilderImpl(boolean z10, int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? 8 : i10);
    }
}

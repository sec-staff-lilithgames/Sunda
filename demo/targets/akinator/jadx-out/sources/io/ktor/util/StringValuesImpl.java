package io.ktor.util;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.p;
import uu.p1;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class StringValuesImpl implements StringValues {
    private final boolean caseInsensitiveName;
    private final Map<String, List<String>> values;

    /* JADX WARN: Multi-variable type inference failed */
    public StringValuesImpl() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final List<String> listForKey(String str) {
        return this.values.get(str);
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String name) {
        e0.checkNotNullParameter(name, "name");
        return listForKey(name) != null;
    }

    @Override // io.ktor.util.StringValues
    public Set<Map.Entry<String, List<String>>> entries() {
        return CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) obj;
        if (this.caseInsensitiveName != stringValues.getCaseInsensitiveName()) {
            return false;
        }
        return StringValuesKt.entriesEquals(entries(), stringValues.entries());
    }

    @Override // io.ktor.util.StringValues
    public void forEach(p body) {
        e0.checkNotNullParameter(body, "body");
        for (Map.Entry<String, List<String>> entry : this.values.entrySet()) {
            body.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.ktor.util.StringValues
    public String get(String name) {
        e0.checkNotNullParameter(name, "name");
        List<String> listListForKey = listForKey(name);
        if (listListForKey != null) {
            return (String) y0.firstOrNull((List) listListForKey);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public List<String> getAll(String name) {
        e0.checkNotNullParameter(name, "name");
        return listForKey(name);
    }

    @Override // io.ktor.util.StringValues
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final Map<String, List<String>> getValues() {
        return this.values;
    }

    public int hashCode() {
        return StringValuesKt.entriesHashCode(entries(), Boolean.hashCode(this.caseInsensitiveName) * 31);
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // io.ktor.util.StringValues
    public Set<String> names() {
        return CollectionsJvmKt.unmodifiable(this.values.keySet());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StringValues(case=");
        sb2.append(!this.caseInsensitiveName);
        sb2.append(") ");
        sb2.append(entries());
        return sb2.toString();
    }

    public StringValuesImpl(boolean z10, Map<String, ? extends List<String>> values) {
        e0.checkNotNullParameter(values, "values");
        this.caseInsensitiveName = z10;
        Map mapCaseInsensitiveMap = z10 ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(value.get(i10));
            }
            mapCaseInsensitiveMap.put(key, arrayList);
        }
        this.values = mapCaseInsensitiveMap;
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        List<String> listListForKey = listForKey(name);
        if (listListForKey != null) {
            return listListForKey.contains(value);
        }
        return false;
    }

    public /* synthetic */ StringValuesImpl(boolean z10, Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? p1.emptyMap() : map);
    }
}

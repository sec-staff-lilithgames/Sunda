package io.ktor.util;

import com.ironsource.G5;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kv.p;
import lv.a;
import sv.k0;
import uu.b2;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class StringValuesSingleImpl implements StringValues {
    private final boolean caseInsensitiveName;
    private final String name;
    private final List<String> values;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.ktor.util.StringValuesSingleImpl$entries$1, reason: invalid class name */
    public static final class AnonymousClass1 implements Map.Entry<String, List<? extends String>>, a {
        private final String key;
        private final List<String> value;

        public AnonymousClass1(StringValuesSingleImpl stringValuesSingleImpl) {
            this.key = stringValuesSingleImpl.getName();
            this.value = stringValuesSingleImpl.getValues();
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e0.areEqual(entry.getKey(), getKey()) && e0.areEqual(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return getKey() + G5.T + getValue();
        }

        @Override // java.util.Map.Entry
        public String getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public List<? extends String> getValue() {
            return this.value;
        }

        /* renamed from: setValue, reason: avoid collision after fix types in other method */
        public List<String> setValue2(List<String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public StringValuesSingleImpl(boolean z10, String name, List<String> values) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
        this.caseInsensitiveName = z10;
        this.name = name;
        this.values = values;
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String name) {
        e0.checkNotNullParameter(name, "name");
        return k0.equals(name, this.name, getCaseInsensitiveName());
    }

    @Override // io.ktor.util.StringValues
    public Set<Map.Entry<String, List<String>>> entries() {
        return b2.setOf(new AnonymousClass1(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) obj;
        if (getCaseInsensitiveName() != stringValues.getCaseInsensitiveName()) {
            return false;
        }
        return StringValuesKt.entriesEquals(entries(), stringValues.entries());
    }

    @Override // io.ktor.util.StringValues
    public void forEach(p body) {
        e0.checkNotNullParameter(body, "body");
        body.invoke(this.name, this.values);
    }

    @Override // io.ktor.util.StringValues
    public String get(String name) {
        e0.checkNotNullParameter(name, "name");
        if (k0.equals(name, this.name, getCaseInsensitiveName())) {
            return (String) y0.firstOrNull((List) this.values);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public List<String> getAll(String name) {
        e0.checkNotNullParameter(name, "name");
        if (k0.equals(this.name, name, getCaseInsensitiveName())) {
            return this.values;
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return StringValuesKt.entriesHashCode(entries(), Boolean.hashCode(getCaseInsensitiveName()) * 31);
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return false;
    }

    @Override // io.ktor.util.StringValues
    public Set<String> names() {
        return b2.setOf(this.name);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("StringValues(case=");
        sb2.append(!getCaseInsensitiveName());
        sb2.append(") ");
        sb2.append(entries());
        return sb2.toString();
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return k0.equals(name, this.name, getCaseInsensitiveName()) && this.values.contains(value);
    }
}

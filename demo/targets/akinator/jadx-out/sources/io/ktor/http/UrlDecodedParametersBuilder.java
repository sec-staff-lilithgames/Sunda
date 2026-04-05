package io.ktor.http;

import io.ktor.util.StringValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class UrlDecodedParametersBuilder implements ParametersBuilder {
    private final boolean caseInsensitiveName;
    private final ParametersBuilder encodedParametersBuilder;

    public UrlDecodedParametersBuilder(ParametersBuilder encodedParametersBuilder) {
        e0.checkNotNullParameter(encodedParametersBuilder, "encodedParametersBuilder");
        this.encodedParametersBuilder = encodedParametersBuilder;
        this.caseInsensitiveName = encodedParametersBuilder.getCaseInsensitiveName();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void append(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        this.encodedParametersBuilder.append(CodecsKt.encodeURLParameter$default(name, false, 1, null), CodecsKt.encodeURLParameterValue(value));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(StringValues stringValues) {
        e0.checkNotNullParameter(stringValues, "stringValues");
        UrlDecodedParametersBuilderKt.appendAllEncoded(this.encodedParametersBuilder, stringValues);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendMissing(StringValues stringValues) {
        e0.checkNotNullParameter(stringValues, "stringValues");
        this.encodedParametersBuilder.appendMissing(UrlDecodedParametersBuilderKt.encodeParameters(stringValues).build());
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void clear() {
        this.encodedParametersBuilder.clear();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(String name) {
        e0.checkNotNullParameter(name, "name");
        return this.encodedParametersBuilder.contains(CodecsKt.encodeURLParameter$default(name, false, 1, null));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public Set<Map.Entry<String, List<String>>> entries() {
        return UrlDecodedParametersBuilderKt.decodeParameters(this.encodedParametersBuilder).entries();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public String get(String name) {
        e0.checkNotNullParameter(name, "name");
        String str = this.encodedParametersBuilder.get(CodecsKt.encodeURLParameter$default(name, false, 1, null));
        if (str != null) {
            return CodecsKt.decodeURLQueryComponent$default(str, 0, 0, true, null, 11, null);
        }
        return null;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public List<String> getAll(String name) {
        e0.checkNotNullParameter(name, "name");
        List<String> all = this.encodedParametersBuilder.getAll(CodecsKt.encodeURLParameter$default(name, false, 1, null));
        if (all == null) {
            return null;
        }
        List<String> list = all;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.decodeURLQueryComponent$default((String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean isEmpty() {
        return this.encodedParametersBuilder.isEmpty();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public Set<String> names() {
        Set<String> setNames = this.encodedParametersBuilder.names();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(setNames, 10));
        Iterator<T> it = setNames.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.decodeURLQueryComponent$default((String) it.next(), 0, 0, false, null, 15, null));
        }
        return y0.toSet(arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void remove(String name) {
        e0.checkNotNullParameter(name, "name");
        this.encodedParametersBuilder.remove(CodecsKt.encodeURLParameter$default(name, false, 1, null));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void removeKeysWithNoEntries() {
        this.encodedParametersBuilder.removeKeysWithNoEntries();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void set(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        this.encodedParametersBuilder.set(CodecsKt.encodeURLParameter$default(name, false, 1, null), CodecsKt.encodeURLParameterValue(value));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(String name, Iterable<String> values) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
        ParametersBuilder parametersBuilder = this.encodedParametersBuilder;
        String strEncodeURLParameter$default = CodecsKt.encodeURLParameter$default(name, false, 1, null);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(values, 10));
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.encodeURLParameterValue(it.next()));
        }
        parametersBuilder.appendAll(strEncodeURLParameter$default, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendMissing(String name, Iterable<String> values) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(values, "values");
        ParametersBuilder parametersBuilder = this.encodedParametersBuilder;
        String strEncodeURLParameter$default = CodecsKt.encodeURLParameter$default(name, false, 1, null);
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(values, 10));
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(CodecsKt.encodeURLParameterValue(it.next()));
        }
        parametersBuilder.appendMissing(strEncodeURLParameter$default, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public Parameters build() {
        return UrlDecodedParametersBuilderKt.decodeParameters(this.encodedParametersBuilder);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return this.encodedParametersBuilder.contains(CodecsKt.encodeURLParameter$default(name, false, 1, null), CodecsKt.encodeURLParameterValue(value));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean remove(String name, String value) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(value, "value");
        return this.encodedParametersBuilder.remove(CodecsKt.encodeURLParameter$default(name, false, 1, null), CodecsKt.encodeURLParameterValue(value));
    }
}

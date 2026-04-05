package io.ktor.http.parsing;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class ParseResult {
    private final Map<String, List<String>> mapping;

    /* JADX WARN: Multi-variable type inference failed */
    public ParseResult(Map<String, ? extends List<String>> mapping) {
        e0.checkNotNullParameter(mapping, "mapping");
        this.mapping = mapping;
    }

    public final boolean contains(String key) {
        e0.checkNotNullParameter(key, "key");
        return this.mapping.containsKey(key);
    }

    public final String get(String key) {
        e0.checkNotNullParameter(key, "key");
        List<String> list = this.mapping.get(key);
        if (list != null) {
            return (String) y0.firstOrNull((List) list);
        }
        return null;
    }

    public final List<String> getAll(String key) {
        e0.checkNotNullParameter(key, "key");
        List<String> list = this.mapping.get(key);
        return list == null ? p0.emptyList() : list;
    }
}

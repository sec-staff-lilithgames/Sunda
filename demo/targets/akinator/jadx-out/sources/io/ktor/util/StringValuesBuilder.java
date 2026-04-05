package io.ktor.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface StringValuesBuilder {
    void append(String str, String str2);

    void appendAll(StringValues stringValues);

    void appendAll(String str, Iterable<String> iterable);

    void appendMissing(StringValues stringValues);

    void appendMissing(String str, Iterable<String> iterable);

    StringValues build();

    void clear();

    boolean contains(String str);

    boolean contains(String str, String str2);

    Set<Map.Entry<String, List<String>>> entries();

    String get(String str);

    List<String> getAll(String str);

    boolean getCaseInsensitiveName();

    boolean isEmpty();

    Set<String> names();

    void remove(String str);

    boolean remove(String str, String str2);

    void removeKeysWithNoEntries();

    void set(String str, String str2);
}

package io.ktor.util;

import java.util.List;
import kotlin.jvm.internal.e0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface Attributes {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DefaultImpls {
        public static <T> T get(Attributes attributes, AttributeKey<T> key) {
            e0.checkNotNullParameter(key, "key");
            T t10 = (T) attributes.getOrNull(key);
            if (t10 != null) {
                return t10;
            }
            throw new IllegalStateException("No instance for key " + key);
        }

        public static <T> T take(Attributes attributes, AttributeKey<T> key) {
            e0.checkNotNullParameter(key, "key");
            T t10 = (T) attributes.get(key);
            attributes.remove(key);
            return t10;
        }

        public static <T> T takeOrNull(Attributes attributes, AttributeKey<T> key) {
            e0.checkNotNullParameter(key, "key");
            T t10 = (T) attributes.getOrNull(key);
            attributes.remove(key);
            return t10;
        }
    }

    <T> T computeIfAbsent(AttributeKey<T> attributeKey, a aVar);

    boolean contains(AttributeKey<?> attributeKey);

    <T> T get(AttributeKey<T> attributeKey);

    List<AttributeKey<?>> getAllKeys();

    <T> T getOrNull(AttributeKey<T> attributeKey);

    <T> void put(AttributeKey<T> attributeKey, T t10);

    <T> void remove(AttributeKey<T> attributeKey);

    <T> T take(AttributeKey<T> attributeKey);

    <T> T takeOrNull(AttributeKey<T> attributeKey);
}

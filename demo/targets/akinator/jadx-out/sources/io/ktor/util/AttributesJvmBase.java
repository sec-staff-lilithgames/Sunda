package io.ktor.util;

import io.ktor.util.Attributes;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
abstract class AttributesJvmBase implements Attributes {
    @Override // io.ktor.util.Attributes
    public final boolean contains(AttributeKey<?> key) {
        e0.checkNotNullParameter(key, "key");
        return getMap().containsKey(key);
    }

    @Override // io.ktor.util.Attributes
    public <T> T get(AttributeKey<T> attributeKey) {
        return (T) Attributes.DefaultImpls.get(this, attributeKey);
    }

    @Override // io.ktor.util.Attributes
    public final List<AttributeKey<?>> getAllKeys() {
        return y0.toList(getMap().keySet());
    }

    public abstract Map<AttributeKey<?>, Object> getMap();

    @Override // io.ktor.util.Attributes
    public final <T> T getOrNull(AttributeKey<T> key) {
        e0.checkNotNullParameter(key, "key");
        return (T) getMap().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.ktor.util.Attributes
    public final <T> void put(AttributeKey<T> key, T value) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(value, "value");
        getMap().put(key, value);
    }

    @Override // io.ktor.util.Attributes
    public final <T> void remove(AttributeKey<T> key) {
        e0.checkNotNullParameter(key, "key");
        getMap().remove(key);
    }

    @Override // io.ktor.util.Attributes
    public <T> T take(AttributeKey<T> attributeKey) {
        return (T) Attributes.DefaultImpls.take(this, attributeKey);
    }

    @Override // io.ktor.util.Attributes
    public <T> T takeOrNull(AttributeKey<T> attributeKey) {
        return (T) Attributes.DefaultImpls.takeOrNull(this, attributeKey);
    }
}

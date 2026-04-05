package io.ktor.util;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import tu.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AttributesKt {
    public static final void putAll(Attributes attributes, Attributes other) {
        e0.checkNotNullParameter(attributes, "<this>");
        e0.checkNotNullParameter(other, "other");
        Iterator<T> it = other.getAllKeys().iterator();
        while (it.hasNext()) {
            AttributeKey attributeKey = (AttributeKey) it.next();
            e0.checkNotNull(attributeKey, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            attributes.put(attributeKey, other.get(attributeKey));
        }
    }

    @f
    public static /* synthetic */ void EquatableAttributeKey$annotations() {
    }
}

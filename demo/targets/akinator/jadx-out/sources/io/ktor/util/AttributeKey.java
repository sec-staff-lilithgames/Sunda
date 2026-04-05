package io.ktor.util;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AttributeKey<T> {
    private final String name;

    public AttributeKey(String name) {
        e0.checkNotNullParameter(name, "name");
        this.name = name;
        if (name.length() == 0) {
            throw new IllegalStateException("Name can't be blank");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && AttributeKey.class == obj.getClass() && e0.areEqual(this.name, ((AttributeKey) obj).name);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public String toString() {
        return "AttributeKey: " + this.name;
    }
}

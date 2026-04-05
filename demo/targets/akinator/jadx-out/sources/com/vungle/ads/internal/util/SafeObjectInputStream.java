package com.vungle.ads.internal.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SafeObjectInputStream extends ObjectInputStream {
    private final List<Class<?>> allowed;

    /* JADX WARN: Multi-variable type inference failed */
    public SafeObjectInputStream(InputStream inputStream, List<? extends Class<?>> list) {
        super(inputStream);
        this.allowed = list;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass desc) throws ClassNotFoundException, IOException {
        e0.checkNotNullParameter(desc, "desc");
        Class<?> c10 = super.resolveClass(desc);
        if (this.allowed == null || Number.class.isAssignableFrom(c10) || e0.areEqual(String.class, c10) || e0.areEqual(Boolean.class, c10) || c10.isArray() || this.allowed.contains(c10)) {
            e0.checkNotNullExpressionValue(c10, "c");
            return c10;
        }
        throw new IOException("Deserialization is not allowed for " + desc.getName());
    }
}

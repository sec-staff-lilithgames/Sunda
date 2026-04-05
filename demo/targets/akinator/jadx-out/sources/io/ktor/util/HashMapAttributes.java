package io.ktor.util;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class HashMapAttributes extends AttributesJvmBase {
    private final Map<AttributeKey<?>, Object> map = new HashMap();

    @Override // io.ktor.util.Attributes
    public <T> T computeIfAbsent(AttributeKey<T> key, a block) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(block, "block");
        T t10 = (T) getMap().get(key);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) block.invoke();
        Object objPut = getMap().put(key, t11);
        if (objPut != null) {
            t11 = (T) objPut;
        }
        e0.checkNotNull(t11, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return t11;
    }

    @Override // io.ktor.util.AttributesJvmBase
    public Map<AttributeKey<?>, Object> getMap() {
        return this.map;
    }
}

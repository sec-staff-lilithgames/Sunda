package io.ktor.util;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import kv.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class ConcurrentSafeAttributes extends AttributesJvmBase {
    private final ConcurrentHashMap<AttributeKey<?>, Object> map = new ConcurrentHashMap<>();

    @Override // io.ktor.util.Attributes
    public <T> T computeIfAbsent(AttributeKey<T> key, a block) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(block, "block");
        T t10 = (T) getMap().get(key);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) block.invoke();
        Object objPutIfAbsent = getMap().putIfAbsent(key, t11);
        if (objPutIfAbsent != null) {
            t11 = (T) objPutIfAbsent;
        }
        e0.checkNotNull(t11, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return t11;
    }

    @Override // io.ktor.util.AttributesJvmBase
    public ConcurrentHashMap<AttributeKey<?>, Object> getMap() {
        return this.map;
    }
}

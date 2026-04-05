package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ClassValueCache<T> implements SerializerCache<T> {
    private final ClassValueReferences<CacheEntry<T>> classValue;
    private final l compute;

    public ClassValueCache(l compute) {
        e0.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public KSerializer<T> get(final KClass<Object> key) {
        e0.checkNotNullParameter(key, "key");
        CacheEntry<T> cacheEntry = this.classValue.get(jv.a.getJavaClass((KClass) key));
        e0.checkNotNullExpressionValue(cacheEntry, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) cacheEntry;
        T t10 = mutableSoftReference.reference.get();
        if (t10 == null) {
            t10 = (T) mutableSoftReference.getOrSetWithLock(new kv.a() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlinx.serialization.internal.CacheEntry] */
                @Override // kv.a
                public final T invoke() {
                    return new CacheEntry((KSerializer) this.this$0.getCompute().invoke(key));
                }
            });
        }
        return t10.serializer;
    }

    public final l getCompute() {
        return this.compute;
    }

    @Override // kotlinx.serialization.internal.SerializerCache
    public boolean isStored(KClass<?> key) {
        e0.checkNotNullParameter(key, "key");
        return this.classValue.isStored(jv.a.getJavaClass((KClass) key));
    }
}

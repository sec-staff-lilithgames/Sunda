package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ClassValueReferences<T> extends ClassValue<MutableSoftReference<T>> {
    @Override // java.lang.ClassValue
    public /* bridge */ /* synthetic */ Object computeValue(Class cls) {
        return computeValue((Class<?>) cls);
    }

    public final T getOrSet(Class<?> key, final kv.a factory) {
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(factory, "factory");
        T t10 = get(key);
        e0.checkNotNullExpressionValue(t10, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) t10;
        T t11 = mutableSoftReference.reference.get();
        return t11 != null ? t11 : (T) mutableSoftReference.getOrSetWithLock(new kv.a() { // from class: kotlinx.serialization.internal.ClassValueReferences.getOrSet.2
            @Override // kv.a
            public final T invoke() {
                return (T) factory.invoke();
            }
        });
    }

    public final boolean isStored(Class<?> key) {
        e0.checkNotNullParameter(key, "key");
        return ((MutableSoftReference) get(key)).reference.get() != null;
    }

    @Override // java.lang.ClassValue
    public MutableSoftReference<T> computeValue(Class<?> type) {
        e0.checkNotNullParameter(type, "type");
        return new MutableSoftReference<>();
    }
}

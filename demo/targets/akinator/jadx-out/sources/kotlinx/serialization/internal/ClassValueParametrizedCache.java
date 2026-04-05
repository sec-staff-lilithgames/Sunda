package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kv.p;
import tu.a0;
import tu.z;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ClassValueParametrizedCache<T> implements ParametrizedSerializerCache<T> {
    private final ClassValueReferences<ParametrizedCacheEntry<T>> classValue;
    private final p compute;

    public ClassValueParametrizedCache(p compute) {
        e0.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    /* renamed from: get-gIAlu-s, reason: not valid java name */
    public Object mo5210getgIAlus(KClass<Object> key, List<? extends KType> types) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(key, "key");
        e0.checkNotNullParameter(types, "types");
        ParametrizedCacheEntry<T> parametrizedCacheEntry = this.classValue.get(jv.a.getJavaClass((KClass) key));
        e0.checkNotNullExpressionValue(parametrizedCacheEntry, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) parametrizedCacheEntry;
        T t10 = mutableSoftReference.reference.get();
        if (t10 == null) {
            t10 = (T) mutableSoftReference.getOrSetWithLock(new kv.a() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
                /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlinx.serialization.internal.ParametrizedCacheEntry] */
                @Override // kv.a
                public final T invoke() {
                    return new ParametrizedCacheEntry();
                }
            });
        }
        ParametrizedCacheEntry parametrizedCacheEntry2 = t10;
        List<? extends KType> list = types;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = parametrizedCacheEntry2.serializers;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl((KSerializer) this.compute.invoke(key, types));
            } catch (Throwable th2) {
                int i11 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
            }
            z zVarM7130boximpl = z.m7130boximpl(objM7131constructorimpl);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, zVarM7130boximpl);
            obj = objPutIfAbsent == null ? zVarM7130boximpl : objPutIfAbsent;
        }
        e0.checkNotNullExpressionValue(obj, "getOrPut(...)");
        return ((z) obj).m7139unboximpl();
    }
}

package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import tu.a0;
import tu.z;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class ParametrizedCacheEntry<T> {
    private final ConcurrentHashMap<List<KTypeWrapper>, z> serializers = new ConcurrentHashMap<>();

    /* renamed from: computeIfAbsent-gIAlu-s, reason: not valid java name */
    public final Object m5213computeIfAbsentgIAlus(List<? extends KType> types, kv.a producer) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(types, "types");
        e0.checkNotNullParameter(producer, "producer");
        List<? extends KType> list = types;
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = this.serializers;
        Object obj = concurrentHashMap.get(arrayList);
        if (obj == null) {
            try {
                int i10 = z.f87419c;
                objM7131constructorimpl = z.m7131constructorimpl((KSerializer) producer.invoke());
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

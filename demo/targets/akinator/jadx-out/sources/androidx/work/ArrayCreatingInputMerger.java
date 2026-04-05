package androidx.work;

import androidx.work.b;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import n6.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class ArrayCreatingInputMerger extends q {
    @Override // n6.q
    public b merge(List<b> inputs) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Object objNewInstance;
        e0.checkNotNullParameter(inputs, "inputs");
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator<b> it = inputs.iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, Object> entry : it.next().getKeyValueMap().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Class cls = value != null ? value.getClass() : String.class;
                Object obj = map.get(key);
                if (obj != null) {
                    Class<?> cls2 = obj.getClass();
                    if (e0.areEqual(cls2, cls)) {
                        e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
                        int length = Array.getLength(obj);
                        int length2 = Array.getLength(value);
                        Class<?> componentType = obj.getClass().getComponentType();
                        e0.checkNotNull(componentType);
                        Object objNewInstance2 = Array.newInstance(componentType, length + length2);
                        System.arraycopy(obj, 0, objNewInstance2, 0, length);
                        System.arraycopy(value, 0, objNewInstance2, length, length2);
                        e0.checkNotNull(objNewInstance2);
                        value = objNewInstance2;
                    } else {
                        if (!e0.areEqual(cls2.getComponentType(), cls)) {
                            throw new IllegalArgumentException();
                        }
                        int length3 = Array.getLength(obj);
                        objNewInstance = Array.newInstance(cls, length3 + 1);
                        System.arraycopy(obj, 0, objNewInstance, 0, length3);
                        Array.set(objNewInstance, length3, value);
                        e0.checkNotNull(objNewInstance);
                        value = objNewInstance;
                    }
                } else if (cls.isArray()) {
                    e0.checkNotNull(value, "null cannot be cast to non-null type kotlin.Any");
                } else {
                    objNewInstance = Array.newInstance(cls, 1);
                    Array.set(objNewInstance, 0, value);
                    e0.checkNotNull(objNewInstance);
                    value = objNewInstance;
                }
                map.put(key, value);
            }
        }
        aVar.putAll(map);
        return aVar.build();
    }
}

package nh;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface q0 extends Map {
    Object forcePut(Object obj, Object obj2);

    q0 inverse();

    @Override // java.util.Map
    Object put(Object obj, Object obj2);

    @Override // java.util.Map
    void putAll(Map<Object, Object> map);

    @Override // nh.q0
    Set<Object> values();
}

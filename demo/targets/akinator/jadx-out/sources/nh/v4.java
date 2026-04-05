package nh;

import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v4 extends i5 {

    /* renamed from: h, reason: collision with root package name */
    public final transient EnumMap f76706h;

    public v4(EnumMap enumMap) {
        this.f76706h = enumMap;
        mh.p1.checkArgument(!enumMap.isEmpty());
    }

    public static m5 i(EnumMap enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return m5.of();
        }
        if (size != 1) {
            return new v4(enumMap);
        }
        Map.Entry entry = (Map.Entry) i7.getOnlyElement(enumMap.entrySet());
        return m5.of((Enum) entry.getKey(), entry.getValue());
    }

    @Override // nh.m5, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f76706h.containsKey(obj);
    }

    @Override // nh.m5, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v4) {
            obj = ((v4) obj).f76706h;
        }
        return this.f76706h.equals(obj);
    }

    @Override // nh.m5
    public final boolean f() {
        return false;
    }

    @Override // nh.m5
    public final ej g() {
        return z7.unmodifiableIterator(this.f76706h.keySet().iterator());
    }

    @Override // nh.m5, java.util.Map
    public Object get(Object obj) {
        return this.f76706h.get(obj);
    }

    @Override // nh.i5
    public final ej h() {
        return new ma(this.f76706h.entrySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f76706h.size();
    }
}

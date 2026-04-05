package nh;

import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c5 extends u5 {
    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 orderKeysBy(Comparator comparator) {
        return orderKeysBy((Comparator<Object>) comparator);
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 orderValuesBy(Comparator comparator) {
        return orderValuesBy((Comparator<Object>) comparator);
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 putAll(Iterable iterable) {
        return putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable);
    }

    @Override // nh.u5
    public d5 build() {
        return (d5) super.build();
    }

    @Override // nh.u5
    public c5 expectedValuesPerKey(int i10) {
        super.expectedValuesPerKey(i10);
        return this;
    }

    @Override // nh.u5
    public c5 orderKeysBy(Comparator<Object> comparator) {
        super.orderKeysBy(comparator);
        return this;
    }

    @Override // nh.u5
    public c5 orderValuesBy(Comparator<Object> comparator) {
        super.orderValuesBy(comparator);
        return this;
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 put(Map.Entry entry) {
        return put((Map.Entry<Object, Object>) entry);
    }

    @Override // nh.u5
    public /* bridge */ /* synthetic */ u5 putAll(Object obj, Iterable iterable) {
        return putAll(obj, (Iterable<Object>) iterable);
    }

    @Override // nh.u5
    public c5 put(Object obj, Object obj2) {
        super.put(obj, obj2);
        return this;
    }

    @Override // nh.u5
    public c5 put(Map.Entry<Object, Object> entry) {
        super.put(entry);
        return this;
    }

    @Override // nh.u5
    public c5 putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
        super.putAll(iterable);
        return this;
    }

    @Override // nh.u5
    public c5 putAll(Object obj, Iterable<Object> iterable) {
        super.putAll(obj, iterable);
        return this;
    }

    @Override // nh.u5
    public c5 putAll(Object obj, Object... objArr) {
        super.putAll(obj, objArr);
        return this;
    }

    @Override // nh.u5
    public c5 putAll(fc fcVar) {
        super.putAll(fcVar);
        return this;
    }
}

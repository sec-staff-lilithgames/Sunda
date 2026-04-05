package nh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q4 extends g5 {
    @Override // nh.g5
    public final g5 b(g5 g5Var) {
        super.b(g5Var);
        return this;
    }

    public final void e(q4 q4Var) {
        super.b(q4Var);
    }

    @Override // nh.g5
    public /* bridge */ /* synthetic */ g5 orderEntriesByValue(Comparator comparator) {
        return orderEntriesByValue((Comparator<Object>) comparator);
    }

    @Override // nh.g5
    public /* bridge */ /* synthetic */ g5 putAll(Iterable iterable) {
        return putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable);
    }

    @Override // nh.g5
    public r4 build() {
        return buildOrThrow();
    }

    @Override // nh.g5
    @Deprecated
    public r4 buildKeepingLast() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    @Override // nh.g5
    public r4 buildOrThrow() {
        int i10 = this.f76286c;
        if (i10 == 0) {
            return r4.of();
        }
        if (this.f76284a != null) {
            if (this.f76287d) {
                this.f76285b = Arrays.copyOf(this.f76285b, i10 * 2);
            }
            Object[] objArr = this.f76285b;
            g5.d(this.f76284a, this.f76286c, objArr);
        }
        this.f76287d = true;
        return new ef(this.f76285b, this.f76286c);
    }

    @Override // nh.g5
    public q4 orderEntriesByValue(Comparator<Object> comparator) {
        super.orderEntriesByValue(comparator);
        return this;
    }

    @Override // nh.g5
    public /* bridge */ /* synthetic */ g5 put(Map.Entry entry) {
        return put((Map.Entry<Object, Object>) entry);
    }

    @Override // nh.g5
    public /* bridge */ /* synthetic */ g5 putAll(Map map) {
        return putAll((Map<Object, Object>) map);
    }

    @Override // nh.g5
    public q4 put(Object obj, Object obj2) {
        super.put(obj, obj2);
        return this;
    }

    @Override // nh.g5
    public q4 putAll(Map<Object, Object> map) {
        super.putAll(map);
        return this;
    }

    @Override // nh.g5
    public q4 put(Map.Entry<Object, Object> entry) {
        super.put(entry);
        return this;
    }

    @Override // nh.g5
    public q4 putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
        super.putAll(iterable);
        return this;
    }
}

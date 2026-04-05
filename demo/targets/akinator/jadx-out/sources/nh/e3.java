package nh;

import java.io.Serializable;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e3 extends we implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final m5 f76203b;

    public e3(List list) {
        this.f76203b = ec.f(list);
    }

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        m5 m5Var = this.f76203b;
        Integer num = (Integer) m5Var.get(obj);
        if (num == null) {
            throw new ve(obj);
        }
        int iIntValue = num.intValue();
        Integer num2 = (Integer) m5Var.get(obj2);
        if (num2 != null) {
            return iIntValue - num2.intValue();
        }
        throw new ve(obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj instanceof e3) {
            return this.f76203b.equals(((e3) obj).f76203b);
        }
        return false;
    }

    public int hashCode() {
        return this.f76203b.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.f76203b.keySet() + ")";
    }
}

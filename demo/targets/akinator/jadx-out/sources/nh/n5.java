package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class n5 extends l6 {
    @Override // nh.u4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = j().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // nh.l6, java.util.Collection, java.util.Set
    public int hashCode() {
        return j().hashCode();
    }

    @Override // nh.l6
    public final boolean i() {
        return j().e();
    }

    @Override // nh.u4
    public final boolean isPartialView() {
        return j().f();
    }

    public abstract m5 j();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return j().size();
    }
}

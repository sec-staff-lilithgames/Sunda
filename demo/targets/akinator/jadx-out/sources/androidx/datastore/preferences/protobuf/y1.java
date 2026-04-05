package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class y1 extends z1 {

    /* renamed from: e, reason: collision with root package name */
    public final r2 f6134e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Iterator {

        /* renamed from: b, reason: collision with root package name */
        public final Iterator f6135b;

        public a(Iterator<Map.Entry<Object, Object>> it) {
            this.f6135b = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f6135b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f6135b.remove();
        }

        @Override // java.util.Iterator
        public Map.Entry<Object, Object> next() {
            Map.Entry<Object, Object> entry = (Map.Entry) this.f6135b.next();
            if (!(entry.getValue() instanceof y1)) {
                return entry;
            }
            x1 x1Var = new x1();
            x1Var.f6115b = entry;
            return x1Var;
        }
    }

    public y1(r2 r2Var, s0 s0Var, x xVar) {
        super(s0Var, xVar);
        this.f6134e = r2Var;
    }

    @Override // androidx.datastore.preferences.protobuf.z1
    public boolean containsDefaultInstance() {
        return super.containsDefaultInstance() || this.f6156c == this.f6134e;
    }

    @Override // androidx.datastore.preferences.protobuf.z1
    public boolean equals(Object obj) {
        return getValue().equals(obj);
    }

    public r2 getValue() {
        return getValue(this.f6134e);
    }

    @Override // androidx.datastore.preferences.protobuf.z1
    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}

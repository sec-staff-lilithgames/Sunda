package androidx.datastore.preferences.protobuf;

import com.ironsource.C3191e4;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s3 implements Map.Entry, Comparable {

    /* renamed from: b, reason: collision with root package name */
    public final Comparable f5991b;

    /* renamed from: c, reason: collision with root package name */
    public Object f5992c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v3 f5993e;

    public s3(v3 v3Var, Comparable comparable, Object obj) {
        this.f5993e = v3Var;
        this.f5991b = comparable;
        this.f5992c = obj;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f5991b;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f5992c;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f5992c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Comparable comparable = this.f5991b;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f5992c;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        this.f5993e.b();
        Object obj2 = this.f5992c;
        this.f5992c = obj;
        return obj2;
    }

    public String toString() {
        return this.f5991b + C3191e4.i.f36525b + this.f5992c;
    }

    @Override // java.lang.Comparable
    public int compareTo(s3 s3Var) {
        return getKey().compareTo(s3Var.getKey());
    }

    @Override // java.util.Map.Entry
    public Comparable<Object> getKey() {
        return this.f5991b;
    }
}

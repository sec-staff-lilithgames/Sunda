package u0;

import com.ironsource.G5;
import java.util.Map;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b implements Map.Entry, lv.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f87474b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f87475c;

    public b(Object obj, Object obj2) {
        this.f87474b = obj;
        this.f87475c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && e0.areEqual(entry.getKey(), getKey()) && e0.areEqual(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f87474b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f87475c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append(G5.T);
        sb2.append(getValue());
        return sb2.toString();
    }
}

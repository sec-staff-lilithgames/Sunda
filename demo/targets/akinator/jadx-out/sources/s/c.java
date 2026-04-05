package s;

import com.ironsource.C3191e4;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public final Object f85133b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f85134c;

    /* renamed from: e, reason: collision with root package name */
    public c f85135e;

    /* renamed from: f, reason: collision with root package name */
    public c f85136f;

    public c(Object obj, Object obj2) {
        this.f85133b = obj;
        this.f85134c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f85133b.equals(cVar.f85133b) && this.f85134c.equals(cVar.f85134c);
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f85133b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f85134c;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        return this.f85133b.hashCode() ^ this.f85134c.hashCode();
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public String toString() {
        return this.f85133b + C3191e4.i.f36525b + this.f85134c;
    }
}

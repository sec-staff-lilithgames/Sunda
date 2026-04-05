package u0;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a extends uu.q {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry<Object, Object>) obj);
        }
        return false;
    }

    public abstract boolean containsEntry(Map.Entry<Object, Object> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return remove((Map.Entry<Object, Object>) obj);
        }
        return false;
    }

    public abstract boolean removeEntry(Map.Entry<Object, Object> entry);

    public final boolean contains(Map.Entry<Object, Object> entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return containsEntry(entry);
    }

    public final boolean remove(Map.Entry<Object, Object> entry) {
        if ((entry != null ? entry : null) == null) {
            return false;
        }
        return removeEntry(entry);
    }
}

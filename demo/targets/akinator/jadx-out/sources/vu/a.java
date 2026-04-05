package vu;

import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a extends q {
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
            return remove((Map.Entry<?, ?>) obj);
        }
        return false;
    }

    public final boolean contains(Map.Entry<Object, Object> element) {
        e0.checkNotNullParameter(element, "element");
        return containsEntry(element);
    }

    public /* bridge */ boolean remove(Map.Entry<?, ?> entry) {
        return super.remove((Object) entry);
    }
}

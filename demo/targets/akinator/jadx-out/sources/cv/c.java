package cv;

import java.io.Serializable;
import kotlin.jvm.internal.e0;
import uu.g;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends g implements a, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Enum[] f51105b;

    public c(Enum<Object>[] entries) {
        e0.checkNotNullParameter(entries, "entries");
        this.f51105b = entries;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((Enum<Object>) obj);
        }
        return false;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.f51105b.length;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((Enum<Object>) obj);
        }
        return -1;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((Enum<Object>) obj);
        }
        return -1;
    }

    public boolean contains(Enum<Object> element) {
        e0.checkNotNullParameter(element, "element");
        return ((Enum) k0.getOrNull(this.f51105b, element.ordinal())) == element;
    }

    @Override // uu.g, java.util.List
    public Enum<Object> get(int i10) {
        uu.c cVar = g.Companion;
        Enum<Object>[] enumArr = this.f51105b;
        cVar.checkElementIndex$kotlin_stdlib(i10, enumArr.length);
        return enumArr[i10];
    }

    public int indexOf(Enum<Object> element) {
        e0.checkNotNullParameter(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) k0.getOrNull(this.f51105b, iOrdinal)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    public int lastIndexOf(Enum<Object> element) {
        e0.checkNotNullParameter(element, "element");
        return indexOf(element);
    }
}

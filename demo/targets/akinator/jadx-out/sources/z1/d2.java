package z1;

import java.util.Comparator;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d2 extends TreeSet {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(Comparator<Object> comparator) {
        super(comparator);
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.TreeSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }
}

package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class CollectionSerializer<E, C extends Collection<? extends E>, B> extends CollectionLikeSerializer<E, C, B> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionSerializer(KSerializer<E> element) {
        super(element, null);
        e0.checkNotNullParameter(element, "element");
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Iterator<E> collectionIterator(C c10) {
        e0.checkNotNullParameter(c10, "<this>");
        return c10.iterator();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int collectionSize(C c10) {
        e0.checkNotNullParameter(c10, "<this>");
        return c10.size();
    }
}

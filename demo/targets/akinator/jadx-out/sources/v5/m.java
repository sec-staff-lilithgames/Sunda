package v5;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m {
    public static final <T> ArrayList<T> toArrayListUnsafe(Collection<?> collection) {
        e0.checkNotNullParameter(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }
}

package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface s1 extends List, RandomAccess {
    boolean isModifiable();

    void makeImmutable();

    s1 mutableCopyWithCapacity(int i10);
}

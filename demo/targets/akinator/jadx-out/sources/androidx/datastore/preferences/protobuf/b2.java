package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface b2 {
    void makeImmutableListAt(Object obj, long j10);

    <L> void mergeListsAt(Object obj, Object obj2, long j10);

    <L> List<L> mutableListAt(Object obj, long j10);
}

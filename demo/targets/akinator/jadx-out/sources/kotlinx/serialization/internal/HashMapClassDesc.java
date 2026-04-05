package kotlinx.serialization.internal;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class HashMapClassDesc extends MapLikeDescriptor {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashMapClassDesc(SerialDescriptor keyDesc, SerialDescriptor valueDesc) {
        super(CollectionDescriptorsKt.HASH_MAP_NAME, keyDesc, valueDesc, null);
        e0.checkNotNullParameter(keyDesc, "keyDesc");
        e0.checkNotNullParameter(valueDesc, "valueDesc");
    }
}

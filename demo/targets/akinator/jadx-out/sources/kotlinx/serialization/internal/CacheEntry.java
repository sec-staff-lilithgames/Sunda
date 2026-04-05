package kotlinx.serialization.internal;

import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class CacheEntry<T> {
    public final KSerializer<T> serializer;

    public CacheEntry(KSerializer<T> kSerializer) {
        this.serializer = kSerializer;
    }
}

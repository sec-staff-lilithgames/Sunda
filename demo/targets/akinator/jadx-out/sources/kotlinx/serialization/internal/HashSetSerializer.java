package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class HashSetSerializer<E> extends CollectionSerializer<E, Set<? extends E>, HashSet<E>> {
    private final SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashSetSerializer(KSerializer<E> eSerializer) {
        super(eSerializer);
        e0.checkNotNullParameter(eSerializer, "eSerializer");
        this.descriptor = new HashSetClassDesc(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void checkCapacity(HashSet<E> hashSet, int i10) {
        e0.checkNotNullParameter(hashSet, "<this>");
    }

    @Override // kotlinx.serialization.internal.CollectionLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.CollectionLikeSerializer
    public /* bridge */ /* synthetic */ void insert(Object obj, int i10, Object obj2) {
        insert((HashSet<int>) obj, i10, (int) obj2);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public Set<E> toResult(HashSet<E> hashSet) {
        e0.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public HashSet<E> builder() {
        return new HashSet<>();
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public int builderSize(HashSet<E> hashSet) {
        e0.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    public void insert(HashSet<E> hashSet, int i10, E e10) {
        e0.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(e10);
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public HashSet<E> toBuilder(Set<? extends E> set) {
        e0.checkNotNullParameter(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        return hashSet == null ? new HashSet<>(set) : hashSet;
    }
}

package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class CollectionLikeSerializer<Element, Collection, Builder> extends AbstractCollectionSerializer<Element, Collection, Builder> {
    private final KSerializer<Element> elementSerializer;

    public /* synthetic */ CollectionLikeSerializer(KSerializer kSerializer, u uVar) {
        this(kSerializer);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public abstract SerialDescriptor getDescriptor();

    public abstract void insert(Builder builder, int i10, Element element);

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void readAll(CompositeDecoder decoder, Builder builder, int i10, int i11) {
        e0.checkNotNullParameter(decoder, "decoder");
        if (i11 < 0) {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            readElement(decoder, i10 + i12, builder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public void readElement(CompositeDecoder decoder, int i10, Builder builder, boolean z10) {
        e0.checkNotNullParameter(decoder, "decoder");
        insert(builder, i10, CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, getDescriptor(), i10, this.elementSerializer, null, 8, null));
    }

    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer, kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Collection collection) {
        e0.checkNotNullParameter(encoder, "encoder");
        int iCollectionSize = collectionSize(collection);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(descriptor, iCollectionSize);
        Iterator<Element> itCollectionIterator = collectionIterator(collection);
        for (int i10 = 0; i10 < iCollectionSize; i10++) {
            compositeEncoderBeginCollection.encodeSerializableElement(getDescriptor(), i10, this.elementSerializer, itCollectionIterator.next());
        }
        compositeEncoderBeginCollection.endStructure(descriptor);
    }

    private CollectionLikeSerializer(KSerializer<Element> kSerializer) {
        super(null);
        this.elementSerializer = kSerializer;
    }
}

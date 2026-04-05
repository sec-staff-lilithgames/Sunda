package kotlinx.serialization.internal;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalSerializationApi
/* loaded from: classes10.dex */
public abstract class AbstractCollectionSerializer<Element, Collection, Builder> implements KSerializer<Collection> {
    public /* synthetic */ AbstractCollectionSerializer(u uVar) {
        this();
    }

    public static /* synthetic */ void readElement$default(AbstractCollectionSerializer abstractCollectionSerializer, CompositeDecoder compositeDecoder, int i10, Object obj, boolean z10, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readElement");
        }
        if ((i11 & 8) != 0) {
            z10 = true;
        }
        abstractCollectionSerializer.readElement(compositeDecoder, i10, obj, z10);
    }

    private final int readSize(CompositeDecoder compositeDecoder, Builder builder) {
        int iDecodeCollectionSize = compositeDecoder.decodeCollectionSize(getDescriptor());
        checkCapacity(builder, iDecodeCollectionSize);
        return iDecodeCollectionSize;
    }

    public abstract Builder builder();

    public abstract int builderSize(Builder builder);

    public abstract void checkCapacity(Builder builder, int i10);

    public abstract Iterator<Element> collectionIterator(Collection collection);

    public abstract int collectionSize(Collection collection);

    @Override // kotlinx.serialization.DeserializationStrategy
    public Collection deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        return merge(decoder, null);
    }

    @InternalSerializationApi
    public final Collection merge(Decoder decoder, Collection collection) {
        Builder builder;
        e0.checkNotNullParameter(decoder, "decoder");
        if (collection == null || (builder = toBuilder(collection)) == null) {
            builder = builder();
        }
        Builder builder2 = builder;
        int iBuilderSize = builderSize(builder2);
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(getDescriptor());
        if (!compositeDecoderBeginStructure.decodeSequentially()) {
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    break;
                }
                readElement$default(this, compositeDecoderBeginStructure, iBuilderSize + iDecodeElementIndex, builder2, false, 8, null);
            }
        } else {
            readAll(compositeDecoderBeginStructure, builder2, iBuilderSize, readSize(compositeDecoderBeginStructure, builder2));
        }
        compositeDecoderBeginStructure.endStructure(getDescriptor());
        return toResult(builder2);
    }

    public abstract void readAll(CompositeDecoder compositeDecoder, Builder builder, int i10, int i11);

    public abstract void readElement(CompositeDecoder compositeDecoder, int i10, Builder builder, boolean z10);

    @Override // kotlinx.serialization.SerializationStrategy
    public abstract void serialize(Encoder encoder, Collection collection);

    public abstract Builder toBuilder(Collection collection);

    public abstract Collection toResult(Builder builder);

    private AbstractCollectionSerializer() {
    }
}

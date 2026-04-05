package kotlinx.serialization.encoding;

import java.util.Collection;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kv.l;
import kv.q;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class EncodingKt {
    public static final void encodeCollection(Encoder encoder, SerialDescriptor descriptor, int i10, l block) {
        e0.checkNotNullParameter(encoder, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(block, "block");
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(descriptor, i10);
        block.invoke(compositeEncoderBeginCollection);
        compositeEncoderBeginCollection.endStructure(descriptor);
    }

    public static final void encodeStructure(Encoder encoder, SerialDescriptor descriptor, l block) {
        e0.checkNotNullParameter(encoder, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(block, "block");
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        block.invoke(compositeEncoderBeginStructure);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }

    public static final <E> void encodeCollection(Encoder encoder, SerialDescriptor descriptor, Collection<? extends E> collection, q block) {
        e0.checkNotNullParameter(encoder, "<this>");
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(collection, "collection");
        e0.checkNotNullParameter(block, "block");
        CompositeEncoder compositeEncoderBeginCollection = encoder.beginCollection(descriptor, collection.size());
        int i10 = 0;
        for (Object obj : collection) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            block.invoke(compositeEncoderBeginCollection, Integer.valueOf(i10), obj);
            i10 = i11;
        }
        compositeEncoderBeginCollection.endStructure(descriptor);
    }
}

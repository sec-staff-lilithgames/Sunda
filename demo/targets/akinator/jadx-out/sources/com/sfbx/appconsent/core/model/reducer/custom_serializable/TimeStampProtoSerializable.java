package com.sfbx.appconsent.core.model.reducer.custom_serializable;

import com.google.protobuf.Timestamp;
import com.sfbx.appconsent.core.model.reducer.TimestampSurrogate;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TimeStampProtoSerializable implements KSerializer<Timestamp> {
    public static final TimeStampProtoSerializable INSTANCE = new TimeStampProtoSerializable();

    private TimeStampProtoSerializable() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return TimestampSurrogate.Companion.serializer().getDescriptor();
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public Timestamp deserialize(Decoder decoder) {
        e0.checkNotNullParameter(decoder, "decoder");
        TimestampSurrogate timestampSurrogate = (TimestampSurrogate) decoder.decodeSerializableValue(TimestampSurrogate.Companion.serializer());
        Timestamp timestampBuild = Timestamp.newBuilder().setNanos(timestampSurrogate.getNanos()).setSeconds(timestampSurrogate.getSeconds()).build();
        e0.checkNotNullExpressionValue(timestampBuild, "newBuilder()\n           …nds)\n            .build()");
        return timestampBuild;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, Timestamp value) {
        e0.checkNotNullParameter(encoder, "encoder");
        e0.checkNotNullParameter(value, "value");
        encoder.encodeSerializableValue(TimestampSurrogate.Companion.serializer(), new TimestampSurrogate(value.getNanos(), value.getSeconds()));
    }
}

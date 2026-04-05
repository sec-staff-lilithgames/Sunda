package kotlinx.serialization;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface StringFormat extends SerialFormat {
    <T> T decodeFromString(DeserializationStrategy<? extends T> deserializationStrategy, String str);

    <T> String encodeToString(SerializationStrategy<? super T> serializationStrategy, T t10);
}

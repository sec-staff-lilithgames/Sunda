package kotlinx.serialization;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KType;
import kotlinx.serialization.internal.InternalHexConverter;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class SerialFormatKt {
    public static final /* synthetic */ <T> T decodeFromByteArray(BinaryFormat binaryFormat, byte[] bytes) {
        e0.checkNotNullParameter(binaryFormat, "<this>");
        e0.checkNotNullParameter(bytes, "bytes");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) binaryFormat.decodeFromByteArray(SerializersKt.serializer(serializersModule, (KType) null), bytes);
    }

    public static final <T> T decodeFromHexString(BinaryFormat binaryFormat, DeserializationStrategy<? extends T> deserializer, String hex) {
        e0.checkNotNullParameter(binaryFormat, "<this>");
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(hex, "hex");
        return (T) binaryFormat.decodeFromByteArray(deserializer, InternalHexConverter.INSTANCE.parseHexBinary(hex));
    }

    public static final /* synthetic */ <T> T decodeFromString(StringFormat stringFormat, String string) {
        e0.checkNotNullParameter(stringFormat, "<this>");
        e0.checkNotNullParameter(string, "string");
        SerializersModule serializersModule = stringFormat.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) stringFormat.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), string);
    }

    public static final /* synthetic */ <T> byte[] encodeToByteArray(BinaryFormat binaryFormat, T t10) {
        e0.checkNotNullParameter(binaryFormat, "<this>");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return binaryFormat.encodeToByteArray(SerializersKt.serializer(serializersModule, (KType) null), t10);
    }

    public static final <T> String encodeToHexString(BinaryFormat binaryFormat, SerializationStrategy<? super T> serializer, T t10) {
        e0.checkNotNullParameter(binaryFormat, "<this>");
        e0.checkNotNullParameter(serializer, "serializer");
        return InternalHexConverter.INSTANCE.printHexBinary(binaryFormat.encodeToByteArray(serializer, t10), true);
    }

    public static final /* synthetic */ <T> String encodeToString(StringFormat stringFormat, T t10) {
        e0.checkNotNullParameter(stringFormat, "<this>");
        SerializersModule serializersModule = stringFormat.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return stringFormat.encodeToString(SerializersKt.serializer(serializersModule, (KType) null), t10);
    }

    public static final /* synthetic */ <T> T decodeFromHexString(BinaryFormat binaryFormat, String hex) {
        e0.checkNotNullParameter(binaryFormat, "<this>");
        e0.checkNotNullParameter(hex, "hex");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromHexString(binaryFormat, SerializersKt.serializer(serializersModule, (KType) null), hex);
    }

    public static final /* synthetic */ <T> String encodeToHexString(BinaryFormat binaryFormat, T t10) {
        e0.checkNotNullParameter(binaryFormat, "<this>");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToHexString(binaryFormat, SerializersKt.serializer(serializersModule, (KType) null), t10);
    }
}

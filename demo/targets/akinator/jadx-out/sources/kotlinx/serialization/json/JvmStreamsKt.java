package kotlinx.serialization.json;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KType;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.internal.JavaStreamSerialReader;
import kotlinx.serialization.json.internal.JsonStreamsKt;
import kotlinx.serialization.json.internal.JsonToJavaStreamWriter;
import kotlinx.serialization.modules.SerializersModule;
import rv.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JvmStreamsKt {
    @ExperimentalSerializationApi
    public static final <T> T decodeFromStream(Json json, DeserializationStrategy<? extends T> deserializer, InputStream stream) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(stream, "stream");
        JavaStreamSerialReader javaStreamSerialReader = new JavaStreamSerialReader(stream);
        try {
            return (T) JsonStreamsKt.decodeByReader(json, deserializer, javaStreamSerialReader);
        } finally {
            javaStreamSerialReader.release();
        }
    }

    @ExperimentalSerializationApi
    public static final <T> t decodeToSequence(Json json, InputStream stream, DeserializationStrategy<? extends T> deserializer, DecodeSequenceMode format) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(stream, "stream");
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(format, "format");
        return JsonStreamsKt.decodeToSequenceByReader(json, new JavaStreamSerialReader(stream), deserializer, format);
    }

    public static /* synthetic */ t decodeToSequence$default(Json json, InputStream inputStream, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequence(json, inputStream, deserializationStrategy, decodeSequenceMode);
    }

    @ExperimentalSerializationApi
    public static final <T> void encodeToStream(Json json, SerializationStrategy<? super T> serializer, T t10, OutputStream stream) throws IOException {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(serializer, "serializer");
        e0.checkNotNullParameter(stream, "stream");
        JsonToJavaStreamWriter jsonToJavaStreamWriter = new JsonToJavaStreamWriter(stream);
        try {
            JsonStreamsKt.encodeByWriter(json, jsonToJavaStreamWriter, serializer, t10);
        } finally {
            jsonToJavaStreamWriter.release();
        }
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> t decodeToSequence(Json json, InputStream stream, DecodeSequenceMode format) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(stream, "stream");
        e0.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(json, stream, SerializersKt.serializer(serializersModule, (KType) null), format);
    }

    public static /* synthetic */ t decodeToSequence$default(Json json, InputStream stream, DecodeSequenceMode format, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(stream, "stream");
        e0.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequence(json, stream, SerializersKt.serializer(serializersModule, (KType) null), format);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> T decodeFromStream(Json json, InputStream stream) {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(stream, "stream");
        SerializersModule serializersModule = json.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromStream(json, SerializersKt.serializer(serializersModule, (KType) null), stream);
    }

    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> void encodeToStream(Json json, T t10, OutputStream stream) throws IOException {
        e0.checkNotNullParameter(json, "<this>");
        e0.checkNotNullParameter(stream, "stream");
        SerializersModule serializersModule = json.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        encodeToStream(json, SerializersKt.serializer(serializersModule, (KType) null), t10, stream);
    }
}

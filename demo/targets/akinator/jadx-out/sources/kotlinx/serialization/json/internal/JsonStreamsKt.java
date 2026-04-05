package kotlinx.serialization.json.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h0;
import kotlin.reflect.KType;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.modules.SerializersModule;
import rv.t;
import rv.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonStreamsKt {
    private static final int HIGH_SURROGATE_HEADER = 55232;
    private static final int LOW_SURROGATE_HEADER = 56320;
    private static final int SINGLE_CHAR_MAX_CODEPOINT = 65535;

    @JsonFriendModuleApi
    public static final <T> T decodeByReader(Json json, DeserializationStrategy<? extends T> deserializer, InternalJsonReader reader) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(reader, "reader");
        ReaderJsonLexer readerJsonLexerReaderJsonLexer$default = ReaderJsonLexerKt.ReaderJsonLexer$default(json, reader, null, 4, null);
        try {
            T t10 = (T) new StreamingJsonDecoder(json, WriteMode.OBJ, readerJsonLexerReaderJsonLexer$default, deserializer.getDescriptor(), null).decodeSerializableValue(deserializer);
            readerJsonLexerReaderJsonLexer$default.expectEof();
            return t10;
        } finally {
            readerJsonLexerReaderJsonLexer$default.release();
        }
    }

    @JsonFriendModuleApi
    @ExperimentalSerializationApi
    public static final <T> t decodeToSequenceByReader(Json json, InternalJsonReader reader, DeserializationStrategy<? extends T> deserializer, DecodeSequenceMode format) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(reader, "reader");
        e0.checkNotNullParameter(deserializer, "deserializer");
        e0.checkNotNullParameter(format, "format");
        final Iterator itJsonIterator = JsonIteratorKt.JsonIterator(format, json, ReaderJsonLexerKt.ReaderJsonLexer(json, reader, new char[16384]), deserializer);
        return y.constrainOnce(new t() { // from class: kotlinx.serialization.json.internal.JsonStreamsKt$decodeToSequenceByReader$$inlined$Sequence$1
            @Override // rv.t
            public Iterator<T> iterator() {
                return itJsonIterator;
            }
        });
    }

    public static /* synthetic */ t decodeToSequenceByReader$default(Json json, InternalJsonReader internalJsonReader, DeserializationStrategy deserializationStrategy, DecodeSequenceMode decodeSequenceMode, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return decodeToSequenceByReader(json, internalJsonReader, deserializationStrategy, decodeSequenceMode);
    }

    @JsonFriendModuleApi
    public static final <T> void encodeByWriter(Json json, InternalJsonWriter writer, SerializationStrategy<? super T> serializer, T t10) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(writer, "writer");
        e0.checkNotNullParameter(serializer, "serializer");
        new StreamingJsonEncoder(writer, json, WriteMode.OBJ, new JsonEncoder[WriteMode.getEntries().size()]).encodeSerializableValue(serializer, t10);
    }

    public static /* synthetic */ t decodeToSequenceByReader$default(Json json, InternalJsonReader reader, DecodeSequenceMode format, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(reader, "reader");
        e0.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, reader, SerializersKt.serializer(serializersModule, (KType) null), format);
    }

    @JsonFriendModuleApi
    @ExperimentalSerializationApi
    public static final /* synthetic */ <T> t decodeToSequenceByReader(Json json, InternalJsonReader reader, DecodeSequenceMode format) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(reader, "reader");
        e0.checkNotNullParameter(format, "format");
        SerializersModule serializersModule = json.getSerializersModule();
        e0.reifiedOperationMarker(6, RequestConfiguration.MAX_AD_CONTENT_RATING_T);
        h0.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return decodeToSequenceByReader(json, reader, SerializersKt.serializer(serializersModule, (KType) null), format);
    }
}

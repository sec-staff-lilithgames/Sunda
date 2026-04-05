package kotlinx.serialization.json.internal;

import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.DecodeSequenceMode;
import kotlinx.serialization.json.Json;
import tu.k;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonIteratorKt {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DecodeSequenceMode.values().length];
            try {
                iArr[DecodeSequenceMode.WHITESPACE_SEPARATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DecodeSequenceMode.ARRAY_WRAPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DecodeSequenceMode.AUTO_DETECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final <T> Iterator<T> JsonIterator(DecodeSequenceMode mode, Json json, ReaderJsonLexer lexer, DeserializationStrategy<? extends T> deserializer) {
        e0.checkNotNullParameter(mode, "mode");
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(lexer, "lexer");
        e0.checkNotNullParameter(deserializer, "deserializer");
        int i10 = WhenMappings.$EnumSwitchMapping$0[determineFormat(lexer, mode).ordinal()];
        if (i10 == 1) {
            return new JsonIteratorWsSeparated(json, lexer, deserializer);
        }
        if (i10 == 2) {
            return new JsonIteratorArrayWrapped(json, lexer, deserializer);
        }
        if (i10 != 3) {
            throw new t();
        }
        throw new IllegalStateException("AbstractJsonLexer.determineFormat must be called beforehand.");
    }

    private static final DecodeSequenceMode determineFormat(AbstractJsonLexer abstractJsonLexer, DecodeSequenceMode decodeSequenceMode) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[decodeSequenceMode.ordinal()];
        if (i10 == 1) {
            return DecodeSequenceMode.WHITESPACE_SEPARATED;
        }
        if (i10 != 2) {
            if (i10 == 3) {
                return tryConsumeStartArray(abstractJsonLexer) ? DecodeSequenceMode.ARRAY_WRAPPED : DecodeSequenceMode.WHITESPACE_SEPARATED;
            }
            throw new t();
        }
        if (tryConsumeStartArray(abstractJsonLexer)) {
            return DecodeSequenceMode.ARRAY_WRAPPED;
        }
        AbstractJsonLexer.fail$kotlinx_serialization_json$default(abstractJsonLexer, (byte) 8, false, 2, null);
        throw new k();
    }

    private static final boolean tryConsumeStartArray(AbstractJsonLexer abstractJsonLexer) {
        if (abstractJsonLexer.peekNextToken() != 8) {
            return false;
        }
        abstractJsonLexer.consumeNextToken((byte) 8);
        return true;
    }
}

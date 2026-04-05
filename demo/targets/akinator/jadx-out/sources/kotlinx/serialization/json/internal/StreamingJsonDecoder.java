package kotlinx.serialization.json.internal;

import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.ChunkedDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.modules.SerializersModule;
import kv.l;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class StreamingJsonDecoder extends AbstractDecoder implements JsonDecoder, ChunkedDecoder {
    private final JsonConfiguration configuration;
    private int currentIndex;
    private DiscriminatorHolder discriminatorHolder;
    private final JsonElementMarker elementMarker;
    private final Json json;
    public final AbstractJsonLexer lexer;
    private final WriteMode mode;
    private final SerializersModule serializersModule;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DiscriminatorHolder {
        public String discriminatorToSkip;

        public DiscriminatorHolder(String str) {
            this.discriminatorToSkip = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StreamingJsonDecoder(Json json, WriteMode mode, AbstractJsonLexer lexer, SerialDescriptor descriptor, DiscriminatorHolder discriminatorHolder) {
        e0.checkNotNullParameter(json, "json");
        e0.checkNotNullParameter(mode, "mode");
        e0.checkNotNullParameter(lexer, "lexer");
        e0.checkNotNullParameter(descriptor, "descriptor");
        this.json = json;
        this.mode = mode;
        this.lexer = lexer;
        this.serializersModule = json.getSerializersModule();
        this.currentIndex = -1;
        this.discriminatorHolder = discriminatorHolder;
        JsonConfiguration configuration = json.getConfiguration();
        this.configuration = configuration;
        this.elementMarker = configuration.getExplicitNulls() ? null : new JsonElementMarker(descriptor);
    }

    private final void checkLeadingComma() {
        if (this.lexer.peekNextToken() != 4) {
            return;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Unexpected leading comma", 0, null, 6, null);
        throw new k();
    }

    private final boolean coerceInputValue(SerialDescriptor serialDescriptor, int i10) {
        String strPeekString;
        Json json = this.json;
        boolean zIsElementOptional = serialDescriptor.isElementOptional(i10);
        SerialDescriptor elementDescriptor = serialDescriptor.getElementDescriptor(i10);
        if (zIsElementOptional && !elementDescriptor.isNullable() && this.lexer.tryConsumeNull(true)) {
            return true;
        }
        if (!e0.areEqual(elementDescriptor.getKind(), SerialKind.ENUM.INSTANCE) || ((elementDescriptor.isNullable() && this.lexer.tryConsumeNull(false)) || (strPeekString = this.lexer.peekString(this.configuration.isLenient())) == null)) {
            return false;
        }
        int jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(elementDescriptor, json, strPeekString);
        boolean z10 = !json.getConfiguration().getExplicitNulls() && elementDescriptor.isNullable();
        if (jsonNameIndex == -3 && (zIsElementOptional || z10)) {
            this.lexer.consumeString();
            return true;
        }
        return false;
    }

    private final int decodeListIndex() {
        boolean zTryConsumeComma = this.lexer.tryConsumeComma();
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "array");
            throw new k();
        }
        int i10 = this.currentIndex;
        if (i10 != -1 && !zTryConsumeComma) {
            AbstractJsonLexer.fail$default(this.lexer, "Expected end of the array or comma", 0, null, 6, null);
            throw new k();
        }
        int i11 = i10 + 1;
        this.currentIndex = i11;
        return i11;
    }

    private final int decodeMapIndex() {
        int i10 = this.currentIndex;
        boolean zTryConsumeComma = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
        } else if (i10 != -1) {
            zTryConsumeComma = this.lexer.tryConsumeComma();
        }
        if (!this.lexer.canConsumeValue()) {
            if (!zTryConsumeComma || this.json.getConfiguration().getAllowTrailingComma()) {
                return -1;
            }
            JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
            throw new k();
        }
        if (z10) {
            if (this.currentIndex == -1) {
                AbstractJsonLexer abstractJsonLexer = this.lexer;
                int i11 = abstractJsonLexer.currentPosition;
                if (zTryConsumeComma) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer, "Unexpected leading comma", i11, null, 4, null);
                    throw new k();
                }
            } else {
                AbstractJsonLexer abstractJsonLexer2 = this.lexer;
                boolean z11 = zTryConsumeComma;
                int i12 = abstractJsonLexer2.currentPosition;
                if (!z11) {
                    AbstractJsonLexer.fail$default(abstractJsonLexer2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new k();
                }
            }
        }
        int i13 = this.currentIndex + 1;
        this.currentIndex = i13;
        return i13;
    }

    private final int decodeObjectIndex(SerialDescriptor serialDescriptor) {
        int jsonNameIndex;
        boolean zTryConsumeComma;
        boolean zTryConsumeComma2 = this.lexer.tryConsumeComma();
        while (true) {
            boolean z10 = true;
            if (!this.lexer.canConsumeValue()) {
                if (zTryConsumeComma2 && !this.json.getConfiguration().getAllowTrailingComma()) {
                    JsonExceptionsKt.invalidTrailingComma$default(this.lexer, null, 1, null);
                    throw new k();
                }
                JsonElementMarker jsonElementMarker = this.elementMarker;
                if (jsonElementMarker != null) {
                    return jsonElementMarker.nextUnmarkedIndex$kotlinx_serialization_json();
                }
                return -1;
            }
            String strDecodeStringKey = decodeStringKey();
            this.lexer.consumeNextToken(AbstractJsonLexerKt.COLON);
            jsonNameIndex = JsonNamesMapKt.getJsonNameIndex(serialDescriptor, this.json, strDecodeStringKey);
            if (jsonNameIndex == -3) {
                zTryConsumeComma = false;
            } else {
                if (!this.configuration.getCoerceInputValues() || !coerceInputValue(serialDescriptor, jsonNameIndex)) {
                    break;
                }
                zTryConsumeComma = this.lexer.tryConsumeComma();
                z10 = false;
            }
            zTryConsumeComma2 = z10 ? handleUnknown(strDecodeStringKey) : zTryConsumeComma;
        }
        JsonElementMarker jsonElementMarker2 = this.elementMarker;
        if (jsonElementMarker2 != null) {
            jsonElementMarker2.mark$kotlinx_serialization_json(jsonNameIndex);
        }
        return jsonNameIndex;
    }

    private final String decodeStringKey() {
        return this.configuration.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeKeyString();
    }

    private final boolean handleUnknown(String str) {
        if (this.configuration.getIgnoreUnknownKeys() || trySkip(this.discriminatorHolder, str)) {
            this.lexer.skipElement(this.configuration.isLenient());
        } else {
            this.lexer.failOnUnknownKey(str);
        }
        return this.lexer.tryConsumeComma();
    }

    private final void skipLeftoverElements(SerialDescriptor serialDescriptor) {
        while (decodeElementIndex(serialDescriptor) != -1) {
        }
    }

    private final boolean trySkip(DiscriminatorHolder discriminatorHolder, String str) {
        if (discriminatorHolder == null || !e0.areEqual(discriminatorHolder.discriminatorToSkip, str)) {
            return false;
        }
        discriminatorHolder.discriminatorToSkip = null;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        WriteMode writeModeSwitchMode = WriteModeKt.switchMode(this.json, descriptor);
        this.lexer.path.pushDescriptor(descriptor);
        this.lexer.consumeNextToken(writeModeSwitchMode.begin);
        checkLeadingComma();
        int i10 = WhenMappings.$EnumSwitchMapping$0[writeModeSwitchMode.ordinal()];
        return (i10 == 1 || i10 == 2 || i10 == 3) ? new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer, descriptor, this.discriminatorHolder) : (this.mode == writeModeSwitchMode && this.json.getConfiguration().getExplicitNulls()) ? this : new StreamingJsonDecoder(this.json, writeModeSwitchMode, this.lexer, descriptor, this.discriminatorHolder);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return this.lexer.consumeBooleanLenient();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        byte b10 = (byte) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == b10) {
            return b10;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse byte for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new k();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        String strConsumeStringLenient = this.lexer.consumeStringLenient();
        if (strConsumeStringLenient.length() == 1) {
            return strConsumeStringLenient.charAt(0);
        }
        AbstractJsonLexer.fail$default(this.lexer, o2.f('\'', "Expected single char, but got '", strConsumeStringLenient), 0, null, 6, null);
        throw new k();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() throws NumberFormatException {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            double d10 = Double.parseDouble(strConsumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return d10;
            }
            if (!Double.isInfinite(d10) && !Double.isNaN(d10)) {
                return d10;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Double.valueOf(d10));
            throw new k();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, o2.f('\'', "Failed to parse type 'double' for input '", strConsumeStringLenient), 0, null, 6, null);
            throw new k();
        }
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
        int iDecodeListIndex = i10 != 2 ? i10 != 4 ? decodeListIndex() : decodeObjectIndex(descriptor) : decodeMapIndex();
        if (this.mode != WriteMode.MAP) {
            this.lexer.path.updateDescriptorIndex(iDecodeListIndex);
        }
        return iDecodeListIndex;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        e0.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return JsonNamesMapKt.getJsonNameIndexOrThrow(enumDescriptor, this.json, decodeString(), " at path " + this.lexer.path.getPath());
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() throws NumberFormatException {
        AbstractJsonLexer abstractJsonLexer = this.lexer;
        String strConsumeStringLenient = abstractJsonLexer.consumeStringLenient();
        try {
            float f10 = Float.parseFloat(strConsumeStringLenient);
            if (this.json.getConfiguration().getAllowSpecialFloatingPointValues()) {
                return f10;
            }
            if (!Float.isInfinite(f10) && !Float.isNaN(f10)) {
                return f10;
            }
            JsonExceptionsKt.throwInvalidFloatingPointDecoded(this.lexer, Float.valueOf(f10));
            throw new k();
        } catch (IllegalArgumentException unused) {
            AbstractJsonLexer.fail$default(abstractJsonLexer, o2.f('\'', "Failed to parse type 'float' for input '", strConsumeStringLenient), 0, null, 6, null);
            throw new k();
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Decoder decodeInline(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        return StreamingJsonEncoderKt.isUnsignedNumber(descriptor) ? new JsonDecoderForUnsignedTypes(this.lexer, this.json) : super.decodeInline(descriptor);
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public JsonElement decodeJsonElement() {
        return new JsonTreeReader(this.json.getConfiguration(), this.lexer).read();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return this.lexer.consumeNumericLiteral();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        JsonElementMarker jsonElementMarker = this.elementMarker;
        return ((jsonElementMarker != null ? jsonElementMarker.isUnmarkedNull$kotlinx_serialization_json() : false) || AbstractJsonLexer.tryConsumeNull$default(this.lexer, false, 1, null)) ? false : true;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public Void decodeNull() {
        return null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public <T> T decodeSerializableElement(SerialDescriptor descriptor, int i10, DeserializationStrategy<? extends T> deserializer, T t10) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        e0.checkNotNullParameter(deserializer, "deserializer");
        boolean z10 = this.mode == WriteMode.MAP && (i10 & 1) == 0;
        if (z10) {
            this.lexer.path.resetCurrentMapKey();
        }
        T t11 = (T) super.decodeSerializableElement(descriptor, i10, deserializer, t10);
        if (z10) {
            this.lexer.path.updateCurrentMapKey(t11);
        }
        return t11;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154  */
    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T decodeSerializableValue(kotlinx.serialization.DeserializationStrategy<? extends T> r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.StreamingJsonDecoder.decodeSerializableValue(kotlinx.serialization.DeserializationStrategy):java.lang.Object");
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        short s10 = (short) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == s10) {
            return s10;
        }
        AbstractJsonLexer.fail$default(this.lexer, "Failed to parse short for input '" + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new k();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        return this.configuration.isLenient() ? this.lexer.consumeStringLenientNotNull() : this.lexer.consumeString();
    }

    @Override // kotlinx.serialization.encoding.ChunkedDecoder
    public void decodeStringChunked(l consumeChunk) {
        e0.checkNotNullParameter(consumeChunk, "consumeChunk");
        this.lexer.consumeStringChunked(this.configuration.isLenient(), consumeChunk);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void endStructure(SerialDescriptor descriptor) {
        e0.checkNotNullParameter(descriptor, "descriptor");
        if (this.json.getConfiguration().getIgnoreUnknownKeys() && descriptor.getElementsCount() == 0) {
            skipLeftoverElements(descriptor);
        }
        if (this.lexer.tryConsumeComma() && !this.json.getConfiguration().getAllowTrailingComma()) {
            JsonExceptionsKt.invalidTrailingComma(this.lexer, "");
            throw new k();
        }
        this.lexer.consumeNextToken(this.mode.end);
        this.lexer.path.popDescriptor();
    }

    @Override // kotlinx.serialization.json.JsonDecoder
    public final Json getJson() {
        return this.json;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        long jConsumeNumericLiteral = this.lexer.consumeNumericLiteral();
        int i10 = (int) jConsumeNumericLiteral;
        if (jConsumeNumericLiteral == i10) {
            return i10;
        }
        AbstractJsonLexer.fail$default(this.lexer, QGjYBESwAiCc.JqxXDkIssAp + jConsumeNumericLiteral + '\'', 0, null, 6, null);
        throw new k();
    }
}

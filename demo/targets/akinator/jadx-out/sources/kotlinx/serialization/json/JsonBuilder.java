package kotlinx.serialization.json;

import kotlin.jvm.internal.e0;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.modules.SerializersModule;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class JsonBuilder {
    private boolean allowComments;
    private boolean allowSpecialFloatingPointValues;
    private boolean allowStructuredMapKeys;
    private boolean allowTrailingComma;
    private String classDiscriminator;
    private ClassDiscriminatorMode classDiscriminatorMode;
    private boolean coerceInputValues;
    private boolean decodeEnumsCaseInsensitive;
    private boolean encodeDefaults;
    private boolean explicitNulls;
    private boolean ignoreUnknownKeys;
    private boolean isLenient;
    private JsonNamingStrategy namingStrategy;
    private boolean prettyPrint;
    private String prettyPrintIndent;
    private SerializersModule serializersModule;
    private boolean useAlternativeNames;
    private boolean useArrayPolymorphism;

    public JsonBuilder(Json json) {
        e0.checkNotNullParameter(json, "json");
        this.encodeDefaults = json.getConfiguration().getEncodeDefaults();
        this.explicitNulls = json.getConfiguration().getExplicitNulls();
        this.ignoreUnknownKeys = json.getConfiguration().getIgnoreUnknownKeys();
        this.isLenient = json.getConfiguration().isLenient();
        this.prettyPrint = json.getConfiguration().getPrettyPrint();
        this.prettyPrintIndent = json.getConfiguration().getPrettyPrintIndent();
        this.coerceInputValues = json.getConfiguration().getCoerceInputValues();
        this.classDiscriminator = json.getConfiguration().getClassDiscriminator();
        this.classDiscriminatorMode = json.getConfiguration().getClassDiscriminatorMode();
        this.useAlternativeNames = json.getConfiguration().getUseAlternativeNames();
        this.namingStrategy = json.getConfiguration().getNamingStrategy();
        this.decodeEnumsCaseInsensitive = json.getConfiguration().getDecodeEnumsCaseInsensitive();
        this.allowTrailingComma = json.getConfiguration().getAllowTrailingComma();
        this.allowComments = json.getConfiguration().getAllowComments();
        this.allowSpecialFloatingPointValues = json.getConfiguration().getAllowSpecialFloatingPointValues();
        this.allowStructuredMapKeys = json.getConfiguration().getAllowStructuredMapKeys();
        this.useArrayPolymorphism = json.getConfiguration().getUseArrayPolymorphism();
        this.serializersModule = json.getSerializersModule();
    }

    public final JsonConfiguration build$kotlinx_serialization_json() {
        if (this.useArrayPolymorphism) {
            if (!e0.areEqual(this.classDiscriminator, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.classDiscriminatorMode != ClassDiscriminatorMode.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.prettyPrint) {
            if (!e0.areEqual(this.prettyPrintIndent, "    ")) {
                String str = this.prettyPrintIndent;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.prettyPrintIndent).toString());
                    }
                }
            }
        } else if (!e0.areEqual(this.prettyPrintIndent, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new JsonConfiguration(this.encodeDefaults, this.ignoreUnknownKeys, this.isLenient, this.allowStructuredMapKeys, this.prettyPrint, this.explicitNulls, this.prettyPrintIndent, this.coerceInputValues, this.useArrayPolymorphism, this.classDiscriminator, this.allowSpecialFloatingPointValues, this.useAlternativeNames, this.namingStrategy, this.decodeEnumsCaseInsensitive, this.allowTrailingComma, this.allowComments, this.classDiscriminatorMode);
    }

    public final boolean getAllowComments() {
        return this.allowComments;
    }

    public final boolean getAllowSpecialFloatingPointValues() {
        return this.allowSpecialFloatingPointValues;
    }

    public final boolean getAllowStructuredMapKeys() {
        return this.allowStructuredMapKeys;
    }

    public final boolean getAllowTrailingComma() {
        return this.allowTrailingComma;
    }

    public final String getClassDiscriminator() {
        return this.classDiscriminator;
    }

    public final ClassDiscriminatorMode getClassDiscriminatorMode() {
        return this.classDiscriminatorMode;
    }

    public final boolean getCoerceInputValues() {
        return this.coerceInputValues;
    }

    public final boolean getDecodeEnumsCaseInsensitive() {
        return this.decodeEnumsCaseInsensitive;
    }

    public final boolean getEncodeDefaults() {
        return this.encodeDefaults;
    }

    public final boolean getExplicitNulls() {
        return this.explicitNulls;
    }

    public final boolean getIgnoreUnknownKeys() {
        return this.ignoreUnknownKeys;
    }

    public final JsonNamingStrategy getNamingStrategy() {
        return this.namingStrategy;
    }

    public final boolean getPrettyPrint() {
        return this.prettyPrint;
    }

    public final String getPrettyPrintIndent() {
        return this.prettyPrintIndent;
    }

    public final SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    public final boolean getUseAlternativeNames() {
        return this.useAlternativeNames;
    }

    public final boolean getUseArrayPolymorphism() {
        return this.useArrayPolymorphism;
    }

    public final boolean isLenient() {
        return this.isLenient;
    }

    public final void setAllowComments(boolean z10) {
        this.allowComments = z10;
    }

    public final void setAllowSpecialFloatingPointValues(boolean z10) {
        this.allowSpecialFloatingPointValues = z10;
    }

    public final void setAllowStructuredMapKeys(boolean z10) {
        this.allowStructuredMapKeys = z10;
    }

    public final void setAllowTrailingComma(boolean z10) {
        this.allowTrailingComma = z10;
    }

    public final void setClassDiscriminator(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.classDiscriminator = str;
    }

    public final void setClassDiscriminatorMode(ClassDiscriminatorMode classDiscriminatorMode) {
        e0.checkNotNullParameter(classDiscriminatorMode, "<set-?>");
        this.classDiscriminatorMode = classDiscriminatorMode;
    }

    public final void setCoerceInputValues(boolean z10) {
        this.coerceInputValues = z10;
    }

    public final void setDecodeEnumsCaseInsensitive(boolean z10) {
        this.decodeEnumsCaseInsensitive = z10;
    }

    public final void setEncodeDefaults(boolean z10) {
        this.encodeDefaults = z10;
    }

    public final void setExplicitNulls(boolean z10) {
        this.explicitNulls = z10;
    }

    public final void setIgnoreUnknownKeys(boolean z10) {
        this.ignoreUnknownKeys = z10;
    }

    public final void setLenient(boolean z10) {
        this.isLenient = z10;
    }

    public final void setNamingStrategy(JsonNamingStrategy jsonNamingStrategy) {
        this.namingStrategy = jsonNamingStrategy;
    }

    public final void setPrettyPrint(boolean z10) {
        this.prettyPrint = z10;
    }

    public final void setPrettyPrintIndent(String str) {
        e0.checkNotNullParameter(str, "<set-?>");
        this.prettyPrintIndent = str;
    }

    public final void setSerializersModule(SerializersModule serializersModule) {
        e0.checkNotNullParameter(serializersModule, "<set-?>");
        this.serializersModule = serializersModule;
    }

    public final void setUseAlternativeNames(boolean z10) {
        this.useAlternativeNames = z10;
    }

    public final void setUseArrayPolymorphism(boolean z10) {
        this.useArrayPolymorphism = z10;
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAllowComments$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getAllowTrailingComma$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getClassDiscriminatorMode$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getDecodeEnumsCaseInsensitive$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getNamingStrategy$annotations() {
    }

    @ExperimentalSerializationApi
    public static /* synthetic */ void getPrettyPrintIndent$annotations() {
    }
}

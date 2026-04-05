package kotlinx.serialization.json.internal;

import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CharMappings {
    public static final byte[] CHAR_TO_TOKEN;
    public static final char[] ESCAPE_2_CHAR;
    public static final CharMappings INSTANCE;

    static {
        CharMappings charMappings = new CharMappings();
        INSTANCE = charMappings;
        ESCAPE_2_CHAR = new char[Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE];
        CHAR_TO_TOKEN = new byte[126];
        charMappings.initEscape();
        charMappings.initCharToToken();
    }

    private CharMappings() {
    }

    private final void initC2ESC(int i10, char c10) {
        if (c10 != 'u') {
            ESCAPE_2_CHAR[c10] = (char) i10;
        }
    }

    private final void initC2TC(int i10, byte b10) {
        CHAR_TO_TOKEN[i10] = b10;
    }

    private final void initCharToToken() {
        for (int i10 = 0; i10 < 33; i10++) {
            initC2TC(i10, AbstractJsonLexerKt.TC_INVALID);
        }
        initC2TC(9, (byte) 3);
        initC2TC(10, (byte) 3);
        initC2TC(13, (byte) 3);
        initC2TC(32, (byte) 3);
        initC2TC(AbstractJsonLexerKt.COMMA, (byte) 4);
        initC2TC(AbstractJsonLexerKt.COLON, (byte) 5);
        initC2TC(AbstractJsonLexerKt.BEGIN_OBJ, (byte) 6);
        initC2TC(AbstractJsonLexerKt.END_OBJ, (byte) 7);
        initC2TC(AbstractJsonLexerKt.BEGIN_LIST, (byte) 8);
        initC2TC(AbstractJsonLexerKt.END_LIST, (byte) 9);
        initC2TC(AbstractJsonLexerKt.STRING, (byte) 1);
        initC2TC(AbstractJsonLexerKt.STRING_ESC, (byte) 2);
    }

    private final void initEscape() {
        for (int i10 = 0; i10 < 32; i10++) {
            initC2ESC(i10, AbstractJsonLexerKt.UNICODE_ESC);
        }
        initC2ESC(8, 'b');
        initC2ESC(9, 't');
        initC2ESC(10, 'n');
        initC2ESC(12, 'f');
        initC2ESC(13, 'r');
        initC2ESC('/', '/');
        initC2ESC(AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.STRING);
        initC2ESC(AbstractJsonLexerKt.STRING_ESC, AbstractJsonLexerKt.STRING_ESC);
    }

    private final void initC2ESC(char c10, char c11) {
        initC2ESC((int) c10, c11);
    }

    private final void initC2TC(char c10, byte b10) {
        initC2TC((int) c10, b10);
    }
}

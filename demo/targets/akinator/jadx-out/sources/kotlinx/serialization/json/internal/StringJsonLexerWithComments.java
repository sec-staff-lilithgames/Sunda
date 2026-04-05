package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import sv.n0;
import tu.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class StringJsonLexerWithComments extends StringJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringJsonLexerWithComments(String source) {
        super(source);
        e0.checkNotNullParameter(source, "source");
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            return false;
        }
        return isValidValueStart(getSource().charAt(iSkipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        String source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = iSkipWhitespaces + 1;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(iSkipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte peekNextToken() {
        String source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = iSkipWhitespaces;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(iSkipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int i10;
        int iIndexOf$default = this.currentPosition;
        if (iIndexOf$default == -1) {
            return iIndexOf$default;
        }
        String source = getSource();
        while (iIndexOf$default < source.length()) {
            char cCharAt = source.charAt(iIndexOf$default);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                if (cCharAt != '/' || (i10 = iIndexOf$default + 1) >= source.length()) {
                    break;
                }
                char cCharAt2 = source.charAt(i10);
                if (cCharAt2 == '*') {
                    int iIndexOf$default2 = n0.indexOf$default((CharSequence) source, "*/", iIndexOf$default + 2, false, 4, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        this.currentPosition = source.length();
                        AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
                        throw new k();
                    }
                    iIndexOf$default = iIndexOf$default2 + 2;
                } else {
                    if (cCharAt2 != '/') {
                        break;
                    }
                    iIndexOf$default = n0.indexOf$default((CharSequence) source, '\n', iIndexOf$default + 2, false, 4, (Object) null);
                    iIndexOf$default = iIndexOf$default == -1 ? source.length() : iIndexOf$default + 1;
                }
            }
        }
        this.currentPosition = iIndexOf$default;
        return iIndexOf$default;
    }

    @Override // kotlinx.serialization.json.internal.StringJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c10) {
        String source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            this.currentPosition = -1;
            unexpectedToken(c10);
        }
        char cCharAt = source.charAt(iSkipWhitespaces);
        this.currentPosition = iSkipWhitespaces + 1;
        if (cCharAt == c10) {
            return;
        }
        unexpectedToken(c10);
    }
}

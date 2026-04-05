package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import sv.n0;
import tu.k;
import tu.v;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ReaderJsonLexerWithComments extends ReaderJsonLexer {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderJsonLexerWithComments(InternalJsonReader reader, char[] buffer) {
        super(reader, buffer);
        e0.checkNotNullParameter(reader, "reader");
        e0.checkNotNullParameter(buffer, "buffer");
    }

    private final v handleComment(int i10) {
        int i11 = i10 + 2;
        char cCharAt = getSource().charAt(i10 + 1);
        if (cCharAt != '*') {
            if (cCharAt != '/') {
                return tu.e0.to(Integer.valueOf(i10), Boolean.FALSE);
            }
            int iPrefetchOrEof = i11;
            while (i10 != -1) {
                int iIndexOf$default = n0.indexOf$default((CharSequence) getSource(), '\n', iPrefetchOrEof, false, 4, (Object) null);
                if (iIndexOf$default != -1) {
                    return tu.e0.to(Integer.valueOf(iIndexOf$default + 1), Boolean.TRUE);
                }
                iPrefetchOrEof = prefetchOrEof(getSource().length());
                i10 = iPrefetchOrEof;
            }
            return tu.e0.to(-1, Boolean.TRUE);
        }
        boolean z10 = false;
        int iPrefetchWithinThreshold = i11;
        while (i10 != -1) {
            int iIndexOf$default2 = n0.indexOf$default((CharSequence) getSource(), "*/", iPrefetchWithinThreshold, false, 4, (Object) null);
            if (iIndexOf$default2 != -1) {
                return tu.e0.to(Integer.valueOf(iIndexOf$default2 + 2), Boolean.TRUE);
            }
            if (getSource().charAt(getSource().length() - 1) == '*') {
                iPrefetchWithinThreshold = prefetchWithinThreshold(getSource().length() - 1);
                if (z10) {
                    break;
                }
                z10 = true;
            } else {
                iPrefetchWithinThreshold = prefetchOrEof(getSource().length());
            }
            i10 = iPrefetchWithinThreshold;
        }
        this.currentPosition = getSource().length();
        AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
        throw new k();
    }

    private final int prefetchWithinThreshold(int i10) {
        if (getSource().length() - i10 > this.threshold) {
            return i10;
        }
        this.currentPosition = i10;
        ensureHaveChars();
        return (this.currentPosition != 0 || getSource().length() == 0) ? -1 : 0;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public boolean canConsumeValue() {
        ensureHaveChars();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            return false;
        }
        return isValidValueStart(getSource().charAt(iSkipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public void consumeNextToken(char c10) {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
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

    @Override // kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte peekNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = iSkipWhitespaces;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(iSkipWhitespaces));
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public int skipWhitespaces() {
        int iPrefetchOrEof;
        int i10 = this.currentPosition;
        while (true) {
            iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1) {
                break;
            }
            char cCharAt = getSource().charAt(iPrefetchOrEof);
            if (cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t') {
                i10 = iPrefetchOrEof + 1;
            } else {
                if (cCharAt != '/' || iPrefetchOrEof + 1 >= getSource().length()) {
                    break;
                }
                v vVarHandleComment = handleComment(iPrefetchOrEof);
                int iIntValue = ((Number) vVarHandleComment.component1()).intValue();
                if (!((Boolean) vVarHandleComment.component2()).booleanValue()) {
                    iPrefetchOrEof = iIntValue;
                    break;
                }
                i10 = iIntValue;
            }
        }
        this.currentPosition = iPrefetchOrEof;
        return iPrefetchOrEof;
    }

    @Override // kotlinx.serialization.json.internal.ReaderJsonLexer, kotlinx.serialization.json.internal.AbstractJsonLexer
    public byte consumeNextToken() {
        ensureHaveChars();
        ArrayAsSequence source = getSource();
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1) {
            return (byte) 10;
        }
        this.currentPosition = iSkipWhitespaces + 1;
        return AbstractJsonLexerKt.charToTokenClass(source.charAt(iSkipWhitespaces));
    }
}

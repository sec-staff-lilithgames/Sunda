package kotlinx.serialization.json.internal;

import a.b;
import e3.g;
import j1.o2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import sv.n0;
import tu.k;
import tu.t;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class AbstractJsonLexer {
    public int currentPosition;
    private String peekedString;
    public final JsonPath path = new JsonPath();
    private StringBuilder escapedString = new StringBuilder();

    private final int appendEsc(int i10) {
        int iPrefetchOrEof = prefetchOrEof(i10);
        if (iPrefetchOrEof == -1) {
            fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
            throw new k();
        }
        int i11 = iPrefetchOrEof + 1;
        char cCharAt = getSource().charAt(iPrefetchOrEof);
        if (cCharAt == 'u') {
            return appendHex(getSource(), i11);
        }
        char cEscapeToChar = AbstractJsonLexerKt.escapeToChar(cCharAt);
        if (cEscapeToChar != 0) {
            this.escapedString.append(cEscapeToChar);
            return i11;
        }
        fail$default(this, "Invalid escaped char '" + cCharAt + '\'', 0, null, 6, null);
        throw new k();
    }

    private final int appendEscape(int i10, int i11) {
        appendRange(i10, i11);
        return appendEsc(i11 + 1);
    }

    private final int appendHex(CharSequence charSequence, int i10) {
        int i11 = i10 + 4;
        if (i11 < charSequence.length()) {
            this.escapedString.append((char) ((fromHexChar(charSequence, i10) << 12) + (fromHexChar(charSequence, i10 + 1) << 8) + (fromHexChar(charSequence, i10 + 2) << 4) + fromHexChar(charSequence, i10 + 3)));
            return i11;
        }
        this.currentPosition = i10;
        ensureHaveChars();
        if (this.currentPosition + 4 < charSequence.length()) {
            return appendHex(charSequence, this.currentPosition);
        }
        fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
        throw new k();
    }

    private final void consumeBooleanLiteral(String str, int i10) {
        if (getSource().length() - i10 < str.length()) {
            fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
            throw new k();
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (str.charAt(i11) != (getSource().charAt(i10 + i11) | ' ')) {
                fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
                throw new k();
            }
        }
        this.currentPosition = str.length() + i10;
    }

    private static final double consumeNumericLiteral$calculateExponent(long j10, boolean z10) {
        if (!z10) {
            return Math.pow(10.0d, -j10);
        }
        if (z10) {
            return Math.pow(10.0d, j10);
        }
        throw new t();
    }

    private final String decodedString(int i10, int i11) {
        appendRange(i10, i11);
        String string = this.escapedString.toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        this.escapedString.setLength(0);
        return string;
    }

    public static /* synthetic */ Void fail$default(AbstractJsonLexer abstractJsonLexer, String str, int i10, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractJsonLexer.currentPosition;
        }
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return abstractJsonLexer.fail(str, i10, str2);
    }

    public static /* synthetic */ Void fail$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, byte b10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return abstractJsonLexer.fail$kotlinx_serialization_json(b10, z10);
    }

    private final int fromHexChar(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        fail$default(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6, null);
        throw new k();
    }

    private final boolean insideString(boolean z10, char c10) {
        return z10 ? AbstractJsonLexerKt.charToTokenClass(c10) == 0 : c10 != '\"';
    }

    public static /* synthetic */ void require$kotlinx_serialization_json$default(AbstractJsonLexer abstractJsonLexer, boolean z10, int i10, kv.a message, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: require");
        }
        if ((i11 & 2) != 0) {
            i10 = abstractJsonLexer.currentPosition;
        }
        int i12 = i10;
        e0.checkNotNullParameter(message, "message");
        if (z10) {
            return;
        }
        fail$default(abstractJsonLexer, (String) message.invoke(), i12, null, 4, null);
        throw new k();
    }

    private final String takePeeked() {
        String str = this.peekedString;
        e0.checkNotNull(str);
        this.peekedString = null;
        return str;
    }

    public static /* synthetic */ boolean tryConsumeNull$default(AbstractJsonLexer abstractJsonLexer, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return abstractJsonLexer.tryConsumeNull(z10);
    }

    private final boolean wasUnquotedString() {
        return getSource().charAt(this.currentPosition - 1) != '\"';
    }

    private final <T> T withPositionRollback(kv.a aVar) {
        int i10 = this.currentPosition;
        try {
            return (T) aVar.invoke();
        } finally {
            b0.finallyStart(1);
            this.currentPosition = i10;
            b0.finallyEnd(1);
        }
    }

    private final void writeRange(int i10, int i11, boolean z10, l lVar) {
        if (z10) {
            lVar.invoke(decodedString(i10, i11));
        } else {
            lVar.invoke(substring(i10, i11));
        }
    }

    public void appendRange(int i10, int i11) {
        this.escapedString.append(getSource(), i10, i11);
    }

    public abstract boolean canConsumeValue();

    public final boolean consumeBoolean() {
        return consumeBoolean(skipWhitespaces());
    }

    public final boolean consumeBooleanLenient() {
        boolean z10;
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new k();
        }
        if (getSource().charAt(iSkipWhitespaces) == '\"') {
            iSkipWhitespaces++;
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zConsumeBoolean = consumeBoolean(iSkipWhitespaces);
        if (!z10) {
            return zConsumeBoolean;
        }
        if (this.currentPosition == getSource().length()) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new k();
        }
        if (getSource().charAt(this.currentPosition) == '\"') {
            this.currentPosition++;
            return zConsumeBoolean;
        }
        fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
        throw new k();
    }

    public abstract String consumeKeyString();

    public abstract byte consumeNextToken();

    public final byte consumeNextToken(byte b10) {
        byte bConsumeNextToken = consumeNextToken();
        if (bConsumeNextToken == b10) {
            return bConsumeNextToken;
        }
        fail$kotlinx_serialization_json$default(this, b10, false, 2, null);
        throw new k();
    }

    public abstract void consumeNextToken(char c10);

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e8, code lost:
    
        fail$default(r18, "Expected numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f8, code lost:
    
        throw new tu.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0117, code lost:
    
        fail$default(r18, "Unexpected symbol '" + r15 + "' in numeric literal", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        throw new tu.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0139, code lost:
    
        if (r2 == r1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013b, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013e, code lost:
    
        if (r1 == r2) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0140, code lost:
    
        if (r9 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0144, code lost:
    
        if (r1 == (r2 - 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0146, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0148, code lost:
    
        if (r4 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0152, code lost:
    
        if (getSource().charAt(r2) != '\"') goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0154, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
    
        fail$default(r18, "Expected closing quotation mark", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        throw new tu.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016a, code lost:
    
        fail$default(r18, "EOF", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017a, code lost:
    
        throw new tu.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017b, code lost:
    
        r18.currentPosition = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x017d, code lost:
    
        if (r8 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017f, code lost:
    
        r1 = r10 * consumeNumericLiteral$calculateExponent(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0189, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x018f, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0197, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
    
        r10 = (long) r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019b, code lost:
    
        fail$default(r18, "Can't convert " + r1 + " to Long", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        throw new tu.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bb, code lost:
    
        fail$default(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cb, code lost:
    
        throw new tu.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cc, code lost:
    
        if (r9 == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ce, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d3, code lost:
    
        if (r10 == Long.MIN_VALUE) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01d6, code lost:
    
        return -r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d7, code lost:
    
        fail$default(r18, "Numeric value overflow", 0, null, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e7, code lost:
    
        throw new tu.k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long consumeNumericLiteral() {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractJsonLexer.consumeNumericLiteral():long");
    }

    public final String consumeString() {
        return this.peekedString != null ? takePeeked() : consumeKeyString();
    }

    public void consumeStringChunked(boolean z10, l consumeChunk) {
        int i10;
        int iPrefetchOrEof;
        e0.checkNotNullParameter(consumeChunk, "consumeChunk");
        byte bPeekNextToken = peekNextToken();
        if (!z10 || bPeekNextToken == 0) {
            if (!z10) {
                consumeNextToken(AbstractJsonLexerKt.STRING);
            }
            int i11 = this.currentPosition;
            char cCharAt = getSource().charAt(i11);
            boolean z11 = false;
            int i12 = i11;
            while (insideString(z10, cCharAt)) {
                if (z10 || cCharAt != '\\') {
                    int i13 = i12 + 1;
                    i10 = i11;
                    iPrefetchOrEof = i13;
                } else {
                    iPrefetchOrEof = prefetchOrEof(appendEscape(i11, i12));
                    z11 = true;
                    i10 = iPrefetchOrEof;
                }
                if (iPrefetchOrEof >= getSource().length()) {
                    writeRange(i10, iPrefetchOrEof, z11, consumeChunk);
                    int iPrefetchOrEof2 = prefetchOrEof(iPrefetchOrEof);
                    if (iPrefetchOrEof2 == -1) {
                        fail$default(this, "EOF", iPrefetchOrEof2, null, 4, null);
                        throw new k();
                    }
                    z11 = false;
                    i11 = iPrefetchOrEof2;
                    i12 = i11;
                } else {
                    int i14 = i10;
                    i12 = iPrefetchOrEof;
                    i11 = i14;
                }
                cCharAt = getSource().charAt(i12);
            }
            writeRange(i11, i12, z11, consumeChunk);
            this.currentPosition = i12;
            if (z10) {
                return;
            }
            consumeNextToken(AbstractJsonLexerKt.STRING);
        }
    }

    public final String consumeStringLenient() {
        if (this.peekedString != null) {
            return takePeeked();
        }
        int iSkipWhitespaces = skipWhitespaces();
        if (iSkipWhitespaces >= getSource().length() || iSkipWhitespaces == -1) {
            fail$default(this, "EOF", iSkipWhitespaces, null, 4, null);
            throw new k();
        }
        byte bCharToTokenClass = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces));
        if (bCharToTokenClass == 1) {
            return consumeString();
        }
        if (bCharToTokenClass != 0) {
            fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(iSkipWhitespaces), 0, null, 6, null);
            throw new k();
        }
        boolean z10 = false;
        while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iSkipWhitespaces)) == 0) {
            iSkipWhitespaces++;
            if (iSkipWhitespaces >= getSource().length()) {
                appendRange(this.currentPosition, iSkipWhitespaces);
                int iPrefetchOrEof = prefetchOrEof(iSkipWhitespaces);
                if (iPrefetchOrEof == -1) {
                    this.currentPosition = iSkipWhitespaces;
                    return decodedString(0, 0);
                }
                iSkipWhitespaces = iPrefetchOrEof;
                z10 = true;
            }
        }
        String strSubstring = !z10 ? substring(this.currentPosition, iSkipWhitespaces) : decodedString(this.currentPosition, iSkipWhitespaces);
        this.currentPosition = iSkipWhitespaces;
        return strSubstring;
    }

    public final String consumeStringLenientNotNull() {
        String strConsumeStringLenient = consumeStringLenient();
        if (!e0.areEqual(strConsumeStringLenient, AbstractJsonLexerKt.NULL) || !wasUnquotedString()) {
            return strConsumeStringLenient;
        }
        fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
        throw new k();
    }

    public final void discardPeeked() {
        this.peekedString = null;
    }

    public final void expectEof() {
        if (consumeNextToken() == 10) {
            return;
        }
        fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null);
        throw new k();
    }

    public final Void fail(String message, int i10, String hint) {
        e0.checkNotNullParameter(message, "message");
        e0.checkNotNullParameter(hint, "hint");
        String strK = hint.length() == 0 ? "" : b.k("\n", hint);
        StringBuilder sbT = b.t(message, " at path: ");
        sbT.append(this.path.getPath());
        sbT.append(strK);
        throw JsonExceptionsKt.JsonDecodingException(i10, sbT.toString(), getSource());
    }

    public final Void fail$kotlinx_serialization_json(byte b10, boolean z10) {
        String str = AbstractJsonLexerKt.tokenDescription(b10);
        int i10 = z10 ? this.currentPosition - 1 : this.currentPosition;
        fail$default(this, g.l("Expected ", str, ", but had '", (this.currentPosition == getSource().length() || i10 < 0) ? "EOF" : String.valueOf(getSource().charAt(i10)), "' instead"), i10, null, 4, null);
        throw new k();
    }

    public final void failOnUnknownKey(String key) {
        e0.checkNotNullParameter(key, "key");
        fail(o2.f('\'', "Encountered an unknown key '", key), n0.lastIndexOf$default((CharSequence) substring(0, this.currentPosition), key, 0, false, 6, (Object) null), AbstractJsonLexerKt.ignoreUnknownKeysHint);
        throw new k();
    }

    public final StringBuilder getEscapedString() {
        return this.escapedString;
    }

    public abstract CharSequence getSource();

    public int indexOf(char c10, int i10) {
        return n0.indexOf$default(getSource(), c10, i10, false, 4, (Object) null);
    }

    public final boolean isNotEof() {
        return peekNextToken() != 10;
    }

    public final boolean isValidValueStart(char c10) {
        return (c10 == ',' || c10 == ':' || c10 == ']' || c10 == '}') ? false : true;
    }

    public final boolean isWs(char c10) {
        return c10 == ' ' || c10 == '\n' || c10 == '\r' || c10 == '\t';
    }

    public abstract String peekLeadingMatchingValue(String str, boolean z10);

    public byte peekNextToken() {
        CharSequence source = getSource();
        int i10 = this.currentPosition;
        while (true) {
            int iPrefetchOrEof = prefetchOrEof(i10);
            if (iPrefetchOrEof == -1) {
                this.currentPosition = iPrefetchOrEof;
                return (byte) 10;
            }
            char cCharAt = source.charAt(iPrefetchOrEof);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.currentPosition = iPrefetchOrEof;
                return AbstractJsonLexerKt.charToTokenClass(cCharAt);
            }
            i10 = iPrefetchOrEof + 1;
        }
    }

    public final String peekString(boolean z10) {
        String strConsumeString;
        byte bPeekNextToken = peekNextToken();
        if (z10) {
            if (bPeekNextToken != 1 && bPeekNextToken != 0) {
                return null;
            }
            strConsumeString = consumeStringLenient();
        } else {
            if (bPeekNextToken != 1) {
                return null;
            }
            strConsumeString = consumeString();
        }
        this.peekedString = strConsumeString;
        return strConsumeString;
    }

    public abstract int prefetchOrEof(int i10);

    public final void require$kotlinx_serialization_json(boolean z10, int i10, kv.a message) {
        e0.checkNotNullParameter(message, "message");
        if (z10) {
            return;
        }
        fail$default(this, (String) message.invoke(), i10, null, 4, null);
        throw new k();
    }

    public final void setEscapedString(StringBuilder sb2) {
        e0.checkNotNullParameter(sb2, "<set-?>");
        this.escapedString = sb2;
    }

    public final void skipElement(boolean z10) {
        ArrayList arrayList = new ArrayList();
        byte bPeekNextToken = peekNextToken();
        if (bPeekNextToken != 8 && bPeekNextToken != 6) {
            consumeStringLenient();
            return;
        }
        while (true) {
            byte bPeekNextToken2 = peekNextToken();
            if (bPeekNextToken2 != 1) {
                if (bPeekNextToken2 == 8 || bPeekNextToken2 == 6) {
                    arrayList.add(Byte.valueOf(bPeekNextToken2));
                } else if (bPeekNextToken2 == 9) {
                    if (((Number) y0.last((List) arrayList)).byteValue() != 8) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource());
                    }
                    v0.removeLast(arrayList);
                } else if (bPeekNextToken2 == 7) {
                    if (((Number) y0.last((List) arrayList)).byteValue() != 6) {
                        throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource());
                    }
                    v0.removeLast(arrayList);
                } else if (bPeekNextToken2 == 10) {
                    fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new k();
                }
                consumeNextToken();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z10) {
                consumeStringLenient();
            } else {
                consumeKeyString();
            }
        }
    }

    public abstract int skipWhitespaces();

    public String substring(int i10, int i11) {
        return getSource().subSequence(i10, i11).toString();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("JsonReader(source='");
        sb2.append((Object) getSource());
        sb2.append("', currentPosition=");
        return g.m(sb2, this.currentPosition, ')');
    }

    public final boolean tryConsumeComma() {
        int iSkipWhitespaces = skipWhitespaces();
        CharSequence source = getSource();
        if (iSkipWhitespaces >= source.length() || iSkipWhitespaces == -1 || source.charAt(iSkipWhitespaces) != ',') {
            return false;
        }
        this.currentPosition++;
        return true;
    }

    public final boolean tryConsumeNull(boolean z10) {
        int iPrefetchOrEof = prefetchOrEof(skipWhitespaces());
        int length = getSource().length() - iPrefetchOrEof;
        if (length < 4 || iPrefetchOrEof == -1) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            if (AbstractJsonLexerKt.NULL.charAt(i10) != getSource().charAt(iPrefetchOrEof + i10)) {
                return false;
            }
        }
        if (length > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(iPrefetchOrEof + 4)) == 0) {
            return false;
        }
        if (!z10) {
            return true;
        }
        this.currentPosition = iPrefetchOrEof + 4;
        return true;
    }

    public final void unexpectedToken(char c10) {
        int i10 = this.currentPosition;
        if (i10 > 0 && c10 == '\"') {
            try {
                this.currentPosition = i10 - 1;
                String strConsumeStringLenient = consumeStringLenient();
                this.currentPosition = i10;
                if (e0.areEqual(strConsumeStringLenient, AbstractJsonLexerKt.NULL)) {
                    fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, AbstractJsonLexerKt.coerceInputValuesHint);
                    throw new k();
                }
            } catch (Throwable th2) {
                this.currentPosition = i10;
                throw th2;
            }
        }
        fail$kotlinx_serialization_json$default(this, AbstractJsonLexerKt.charToTokenClass(c10), false, 2, null);
        throw new k();
    }

    private final boolean consumeBoolean(int i10) {
        int iPrefetchOrEof = prefetchOrEof(i10);
        if (iPrefetchOrEof >= getSource().length() || iPrefetchOrEof == -1) {
            fail$default(this, "EOF", 0, null, 6, null);
            throw new k();
        }
        int i11 = iPrefetchOrEof + 1;
        int iCharAt = getSource().charAt(iPrefetchOrEof) | ' ';
        if (iCharAt == 102) {
            consumeBooleanLiteral("alse", i11);
            return false;
        }
        if (iCharAt == 116) {
            consumeBooleanLiteral("rue", i11);
            return true;
        }
        fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
        throw new k();
    }

    public final String consumeString(CharSequence source, int i10, int i11) {
        String strDecodedString;
        e0.checkNotNullParameter(source, "source");
        char cCharAt = source.charAt(i11);
        boolean z10 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                int iPrefetchOrEof = prefetchOrEof(appendEscape(i10, i11));
                if (iPrefetchOrEof == -1) {
                    fail$default(this, "Unexpected EOF", iPrefetchOrEof, null, 4, null);
                    throw new k();
                }
                z10 = true;
                i10 = iPrefetchOrEof;
                i11 = i10;
            } else {
                i11++;
                if (i11 >= source.length()) {
                    appendRange(i10, i11);
                    int iPrefetchOrEof2 = prefetchOrEof(i11);
                    if (iPrefetchOrEof2 == -1) {
                        fail$default(this, "Unexpected EOF", iPrefetchOrEof2, null, 4, null);
                        throw new k();
                    }
                    i10 = iPrefetchOrEof2;
                    i11 = i10;
                    z10 = true;
                } else {
                    continue;
                }
            }
            cCharAt = source.charAt(i11);
        }
        if (!z10) {
            strDecodedString = substring(i10, i11);
        } else {
            strDecodedString = decodedString(i10, i11);
        }
        this.currentPosition = i11 + 1;
        return strDecodedString;
    }

    public void ensureHaveChars() {
    }
}

package io.ktor.http;

import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.G5;
import io.ktor.util.date.GMTDateParser;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.utils.io.charsets.EncodingKt;
import io.ktor.utils.io.core.ByteReadPacket;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import io.ktor.utils.io.core.internal.UnsafeKt;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import p0.o2;
import qv.c;
import sv.f;
import sv.g;
import sv.k0;
import uu.c2;
import uu.d2;
import uu.p0;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CodecsKt {
    private static final Set<Character> ATTRIBUTE_CHARACTERS;
    private static final Set<Character> HEX_ALPHABET;
    private static final List<Byte> SPECIAL_SYMBOLS;
    private static final Set<Byte> URL_ALPHABET;
    private static final Set<Character> URL_ALPHABET_CHARS;
    private static final List<Byte> URL_PROTOCOL_PART;
    private static final Set<Character> VALID_PATH_PART;

    static {
        Character chValueOf = Character.valueOf(GMTDateParser.ANY);
        Character chValueOf2 = Character.valueOf(AbstractJsonLexerKt.COLON);
        List listPlus = y0.plus((Collection) y0.plus((Iterable) new c('a', GMTDateParser.ZONE), (Iterable) new c('A', 'Z')), (Iterable) new c('0', '9'));
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(listPlus, 10));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        URL_ALPHABET = y0.toSet(arrayList);
        URL_ALPHABET_CHARS = y0.toSet(y0.plus((Collection) y0.plus((Iterable) new c('a', GMTDateParser.ZONE), (Iterable) new c('A', 'Z')), (Iterable) new c('0', '9')));
        HEX_ALPHABET = y0.toSet(y0.plus((Collection) y0.plus((Iterable) new c('a', 'f'), (Iterable) new c('A', 'F')), (Iterable) new c('0', '9')));
        Set of2 = c2.setOf((Object[]) new Character[]{chValueOf2, '/', '?', '#', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '@', '!', '$', '&', '\'', '(', ')', chValueOf, Character.valueOf(AbstractJsonLexerKt.COMMA), ';', Character.valueOf(G5.T), '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(of2, 10));
        Iterator it2 = of2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        URL_PROTOCOL_PART = arrayList2;
        VALID_PATH_PART = c2.setOf((Object[]) new Character[]{chValueOf2, '@', '!', '$', '&', '\'', '(', ')', chValueOf, '+', Character.valueOf(AbstractJsonLexerKt.COMMA), ';', Character.valueOf(G5.T), '-', '.', '_', '~'});
        ATTRIBUTE_CHARACTERS = d2.plus((Set) URL_ALPHABET_CHARS, (Iterable) c2.setOf((Object[]) new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', '|', '~'}));
        List listListOf = p0.listOf((Object[]) new Character[]{'-', '.', '_', '~'});
        ArrayList arrayList3 = new ArrayList(q0.collectionSizeOrDefault(listListOf, 10));
        Iterator it3 = listListOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it3.next()).charValue()));
        }
        SPECIAL_SYMBOLS = arrayList3;
    }

    private static final int charToHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('A' <= c10 && c10 < 'G') {
            return c10 - '7';
        }
        if ('a' > c10 || c10 >= 'g') {
            return -1;
        }
        return c10 - 'W';
    }

    private static final String decodeImpl(CharSequence charSequence, int i10, int i11, int i12, boolean z10, Charset charset) throws URLDecodeException {
        int i13 = i11 - i10;
        if (i13 > 255) {
            i13 /= 3;
        }
        StringBuilder sb2 = new StringBuilder(i13);
        if (i12 > i10) {
            sb2.append(charSequence, i10, i12);
        }
        byte[] bArr = null;
        while (i12 < i11) {
            char cCharAt = charSequence.charAt(i12);
            if (z10 && cCharAt == '+') {
                sb2.append(' ');
            } else if (cCharAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i11 - i12) / 3];
                }
                int i14 = 0;
                while (i12 < i11 && charSequence.charAt(i12) == '%') {
                    int i15 = i12 + 2;
                    if (i15 >= i11) {
                        StringBuilder sb3 = new StringBuilder("Incomplete trailing HEX escape: ");
                        sb3.append(charSequence.subSequence(i12, charSequence.length()).toString());
                        sb3.append(", in ");
                        sb3.append((Object) charSequence);
                        throw new URLDecodeException(o2.l(i12, " at ", sb3));
                    }
                    int i16 = i12 + 1;
                    int iCharToHexDigit = charToHexDigit(charSequence.charAt(i16));
                    int iCharToHexDigit2 = charToHexDigit(charSequence.charAt(i15));
                    if (iCharToHexDigit == -1 || iCharToHexDigit2 == -1) {
                        throw new URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i16) + charSequence.charAt(i15) + ", in " + ((Object) charSequence) + ", at " + i12);
                    }
                    bArr[i14] = (byte) ((iCharToHexDigit * 16) + iCharToHexDigit2);
                    i12 += 3;
                    i14++;
                }
                sb2.append(new String(bArr, 0, i14, charset));
            } else {
                sb2.append(cCharAt);
            }
            i12++;
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    private static final String decodeScan(String str, int i10, int i11, boolean z10, Charset charset) {
        for (int i12 = i10; i12 < i11; i12++) {
            char cCharAt = str.charAt(i12);
            if (cCharAt == '%' || (z10 && cCharAt == '+')) {
                return decodeImpl(str, i10, i11, i12, z10, charset);
            }
        }
        if (i10 == 0 && i11 == str.length()) {
            return str.toString();
        }
        String strSubstring = str.substring(i10, i11);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static final String decodeURLPart(String str, int i10, int i11, Charset charset) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        return decodeScan(str, i10, i11, false, charset);
    }

    public static /* synthetic */ String decodeURLPart$default(String str, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            charset = g.f86134b;
        }
        return decodeURLPart(str, i10, i11, charset);
    }

    public static final String decodeURLQueryComponent(String str, int i10, int i11, boolean z10, Charset charset) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        return decodeScan(str, i10, i11, z10, charset);
    }

    public static /* synthetic */ String decodeURLQueryComponent$default(String str, int i10, int i11, boolean z10, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            charset = g.f86134b;
        }
        return decodeURLQueryComponent(str, i10, i11, z10, charset);
    }

    public static final String encodeOAuth(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return encodeURLParameter$default(str, false, 1, null);
    }

    public static final String encodeURLParameter(String str, boolean z10) throws Throwable {
        e0.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = g.f86134b.newEncoder();
        e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "UTF_8.newEncoder()");
        forEach(EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new CodecsKt$encodeURLParameter$1$1(sb2, z10));
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String encodeURLParameter$default(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return encodeURLParameter(str, z10);
    }

    public static final String encodeURLParameterValue(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return encodeURLParameter(str, true);
    }

    public static final String encodeURLPath(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return encodeURLPath(str, false);
    }

    public static final String encodeURLPathPart(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return encodeURLPath(str, true);
    }

    public static final String encodeURLQueryComponent(String str, boolean z10, boolean z11, Charset charset) throws Throwable {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
        forEach(EncodingKt.encode$default(charsetEncoderNewEncoder, str, 0, 0, 6, null), new CodecsKt$encodeURLQueryComponent$1$1(z11, sb2, z10));
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String encodeURLQueryComponent$default(String str, boolean z10, boolean z11, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            charset = g.f86134b;
        }
        return encodeURLQueryComponent(str, z10, z11, charset);
    }

    private static final void forEach(ByteReadPacket byteReadPacket, l lVar) throws Throwable {
        boolean z10 = true;
        ChunkBuffer chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadFirstHead(byteReadPacket, 1);
        if (chunkBufferPrepareReadFirstHead == null) {
            return;
        }
        while (true) {
            try {
                if (chunkBufferPrepareReadFirstHead.getWritePosition() > chunkBufferPrepareReadFirstHead.getReadPosition()) {
                    lVar.invoke(Byte.valueOf(chunkBufferPrepareReadFirstHead.readByte()));
                } else {
                    try {
                        chunkBufferPrepareReadFirstHead = UnsafeKt.prepareReadNextHead(byteReadPacket, chunkBufferPrepareReadFirstHead);
                        if (chunkBufferPrepareReadFirstHead == null) {
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = false;
                        if (z10) {
                            UnsafeKt.completeReadHead(byteReadPacket, chunkBufferPrepareReadFirstHead);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public static final Set<Character> getATTRIBUTE_CHARACTERS() {
        return ATTRIBUTE_CHARACTERS;
    }

    private static final char hexDigitToChar(int i10) {
        return (char) ((i10 < 0 || i10 >= 10) ? ((char) (i10 + 65)) - '\n' : i10 + 48);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String percentEncode(byte b10) {
        return k0.concatToString(new char[]{'%', hexDigitToChar((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4), hexDigitToChar(b10 & 15)});
    }

    public static final String encodeURLPath(String str, boolean z10) throws Throwable {
        int i10;
        e0.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        Charset charset = g.f86134b;
        int i11 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            if ((!z10 && cCharAt == '/') || URL_ALPHABET_CHARS.contains(Character.valueOf(cCharAt)) || VALID_PATH_PART.contains(Character.valueOf(cCharAt))) {
                sb2.append(cCharAt);
                i11++;
            } else {
                if (cCharAt == '%' && (i10 = i11 + 2) < str.length()) {
                    Set<Character> set = HEX_ALPHABET;
                    int i12 = i11 + 1;
                    if (set.contains(Character.valueOf(str.charAt(i12))) && set.contains(Character.valueOf(str.charAt(i10)))) {
                        sb2.append(cCharAt);
                        sb2.append(str.charAt(i12));
                        sb2.append(str.charAt(i10));
                        i11 += 3;
                    }
                }
                int i13 = f.isSurrogate(cCharAt) ? 2 : 1;
                CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
                int i14 = i13 + i11;
                forEach(EncodingKt.encode(charsetEncoderNewEncoder, str, i11, i14), new CodecsKt$encodeURLPath$1$1(sb2));
                i11 = i14;
            }
        }
        String string = sb2.toString();
        e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String percentEncode(String str, Set<Character> allowedSet) {
        byte[] bArrEncodeToByteArray;
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(allowedSet, "allowedSet");
        int i10 = 0;
        for (int i11 = 0; i11 < str.length(); i11++) {
            if (!allowedSet.contains(Character.valueOf(str.charAt(i11)))) {
                i10++;
            }
        }
        if (i10 == 0) {
            return str;
        }
        Charset charset = g.f86134b;
        if (e0.areEqual(charset, charset)) {
            bArrEncodeToByteArray = k0.encodeToByteArray(str);
        } else {
            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
            e0.checkNotNullExpressionValue(charsetEncoderNewEncoder, "charset.newEncoder()");
            bArrEncodeToByteArray = CharsetJVMKt.encodeToByteArray(charsetEncoderNewEncoder, str, 0, str.length());
        }
        int length = str.length() - i10;
        char[] cArr = new char[j1.o2.b(bArrEncodeToByteArray.length, length, 3, length)];
        int i12 = 0;
        for (byte b10 : bArrEncodeToByteArray) {
            char c10 = (char) b10;
            if (allowedSet.contains(Character.valueOf(c10))) {
                cArr[i12] = c10;
                i12++;
            } else {
                int i13 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
                cArr[i12] = '%';
                int i14 = i12 + 2;
                cArr[i12 + 1] = hexDigitToChar(i13 >> 4);
                i12 += 3;
                cArr[i14] = hexDigitToChar(b10 & 15);
            }
        }
        return k0.concatToString(cArr);
    }
}

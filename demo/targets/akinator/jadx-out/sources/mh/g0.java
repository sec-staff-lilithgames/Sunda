package mh;

import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.BitSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class g0 implements q1 {
    public static String a(char c10) {
        char[] cArr = new char[6];
        cArr[0] = AbstractJsonLexerKt.STRING_ESC;
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static g0 any() {
        return f.f74611c;
    }

    public static g0 anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new g(charSequence) : new q(charSequence.charAt(0), charSequence.charAt(1)) : is(charSequence.charAt(0)) : none();
    }

    public static g0 ascii() {
        return h.f74625c;
    }

    public static g0 breakingWhitespace() {
        return j.f74639b;
    }

    public static g0 c(int i10, BitSet bitSet, String str) {
        int i11;
        if (i10 == 0) {
            return none();
        }
        if (i10 == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        int iHighestOneBit = 2;
        if (i10 == 2) {
            char cNextSetBit = (char) bitSet.nextSetBit(0);
            return new q(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
        }
        int length = bitSet.length();
        if (i10 > 1023 || length <= i10 * 64) {
            return new i(bitSet, str);
        }
        int iCardinality = bitSet.cardinality();
        boolean z10 = bitSet.get(0);
        if (iCardinality != 1) {
            iHighestOneBit = Integer.highestOneBit(iCardinality - 1) << 1;
            while (iHighestOneBit * 0.5d < iCardinality) {
                iHighestOneBit <<= 1;
            }
        }
        char[] cArr = new char[iHighestOneBit];
        int i12 = iHighestOneBit - 1;
        int iNextSetBit = bitSet.nextSetBit(0);
        long j10 = 0;
        while (true) {
            long j11 = j10;
            if (iNextSetBit == -1) {
                return new i2(cArr, j11, z10, str);
            }
            j10 = (1 << iNextSetBit) | j11;
            int iRotateLeft = Integer.rotateLeft((-862048943) * iNextSetBit, 15) * 461845907;
            while (true) {
                i11 = iRotateLeft & i12;
                if (cArr[i11] == 0) {
                    break;
                }
                iRotateLeft = i11 + 1;
            }
            cArr[i11] = (char) iNextSetBit;
            iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
        }
    }

    @Deprecated
    public static g0 digit() {
        return k.f74643f;
    }

    public static g0 forPredicate(q1 q1Var) {
        return q1Var instanceof g0 ? (g0) q1Var : new m(q1Var);
    }

    public static g0 inRange(char c10, char c11) {
        return new n(c10, c11);
    }

    @Deprecated
    public static g0 invisible() {
        return o.f74662f;
    }

    public static g0 is(char c10) {
        return new p(c10);
    }

    public static g0 isNot(char c10) {
        return new r(c10);
    }

    @Deprecated
    public static g0 javaDigit() {
        return s.f74686b;
    }

    public static g0 javaIsoControl() {
        return t.f74692c;
    }

    @Deprecated
    public static g0 javaLetter() {
        return u.f74699b;
    }

    @Deprecated
    public static g0 javaLetterOrDigit() {
        return v.f74701b;
    }

    @Deprecated
    public static g0 javaLowerCase() {
        return w.f74703b;
    }

    @Deprecated
    public static g0 javaUpperCase() {
        return x.f74712b;
    }

    public static g0 none() {
        return b0.f74585c;
    }

    public static g0 noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @Deprecated
    public static g0 singleWidth() {
        return e0.f74609f;
    }

    public static g0 whitespace() {
        return f0.f74613e;
    }

    public g0 and(g0 g0Var) {
        return new e(this, g0Var);
    }

    public final String b(CharSequence charSequence, int i10, int i11, char c10, StringBuilder sb2, boolean z10) {
        while (i10 < i11) {
            char cCharAt = charSequence.charAt(i10);
            if (!matches(cCharAt)) {
                sb2.append(cCharAt);
                z10 = false;
            } else if (!z10) {
                sb2.append(c10);
                z10 = true;
            }
            i10++;
        }
        return sb2.toString();
    }

    public String collapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (matches(cCharAt)) {
                if (cCharAt != c10 || (i10 != length - 1 && matches(charSequence.charAt(i10 + 1)))) {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i10);
                    sb2.append(c10);
                    return b(charSequence, i10 + 1, length, c10, sb2, true);
                }
                i10++;
            }
            i10++;
            c10 = c10;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence.length(); i11++) {
            if (matches(charSequence.charAt(i11))) {
                i10++;
            }
        }
        return i10;
    }

    public void d(BitSet bitSet) {
        for (int i10 = Settings.DEFAULT_INITIAL_WINDOW_SIZE; i10 >= 0; i10--) {
            if (matches((char) i10)) {
                bitSet.set(i10);
            }
        }
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c10);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public g0 negate() {
        return new z(this);
    }

    public g0 or(g0 g0Var) {
        return new c0(this, g0Var);
    }

    public g0 precomputed() {
        BitSet bitSet = new BitSet();
        d(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return c(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        int i10 = C.DEFAULT_BUFFER_SEGMENT_SIZE - iCardinality;
        String string = toString();
        return new d(c(i10, bitSet, string.endsWith(".negate()") ? string.substring(0, string.length() - 9) : string.concat(".negate()")), string);
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i10 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    break;
                }
                charArray[iIndexIn - i10] = charArray[iIndexIn];
                iIndexIn++;
            }
            return new String(charArray, 0, iIndexIn - i10);
            i10++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c10) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c10;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c10;
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c10) {
        int length = charSequence.length();
        int i10 = length - 1;
        int i11 = 0;
        while (i11 < length && matches(charSequence.charAt(i11))) {
            i11++;
        }
        int i12 = i10;
        while (i12 > i11 && matches(charSequence.charAt(i12))) {
            i12--;
        }
        if (i11 == 0 && i12 == i10) {
            return collapseFrom(charSequence, c10);
        }
        int i13 = i12 + 1;
        return b(charSequence, i11, i13, c10, new StringBuilder(i13 - i11), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length && matches(charSequence.charAt(i10))) {
            i10++;
        }
        int i11 = length - 1;
        while (i11 > i10 && matches(charSequence.charAt(i11))) {
            i11--;
        }
        return charSequence.subSequence(i10, i11 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!matches(charSequence.charAt(i10))) {
                return charSequence.subSequence(i10, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // mh.q1
    @Deprecated
    public boolean apply(Character ch2) {
        return matches(ch2.charValue());
    }

    public int indexIn(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        p1.checkPositionIndex(i10, length);
        while (i10 < length) {
            if (matches(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i10 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb2 = new StringBuilder(a.b.a(length2, 3, 2, 16));
        do {
            sb2.append((CharSequence) string, i10, iIndexIn);
            sb2.append(charSequence2);
            i10 = iIndexIn + 1;
            iIndexIn = indexIn(string, i10);
        } while (iIndexIn != -1);
        sb2.append((CharSequence) string, i10, length2);
        return sb2.toString();
    }
}

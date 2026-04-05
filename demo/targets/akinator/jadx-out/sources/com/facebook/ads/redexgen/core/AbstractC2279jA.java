package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.google.common.base.ElementTypesAreNonnullByDefault;
import com.google.common.base.Strings;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2279jA {
    public static byte[] A00;
    public static String[] A01 = {"rIY6scqdx44s0lYhNsVasOWOliCxkCUS", "XG17z2bEBjC2W", "Vem1quc5hPIJuUrE", "UcFFOKOZJEGoXQOYNnqMCDDpRLrphEx7", "nkZ3L4NSKd4uHuOS6chXEBDQJqUE8doa", "6xQ37guYp3oV6tn7J9L0pQx9gviAFZKh", "Tb0XI9b9KZ2bW8CyI06iyuXMMlzfJONe", "u0lWMQq9JRx7ZEcoLF7IwO0fOB8k5dGw"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> T A04(@CheckForNull T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> T A05(@CheckForNull T reference, @CheckForNull Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            byte b10 = bArrCopyOfRange[i13];
            String[] strArr = A01;
            if (strArr[0].charAt(16) != strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "4hJwB50Ffda8q";
            strArr2[2] = "BvOy7f3XfmcoPFEY";
            bArrCopyOfRange[i13] = (byte) ((b10 ^ i12) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A00 = new byte[]{35, 117, 38, 46, 35, 117, 47, 38, 107, 115, 117, 114, 38, 100, 99, 38, 106, 99, 117, 117, 38, 114, 110, 103, 104, 38, 117, 111, 124, 99, 38, 46, 35, 117, 47, 38, 112, 35, 43, 38, 112, 42, 35, 110, 118, 112, 119, 35, 109, 108, 119, 35, 97, 102, 35, 100, 113, 102, 98, 119, 102, 113, 35, 119, 107, 98, 109, 35, 112, 106, 121, 102, 35, 43, 38, 112, 42, 59, 109, 62, 54, 59, 109, 55, 62, 115, 107, 109, 106, 62, 112, 113, 106, 62, 124, 123, 62, 112, 123, 121, AbstractJsonLexerKt.TC_INVALID, 106, 119, 104, 123, 50, 57, 51, 119, 62, 57, 51, 50, 47, 114, 121, 115, 55, 126, 121, 115, 114, 111, 55, Utf8.REPLACEMENT_BYTE, 50, 100, 62, 55, 122, 98, 100, 99, 55, 121, 120, 99, 55, 117, 114, 55, 123, 114, 100, 100, 55, 99, AbstractJsonLexerKt.TC_INVALID, 118, 121, 55, 100, 99, 118, 101, 99, 55, 126, 121, 115, 114, 111, 55, Utf8.REPLACEMENT_BYTE, 50, 100, 62, 122, 125, 119, 118, 107, 57, 50, 48, 54, 35, 62, 33, 50, 119, 36, 62, 45, 50, 109, 119, AbstractJsonLexerKt.TC_INVALID, 120, 109, 126, 120, 44, 101, 98, 104, 105, 116};
    }

    static {
        A0A();
    }

    public static int A00(int index, int size) {
        return A02(index, size, A06(167, 5, 127));
    }

    public static int A01(int index, int size) {
        return A03(index, size, A06(167, 5, 127));
    }

    public static int A02(int index, int size, String desc) {
        if (index >= 0 && index < size) {
            return index;
        }
        throw new IndexOutOfBoundsException(A08(index, size, desc));
    }

    public static int A03(int index, int size, String desc) {
        if (index >= 0 && index <= size) {
            return index;
        }
        throw new IndexOutOfBoundsException(A09(index, size, desc));
    }

    public static String A07(int start, int end, int size) {
        if (start < 0 || start > size) {
            return A09(start, size, A06(187, 11, 96));
        }
        return (end < 0 || end > size) ? A09(end, size, A06(105, 9, 59)) : Strings.A02(A06(114, 53, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE), Integer.valueOf(end), Integer.valueOf(start));
    }

    public static String A08(int index, int size, String desc) {
        if (index < 0) {
            return Strings.A02(A06(77, 28, 114), desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return Strings.A02(A06(0, 35, 106), desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException(A06(172, 15, 59) + size);
    }

    public static String A09(int index, int size, String desc) {
        if (index < 0) {
            return Strings.A02(A06(77, 28, 114), desc, Integer.valueOf(index));
        }
        if (size >= 0) {
            return Strings.A02(A06(35, 42, 111), desc, Integer.valueOf(index), Integer.valueOf(size));
        }
        throw new IllegalArgumentException(A06(172, 15, 59) + size);
    }

    public static void A0B(int start, int end, int size) {
        if (start >= 0 && end >= start && end <= size) {
        } else {
            throw new IndexOutOfBoundsException(A07(start, end, size));
        }
    }

    public static void A0C(boolean expression) {
        if (expression) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A0D(boolean expression) {
        if (expression) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A0E(@CheckForNull boolean expression, Object errorMessage) {
        if (expression) {
        } else {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    public static void A0F(@CheckForNull boolean expression, Object errorMessage) {
        if (expression) {
        } else {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void A0G(boolean expression, String errorMessageTemplate, int p12, int p22) {
        if (!expression) {
            throw new IllegalArgumentException(Strings.A02(errorMessageTemplate, Integer.valueOf(p12), Integer.valueOf(p22)));
        }
    }

    public static void A0H(boolean expression, String errorMessageTemplate, long p12) {
        if (!expression) {
            throw new IllegalArgumentException(Strings.A02(errorMessageTemplate, Long.valueOf(p12)));
        }
    }
}

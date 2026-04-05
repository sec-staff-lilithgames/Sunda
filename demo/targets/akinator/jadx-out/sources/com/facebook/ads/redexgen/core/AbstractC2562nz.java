package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import com.ironsource.G5;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.nz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2562nz {
    public static byte[] A00;
    public static String[] A01 = {"TjwGK8026J8LuqpHpLFvP2qkj", "KunvWIfGJHX7HbktOkm4MkD4kcFcu9wT", "QjUrIUPqRg1gsQtfLrmUPiSj1", "hJhvRorUNw8eJjUCTMSK9XaE24mC2alD", "Tu6zUEMe1bl4a7998mqTIFcXwEKbBm8m", "M1p7igLEPvcmLPbfEPVmBOai", "JVDSc2uxo9h85gcqbpEojEewGNrzMl9R", "xry660e9EuWNkwUeRbJOaxl6l4kfk7Fh"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @CheckForNull
    public static <V> V A05(@CheckForNull Map<?, V> map, Object key) {
        AbstractC2279jA.A04(map);
        try {
            return map.get(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @CheckForNull
    public static <V> V A06(@CheckForNull Map<?, V> map, Object key) {
        AbstractC2279jA.A04(map);
        try {
            return map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 25);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{76, 64, 0, 29, 21, 0, 6, 17, 0, 1, 54, 12, 31, 0};
        if (A01[5].length() == 3) {
            throw new RuntimeException();
        }
        A01[5] = "l4YJgmx6qI";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0C(@CheckForNull Map<?, ?> map, Object key) {
        AbstractC2279jA.A04(map);
        try {
            return map.containsKey(key);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static {
        A09();
    }

    public static int A00(int expectedSize) {
        if (expectedSize < 3) {
            AbstractC2426ll.A00(expectedSize, A07(2, 12, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
            int i10 = expectedSize + 1;
            if (A01[6].charAt(13) == 's') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "v9VFtcyEVV9ymySR9OVMr7RkF";
            strArr[0] = "Yfss3f07HcaF8zCrtbecDwNdH";
            return i10;
        }
        if (expectedSize < 1073741824) {
            return (int) Math.ceil(expectedSize / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> Map.Entry<K, V> A01(@ParametricNullness K key, @ParametricNullness V value) {
        return new C1082An(key, value);
    }

    public static <K, V> Iterator<K> A02(Iterator<Map.Entry<K, V>> entryIterator) {
        return new C1075Ag(entryIterator);
    }

    public static <K, V> Iterator<V> A03(Iterator<Map.Entry<K, V>> entryIterator) {
        return new C1074Af(entryIterator);
    }

    public static <V> InterfaceC2259ip<Map.Entry<?, V>, V> A04() {
        EnumC1073Ae enumC1073Ae = EnumC1073Ae.A03;
        if (A01[6].charAt(13) == 's') {
            throw new RuntimeException();
        }
        A01[6] = "R0MoS7T4JZROoHrLtuxkN6DM2XkxoreU";
        return enumC1073Ae;
    }

    public static String A08(Map<?, ?> map) {
        StringBuilder sbAppend = AbstractC2431lq.A01(map.size()).append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z10 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z10) {
                String[] strArr = A01;
                if (strArr[3].charAt(29) == strArr[7].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[2] = "LuqjCLBVeKEi1AZvZkL9PbjPH";
                strArr2[0] = "FpOiwMODSylVfNj2ewxL0FWcD";
                sbAppend.append(A07(0, 2, Sdk.SDKError.Reason.TPAT_ERROR_VALUE));
            }
            z10 = false;
            sbAppend.append(entry.getKey()).append(G5.T).append(entry.getValue());
        }
        StringBuilder sb2 = sbAppend.append(AbstractJsonLexerKt.END_OBJ);
        return sb2.toString();
    }

    public static boolean A0A(@CheckForNull Map<?, ?> map, Object value) {
        return AbstractC2523nL.A0E(A03(map.entrySet().iterator()), value);
    }

    public static boolean A0B(@CheckForNull Map<?, ?> map, Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof Map) {
            return map.entrySet().equals(((Map) object).entrySet());
        }
        String[] strArr = A01;
        if (strArr[4].charAt(2) == strArr[1].charAt(2)) {
            throw new RuntimeException();
        }
        A01[5] = "0gxsrdth";
        return false;
    }
}

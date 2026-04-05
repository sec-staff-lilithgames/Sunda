package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.inmobi.commons.core.configs.AdConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2439ly {
    public static byte[] A00;
    public static String[] A01 = {"fJDf", "VkLLWE3ELp7DsfFuFenvwwLsPjI8q3w8", "s9GcUvLboBZm1e6Ekj11FftjBiZdTcWD", "kTl0WqBBPCgx1YUBrq8Yk7FHC1rOJ5oT", "2c7Ei341qIBi4", "zzPJEXqVRlvEQi82OrUT3CEPhy8UQIOr", "ZG1Rx4gICbV4uv7Dpzg", "07yiSgf44iyORMUUp2pTD8D2q1F4zIaZ"};

    public static String A08(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{65, 89, 95, 88, 12, 78, 73, 12, 92, 67, 91, 73, 94, 12, 67, 74, 12, 30, 12, 78, 73, 88, 91, 73, 73, 66, 12, 30, 114, 29, 12, 77, 66, 72, 12, 30, 114, 31, 28, 22, 12};
    }

    static {
        A09();
    }

    public static int A00(int mask) {
        return (mask < 32 ? 4 : 2) * (mask + 1);
    }

    public static int A01(int expectedSize) {
        return Math.max(4, AbstractC2470mU.A01(expectedSize + 1, 1.0d));
    }

    public static int A02(int value, int mask) {
        return (~mask) & value;
    }

    public static int A03(int entry, int mask) {
        return entry & mask;
    }

    public static int A04(int prefix, int suffix, int mask) {
        return ((~mask) & prefix) | (suffix & mask);
    }

    public static int A05(Object table, int index) {
        if (table instanceof byte[]) {
            byte[] bArr = (byte[]) table;
            String[] strArr = A01;
            if (strArr[7].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "gOsQhpmuBfY4V5Uh9EOVYoJDHQZIMaPr";
            strArr2[1] = "iXjLr0Nzfsbh2eLMx3OKOYlS2nK033Z5";
            return bArr[index] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        }
        if (table instanceof short[]) {
            return ((short[]) table)[index] & 65535;
        }
        return ((int[]) table)[index];
    }

    public static int A06(@CheckForNull Object key, @CheckForNull Object value, @CheckForNull int mask, Object table, int[] entries, Object[] keys, Object[] values) {
        int tableIndex = AbstractC2470mU.A02(key);
        int hashPrefix = tableIndex & mask;
        int hash = A05(table, hashPrefix);
        if (hash == 0) {
            return -1;
        }
        int lastEntryIndex = A02(tableIndex, mask);
        int next = -1;
        do {
            int entryIndex = hash - 1;
            int tableIndex2 = entries[entryIndex];
            if (A02(tableIndex2, mask) == lastEntryIndex && BX.A01(key, keys[entryIndex]) && (values == null || BX.A01(value, values[entryIndex]))) {
                int tableIndex3 = A03(tableIndex2, mask);
                if (next == -1) {
                    A0B(table, hashPrefix, tableIndex3);
                } else {
                    entries[next] = A04(entries[next], tableIndex3, mask);
                }
                return entryIndex;
            }
            next = entryIndex;
            hash = A03(tableIndex2, mask);
        } while (hash != 0);
        return -1;
    }

    public static Object A07(int buckets) {
        if (buckets < 2 || buckets > 1073741824 || Integer.highestOneBit(buckets) != buckets) {
            throw new IllegalArgumentException(A08(0, 41, 90) + buckets);
        }
        String[] strArr = A01;
        if (strArr[7].charAt(2) == strArr[1].charAt(2)) {
            throw new RuntimeException();
        }
        A01[4] = "VDEftDKNqOp";
        if (buckets <= 256) {
            return new byte[buckets];
        }
        if (buckets <= 65536) {
            return new short[buckets];
        }
        return new int[buckets];
    }

    public static void A0A(Object table) {
        if (table instanceof byte[]) {
            Arrays.fill((byte[]) table, (byte) 0);
            return;
        }
        if (table instanceof short[]) {
            short[] sArr = (short[]) table;
            String[] strArr = A01;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "hUcb6ZsCLqLA1C86WZWvJTtWEnkRLSAT";
            strArr2[3] = "OMeqeXOrCHp61xmAuW8PqHFLEwFvqHIh";
            Arrays.fill(sArr, (short) 0);
            return;
        }
        Arrays.fill((int[]) table, 0);
    }

    public static void A0B(Object table, int index, int entry) {
        if (table instanceof byte[]) {
            ((byte[]) table)[index] = (byte) entry;
            return;
        }
        boolean z10 = table instanceof short[];
        String[] strArr = A01;
        if (strArr[6].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "nPoOEr0hPUqtXLframy";
        strArr2[0] = "fOVN";
        if (z10) {
            ((short[]) table)[index] = (short) entry;
        } else {
            ((int[]) table)[index] = entry;
        }
    }
}

package com.applovin.shadow.okio;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.u;
import uu.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class Options extends g implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final ByteString[] byteStrings;
    private final int[] trie;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private final void buildTrieRecursive(long j10, Buffer buffer, int i10, List<? extends ByteString> list, int i11, int i12, List<Integer> list2) throws IOException {
            int i13;
            int i14;
            int i15;
            long j11;
            int i16 = i10;
            if (i11 >= i12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i17 = i11; i17 < i12; i17++) {
                if (list.get(i17).size() < i16) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = list.get(i11);
            ByteString byteString2 = list.get(i12 - 1);
            if (i16 == byteString.size()) {
                int iIntValue = list2.get(i11).intValue();
                int i18 = i11 + 1;
                ByteString byteString3 = list.get(i18);
                i13 = i18;
                i14 = iIntValue;
                byteString = byteString3;
            } else {
                i13 = i11;
                i14 = -1;
            }
            if (byteString.getByte(i16) == byteString2.getByte(i16)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i19 = 0;
                for (int i20 = i16; i20 < iMin && byteString.getByte(i20) == byteString2.getByte(i20); i20++) {
                    i19++;
                }
                long intCount = j10 + getIntCount(buffer) + 2 + i19 + 1;
                buffer.writeInt(-i19);
                buffer.writeInt(i14);
                int i21 = i16 + i19;
                while (i16 < i21) {
                    buffer.writeInt(byteString.getByte(i16) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    i16++;
                }
                if (i13 + 1 == i12) {
                    if (i21 != list.get(i13).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    buffer.writeInt(list2.get(i13).intValue());
                    return;
                } else {
                    Buffer buffer2 = new Buffer();
                    buffer.writeInt(((int) (getIntCount(buffer2) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer2, i21, list, i13, i12, list2);
                    buffer.writeAll(buffer2);
                    return;
                }
            }
            int i22 = 1;
            for (int i23 = i13 + 1; i23 < i12; i23++) {
                if (list.get(i23 - 1).getByte(i16) != list.get(i23).getByte(i16)) {
                    i22++;
                }
            }
            long intCount2 = j10 + getIntCount(buffer) + 2 + (i22 * 2);
            buffer.writeInt(i22);
            buffer.writeInt(i14);
            for (int i24 = i13; i24 < i12; i24++) {
                byte b10 = list.get(i24).getByte(i16);
                if (i24 == i13 || b10 != list.get(i24 - 1).getByte(i16)) {
                    buffer.writeInt(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                }
            }
            Buffer buffer3 = new Buffer();
            while (i13 < i12) {
                byte b11 = list.get(i13).getByte(i16);
                int i25 = i13 + 1;
                int i26 = i25;
                while (true) {
                    if (i26 >= i12) {
                        i15 = i12;
                        break;
                    } else {
                        if (b11 != list.get(i26).getByte(i16)) {
                            i15 = i26;
                            break;
                        }
                        i26++;
                    }
                }
                if (i25 == i15 && i16 + 1 == list.get(i13).size()) {
                    buffer.writeInt(list2.get(i13).intValue());
                    j11 = intCount2;
                } else {
                    buffer.writeInt(((int) (getIntCount(buffer3) + intCount2)) * (-1));
                    j11 = intCount2;
                    buildTrieRecursive(j11, buffer3, i16 + 1, list, i13, i15, list2);
                }
                intCount2 = j11;
                i13 = i15;
            }
            buffer.writeAll(buffer3);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j10, Buffer buffer, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            companion.buildTrieRecursive(j10, buffer, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.applovin.shadow.okio.Options of(com.applovin.shadow.okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Options.Companion.of(com.applovin.shadow.okio.ByteString[]):com.applovin.shadow.okio.Options");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, u uVar) {
        this(byteStringArr, iArr);
    }

    public static final Options of(ByteString... byteStringArr) {
        return Companion.of(byteStringArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    public final ByteString[] getByteStrings$okio() {
        return this.byteStrings;
    }

    @Override // uu.g, uu.a
    public int getSize() {
        return this.byteStrings.length;
    }

    public final int[] getTrie$okio() {
        return this.trie;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @Override // uu.g, java.util.List
    public ByteString get(int i10) {
        return this.byteStrings[i10];
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // uu.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}

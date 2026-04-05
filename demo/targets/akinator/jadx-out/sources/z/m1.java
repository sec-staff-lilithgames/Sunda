package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f96876a = {-9187201950435737345L, -1};

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f96877b = new u0(0);

    public static final void convertMetadataForCleanup(long[] metadata, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(metadata, "metadata");
        int i11 = (i10 + 7) >> 3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j10 = metadata[i12] & (-9187201950435737472L);
            metadata[i12] = (-72340172838076674L) & ((~j10) + (j10 >>> 7));
        }
        int lastIndex = uu.k0.getLastIndex(metadata);
        int i13 = lastIndex - 1;
        metadata[i13] = (metadata[i13] & 72057594037927935L) | (-72057594037927936L);
        metadata[lastIndex] = metadata[0];
    }

    public static final <K, V> l1 emptyScatterMap() {
        u0 u0Var = f96877b;
        kotlin.jvm.internal.e0.checkNotNull(u0Var, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return u0Var;
    }

    public static final int get(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static final long group(long[] metadata, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(metadata, "metadata");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        return (((-i12) >> 63) & (metadata[i11 + 1] << (64 - i12))) | (metadata[i11] >>> i12);
    }

    public static final int h1(int i10) {
        return i10 >>> 7;
    }

    public static final int h2(int i10) {
        return i10 & 127;
    }

    public static final boolean hasNext(long j10) {
        return j10 != 0;
    }

    public static final int hash(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean isDeleted(long[] metadata, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 254;
    }

    public static final boolean isEmpty(long[] metadata, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128;
    }

    public static final boolean isFull(long j10) {
        return j10 < 128;
    }

    public static final int loadedCapacity(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    public static final int lowestBitSet(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static final long maskEmpty(long j10) {
        return j10 & ((~j10) << 6) & (-9187201950435737472L);
    }

    public static final long maskEmptyOrDeleted(long j10) {
        return j10 & ((~j10) << 7) & (-9187201950435737472L);
    }

    public static final long match(long j10, int i10) {
        long j11 = j10 ^ (i10 * 72340172838076673L);
        return (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
    }

    public static final <K, V> u0 mutableScatterMapOf() {
        return new u0(0, 1, null);
    }

    public static final long next(long j10) {
        return j10 & (j10 - 1);
    }

    public static final int nextCapacity(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int normalizeCapacity(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    public static final long readRawMetadata(long[] data, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        return (data[i10 >> 3] >> ((i10 & 7) << 3)) & 255;
    }

    public static final int unloadedCapacity(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return ((i10 - 1) / 7) + i10;
    }

    public static final void writeMetadata(long[] data, int i10, int i11, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        int i12 = i11 >> 3;
        int i13 = (i11 & 7) << 3;
        long j11 = (j10 << i13) | (data[i12] & (~(255 << i13)));
        data[i12] = j11;
        data[(((i11 - 7) & i10) + (i10 & 7)) >> 3] = j11;
    }

    public static final void writeRawMetadata(long[] data, int i10, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        data[i11] = (j10 << i12) | (data[i11] & (~(255 << i12)));
    }

    public static final boolean isFull(long[] metadata, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128;
    }

    public static final <K, V> u0 mutableScatterMapOf(tu.v... pairs) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pairs, "pairs");
        u0 u0Var = new u0(pairs.length);
        u0Var.putAll(pairs);
        return u0Var;
    }

    public static /* synthetic */ void getBitmaskLsb$annotations() {
    }

    public static /* synthetic */ void getBitmaskMsb$annotations() {
    }

    public static /* synthetic */ void getSentinel$annotations() {
    }
}

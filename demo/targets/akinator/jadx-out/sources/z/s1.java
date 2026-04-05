package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s1 {

    /* renamed from: a, reason: collision with root package name */
    public static final long[] f96933a = new long[0];

    public static final long clearVisitedBit(long j10) {
        return j10 & 4611686018427387903L;
    }

    public static final long createDstMapping(long j10, int i10) {
        return (j10 & (-4294967296L)) | i10;
    }

    public static final long createLinkToNext(int i10) {
        return (i10 & 2147483647L) | 4611686016279904256L;
    }

    public static final long createLinks(long j10, int i10, int i11, long[] mapping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mapping, "mapping");
        return (((j10 & (-4611686018427387904L)) | (i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i10] & 4294967295L))) << 31) | (i11 != Integer.MAX_VALUE ? (int) (mapping[i11] & 4294967295L) : Integer.MAX_VALUE);
    }

    public static final long createMapping(int i10, int i11) {
        return i11 | (i10 << 32);
    }

    public static final long createSrcMapping(long j10, int i10) {
        return (j10 & 4294967295L) | (i10 << 32);
    }

    public static final long eraseSrcMapping(long j10) {
        return (j10 & 4294967295L) | (-4294967296L);
    }

    public static final int getDst(long j10) {
        return (int) (j10 & 4294967295L);
    }

    public static final long[] getEmptyNodes() {
        return f96933a;
    }

    public static final int getNextNode(long j10) {
        return (int) (j10 & 2147483647L);
    }

    public static final int getPreviousNode(long j10) {
        return (int) ((j10 >> 31) & 2147483647L);
    }

    public static final int getSrc(long j10) {
        return (int) ((j10 >> 32) & 4294967295L);
    }

    public static final int getVisited(long j10) {
        return (int) ((j10 >> 62) & 1);
    }

    public static final long setLinkToNext(long j10, int i10) {
        return (j10 & (-2147483648L)) | (i10 & 2147483647L);
    }

    public static final long setLinkToPrevious(long j10, int i10) {
        return (j10 & (-4611686016279904257L)) | ((i10 & 2147483647L) << 31);
    }

    public static final long createLinks(long j10, int i10, int i11, int[] mapping) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mapping, "mapping");
        return (((j10 & (-4611686018427387904L)) | (i10 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i10])) << 31) | (i11 != Integer.MAX_VALUE ? mapping[i11] : Integer.MAX_VALUE);
    }

    public static /* synthetic */ void getNodeInvalidLink$annotations() {
    }

    public static /* synthetic */ void getNodeLinkMask$annotations() {
    }

    public static /* synthetic */ void getNextNode$annotations(long j10) {
    }

    public static /* synthetic */ void getPreviousNode$annotations(long j10) {
    }
}

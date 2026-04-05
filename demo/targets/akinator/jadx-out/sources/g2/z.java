package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final long f56889a;

    /* renamed from: b, reason: collision with root package name */
    public final long f56890b;

    /* renamed from: c, reason: collision with root package name */
    public final int f56891c;

    public z(long j10, long j11, int i10, kotlin.jvm.internal.u uVar) {
        this.f56889a = j10;
        this.f56890b = j11;
        this.f56891c = i10;
        if (s2.a0.m6730isUnspecifiedR2X_6o(j10)) {
            throw new IllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (s2.a0.m6730isUnspecifiedR2X_6o(j11)) {
            throw new IllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ z m4046copyK8Q__8$default(z zVar, long j10, long j11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = zVar.f56889a;
        }
        long j12 = j10;
        if ((i11 & 2) != 0) {
            j11 = zVar.f56890b;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            i10 = zVar.f56891c;
        }
        return zVar.m4047copyK8Q__8(j12, j13, i10);
    }

    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final z m4047copyK8Q__8(long j10, long j11, int i10) {
        return new z(j10, j11, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return s2.z.m6991equalsimpl0(this.f56889a, zVar.f56889a) && s2.z.m6991equalsimpl0(this.f56890b, zVar.f56890b) && b0.m3969equalsimpl0(this.f56891c, zVar.f56891c);
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m4048getHeightXSAIIZE() {
        return this.f56890b;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m4049getPlaceholderVerticalAlignJ6kI3mc() {
        return this.f56891c;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m4050getWidthXSAIIZE() {
        return this.f56889a;
    }

    public int hashCode() {
        return b0.m3970hashCodeimpl(this.f56891c) + ((s2.z.m6995hashCodeimpl(this.f56890b) + (s2.z.m6995hashCodeimpl(this.f56889a) * 31)) * 31);
    }

    public String toString() {
        return "Placeholder(width=" + ((Object) s2.z.m7001toStringimpl(this.f56889a)) + ", height=" + ((Object) s2.z.m7001toStringimpl(this.f56890b)) + ", placeholderVerticalAlign=" + ((Object) b0.m3971toStringimpl(this.f56891c)) + ')';
    }
}

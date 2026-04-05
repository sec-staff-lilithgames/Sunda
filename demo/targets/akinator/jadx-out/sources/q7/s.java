package q7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f82555a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82556b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82557c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82558d;

    /* renamed from: e, reason: collision with root package name */
    public final c7.n f82559e;

    public s() {
        this(false, false, false, 0, null, 31, null);
    }

    public static /* synthetic */ s copy$default(s sVar, boolean z10, boolean z11, boolean z12, int i10, c7.n nVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z10 = sVar.f82555a;
        }
        if ((i11 & 2) != 0) {
            z11 = sVar.f82556b;
        }
        if ((i11 & 4) != 0) {
            z12 = sVar.f82557c;
        }
        if ((i11 & 8) != 0) {
            i10 = sVar.f82558d;
        }
        if ((i11 & 16) != 0) {
            nVar = sVar.f82559e;
        }
        c7.n nVar2 = nVar;
        boolean z13 = z12;
        return sVar.copy(z10, z11, z13, i10, nVar2);
    }

    public final s copy(boolean z10, boolean z11, boolean z12, int i10, c7.n nVar) {
        return new s(z10, z11, z12, i10, nVar);
    }

    public final boolean getAddLastModifiedToFileCacheKey() {
        return this.f82555a;
    }

    public final c7.n getBitmapFactoryExifOrientationPolicy() {
        return this.f82559e;
    }

    public final int getBitmapFactoryMaxParallelism() {
        return this.f82558d;
    }

    public final boolean getNetworkObserverEnabled() {
        return this.f82556b;
    }

    public final boolean getRespectCacheHeaders() {
        return this.f82557c;
    }

    public s(boolean z10, boolean z11, boolean z12, int i10, c7.n nVar) {
        this.f82555a = z10;
        this.f82556b = z11;
        this.f82557c = z12;
        this.f82558d = i10;
        this.f82559e = nVar;
    }

    public /* synthetic */ s(boolean z10, boolean z11, boolean z12, int i10, c7.n nVar, int i11, kotlin.jvm.internal.u uVar) {
        this((i11 & 1) != 0 ? true : z10, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? true : z12, (i11 & 8) != 0 ? 4 : i10, (i11 & 16) != 0 ? c7.n.f11845b : nVar);
    }
}

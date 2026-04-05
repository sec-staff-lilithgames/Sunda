package m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final a f73816a;

    /* renamed from: b, reason: collision with root package name */
    public final a f73817b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f73818c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final r2.k f73819a;

        /* renamed from: b, reason: collision with root package name */
        public final int f73820b;

        /* renamed from: c, reason: collision with root package name */
        public final long f73821c;

        public a(r2.k direction, int i10, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
            this.f73819a = direction;
            this.f73820b = i10;
            this.f73821c = j10;
        }

        public static /* synthetic */ a copy$default(a aVar, r2.k kVar, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                kVar = aVar.f73819a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f73820b;
            }
            if ((i11 & 4) != 0) {
                j10 = aVar.f73821c;
            }
            return aVar.copy(kVar, i10, j10);
        }

        public final r2.k component1() {
            return this.f73819a;
        }

        public final int component2() {
            return this.f73820b;
        }

        public final long component3() {
            return this.f73821c;
        }

        public final a copy(r2.k direction, int i10, long j10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(direction, "direction");
            return new a(direction, i10, j10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f73819a == aVar.f73819a && this.f73820b == aVar.f73820b && this.f73821c == aVar.f73821c;
        }

        public final r2.k getDirection() {
            return this.f73819a;
        }

        public final int getOffset() {
            return this.f73820b;
        }

        public final long getSelectableId() {
            return this.f73821c;
        }

        public int hashCode() {
            return Long.hashCode(this.f73821c) + e3.g.d(this.f73820b, this.f73819a.hashCode() * 31, 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("AnchorInfo(direction=");
            sb2.append(this.f73819a);
            sb2.append(", offset=");
            sb2.append(this.f73820b);
            sb2.append(", selectableId=");
            return e3.g.n(sb2, this.f73821c, ')');
        }
    }

    public s(a start, a end, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(end, "end");
        this.f73816a = start;
        this.f73817b = end;
        this.f73818c = z10;
    }

    public static /* synthetic */ s copy$default(s sVar, a aVar, a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = sVar.f73816a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = sVar.f73817b;
        }
        if ((i10 & 4) != 0) {
            z10 = sVar.f73818c;
        }
        return sVar.copy(aVar, aVar2, z10);
    }

    public final a component1() {
        return this.f73816a;
    }

    public final a component2() {
        return this.f73817b;
    }

    public final boolean component3() {
        return this.f73818c;
    }

    public final s copy(a start, a end, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(start, "start");
        kotlin.jvm.internal.e0.checkNotNullParameter(end, "end");
        return new s(start, end, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f73816a, sVar.f73816a) && kotlin.jvm.internal.e0.areEqual(this.f73817b, sVar.f73817b) && this.f73818c == sVar.f73818c;
    }

    public final a getEnd() {
        return this.f73817b;
    }

    public final boolean getHandlesCrossed() {
        return this.f73818c;
    }

    public final a getStart() {
        return this.f73816a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iHashCode = (this.f73817b.hashCode() + (this.f73816a.hashCode() * 31)) * 31;
        boolean z10 = this.f73818c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode + i10;
    }

    public final s merge(s sVar) {
        return sVar == null ? this : this.f73818c ? copy$default(this, sVar.f73816a, null, false, 6, null) : copy$default(this, null, sVar.f73817b, false, 5, null);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Selection(start=");
        sb2.append(this.f73816a);
        sb2.append(", end=");
        sb2.append(this.f73817b);
        sb2.append(", handlesCrossed=");
        return a.b.p(sb2, this.f73818c, ')');
    }

    /* renamed from: toTextRange-d9O1mEE, reason: not valid java name */
    public final long m5565toTextRanged9O1mEE() {
        return g2.b2.TextRange(this.f73816a.getOffset(), this.f73817b.getOffset());
    }

    public /* synthetic */ s(a aVar, a aVar2, boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this(aVar, aVar2, (i10 & 4) != 0 ? false : z10);
    }
}

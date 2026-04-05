package com.inmobi.media;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.c6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2715c6 {
    private final boolean GPID;

    public C2715c6() {
        this(false, 1, null);
    }

    public final boolean a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2715c6) && this.GPID == ((C2715c6) obj).GPID;
    }

    public final int hashCode() {
        boolean z10 = this.GPID;
        if (z10) {
            return 1;
        }
        return z10 ? 1 : 0;
    }

    public final String toString() {
        return a.b.p(new StringBuilder("IncludeIdParams(GPID="), this.GPID, ')');
    }

    public C2715c6(boolean z10) {
        this.GPID = z10;
    }

    public /* synthetic */ C2715c6(boolean z10, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? true : z10);
    }
}

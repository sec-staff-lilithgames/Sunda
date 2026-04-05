package u1;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f87555a;

    /* renamed from: b, reason: collision with root package name */
    public final long f87556b;

    /* renamed from: c, reason: collision with root package name */
    public final long f87557c;

    /* renamed from: d, reason: collision with root package name */
    public final long f87558d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f87559e;

    /* renamed from: f, reason: collision with root package name */
    public final int f87560f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87561g;

    /* renamed from: h, reason: collision with root package name */
    public final List f87562h;

    /* renamed from: i, reason: collision with root package name */
    public final long f87563i;

    public f0(long j10, long j11, long j12, long j13, boolean z10, int i10, boolean z11, List list, long j14, kotlin.jvm.internal.u uVar) {
        this.f87555a = j10;
        this.f87556b = j11;
        this.f87557c = j12;
        this.f87558d = j13;
        this.f87559e = z10;
        this.f87560f = i10;
        this.f87561g = z11;
        this.f87562h = list;
        this.f87563i = j14;
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m7304component1J3iCeTQ() {
        return this.f87555a;
    }

    public final long component2() {
        return this.f87556b;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m7305component3F1C5BW0() {
        return this.f87557c;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m7306component4F1C5BW0() {
        return this.f87558d;
    }

    public final boolean component5() {
        return this.f87559e;
    }

    /* renamed from: component6-T8wyACA, reason: not valid java name */
    public final int m7307component6T8wyACA() {
        return this.f87560f;
    }

    public final boolean component7() {
        return this.f87561g;
    }

    public final List<e> component8() {
        return this.f87562h;
    }

    /* renamed from: component9-F1C5BW0, reason: not valid java name */
    public final long m7308component9F1C5BW0() {
        return this.f87563i;
    }

    /* renamed from: copy-JzxSYW4, reason: not valid java name */
    public final f0 m7309copyJzxSYW4(long j10, long j11, long j12, long j13, boolean z10, int i10, boolean z11, List<e> historical, long j14) {
        kotlin.jvm.internal.e0.checkNotNullParameter(historical, "historical");
        return new f0(j10, j11, j12, j13, z10, i10, z11, historical, j14, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return b0.m7258equalsimpl0(this.f87555a, f0Var.f87555a) && this.f87556b == f0Var.f87556b && i1.h.m4182equalsimpl0(this.f87557c, f0Var.f87557c) && i1.h.m4182equalsimpl0(this.f87558d, f0Var.f87558d) && this.f87559e == f0Var.f87559e && z0.m7397equalsimpl0(this.f87560f, f0Var.f87560f) && this.f87561g == f0Var.f87561g && kotlin.jvm.internal.e0.areEqual(this.f87562h, f0Var.f87562h) && i1.h.m4182equalsimpl0(this.f87563i, f0Var.f87563i);
    }

    public final boolean getDown() {
        return this.f87559e;
    }

    public final List<e> getHistorical() {
        return this.f87562h;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m7310getIdJ3iCeTQ() {
        return this.f87555a;
    }

    public final boolean getIssuesEnterExit() {
        return this.f87561g;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m7311getPositionF1C5BW0() {
        return this.f87558d;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m7312getPositionOnScreenF1C5BW0() {
        return this.f87557c;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m7313getScrollDeltaF1C5BW0() {
        return this.f87563i;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m7314getTypeT8wyACA() {
        return this.f87560f;
    }

    public final long getUptime() {
        return this.f87556b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM4187hashCodeimpl = (i1.h.m4187hashCodeimpl(this.f87558d) + ((i1.h.m4187hashCodeimpl(this.f87557c) + o2.d(b0.m7259hashCodeimpl(this.f87555a) * 31, 31, this.f87556b)) * 31)) * 31;
        boolean z10 = this.f87559e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int iM7398hashCodeimpl = (z0.m7398hashCodeimpl(this.f87560f) + ((iM4187hashCodeimpl + i10) * 31)) * 31;
        boolean z11 = this.f87561g;
        return i1.h.m4187hashCodeimpl(this.f87563i) + j1.o2.c((iM7398hashCodeimpl + (z11 ? 1 : z11 ? 1 : 0)) * 31, 31, this.f87562h);
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) b0.m7260toStringimpl(this.f87555a)) + ", uptime=" + this.f87556b + ", positionOnScreen=" + ((Object) i1.h.m4193toStringimpl(this.f87557c)) + ", position=" + ((Object) i1.h.m4193toStringimpl(this.f87558d)) + ", down=" + this.f87559e + ", type=" + ((Object) z0.m7399toStringimpl(this.f87560f)) + ", issuesEnterExit=" + this.f87561g + ", historical=" + this.f87562h + ", scrollDelta=" + ((Object) i1.h.m4193toStringimpl(this.f87563i)) + ')';
    }

    public /* synthetic */ f0(long j10, long j11, long j12, long j13, boolean z10, int i10, boolean z11, List list, long j14, int i11, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, j13, z10, i10, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? new ArrayList() : list, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j14, null);
    }
}

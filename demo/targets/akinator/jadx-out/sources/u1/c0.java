package u1;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f87522a;

    /* renamed from: b, reason: collision with root package name */
    public final long f87523b;

    /* renamed from: c, reason: collision with root package name */
    public final long f87524c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87525d;

    /* renamed from: e, reason: collision with root package name */
    public final long f87526e;

    /* renamed from: f, reason: collision with root package name */
    public final long f87527f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87528g;

    /* renamed from: h, reason: collision with root package name */
    public final int f87529h;

    /* renamed from: i, reason: collision with root package name */
    public final long f87530i;

    /* renamed from: j, reason: collision with root package name */
    public final List f87531j;

    /* renamed from: k, reason: collision with root package name */
    public d f87532k;

    public c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, kotlin.jvm.internal.u uVar) {
        this.f87522a = j10;
        this.f87523b = j11;
        this.f87524c = j12;
        this.f87525d = z10;
        this.f87526e = j13;
        this.f87527f = j14;
        this.f87528g = z11;
        this.f87529h = i10;
        this.f87530i = j15;
        this.f87532k = new d(z12, z12);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ c0 m7286copy0GkPj7c$default(c0 c0Var, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, d dVar, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? c0Var.f87522a : j10;
        long j18 = (i11 & 2) != 0 ? c0Var.f87523b : j11;
        long j19 = (i11 & 4) != 0 ? c0Var.f87524c : j12;
        boolean z12 = (i11 & 8) != 0 ? c0Var.f87525d : z10;
        long j20 = (i11 & 16) != 0 ? c0Var.f87526e : j13;
        long j21 = (i11 & 32) != 0 ? c0Var.f87527f : j14;
        boolean z13 = (i11 & 64) != 0 ? c0Var.f87528g : z11;
        int i12 = (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? c0Var.f87529h : i10;
        if ((i11 & 512) != 0) {
            j16 = c0Var.f87530i;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return c0Var.m7290copy0GkPj7c(j17, j18, j19, z12, j20, j21, z13, dVar, i12, j16);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ c0 m7288copyJKmWfYY$default(c0 c0Var, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15, int i11, Object obj) {
        long j16;
        long j17;
        long j18 = (i11 & 1) != 0 ? c0Var.f87522a : j10;
        long j19 = (i11 & 2) != 0 ? c0Var.f87523b : j11;
        long j20 = (i11 & 4) != 0 ? c0Var.f87524c : j12;
        boolean z12 = (i11 & 8) != 0 ? c0Var.f87525d : z10;
        long j21 = (i11 & 16) != 0 ? c0Var.f87526e : j13;
        long j22 = (i11 & 32) != 0 ? c0Var.f87527f : j14;
        boolean z13 = (i11 & 64) != 0 ? c0Var.f87528g : z11;
        int i12 = (i11 & 128) != 0 ? c0Var.f87529h : i10;
        if ((i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            j16 = c0Var.f87530i;
            j17 = j18;
        } else {
            j16 = j15;
            j17 = j18;
        }
        return c0Var.m7292copyJKmWfYY(j17, j19, j20, z12, j21, j22, z13, i12, j16);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ c0 m7289copyOHpmEuE$default(c0 c0Var, long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List list, long j15, int i11, Object obj) {
        long j16;
        long j17 = (i11 & 1) != 0 ? c0Var.f87522a : j10;
        long j18 = (i11 & 2) != 0 ? c0Var.f87523b : j11;
        long j19 = (i11 & 4) != 0 ? c0Var.f87524c : j12;
        boolean z12 = (i11 & 8) != 0 ? c0Var.f87525d : z10;
        long j20 = (i11 & 16) != 0 ? c0Var.f87526e : j13;
        long j21 = (i11 & 32) != 0 ? c0Var.f87527f : j14;
        boolean z13 = (i11 & 64) != 0 ? c0Var.f87528g : z11;
        int i12 = (i11 & 128) != 0 ? c0Var.f87529h : i10;
        if ((i11 & 512) != 0) {
            j16 = c0Var.f87530i;
            j17 = j17;
        } else {
            j16 = j15;
        }
        return c0Var.m7293copyOHpmEuE(j17, j18, j19, z12, j20, j21, z13, i12, list, j16);
    }

    public final void consume() {
        this.f87532k.setDownChange(true);
        this.f87532k.setPositionChange(true);
    }

    @tu.f
    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final c0 m7290copy0GkPj7c(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, d consumed, int i10, long j15) {
        kotlin.jvm.internal.e0.checkNotNullParameter(consumed, "consumed");
        c0 c0Var = new c0(j10, j11, j12, z10, j13, j14, z11, consumed.getDownChange() || consumed.getPositionChange(), i10, getHistorical(), j15, (kotlin.jvm.internal.u) null);
        this.f87532k = consumed;
        return c0Var;
    }

    @tu.f
    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ c0 m7291copyEzrO64(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, d consumed, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(consumed, "consumed");
        c0 c0Var = new c0(j10, j11, j12, z10, j13, j14, z11, consumed.getDownChange() || consumed.getPositionChange(), i10, getHistorical(), this.f87530i, (kotlin.jvm.internal.u) null);
        this.f87532k = consumed;
        return c0Var;
    }

    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final c0 m7292copyJKmWfYY(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, long j15) {
        c0 c0Var = new c0(j10, j11, j12, z10, j13, j14, z11, false, i10, (List) getHistorical(), j15, (kotlin.jvm.internal.u) null);
        c0Var.f87532k = this.f87532k;
        return c0Var;
    }

    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final c0 m7293copyOHpmEuE(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, int i10, List<e> historical, long j15) {
        kotlin.jvm.internal.e0.checkNotNullParameter(historical, "historical");
        c0 c0Var = new c0(j10, j11, j12, z10, j13, j14, z11, false, i10, (List) historical, j15, (kotlin.jvm.internal.u) null);
        c0Var.f87532k = this.f87532k;
        return c0Var;
    }

    public final d getConsumed() {
        return this.f87532k;
    }

    public final List<e> getHistorical() {
        List<e> list = this.f87531j;
        return list == null ? uu.p0.emptyList() : list;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m7294getIdJ3iCeTQ() {
        return this.f87522a;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m7295getPositionF1C5BW0() {
        return this.f87524c;
    }

    public final boolean getPressed() {
        return this.f87525d;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m7296getPreviousPositionF1C5BW0() {
        return this.f87527f;
    }

    public final boolean getPreviousPressed() {
        return this.f87528g;
    }

    public final long getPreviousUptimeMillis() {
        return this.f87526e;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m7297getScrollDeltaF1C5BW0() {
        return this.f87530i;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m7298getTypeT8wyACA() {
        return this.f87529h;
    }

    public final long getUptimeMillis() {
        return this.f87523b;
    }

    public final boolean isConsumed() {
        return this.f87532k.getDownChange() || this.f87532k.getPositionChange();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) b0.m7260toStringimpl(this.f87522a)) + ", uptimeMillis=" + this.f87523b + ", position=" + ((Object) i1.h.m4193toStringimpl(this.f87524c)) + ", pressed=" + this.f87525d + ", previousUptimeMillis=" + this.f87526e + ", previousPosition=" + ((Object) i1.h.m4193toStringimpl(this.f87527f)) + ", previousPressed=" + this.f87528g + ", isConsumed=" + isConsumed() + ", type=" + ((Object) z0.m7399toStringimpl(this.f87529h)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) i1.h.m4193toStringimpl(this.f87530i)) + ')';
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, long j15, int i11, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? z0.f87698b.m7393getTouchT8wyACA() : i10, (i11 & 512) != 0 ? i1.h.f59344b.m4173getZeroF1C5BW0() : j15, (kotlin.jvm.internal.u) null);
    }

    public /* synthetic */ c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, d dVar, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, dVar, (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? z0.f87698b.m7393getTouchT8wyACA() : i10, null);
    }

    @tu.f
    public c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, d dVar, int i10, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, dVar.getDownChange() || dVar.getPositionChange(), i10, i1.h.f59344b.m4173getZeroF1C5BW0(), (kotlin.jvm.internal.u) null);
    }

    @tu.f
    public static /* synthetic */ void getConsumed$annotations() {
    }

    public static /* synthetic */ void getHistorical$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    public c0(long j10, long j11, long j12, boolean z10, long j13, long j14, boolean z11, boolean z12, int i10, List list, long j15, kotlin.jvm.internal.u uVar) {
        this(j10, j11, j12, z10, j13, j14, z11, z12, i10, j15, (kotlin.jvm.internal.u) null);
        this.f87531j = list;
    }
}

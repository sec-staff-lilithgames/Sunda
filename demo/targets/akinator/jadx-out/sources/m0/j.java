package m0;

import a2.g5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final g5 f73763a;

    /* renamed from: b, reason: collision with root package name */
    public int f73764b;

    /* renamed from: c, reason: collision with root package name */
    public u1.c0 f73765c;

    public j(g5 viewConfiguration) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        this.f73763a = viewConfiguration;
    }

    public final int getClicks() {
        return this.f73764b;
    }

    public final u1.c0 getPrevClick() {
        return this.f73765c;
    }

    public final boolean positionIsTolerable(u1.c0 prevClick, u1.c0 newClick) {
        kotlin.jvm.internal.e0.checkNotNullParameter(prevClick, "prevClick");
        kotlin.jvm.internal.e0.checkNotNullParameter(newClick, "newClick");
        return ((double) i1.h.m4183getDistanceimpl(i1.h.m4189minusMKHz9U(newClick.m7295getPositionF1C5BW0(), prevClick.m7295getPositionF1C5BW0()))) < 100.0d;
    }

    public final void setClicks(int i10) {
        this.f73764b = i10;
    }

    public final void setPrevClick(u1.c0 c0Var) {
        this.f73765c = c0Var;
    }

    public final boolean timeIsTolerable(u1.c0 prevClick, u1.c0 newClick) {
        kotlin.jvm.internal.e0.checkNotNullParameter(prevClick, "prevClick");
        kotlin.jvm.internal.e0.checkNotNullParameter(newClick, "newClick");
        return newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.f73763a.getDoubleTapTimeoutMillis();
    }

    public final void update(u1.m event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        u1.c0 c0Var = this.f73765c;
        u1.c0 c0Var2 = event.getChanges().get(0);
        if (c0Var != null && timeIsTolerable(c0Var, c0Var2) && positionIsTolerable(c0Var, c0Var2)) {
            this.f73764b++;
        } else {
            this.f73764b = 1;
        }
        this.f73765c = c0Var2;
    }
}

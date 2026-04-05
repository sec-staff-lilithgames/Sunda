package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f54676a;

    /* renamed from: b, reason: collision with root package name */
    public final h1 f54677b;

    /* renamed from: c, reason: collision with root package name */
    public final b f54678c;

    public y0(r eventType, h1 sessionData, b applicationInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionData, "sessionData");
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f54676a = eventType;
        this.f54677b = sessionData;
        this.f54678c = applicationInfo;
    }

    public static /* synthetic */ y0 copy$default(y0 y0Var, r rVar, h1 h1Var, b bVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = y0Var.f54676a;
        }
        if ((i10 & 2) != 0) {
            h1Var = y0Var.f54677b;
        }
        if ((i10 & 4) != 0) {
            bVar = y0Var.f54678c;
        }
        return y0Var.copy(rVar, h1Var, bVar);
    }

    public final r component1() {
        return this.f54676a;
    }

    public final h1 component2() {
        return this.f54677b;
    }

    public final b component3() {
        return this.f54678c;
    }

    public final y0 copy(r eventType, h1 sessionData, b applicationInfo) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionData, "sessionData");
        kotlin.jvm.internal.e0.checkNotNullParameter(applicationInfo, "applicationInfo");
        return new y0(eventType, sessionData, applicationInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f54676a == y0Var.f54676a && kotlin.jvm.internal.e0.areEqual(this.f54677b, y0Var.f54677b) && kotlin.jvm.internal.e0.areEqual(this.f54678c, y0Var.f54678c);
    }

    public final b getApplicationInfo() {
        return this.f54678c;
    }

    public final r getEventType() {
        return this.f54676a;
    }

    public final h1 getSessionData() {
        return this.f54677b;
    }

    public int hashCode() {
        return this.f54678c.hashCode() + ((this.f54677b.hashCode() + (this.f54676a.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f54676a + ", sessionData=" + this.f54677b + ", applicationInfo=" + this.f54678c + ')';
    }
}

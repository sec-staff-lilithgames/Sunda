package fk;

import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f55735a;

    public f(String sessionId) {
        e0.checkNotNullParameter(sessionId, "sessionId");
        this.f55735a = sessionId;
    }

    public static /* synthetic */ f copy$default(f fVar, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fVar.f55735a;
        }
        return fVar.copy(str);
    }

    public final String component1() {
        return this.f55735a;
    }

    public final f copy(String sessionId) {
        e0.checkNotNullParameter(sessionId, "sessionId");
        return new f(sessionId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && e0.areEqual(this.f55735a, ((f) obj).f55735a);
    }

    public final String getSessionId() {
        return this.f55735a;
    }

    public int hashCode() {
        return this.f55735a.hashCode();
    }

    public String toString() {
        return o2.q(new StringBuilder("SessionDetails(sessionId="), this.f55735a, ')');
    }
}

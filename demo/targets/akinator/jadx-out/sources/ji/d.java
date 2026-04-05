package ji;

import java.util.Map;
import kotlin.jvm.internal.e0;
import p0.o2;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f69582a;

    /* renamed from: b, reason: collision with root package name */
    public final long f69583b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f69584c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(String sessionId, long j10) {
        this(sessionId, j10, null, 4, null);
        e0.checkNotNullParameter(sessionId, "sessionId");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ d copy$default(d dVar, String str, long j10, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dVar.f69582a;
        }
        if ((i10 & 2) != 0) {
            j10 = dVar.f69583b;
        }
        if ((i10 & 4) != 0) {
            map = dVar.f69584c;
        }
        return dVar.copy(str, j10, map);
    }

    public final String component1() {
        return this.f69582a;
    }

    public final long component2() {
        return this.f69583b;
    }

    public final Map<String, String> component3() {
        return this.f69584c;
    }

    public final d copy(String sessionId, long j10, Map<String, String> additionalCustomKeys) {
        e0.checkNotNullParameter(sessionId, "sessionId");
        e0.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        return new d(sessionId, j10, additionalCustomKeys);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return e0.areEqual(this.f69582a, dVar.f69582a) && this.f69583b == dVar.f69583b && e0.areEqual(this.f69584c, dVar.f69584c);
    }

    public final Map<String, String> getAdditionalCustomKeys() {
        return this.f69584c;
    }

    public final String getSessionId() {
        return this.f69582a;
    }

    public final long getTimestamp() {
        return this.f69583b;
    }

    public int hashCode() {
        return this.f69584c.hashCode() + o2.d(this.f69582a.hashCode() * 31, 31, this.f69583b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventMetadata(sessionId=");
        sb2.append(this.f69582a);
        sb2.append(", timestamp=");
        sb2.append(this.f69583b);
        sb2.append(", additionalCustomKeys=");
        return j1.o2.q(sb2, this.f69584c, ')');
    }

    public d(String sessionId, long j10, Map<String, String> additionalCustomKeys) {
        e0.checkNotNullParameter(sessionId, "sessionId");
        e0.checkNotNullParameter(additionalCustomKeys, "additionalCustomKeys");
        this.f69582a = sessionId;
        this.f69583b = j10;
        this.f69584c = additionalCustomKeys;
    }

    public /* synthetic */ d(String str, long j10, Map map, int i10, kotlin.jvm.internal.u uVar) {
        this(str, j10, (i10 & 4) != 0 ? p1.emptyMap() : map);
    }
}

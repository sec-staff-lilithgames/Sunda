package ek;

import hr.kNq.ikJMrW;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f54540a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54541b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54542c;

    /* renamed from: d, reason: collision with root package name */
    public final long f54543d;

    /* renamed from: e, reason: collision with root package name */
    public final n f54544e;

    /* renamed from: f, reason: collision with root package name */
    public final String f54545f;

    /* renamed from: g, reason: collision with root package name */
    public final String f54546g;

    public h1(String sessionId, String firstSessionId, int i10, long j10, n dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f54540a = sessionId;
        this.f54541b = firstSessionId;
        this.f54542c = i10;
        this.f54543d = j10;
        this.f54544e = dataCollectionStatus;
        this.f54545f = firebaseInstallationId;
        this.f54546g = firebaseAuthenticationToken;
    }

    public static /* synthetic */ h1 copy$default(h1 h1Var, String str, String str2, int i10, long j10, n nVar, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = h1Var.f54540a;
        }
        if ((i11 & 2) != 0) {
            str2 = h1Var.f54541b;
        }
        if ((i11 & 4) != 0) {
            i10 = h1Var.f54542c;
        }
        if ((i11 & 8) != 0) {
            j10 = h1Var.f54543d;
        }
        if ((i11 & 16) != 0) {
            nVar = h1Var.f54544e;
        }
        if ((i11 & 32) != 0) {
            str3 = h1Var.f54545f;
        }
        if ((i11 & 64) != 0) {
            str4 = h1Var.f54546g;
        }
        String str5 = str4;
        n nVar2 = nVar;
        long j11 = j10;
        int i12 = i10;
        return h1Var.copy(str, str2, i12, j11, nVar2, str3, str5);
    }

    public final String component1() {
        return this.f54540a;
    }

    public final String component2() {
        return this.f54541b;
    }

    public final int component3() {
        return this.f54542c;
    }

    public final long component4() {
        return this.f54543d;
    }

    public final n component5() {
        return this.f54544e;
    }

    public final String component6() {
        return this.f54545f;
    }

    public final String component7() {
        return this.f54546g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f54540a, h1Var.f54540a) && kotlin.jvm.internal.e0.areEqual(this.f54541b, h1Var.f54541b) && this.f54542c == h1Var.f54542c && this.f54543d == h1Var.f54543d && kotlin.jvm.internal.e0.areEqual(this.f54544e, h1Var.f54544e) && kotlin.jvm.internal.e0.areEqual(this.f54545f, h1Var.f54545f) && kotlin.jvm.internal.e0.areEqual(this.f54546g, h1Var.f54546g);
    }

    public final n getDataCollectionStatus() {
        return this.f54544e;
    }

    public final long getEventTimestampUs() {
        return this.f54543d;
    }

    public final String getFirebaseAuthenticationToken() {
        return this.f54546g;
    }

    public final String getFirebaseInstallationId() {
        return this.f54545f;
    }

    public final String getFirstSessionId() {
        return this.f54541b;
    }

    public final String getSessionId() {
        return this.f54540a;
    }

    public final int getSessionIndex() {
        return this.f54542c;
    }

    public int hashCode() {
        return this.f54546g.hashCode() + o2.e((this.f54544e.hashCode() + o2.d(e3.g.d(this.f54542c, o2.e(this.f54540a.hashCode() * 31, 31, this.f54541b), 31), 31, this.f54543d)) * 31, 31, this.f54545f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f54540a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f54541b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f54542c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f54543d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f54544e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f54545f);
        sb2.append(", firebaseAuthenticationToken=");
        return o2.q(sb2, this.f54546g, ')');
    }

    public final h1 copy(String sessionId, String str, int i10, long j10, n dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.e0.checkNotNullParameter(sessionId, "sessionId");
        kotlin.jvm.internal.e0.checkNotNullParameter(str, ikJMrW.ohFkmHhiRIxNImh);
        kotlin.jvm.internal.e0.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        kotlin.jvm.internal.e0.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new h1(sessionId, str, i10, j10, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }
}

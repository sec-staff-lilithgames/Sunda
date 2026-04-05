package l5;

import android.adservices.measurement.DeletionRequest;
import android.net.Uri;
import j$.time.Instant;
import j$.time.TimeConversions;
import j1.o2;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f72403a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72404b;

    /* renamed from: c, reason: collision with root package name */
    public final Instant f72405c;

    /* renamed from: d, reason: collision with root package name */
    public final Instant f72406d;

    /* renamed from: e, reason: collision with root package name */
    public final List f72407e;

    /* renamed from: f, reason: collision with root package name */
    public final List f72408f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: l5.a$a, reason: collision with other inner class name */
    public static final class C0739a {
        public C0739a(u uVar) {
        }
    }

    static {
        new C0739a(null);
    }

    public a(int i10, int i11, Instant start, Instant end, List<? extends Uri> domainUris, List<? extends Uri> originUris) {
        e0.checkNotNullParameter(start, "start");
        e0.checkNotNullParameter(end, "end");
        e0.checkNotNullParameter(domainUris, "domainUris");
        e0.checkNotNullParameter(originUris, "originUris");
        this.f72403a = i10;
        this.f72404b = i11;
        this.f72405c = start;
        this.f72406d = end;
        this.f72407e = domainUris;
        this.f72408f = originUris;
    }

    public final DeletionRequest convertToAdServices$ads_adservices_release() {
        DeletionRequest deletionRequestBuild = new DeletionRequest.Builder().setDeletionMode(this.f72403a).setMatchBehavior(this.f72404b).setStart(TimeConversions.convert(this.f72405c)).setEnd(TimeConversions.convert(this.f72406d)).setDomainUris(this.f72407e).setOriginUris(this.f72408f).build();
        e0.checkNotNullExpressionValue(deletionRequestBuild, "Builder()\n            .s…ris)\n            .build()");
        return deletionRequestBuild;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f72403a == aVar.f72403a && e0.areEqual(new HashSet(this.f72407e), new HashSet(aVar.f72407e)) && e0.areEqual(new HashSet(this.f72408f), new HashSet(aVar.f72408f)) && e0.areEqual(this.f72405c, aVar.f72405c) && e0.areEqual(this.f72406d, aVar.f72406d) && this.f72404b == aVar.f72404b;
    }

    public final int getDeletionMode() {
        return this.f72403a;
    }

    public final List<Uri> getDomainUris() {
        return this.f72407e;
    }

    public final Instant getEnd() {
        return this.f72406d;
    }

    public final int getMatchBehavior() {
        return this.f72404b;
    }

    public final List<Uri> getOriginUris() {
        return this.f72408f;
    }

    public final Instant getStart() {
        return this.f72405c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f72404b) + ((this.f72406d.hashCode() + ((this.f72405c.hashCode() + o2.c(o2.c(Integer.hashCode(this.f72403a) * 31, 31, this.f72407e), 31, this.f72408f)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbB = b3.h.b("DeletionRequest { DeletionMode=", this.f72403a == 0 ? "DELETION_MODE_ALL" : "DELETION_MODE_EXCLUDE_INTERNAL_DATA", ", MatchBehavior=", this.f72404b == 0 ? "MATCH_BEHAVIOR_DELETE" : "MATCH_BEHAVIOR_PRESERVE", ", Start=");
        sbB.append(this.f72405c);
        sbB.append(", End=");
        sbB.append(this.f72406d);
        sbB.append(", DomainUris=");
        sbB.append(this.f72407e);
        sbB.append(", OriginUris=");
        sbB.append(this.f72408f);
        sbB.append(" }");
        return sbB.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(int i10, int i11, Instant MIN, Instant MAX, List list, List list2, int i12, u uVar) {
        if ((i12 & 4) != 0) {
            MIN = Instant.MIN;
            e0.checkNotNullExpressionValue(MIN, "MIN");
        }
        Instant instant = MIN;
        if ((i12 & 8) != 0) {
            MAX = Instant.MAX;
            e0.checkNotNullExpressionValue(MAX, "MAX");
        }
        this(i10, i11, instant, MAX, (i12 & 16) != 0 ? p0.emptyList() : list, (i12 & 32) != 0 ? p0.emptyList() : list2);
    }
}

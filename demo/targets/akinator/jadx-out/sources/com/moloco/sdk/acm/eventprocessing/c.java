package com.moloco.sdk.acm.eventprocessing;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import com.moloco.sdk.l9;
import com.moloco.sdk.n9;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final g f45557a;

    public c(g dataAgeChecker) {
        e0.checkNotNullParameter(dataAgeChecker, "dataAgeChecker");
        this.f45557a = dataAgeChecker;
    }

    @Override // com.moloco.sdk.acm.eventprocessing.a
    public com.moloco.sdk.acm.http.e a(List<com.moloco.sdk.acm.db.b> events) {
        e0.checkNotNullParameter(events, "events");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.moloco.sdk.acm.db.b bVar : events) {
            if (!this.f45557a.a(bVar)) {
                int i10 = b.f45556a[bVar.h().ordinal()];
                if (i10 == 1) {
                    l9 l9VarAddAllTags = MetricsRequest$PostMetricsRequest.CountEvent.newBuilder().setName(bVar.j()).addAllTags(bVar.k());
                    Long lG = bVar.g();
                    if (lG != null) {
                        l9VarAddAllTags.setCount((int) lG.longValue());
                    }
                    GeneratedMessageLite generatedMessageLiteBuild = l9VarAddAllTags.build();
                    e0.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
                    arrayList2.add(generatedMessageLiteBuild);
                } else {
                    if (i10 != 2) {
                        throw new t();
                    }
                    n9 n9VarAddAllTags = MetricsRequest$PostMetricsRequest.TimerEvent.newBuilder().setName(bVar.j()).addAllTags(bVar.k());
                    Long lG2 = bVar.g();
                    if (lG2 != null) {
                        n9VarAddAllTags.setElapsedTimeMillis(lG2.longValue());
                    }
                    GeneratedMessageLite generatedMessageLiteBuild2 = n9VarAddAllTags.build();
                    e0.checkNotNullExpressionValue(generatedMessageLiteBuild2, "build(...)");
                    arrayList.add(generatedMessageLiteBuild2);
                }
            }
        }
        return new com.moloco.sdk.acm.http.e(arrayList2, arrayList);
    }
}

package m5;

import android.adservices.topics.GetTopicsRequest;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f74034a = new c();

    public final GetTopicsRequest convertRequestWithRecordObservation$ads_adservices_release(b request) {
        e0.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(request.getAdsSdkName()).setShouldRecordObservation(request.shouldRecordObservation()).build();
        e0.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }

    public final GetTopicsRequest convertRequestWithoutRecordObservation$ads_adservices_release(b request) {
        e0.checkNotNullParameter(request, "request");
        GetTopicsRequest getTopicsRequestBuild = new GetTopicsRequest.Builder().setAdsSdkName(request.getAdsSdkName()).build();
        e0.checkNotNullExpressionValue(getTopicsRequestBuild, "Builder()\n            .s…ame)\n            .build()");
        return getTopicsRequestBuild;
    }
}

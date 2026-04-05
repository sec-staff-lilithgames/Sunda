package m5;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k extends p {
    /* JADX WARN: Illegal instructions before constructor call */
    public k(Context context) {
        e0.checkNotNullParameter(context, "context");
        TopicsManager topicsManager = TopicsManager.get(context);
        e0.checkNotNullExpressionValue(topicsManager, "get(context)");
        super(topicsManager);
    }

    @Override // m5.p
    public GetTopicsRequest convertRequest$ads_adservices_release(b request) {
        e0.checkNotNullParameter(request, "request");
        return c.f74034a.convertRequestWithRecordObservation$ads_adservices_release(request);
    }
}

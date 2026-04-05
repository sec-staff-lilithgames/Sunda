package m5;

import android.adservices.topics.GetTopicsRequest;
import android.content.Context;
import com.unity3d.ads.beta.xyn.RnJusJ;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class n extends p {
    /* JADX WARN: Illegal instructions before constructor call */
    public n(Context context) {
        e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService((Class<Object>) li.a.e());
        e0.checkNotNullExpressionValue(systemService, "context.getSystemService…opicsManager::class.java)");
        super(li.a.d(systemService));
    }

    @Override // m5.p
    public GetTopicsRequest convertRequest$ads_adservices_release(b bVar) {
        e0.checkNotNullParameter(bVar, RnJusJ.SbEOz);
        return c.f74034a.convertRequestWithRecordObservation$ads_adservices_release(bVar);
    }
}

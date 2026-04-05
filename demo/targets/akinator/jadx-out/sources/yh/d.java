package yh;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface d {
    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    List<c> getConditionalUserProperties(String str, String str2);

    int getMaxUserProperties(String str);

    Map<String, Object> getUserProperties(boolean z10);

    void logEvent(String str, String str2, Bundle bundle);

    a registerAnalyticsConnectorListener(String str, b bVar);

    void setConditionalUserProperty(c cVar);

    void setUserProperty(String str, String str2, Object obj);
}

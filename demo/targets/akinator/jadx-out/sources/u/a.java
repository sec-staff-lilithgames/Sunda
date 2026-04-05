package u;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface a {
    void onExtraCallback(String str, Bundle bundle);

    Bundle onExtraCallbackWithResult(String str, Bundle bundle);

    void onNavigationEvent(int i10, Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}

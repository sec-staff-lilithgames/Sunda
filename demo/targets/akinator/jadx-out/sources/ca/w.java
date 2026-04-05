package ca;

import io.odeeo.sdk.common.SdkInitializationListener;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w implements SdkInitializationListener {
    @Override // io.odeeo.sdk.common.SdkInitializationListener
    public void onInitializationFailed(int i10, String str) {
        Timber.tag("ODEEO").e("Init failed : %s", str);
    }

    @Override // io.odeeo.sdk.common.SdkInitializationListener
    public void onInitializationSucceed() {
        Timber.tag("ODEEO").d("Init OK", new Object[0]);
    }
}

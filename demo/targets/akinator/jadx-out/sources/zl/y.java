package zl;

import android.app.Activity;
import io.bidmachine.AdsFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class y extends t {
    public y(l lVar, AdsFormat adsFormat, s sVar) {
        super(lVar, adsFormat, sVar);
    }

    public abstract void c(Activity activity, z zVar);

    public final void show(Activity activity, z zVar) {
        nm.j.onUiThread(new h(this, 2, activity, zVar));
    }
}

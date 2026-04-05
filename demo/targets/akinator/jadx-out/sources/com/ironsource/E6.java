package com.ironsource;

import android.app.Activity;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface E6 {
    void a(Activity activity);

    void a(C3458t6 c3458t6);

    void a(C3458t6 c3458t6, IronSourceError ironSourceError);

    void a(C3458t6 c3458t6, LevelPlayAdInfo levelPlayAdInfo);

    void b(C3458t6 c3458t6, IronSourceError ironSourceError);

    void b(C3458t6 c3458t6, LevelPlayAdInfo levelPlayAdInfo);

    void c(C3458t6 c3458t6, LevelPlayAdInfo levelPlayAdInfo);

    void loadAd();
}

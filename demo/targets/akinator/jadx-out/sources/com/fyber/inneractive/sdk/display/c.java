package com.fyber.inneractive.sdk.display;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends a {
    @Override // com.fyber.inneractive.sdk.display.a
    public final void a(Activity activity, InneractiveAdSpot inneractiveAdSpot, String str) {
        Intent intent = new Intent(activity, (Class<?>) InneractiveFullscreenAdActivity.class);
        intent.putExtra("spotId", inneractiveAdSpot.getLocalUniqueId());
        try {
            IAlog.a("%sIAInterstitialUtil: Opening interstitial for spot id: %s", IAlog.a(activity), inneractiveAdSpot.getLocalUniqueId());
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            IAlog.c("%sIAInterstitialUtil: InneractiveFullscreenAdActivity.class not found. Did you declare InneractiveFullscreenAdActivity in your manifest?", IAlog.a(activity));
        }
    }
}

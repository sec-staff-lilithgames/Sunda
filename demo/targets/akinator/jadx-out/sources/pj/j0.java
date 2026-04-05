package pj;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j0 {
    public rj.v providesAppForegroundRateLimit() {
        return rj.v.builder().setLimit(1L).setLimiterKey("APP_FOREGROUND_ONE_PER_DAY_LIMITER_KEY").setTimeToLiveMillis(TimeUnit.DAYS.toMillis(1L)).build();
    }
}

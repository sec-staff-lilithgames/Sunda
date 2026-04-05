package io.bidmachine;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface AdProcessCallback {
    void onBrokenCreativeEvent(Map<String, Object> map);

    void processClicked();

    void processClosed();

    void processDestroy();

    void processExpired();

    void processFillAd();

    void processFinished();

    void processLoadFail(pr.a aVar);

    void processLoadSuccess();

    void processShowFail(pr.a aVar);

    void processShown();

    void processStartVisibilityTracker();

    void processVisibilityTrackerImpression();

    boolean processVisibilityTrackerShown();

    void setVisibilitySource(nm.m mVar);
}

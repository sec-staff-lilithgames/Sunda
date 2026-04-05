package hr;

import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface f extends c {
    @Override // hr.c
    /* synthetic */ void onAdClicked();

    @Override // hr.c
    /* synthetic */ void onAdExpired();

    @Override // hr.c
    /* synthetic */ void onAdLoadFailed(pr.a aVar);

    void onAdLoaded(View view);

    @Override // hr.c
    /* synthetic */ void onAdShowFailed(pr.a aVar);

    @Override // hr.c
    /* synthetic */ void onAdShown();

    @Override // hr.c
    /* synthetic */ void onBrokenCreativeEvent(Map map);

    @Override // hr.c
    /* synthetic */ void setVisibilitySource(nm.m mVar);
}

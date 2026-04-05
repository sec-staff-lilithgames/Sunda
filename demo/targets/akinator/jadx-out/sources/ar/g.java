package ar;

import android.view.View;
import android.view.ViewGroup;
import br.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface g extends e {
    @Override // ar.e
    /* synthetic */ void destroy(Runnable runnable);

    @Override // ar.e
    /* synthetic */ void onClicked();

    @Override // ar.e
    /* synthetic */ void onError(h0 h0Var);

    void onMediaCompleted();

    void onMediaFirstQuartile();

    void onMediaMidpoint();

    void onMediaPaused();

    void onMediaResumed();

    void onMediaSkipped();

    void onMediaStarted(float f10, float f11);

    void onMediaThirdQuartile();

    void onMediaVolumeChanged(float f10);

    @Override // ar.e
    /* synthetic */ void onShown();

    @Override // ar.e
    /* synthetic */ void onViewAddedToContainer(View view, ViewGroup viewGroup);

    @Override // ar.e
    /* synthetic */ void onViewCreated(View view);

    @Override // ar.e
    /* synthetic */ void onViewReady(View view);
}

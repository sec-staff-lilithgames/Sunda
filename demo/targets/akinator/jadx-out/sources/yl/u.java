package yl;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.adsession.media.Position;
import com.iab.omid.library.appodeal.adsession.media.VastProperties;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class u extends j implements ar.g {

    /* renamed from: i, reason: collision with root package name */
    public final List f94623i;

    /* renamed from: j, reason: collision with root package name */
    public final VastProperties f94624j;

    public u(List<VerificationScriptResource> list, Float f10) {
        this.f94623i = list;
        this.f94624j = (f10 == null || f10.floatValue() < 0.0f) ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia(f10.floatValue(), true, Position.STANDALONE);
    }

    @Override // yl.j
    public final void c(AdEvents adEvents) {
        adEvents.loaded(this.f94624j);
    }

    @Override // ar.g
    public void onMediaCompleted() {
        nm.j.onUiThread(new p(this));
    }

    @Override // ar.g
    public void onMediaFirstQuartile() {
        nm.j.onUiThread(new m(this));
    }

    @Override // ar.g
    public void onMediaMidpoint() {
        nm.j.onUiThread(new n(this));
    }

    @Override // ar.g
    public void onMediaPaused() {
        nm.j.onUiThread(new q(this));
    }

    @Override // ar.g
    public void onMediaResumed() {
        nm.j.onUiThread(new r(this));
    }

    @Override // ar.g
    public void onMediaSkipped() {
        nm.j.onUiThread(new t(this));
    }

    @Override // ar.g
    public void onMediaStarted(float f10, float f11) {
        nm.j.onUiThread(new l(this, f10, f11));
    }

    @Override // ar.g
    public void onMediaThirdQuartile() {
        nm.j.onUiThread(new o(this));
    }

    @Override // ar.g
    public void onMediaVolumeChanged(float f10) {
        nm.j.onUiThread(new s(this, f10));
    }

    @Override // yl.j, ar.e
    public void onViewAddedToContainer(View view, ViewGroup viewGroup) {
        nm.j.onUiThread(new i(this, viewGroup));
    }

    @Override // yl.j, ar.e
    public void onViewCreated(View view) {
        nm.j.onUiThread(new k(this));
    }

    @Override // yl.j, ar.e
    public void onViewReady(View view) {
        if (this.f94605c.compareAndSet(false, true)) {
            nm.j.onUiThread(new g(this));
        }
    }
}

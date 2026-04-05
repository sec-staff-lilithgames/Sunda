package fn;

import android.text.TextUtils;
import com.iab.omid.library.appodeal.adsession.AdEvents;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.adsession.media.Position;
import com.iab.omid.library.appodeal.adsession.media.VastProperties;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class y extends r implements sm.c, io.bidmachine.iab.vast.f {

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f55782i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public Float f55783j;

    public void addVerificationScriptResource(String str, String str2, String str3) {
        try {
            URL url = new URL(str);
            this.f55782i.add((TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) ? VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url) : VerificationScriptResource.createVerificationScriptResourceWithParameters(str2, url, str3));
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }

    public void addVerificationScriptResourceList(List<ym.d> list) {
        if (list == null) {
            return;
        }
        nm.j.onUiThread(new w(this, list));
    }

    @Override // fn.r
    public final void b(AdEvents adEvents) {
        Float f10 = this.f55783j;
        adEvents.loaded(f10 == null ? VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE) : VastProperties.createVastPropertiesForSkippableMedia(f10.floatValue(), true, Position.STANDALONE));
        r.a("onAdLoaded");
    }

    @Override // sm.c
    public void onVastModelLoaded(io.bidmachine.iab.vast.t tVar) {
        nm.j.onUiThread(new u(this, tVar));
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoCompleted() {
        onMediaCompleted();
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoFirstQuartile() {
        onMediaFirstQuartile();
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoMidpoint() {
        onMediaMidpoint();
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoPaused() {
        onMediaPaused();
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoResumed() {
        onMediaResumed();
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoSkipped() {
        onMediaSkipped();
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoStarted(float f10, float f11) {
        onMediaStarted(f10, f11);
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoThirdQuartile() {
        onMediaThirdQuartile();
    }

    @Override // io.bidmachine.iab.vast.f
    public void onVideoVolumeChanged(float f10) {
        onMediaVolumeChanged(f10);
    }

    public void setSkipOffset(Float f10) {
        this.f55783j = f10;
    }

    public void setupAdMeasurer(io.bidmachine.iab.vast.t tVar) {
        nm.j.onUiThread(new v(this, tVar));
    }
}

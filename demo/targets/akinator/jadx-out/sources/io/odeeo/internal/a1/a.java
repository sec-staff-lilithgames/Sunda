package io.odeeo.internal.a1;

import android.content.res.Resources;
import android.text.TextUtils;
import com.iab.omid.library.odeeoio.adsession.AdEvents;
import com.iab.omid.library.odeeoio.adsession.AdSession;
import com.iab.omid.library.odeeoio.adsession.AdSessionConfiguration;
import com.iab.omid.library.odeeoio.adsession.AdSessionContext;
import com.iab.omid.library.odeeoio.adsession.CreativeType;
import com.iab.omid.library.odeeoio.adsession.ImpressionType;
import com.iab.omid.library.odeeoio.adsession.Owner;
import com.iab.omid.library.odeeoio.adsession.Partner;
import com.iab.omid.library.odeeoio.adsession.VerificationScriptResource;
import com.iab.omid.library.odeeoio.adsession.media.InteractionType;
import com.iab.omid.library.odeeoio.adsession.media.MediaEvents;
import com.iab.omid.library.odeeoio.adsession.media.VastProperties;
import io.odeeo.internal.v1.p;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.R;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public AdSession f62536b;

    /* renamed from: c, reason: collision with root package name */
    public AdSessionContext f62537c;

    /* renamed from: d, reason: collision with root package name */
    public AdSessionConfiguration f62538d;

    /* renamed from: e, reason: collision with root package name */
    public AdEvents f62539e;

    /* renamed from: f, reason: collision with root package name */
    public MediaEvents f62540f;

    /* renamed from: a, reason: collision with root package name */
    public final Partner f62535a = Partner.createPartner("odeeoio", OdeeoSDK.SDK_VERSION);

    /* renamed from: g, reason: collision with root package name */
    public String f62541g = "";

    public final AdSessionContext a(List<VerificationScriptResource> list) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f62535a, this.f62541g, list, null, null);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.d(e10, "Unable to create AdSessionContext.", new Object[0]);
            return null;
        }
    }

    public final void adUserInteractionClickEvent() {
        io.odeeo.internal.b2.a.d("Ad user interaction click event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.adUserInteraction(InteractionType.CLICK);
    }

    public final AdSession b() {
        try {
            return AdSession.createAdSession(this.f62538d, this.f62537c);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.d(e10, "Unable to create AdSession.", new Object[0]);
            return null;
        }
    }

    public final void bufferFinishMediaEvent() {
        io.odeeo.internal.b2.a.d("Buffer finish media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.bufferFinish();
    }

    public final void bufferStartMediaEvent() {
        io.odeeo.internal.b2.a.d("Buffer start media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.bufferStart();
    }

    public final AdSessionConfiguration c() {
        try {
            CreativeType creativeType = CreativeType.AUDIO;
            ImpressionType impressionType = ImpressionType.AUDIBLE;
            Owner owner = Owner.NATIVE;
            return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.d(e10, "Unable to create AdSessionConfiguration.", new Object[0]);
            return null;
        }
    }

    public final void completeMediaEvent() {
        io.odeeo.internal.b2.a.d("Complete media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.complete();
    }

    public final MediaEvents d() {
        try {
            return MediaEvents.createMediaEvents(this.f62536b);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.d(e10, "Unable to create MediaEvents.", new Object[0]);
            return null;
        }
    }

    public final void finish() {
        io.odeeo.internal.b2.a.d("Finishing ad session...", new Object[0]);
        AdSession adSession = this.f62536b;
        if (adSession == null) {
            return;
        }
        adSession.finish();
    }

    public final void firstQuartileMediaEvent() {
        io.odeeo.internal.b2.a.d("First quartile media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.firstQuartile();
    }

    public final List<VerificationScriptResource> getVerificationResources$odeeoSdk_release(List<io.odeeo.internal.l1.a> verifications) {
        e0.checkNotNullParameter(verifications, "verifications");
        ArrayList arrayList = new ArrayList();
        for (io.odeeo.internal.l1.a aVar : verifications) {
            String vendor = aVar.getVendor();
            io.odeeo.internal.l1.b javascriptResource = aVar.getJavascriptResource();
            VerificationScriptResource verificationScriptResource = VerificationScriptResource.createVerificationScriptResourceWithParameters(vendor, new URL(javascriptResource.getUri()), aVar.getVerificationParameters());
            e0.checkNotNullExpressionValue(verificationScriptResource, "verificationScriptResource");
            arrayList.add(verificationScriptResource);
        }
        return arrayList;
    }

    public final void impressionOccurred() {
        io.odeeo.internal.b2.a.d("Impression occurred event.", new Object[0]);
        AdEvents adEvents = this.f62539e;
        if (adEvents == null) {
            return;
        }
        adEvents.impressionOccurred();
    }

    public final void initialize(Resources resources, List<io.odeeo.internal.l1.a> verifications) {
        e0.checkNotNullParameter(resources, "resources");
        e0.checkNotNullParameter(verifications, "verifications");
        io.odeeo.internal.b2.a.d("Initializing OmSdkAdSessionController...", new Object[0]);
        InputStream inputStreamOpenRawResource = resources.openRawResource(R.raw.omsdk);
        e0.checkNotNullExpressionValue(inputStreamOpenRawResource, "resources.openRawResource(R.raw.omsdk)");
        this.f62541g = p.f67286a.getResponse(inputStreamOpenRawResource);
        this.f62537c = a(getVerificationResources$odeeoSdk_release(verifications));
        this.f62538d = c();
        this.f62536b = b();
        this.f62539e = a();
        this.f62540f = d();
        io.odeeo.internal.b2.a.d("OmSdkAdSessionController initialized.", new Object[0]);
    }

    public final boolean isAdEventsInitialized() {
        return this.f62539e != null;
    }

    public final boolean isAdSessionConfigurationInitialized() {
        return this.f62538d != null;
    }

    public final boolean isAdSessionContextInitialized() {
        return this.f62537c != null;
    }

    public final boolean isAdSessionInitialized() {
        return this.f62536b != null;
    }

    public final boolean isMediaEventsInitialized() {
        return this.f62540f != null;
    }

    public final boolean isOmidJSEmpty() {
        return TextUtils.isEmpty(this.f62541g);
    }

    public final boolean isPartnerCreated() {
        return this.f62535a != null;
    }

    public final void loadedEvent(VastProperties vProps) {
        e0.checkNotNullParameter(vProps, "vProps");
        io.odeeo.internal.b2.a.d("Loaded event with properties.", new Object[0]);
        AdEvents adEvents = this.f62539e;
        if (adEvents == null) {
            return;
        }
        adEvents.loaded(vProps);
    }

    public final void midpointMediaEvent() {
        io.odeeo.internal.b2.a.d("Midpoint media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.midpoint();
    }

    public final void pauseMediaEvent() {
        io.odeeo.internal.b2.a.d("Pause media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.pause();
    }

    public final void resumeMediaEvent() {
        io.odeeo.internal.b2.a.d("Resume media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.resume();
    }

    public final void skippedMediaEvent() {
        io.odeeo.internal.b2.a.d("Skipped media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.skipped();
    }

    public final void start() {
        io.odeeo.internal.b2.a.d("Starting ad session...", new Object[0]);
        AdSession adSession = this.f62536b;
        if (adSession == null) {
            return;
        }
        adSession.start();
    }

    public final void startMediaEvent(float f10, float f11) {
        io.odeeo.internal.b2.a.d("Start media event with duration: " + f10 + " and silentMode: " + f11 + '.', new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.start(f10, f11);
    }

    public final void thirdQuartileMediaEvent() {
        io.odeeo.internal.b2.a.d("Third quartile media event.", new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.thirdQuartile();
    }

    public final void volumeChangeMediaEvent(float f10) {
        io.odeeo.internal.b2.a.d("Volume change media event to: " + f10 + '.', new Object[0]);
        MediaEvents mediaEvents = this.f62540f;
        if (mediaEvents == null) {
            return;
        }
        mediaEvents.volumeChange(f10);
    }

    public final AdEvents a() {
        try {
            return AdEvents.createAdEvents(this.f62536b);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.d(e10, "Unable to create AdEvents.", new Object[0]);
            return null;
        }
    }
}

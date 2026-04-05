package io.odeeo.sdk.advertisement.data;

import io.odeeo.internal.l1.a;
import io.odeeo.internal.l1.c;
import io.odeeo.internal.l1.d;
import io.odeeo.sdk.AdUnitBase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import uu.p0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class AdInfo {
    public static final Companion Companion = new Companion(null);
    public static final int HEIGHT = 50;
    public static final int WIDTH = 320;
    private final d vast;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdInfo() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String getCompanionHtml$odeeoSdk_release() {
        d dVar = this.vast;
        if (dVar == null) {
            return null;
        }
        return dVar.getCompanionHtmlResource();
    }

    public final String getCompanionUrl$odeeoSdk_release() {
        d dVar = this.vast;
        if (dVar == null) {
            return null;
        }
        return dVar.getCompanionStaticResource();
    }

    public final List<String> getEvent$odeeoSdk_release(AdUnitBase.TrackEvent eventName) {
        ArrayList arrayList;
        List<c> trackingEvents;
        e0.checkNotNullParameter(eventName, "eventName");
        d dVar = this.vast;
        if (dVar == null || (trackingEvents = dVar.getTrackingEvents()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : trackingEvents) {
                if (e0.areEqual(((c) obj).getName(), eventName.getValue())) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(q0.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((c) it.next()).getUri());
            }
        }
        return arrayList == null ? p0.emptyList() : arrayList;
    }

    public final List<String> getImpressionTrackingUrls$odeeoSdk_release() {
        ArrayList arrayList;
        List<c> impressionTracking;
        d dVar = this.vast;
        if (dVar == null || (impressionTracking = dVar.getImpressionTracking()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(impressionTracking, 10));
            Iterator<T> it = impressionTracking.iterator();
            while (it.hasNext()) {
                arrayList2.add(((c) it.next()).getUri());
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? p0.emptyList() : arrayList;
    }

    public final String getMimeType() {
        return "mp3";
    }

    public final List<String> getOnClickTrackingEvents$odeeoSdk_release() {
        ArrayList arrayList;
        List<c> clickTracking;
        d dVar = this.vast;
        if (dVar == null || (clickTracking = dVar.getClickTracking()) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(clickTracking, 10));
            Iterator<T> it = clickTracking.iterator();
            while (it.hasNext()) {
                arrayList2.add(((c) it.next()).getUri());
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? p0.emptyList() : arrayList;
    }

    public final String getOnClickTroughEvent$odeeoSdk_release() {
        d dVar = this.vast;
        if (dVar == null) {
            return null;
        }
        return dVar.getClickThrough();
    }

    public final double getPricing$odeeoSdk_release() {
        d dVar = this.vast;
        if (dVar == null) {
            return 0.0d;
        }
        return dVar.getCpm();
    }

    public final String getRewardGrantedCallbackUrl() {
        d dVar = this.vast;
        if (dVar == null) {
            return null;
        }
        return dVar.getRewardGrantedCallbackUrl();
    }

    public final String getRewardRejectedCallbackUrl() {
        d dVar = this.vast;
        if (dVar == null) {
            return null;
        }
        return dVar.getRewardRejectedCallbackUrl();
    }

    public final String getTrackingEventPayload$odeeoSdk_release() {
        String payload;
        d dVar = this.vast;
        return (dVar == null || (payload = dVar.getPayload()) == null) ? "" : payload;
    }

    public final String getUrl$odeeoSdk_release() {
        String mediaFile;
        d dVar = this.vast;
        return (dVar == null || (mediaFile = dVar.getMediaFile()) == null) ? "" : mediaFile;
    }

    public final List<a> getVerifications$odeeoSdk_release() {
        d dVar = this.vast;
        if (dVar == null) {
            return null;
        }
        return dVar.getAdVerifications();
    }

    public final boolean getVisualiserEnabled$odeeoSdk_release() {
        return io.odeeo.internal.w1.c.f67352p.getVisualizerVisibility(this);
    }

    public final boolean isInitialized() {
        return this.vast != null;
    }

    public AdInfo(d dVar) {
        this.vast = dVar;
    }

    public /* synthetic */ AdInfo(d dVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : dVar);
    }
}

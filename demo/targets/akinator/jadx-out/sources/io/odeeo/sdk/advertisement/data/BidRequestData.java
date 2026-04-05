package io.odeeo.sdk.advertisement.data;

import androidx.core.app.NotificationCompat;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j1.o2;
import java.util.Map;
import kotlin.jvm.internal.e0;
import lk.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class BidRequestData {
    private final Application application;

    @c("custom_attrs")
    private final Map<String, String> customAttrs;
    private final Device device;
    private final Geo geo;
    private final Placement placement;
    private final Regulations regulations;
    private final Request request;
    private final User user;
    private final Volume volume;

    public BidRequestData(User user, Request request, Application application, Placement placement, Device device, Geo geo, Volume volume, Regulations regulations, Map<String, String> customAttrs) {
        e0.checkNotNullParameter(user, "user");
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(application, "application");
        e0.checkNotNullParameter(placement, "placement");
        e0.checkNotNullParameter(device, "device");
        e0.checkNotNullParameter(geo, "geo");
        e0.checkNotNullParameter(volume, "volume");
        e0.checkNotNullParameter(regulations, "regulations");
        e0.checkNotNullParameter(customAttrs, "customAttrs");
        this.user = user;
        this.request = request;
        this.application = application;
        this.placement = placement;
        this.device = device;
        this.geo = geo;
        this.volume = volume;
        this.regulations = regulations;
        this.customAttrs = customAttrs;
    }

    public static /* synthetic */ BidRequestData copy$default(BidRequestData bidRequestData, User user, Request request, Application application, Placement placement, Device device, Geo geo, Volume volume, Regulations regulations, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            user = bidRequestData.user;
        }
        if ((i10 & 2) != 0) {
            request = bidRequestData.request;
        }
        if ((i10 & 4) != 0) {
            application = bidRequestData.application;
        }
        if ((i10 & 8) != 0) {
            placement = bidRequestData.placement;
        }
        if ((i10 & 16) != 0) {
            device = bidRequestData.device;
        }
        if ((i10 & 32) != 0) {
            geo = bidRequestData.geo;
        }
        if ((i10 & 64) != 0) {
            volume = bidRequestData.volume;
        }
        if ((i10 & 128) != 0) {
            regulations = bidRequestData.regulations;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            map = bidRequestData.customAttrs;
        }
        Regulations regulations2 = regulations;
        Map map2 = map;
        Geo geo2 = geo;
        Volume volume2 = volume;
        Device device2 = device;
        Application application2 = application;
        return bidRequestData.copy(user, request, application2, placement, device2, geo2, volume2, regulations2, map2);
    }

    public final User component1() {
        return this.user;
    }

    public final Request component2() {
        return this.request;
    }

    public final Application component3() {
        return this.application;
    }

    public final Placement component4() {
        return this.placement;
    }

    public final Device component5() {
        return this.device;
    }

    public final Geo component6() {
        return this.geo;
    }

    public final Volume component7() {
        return this.volume;
    }

    public final Regulations component8() {
        return this.regulations;
    }

    public final Map<String, String> component9() {
        return this.customAttrs;
    }

    public final BidRequestData copy(User user, Request request, Application application, Placement placement, Device device, Geo geo, Volume volume, Regulations regulations, Map<String, String> customAttrs) {
        e0.checkNotNullParameter(user, "user");
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(application, "application");
        e0.checkNotNullParameter(placement, "placement");
        e0.checkNotNullParameter(device, "device");
        e0.checkNotNullParameter(geo, "geo");
        e0.checkNotNullParameter(volume, "volume");
        e0.checkNotNullParameter(regulations, "regulations");
        e0.checkNotNullParameter(customAttrs, "customAttrs");
        return new BidRequestData(user, request, application, placement, device, geo, volume, regulations, customAttrs);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BidRequestData)) {
            return false;
        }
        BidRequestData bidRequestData = (BidRequestData) obj;
        return e0.areEqual(this.user, bidRequestData.user) && e0.areEqual(this.request, bidRequestData.request) && e0.areEqual(this.application, bidRequestData.application) && e0.areEqual(this.placement, bidRequestData.placement) && e0.areEqual(this.device, bidRequestData.device) && e0.areEqual(this.geo, bidRequestData.geo) && e0.areEqual(this.volume, bidRequestData.volume) && e0.areEqual(this.regulations, bidRequestData.regulations) && e0.areEqual(this.customAttrs, bidRequestData.customAttrs);
    }

    public final Application getApplication() {
        return this.application;
    }

    public final Map<String, String> getCustomAttrs() {
        return this.customAttrs;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final Geo getGeo() {
        return this.geo;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final Regulations getRegulations() {
        return this.regulations;
    }

    public final Request getRequest() {
        return this.request;
    }

    public final User getUser() {
        return this.user;
    }

    public final Volume getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return this.customAttrs.hashCode() + ((this.regulations.hashCode() + ((this.volume.hashCode() + ((this.geo.hashCode() + ((this.device.hashCode() + ((this.placement.hashCode() + ((this.application.hashCode() + ((this.request.hashCode() + (this.user.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BidRequestData(user=");
        sb2.append(this.user);
        sb2.append(", request=");
        sb2.append(this.request);
        sb2.append(", application=");
        sb2.append(this.application);
        sb2.append(", placement=");
        sb2.append(this.placement);
        sb2.append(", device=");
        sb2.append(this.device);
        sb2.append(", geo=");
        sb2.append(this.geo);
        sb2.append(", volume=");
        sb2.append(this.volume);
        sb2.append(QGjYBESwAiCc.yKJHke);
        sb2.append(this.regulations);
        sb2.append(", customAttrs=");
        return o2.q(sb2, this.customAttrs, ')');
    }
}

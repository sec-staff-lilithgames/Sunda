package io.odeeo.internal.r1;

import android.app.Activity;
import android.location.Location;
import e3.g;
import io.odeeo.internal.a.c;
import io.odeeo.internal.d1.f;
import io.odeeo.internal.f1.e;
import io.odeeo.internal.v1.i;
import io.odeeo.sdk.AdUnit;
import io.odeeo.sdk.OdeeoSDK;
import io.odeeo.sdk.advertisement.data.Application;
import io.odeeo.sdk.advertisement.data.BidRequestData;
import io.odeeo.sdk.advertisement.data.Device;
import io.odeeo.sdk.advertisement.data.Geo;
import io.odeeo.sdk.advertisement.data.Placement;
import io.odeeo.sdk.advertisement.data.Regulations;
import io.odeeo.sdk.advertisement.data.Request;
import io.odeeo.sdk.advertisement.data.User;
import io.odeeo.sdk.advertisement.data.Volume;
import io.odeeo.sdk.domain.PlacementId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.Dispatchers;
import p0.o2;
import qv.v;
import sv.j0;
import uu.k0;
import uu.o1;
import uu.p0;
import uu.q0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a extends io.odeeo.internal.p1.a<BidRequestData, Throwable, C0642a> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.r1.a$a, reason: collision with other inner class name */
    public static final class C0642a {

        /* renamed from: a, reason: collision with root package name */
        public final AdUnit.RequestType f66228a;

        /* renamed from: b, reason: collision with root package name */
        public final Activity f66229b;

        /* renamed from: c, reason: collision with root package name */
        public final String f66230c;

        /* renamed from: d, reason: collision with root package name */
        public final String f66231d;

        /* renamed from: e, reason: collision with root package name */
        public final long f66232e;

        /* renamed from: f, reason: collision with root package name */
        public final int f66233f;

        public /* synthetic */ C0642a(AdUnit.RequestType requestType, Activity activity, String str, String str2, long j10, int i10, u uVar) {
            this(requestType, activity, str, str2, j10, i10);
        }

        /* renamed from: copy-hcg2s44$default, reason: not valid java name */
        public static /* synthetic */ C0642a m4593copyhcg2s44$default(C0642a c0642a, AdUnit.RequestType requestType, Activity activity, String str, String str2, long j10, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                requestType = c0642a.f66228a;
            }
            if ((i11 & 2) != 0) {
                activity = c0642a.f66229b;
            }
            if ((i11 & 4) != 0) {
                str = c0642a.f66230c;
            }
            if ((i11 & 8) != 0) {
                str2 = c0642a.f66231d;
            }
            if ((i11 & 16) != 0) {
                j10 = c0642a.f66232e;
            }
            if ((i11 & 32) != 0) {
                i10 = c0642a.f66233f;
            }
            int i12 = i10;
            long j11 = j10;
            return c0642a.m4595copyhcg2s44(requestType, activity, str, str2, j11, i12);
        }

        public final AdUnit.RequestType component1() {
            return this.f66228a;
        }

        public final Activity component2() {
            return this.f66229b;
        }

        public final String component3() {
            return this.f66230c;
        }

        /* renamed from: component4-aRVDu34, reason: not valid java name */
        public final String m4594component4aRVDu34() {
            return this.f66231d;
        }

        public final long component5() {
            return this.f66232e;
        }

        public final int component6() {
            return this.f66233f;
        }

        /* renamed from: copy-hcg2s44, reason: not valid java name */
        public final C0642a m4595copyhcg2s44(AdUnit.RequestType requestType, Activity activity, String str, String placementId, long j10, int i10) {
            e0.checkNotNullParameter(requestType, "requestType");
            e0.checkNotNullParameter(activity, "activity");
            e0.checkNotNullParameter(placementId, "placementId");
            return new C0642a(requestType, activity, str, placementId, j10, i10, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0642a)) {
                return false;
            }
            C0642a c0642a = (C0642a) obj;
            return this.f66228a == c0642a.f66228a && e0.areEqual(this.f66229b, c0642a.f66229b) && e0.areEqual(this.f66230c, c0642a.f66230c) && PlacementId.m4633equalsimpl0(this.f66231d, c0642a.f66231d) && this.f66232e == c0642a.f66232e && this.f66233f == c0642a.f66233f;
        }

        public final Activity getActivity() {
            return this.f66229b;
        }

        public final String getCustomTag() {
            return this.f66230c;
        }

        /* renamed from: getPlacementId-aRVDu34, reason: not valid java name */
        public final String m4596getPlacementIdaRVDu34() {
            return this.f66231d;
        }

        public final AdUnit.RequestType getRequestType() {
            return this.f66228a;
        }

        public final int getRetryAmount() {
            return this.f66233f;
        }

        public final long getRetryDelay() {
            return this.f66232e;
        }

        public int hashCode() {
            int iHashCode = (this.f66229b.hashCode() + (this.f66228a.hashCode() * 31)) * 31;
            String str = this.f66230c;
            return Integer.hashCode(this.f66233f) + o2.d((PlacementId.m4634hashCodeimpl(this.f66231d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f66232e);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Params(requestType=");
            sb2.append(this.f66228a);
            sb2.append(", activity=");
            sb2.append(this.f66229b);
            sb2.append(", customTag=");
            sb2.append((Object) this.f66230c);
            sb2.append(", placementId=");
            sb2.append((Object) PlacementId.m4635toStringimpl(this.f66231d));
            sb2.append(", retryDelay=");
            sb2.append(this.f66232e);
            sb2.append(", retryAmount=");
            return g.m(sb2, this.f66233f, ')');
        }

        public C0642a(AdUnit.RequestType requestType, Activity activity, String str, String str2, long j10, int i10) {
            this.f66228a = requestType;
            this.f66229b = activity;
            this.f66230c = str;
            this.f66231d = str2;
            this.f66232e = j10;
            this.f66233f = i10;
        }
    }

    public a() {
        super(Dispatchers.getIO());
    }

    @Override // io.odeeo.internal.p1.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object execute(C0642a c0642a, d<? super c<BidRequestData, ? extends Throwable>> dVar) {
        double latitude;
        double longitude;
        String generalConsentPayload;
        Location lastKnownNetworkLocation;
        OdeeoSDK odeeoSDK = OdeeoSDK.INSTANCE;
        io.odeeo.internal.u1.a personalInfo = odeeoSDK.getPoParameters$odeeoSdk_release().getPersonalInfo();
        io.odeeo.internal.m1.b clientMetadata = odeeoSDK.getPoParameters$odeeoSdk_release().getClientMetadata();
        if (clientMetadata == null) {
            return new io.odeeo.internal.a.a(new Throwable("Client metadata is null"));
        }
        User user = new User(personalInfo.getAdvertiserIdentifier$odeeoSdk_release(), personalInfo.getOdeeoSDKIdentifier$odeeoSdk_release(), personalInfo.getPublisherUserID$odeeoSdk_release(), "", io.odeeo.internal.d1.g.f63663a.getAll());
        Request request = new Request(odeeoSDK.getPoParameters$odeeoSdk_release().getSessionManager().getSessionID$odeeoSdk_release(), c0642a.getRequestType().getValue(), c0642a.getRetryAmount(), c0642a.getRetryDelay());
        Application application = new Application(OdeeoSDK.SDK_VERSION, f.f63660a.getEngineName(), personalInfo.getAppVersion$odeeoSdk_release());
        Integer intOrNull = j0.toIntOrNull(c0642a.m4596getPlacementIdaRVDu34());
        int iIntValue = intOrNull == null ? 0 : intOrNull.intValue();
        String customTag = c0642a.getCustomTag();
        String str = "";
        if (customTag == null) {
            customTag = "";
        }
        Placement placement = new Placement(iIntValue, customTag);
        p0.emptyList();
        p0.emptyList();
        Device device = new Device(clientMetadata.getCurrentLanguage(), clientMetadata.getDeviceManufacturer(), clientMetadata.getDeviceModel(), clientMetadata.getDeviceOsVersion(), clientMetadata.getActiveNetworkType().name(), clientMetadata.getSimOperatorName(), clientMetadata.getDeviceInputInfo(), clientMetadata.getDeviceOutputInfo(), k0.toList(clientMetadata.getDeviceInputLanguages()), clientMetadata.getOrientationString(), String.valueOf(clientMetadata.getDeviceBatteryLevel()), clientMetadata.getDeviceBatteryState(), io.odeeo.internal.v1.d.f67273a.getDeviceTime());
        i iVar = i.f67277a;
        if (!iVar.isAnyLocationProviderEnabled(c0642a.getActivity()) || (lastKnownNetworkLocation = iVar.getLastKnownNetworkLocation(c0642a.getActivity())) == null) {
            latitude = 0.0d;
            longitude = 0.0d;
        } else {
            latitude = lastKnownNetworkLocation.getLatitude();
            longitude = lastKnownNetworkLocation.getLongitude();
        }
        Geo geo = new Geo(personalInfo.getCountry$odeeoSdk_release(), latitude, longitude);
        Volume volume = new Volume(null, null, clientMetadata.getDeviceVolumeLevel(), 3, null);
        e generalConsentData$odeeoSdk_release = personalInfo.getConsentDataManager$odeeoSdk_release().getGeneralConsentData$odeeoSdk_release();
        if (generalConsentData$odeeoSdk_release != null && (generalConsentPayload = generalConsentData$odeeoSdk_release.getGeneralConsentPayload()) != null) {
            str = generalConsentPayload;
        }
        Regulations regulations = new Regulations(str);
        List<Map.Entry<String, String>> allAttributes = io.odeeo.internal.d1.e.f63657a.getAllAttributes();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(allAttributes, 10)), 16));
        Iterator<T> it = allAttributes.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tu.v vVar = tu.e0.to(entry.getKey(), entry.getValue());
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return new io.odeeo.internal.a.b(new BidRequestData(user, request, application, placement, device, geo, volume, regulations, linkedHashMap));
    }
}

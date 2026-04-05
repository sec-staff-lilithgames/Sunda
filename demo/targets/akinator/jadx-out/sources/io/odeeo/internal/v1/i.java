package io.odeeo.internal.v1;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.amazon.device.ads.DtbConstants;
import io.odeeo.sdk.OdeeoSDK;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f67277a = new i();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements LocationListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LocationManager f67278a;

        public a(LocationManager locationManager) {
            this.f67278a = locationManager;
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            e0.checkNotNullParameter(location, "location");
            this.f67278a.removeUpdates(this);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String provider) {
            e0.checkNotNullParameter(provider, "provider");
            this.f67278a.removeUpdates(this);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String provider) {
            e0.checkNotNullParameter(provider, "provider");
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String provider, int i10, Bundle extras) {
            e0.checkNotNullParameter(provider, "provider");
            e0.checkNotNullParameter(extras, "extras");
        }
    }

    public final LocationManager a(Context context) {
        Object systemService = context.getSystemService(DtbConstants.PRIVACY_LOCATION_KEY);
        if (systemService != null) {
            return (LocationManager) systemService;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
    }

    public final boolean b(Context context) {
        return m3.a.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
    }

    public final Location getLastKnownNetworkLocation(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (b(context) && OdeeoSDK.INSTANCE.getPoParameters$odeeoSdk_release().getPersonalInfo().canCollectPersonalInformation$odeeoSdk_release()) {
            try {
                return a(context).getLastKnownLocation("network");
            } catch (SecurityException e10) {
                io.odeeo.internal.b2.a.d(e10, "SecurityException in getLastKnownNetworkLocation", new Object[0]);
            }
        }
        return null;
    }

    public final boolean isAnyLocationProviderEnabled(Context context) {
        e0.checkNotNullParameter(context, "context");
        try {
            return a(context).isProviderEnabled("network");
        } catch (SecurityException e10) {
            io.odeeo.internal.b2.a.d("network permission exception: " + e10, new Object[0]);
            return false;
        }
    }

    public final void prefetchNetworkLocation(Context context) {
        e0.checkNotNullParameter(context, "context");
        if (!b(context)) {
            io.odeeo.internal.b2.a.d("NetworkLocation is not available", new Object[0]);
            return;
        }
        try {
            LocationManager locationManagerA = a(context);
            if (locationManagerA.isProviderEnabled("network")) {
                locationManagerA.requestLocationUpdates("network", 0L, 0.0f, new a(locationManagerA));
            }
        } catch (SecurityException e10) {
            io.odeeo.internal.b2.a.d(e10, "SecurityException in prefetchNetworkLocation", new Object[0]);
        } catch (Exception e11) {
            io.odeeo.internal.b2.a.d(e11, "Exception in prefetchNetworkLocation", new Object[0]);
        }
    }
}

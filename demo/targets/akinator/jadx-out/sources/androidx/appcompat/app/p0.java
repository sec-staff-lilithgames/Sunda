package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p0 extends o0 {

    /* renamed from: c, reason: collision with root package name */
    public final i1 f4819c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t0 f4820d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(t0 t0Var, i1 i1Var) {
        super(t0Var);
        this.f4820d = t0Var;
        this.f4819c = i1Var;
    }

    @Override // androidx.appcompat.app.o0
    public final IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // androidx.appcompat.app.o0
    public int getApplyableNightMode() {
        Location location;
        boolean z10;
        long j10;
        i1 i1Var = this.f4819c;
        h1 h1Var = (h1) i1Var.f4756c;
        LocationManager locationManager = (LocationManager) i1Var.f4755b;
        if (h1Var.f4747b > System.currentTimeMillis()) {
            z10 = h1Var.f4746a;
        } else {
            Context context = (Context) i1Var.f4754a;
            Location lastKnownLocation = null;
            if (m3.i.checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                try {
                } catch (Exception e10) {
                    Log.d("TwilightManager", "Failed to get last known location", e10);
                }
                Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                location = lastKnownLocation2;
            } else {
                location = null;
            }
            if (m3.i.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                try {
                    if (locationManager.isProviderEnabled("gps")) {
                        lastKnownLocation = locationManager.getLastKnownLocation("gps");
                    }
                } catch (Exception e11) {
                    Log.d("TwilightManager", "Failed to get last known location", e11);
                }
            }
            if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                location = lastKnownLocation;
            }
            if (location != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (g1.f4740d == null) {
                    g1.f4740d = new g1();
                }
                g1 g1Var = g1.f4740d;
                g1Var.calculateTwilight(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                g1Var.calculateTwilight(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                z10 = g1Var.f4743c == 1;
                long j11 = g1Var.f4742b;
                long j12 = g1Var.f4741a;
                g1Var.calculateTwilight(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                long j13 = g1Var.f4742b;
                if (j11 == -1 || j12 == -1) {
                    j10 = jCurrentTimeMillis + 43200000;
                } else {
                    if (jCurrentTimeMillis > j12) {
                        j11 = j13;
                    } else if (jCurrentTimeMillis > j11) {
                        j11 = j12;
                    }
                    j10 = j11 + ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                }
                h1Var.f4746a = z10;
                h1Var.f4747b = j10;
            } else {
                Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                int i10 = Calendar.getInstance().get(11);
                if (i10 < 6 || i10 >= 22) {
                    z10 = true;
                }
            }
        }
        return z10 ? 2 : 1;
    }

    @Override // androidx.appcompat.app.o0
    public void onChange() {
        this.f4820d.applyDayNight();
    }
}

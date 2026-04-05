package com.vungle.ads.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TpatError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.TpatRequest;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ViewUtility;
import e3.g;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.x;
import tu.o;
import tu.q;
import tu.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ClickCoordinateTracker {
    private static final String TAG = "ClickCoordinateTracker";
    private final AdPayload advertisement;
    private final Context context;
    private final ClickCoordinate currentClick;
    public static final Companion Companion = new Companion(null);
    private static final String MACRO_REQ_WIDTH = Pattern.quote("{{{req_width}}}");
    private static final String MACRO_REQ_HEIGHT = Pattern.quote("{{{req_height}}}");
    private static final String MACRO_WIDTH = Pattern.quote("{{{width}}}");
    private static final String MACRO_HEIGHT = Pattern.quote("{{{height}}}");
    private static final String MACRO_DOWN_X = Pattern.quote("{{{down_x}}}");
    private static final String MACRO_DOWN_Y = Pattern.quote("{{{down_y}}}");
    private static final String MACRO_UP_X = Pattern.quote("{{{up_x}}}");
    private static final String MACRO_UP_Y = Pattern.quote("{{{up_y}}}");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ClickCoordinate {
        private Coordinate downCoordinate;
        private Coordinate upCoordinate;

        public ClickCoordinate(Coordinate downCoordinate, Coordinate upCoordinate) {
            e0.checkNotNullParameter(downCoordinate, "downCoordinate");
            e0.checkNotNullParameter(upCoordinate, "upCoordinate");
            this.downCoordinate = downCoordinate;
            this.upCoordinate = upCoordinate;
        }

        public static /* synthetic */ ClickCoordinate copy$default(ClickCoordinate clickCoordinate, Coordinate coordinate, Coordinate coordinate2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                coordinate = clickCoordinate.downCoordinate;
            }
            if ((i10 & 2) != 0) {
                coordinate2 = clickCoordinate.upCoordinate;
            }
            return clickCoordinate.copy(coordinate, coordinate2);
        }

        public final Coordinate component1() {
            return this.downCoordinate;
        }

        public final Coordinate component2() {
            return this.upCoordinate;
        }

        public final ClickCoordinate copy(Coordinate downCoordinate, Coordinate upCoordinate) {
            e0.checkNotNullParameter(downCoordinate, "downCoordinate");
            e0.checkNotNullParameter(upCoordinate, "upCoordinate");
            return new ClickCoordinate(downCoordinate, upCoordinate);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickCoordinate)) {
                return false;
            }
            ClickCoordinate clickCoordinate = (ClickCoordinate) obj;
            return e0.areEqual(this.downCoordinate, clickCoordinate.downCoordinate) && e0.areEqual(this.upCoordinate, clickCoordinate.upCoordinate);
        }

        public final Coordinate getDownCoordinate() {
            return this.downCoordinate;
        }

        public final Coordinate getUpCoordinate() {
            return this.upCoordinate;
        }

        public int hashCode() {
            return this.upCoordinate.hashCode() + (this.downCoordinate.hashCode() * 31);
        }

        public final boolean ready() {
            return (this.downCoordinate.getX() == Integer.MIN_VALUE || this.downCoordinate.getY() == Integer.MIN_VALUE || this.upCoordinate.getX() == Integer.MIN_VALUE || this.upCoordinate.getY() == Integer.MIN_VALUE) ? false : true;
        }

        public final void setDownCoordinate(Coordinate coordinate) {
            e0.checkNotNullParameter(coordinate, "<set-?>");
            this.downCoordinate = coordinate;
        }

        public final void setUpCoordinate(Coordinate coordinate) {
            e0.checkNotNullParameter(coordinate, "<set-?>");
            this.upCoordinate = coordinate;
        }

        public String toString() {
            return "ClickCoordinate(downCoordinate=" + this.downCoordinate + ", upCoordinate=" + this.upCoordinate + ')';
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Coordinate {

        /* renamed from: x, reason: collision with root package name */
        private final int f50760x;

        /* renamed from: y, reason: collision with root package name */
        private final int f50761y;

        public Coordinate(int i10, int i11) {
            this.f50760x = i10;
            this.f50761y = i11;
        }

        public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = coordinate.f50760x;
            }
            if ((i12 & 2) != 0) {
                i11 = coordinate.f50761y;
            }
            return coordinate.copy(i10, i11);
        }

        public final int component1() {
            return this.f50760x;
        }

        public final int component2() {
            return this.f50761y;
        }

        public final Coordinate copy(int i10, int i11) {
            return new Coordinate(i10, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Coordinate)) {
                return false;
            }
            Coordinate coordinate = (Coordinate) obj;
            return this.f50760x == coordinate.f50760x && this.f50761y == coordinate.f50761y;
        }

        public final int getX() {
            return this.f50760x;
        }

        public final int getY() {
            return this.f50761y;
        }

        public int hashCode() {
            return Integer.hashCode(this.f50761y) + (Integer.hashCode(this.f50760x) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("Coordinate(x=");
            sb2.append(this.f50760x);
            sb2.append(", y=");
            return g.m(sb2, this.f50761y, ')');
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class DeviceScreenInfo {
        private final Context context;

        /* renamed from: dm, reason: collision with root package name */
        private final DisplayMetrics f50762dm;

        public DeviceScreenInfo(Context context) {
            e0.checkNotNullParameter(context, "context");
            this.context = context;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f50762dm = displayMetrics;
            Object systemService = context.getSystemService("window");
            e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        }

        public static /* synthetic */ DeviceScreenInfo copy$default(DeviceScreenInfo deviceScreenInfo, Context context, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                context = deviceScreenInfo.context;
            }
            return deviceScreenInfo.copy(context);
        }

        public final Context component1() {
            return this.context;
        }

        public final DeviceScreenInfo copy(Context context) {
            e0.checkNotNullParameter(context, "context");
            return new DeviceScreenInfo(context);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceScreenInfo) && e0.areEqual(this.context, ((DeviceScreenInfo) obj).context);
        }

        public final Context getContext() {
            return this.context;
        }

        public final int getDeviceHeight() {
            return this.f50762dm.heightPixels;
        }

        public final int getDeviceWidth() {
            return this.f50762dm.widthPixels;
        }

        public int hashCode() {
            return this.context.hashCode();
        }

        public String toString() {
            return "DeviceScreenInfo(context=" + this.context + ')';
        }
    }

    public ClickCoordinateTracker(Context context, AdPayload advertisement) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(advertisement, "advertisement");
        this.context = context;
        this.advertisement = advertisement;
        this.currentClick = new ClickCoordinate(new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE), new Coordinate(Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    private final int getDeviceHeight() {
        return new DeviceScreenInfo(this.context).getDeviceHeight();
    }

    private final int getDeviceWidth() {
        return new DeviceScreenInfo(this.context).getDeviceWidth();
    }

    private final int getRequestedHeight() {
        int iAdHeight = this.advertisement.adHeight();
        return iAdHeight == 0 ? getDeviceHeight() : ViewUtility.INSTANCE.dpToPixels(this.context, iAdHeight);
    }

    private final int getRequestedWidth() {
        int iAdWidth = this.advertisement.adWidth();
        return iAdWidth == 0 ? getDeviceWidth() : ViewUtility.INSTANCE.dpToPixels(this.context, iAdWidth);
    }

    private final void sendClickCoordinates() {
        List<String> tpatUrls$default = AdPayload.getTpatUrls$default(this.advertisement, AdPayload.TPAT_CLICK_COORDINATES_URLS, null, null, 6, null);
        List list = tpatUrls$default;
        if (list == null || list.isEmpty()) {
            new TpatError(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR, "Empty urls for tpat: video.clickCoordinates").setLogEntry$vungle_ads_release(this.advertisement.getLogEntry$vungle_ads_release()).logErrorNoReturnValue$vungle_ads_release();
            return;
        }
        int requestedWidth = getRequestedWidth();
        int requestedHeight = getRequestedHeight();
        int requestedWidth2 = getRequestedWidth();
        int requestedHeight2 = getRequestedHeight();
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        o oVarLazy = q.lazy(s.f87403b, (kv.a) new ClickCoordinateTracker$sendClickCoordinates$$inlined$inject$1(this.context));
        for (String str : tpatUrls$default) {
            String MACRO_REQ_WIDTH2 = MACRO_REQ_WIDTH;
            e0.checkNotNullExpressionValue(MACRO_REQ_WIDTH2, "MACRO_REQ_WIDTH");
            String strReplace = new x(MACRO_REQ_WIDTH2).replace(str, String.valueOf(requestedWidth));
            String MACRO_REQ_HEIGHT2 = MACRO_REQ_HEIGHT;
            e0.checkNotNullExpressionValue(MACRO_REQ_HEIGHT2, "MACRO_REQ_HEIGHT");
            String strReplace2 = new x(MACRO_REQ_HEIGHT2).replace(strReplace, String.valueOf(requestedHeight));
            String MACRO_WIDTH2 = MACRO_WIDTH;
            e0.checkNotNullExpressionValue(MACRO_WIDTH2, "MACRO_WIDTH");
            String strReplace3 = new x(MACRO_WIDTH2).replace(strReplace2, String.valueOf(requestedWidth2));
            String MACRO_HEIGHT2 = MACRO_HEIGHT;
            e0.checkNotNullExpressionValue(MACRO_HEIGHT2, "MACRO_HEIGHT");
            String strReplace4 = new x(MACRO_HEIGHT2).replace(strReplace3, String.valueOf(requestedHeight2));
            String MACRO_DOWN_X2 = MACRO_DOWN_X;
            e0.checkNotNullExpressionValue(MACRO_DOWN_X2, "MACRO_DOWN_X");
            String strReplace5 = new x(MACRO_DOWN_X2).replace(strReplace4, String.valueOf(this.currentClick.getDownCoordinate().getX()));
            String MACRO_DOWN_Y2 = MACRO_DOWN_Y;
            e0.checkNotNullExpressionValue(MACRO_DOWN_Y2, "MACRO_DOWN_Y");
            String strReplace6 = new x(MACRO_DOWN_Y2).replace(strReplace5, String.valueOf(this.currentClick.getDownCoordinate().getY()));
            String MACRO_UP_X2 = MACRO_UP_X;
            e0.checkNotNullExpressionValue(MACRO_UP_X2, "MACRO_UP_X");
            String strReplace7 = new x(MACRO_UP_X2).replace(strReplace6, String.valueOf(this.currentClick.getUpCoordinate().getX()));
            String MACRO_UP_Y2 = MACRO_UP_Y;
            e0.checkNotNullExpressionValue(MACRO_UP_Y2, "MACRO_UP_Y");
            TpatSender.sendTpat$default(m3583sendClickCoordinates$lambda0(oVarLazy), new TpatRequest.Builder(new x(MACRO_UP_Y2).replace(strReplace7, String.valueOf(this.currentClick.getUpCoordinate().getY()))).tpatKey(Constants.COORDINATE).build(), false, 2, null);
        }
    }

    /* renamed from: sendClickCoordinates$lambda-0, reason: not valid java name */
    private static final TpatSender m3583sendClickCoordinates$lambda0(o oVar) {
        return (TpatSender) oVar.getValue();
    }

    public final ClickCoordinate getCurrentClick$vungle_ads_release() {
        return this.currentClick;
    }

    public final void trackCoordinate(MotionEvent event) {
        e0.checkNotNullParameter(event, "event");
        if (this.advertisement.isClickCoordinatesTrackingEnabled()) {
            int action = event.getAction();
            if (action == 0) {
                this.currentClick.setDownCoordinate(new Coordinate((int) event.getX(), (int) event.getY()));
            } else {
                if (action != 1) {
                    return;
                }
                this.currentClick.setUpCoordinate(new Coordinate((int) event.getX(), (int) event.getY()));
                if (this.currentClick.ready()) {
                    sendClickCoordinates();
                }
            }
        }
    }

    public static /* synthetic */ void getCurrentClick$vungle_ads_release$annotations() {
    }
}

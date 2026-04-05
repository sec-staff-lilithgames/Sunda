package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.C3262i3;
import com.ironsource.C3422r4;
import com.ironsource.C5;
import com.ironsource.D5;
import com.ironsource.E3;
import com.ironsource.H9;
import com.ironsource.Y7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f37554a = "BANNER";

    /* renamed from: b, reason: collision with root package name */
    public static final String f37555b = "LARGE";

    /* renamed from: c, reason: collision with root package name */
    public static final String f37556c = "RECTANGLE";

    /* renamed from: d, reason: collision with root package name */
    public static final String f37557d = "LEADERBOARD";

    /* renamed from: e, reason: collision with root package name */
    public static final String f37558e = "SMART";

    /* renamed from: f, reason: collision with root package name */
    public static final String f37559f = "CUSTOM";

    /* renamed from: g, reason: collision with root package name */
    public static final String f37560g = "MEDIUM_RECTANGLE";

    /* renamed from: h, reason: collision with root package name */
    public static final String f37561h = "bannerAdSize";

    /* renamed from: i, reason: collision with root package name */
    public static final int f37562i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static final int f37563j = 1;

    /* renamed from: k, reason: collision with root package name */
    public static final int f37564k = 2;

    /* renamed from: l, reason: collision with root package name */
    public static final int f37565l = 3;

    /* renamed from: m, reason: collision with root package name */
    public static final int f37566m = 4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f37567n = 5;

    /* renamed from: o, reason: collision with root package name */
    public static final int f37568o = 6;

    /* renamed from: p, reason: collision with root package name */
    public static final int f37569p = -1;

    /* renamed from: q, reason: collision with root package name */
    public static final String f37570q = "Adaptive=true";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a();

        void a(String str);
    }

    public static void a(q qVar, C3262i3 c3262i3, b bVar) {
        String strConcat;
        if (c(qVar)) {
            strConcat = null;
        } else {
            strConcat = "can't load banner - ".concat(qVar == null ? "banner is null" : "banner is destroyed");
        }
        if (c3262i3 == null || TextUtils.isEmpty(c3262i3.c())) {
            strConcat = "can't load banner - ".concat(c3262i3 == null ? "placement is null" : "placement name is empty");
        }
        if (TextUtils.isEmpty(strConcat)) {
            bVar.a();
        } else {
            IronLog.INTERNAL.error(strConcat);
            bVar.a(strConcat);
        }
    }

    public static boolean c(q qVar) {
        return (qVar == null || qVar.b()) ? false : true;
    }

    public static ISBannerSize b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            a(f37558e, 728, 90);
        }
        return a(f37558e, 320, 50);
    }

    public static int b(int i10) {
        if (!r.m().O()) {
            IronLog.API.error("The mediation must be successfully initiated before calling this API");
            return -1;
        }
        return a(i10);
    }

    public static void b(q qVar) {
        ISBannerSize size;
        if (qVar == null || (size = qVar.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize iSBannerSizeB = b();
        o.f37639a.a(iSBannerSizeB, size.f37250e);
        iSBannerSizeB.setAdaptive(size.isAdaptive());
        qVar.setBannerSize(iSBannerSizeB);
    }

    public static void a(q qVar, b bVar) {
        if (qVar != null && !qVar.b()) {
            bVar.a();
        } else {
            bVar.a("can't destroy banner - ".concat(qVar == null ? "banner is null" : "banner is destroyed"));
        }
    }

    public static long a(long j10, long j11) {
        return j11 - (new Date().getTime() - j10);
    }

    public static ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public static ISBannerSize a() {
        return new ISBannerSize(f37557d, 728, 90);
    }

    public static void a(q qVar) {
        if (qVar != null) {
            qVar.a();
        }
    }

    public static void a(q qVar, View view, FrameLayout.LayoutParams layoutParams, E3 e32) {
        if (qVar == null || view == null || layoutParams == null) {
            return;
        }
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new com.applovin.impl.mediation.j(qVar, view, qVar.getSize(), applicationContext, layoutParams, e32, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(q qVar, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, E3 e32) {
        try {
            qVar.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(qVar, view, context, iSBannerSize);
                } else {
                    qVar.addView(view, 0, layoutParams);
                }
            }
            if (e32 != null) {
                e32.a();
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e10));
        }
    }

    public static void a(q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        a(qVar, view, layoutParams, (E3) null);
    }

    private static void a(q qVar, View view, Context context, ISBannerSize iSBannerSize) {
        int iDpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.f37250e.d());
        int iDpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.f37250e.c());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        qVar.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.f37250e.c() + " width - " + iSBannerSize.f37250e.d());
        qVar.addView(relativeLayout, 0, layoutParams2);
    }

    public static int a(int i10) {
        int iA = -1;
        try {
            iA = a(a(c.b()), i10);
            a(i10, iA);
            IronLog.API.verbose("Maximal height - " + iA + " for width - " + i10);
            return iA;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error("Failed to get adaptive height: " + e10.getMessage());
            return iA;
        }
    }

    private static Map<String, Object> a(c cVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(cVar.a());
        concurrentHashMap.putAll(cVar.c());
        return concurrentHashMap;
    }

    private static int a(Map<String, Object> map, int i10) {
        int iMax = -1;
        for (Object obj : map.values()) {
            try {
                iMax = Math.max(iMax, a(obj, i10));
            } catch (Throwable th2) {
                a(obj, th2);
            }
        }
        return iMax;
    }

    private static int a(Object obj, int i10) {
        if (obj instanceof AbstractAdapter) {
            return ((AbstractAdapter) obj).getAdaptiveHeight(i10);
        }
        if (obj instanceof LevelPlayBaseAdapter) {
            return ((LevelPlayBaseAdapter) obj).getAdaptiveHeight(i10);
        }
        return -1;
    }

    private static void a(Object obj, Throwable th2) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "unknown";
        C3422r4.d().a(th2);
        IronLog ironLog = IronLog.INTERNAL;
        StringBuilder sbO = e3.g.o("Exception while calling getAdaptiveHeight for adapter - ", simpleName, ": ");
        sbO.append(th2.getMessage());
        ironLog.error(sbO.toString());
    }

    private static void a(int i10, int i11) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i11 == -1) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "w:" + i10 + ",h:" + i11);
            }
            H9.i().a(new C5(D5.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        if (iSBannerSize != null) {
            try {
                String description = iSBannerSize.getDescription();
                switch (description.hashCode()) {
                    case -387072689:
                        if (description.equals(f37556c)) {
                            map.put(f37561h, 3);
                            break;
                        }
                        break;
                    case 72205083:
                        if (description.equals(f37555b)) {
                            map.put(f37561h, 2);
                            break;
                        }
                        break;
                    case 79011241:
                        if (description.equals(f37558e)) {
                            map.put(f37561h, 5);
                            break;
                        }
                        break;
                    case 446888797:
                        if (description.equals(f37557d)) {
                            map.put(f37561h, 4);
                            break;
                        }
                        break;
                    case 1951953708:
                        if (description.equals(f37554a)) {
                            map.put(f37561h, 1);
                            break;
                        }
                        break;
                    case 1999208305:
                        if (description.equals(f37559f)) {
                            map.put(f37561h, 6);
                            map.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
                            break;
                        }
                        break;
                }
                if (iSBannerSize.isAdaptive()) {
                    String strA = a(iSBannerSize);
                    if (map.containsKey(IronSourceConstants.EVENTS_EXT1)) {
                        strA = map.get(IronSourceConstants.EVENTS_EXT1) + " , " + a(iSBannerSize);
                    }
                    map.put(IronSourceConstants.EVENTS_EXT1, strA);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(Log.getStackTraceString(e10));
            }
        }
    }

    public static String a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.f37250e.d() + "x" + iSBannerSize.f37250e.c() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    public static boolean a(Y7 y72, int i10, int i11) {
        if (y72 != null && y72.d() > 0 && y72.c() > 0) {
            if (y72.d() >= i10 && y72.c() >= i11) {
                return true;
            }
            IronLog.API.warning("Container size too small: Banner may not display correctly.");
            return true;
        }
        IronLog.API.warning("Container size is invalid: Default banner size will be used.");
        return false;
    }
}

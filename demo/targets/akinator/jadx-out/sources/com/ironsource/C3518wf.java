package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC3472u3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.wf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3518wf {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<IronSource.a, C3385p0> f39183a = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.wf$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39184a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f39185b;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            f39185b = iArr;
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39185b[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39185b[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39185b[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[IronSource.a.values().length];
            f39184a = iArr2;
            try {
                iArr2[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39184a[IronSource.a.f37252c.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39184a[IronSource.a.NATIVE_AD.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39184a[IronSource.a.BANNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static R0 a(AbstractC3486v0 abstractC3486v0, int i10) {
        return a(abstractC3486v0).a(abstractC3486v0.b().c(), abstractC3486v0.m(), i10);
    }

    public static b b(IronSource.a aVar) {
        return new b(aVar);
    }

    public static int c(IronSource.a aVar) {
        int i10 = a.f39184a[aVar.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? AbstractC3472u3.e.NOT_SUPPORTED.b() : AbstractC3472u3.e.BANNER.b() : AbstractC3472u3.e.NATIVE_AD.b() : AbstractC3472u3.e.INTERSTITIAL.b() : AbstractC3472u3.e.REWARDED_VIDEO.b();
    }

    public static IronSource.a b(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return null;
        }
        int i10 = a.f39185b[adFormat.ordinal()];
        if (i10 == 1) {
            return IronSource.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return IronSource.a.f37252c;
        }
        if (i10 == 3) {
            return IronSource.a.BANNER;
        }
        if (i10 != 4) {
            return null;
        }
        return IronSource.a.NATIVE_AD;
    }

    private static C3385p0 a(AbstractC3486v0 abstractC3486v0) {
        Map<IronSource.a, C3385p0> map = f39183a;
        if (map.containsKey(abstractC3486v0.b().a())) {
            return map.get(abstractC3486v0.b().a());
        }
        C3385p0 c3385p0 = new C3385p0();
        map.put(abstractC3486v0.b().a(), c3385p0);
        return c3385p0;
    }

    public static C3161ca a() {
        return com.ironsource.mediationsdk.r.m().s();
    }

    public static void a(Throwable th2) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "SafeRunnable", th2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", th2.getMessage());
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        a(D5.TROUBLESHOOTING_SDK_INTERNAL_ERROR, jSONObject);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.wf$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final IronSource.a f39186a;

        public b(IronSource.a aVar) {
            this.f39186a = aVar;
        }

        private String b() {
            IronSource.a aVar = this.f39186a;
            return aVar != null ? aVar.name() : "";
        }

        public String a(String str, String str2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append(TextUtils.isEmpty(str2) ? "" : a.b.k(" - ", str2));
            String string = sb2.toString();
            return TextUtils.isEmpty(str) ? string : w0.i.d(string, " - ", str);
        }

        public String a(String str) {
            return a(str, null);
        }

        public String a() {
            return a(null);
        }
    }

    public static void a(Exception exc) {
        IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.INTERNAL, "Exception", exc);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("reason", exc.getMessage());
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        a(D5.TROUBLESHOOTING_LOAD_ARM_DATA_PARSE_ERROR, jSONObject);
    }

    public static void a(D5 d52, JSONObject jSONObject) {
        Mb.U().q().a(new C5(d52, C3286ja.a(IronSourceUtils.b(false), jSONObject)));
    }

    public static boolean a(AdapterBaseInterface adapterBaseInterface, IronSource.a aVar, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(a(aVar))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    public static String a(LevelPlay.AdFormat adFormat) {
        int i10 = a.f39185b[adFormat.ordinal()];
        if (i10 == 1) {
            return "rewarded";
        }
        if (i10 == 2) {
            return "interstitial";
        }
        if (i10 == 3) {
            return "banner";
        }
        if (i10 != 4) {
            return "";
        }
        return "nativeAd";
    }

    public static LevelPlay.AdFormat a(IronSource.a aVar) {
        int i10 = a.f39184a[aVar.ordinal()];
        if (i10 == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i10 == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i10 == 3) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        if (i10 != 4) {
            return null;
        }
        return LevelPlay.AdFormat.BANNER;
    }
}

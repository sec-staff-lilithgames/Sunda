package com.digidust.elokence.akinator.factories;

import a1.k;
import a2.s;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.lifecycle.b2;
import androidx.lifecycle.c1;
import ca.e;
import ca.f;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.pairip.StartupLauncher;
import f0.tv.vYwYqhhvBxO;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import timber.log.Timber;
import tu.o;
import tu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class AkApplication extends Application {

    /* renamed from: f, reason: collision with root package name */
    public static final a f21719f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f21720g;

    /* renamed from: h, reason: collision with root package name */
    public static final ExecutorService f21721h;

    /* renamed from: i, reason: collision with root package name */
    public static AkApplication f21722i;

    /* renamed from: j, reason: collision with root package name */
    public static float f21723j;

    /* renamed from: k, reason: collision with root package name */
    public static GoogleAnalytics f21724k;

    /* renamed from: l, reason: collision with root package name */
    public static Tracker f21725l;

    /* renamed from: m, reason: collision with root package name */
    public static Typeface f21726m;

    /* renamed from: n, reason: collision with root package name */
    public static Typeface f21727n;

    /* renamed from: o, reason: collision with root package name */
    public static Typeface f21728o;

    /* renamed from: p, reason: collision with root package name */
    public static Typeface f21729p;

    /* renamed from: q, reason: collision with root package name */
    public static Typeface f21730q;

    /* renamed from: r, reason: collision with root package name */
    public static Typeface f21731r;

    /* renamed from: s, reason: collision with root package name */
    public static Typeface f21732s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f21733t;

    /* renamed from: b, reason: collision with root package name */
    public Handler f21734b;

    /* renamed from: c, reason: collision with root package name */
    public Job f21735c;

    /* renamed from: e, reason: collision with root package name */
    public final s f21736e = new s(this, 6);

    public static final void access$sendAnalytics(AkApplication akApplication) {
        akApplication.getClass();
        BuildersKt__Builders_commonKt.launch$default(f21719f.getAppScope(), Dispatchers.getIO(), null, new e(2, null), 2, null);
    }

    public static final void access$startPeriodicWSCRefresh(AkApplication akApplication) {
        Job job = akApplication.f21735c;
        if (job == null || !job.isActive()) {
            akApplication.f21735c = BuildersKt__Builders_commonKt.launch$default(c1.getLifecycleScope(b2.f6515k.get()), Dispatchers.getIO(), null, new f(2, null), 2, null);
        }
    }

    public static final void access$stopPeriodicWSCRefresh(AkApplication akApplication) {
        Job job = akApplication.f21735c;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        akApplication.f21735c = null;
    }

    public static final Context getAppContext() {
        return f21719f.getAppContext();
    }

    public static final Typeface getTypeFace() {
        return f21719f.getTypeFace();
    }

    public static final Typeface getTypeFaceGab() {
        return f21719f.getTypeFaceGab();
    }

    public static final Typeface getTypeFaceRaleReg() {
        return f21719f.getTypeFaceRaleReg();
    }

    public static final Typeface getTypeFaceSatisfyReg() {
        return f21719f.getTypeFaceSatisfyReg();
    }

    public static final void setViet(boolean z10) {
        f21719f.setViet(z10);
    }

    public final void deleteCache() {
        Context applicationContext = getApplicationContext();
        try {
            File externalCacheDir = applicationContext.getExternalCacheDir();
            a aVar = f21719f;
            a.access$deleteDir(aVar, externalCacheDir);
            a.access$deleteDir(aVar, applicationContext.getExternalFilesDir(null));
        } catch (Exception e10) {
            Timber.Forest.tag("AkApplication").e(e10, "Exception on DeleteCache", new Object[0]);
        }
    }

    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vYwYqhhvBxO.PZy.invoke(null, this);
    }

    public final void populateTypefaces() {
        f21726m = Typeface.createFromAsset(getAssets(), "fonts/cheboyga.ttf");
        f21727n = Typeface.createFromAsset(getAssets(), "fonts/gabrielle.ttf");
        f21728o = Typeface.createFromAsset(getAssets(), "fonts/ralewayReg.ttf");
        f21729p = Typeface.createFromAsset(getAssets(), "fonts/ralewayBold.ttf");
        f21730q = Typeface.createFromAsset(getAssets(), "fonts/CrickxDroite.otf");
        f21731r = Typeface.createFromAsset(getAssets(), "fonts/SatisfyRegular.ttf");
        f21732s = Typeface.DEFAULT;
    }

    static {
        StartupLauncher.launch();
        f21719f = new a(null);
        f21720g = q.lazy(new k(2));
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(3);
        e0.checkNotNullExpressionValue(executorServiceNewFixedThreadPool, "newFixedThreadPool(...)");
        f21721h = executorServiceNewFixedThreadPool;
        f21723j = 1.0f;
        Typeface DEFAULT = Typeface.DEFAULT;
        e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        f21726m = DEFAULT;
        e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        f21727n = DEFAULT;
        e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        f21728o = DEFAULT;
        e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        f21729p = DEFAULT;
        e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        f21730q = DEFAULT;
        e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        f21731r = DEFAULT;
        e0.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
        f21732s = DEFAULT;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static final class a {
        public a(u uVar) {
        }

        public static boolean a(File file) {
            if (file != null && file.isDirectory()) {
                String[] list = file.list();
                e0.checkNotNull(list);
                for (String str : list) {
                    if (a(new File(file, str))) {
                    }
                }
                return file.delete();
            }
            if (file != null && file.isFile()) {
                return file.delete();
            }
            return false;
        }

        public static final /* synthetic */ boolean access$deleteDir(a aVar, File file) {
            aVar.getClass();
            return a(file);
        }

        public final String bytesToHex(byte[] hash) {
            e0.checkNotNullParameter(hash, "hash");
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : hash) {
                String hexString = Integer.toHexString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            String string = sb2.toString();
            e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }

        public final AkApplication getApp() {
            AkApplication akApplication = AkApplication.f21722i;
            if (akApplication != null) {
                return akApplication;
            }
            e0.throwUninitializedPropertyAccessException(MBridgeConstans.DYNAMIC_VIEW_WX_APP);
            return null;
        }

        public final Context getAppContext() {
            Context applicationContext = getApp().getApplicationContext();
            e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            return applicationContext;
        }

        public final CoroutineScope getAppScope() {
            return (CoroutineScope) AkApplication.f21720g.getValue();
        }

        public final float getCoeffFont() {
            return AkApplication.f21723j;
        }

        public final Typeface getTypeFace() {
            return AkApplication.f21733t ? AkApplication.f21732s : AkApplication.f21726m;
        }

        public final Typeface getTypeFaceCrickxDroite() {
            return AkApplication.f21733t ? AkApplication.f21732s : AkApplication.f21730q;
        }

        public final Typeface getTypeFaceGab() {
            return AkApplication.f21733t ? AkApplication.f21732s : AkApplication.f21727n;
        }

        public final Typeface getTypeFaceRaleBold() {
            return AkApplication.f21733t ? AkApplication.f21732s : AkApplication.f21729p;
        }

        public final Typeface getTypeFaceRaleReg() {
            return AkApplication.f21733t ? AkApplication.f21732s : AkApplication.f21728o;
        }

        public final Typeface getTypeFaceSatisfyReg() {
            return AkApplication.f21733t ? AkApplication.f21732s : AkApplication.f21731r;
        }

        public final void setCoeffFont(float f10) {
            AkApplication.f21723j = f10;
        }

        public final void setViet(boolean z10) {
            AkApplication.f21733t = z10;
        }

        public static /* synthetic */ void getAppContext$annotations() {
        }

        public static /* synthetic */ void getTypeFace$annotations() {
        }

        public static /* synthetic */ void getTypeFaceGab$annotations() {
        }

        public static /* synthetic */ void getTypeFaceRaleReg$annotations() {
        }

        public static /* synthetic */ void getTypeFaceSatisfyReg$annotations() {
        }
    }
}

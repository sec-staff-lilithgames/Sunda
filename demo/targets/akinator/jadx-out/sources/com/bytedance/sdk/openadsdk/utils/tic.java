package com.bytedance.sdk.openadsdk.utils;

import a.b;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Looper;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class tic {

    /* renamed from: au, reason: collision with root package name */
    private static final byte[] f21600au;

    /* renamed from: if, reason: not valid java name */
    private static final byte[] f167if;
    public static Integer jpo;

    /* renamed from: ju, reason: collision with root package name */
    private static final HashSet<String> f21604ju;
    private static String oya;
    private static String prr;

    /* renamed from: jd, reason: collision with root package name */
    private static final ExecutorService f21602jd = Executors.newSingleThreadExecutor();
    private static volatile boolean wqx = false;

    /* renamed from: cm, reason: collision with root package name */
    private static final AtomicInteger f21601cm = new AtomicInteger(0);
    private static volatile String my = "";

    /* renamed from: jj, reason: collision with root package name */
    private static final ReentrantLock f21603jj = new ReentrantLock();

    /* renamed from: qk, reason: collision with root package name */
    private static String f21605qk = null;
    private static String xyk = null;
    private static String zz = null;

    /* renamed from: yd, reason: collision with root package name */
    private static final HashSet<String> f21606yd = new HashSet<>(Arrays.asList("Asia/Shanghai", "Asia/Urumqi", "Asia/Chongqing", "Asia/Harbin", "Asia/Kashgar"));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.tic$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                if (TextUtils.isEmpty(tic.my)) {
                    com.bytedance.sdk.component.zz.jj jjVar = new com.bytedance.sdk.component.zz.jj(com.bytedance.sdk.openadsdk.core.sq.jpo());
                    jjVar.setWebViewClient(new jj.jpo());
                    String unused = tic.my = jjVar.getUserAgentString();
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "", e10);
            } catch (NoClassDefFoundError e11) {
                com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "", e11);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jd {

        /* renamed from: jd, reason: collision with root package name */
        public final int f21607jd;
        public final ComponentName jpo;

        public jd(ComponentName componentName, int i10) {
            this.jpo = componentName;
            this.f21607jd = i10;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements Callable<String> {
        private final int jpo;

        public jpo(int i10) {
            this.jpo = i10;
        }

        private String jd() {
            String property;
            Throwable th2;
            try {
                property = System.getProperty("http.agent");
                if (property != null) {
                    try {
                        if (!"unKnow".equals(property)) {
                            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                                com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_ua_data", "android_system_ua", property);
                                return property;
                            }
                            com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("android_system_ua", property);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.bytedance.sdk.component.utils.nmd.wqx("getUA", "e:" + th2.getMessage());
                        return property;
                    }
                }
                return property;
            } catch (Throwable th4) {
                property = "unKnow";
                th2 = th4;
            }
        }

        private synchronized String wqx() {
            final String[] strArr;
            strArr = new String[]{"unKnow"};
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            duq.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.tic.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    strArr[0] = tic.nzb();
                    String str = strArr[0];
                    countDownLatch.countDown();
                }
            });
            try {
                countDownLatch.await(2L, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", e10.getMessage());
            }
            return strArr[0];
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public synchronized String call() throws Exception {
            String strJd;
            try {
                strJd = OcvDtWCQ.JAVRlsDvtlxftxf;
                int i10 = this.jpo;
                if (i10 == 1) {
                    strJd = wqx();
                } else if (i10 == 2) {
                    strJd = jd();
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return strJd;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class wqx {
        private static final int jpo;

        static {
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod start status = 0");
            int i10 = 2;
            try {
                int i11 = RecyclerView.n.f7001b;
                if (RecyclerView.n.class.getDeclaredMethod("getBindingAdapterPosition", null) != null) {
                    i10 = 0;
                }
            } catch (ClassNotFoundException unused) {
                i10 = 1;
            } catch (NoSuchMethodException unused2) {
            }
            jpo = i10;
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "init hasBindingAdapterPositionMethod end status = ".concat(String.valueOf(i10)));
        }
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        f21604ju = hashSet;
        hashSet.addAll(Arrays.asList("America/Eirunepe", "America/Rio_Branco", "America/Boa_Vista", "America/Campo_Grande", "America/Cuiaba", "America/Manaus", "America/Porto_Velho", "America/Araguaina", "America/Bahia", "America/Belem", "America/Fortaleza", "America/Maceio", "America/Recife", "America/Santarem", "America/Sao_Paulo", "America/Noronha"));
        jpo = null;
        f167if = new byte[]{108, 111, 97, 100, 105, 110, 103};
        f21600au = new byte[]{97, 114, 98, 105, 116, 114, 97, 103, 101};
    }

    public static long au() {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("free_internal_storage", 0L).longValue();
    }

    public static boolean cm(int i10) {
        return i10 == 4;
    }

    public static String dt() {
        try {
            return TimeZone.getDefault().getID();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    private static boolean duq() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int hmu() {
        try {
            String id2 = TimeZone.getDefault().getID();
            if (f21606yd.contains(id2)) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Asia/")) {
                return 2;
            }
            if (id2 != null && id2.startsWith("Europe/")) {
                return 4;
            }
            if (id2 == null || !id2.startsWith("America/")) {
                return 3;
            }
            return !f21604ju.contains(id2) ? 5 : 3;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", th2.toString());
            return 0;
        }
    }

    public static int hna() {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("is_root", -1);
    }

    public static boolean hx() {
        return f21601cm.get() == 1;
    }

    /* renamed from: if, reason: not valid java name */
    public static long m497if() {
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockCountLong() * statFs.getBlockSizeLong();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static boolean jd(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + Uri.encode(str)));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                com.bytedance.sdk.component.utils.jd.jpo(context, intent, null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean jj(int i10) {
        return i10 == 6;
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, View view) {
    }

    public static String jr() {
        String strTl = com.bytedance.sdk.openadsdk.core.sq.cm().tl();
        if (!TextUtils.isEmpty(strTl)) {
            return strTl;
        }
        String strJpo = rq.jpo();
        return !TextUtils.isEmpty(strJpo) ? b.l(DtbConstants.HTTPS, strJpo, "/service/2/dual_events/") : strTl;
    }

    public static boolean my(int i10) {
        return i10 == 5;
    }

    public static String nmd() {
        String strCzp = com.bytedance.sdk.openadsdk.core.settings.au.czp();
        if (!TextUtils.isEmpty(strCzp)) {
            return strCzp;
        }
        String strPdm = com.bytedance.sdk.openadsdk.core.sq.cm().pdm();
        return TextUtils.isEmpty(strPdm) ? rq.jpo() : strPdm;
    }

    public static int nq() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String nzb() {
        try {
            WebView webView = new WebView(com.bytedance.sdk.openadsdk.core.sq.jpo());
            webView.setWebViewClient(new jj.jpo());
            String userAgentString = webView.getSettings().getUserAgentString();
            if (userAgentString != null && !"unKnow".equals(userAgentString)) {
                if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                    com.bytedance.sdk.openadsdk.multipro.cm.jpo.jpo("sp_multi_ua_data", "webview_ua", userAgentString);
                    return userAgentString;
                }
                com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("webview_ua", userAgentString);
            }
            return userAgentString;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("getUA", "e:" + th2.getMessage());
            return "unKnow";
        }
    }

    public static String opi() {
        String strHx = com.bytedance.sdk.openadsdk.core.sq.cm().hx();
        return TextUtils.isEmpty(strHx) ? rq.jpo() : strHx;
    }

    public static long oya() {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("total_sdcard_storage", 0L).longValue();
    }

    public static String pdm() {
        String str = oya;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(f167if);
        oya = str2;
        return str2;
    }

    public static long prr() {
        try {
            if (!duq()) {
                return 0L;
            }
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", th2.getMessage());
            return 0L;
        }
    }

    public static int qk(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 4) {
            return 1;
        }
        if (i10 == 5) {
            return 4;
        }
        if (i10 != 6) {
            return i10;
        }
        return 5;
    }

    public static String rq() {
        return "https://log.byteoversea.com/service/2/app_log_test/";
    }

    public static String rv() {
        String str = prr;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String str2 = new String(f21600au);
        prr = str2;
        return str2;
    }

    public static String se() {
        int i10 = -nq();
        return i10 >= 0 ? "Etc/GMT+".concat(String.valueOf(i10)) : "Etc/GMT".concat(String.valueOf(i10));
    }

    public static boolean sq() {
        try {
            if (!new File("/system/bin/su").exists()) {
                if (!new File("/system/xbin/su").exists()) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String tu() {
        return "https://lf-static.tiktokpangle-cdn-us.com/obj/ad-pattern-tx/renderer/package_tx.json";
    }

    public static int uu() {
        return wqx.jpo;
    }

    public static String wqx(int i10) {
        return i10 != 1 ? i10 != 2 ? (i10 == 3 || i10 == 4) ? "open_ad" : i10 != 7 ? i10 != 8 ? "embeded_ad" : "fullscreen_interstitial_ad" : "rewarded_video" : "interaction" : "banner_ad";
    }

    public static synchronized String xyk() {
        try {
            if (TextUtils.isEmpty(zz) && com.bytedance.sdk.openadsdk.core.sq.jpo() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.sq.jpo().getPackageManager().getPackageInfo(jj(), 0);
                    xyk = String.valueOf(packageInfo.versionCode);
                    zz = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "ToolUtils getVersionName throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return zz;
    }

    public static String yd() {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("total_memory", "0");
    }

    public static String zz() {
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.sq.jpo().getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            long j10 = memoryInfo.totalMem;
            if (j10 > 0) {
                return String.valueOf(j10 / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean cm(Context context) {
        return false;
    }

    public static synchronized String jj() {
        Context contextJpo;
        try {
            if (TextUtils.isEmpty(f21605qk) && (contextJpo = com.bytedance.sdk.openadsdk.core.sq.jpo()) != null) {
                try {
                    f21605qk = contextJpo.getPackageName();
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "ToolUtils getPackageName throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return f21605qk;
    }

    public static String ju() {
        return wqx("MemTotal");
    }

    public static String my() {
        return nq.jpo();
    }

    public static synchronized String qk() {
        try {
            if (TextUtils.isEmpty(xyk) && com.bytedance.sdk.openadsdk.core.sq.jpo() != null) {
                try {
                    PackageInfo packageInfo = com.bytedance.sdk.openadsdk.core.sq.jpo().getPackageManager().getPackageInfo(jj(), 0);
                    xyk = String.valueOf(packageInfo.versionCode);
                    zz = packageInfo.versionName;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "ToolUtils getVersionCode throws exception :", th2);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return xyk;
    }

    public static void yd(String str) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        com.bytedance.sdk.component.utils.nmd.wqx(b.l("You should use method '", str, "' on the asynchronous thread,it may cause anr, please check."), new Object[0]);
    }

    public static String cm() {
        if (!TextUtils.isEmpty(my)) {
            return my;
        }
        com.bytedance.sdk.openadsdk.multipro.wqx.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo());
        String strJpo = com.bytedance.sdk.openadsdk.core.zz.jpo("sdk_local_web_ua", 86400000L);
        my = strJpo;
        if (TextUtils.isEmpty(strJpo)) {
            ReentrantLock reentrantLock = f21603jj;
            try {
                if (reentrantLock.tryLock()) {
                    try {
                        if (TextUtils.isEmpty(my)) {
                            my = WebSettings.getDefaultUserAgent(com.bytedance.sdk.openadsdk.core.sq.jpo());
                        }
                        com.bytedance.sdk.openadsdk.core.zz.jpo("sdk_local_web_ua", my);
                        reentrantLock.unlock();
                    } catch (Exception e10) {
                        com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "", e10);
                        return my;
                    } catch (NoClassDefFoundError e11) {
                        com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "", e11);
                        return my;
                    }
                }
            } finally {
                f21603jj.unlock();
            }
        }
        return my;
    }

    public static Intent jpo(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            return null;
        }
        if (!launchIntentForPackage.hasCategory("android.intent.category.LAUNCHER")) {
            launchIntentForPackage.addCategory("android.intent.category.LAUNCHER");
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(2097152);
        launchIntentForPackage.addFlags(268435456);
        return launchIntentForPackage;
    }

    public static String my(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.bytedance.sdk.openadsdk.core.sq.cm().rv();
        }
        if (TextUtils.isEmpty(str)) {
            return "https://api16-access-ttp.tiktokpangle.us/service/2/app_log/";
        }
        return !str.startsWith("http") ? DtbConstants.HTTPS.concat(str) : str;
    }

    /* renamed from: if, reason: not valid java name */
    private static String m498if(String str) {
        try {
            return Uri.parse(str).buildUpon().appendQueryParameter("aid", "1371").appendQueryParameter("device_platform", "android").appendQueryParameter("version_code", qk()).toString();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", e10.getMessage());
            return str;
        }
    }

    public static String jd(int i10) {
        if (i10 == 1) {
            return "embeded_ad_landingpage";
        }
        if (i10 == 2) {
            return "banner_ad_landingpage";
        }
        if (i10 == 3) {
            return "interaction_landingpage";
        }
        if (i10 == 4) {
            return "splash_ad_landingpage";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return "unknow";
        }
        return "rewarded_video_landingpage";
    }

    public static boolean jj(String str) {
        try {
            return Pattern.compile("[一-龥]").matcher(str).find();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void wqx() {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("recycle_version_not_valid", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.utils.tic.1
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("method_exist", tic.uu());
                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("recycle_version_not_valid").jd(jSONObject.toString());
            }
        });
    }

    public static boolean zz(String str) {
        if (com.bytedance.sdk.openadsdk.core.oya.my()) {
            return true;
        }
        com.bytedance.sdk.component.utils.nmd.wqx(b.l("You must use method '", str, "' after initialization, please check."), new Object[0]);
        return false;
    }

    public static boolean my(Context context) {
        if (context == null) {
            return false;
        }
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static String wqx(String str) throws IOException {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        try {
            fileReader = new FileReader(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO);
            try {
                bufferedReader = new BufferedReader(fileReader, 4096);
                do {
                    try {
                        line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", th.getMessage());
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                } catch (Exception unused2) {
                                }
                            }
                            return null;
                        } finally {
                        }
                    }
                } while (!line.contains(str));
                if (line == null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused3) {
                    }
                    try {
                        fileReader.close();
                    } catch (Exception unused4) {
                    }
                    return null;
                }
                String str2 = line.split("\\s+")[1];
                try {
                    bufferedReader.close();
                } catch (Exception unused5) {
                }
                try {
                    fileReader.close();
                } catch (Exception unused6) {
                }
                return str2;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
        }
    }

    public static jd jpo(Context context, Intent intent) {
        return new jd(null, 0);
    }

    public static int jj(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", th2.getMessage());
            return -1;
        }
    }

    public static boolean jpo() {
        return (com.bytedance.sdk.openadsdk.core.prr.jpo() == null || com.bytedance.sdk.openadsdk.core.prr.jpo().cm()) ? false : true;
    }

    public static void xyk(final String str) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo();
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("reportMultiLog", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.utils.tic.3
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                if (tic.wqx || !com.bytedance.sdk.openadsdk.core.sq.cm().ic()) {
                    return null;
                }
                boolean unused = tic.wqx = true;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", str);
                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("reportMultiLog").jd(jSONObject.toString());
            }
        });
    }

    public static String jpo(int i10) {
        if (i10 == 1) {
            return "embeded_ad";
        }
        if (i10 == 2) {
            return "banner_ad";
        }
        if (i10 == 3) {
            return "interaction";
        }
        if (i10 == 4) {
            return "open_ad";
        }
        if (i10 == 5) {
            return "fullscreen_interstitial_ad";
        }
        if (i10 != 7) {
            return null;
        }
        return "rewarded_video";
    }

    public static String qk(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("KLLK")) {
            return str.replace("KLLK", "OPPO");
        }
        return str.contains("kllk") ? str.replace("kllk", "oppo") : "";
    }

    public static int xyk(Context context) {
        return qk(com.bytedance.sdk.component.utils.se.jpo(context, 0L));
    }

    public static int yd(Context context) {
        List<ResolveInfo> listQueryIntentActivities;
        Integer num = jpo;
        if (num != null) {
            return num.intValue();
        }
        if (context == null || (listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0)) == null) {
            return 0;
        }
        int size = listQueryIntentActivities.size();
        jpo = Integer.valueOf(size);
        return size;
    }

    public static boolean xyk(int i10) {
        if (i10 <= 0) {
            return false;
        }
        return i10 >= 100 || new Random(System.currentTimeMillis()).nextInt(100) + 1 <= i10;
    }

    public static int jd(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (dtVar == null) {
            return -1;
        }
        int iCxb = dtVar.cxb();
        int i10 = 1;
        if (iCxb == 1) {
            return 2;
        }
        if (iCxb == 3) {
            return 4;
        }
        if (iCxb != 5) {
            i10 = 7;
            if (iCxb != 7) {
                return iCxb != 8 ? -1 : 5;
            }
        }
        return i10;
    }

    public static String jd() {
        String strJd;
        String str = "unKnow";
        com.bytedance.sdk.openadsdk.multipro.wqx.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo());
        try {
            strJd = com.bytedance.sdk.openadsdk.multipro.jd.wqx() ? com.bytedance.sdk.openadsdk.multipro.cm.jpo.jd("sp_multi_ua_data", "android_system_ua", "unKnow") : com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("android_system_ua", "unKnow");
        } catch (Exception unused) {
        }
        if (strJd != null && !"unKnow".equals(strJd)) {
            return strJd;
        }
        FutureTask futureTask = new FutureTask(new jpo(2));
        f21602jd.execute(futureTask);
        str = (String) futureTask.get(500L, TimeUnit.MILLISECONDS);
        com.bytedance.sdk.component.utils.nmd.wqx("getUA", " getAndroidSystemUA userAgent".concat(String.valueOf(str)));
        return str;
    }

    public static long qk(Context context) {
        int i10;
        try {
            i10 = context.getApplicationInfo().minSdkVersion;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", th2.getMessage());
            i10 = -1;
        }
        return i10;
    }

    public static void zz(Context context) {
        try {
            AtomicInteger atomicInteger = f21601cm;
            if (atomicInteger.get() != 0) {
                return;
            }
            AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
            boolean zIsEnabled = accessibilityManager.isEnabled();
            boolean zIsTouchExplorationEnabled = accessibilityManager.isTouchExplorationEnabled();
            if (zIsEnabled && zIsTouchExplorationEnabled) {
                atomicInteger.set(1);
                com.bytedance.sdk.openadsdk.prr.wqx.jpo().wqx();
            } else {
                atomicInteger.set(2);
            }
        } catch (Exception unused) {
            f21601cm.set(2);
        }
    }

    public static String jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (dtVar == null) {
            return null;
        }
        try {
            return wqx(dtVar.cxb());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String cm(String str) {
        return jpo(str, false, false);
    }

    public static boolean cm(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        return dtVar != null && dtVar.pzk() == 3 && dtVar.zrw() && (dtVar.zmh() == 4 || dtVar.zmh() == 5);
    }

    public static int jpo(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 2;
            case "rewarded_video":
                return 7;
            case "open_ad":
            case "cache_splash_ad":
                return 4;
            case "fullscreen_interstitial_ad":
                return 5;
            case "interaction":
                return 3;
            default:
                return 1;
        }
    }

    public static String jpo(Context context) throws IOException {
        String strJd = com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("total_memory", (String) null);
        if (strJd != null && jd(strJd) > 0) {
            return strJd;
        }
        String strWqx = wqx("MemTotal");
        if (jd(strWqx) <= 0) {
            strWqx = zz();
        }
        com.bytedance.sdk.openadsdk.core.wqx.jpo().jpo("total_memory", strWqx);
        return strWqx;
    }

    public static String wqx(Context context) {
        try {
            return context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", e10.toString());
            return "";
        }
    }

    public static long jd(String str) {
        try {
            return Long.parseLong(str);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static long jd(Context context) {
        return com.bytedance.sdk.openadsdk.core.wqx.jpo().jd("total_internal_storage", 0L).longValue();
    }

    public static String jpo(String str, boolean z10, boolean z11) {
        String strOpi;
        if (str != null && !str.startsWith("/")) {
            str = "/".concat(str);
        }
        if (z11) {
            strOpi = nmd();
        } else {
            strOpi = opi();
        }
        if (TextUtils.isEmpty(strOpi)) {
            strOpi = "api16-access-ttp.tiktokpangle.us";
        }
        String strL = b.l(DtbConstants.HTTPS, strOpi, str);
        if (nzb.jpo() && !z10) {
            strL = nzb.jpo(strL);
        }
        return z10 ? m498if(strL) : strL;
    }

    public static boolean wqx(com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        if (dtVar == null) {
            return true;
        }
        int iJd = com.bytedance.sdk.openadsdk.core.sq.cm().jd(dtVar.jl());
        int iWqx = com.bytedance.sdk.component.utils.opi.wqx(com.bytedance.sdk.openadsdk.core.sq.jpo());
        if (iJd == 1) {
            return cm(iWqx);
        }
        if (iJd == 2) {
            return my(iWqx) || cm(iWqx) || jj(iWqx);
        }
        if (iJd != 3) {
            return iJd != 5 || cm(iWqx) || jj(iWqx);
        }
        return false;
    }

    public static JSONObject jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, long j10, com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) throws JSONException {
        if (dtVar == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_CREATIVE_ID, dtVar.fc());
            jSONObject.put("buffers_time", j10);
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = dtVar.ww();
            if (jdVarWw != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, jdVarWw.my());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, jdVarWw.zz());
            }
            jpo(jSONObject, jpoVar);
            return jSONObject;
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.nmd.jpo("TTAD.ToolUtils", "getVideoAction json error", e10);
            return jSONObject;
        }
    }

    private static void jpo(JSONObject jSONObject, com.bykv.vk.openvk.jpo.jpo.jpo.jpo jpoVar) {
        if (jSONObject.has(CampaignEx.JSON_KEY_VIDEO_RESOLUTION) || jpoVar == null) {
            return;
        }
        try {
            jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, String.format(Locale.getDefault(), "%d×%d", Integer.valueOf(jpoVar.cm()), Integer.valueOf(jpoVar.my())));
        } catch (Throwable unused) {
        }
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str) {
        if (dtVar != null) {
            try {
                String strIwg = dtVar.iwg();
                if (TextUtils.isEmpty(strIwg) && dtVar.cnl() != null && dtVar.cnl().wqx() == 1 && !TextUtils.isEmpty(dtVar.cnl().jd())) {
                    strIwg = dtVar.cnl().jd();
                }
                String str2 = strIwg;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.duq.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), str2, dtVar, jpo(str), str, false);
            } catch (Throwable unused) {
            }
        }
    }

    public static void jpo(String str, String str2, Context context) {
        int i10;
        if (TextUtils.isEmpty(str2) || !my(context)) {
            return;
        }
        int length = str2.length();
        int i11 = 1;
        if (length % 3572 == 0) {
            i10 = length / 3572;
        } else {
            i10 = (length / 3572) + 1;
        }
        int i12 = 3572;
        int i13 = 0;
        while (i11 <= i10) {
            if (i12 < length) {
                Log.d(str, i10 + "-" + i11 + ":" + str2.substring(i13, i12));
                i11++;
                i13 = i12;
                i12 += 3572;
            } else {
                Log.d(str, i10 + "-" + i11 + ":" + str2.substring(i13));
                return;
            }
        }
    }

    public static void jpo(StringBuilder sb2, String str, String str2) {
        int iIndexOf;
        if (sb2 == null || TextUtils.isEmpty(str) || (iIndexOf = sb2.indexOf(str)) <= 0) {
            return;
        }
        sb2.replace(iIndexOf, str.length() + iIndexOf, str2);
    }

    public static com.bytedance.sdk.openadsdk.common.cm jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, com.bytedance.sdk.component.zz.jj jjVar, Context context, String str) {
        int iZmh = dtVar.zmh();
        if (!dtVar.zrw()) {
            return null;
        }
        if (iZmh != 1 && iZmh != 3) {
            return null;
        }
        jjVar.jpo(true, (View) new com.bytedance.sdk.openadsdk.common.wqx(context));
        return new com.bytedance.sdk.openadsdk.common.cm(dtVar, jjVar, str, false);
    }

    public static void jpo(JSONObject jSONObject) {
        int iIntValue;
        try {
            Pair<String, Long> pairCm = com.bytedance.sdk.openadsdk.core.zz.cm("oem_store");
            int i10 = -1;
            if (pairCm != null && ((iIntValue = Integer.valueOf((String) pairCm.first).intValue()) != -2 || System.currentTimeMillis() - ((Long) pairCm.second).longValue() < com.bytedance.sdk.openadsdk.rq.jpo.jpo("oem_store_state_time", 259200000))) {
                i10 = iIntValue;
            }
            jSONObject.put("oem_store", i10);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.ToolUtils", th2.getMessage());
        }
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, com.bytedance.sdk.component.zz.jj jjVar) {
        jpo(dtVar, jjVar, false);
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.dt dtVar, com.bytedance.sdk.component.zz.jj jjVar, boolean z10) {
        com.bytedance.sdk.component.zz.jj jjVar2;
        com.bytedance.sdk.openadsdk.core.model.xyk xykVarRq;
        List<Integer> list;
        if (dtVar == null || jjVar == null) {
            return;
        }
        int iZmh = dtVar.zmh();
        if (!dtVar.zrw() || (!(iZmh == 2 || iZmh == 3 || iZmh == 5) || (xykVarRq = dtVar.rq()) == null)) {
            jjVar2 = jjVar;
        } else {
            List<Integer> listJj = xykVarRq.jj();
            ArrayList arrayList = new ArrayList();
            if (z10) {
                for (int i10 = 0; i10 < listJj.size(); i10++) {
                    arrayList.add(Integer.valueOf(listJj.get(i10).intValue() - 1));
                }
                list = arrayList;
            } else {
                list = listJj;
            }
            jjVar2 = jjVar;
            jjVar2.jpo(true, xykVarRq.cm(), xykVarRq.my(), list, xykVarRq.qk(), xykVarRq.wqx());
        }
        int iWkl = dtVar.wkl();
        long jAx = dtVar.ax();
        if ((iWkl == 1 || iWkl == 2) && jAx > 0) {
            jjVar2.jpo(iWkl, jAx);
        }
    }

    public static int jpo(WebView webView) {
        if (webView == null) {
            return -1;
        }
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int size = webBackForwardListCopyBackForwardList.getSize();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(i10);
                if (itemAtIndex != null) {
                    String url = itemAtIndex.getUrl();
                    if (!arrayList.contains(url)) {
                        arrayList.add(url);
                    }
                }
            }
            return arrayList.indexOf(webView.getUrl()) + 1;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx(wHkgq.PoNlyhY, th2.toString());
            return -1;
        }
    }

    public static JSONObject jpo(AdSlot adSlot) {
        JSONObject jSONObject = new JSONObject();
        if (adSlot != null) {
            try {
                jSONObject.put("is_sb", !TextUtils.isEmpty(adSlot.getBidAdm()));
            } catch (Throwable unused) {
            }
        }
        return jSONObject;
    }
}

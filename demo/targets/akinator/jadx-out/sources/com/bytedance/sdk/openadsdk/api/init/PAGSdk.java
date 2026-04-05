package com.bytedance.sdk.openadsdk.api.init;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.pm.ShortcutManager;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.webkit.WebView;
import com.bytedance.adsdk.ugeno.qk.cm;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.component.jpo;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.component.utils.jd;
import com.bytedance.sdk.component.utils.xyk;
import com.bytedance.sdk.component.xyk.yd;
import com.bytedance.sdk.component.zz.jj;
import com.bytedance.sdk.component.zz.my;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.InitConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.prr;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.settings.zz;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.sz;
import com.bytedance.sdk.openadsdk.core.zz.Cif;
import com.bytedance.sdk.openadsdk.dt.jpo;
import com.bytedance.sdk.openadsdk.hmu.jd.qk;
import com.bytedance.sdk.openadsdk.multipro.jd;
import com.bytedance.sdk.openadsdk.multipro.wqx;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.nmd;
import com.bytedance.sdk.openadsdk.utils.opi;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;
    private static long jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface PAGInitCallback {
        void fail(int i10, String str);

        void success();
    }

    static {
        try {
            jpo.jpo(new jpo.InterfaceC0086jpo() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
                @Override // com.bytedance.sdk.component.jpo.InterfaceC0086jpo
                public ExecutorService getExecutorService() {
                    return duq.my();
                }

                @Override // com.bytedance.sdk.component.jpo.InterfaceC0086jpo
                public HandlerThread getSafeHandlerThread(String str, int i10) {
                    return xyk.jpo(str, i10);
                }
            });
            duq.jpo(new com.bytedance.sdk.component.xyk.xyk("tt_init_memory_data") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(false);
                    PAGInitHelper.initAPM();
                    PAGInitHelper.initMemoryData();
                }
            });
            oya.jpo(System.currentTimeMillis());
            oya.jd();
            jj.setWebViewProvider(new jj.wqx() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // com.bytedance.sdk.component.zz.jj.wqx
                public WebView createWebView(Context context, AttributeSet attributeSet, int i10) {
                    if (!(context instanceof MutableContextWrapper)) {
                        context = context.getApplicationContext();
                    }
                    try {
                        return i10 == 0 ? new my(context, attributeSet) : new my(context, attributeSet, i10);
                    } catch (Exception unused) {
                        return i10 == 0 ? new my(context, attributeSet) : new my(context, attributeSet, i10);
                    }
                }
            });
        } catch (Throwable th2) {
            Log.i("TTAD.PAGSdk", th2.getMessage());
        }
        jpo = 0L;
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && oya.cm() == 0) {
            PAGInitHelper.CALLBACK_LIST.add(pAGInitCallback);
        }
    }

    public static void closeMultiWebViewFileLock() {
        wqx.jpo();
    }

    private static void cm(Context context, InitConfig initConfig) {
        if (TextUtils.isEmpty(initConfig.getPackageName())) {
            dt.jpo((String) null);
            cm.jpo((String) null);
        } else {
            dt.jpo(initConfig.getPackageName());
            cm.jpo(initConfig.getPackageName());
        }
        sq.jd(context);
        if (initConfig.isSupportMultiProcess()) {
            jd.jpo();
        } else {
            jd.jd();
        }
        Cif.jpo();
        com.bytedance.sdk.openadsdk.core.ju.jd.jpo(context);
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            duq.my(new com.bytedance.sdk.component.xyk.xyk("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.13
                @Override // java.lang.Runnable
                public void run() {
                    sq.jd(context);
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.jd(pAGBiddingRequest));
                    com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(false);
                }
            });
        }
    }

    public static String getSDKVersion() {
        return sz.jpo() != null ? sz.jpo().wqx() : "";
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.12
            @Override // java.lang.Runnable
            public void run() {
                PAGSdk.jd(context, pAGConfig, pAGInitCallback);
            }
        });
        oya.xyk();
    }

    public static boolean isInitSuccess() {
        return oya.cm() == 1;
    }

    private static void jj(final Context context, final InitConfig initConfig) {
        SystemClock.elapsedRealtime();
        duq.jpo(new com.bytedance.sdk.component.xyk.xyk("init_sync") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8
            @Override // java.lang.Runnable
            public void run() throws IOException, ClassNotFoundException {
                oya.jpo(initConfig.getData());
                com.bytedance.sdk.openadsdk.rq.jpo.jpo(context, initConfig.getAppId());
                com.bytedance.sdk.openadsdk.rq.jpo.jpo();
                com.bytedance.sdk.openadsdk.sq.wqx.jpo();
                com.bytedance.sdk.openadsdk.sq.wqx.jd();
                new hna();
                com.bytedance.sdk.component.adexpress.jpo.jd.jj.jpo(nmd.jpo() * 10);
                com.bytedance.sdk.openadsdk.cm.jpo.cm.jpo(context, initConfig.isSupportMultiProcess());
                prr.jpo().jd();
                com.bytedance.sdk.openadsdk.core.yd.wqx.jpo();
                com.bytedance.sdk.openadsdk.dt.jpo.jpo(new jpo.InterfaceC0141jpo() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8.1
                    public void onGdprChanged(int i10) {
                        PAGConfig.setGDPRConsent(i10);
                    }
                });
                au.f20838cm = au.wqx(context);
                qk.jd();
                com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo(sq.cm().sbx());
                com.bykv.vk.openvk.jpo.jpo.jd.jpo.jpo(CacheDirFactory.getICacheDir(0));
                com.bytedance.sdk.openadsdk.core.settings.jj jjVarCm = sq.cm();
                if (!jjVarCm.xk()) {
                    synchronized (jjVarCm) {
                        try {
                            if (!jjVarCm.xk()) {
                                jjVarCm.jd();
                                jjVarCm.nq();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                DeviceUtils.ju();
                PAGInitHelper.maybeAsyncInitTask(context);
                PAGSdk.getBiddingToken();
                com.bytedance.sdk.component.xyk.jj.jpo(true);
                com.bytedance.sdk.component.xyk.jj.jpo(new com.bytedance.sdk.openadsdk.prr.jd.jpo());
                DeviceUtils.jpo(context);
                DeviceUtils.ju(context);
                DeviceUtils.m494if(context);
                com.bytedance.sdk.openadsdk.prr.jpo.jpo();
                com.bytedance.sdk.openadsdk.core.settings.cm.jpo();
                com.bytedance.sdk.openadsdk.prr.wqx.cm();
                tic.zz(context);
                com.bytedance.sdk.openadsdk.cm.wqx.jpo();
                PAGSdk.wqx();
                com.bytedance.sdk.openadsdk.core.yd.wqx.jd();
                com.bytedance.sdk.openadsdk.core.my.jpo.jpo().jd();
                com.bytedance.sdk.component.xyk.wqx.wqx.jpo(oya.jd());
                com.bytedance.sdk.component.utils.jd.jpo(new jd.jpo() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.8.2
                    @Override // com.bytedance.sdk.component.utils.jd.jpo
                    public ExecutorService getAsyncStartActivityThreadPool() {
                        return duq.zz();
                    }

                    @Override // com.bytedance.sdk.component.utils.jd.jpo
                    public boolean isEnableAsyncStartActivity() {
                        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("start_activity_async", 0) == 1;
                    }

                    @Override // com.bytedance.sdk.component.utils.jd.jpo
                    public boolean isStartActivityBySubThread() {
                        return com.bytedance.sdk.openadsdk.rq.jpo.jpo("start_act_asy", 0) == 1;
                    }
                });
                tic.wqx();
            }
        });
    }

    private static void my(Context context, InitConfig initConfig) {
        if (zz.jpo()) {
            com.bytedance.sdk.component.xyk.jj.wqx(-1);
            com.bytedance.sdk.component.xyk.my.jpo(new yd() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7
                @Override // com.bytedance.sdk.component.xyk.yd
                public com.bytedance.sdk.component.xyk.zz createThreadFactory(int i10, String str) {
                    return new com.bytedance.sdk.component.xyk.zz(i10, str) { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.7.1
                        @Override // com.bytedance.sdk.component.xyk.zz, java.util.concurrent.ThreadFactory
                        public Thread newThread(Runnable runnable) {
                            if (com.bytedance.sdk.component.xyk.zz.sCrashHappened) {
                                return null;
                            }
                            int iRxq = au.jrx().rxq();
                            if (iRxq < -524288 || iRxq >= 0) {
                                return super.newThread(runnable);
                            }
                            Thread thread = new Thread(this.jpo, runnable, this.f19058jd, iRxq);
                            if (thread.isDaemon()) {
                                thread.setDaemon(false);
                            }
                            int i11 = this.wqx;
                            if (i11 > 10 || i11 <= 0) {
                                this.wqx = 5;
                            }
                            thread.setPriority(this.wqx);
                            return thread;
                        }
                    };
                }
            });
            wqx.jpo(context);
            com.bytedance.sdk.openadsdk.qk.jd.wqx();
            oya.f20821jd.set(true);
            try {
                com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().jpo(new com.bytedance.sdk.openadsdk.zz.jpo());
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("TTAD.PAGSdk", e10.getMessage());
            }
            wqx(initConfig);
            wqx(context, initConfig);
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(context, null);
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(2);
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(initConfig.isSupportMultiProcess());
            com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jpo(com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().jj());
        }
    }

    public static boolean onlyVerityPlayable(String str, int i10, String str2, String str3, String str4) {
        if (sz.jpo() != null) {
            return sz.jpo().jpo(str, i10, str2, str3, str4);
        }
        return false;
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dt.jpo(str);
        cm.jpo(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && sq.cm().hna() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.prr.wqx.jpo().jpo(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z10) {
        com.bytedance.sdk.openadsdk.common.my.jpo(z10);
    }

    private static void wqx(Context context, InitConfig initConfig) {
        oya.jpo = true;
        sz.jpo().jpo(initConfig.getAppId()).jd(initConfig.getGdpr()).my(initConfig.getPA()).cm(initConfig.getAppIconId()).jpo(initConfig.getTitleBarTheme()).wqx(initConfig.getAdxId());
        com.bytedance.sdk.openadsdk.core.zz.dt();
        if (initConfig instanceof PAGConfig) {
            sz.jpo().wqx(((PAGConfig) initConfig).getDebugLog() ? 1 : 0);
        }
        try {
            if (jd(initConfig)) {
                sz.jpo().jpo();
                opi.jpo();
            }
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.component.utils.zz.jpo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(final Context context, final InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        Context applicationContext;
        jpo = SystemClock.elapsedRealtime();
        sq.jd(context);
        if (pAGInitCallback != null) {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                if (!list.contains(pAGInitCallback)) {
                    list.add(pAGInitCallback);
                    if (oya.cm() == 3) {
                        return;
                    }
                }
            }
        }
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            jd(-1, "DisableSDK is called, interrupt initialization");
            return;
        }
        if (isInitSuccess()) {
            cm();
            wqx(initConfig);
            return;
        }
        if (initConfig == null) {
            jd(4000, "PAGConfig is null, please check.");
            return;
        }
        oya.jpo(3);
        int pa2 = initConfig.getPA();
        if (pa2 < -1 || pa2 > 1) {
            jd(10004, com.bytedance.sdk.openadsdk.core.xyk.jpo(10004));
            return;
        }
        if (context == null) {
            jd(4000, "Context is null, please check. ");
            return;
        }
        if (!(context instanceof Application) && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        cm(context, initConfig);
        ApmHelper.initApm(context, initConfig);
        try {
            com.bytedance.sdk.openadsdk.core.zz.jpo(new com.bytedance.sdk.openadsdk.core.au() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.4
                @Override // com.bytedance.sdk.openadsdk.core.au
                public void fail(int i10, String str) {
                    PAGSdk.jd(i10, str);
                }

                public void success() {
                    PAGSdk.cm();
                }
            });
            try {
                dt.jpo(sq.jpo(), "tt_ad_logo_txt");
                if (dt.cm(context, "tt_ad_logo") == 0) {
                    jpo(initConfig, pAGInitCallback);
                    return;
                }
                if (isInitSuccess()) {
                    if (pAGInitCallback != null) {
                        cm();
                        return;
                    }
                    return;
                }
                final com.bytedance.sdk.openadsdk.my.jpo jpoVar = new com.bytedance.sdk.openadsdk.my.jpo();
                SDKTypeConfig.setSdkTypeFactory(new ISDKTypeFactory() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.5
                    @Override // com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory
                    public IADTypeLoaderFactory createADTypeLoaderFactory(String str) {
                        return jpoVar;
                    }
                });
                if (!initConfig.isSupportMultiProcess()) {
                    jd(context, initConfig);
                } else {
                    com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo().jpo(new com.bytedance.sdk.openadsdk.multipro.aidl.jd() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6
                        @Override // com.bytedance.sdk.openadsdk.multipro.aidl.jd
                        public void onServiceConnected() {
                            oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.6.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                    PAGSdk.jd(context, initConfig);
                                }
                            });
                        }
                    });
                    com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo().wqx();
                }
            } catch (Throwable unused) {
                jpo(initConfig, pAGInitCallback);
            }
        } catch (Throwable unused2) {
            jd(4000, "Internal Error, setting exception. ");
        }
    }

    public static void getBiddingToken(final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            duq.my(new com.bytedance.sdk.component.xyk.xyk("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.14
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken());
                    com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(false);
                }
            });
        }
    }

    public static void getBiddingToken(final String str, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            biddingTokenCallback.onBiddingTokenCollected(null);
        } else {
            duq.my(new com.bytedance.sdk.component.xyk.xyk("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.15
                @Override // java.lang.Runnable
                public void run() {
                    biddingTokenCallback.onBiddingTokenCollected(PAGSdk.getBiddingToken(str));
                    com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jpo(false);
                }
            });
        }
    }

    private static void jpo(InitConfig initConfig, PAGInitCallback pAGInitCallback) {
        oya.jpo(2);
        if (pAGInitCallback != null) {
            if (initConfig instanceof PAGConfig) {
                jd(4000, "resources not found, if you use aab please call PAGConfig.setPackageName");
            } else {
                jd(4000, "resources not found, if you use aab please call TTAdConfig.setPackageName");
            }
        }
    }

    public static String getBiddingToken(Context context) {
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            return null;
        }
        sq.jd(context);
        return getBiddingToken();
    }

    private static void jpo(final Context context, final boolean z10, final InitConfig initConfig, final long j10, final long j11) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo();
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("pangle_sdk_init", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.9
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    boolean zWqx = com.bytedance.sdk.openadsdk.core.zz.jd().wqx();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                    jSONObject.put("sdk_init_time", j11);
                    jSONObject.put("is_async", true);
                    jSONObject.put("is_multi_process", initConfig.isSupportMultiProcess());
                    jSONObject.put("is_debug", PAGSdk.jd(initConfig));
                    jSONObject.put("is_use_texture_view", initConfig.isUseTextureView());
                    jSONObject.put("is_activate_init", zWqx);
                    jSONObject.put("minSdkVersion", tic.qk(context));
                    jSONObject.put("targetSdkVersion", tic.jj(context));
                    jSONObject.put("apm_is_init", ApmHelper.isIsInit());
                    jSONObject.put("is_success", z10);
                    com.bytedance.sdk.openadsdk.core.zz.jd().jd(false);
                } catch (Exception e10) {
                    com.bytedance.sdk.component.utils.nmd.jpo("TTAD.PAGSdk", "run: ", e10);
                }
                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("pangle_sdk_init").jd(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void cm() {
        oya.jpo(1);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                try {
                    Iterator<PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.success();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            com.bytedance.sdk.openadsdk.sq.wqx.jd(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.10
                @Override // com.bytedance.sdk.openadsdk.sq.cm
                public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                    return a.h(C3191e4.a.f36368f);
                }
            });
        } catch (Throwable th3) {
            com.bytedance.sdk.component.utils.nmd.wqx(th3.getMessage(), new Object[0]);
        }
    }

    public static String getBiddingToken(Context context, String str) {
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            return null;
        }
        sq.jd(context);
        return getBiddingToken(str);
    }

    public static String getBiddingToken(String str) {
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            return null;
        }
        if (sq.jpo() == null || sz.jpo() == null) {
            return "";
        }
        PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
        pAGBiddingRequest.setSlotId(str);
        return sz.jpo().jpo(pAGBiddingRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wqx() {
        ShortcutManager shortcutManager;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Context contextJpo = sq.jpo();
                if (contextJpo == null || (shortcutManager = (ShortcutManager) contextJpo.getSystemService(ShortcutManager.class)) == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.zz.jd().jpo(shortcutManager.isRequestPinShortcutSupported());
            } catch (Throwable unused) {
            }
        }
    }

    private static void wqx(InitConfig initConfig) {
        if (initConfig == null) {
            return;
        }
        if (!TextUtils.isEmpty(initConfig.getData())) {
            com.bytedance.sdk.openadsdk.core.zz.jd().wqx(initConfig.getData());
        }
        com.bytedance.sdk.openadsdk.core.zz.jd().wqx(jd(initConfig));
    }

    public static String getBiddingToken() {
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            return null;
        }
        return (sq.jpo() == null || sz.jpo() == null) ? "" : sz.jpo().jpo((PAGBiddingRequest) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(Context context, InitConfig initConfig) {
        long j10;
        try {
        } catch (Throwable th2) {
            th2.getMessage();
            com.bytedance.sdk.component.utils.nmd.wqx("TTAD.PAGSdk", th2.getMessage());
            long jElapsedRealtime = SystemClock.elapsedRealtime() - jpo;
            jd(4000, th2.getMessage());
            j10 = jElapsedRealtime;
        }
        if (isInitSuccess()) {
            cm();
            return;
        }
        my(context, initConfig);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jpo;
        cm();
        jj(context, initConfig);
        j10 = jElapsedRealtime2;
        jpo(context, isInitSuccess(), initConfig, SystemClock.elapsedRealtime() - jpo, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean jd(InitConfig initConfig) {
        return ((PAGConfig) initConfig).getDebugLog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(int i10, String str) {
        oya.jpo(2);
        try {
            List<PAGInitCallback> list = PAGInitHelper.CALLBACK_LIST;
            synchronized (list) {
                try {
                    Iterator<PAGInitCallback> it = list.iterator();
                    while (it.hasNext()) {
                        PAGInitCallback next = it.next();
                        if (next != null) {
                            it.remove();
                            next.fail(i10, str);
                        }
                    }
                    com.bytedance.sdk.openadsdk.sq.wqx.wqx(new com.bytedance.sdk.openadsdk.sq.cm() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.11
                        @Override // com.bytedance.sdk.openadsdk.sq.cm
                        public com.bytedance.sdk.openadsdk.sq.jd.jpo generatorModel() {
                            return a.h(C3191e4.a.f36368f);
                        }
                    });
                } finally {
                }
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx(th2.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String jd(PAGBiddingRequest pAGBiddingRequest) {
        if (com.bytedance.sdk.openadsdk.common.my.jpo()) {
            return null;
        }
        return (sq.jpo() == null || sz.jpo() == null) ? "" : sz.jpo().jpo(pAGBiddingRequest);
    }
}

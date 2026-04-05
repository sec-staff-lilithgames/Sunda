package com.bykv.vk.openvk.preload.geckox;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bykv.vk.openvk.preload.geckox.net.INetWork;
import com.bykv.vk.openvk.preload.geckox.statistic.IStatisticMonitor;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class GeckoHubImp {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static GeckoHubImp f17035a = new GeckoHubImp();
    }

    public static GeckoHubImp inst(Context context) {
        c.a(context);
        return a.f17035a;
    }

    public static void setRandomHost(String str) {
        c.a(str);
    }

    public static void setThreadPoolExecutorCallback(IThreadPoolCallback iThreadPoolCallback) {
        b.a(iThreadPoolCallback);
    }

    public WebResourceResponse findRes(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2).getWebResourceResponse();
    }

    public WebResourceResponseModel findResAndMsg(ILoader iLoader, String str, String str2) {
        return c.a().a(iLoader, str, str2);
    }

    public com.bykv.vk.openvk.preload.falconx.loader.a getGeckoResLoader() {
        c.a();
        return c.b();
    }

    public int getResCount(ILoader iLoader, String str) {
        c.a();
        return c.a(iLoader, str);
    }

    public void preload(String str, IStatisticMonitor iStatisticMonitor, Set<String> set, INetWork iNetWork) {
        c.a().a(str, iStatisticMonitor, set, iNetWork);
    }

    public void releaseGeckoResLoader(ILoader iLoader) {
        c.a();
        c.a(iLoader);
    }

    private GeckoHubImp() {
    }
}

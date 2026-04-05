package com.mbridge.msdk.tracker.network.toolbox;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.tools.j0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class i {

    /* renamed from: f, reason: collision with root package name */
    private static final String f44048f = "i";

    /* renamed from: g, reason: collision with root package name */
    private static volatile i f44049g;

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, InetAddress> f44050a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f44051b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private String f44053d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f44054e = "";

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.buffer.sharedperference.a f44052c = com.mbridge.msdk.foundation.buffer.sharedperference.a.b();

    private i() {
    }

    public static i b() {
        if (f44049g == null) {
            synchronized (i.class) {
                try {
                    if (f44049g == null) {
                        f44049g = new i();
                    }
                } finally {
                }
            }
        }
        return f44049g;
    }

    private void d(String str) throws JSONException {
        try {
            this.f44054e = e(com.mbridge.msdk.foundation.same.net.utils.d.h().f40867y);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(j0.a(str));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next) && next.contains(this.f44054e)) {
                    String string = jSONObject.getString(next);
                    if (!TextUtils.isEmpty(string)) {
                        try {
                            this.f44050a.put(next, InetAddress.getByAddress(next, com.mbridge.msdk.foundation.same.c.b(string)));
                        } catch (UnknownHostException e10) {
                            this.f44053d = "create InetAddress failed for " + next + " with ip " + string;
                            p0.b(f44048f, "init: local dns cache error", e10);
                        }
                    }
                }
            }
            this.f44051b.set(true);
        } catch (Exception e11) {
            p0.b(f44048f, "init: local dns cache json parse error", e11);
            this.f44053d = "parse local dns config error";
            this.f44050a.clear();
            this.f44051b.set(false);
        }
    }

    private static String e(String str) {
        return str.replace("https://{}", "").replace("http://{}", "");
    }

    public boolean c(String str) {
        return TextUtils.equals(str, com.mbridge.msdk.foundation.same.net.utils.d.h().f40845e.replace(DtbConstants.HTTPS, ""));
    }

    public void f(String str) {
        if (TextUtils.isEmpty(str) || !e()) {
            return;
        }
        this.f44051b.set(false);
        this.f44050a.clear();
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f44051b.set(false);
        this.f44053d = "download local dns config error";
    }

    public boolean e() {
        return r0.a().b("local_dns", false, false);
    }

    private void a() throws JSONException {
        String strA = this.f44052c.a("cache");
        String strA2 = this.f44052c.a("url");
        String strB = r0.a().b("local_dns_config_url", "", false);
        if (TextUtils.isEmpty(strB)) {
            this.f44052c.a("cache", "");
        } else if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strA2) && TextUtils.equals(strB, strA2)) {
            d(strA);
        } else {
            a(strB);
        }
    }

    public boolean c(String str, String str2, String str3) {
        if (e() && d() && TextUtils.equals(str, MBInterstitialActivity.INTENT_CAMAPIGN) && !c(str3)) {
            return TextUtils.equals(str2, String.valueOf(94)) || TextUtils.equals(str2, String.valueOf(MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        }
        return false;
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String path = new URL(str).getPath();
            return path.substring(path.lastIndexOf(47) + 1);
        } catch (Exception unused) {
            return str;
        }
    }

    private void a(String str) {
        a(str, com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_OTHER) + File.separator, b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2, String str3) {
        try {
            String strA = com.mbridge.msdk.foundation.same.c.a(new FileInputStream(new File(str2, str3)));
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            this.f44052c.a("cache", strA);
            this.f44052c.a("url", str);
            d(strA);
        } catch (Exception e10) {
            p0.b(f44048f, "downloadLocalDNSConfig: onDownloadComplete: file not found", e10);
            this.f44053d = "find local dns config file error";
        }
    }

    private void a(String str, String str2, String str3) {
        MBDownloadManager.getInstance().download(new DownloadMessage<>(new Object(), str, str3, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_OTHER)).withConnectTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withReadTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withWriteTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withTimeout(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL).withHttpRetryCounter(5).withDirectoryPathInternal(str2).withDownloadPriority(DownloadPriority.HIGH).withDownloadStateListener(new a(str, str2, str3)).build().start();
    }

    public boolean d() {
        return this.f44051b.get() && !this.f44050a.isEmpty();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements OnDownloadStateListener<Object> {

        /* renamed from: a, reason: collision with root package name */
        private final String f44055a;

        /* renamed from: b, reason: collision with root package name */
        private final String f44056b;

        /* renamed from: c, reason: collision with root package name */
        private final String f44057c;

        public a(String str, String str2, String str3) {
            this.f44055a = str;
            this.f44056b = str2;
            this.f44057c = str3;
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage<Object> downloadMessage) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage<Object> downloadMessage) {
            i.b().b(this.f44055a, this.f44056b, this.f44057c);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage<Object> downloadMessage, DownloadError downloadError) {
            i.b().c();
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage<Object> downloadMessage) {
        }
    }

    public List<InetAddress> a(String str, UnknownHostException unknownHostException) throws UnknownHostException {
        InetAddress inetAddress;
        try {
            inetAddress = this.f44050a.get(str);
        } catch (Exception e10) {
            p0.b(f44048f, "lookup: local dns cache error", e10);
            inetAddress = null;
        }
        if (inetAddress != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(inetAddress);
            return arrayList;
        }
        throw unknownHostException;
    }
}

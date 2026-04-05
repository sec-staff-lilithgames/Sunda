package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.ces.b;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* renamed from: a, reason: collision with root package name */
    private static volatile PglSSManager f50459a;

    /* renamed from: b, reason: collision with root package name */
    private final b f50460b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f50461c = 0;

    /* renamed from: d, reason: collision with root package name */
    private volatile PglSSCallBack f50462d;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f50460b = b.a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return b.g();
    }

    public static PglSSManager getInstance() {
        return f50459a;
    }

    public static String getLoadError() {
        if (b.i() != null) {
            return b.i().f50427b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f50459a == null) {
            synchronized (PglSSManager.class) {
                try {
                    if (f50459a == null) {
                        f50459a = new PglSSManager(context, pglSSConfig);
                        if (b.g() == 0) {
                            f50459a.f50462d = pglSSConfig.getCallBack();
                            f50459a.f50460b.a(pglSSConfig.getCustomInfo());
                            f50459a.f50460b.a(str, str3, str2, str4);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f50459a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (b.g() == 0) {
            this.f50460b.a(motionEvent);
        }
    }

    public long getECForBidding() {
        if (b.g() == 0) {
            return this.f50460b.e();
        }
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (b.g() == 0) {
            return this.f50460b.a(str, bArr);
        }
        return null;
    }

    public PglSSCallBack getPglCallBack() {
        return this.f50462d;
    }

    public String getSofChara() {
        if (b.g() == 0) {
            return this.f50460b.j();
        }
        return null;
    }

    public String getToken() {
        if (b.g() == 0) {
            return this.f50460b.k();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (b.g() == 0) {
            if (REPORT_SCENE_ADSHOW.equals(str)) {
                this.f50460b.b();
            }
            int i10 = this.f50461c;
            b bVar = this.f50460b;
            if (i10 % bVar.f50444p == 0) {
                bVar.a(str, map);
            }
            this.f50461c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (b.g() == 0) {
            this.f50460b.a(map);
        }
    }

    public void setDeviceId(String str) {
        if (b.g() == 0) {
            this.f50460b.b(str);
        }
    }

    public void setGaid(String str) {
        if (b.g() == 0) {
            this.f50460b.c(str);
        }
    }
}

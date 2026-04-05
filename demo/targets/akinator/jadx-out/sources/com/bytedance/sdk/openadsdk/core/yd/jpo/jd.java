package com.bytedance.sdk.openadsdk.core.yd.jpo;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import android.util.ArrayMap;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd {
    private static volatile jd jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final ArrayList<String> f21029jd = new ArrayList<>();
    private final AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: cm, reason: collision with root package name */
    private long f21028cm = System.currentTimeMillis();
    private long my = 0;

    /* renamed from: jj, reason: collision with root package name */
    private long f21030jj = 0;

    /* renamed from: qk, reason: collision with root package name */
    private String f21032qk = "";
    private String xyk = "";
    private String zz = "";

    /* renamed from: yd, reason: collision with root package name */
    private boolean f21033yd = false;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f21031ju = false;

    public static jd jpo(Application application) {
        if (jpo == null) {
            synchronized (jd.class) {
                try {
                    if (jpo == null) {
                        jd jdVar = new jd();
                        jpo = jdVar;
                        jdVar.f21033yd = jpo((Context) application);
                        jpo.f21031ju = jpo(application.getApplicationContext(), "android.permission.SYSTEM_ALERT_WINDOW") == 0;
                        jpo.jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public void jd(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f21029jd.contains(localClassName)) {
            this.f21029jd.remove(localClassName);
        }
        if (this.f21029jd.size() == 0) {
            this.f21028cm = System.currentTimeMillis();
            this.wqx.set(true);
            this.xyk = localClassName;
        }
    }

    private static int jpo(Context context, String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static boolean jpo(Context context) {
        ApplicationInfo applicationInfo;
        return (context == null || (applicationInfo = context.getApplicationInfo()) == null || (applicationInfo.flags & 1) <= 0) ? false : true;
    }

    public void jpo(Activity activity) {
        String localClassName = activity.getLocalClassName();
        if (this.f21029jd.size() == 0) {
            this.f21032qk = localClassName;
            this.my = System.currentTimeMillis();
            this.f21030jj = System.currentTimeMillis() - this.f21028cm;
            this.wqx.set(false);
        }
        if (!this.f21029jd.contains(localClassName)) {
            this.f21029jd.add(localClassName);
        }
        if (localClassName.contains("com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity") || localClassName.contains(QFzuMMDfrzagDN.HeVP)) {
            return;
        }
        this.zz = localClassName;
    }

    private void jpo() {
        int size;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", null);
            boolean z10 = true;
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(objInvoke);
            if (arrayMap != null && (size = arrayMap.size()) > 0) {
                Class<?> cls2 = Class.forName("android.app.ActivityThread$ActivityClientRecord");
                Field declaredField2 = cls2.getDeclaredField(C3191e4.h.f36486h0);
                declaredField2.setAccessible(true);
                Field declaredField3 = cls2.getDeclaredField("activity");
                declaredField3.setAccessible(true);
                for (int i10 = 0; i10 < size; i10++) {
                    Object objValueAt = arrayMap.valueAt(i10);
                    if (!((Boolean) declaredField2.get(objValueAt)).booleanValue()) {
                        String localClassName = ((Activity) declaredField3.get(objValueAt)).getLocalClassName();
                        if (!this.f21029jd.contains(localClassName)) {
                            this.f21029jd.add(localClassName);
                        }
                    }
                }
                AtomicBoolean atomicBoolean = this.wqx;
                if (this.f21029jd.size() > 0) {
                    z10 = false;
                }
                atomicBoolean.set(z10);
            }
        } catch (Throwable unused) {
        }
    }

    public String jpo(String str, long j10, int i10) {
        String string;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = jCurrentTimeMillis - this.my;
        long j12 = jCurrentTimeMillis - j10;
        int i11 = j12 < 500 ? 1 : 0;
        if (this.wqx.get() && this.f21031ju) {
            i11 |= 2;
        }
        if (!this.wqx.get() && this.f21030jj >= 5000 && j11 < 1000) {
            i11 = this.xyk.equals(this.zz) ? i11 | 4 : i11 | 8;
        }
        try {
            string = new JSONObject().put("rst", i11).put("adtag", str).put("bakdur", this.f21030jj).put("rit", i10).put("poptime", j11).put("unlocktime", j12).put("bakground", this.wqx).put("alert", this.f21031ju).put(NotificationCompat.CATEGORY_SYSTEM, this.f21033yd).put("actsize", this.f21029jd.size()).put("mutiproc", com.bytedance.sdk.openadsdk.multipro.jd.wqx()).toString();
        } catch (JSONException unused) {
            string = "";
        }
        this.f21032qk = "";
        this.f21030jj = 0L;
        this.my = 0L;
        this.f21028cm = System.currentTimeMillis();
        return string;
    }
}

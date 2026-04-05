package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.zz;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.aidl.jpo.cm;
import com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jj;
import com.bytedance.sdk.openadsdk.multipro.aidl.jpo.my;
import com.bytedance.sdk.openadsdk.multipro.aidl.jpo.qk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class BinderPoolService extends Service {
    public static volatile boolean jpo;
    private static boolean wqx;

    /* renamed from: jd, reason: collision with root package name */
    private final Binder f21269jd = new jpo();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i10) throws RemoteException {
            if (i10 == 0) {
                return qk.jpo();
            }
            if (i10 == 1) {
                return my.jpo();
            }
            if (i10 == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.jpo.wqx.jpo();
            }
            if (i10 == 5) {
                return jj.jd();
            }
            if (i10 == 6) {
                return cm.jpo();
            }
            if (i10 != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jd.jpo();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f21269jd;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        sq.jd(getApplicationContext());
        jpo = true;
        if (!wqx) {
            zz.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    au.jrx().jpo(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        wqx = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}

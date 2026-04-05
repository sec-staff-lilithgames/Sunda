package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.aidl.jpo.cm;
import com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jj;
import com.bytedance.sdk.openadsdk.multipro.aidl.jpo.my;
import com.bytedance.sdk.openadsdk.multipro.aidl.jpo.qk;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.tic;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static final jpo f21274jd = new jpo();
    private IBinderPool jpo;
    private jd wqx;

    /* renamed from: cm, reason: collision with root package name */
    private long f21275cm = 0;
    private final ServiceConnection my = new ServiceConnection() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jpo.2
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
            duq.jpo(new xyk("onServiceConnected") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jpo.2.1
                @Override // java.lang.Runnable
                public void run() throws RemoteException {
                    jpo.this.jpo = IBinderPool.Stub.asInterface(iBinder);
                    try {
                        jpo.this.jpo.asBinder().linkToDeath(jpo.this.f21276jj, 0);
                    } catch (RemoteException e10) {
                        nmd.jpo("TTAD.BinderPool", "onServiceConnected throws :", e10);
                    }
                    System.currentTimeMillis();
                    long unused = jpo.this.f21275cm;
                    if (jpo.this.wqx != null) {
                        jpo.this.wqx.onServiceConnected();
                    }
                }
            }, 5);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    };

    /* renamed from: jj, reason: collision with root package name */
    private final IBinder.DeathRecipient f21276jj = new IBinder.DeathRecipient() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jpo.3
        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            duq.jpo(new xyk("binderDied") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jpo.3.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (jpo.this.jpo.asBinder().isBinderAlive()) {
                            jpo.this.jpo.asBinder().unlinkToDeath(jpo.this.f21276jj, 0);
                        }
                    } catch (Exception e10) {
                        nmd.wqx("TTAD.BinderPool", e10.getMessage());
                    }
                    jpo.this.jpo = null;
                    jpo.this.cm();
                }
            }, 5);
        }
    };

    private jpo() {
        cm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cm() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            wqx();
        }
    }

    public void jd() {
        try {
            Context contextJpo = sq.jpo();
            contextJpo.startService(new Intent(contextJpo, (Class<?>) BinderPoolService.class));
        } catch (Exception unused) {
        }
    }

    public void wqx() {
        try {
            Context contextJpo = sq.jpo();
            contextJpo.bindService(new Intent(contextJpo, (Class<?>) BinderPoolService.class), this.my, 1);
            this.f21275cm = System.currentTimeMillis();
        } catch (Throwable unused) {
        }
    }

    public static jpo jpo() {
        return f21274jd;
    }

    public void jpo(jd jdVar) {
        this.wqx = jdVar;
        if (this.jpo != null) {
            duq.jpo(new xyk("onServiceConnected2") { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    if (jpo.this.wqx != null) {
                        jpo.this.wqx.onServiceConnected();
                    }
                }
            }, 5);
        }
    }

    public IBinder jpo(int i10) {
        try {
            if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
                try {
                    IBinderPool iBinderPool = this.jpo;
                    if (iBinderPool != null) {
                        return iBinderPool.queryBinder(i10);
                    }
                } catch (RemoteException e10) {
                    nmd.wqx("TTAD.BinderPool", e10.getMessage());
                    tic.xyk("queryBinder error");
                }
            } else {
                if (i10 == 0) {
                    return qk.jpo();
                }
                if (i10 == 1) {
                    return my.jpo();
                }
                if (i10 == 5) {
                    return jj.jd();
                }
                if (i10 == 6) {
                    return cm.jpo();
                }
                if (i10 == 7) {
                    return com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jd.jpo();
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}

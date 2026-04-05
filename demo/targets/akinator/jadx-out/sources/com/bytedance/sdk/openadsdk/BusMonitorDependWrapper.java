package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.sq.jd;
import com.bytedance.sdk.openadsdk.sq.jd.jpo;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class BusMonitorDependWrapper implements jd {

    /* renamed from: jd, reason: collision with root package name */
    private Handler f19134jd;
    private jd jpo;

    public BusMonitorDependWrapper(jd jdVar) {
        this.jpo = jdVar;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            return (Application) objInvoke.getClass().getMethod("getApplication", null).invoke(objInvoke, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.sq.jd
    public Context getContext() {
        jd jdVar = this.jpo;
        return (jdVar == null || jdVar.getContext() == null) ? getReflectContext() : this.jpo.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.sq.jd
    public Handler getHandler() {
        jd jdVar = this.jpo;
        if (jdVar != null && jdVar.getHandler() != null) {
            return this.jpo.getHandler();
        }
        if (this.f19134jd == null) {
            this.f19134jd = new Handler(getSafeHandlerThread("pag_monitor", 0).getLooper());
        }
        return this.f19134jd;
    }

    @Override // com.bytedance.sdk.openadsdk.sq.jd
    public int getOnceLogCount() {
        jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.sq.jd
    public int getOnceLogInterval() {
        jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.sq.jd
    public HandlerThread getSafeHandlerThread(String str, int i10) {
        HandlerThread safeHandlerThread;
        jd jdVar = this.jpo;
        if (jdVar != null && (safeHandlerThread = jdVar.getSafeHandlerThread(str, i10)) != null) {
            return safeHandlerThread;
        }
        HandlerThread handlerThread = new HandlerThread("pag_monitor");
        handlerThread.start();
        return handlerThread;
    }

    @Override // com.bytedance.sdk.openadsdk.sq.jd
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        jd jdVar = this.jpo;
        if (jdVar == null || (uploadIntervalTime = jdVar.getUploadIntervalTime()) < 3600000) {
            return 86400000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.sq.jd
    public boolean isMonitorOpen() {
        jd jdVar = this.jpo;
        if (jdVar != null) {
            return jdVar.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.sq.jd
    public void onMonitorUpload(List<jpo> list) {
        jd jdVar = this.jpo;
        if (jdVar != null) {
            jdVar.onMonitorUpload(list);
        }
    }
}

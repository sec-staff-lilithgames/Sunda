package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.c2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.v4;
import com.ironsource.C3191e4;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    private static final AppLovinExceptionHandler f15267e = new AppLovinExceptionHandler();

    /* renamed from: a, reason: collision with root package name */
    private final Set f15268a = new HashSet(2);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f15269b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f15270c = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f15271d;

    private String a(Throwable th2, int i10) {
        StackTraceElement[] stackTrace = th2.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i10, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return f15267e;
    }

    public void addSdk(k kVar) {
        if (this.f15268a.contains(kVar)) {
            return;
        }
        this.f15268a.add(kVar);
    }

    public void enable() {
        if (this.f15269b.compareAndSet(false, true)) {
            this.f15271d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) throws InterruptedException {
        if (this.f15270c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long jLongValue = 500;
        for (k kVar : this.f15268a) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("top_main_method", th2.toString());
            Integer num = (Integer) kVar.a(v4.f16062w6);
            if (num.intValue() > 0) {
                mapHashMap.put("details", a(th2, num.intValue()));
            }
            kVar.E().d(c2.C0, mapHashMap);
            kVar.G().trackEventSynchronously(C3191e4.h.f36480e0);
            jLongValue = ((Long) kVar.a(v4.f15971l3)).longValue();
        }
        try {
            Thread.sleep(jLongValue);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f15271d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th2);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}

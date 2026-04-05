package com.apm.insight.a;

import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.b.i;
import com.apm.insight.runtime.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a implements ICrashCallback {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f12819d;

    /* renamed from: a, reason: collision with root package name */
    private volatile String f12820a;

    /* renamed from: b, reason: collision with root package name */
    private volatile i.a f12821b;

    /* renamed from: c, reason: collision with root package name */
    private volatile i.a f12822c;

    /* renamed from: e, reason: collision with root package name */
    private volatile boolean f12823e = false;

    private a() {
    }

    public static a a() {
        if (f12819d == null) {
            synchronized (a.class) {
                try {
                    if (f12819d == null) {
                        f12819d = new a();
                    }
                } finally {
                }
            }
        }
        return f12819d;
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
        crashType.equals(CrashType.NATIVE);
    }

    public final void a(String str, i.a aVar, i.a aVar2) {
        this.f12820a = str;
        this.f12821b = aVar;
        this.f12822c = aVar2;
        if (this.f12823e) {
            return;
        }
        this.f12823e = true;
        m.a().a(new Runnable() { // from class: com.apm.insight.a.a.1
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }
}

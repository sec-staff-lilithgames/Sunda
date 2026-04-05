package com.apm.insight.k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f13108a = new ConcurrentLinkedQueue<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13109a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f13109a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13109a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13109a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private JSONObject f13110a;

        /* renamed from: b, reason: collision with root package name */
        private JSONObject f13111b;

        /* renamed from: c, reason: collision with root package name */
        private CrashType f13112c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.f13112c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f13110a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f13110a = jSONObject;
            }
            this.f13111b = jSONObject.optJSONObject("header");
        }

        public final String a() {
            return this.f13110a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f13110a.optInt("app_start_time", -1);
        }

        public final String c() {
            int i10 = AnonymousClass1.f13109a[this.f13112c.ordinal()];
            if (i10 == 1) {
                return this.f13110a.optString("data", null);
            }
            if (i10 == 2) {
                return this.f13110a.optString("stack", null);
            }
            if (i10 != 3) {
                return null;
            }
            return this.f13110a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f13108a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f13108a.isEmpty()) {
            f13108a.poll();
        }
        f13108a = null;
    }
}

package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.y8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3545y8 implements InterfaceC3409q7 {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f39261a = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.y8$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        String f39262a;

        /* renamed from: b, reason: collision with root package name */
        String f39263b;

        /* renamed from: c, reason: collision with root package name */
        String f39264c;

        /* renamed from: d, reason: collision with root package name */
        Context f39265d;

        /* renamed from: e, reason: collision with root package name */
        String f39266e;

        public a a(String str) {
            this.f39263b = str;
            return this;
        }

        public a b(String str) {
            this.f39264c = str;
            return this;
        }

        public a c(String str) {
            this.f39262a = str;
            return this;
        }

        public a d(String str) {
            this.f39266e = str;
            return this;
        }

        public a a(Context context) {
            this.f39265d = context;
            return this;
        }

        public C3545y8 a() {
            return new C3545y8(this, 0);
        }
    }

    public /* synthetic */ C3545y8(a aVar, int i10) {
        this(aVar);
    }

    private void a(Context context) {
        f39261a.put(G5.f34431e, C3137b4.b(context));
        f39261a.put(G5.f34432f, C3137b4.d(context));
    }

    public static void b(String str) {
        f39261a.put(G5.f34432f, SDKUtils.encodeString(str));
    }

    private C3545y8(a aVar) {
        a(aVar);
        a(aVar.f39265d);
    }

    private void a(a aVar) {
        Context context = aVar.f39265d;
        C3156c5 c3156c5B = C3156c5.b(context);
        f39261a.put(G5.f34436j, SDKUtils.encodeString(c3156c5B.e()));
        f39261a.put(G5.f34437k, SDKUtils.encodeString(c3156c5B.f()));
        f39261a.put(G5.f34438l, Integer.valueOf(c3156c5B.a()));
        f39261a.put(G5.f34439m, SDKUtils.encodeString(c3156c5B.d()));
        f39261a.put(G5.f34440n, SDKUtils.encodeString(c3156c5B.c()));
        f39261a.put(G5.f34430d, SDKUtils.encodeString(context.getPackageName()));
        f39261a.put(G5.f34433g, SDKUtils.encodeString(aVar.f39263b));
        f39261a.put("sessionid", SDKUtils.encodeString(aVar.f39262a));
        f39261a.put(G5.f34428b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f39261a.put(G5.f34441o, "prod");
        f39261a.put("origin", "n");
        if (TextUtils.isEmpty(aVar.f39266e)) {
            return;
        }
        f39261a.put(G5.f34435i, SDKUtils.encodeString(aVar.f39266e));
    }

    @Override // com.ironsource.InterfaceC3409q7
    public Map<String, Object> a() {
        return f39261a;
    }

    public static void a(String str) {
        f39261a.put(G5.f34431e, SDKUtils.encodeString(str));
    }
}

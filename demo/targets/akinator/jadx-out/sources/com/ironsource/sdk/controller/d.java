package com.ironsource.sdk.controller;

import com.ironsource.A8;
import com.ironsource.C3191e4;
import com.ironsource.C3219fe;
import com.ironsource.C3281j5;
import com.ironsource.C3422r4;
import com.ironsource.C3494v8;
import com.ironsource.C8;
import com.ironsource.G5;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class d {

    /* renamed from: h, reason: collision with root package name */
    static final String f38461h = "controllerSourceData";

    /* renamed from: i, reason: collision with root package name */
    private static final String f38462i = "next_";

    /* renamed from: j, reason: collision with root package name */
    private static final String f38463j = "fallback_";

    /* renamed from: k, reason: collision with root package name */
    private static final String f38464k = "controllerSourceCode";

    /* renamed from: a, reason: collision with root package name */
    private long f38465a;

    /* renamed from: b, reason: collision with root package name */
    private int f38466b;

    /* renamed from: c, reason: collision with root package name */
    private c f38467c;

    /* renamed from: d, reason: collision with root package name */
    private EnumC0239d f38468d = EnumC0239d.NONE;

    /* renamed from: e, reason: collision with root package name */
    private String f38469e;

    /* renamed from: f, reason: collision with root package name */
    private String f38470f;

    /* renamed from: g, reason: collision with root package name */
    private C3281j5 f38471g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends JSONObject {
        public a() throws JSONException {
            putOpt(C3191e4.a.f36372j, Integer.valueOf(d.this.f38466b));
            putOpt(d.f38464k, Integer.valueOf(d.this.f38468d.b()));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38473a;

        static {
            int[] iArr = new int[c.values().length];
            f38473a = iArr;
            try {
                iArr[c.FETCH_FROM_SERVER_NO_FALLBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38473a[c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38473a[c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum c {
        FETCH_FROM_SERVER_NO_FALLBACK,
        FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK,
        FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.sdk.controller.d$d, reason: collision with other inner class name */
    public enum EnumC0239d {
        NONE(0),
        PREPARED_CONTROLLER_LOADED(1),
        CONTROLLER_FROM_SERVER(2),
        MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(3),
        FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER(4),
        FALLBACK_CONTROLLER_RECOVERY(5);


        /* renamed from: a, reason: collision with root package name */
        private int f38485a;

        EnumC0239d(int i10) {
            this.f38485a = i10;
        }

        public int b() {
            return this.f38485a;
        }
    }

    public d(JSONObject jSONObject, String str, String str2, C3281j5 c3281j5) {
        int iOptInt = jSONObject.optInt(C3191e4.a.f36372j, -1);
        this.f38466b = iOptInt;
        this.f38467c = a(iOptInt);
        this.f38469e = str;
        this.f38470f = str2;
        this.f38471g = c3281j5;
    }

    private void c() {
        try {
            C8 c8G = g();
            if (c8G.exists()) {
                C8 c8H = h();
                if (c8H.exists()) {
                    c8H.delete();
                }
                IronSourceStorageUtils.renameFile(c8G.getPath(), c8H.getPath());
            }
        } catch (Exception e10) {
            C3422r4.d().a(e10);
        }
    }

    private void d() {
        IronSourceStorageUtils.deleteFile(h());
    }

    private void e() {
        IronSourceStorageUtils.deleteFile(g());
    }

    private C8 h() {
        return new C8(this.f38469e, "fallback_mobileController.html");
    }

    private C8 i() {
        return new C8(this.f38469e, "next_mobileController.html");
    }

    private boolean j() {
        return h().exists();
    }

    private void l() {
        C3494v8 c3494v8A = new C3494v8().a(G5.f34451y, Integer.valueOf(this.f38466b));
        if (this.f38465a > 0) {
            c3494v8A.a(G5.B, Long.valueOf(System.currentTimeMillis() - this.f38465a));
        }
        A8.a(C3219fe.f36721x, c3494v8A.a());
    }

    public JSONObject f() throws JSONException {
        return new a();
    }

    public C8 g() {
        return new C8(this.f38469e, C3191e4.f36344f);
    }

    public boolean k() {
        int i10 = b.f38473a[this.f38467c.ordinal()];
        if (i10 == 1) {
            e();
            a(new C8(this.f38469e, SDKUtils.getFileName(this.f38470f)));
            return false;
        }
        if (i10 == 2) {
            c();
            a(new C8(this.f38469e, SDKUtils.getFileName(this.f38470f)));
            return false;
        }
        if (i10 == 3) {
            try {
                C8 c8G = g();
                C8 c8I = i();
                if (!c8I.exists() && !c8G.exists()) {
                    a(new C8(this.f38469e, SDKUtils.getFileName(this.f38470f)));
                    return false;
                }
                if (!c8I.exists() && c8G.exists()) {
                    EnumC0239d enumC0239d = EnumC0239d.MISSING_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                    this.f38468d = enumC0239d;
                    a(enumC0239d);
                    a(new C8(this.f38469e, c8I.getName()));
                    return true;
                }
                c();
                if (b()) {
                    EnumC0239d enumC0239d2 = EnumC0239d.PREPARED_CONTROLLER_LOADED;
                    this.f38468d = enumC0239d2;
                    a(enumC0239d2);
                    d();
                    a(new C8(this.f38469e, c8I.getName()));
                    return true;
                }
                if (!a()) {
                    a(new C8(this.f38469e, SDKUtils.getFileName(this.f38470f)));
                    return false;
                }
                EnumC0239d enumC0239d3 = EnumC0239d.FAILED_RENAME_PREPARED_CONTROLLER_LOAD_LAST_USED_CONTROLLER;
                this.f38468d = enumC0239d3;
                a(enumC0239d3);
                a(new C8(this.f38469e, c8I.getName()));
                return true;
            } catch (Exception e10) {
                C3422r4.d().a(e10);
            }
        }
        return false;
    }

    public boolean m() {
        return this.f38468d != EnumC0239d.NONE;
    }

    private c a(int i10) {
        return i10 != 1 ? i10 != 2 ? c.FETCH_FROM_SERVER_NO_FALLBACK : c.FETCH_FOR_NEXT_SESSION_LOAD_FROM_LOCAL : c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK;
    }

    private boolean b() throws Exception {
        return IronSourceStorageUtils.renameFile(i().getPath(), g().getPath());
    }

    public void a(Runnable runnable) {
        if (m()) {
            return;
        }
        if (this.f38467c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK) {
            d();
        }
        EnumC0239d enumC0239d = EnumC0239d.CONTROLLER_FROM_SERVER;
        this.f38468d = enumC0239d;
        a(enumC0239d);
        runnable.run();
    }

    public void a(Runnable runnable, Runnable runnable2) {
        if (m()) {
            return;
        }
        if (this.f38467c == c.FETCH_FROM_SERVER_WITH_LOCAL_FALLBACK && a()) {
            EnumC0239d enumC0239d = EnumC0239d.FALLBACK_CONTROLLER_RECOVERY;
            this.f38468d = enumC0239d;
            a(enumC0239d);
            runnable.run();
            return;
        }
        l();
        runnable2.run();
    }

    private void a(C8 c82) {
        if (this.f38471g.c()) {
            return;
        }
        this.f38471g.a(c82, this.f38470f);
    }

    public void a(C3494v8 c3494v8) {
        c3494v8.a(G5.f34451y, Integer.valueOf(this.f38466b));
        A8.a(C3219fe.f36719v, c3494v8.a());
        this.f38465a = System.currentTimeMillis();
    }

    private void a(EnumC0239d enumC0239d) {
        C3494v8 c3494v8A = new C3494v8().a(G5.f34451y, Integer.valueOf(this.f38466b)).a(G5.f34452z, Integer.valueOf(enumC0239d.b()));
        if (this.f38465a > 0) {
            c3494v8A.a(G5.B, Long.valueOf(System.currentTimeMillis() - this.f38465a));
        }
        A8.a(C3219fe.f36720w, c3494v8A.a());
    }

    private boolean a() {
        try {
            if (j()) {
                return IronSourceStorageUtils.renameFile(h().getPath(), g().getPath());
            }
            return false;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            return false;
        }
    }
}

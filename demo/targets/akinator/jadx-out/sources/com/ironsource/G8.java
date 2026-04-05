package com.ironsource;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G8 {

    /* renamed from: a, reason: collision with root package name */
    private final String f34460a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34461b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34462c;

    /* renamed from: d, reason: collision with root package name */
    private final String f34463d;

    /* renamed from: e, reason: collision with root package name */
    private final Drawable f34464e;

    /* renamed from: f, reason: collision with root package name */
    private final WebView f34465f;

    /* renamed from: g, reason: collision with root package name */
    private final View f34466g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final a f34469a;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final String f34470a;

            /* renamed from: b, reason: collision with root package name */
            private final String f34471b;

            /* renamed from: c, reason: collision with root package name */
            private final String f34472c;

            /* renamed from: d, reason: collision with root package name */
            private final String f34473d;

            /* renamed from: e, reason: collision with root package name */
            private final tu.z f34474e;

            /* renamed from: f, reason: collision with root package name */
            private final tu.z f34475f;

            /* renamed from: g, reason: collision with root package name */
            private final View f34476g;

            public a(String str, String str2, String str3, String str4, tu.z zVar, tu.z zVar2, View privacyIcon) {
                kotlin.jvm.internal.e0.checkNotNullParameter(privacyIcon, "privacyIcon");
                this.f34470a = str;
                this.f34471b = str2;
                this.f34472c = str3;
                this.f34473d = str4;
                this.f34474e = zVar;
                this.f34475f = zVar2;
                this.f34476g = privacyIcon;
            }

            public final String a() {
                return this.f34470a;
            }

            public final String b() {
                return this.f34471b;
            }

            public final String c() {
                return this.f34472c;
            }

            public final String d() {
                return this.f34473d;
            }

            public final tu.z e() {
                return this.f34474e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.e0.areEqual(this.f34470a, aVar.f34470a) && kotlin.jvm.internal.e0.areEqual(this.f34471b, aVar.f34471b) && kotlin.jvm.internal.e0.areEqual(this.f34472c, aVar.f34472c) && kotlin.jvm.internal.e0.areEqual(this.f34473d, aVar.f34473d) && kotlin.jvm.internal.e0.areEqual(this.f34474e, aVar.f34474e) && kotlin.jvm.internal.e0.areEqual(this.f34475f, aVar.f34475f) && kotlin.jvm.internal.e0.areEqual(this.f34476g, aVar.f34476g);
            }

            public final tu.z f() {
                return this.f34475f;
            }

            public final View g() {
                return this.f34476g;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final G8 h() {
                Drawable drawable;
                String str = this.f34470a;
                String str2 = this.f34471b;
                String str3 = this.f34472c;
                String str4 = this.f34473d;
                tu.z zVar = this.f34474e;
                if (zVar != null) {
                    Object objM7139unboximpl = zVar.m7139unboximpl();
                    if (tu.z.m7136isFailureimpl(objM7139unboximpl)) {
                        objM7139unboximpl = null;
                    }
                    drawable = (Drawable) objM7139unboximpl;
                } else {
                    drawable = null;
                }
                tu.z zVar2 = this.f34475f;
                if (zVar2 != null) {
                    Object objM7139unboximpl2 = zVar2.m7139unboximpl();
                    webView = tu.z.m7136isFailureimpl(objM7139unboximpl2) ? null : objM7139unboximpl2;
                }
                return new G8(str, str2, str3, str4, drawable, webView, this.f34476g);
            }

            public int hashCode() {
                String str = this.f34470a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f34471b;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f34472c;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.f34473d;
                int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                tu.z zVar = this.f34474e;
                int iM7135hashCodeimpl = (iHashCode4 + (zVar == null ? 0 : tu.z.m7135hashCodeimpl(zVar.m7139unboximpl()))) * 31;
                tu.z zVar2 = this.f34475f;
                return this.f34476g.hashCode() + ((iM7135hashCodeimpl + (zVar2 != null ? tu.z.m7135hashCodeimpl(zVar2.m7139unboximpl()) : 0)) * 31);
            }

            public final String i() {
                return this.f34471b;
            }

            public final String j() {
                return this.f34472c;
            }

            public final String k() {
                return this.f34473d;
            }

            public final tu.z l() {
                return this.f34474e;
            }

            public final tu.z m() {
                return this.f34475f;
            }

            public final View n() {
                return this.f34476g;
            }

            public final String o() {
                return this.f34470a;
            }

            public String toString() {
                String str = this.f34470a;
                String str2 = this.f34471b;
                String str3 = this.f34472c;
                String str4 = this.f34473d;
                tu.z zVar = this.f34474e;
                tu.z zVar2 = this.f34475f;
                View view = this.f34476g;
                StringBuilder sbB = b3.h.b("Data(title=", str, ", advertiser=", str2, ", body=");
                com.google.android.gms.internal.play_billing.a.B(sbB, str3, ", cta=", str4, ", icon=");
                sbB.append(zVar);
                sbB.append(", media=");
                sbB.append(zVar2);
                sbB.append(", privacyIcon=");
                sbB.append(view);
                sbB.append(")");
                return sbB.toString();
            }

            public final a a(String str, String str2, String str3, String str4, tu.z zVar, tu.z zVar2, View privacyIcon) {
                kotlin.jvm.internal.e0.checkNotNullParameter(privacyIcon, "privacyIcon");
                return new a(str, str2, str3, str4, zVar, zVar2, privacyIcon);
            }

            public static /* synthetic */ a a(a aVar, String str, String str2, String str3, String str4, tu.z zVar, tu.z zVar2, View view, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f34470a;
                }
                if ((i10 & 2) != 0) {
                    str2 = aVar.f34471b;
                }
                if ((i10 & 4) != 0) {
                    str3 = aVar.f34472c;
                }
                if ((i10 & 8) != 0) {
                    str4 = aVar.f34473d;
                }
                if ((i10 & 16) != 0) {
                    zVar = aVar.f34474e;
                }
                if ((i10 & 32) != 0) {
                    zVar2 = aVar.f34475f;
                }
                if ((i10 & 64) != 0) {
                    view = aVar.f34476g;
                }
                tu.z zVar3 = zVar2;
                View view2 = view;
                tu.z zVar4 = zVar;
                String str5 = str3;
                return aVar.a(str, str2, str5, str4, zVar4, zVar3, view2);
            }
        }

        public b(a data) {
            kotlin.jvm.internal.e0.checkNotNullParameter(data, "data");
            this.f34469a = data;
        }

        public final a a() {
            return this.f34469a;
        }

        public final JSONObject b() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            if (this.f34469a.o() != null) {
                a(jSONObject, "title");
            }
            if (this.f34469a.i() != null) {
                a(jSONObject, C3191e4.h.F0);
            }
            if (this.f34469a.j() != null) {
                a(jSONObject, "body");
            }
            if (this.f34469a.k() != null) {
                a(jSONObject, C3191e4.h.G0);
            }
            tu.z zVarL = this.f34469a.l();
            if (zVarL != null) {
                a(jSONObject, "icon", zVarL.m7139unboximpl());
            }
            tu.z zVarM = this.f34469a.m();
            if (zVarM != null) {
                a(jSONObject, "media", zVarM.m7139unboximpl());
            }
            return jSONObject;
        }

        private static final void a(JSONObject jSONObject, String str) throws JSONException {
            jSONObject.put(str, new JSONObject().put(SFPXhf.QOFsQP, true));
        }

        private static final <T> void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("success", tu.z.m7137isSuccessimpl(obj));
            Throwable thM7134exceptionOrNullimpl = tu.z.m7134exceptionOrNullimpl(obj);
            if (thM7134exceptionOrNullimpl != null) {
                String message = thM7134exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown reason";
                }
                jSONObject2.put("reason", message);
            }
            jSONObject.put(str, jSONObject2);
        }
    }

    public G8(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        kotlin.jvm.internal.e0.checkNotNullParameter(privacyIcon, "privacyIcon");
        this.f34460a = str;
        this.f34461b = str2;
        this.f34462c = str3;
        this.f34463d = str4;
        this.f34464e = drawable;
        this.f34465f = webView;
        this.f34466g = privacyIcon;
    }

    public final String a() {
        return this.f34460a;
    }

    public final String b() {
        return this.f34461b;
    }

    public final String c() {
        return this.f34462c;
    }

    public final String d() {
        return this.f34463d;
    }

    public final Drawable e() {
        return this.f34464e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G8)) {
            return false;
        }
        G8 g8 = (G8) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f34460a, g8.f34460a) && kotlin.jvm.internal.e0.areEqual(this.f34461b, g8.f34461b) && kotlin.jvm.internal.e0.areEqual(this.f34462c, g8.f34462c) && kotlin.jvm.internal.e0.areEqual(this.f34463d, g8.f34463d) && kotlin.jvm.internal.e0.areEqual(this.f34464e, g8.f34464e) && kotlin.jvm.internal.e0.areEqual(this.f34465f, g8.f34465f) && kotlin.jvm.internal.e0.areEqual(this.f34466g, g8.f34466g);
    }

    public final WebView f() {
        return this.f34465f;
    }

    public final View g() {
        return this.f34466g;
    }

    public final String h() {
        return this.f34461b;
    }

    public int hashCode() {
        String str = this.f34460a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f34461b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f34462c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f34463d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Drawable drawable = this.f34464e;
        int iHashCode5 = (iHashCode4 + (drawable == null ? 0 : drawable.hashCode())) * 31;
        WebView webView = this.f34465f;
        return this.f34466g.hashCode() + ((iHashCode5 + (webView != null ? webView.hashCode() : 0)) * 31);
    }

    public final String i() {
        return this.f34462c;
    }

    public final String j() {
        return this.f34463d;
    }

    public final Drawable k() {
        return this.f34464e;
    }

    public final WebView l() {
        return this.f34465f;
    }

    public final View m() {
        return this.f34466g;
    }

    public final String n() {
        return this.f34460a;
    }

    public String toString() {
        String str = this.f34460a;
        String str2 = this.f34461b;
        String str3 = this.f34462c;
        String str4 = this.f34463d;
        Drawable drawable = this.f34464e;
        WebView webView = this.f34465f;
        View view = this.f34466g;
        StringBuilder sbB = b3.h.b("ISNNativeAdData(title=", str, ", advertiser=", str2, ", body=");
        com.google.android.gms.internal.play_billing.a.B(sbB, str3, ", cta=", str4, ", icon=");
        sbB.append(drawable);
        sbB.append(", mediaView=");
        sbB.append(webView);
        sbB.append(", privacyIcon=");
        sbB.append(view);
        sbB.append(")");
        return sbB.toString();
    }

    public final G8 a(String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View privacyIcon) {
        kotlin.jvm.internal.e0.checkNotNullParameter(privacyIcon, "privacyIcon");
        return new G8(str, str2, str3, str4, drawable, webView, privacyIcon);
    }

    public static /* synthetic */ G8 a(G8 g8, String str, String str2, String str3, String str4, Drawable drawable, WebView webView, View view, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = g8.f34460a;
        }
        if ((i10 & 2) != 0) {
            str2 = g8.f34461b;
        }
        if ((i10 & 4) != 0) {
            str3 = g8.f34462c;
        }
        if ((i10 & 8) != 0) {
            str4 = g8.f34463d;
        }
        if ((i10 & 16) != 0) {
            drawable = g8.f34464e;
        }
        if ((i10 & 32) != 0) {
            webView = g8.f34465f;
        }
        if ((i10 & 64) != 0) {
            view = g8.f34466g;
        }
        WebView webView2 = webView;
        View view2 = view;
        Drawable drawable2 = drawable;
        String str5 = str3;
        return g8.a(str, str2, str5, str4, drawable2, webView2, view2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final X8 f34467a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3116a1 f34468b;

        public a(X8 imageLoader, InterfaceC3116a1 adViewManagement) {
            kotlin.jvm.internal.e0.checkNotNullParameter(imageLoader, "imageLoader");
            kotlin.jvm.internal.e0.checkNotNullParameter(adViewManagement, "adViewManagement");
            this.f34467a = imageLoader;
            this.f34468b = adViewManagement;
        }

        private final tu.z b(String str) {
            if (str == null) {
                return null;
            }
            return tu.z.m7130boximpl(this.f34467a.a(str));
        }

        public final b a(Context activityContext, JSONObject json) {
            kotlin.jvm.internal.e0.checkNotNullParameter(activityContext, "activityContext");
            kotlin.jvm.internal.e0.checkNotNullParameter(json, "json");
            JSONObject jSONObjectOptJSONObject = json.optJSONObject("title");
            String strB = jSONObjectOptJSONObject != null ? H8.b(jSONObjectOptJSONObject, "text") : null;
            JSONObject jSONObjectOptJSONObject2 = json.optJSONObject(C3191e4.h.F0);
            String strB2 = jSONObjectOptJSONObject2 != null ? H8.b(jSONObjectOptJSONObject2, "text") : null;
            JSONObject jSONObjectOptJSONObject3 = json.optJSONObject("body");
            String strB3 = jSONObjectOptJSONObject3 != null ? H8.b(jSONObjectOptJSONObject3, "text") : null;
            JSONObject jSONObjectOptJSONObject4 = json.optJSONObject(C3191e4.h.G0);
            String strB4 = jSONObjectOptJSONObject4 != null ? H8.b(jSONObjectOptJSONObject4, "text") : null;
            JSONObject jSONObjectOptJSONObject5 = json.optJSONObject("icon");
            String strB5 = jSONObjectOptJSONObject5 != null ? H8.b(jSONObjectOptJSONObject5, "url") : null;
            JSONObject jSONObjectOptJSONObject6 = json.optJSONObject("media");
            String strB6 = jSONObjectOptJSONObject6 != null ? H8.b(jSONObjectOptJSONObject6, "adViewId") : null;
            JSONObject jSONObjectOptJSONObject7 = json.optJSONObject(C3191e4.h.J0);
            return new b(new b.a(strB, strB2, strB3, strB4, b(strB5), a(strB6), C3499vd.f39129a.a(activityContext, jSONObjectOptJSONObject7 != null ? H8.b(jSONObjectOptJSONObject7, "url") : null, this.f34467a)));
        }

        private final tu.z a(String str) {
            if (str == null) {
                return null;
            }
            K8 k8A = this.f34468b.a(str);
            WebView presentingView = k8A != null ? k8A.getPresentingView() : null;
            if (presentingView == null) {
                int i10 = tu.z.f87419c;
                return tu.z.m7130boximpl(tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception(a.b.l("missing adview for id: '", str, "'")))));
            }
            return tu.z.m7130boximpl(tu.z.m7131constructorimpl(presentingView));
        }
    }
}

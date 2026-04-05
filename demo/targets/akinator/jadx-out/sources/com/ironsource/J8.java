package com.ironsource;

import android.view.View;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.ironsource.C3191e4;
import com.ironsource.F8;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J8 {

    /* renamed from: a, reason: collision with root package name */
    private F8 f34689a;

    /* renamed from: b, reason: collision with root package name */
    private View f34690b;

    /* renamed from: c, reason: collision with root package name */
    private View f34691c;

    /* renamed from: d, reason: collision with root package name */
    private View f34692d;

    /* renamed from: e, reason: collision with root package name */
    private View f34693e;

    /* renamed from: f, reason: collision with root package name */
    private View f34694f;

    /* renamed from: g, reason: collision with root package name */
    private View f34695g;

    /* renamed from: h, reason: collision with root package name */
    private View f34696h;

    /* renamed from: i, reason: collision with root package name */
    private a f34697i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(b bVar);

        void a(rg rgVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum b {
        Title("title"),
        Advertiser(C3191e4.h.F0),
        Body("body"),
        Cta(C3191e4.h.G0),
        Icon("icon"),
        Container("container"),
        PrivacyIcon(C3191e4.h.J0);


        /* renamed from: a, reason: collision with root package name */
        private final String f34706a;

        b(String str) {
            this.f34706a = str;
        }

        public final String b() {
            return this.f34706a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements F8.a {
        public c() {
        }

        @Override // com.ironsource.F8.a
        public void a(rg viewVisibilityParams) {
            kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            a aVarN = J8.this.n();
            if (aVarN != null) {
                aVarN.a(viewVisibilityParams);
            }
        }
    }

    public J8(F8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.e0.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.f34689a = containerView;
        this.f34690b = view;
        this.f34691c = view2;
        this.f34692d = view3;
        this.f34693e = view4;
        this.f34694f = view5;
        this.f34695g = view6;
        this.f34696h = privacyIconView;
        r();
        s();
    }

    private final void r() {
        a(this, this.f34690b, b.Title);
        a(this, this.f34691c, b.Advertiser);
        a(this, this.f34693e, b.Body);
        a(this, this.f34695g, b.Cta);
        a(this, this.f34692d, b.Icon);
        a(this, this.f34689a, b.Container);
        a(this, this.f34696h, b.PrivacyIcon);
    }

    private final void s() {
        this.f34689a.setListener$mediationsdk_release(new c());
    }

    public final F8 a() {
        return this.f34689a;
    }

    public final View c() {
        return this.f34691c;
    }

    public final View d() {
        return this.f34692d;
    }

    public final View e() {
        return this.f34693e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J8)) {
            return false;
        }
        J8 j82 = (J8) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f34689a, j82.f34689a) && kotlin.jvm.internal.e0.areEqual(this.f34690b, j82.f34690b) && kotlin.jvm.internal.e0.areEqual(this.f34691c, j82.f34691c) && kotlin.jvm.internal.e0.areEqual(this.f34692d, j82.f34692d) && kotlin.jvm.internal.e0.areEqual(this.f34693e, j82.f34693e) && kotlin.jvm.internal.e0.areEqual(this.f34694f, j82.f34694f) && kotlin.jvm.internal.e0.areEqual(this.f34695g, j82.f34695g) && kotlin.jvm.internal.e0.areEqual(this.f34696h, j82.f34696h);
    }

    public final View f() {
        return this.f34694f;
    }

    public final View g() {
        return this.f34695g;
    }

    public final View h() {
        return this.f34696h;
    }

    public int hashCode() {
        int iHashCode = this.f34689a.hashCode() * 31;
        View view = this.f34690b;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        View view2 = this.f34691c;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        View view3 = this.f34692d;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        View view4 = this.f34693e;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        View view5 = this.f34694f;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        View view6 = this.f34695g;
        return this.f34696h.hashCode() + ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31);
    }

    public final View i() {
        return this.f34691c;
    }

    public final View j() {
        return this.f34693e;
    }

    public final F8 k() {
        return this.f34689a;
    }

    public final View l() {
        return this.f34695g;
    }

    public final View m() {
        return this.f34692d;
    }

    public final a n() {
        return this.f34697i;
    }

    public final View o() {
        return this.f34694f;
    }

    public final View p() {
        return this.f34696h;
    }

    public final View q() {
        return this.f34690b;
    }

    public String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.f34689a + ", titleView=" + this.f34690b + ", advertiserView=" + this.f34691c + ", iconView=" + this.f34692d + ", bodyView=" + this.f34693e + ", mediaView=" + this.f34694f + ", ctaView=" + this.f34695g + ", privacyIconView=" + this.f34696h + ")";
    }

    public final J8 a(F8 containerView, View view, View view2, View view3, View view4, View view5, View view6, View privacyIconView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.e0.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new J8(containerView, view, view2, view3, view4, view5, view6, privacyIconView);
    }

    public final View b() {
        return this.f34690b;
    }

    public final void c(View view) {
        this.f34695g = view;
    }

    public final void d(View view) {
        this.f34692d = view;
    }

    public final void e(View view) {
        this.f34694f = view;
    }

    public final void f(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "<set-?>");
        this.f34696h = view;
    }

    public final void g(View view) {
        this.f34690b = view;
    }

    public final JSONObject t() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("title", this.f34690b != null).put(C3191e4.h.F0, this.f34691c != null).put("body", this.f34693e != null).put(C3191e4.h.G0, this.f34695g != null).put("media", this.f34694f != null).put(PtLatqAYjEFT.MgyvVUI, this.f34692d != null);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut;
    }

    public static /* synthetic */ J8 a(J8 j82, F8 f82, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f82 = j82.f34689a;
        }
        if ((i10 & 2) != 0) {
            view = j82.f34690b;
        }
        if ((i10 & 4) != 0) {
            view2 = j82.f34691c;
        }
        if ((i10 & 8) != 0) {
            view3 = j82.f34692d;
        }
        if ((i10 & 16) != 0) {
            view4 = j82.f34693e;
        }
        if ((i10 & 32) != 0) {
            view5 = j82.f34694f;
        }
        if ((i10 & 64) != 0) {
            view6 = j82.f34695g;
        }
        if ((i10 & 128) != 0) {
            view7 = j82.f34696h;
        }
        View view8 = view6;
        View view9 = view7;
        View view10 = view4;
        View view11 = view5;
        return j82.a(f82, view, view2, view3, view10, view11, view8, view9);
    }

    public final void b(View view) {
        this.f34693e = view;
    }

    public final void a(F8 f82) {
        kotlin.jvm.internal.e0.checkNotNullParameter(f82, "<set-?>");
        this.f34689a = f82;
    }

    public final void a(View view) {
        this.f34691c = view;
    }

    public final void a(a aVar) {
        this.f34697i = aVar;
    }

    private static final void a(final J8 j82, View view, final b bVar) {
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.ironsource.ih
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    J8.a(this.f36954b, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(J8 this$0, b viewName, View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewName, "$viewName");
        a aVar = this$0.f34697i;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ J8(F8 f82, View view, View view2, View view3, View view4, View view5, View view6, View view7, int i10, kotlin.jvm.internal.u uVar) {
        View view8;
        View view9;
        view = (i10 & 2) != 0 ? null : view;
        view2 = (i10 & 4) != 0 ? null : view2;
        view3 = (i10 & 8) != 0 ? null : view3;
        view4 = (i10 & 16) != 0 ? null : view4;
        view5 = (i10 & 32) != 0 ? null : view5;
        if ((i10 & 64) != 0) {
            view8 = view7;
            view9 = null;
        } else {
            view8 = view7;
            view9 = view6;
        }
        this(f82, view, view2, view3, view4, view5, view9, view8);
    }
}

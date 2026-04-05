package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.Map;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class U5 extends AbstractC3062wf {

    /* renamed from: e, reason: collision with root package name */
    public final Fc f32347e;

    /* renamed from: f, reason: collision with root package name */
    public final Y4 f32348f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f32349g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32350h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(Fc container, Fc renderView, Y4 htmlAdTracker, F5 f52) {
        super(container);
        kotlin.jvm.internal.e0.checkNotNullParameter(container, "container");
        kotlin.jvm.internal.e0.checkNotNullParameter(renderView, "renderView");
        kotlin.jvm.internal.e0.checkNotNullParameter(htmlAdTracker, "htmlAdTracker");
        this.f32347e = renderView;
        this.f32348f = htmlAdTracker;
        this.f32349g = f52;
        this.f32350h = "U5";
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(byte b10) {
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View d() {
        this.f33553c = new WeakReference(this.f32347e);
        return this.f32347e;
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void e() {
        F5 f52 = this.f32349g;
        if (f52 != null) {
            String TAG = this.f32350h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "stopTrackingForImpression");
        }
        F5 f53 = this.f32349g;
        if (f53 != null) {
            String TAG2 = this.f32350h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
            ((G5) f53).a(TAG2, "stopTrackingForVisibility");
        }
        Y4 y42 = this.f32348f;
        View viewB = b();
        if (viewB == null) {
            return;
        }
        y42.b(viewB);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final View a(View view, ViewGroup parent, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(parent, "parent");
        return d();
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Map map) {
        View viewB;
        F5 f52 = this.f32349g;
        if (f52 != null) {
            String str = this.f32350h;
            StringBuilder sbA = N6.a(str, "TAG", "startTrackingForImpression with ");
            sbA.append(map != null ? Integer.valueOf(map.size()) : null);
            sbA.append(" friendly views");
            ((G5) f52).a(str, sbA.toString());
        }
        this.f32347e.setFriendlyViews(map);
        F5 f53 = this.f32349g;
        if (f53 != null) {
            String TAG = this.f32350h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f53).a(TAG, "startTrackingVisibility");
        }
        InterfaceC3063x interfaceC3063x = this.f33551a;
        Fc fc2 = interfaceC3063x instanceof Fc ? (Fc) interfaceC3063x : null;
        if (fc2 == null) {
            return;
        }
        Y4 y42 = this.f32348f;
        View viewB2 = b();
        if (viewB2 == null || (viewB = b()) == null) {
            return;
        }
        y42.a(viewB2, viewB, fc2.getVISIBILITY_CHANGE_LISTENER(), this.f33554d.getViewability(), true);
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView, FriendlyObstructionPurpose obstructionCode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        kotlin.jvm.internal.e0.checkNotNullParameter(obstructionCode, "obstructionCode");
        F5 f52 = this.f32349g;
        if (f52 != null) {
            String TAG = this.f32350h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
            ((G5) f52).a(TAG, "addFriendlyView - childView: " + childView + ", obstructionCode: " + obstructionCode);
        }
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f32347e.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.put(childView, obstructionCode);
        }
        J exposureTracker = this.f32347e.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.a(childView);
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(View childView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(childView, "childView");
        Map<View, FriendlyObstructionPurpose> friendlyViews = this.f32347e.getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.remove(childView);
        }
        J exposureTracker = this.f32347e.getExposureTracker();
        if (exposureTracker != null) {
            exposureTracker.b(childView);
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a(Context context, byte b10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        F5 f52 = this.f32349g;
        if (f52 != null) {
            String str = this.f32350h;
            ((G5) f52).a(str, AbstractC2803h9.a(str, "TAG", "onActivityStateChanged - state - ", b10));
        }
        try {
            if (b10 == 0) {
                Y4 y42 = this.f32348f;
                F5 f53 = y42.f32558f;
                if (f53 != null) {
                    ((G5) f53).c("HtmlAdTracker", "onActivityStarted");
                }
                C2883m5 c2883m5 = y42.f32559g;
                if (c2883m5 != null) {
                    String TAG = c2883m5.f33083d;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG, "TAG");
                    for (Map.Entry entry : c2883m5.f33080a.entrySet()) {
                        View view = (View) entry.getKey();
                        C2849k5 c2849k5 = (C2849k5) entry.getValue();
                        c2883m5.f33082c.a(view, c2849k5.f33007a, c2849k5.f33008b);
                    }
                    if (!c2883m5.f33084e.hasMessages(0)) {
                        c2883m5.f33084e.postDelayed(c2883m5.f33085f, c2883m5.f33086g);
                    }
                    c2883m5.f33082c.f();
                }
                C2731d5 c2731d5 = y42.f32560h;
                if (c2731d5 != null) {
                    c2731d5.f();
                    return;
                }
                return;
            }
            if (b10 == 1) {
                Y4 y43 = this.f32348f;
                F5 f54 = y43.f32558f;
                if (f54 != null) {
                    ((G5) f54).c("HtmlAdTracker", "onActivityStopped");
                }
                C2883m5 c2883m52 = y43.f32559g;
                if (c2883m52 != null) {
                    String TAG2 = c2883m52.f33083d;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG2, "TAG");
                    c2883m52.f33082c.a();
                    c2883m52.f33084e.removeCallbacksAndMessages(null);
                    c2883m52.f33081b.clear();
                }
                C2731d5 c2731d52 = y43.f32560h;
                if (c2731d52 != null) {
                    c2731d52.e();
                    return;
                }
                return;
            }
            if (b10 == 2) {
                Y4 y44 = this.f32348f;
                F5 f55 = y44.f32558f;
                if (f55 != null) {
                    ((G5) f55).c("HtmlAdTracker", "onActivityDestroyed");
                }
                C2883m5 c2883m53 = y44.f32559g;
                if (c2883m53 != null) {
                    c2883m53.f33080a.clear();
                    c2883m53.f33081b.clear();
                    c2883m53.f33082c.a();
                    c2883m53.f33084e.removeMessages(0);
                    c2883m53.f33082c.b();
                }
                y44.f32559g = null;
                C2731d5 c2731d53 = y44.f32560h;
                if (c2731d53 != null) {
                    c2731d53.b();
                }
                y44.f32560h = null;
                return;
            }
            String TAG3 = this.f32350h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(TAG3, "TAG");
        } catch (Exception e10) {
            F5 f56 = this.f32349g;
            if (f56 != null) {
                String str2 = this.f32350h;
                ((G5) f56).b(str2, Qf.a(e10, N6.a(str2, "TAG", "Exception in onActivityStateChanged with message : ")));
            }
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.inmobi.media.AbstractC3062wf
    public final void a() {
        F5 f52 = this.f32349g;
        String str = VPCjETNfjxu.akpNZwVIkl;
        if (f52 != null) {
            String str2 = this.f32350h;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str2, str);
            ((G5) f52).a(str2, "destroy");
        }
        if (b() != null) {
            F5 f53 = this.f32349g;
            if (f53 != null) {
                String str3 = this.f32350h;
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, str);
                ((G5) f53).a(str3, "stopTrackingForVisibility");
            }
            Y4 y42 = this.f32348f;
            View viewB = b();
            if (viewB != null) {
                y42.b(viewB);
            }
        }
        super.a();
    }
}

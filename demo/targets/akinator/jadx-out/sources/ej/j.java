package ej;

import android.R;
import android.app.Activity;
import android.app.Application;
import bj.b1;
import bj.w0;
import com.google.firebase.inappmessaging.display.FiamListener;
import com.google.firebase.inappmessaging.model.MessageType;
import hj.n;
import hj.q;
import hj.s;
import hj.t;
import hj.w;
import java.util.Map;
import rj.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j extends q {

    /* renamed from: b, reason: collision with root package name */
    public final w0 f54424b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f54425c;

    /* renamed from: e, reason: collision with root package name */
    public final hj.j f54426e;

    /* renamed from: f, reason: collision with root package name */
    public final w f54427f;

    /* renamed from: g, reason: collision with root package name */
    public final w f54428g;

    /* renamed from: h, reason: collision with root package name */
    public final n f54429h;

    /* renamed from: i, reason: collision with root package name */
    public final hj.a f54430i;

    /* renamed from: j, reason: collision with root package name */
    public final Application f54431j;

    /* renamed from: k, reason: collision with root package name */
    public final hj.g f54432k;

    /* renamed from: l, reason: collision with root package name */
    public FiamListener f54433l;

    /* renamed from: m, reason: collision with root package name */
    public o f54434m;

    /* renamed from: n, reason: collision with root package name */
    public b1 f54435n;

    /* renamed from: o, reason: collision with root package name */
    public String f54436o;

    public j(w0 w0Var, Map map, hj.j jVar, w wVar, w wVar2, n nVar, Application application, hj.a aVar, hj.g gVar) {
        this.f54424b = w0Var;
        this.f54425c = map;
        this.f54426e = jVar;
        this.f54427f = wVar;
        this.f54428g = wVar2;
        this.f54429h = nVar;
        this.f54431j = application;
        this.f54430i = aVar;
        this.f54432k = gVar;
    }

    public static void a(j jVar, Activity activity) {
        t.logd("Dismissing fiam");
        FiamListener fiamListener = jVar.f54433l;
        if (fiamListener != null) {
            fiamListener.onFiamDismiss();
        }
        jVar.b(activity);
        jVar.f54434m = null;
        jVar.f54435n = null;
    }

    public static j getInstance() {
        return (j) com.google.firebase.g.getInstance().get(j.class);
    }

    public final void b(Activity activity) {
        n nVar = this.f54429h;
        if (nVar.isFiamDisplayed()) {
            this.f54426e.cancelTag(activity.getClass());
            nVar.destroy(activity);
            this.f54427f.cancel();
            this.f54428g.cancel();
        }
    }

    public final void c(Activity activity) {
        ij.c cVarCreateBannerBindingWrapper;
        if (this.f54434m == null || this.f54424b.areMessagesSuppressed()) {
            t.loge("No active message found to render");
            return;
        }
        if (this.f54434m.getMessageType().equals(MessageType.UNSUPPORTED)) {
            t.loge("The message being triggered is not supported by this version of the sdk.");
            return;
        }
        FiamListener fiamListener = this.f54433l;
        if (fiamListener != null) {
            fiamListener.onFiamTrigger();
        }
        s sVar = (s) ((ru.a) this.f54425c.get(kj.h.configFor(this.f54434m.getMessageType(), this.f54431j.getResources().getConfiguration().orientation))).get();
        int i10 = i.f54423a[this.f54434m.getMessageType().ordinal()];
        hj.a aVar = this.f54430i;
        if (i10 == 1) {
            cVarCreateBannerBindingWrapper = aVar.createBannerBindingWrapper(sVar, this.f54434m);
        } else if (i10 == 2) {
            cVarCreateBannerBindingWrapper = aVar.createModalBindingWrapper(sVar, this.f54434m);
        } else if (i10 == 3) {
            cVarCreateBannerBindingWrapper = aVar.createImageBindingWrapper(sVar, this.f54434m);
        } else {
            if (i10 != 4) {
                t.loge("No bindings found for this message type");
                return;
            }
            cVarCreateBannerBindingWrapper = aVar.createCardBindingWrapper(sVar, this.f54434m);
        }
        activity.findViewById(R.id.content).post(new a(this, activity, cVarCreateBannerBindingWrapper));
    }

    public void clearFiamListener() {
        this.f54433l = null;
    }

    @Override // hj.q, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        String str = this.f54436o;
        w0 w0Var = this.f54424b;
        if (str != null && str.equals(activity.getLocalClassName())) {
            t.logi("Unbinding from activity: " + activity.getLocalClassName());
            w0Var.clearDisplayListener();
            b(activity);
            this.f54436o = null;
        }
        w0Var.removeAllListeners();
        super.onActivityPaused(activity);
    }

    @Override // hj.q, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        String str = this.f54436o;
        if (str == null || !str.equals(activity.getLocalClassName())) {
            t.logi("Binding to activity: " + activity.getLocalClassName());
            this.f54424b.setMessageDisplayComponent(new ao.n(13, this, activity));
            this.f54436o = activity.getLocalClassName();
        }
        if (this.f54434m != null) {
            c(activity);
        }
    }

    public void setFiamListener(FiamListener fiamListener) {
        this.f54433l = fiamListener;
    }

    public void testMessage(Activity activity, o oVar, b1 b1Var) {
        this.f54434m = oVar;
        this.f54435n = b1Var;
        c(activity);
    }
}

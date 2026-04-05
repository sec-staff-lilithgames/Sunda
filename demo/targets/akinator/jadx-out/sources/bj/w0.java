package bj;

import com.google.firebase.inappmessaging.FirebaseInAppMessagingDisplay;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final nj.j f9673a;

    /* renamed from: b, reason: collision with root package name */
    public final nj.l f9674b;

    /* renamed from: c, reason: collision with root package name */
    public final nj.k f9675c;

    /* renamed from: d, reason: collision with root package name */
    public final nj.p0 f9676d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9677e = false;

    /* renamed from: f, reason: collision with root package name */
    public FirebaseInAppMessagingDisplay f9678f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f9679g;

    public w0(nj.g0 g0Var, nj.p0 p0Var, nj.j jVar, tj.f fVar, nj.l lVar, nj.k kVar, Executor executor) {
        this.f9676d = p0Var;
        this.f9673a = jVar;
        this.f9674b = lVar;
        this.f9675c = kVar;
        this.f9679g = executor;
        ((tj.e) fVar).getId().addOnSuccessListener(executor, new a2.o(16));
        g0Var.createFirebaseInAppMessageStream().subscribe(new v0(this, 0));
    }

    public static w0 getInstance() {
        return (w0) com.google.firebase.g.getInstance().get(w0.class);
    }

    public void addClickListener(x0 x0Var) {
        this.f9675c.addClickListener(x0Var);
    }

    public void addDismissListener(y0 y0Var) {
        this.f9675c.addDismissListener(y0Var);
    }

    public void addDisplayErrorListener(c1 c1Var) {
        this.f9675c.addDisplayErrorListener(c1Var);
    }

    public void addImpressionListener(d1 d1Var) {
        this.f9675c.addImpressionListener(d1Var);
    }

    public boolean areMessagesSuppressed() {
        return this.f9677e;
    }

    public void clearDisplayListener() {
        nj.j0.logi("Removing display event component");
        this.f9678f = null;
    }

    public boolean isAutomaticDataCollectionEnabled() {
        return this.f9673a.isAutomaticDataCollectionEnabled();
    }

    public void removeAllListeners() {
        this.f9675c.removeAllListeners();
    }

    public void removeClickListener(x0 x0Var) {
        this.f9675c.removeClickListener(x0Var);
    }

    public void removeDismissListener(y0 y0Var) {
        this.f9675c.removeDismissListener(y0Var);
    }

    public void removeDisplayErrorListener(c1 c1Var) {
        this.f9675c.removeDisplayErrorListener(c1Var);
    }

    public void removeImpressionListener(d1 d1Var) {
        this.f9675c.removeImpressionListener(d1Var);
    }

    public void setAutomaticDataCollectionEnabled(Boolean bool) {
        this.f9673a.setAutomaticDataCollectionEnabled(bool);
    }

    public void setMessageDisplayComponent(FirebaseInAppMessagingDisplay firebaseInAppMessagingDisplay) {
        nj.j0.logi("Setting display event component");
        this.f9678f = firebaseInAppMessagingDisplay;
    }

    public void setMessagesSuppressed(Boolean bool) {
        this.f9677e = bool.booleanValue();
    }

    public void triggerEvent(String str) {
        this.f9676d.triggerEvent(str);
    }

    public void addClickListener(x0 x0Var, Executor executor) {
        this.f9675c.addClickListener(x0Var, executor);
    }

    public void addDismissListener(y0 y0Var, Executor executor) {
        this.f9675c.addDismissListener(y0Var, executor);
    }

    public void addDisplayErrorListener(c1 c1Var, Executor executor) {
        this.f9675c.addDisplayErrorListener(c1Var, executor);
    }

    public void addImpressionListener(d1 d1Var, Executor executor) {
        this.f9675c.addImpressionListener(d1Var, executor);
    }

    public void setAutomaticDataCollectionEnabled(boolean z10) {
        this.f9673a.setAutomaticDataCollectionEnabled(z10);
    }
}

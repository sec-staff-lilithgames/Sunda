package dq;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.List;
import yq.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final br.e f52475a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f52476b;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f52477c;

    public i(Context context, vq.b repository, br.e adPhaseParams) {
        q0 q0VarA;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(repository, "repository");
        kotlin.jvm.internal.e0.checkNotNullParameter(adPhaseParams, "adPhaseParams");
        this.f52475a = adPhaseParams;
        br.p background = adPhaseParams.getBackground();
        if (background != null) {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            q0VarA = a.a(background, applicationContext, repository);
        } else {
            q0VarA = null;
        }
        this.f52476b = q0VarA;
    }

    public final boolean a(ViewGroup rootContainer, List<? extends h> ads, List<? extends h> controls) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rootContainer, "rootContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(ads, "ads");
        kotlin.jvm.internal.e0.checkNotNullParameter(controls, "controls");
        Context context = rootContainer.getContext();
        a();
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(cr.q.generateViewId());
        q0 q0Var = this.f52476b;
        if (q0Var != null) {
            q0.a(q0Var, frameLayout, (Integer) null, (br.t) null, 6, (Object) null);
        } else {
            ir.x.setBackgroundColorSafely(frameLayout, this.f52475a.getBackgroundColor());
        }
        this.f52477c = frameLayout;
        yq.j jVar = new yq.j(context);
        for (h hVar : ads) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
            a(context, rootContainer, jVar, ads, hVar);
        }
        FrameLayout frameLayout2 = this.f52477c;
        if (frameLayout2 != null) {
            frameLayout2.addView(jVar, ir.t.createMatchParentParams());
        }
        yq.j jVar2 = new yq.j(context);
        for (h hVar2 : controls) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "context");
            a(context, rootContainer, jVar2, controls, hVar2);
        }
        FrameLayout frameLayout3 = this.f52477c;
        if (frameLayout3 != null) {
            frameLayout3.addView(jVar2, ir.t.createMatchParentParams());
        }
        rootContainer.addView(this.f52477c, 0, ir.t.createMatchParentParams());
        return true;
    }

    public final br.e b() {
        return this.f52475a;
    }

    public final ViewGroup c() {
        return this.f52477c;
    }

    public final void a() {
        FrameLayout frameLayout = this.f52477c;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            ir.x.removeFromParent(frameLayout);
        }
        this.f52477c = null;
    }

    public final void a(Context context, ViewGroup rootContainer, yq.j elementsContainer, List<? extends h> adElements, h adElement) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(rootContainer, "rootContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(elementsContainer, "elementsContainer");
        kotlin.jvm.internal.e0.checkNotNullParameter(adElements, "adElements");
        kotlin.jvm.internal.e0.checkNotNullParameter(adElement, "adElement");
        View viewJ = adElement.j();
        if (viewJ == null) {
            return;
        }
        br.g0 elementLayoutParams = adElement.h().getElementLayoutParams();
        int widthPx = elementLayoutParams.getWidthPx(context);
        int heightPx = elementLayoutParams.getHeightPx(context);
        if (widthPx <= 0) {
            widthPx = -1;
        }
        if (heightPx <= 0) {
            heightPx = -1;
        }
        j.a aVar = new j.a(widthPx, heightPx);
        aVar.a(context, elementLayoutParams, adElements);
        elementsContainer.addView(viewJ, aVar);
        try {
            adElement.a(rootContainer);
        } catch (Throwable th2) {
            d0.b(th2);
        }
    }
}

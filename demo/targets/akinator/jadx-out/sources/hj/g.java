package hj;

import android.R;
import android.app.Application;
import android.graphics.Point;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g {
    public void slideIntoView(Application application, View view, f fVar) {
        view.setAlpha(0.0f);
        Point pointA = f.a(fVar, view);
        view.animate().translationX(pointA.x).translationY(pointA.y).setDuration(1L).setListener(new c(view, application));
    }

    public void slideOutOfView(Application application, View view, f fVar, e eVar) {
        Point pointA = f.a(fVar, view);
        view.animate().translationX(pointA.x).translationY(pointA.y).setDuration(application.getResources().getInteger(R.integer.config_longAnimTime)).setListener(new d());
    }
}

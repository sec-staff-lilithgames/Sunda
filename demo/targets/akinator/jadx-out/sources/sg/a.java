package sg;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final PathInterpolator f85743a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final View f85744b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85745c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85746d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85747e;

    /* renamed from: f, reason: collision with root package name */
    public f.c f85748f;

    public a(View view) {
        this.f85744b = view;
        Context context = view.getContext();
        this.f85745c = o.resolveThemeDuration(context, R.attr.motionDurationMedium2, 300);
        this.f85746d = o.resolveThemeDuration(context, R.attr.motionDurationShort3, 150);
        this.f85747e = o.resolveThemeDuration(context, R.attr.motionDurationShort2, 100);
    }

    public final f.c a() {
        if (this.f85748f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        f.c cVar = this.f85748f;
        this.f85748f = null;
        return cVar;
    }

    public float interpolateProgress(float f10) {
        return this.f85743a.getInterpolation(f10);
    }

    public f.c onHandleBackInvoked() {
        f.c cVar = this.f85748f;
        this.f85748f = null;
        return cVar;
    }
}

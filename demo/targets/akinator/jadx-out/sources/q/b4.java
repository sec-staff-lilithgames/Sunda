package q;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f82044a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f82045b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f82046c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f82047d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f82048e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f82049f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f82050g;

    public b4(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f82047d = layoutParams;
        this.f82048e = new Rect();
        this.f82049f = new int[2];
        this.f82050g = new int[2];
        this.f82044a = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f82045b = viewInflate;
        this.f82046c = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(b4.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public b4(s8.h hVar, s8.h hVar2, s8.h hVar3, s8.h hVar4, p8.e0 e0Var, p8.e0 e0Var2) {
        this.f82050g = k9.h.threadSafe(150, new p8.b0(this));
        this.f82044a = hVar;
        this.f82045b = hVar2;
        this.f82046c = hVar3;
        this.f82047d = hVar4;
        this.f82048e = e0Var;
        this.f82049f = e0Var2;
    }
}

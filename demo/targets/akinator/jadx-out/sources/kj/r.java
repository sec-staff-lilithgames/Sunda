package kj;

import android.app.Application;
import android.view.LayoutInflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final rj.o f71570a;

    /* renamed from: b, reason: collision with root package name */
    public final hj.s f71571b;

    /* renamed from: c, reason: collision with root package name */
    public final Application f71572c;

    public r(rj.o oVar, hj.s sVar, Application application) {
        this.f71570a = oVar;
        this.f71571b = sVar;
        this.f71572c = application;
    }

    public LayoutInflater providesInflaterservice() {
        return (LayoutInflater) this.f71572c.getSystemService("layout_inflater");
    }
}

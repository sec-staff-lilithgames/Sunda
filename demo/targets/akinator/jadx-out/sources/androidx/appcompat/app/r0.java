package androidx.appcompat.app;

import android.os.Bundle;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4824a;

    /* renamed from: b, reason: collision with root package name */
    public int f4825b;

    /* renamed from: c, reason: collision with root package name */
    public int f4826c;

    /* renamed from: d, reason: collision with root package name */
    public int f4827d;

    /* renamed from: e, reason: collision with root package name */
    public q0 f4828e;

    /* renamed from: f, reason: collision with root package name */
    public View f4829f;

    /* renamed from: g, reason: collision with root package name */
    public View f4830g;

    /* renamed from: h, reason: collision with root package name */
    public p.m f4831h;

    /* renamed from: i, reason: collision with root package name */
    public p.i f4832i;

    /* renamed from: j, reason: collision with root package name */
    public o.e f4833j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4834k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4835l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4836m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4837n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4838o;

    /* renamed from: p, reason: collision with root package name */
    public Bundle f4839p;

    public void clearMenuPresenters() {
        p.m mVar = this.f4831h;
        if (mVar != null) {
            mVar.removeMenuPresenter(this.f4832i);
        }
        this.f4832i = null;
    }

    public boolean hasPanelItems() {
        if (this.f4829f == null) {
            return false;
        }
        return this.f4830g != null || this.f4832i.getAdapter().getCount() > 0;
    }
}

package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final p3 f7152a;

    /* renamed from: b, reason: collision with root package name */
    public final z2 f7153b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.a f7154c;

    /* renamed from: d, reason: collision with root package name */
    public final t f7155d;

    /* renamed from: e, reason: collision with root package name */
    public int f7156e;

    /* renamed from: f, reason: collision with root package name */
    public final h1 f7157f;

    public j1(RecyclerView.a aVar, t tVar, q3 q3Var, z2 z2Var) {
        h1 h1Var = new h1(this);
        this.f7157f = h1Var;
        this.f7154c = aVar;
        this.f7155d = tVar;
        this.f7152a = q3Var.createViewTypeWrapper(this);
        this.f7153b = z2Var;
        this.f7156e = aVar.getItemCount();
        aVar.registerAdapterDataObserver(h1Var);
    }

    public long getItemId(int i10) {
        return this.f7153b.localToGlobal(this.f7154c.getItemId(i10));
    }
}

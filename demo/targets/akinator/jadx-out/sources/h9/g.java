package h9;

import android.view.animation.Animation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g implements d {

    /* renamed from: a, reason: collision with root package name */
    public final k f58706a;

    /* renamed from: b, reason: collision with root package name */
    public l f58707b;

    public g(Animation animation) {
        this(new e(animation));
    }

    @Override // h9.d
    public c build(n8.a aVar, boolean z10) {
        if (aVar == n8.a.f75827g || !z10) {
            return a.get();
        }
        if (this.f58707b == null) {
            this.f58707b = new l(this.f58706a);
        }
        return this.f58707b;
    }

    public g(int i10) {
        this(new f(i10));
    }

    public g(k kVar) {
        this.f58706a = kVar;
    }
}

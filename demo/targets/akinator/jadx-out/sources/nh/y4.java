package nh;

import java.util.AbstractCollection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class y4 extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f76782e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractCollection f76783f;

    public y4(int i10, b5 b5Var) {
        super(b5Var.size(), i10);
        this.f76783f = b5Var;
    }

    @Override // nh.a
    public final Object get(int i10) {
        switch (this.f76782e) {
            case 0:
                return ((b5) this.f76783f).get(i10);
            default:
                return new mg(i10, ((jg) this.f76783f).f76404b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(jg jgVar, int i10) {
        super(i10, 0);
        this.f76783f = jgVar;
    }
}

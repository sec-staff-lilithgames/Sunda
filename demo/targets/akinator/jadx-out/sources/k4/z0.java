package k4;

import java.io.FileInputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f70576i;

    /* renamed from: j, reason: collision with root package name */
    public FileInputStream f70577j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70578k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a1 f70579l;

    /* renamed from: m, reason: collision with root package name */
    public int f70580m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, zu.d dVar) {
        super(dVar);
        this.f70579l = a1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70578k = obj;
        this.f70580m |= Integer.MIN_VALUE;
        return a1.a(this.f70579l, this);
    }
}

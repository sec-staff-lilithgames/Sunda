package k4;

import java.io.FileOutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public FileOutputStream f70355i;

    /* renamed from: j, reason: collision with root package name */
    public FileOutputStream f70356j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70357k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i1 f70358l;

    /* renamed from: m, reason: collision with root package name */
    public int f70359m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(i1 i1Var, zu.d dVar) {
        super(dVar);
        this.f70358l = i1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70357k = obj;
        this.f70359m |= Integer.MIN_VALUE;
        return this.f70358l.writeData(null, this);
    }
}

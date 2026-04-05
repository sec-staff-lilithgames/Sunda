package z7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f97649a;

    /* renamed from: b, reason: collision with root package name */
    public final y7.o f97650b;

    public q(String str, y7.o oVar) {
        this.f97649a = str;
        this.f97650b = oVar;
    }

    public y7.o getCornerRadius() {
        return this.f97650b;
    }

    public String getName() {
        return this.f97649a;
    }

    @Override // z7.c
    public t7.d toContent(r7.a0 a0Var, r7.h hVar, a8.a aVar) {
        return new t7.r(a0Var, aVar, this);
    }
}

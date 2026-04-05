package hg;

import android.animation.TypeEvaluator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class f implements TypeEvaluator {

    /* renamed from: b, reason: collision with root package name */
    public static final f f58772b = new f();

    /* renamed from: a, reason: collision with root package name */
    public final i f58773a = new i();

    @Override // android.animation.TypeEvaluator
    public i evaluate(float f10, i iVar, i iVar2) {
        float fLerp = rg.a.lerp(iVar.f58776a, iVar2.f58776a, f10);
        float fLerp2 = rg.a.lerp(iVar.f58777b, iVar2.f58777b, f10);
        float fLerp3 = rg.a.lerp(iVar.f58778c, iVar2.f58778c, f10);
        i iVar3 = this.f58773a;
        iVar3.set(fLerp, fLerp2, fLerp3);
        return iVar3;
    }
}

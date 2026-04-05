package d3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f51855a = new boolean[3];

    public static void a(h hVar, x2.f fVar, g gVar) {
        gVar.f51803q = -1;
        e eVar = gVar.R;
        e eVar2 = gVar.Q;
        e eVar3 = gVar.O;
        e eVar4 = gVar.P;
        e eVar5 = gVar.N;
        gVar.f51805r = -1;
        f fVar2 = hVar.Y[0];
        f fVar3 = f.f51769f;
        f fVar4 = f.f51767c;
        if (fVar2 != fVar4 && gVar.Y[0] == fVar3) {
            int i10 = eVar5.f51763g;
            int width = hVar.getWidth() - eVar4.f51763g;
            eVar5.f51765i = fVar.createObjectVariable(eVar5);
            eVar4.f51765i = fVar.createObjectVariable(eVar4);
            fVar.addEquality(eVar5.f51765i, i10);
            fVar.addEquality(eVar4.f51765i, width);
            gVar.f51803q = 2;
            gVar.setHorizontalDimension(i10, width);
        }
        if (hVar.Y[1] == fVar4 || gVar.Y[1] != fVar3) {
            return;
        }
        int i11 = eVar3.f51763g;
        int height = hVar.getHeight() - eVar2.f51763g;
        eVar3.f51765i = fVar.createObjectVariable(eVar3);
        eVar2.f51765i = fVar.createObjectVariable(eVar2);
        fVar.addEquality(eVar3.f51765i, i11);
        fVar.addEquality(eVar2.f51765i, height);
        if (gVar.f51788i0 > 0 || gVar.getVisibility() == 8) {
            eVar.f51765i = fVar.createObjectVariable(eVar);
            fVar.addEquality(eVar.f51765i, gVar.f51788i0 + i11);
        }
        gVar.f51805r = 2;
        gVar.setVerticalDimension(i11, height);
    }

    public static final boolean enabled(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}

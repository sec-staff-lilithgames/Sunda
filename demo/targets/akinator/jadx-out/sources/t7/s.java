package t7;

import android.graphics.Path;
import java.util.List;
import r7.a0;
import r7.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s implements n, u7.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f86539b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f86540c;

    /* renamed from: d, reason: collision with root package name */
    public final a0 f86541d;

    /* renamed from: e, reason: collision with root package name */
    public final u7.s f86542e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86543f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f86538a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f86544g = new c();

    public s(a0 a0Var, a8.a aVar, z7.u uVar) {
        this.f86539b = uVar.getName();
        this.f86540c = uVar.isHidden();
        this.f86541d = a0Var;
        u7.s sVarCreateAnimation = uVar.getShapePath().createAnimation();
        this.f86542e = sVarCreateAnimation;
        aVar.addAnimation(sVarCreateAnimation);
        sVarCreateAnimation.addUpdateListener(this);
    }

    @Override // t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        if (t10 == h0.N) {
            this.f86542e.setValueCallback(cVar);
        }
    }

    @Override // t7.n, t7.d
    public String getName() {
        return this.f86539b;
    }

    @Override // t7.n
    public Path getPath() {
        boolean z10 = this.f86543f;
        u7.s sVar = this.f86542e;
        Path path = this.f86538a;
        if (z10 && !sVar.hasValueCallback()) {
            return path;
        }
        path.reset();
        if (this.f86540c) {
            this.f86543f = true;
            return path;
        }
        Path path2 = (Path) sVar.getValue();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f86544g.apply(path);
        this.f86543f = true;
        return path;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86543f = false;
        this.f86541d.invalidateSelf();
    }

    @Override // t7.l, x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        e8.j.resolveKeyPath(fVar, i10, list, fVar2, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    @Override // t7.n, t7.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setContents(java.util.List<t7.d> r6, java.util.List<t7.d> r7) {
        /*
            r5 = this;
            r7 = 0
            r0 = 0
        L2:
            int r1 = r6.size()
            if (r0 >= r1) goto L3c
            java.lang.Object r1 = r6.get(r0)
            t7.d r1 = (t7.d) r1
            boolean r2 = r1 instanceof t7.v
            if (r2 == 0) goto L26
            r2 = r1
            t7.v r2 = (t7.v) r2
            z7.y r3 = r2.f86553d
            z7.y r4 = z7.y.f97681b
            if (r3 != r4) goto L26
            t7.c r1 = r5.f86544g
            java.util.ArrayList r1 = r1.f86426a
            r1.add(r2)
            r2.a(r5)
            goto L39
        L26:
            boolean r2 = r1 instanceof t7.t
            if (r2 == 0) goto L39
            if (r7 != 0) goto L31
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L31:
            t7.t r1 = (t7.t) r1
            r1.addUpdateListener(r5)
            r7.add(r1)
        L39:
            int r0 = r0 + 1
            goto L2
        L3c:
            u7.s r6 = r5.f86542e
            r6.setShapeModifiers(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.s.setContents(java.util.List, java.util.List):void");
    }
}

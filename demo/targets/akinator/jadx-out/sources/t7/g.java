package t7;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import r7.a0;
import r7.h0;
import z7.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g implements n, u7.a, l {

    /* renamed from: b, reason: collision with root package name */
    public final String f86440b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f86441c;

    /* renamed from: d, reason: collision with root package name */
    public final u7.f f86442d;

    /* renamed from: e, reason: collision with root package name */
    public final u7.f f86443e;

    /* renamed from: f, reason: collision with root package name */
    public final z7.b f86444f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86446h;

    /* renamed from: a, reason: collision with root package name */
    public final Path f86439a = new Path();

    /* renamed from: g, reason: collision with root package name */
    public final c f86445g = new c();

    public g(a0 a0Var, a8.a aVar, z7.b bVar) {
        this.f86440b = bVar.getName();
        this.f86441c = a0Var;
        u7.f fVarCreateAnimation = bVar.getSize().createAnimation();
        this.f86442d = fVarCreateAnimation;
        u7.f fVarCreateAnimation2 = bVar.getPosition().createAnimation();
        this.f86443e = fVarCreateAnimation2;
        this.f86444f = bVar;
        aVar.addAnimation(fVarCreateAnimation);
        aVar.addAnimation(fVarCreateAnimation2);
        fVarCreateAnimation.addUpdateListener(this);
        fVarCreateAnimation2.addUpdateListener(this);
    }

    @Override // t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        if (t10 == h0.f83920f) {
            this.f86442d.setValueCallback(cVar);
        } else if (t10 == h0.f83923i) {
            this.f86443e.setValueCallback(cVar);
        }
    }

    @Override // t7.n, t7.d
    public String getName() {
        return this.f86440b;
    }

    @Override // t7.n
    public Path getPath() {
        boolean z10 = this.f86446h;
        Path path = this.f86439a;
        if (z10) {
            return path;
        }
        path.reset();
        z7.b bVar = this.f86444f;
        if (bVar.isHidden()) {
            this.f86446h = true;
            return path;
        }
        PointF pointF = (PointF) this.f86442d.getValue();
        float f10 = pointF.x / 2.0f;
        float f11 = pointF.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = f11 * 0.55228f;
        path.reset();
        if (bVar.isReversed()) {
            float f14 = -f11;
            path.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            path.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            path.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            path.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            path.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            path.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            path.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            path.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            path.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            path.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointF2 = (PointF) this.f86443e.getValue();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.f86445g.apply(path);
        this.f86446h = true;
        return path;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86446h = false;
        this.f86441c.invalidateSelf();
    }

    @Override // t7.l, x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        e8.j.resolveKeyPath(fVar, i10, list, fVar2, this);
    }

    @Override // t7.n, t7.d
    public void setContents(List<d> list, List<d> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            if (dVar instanceof v) {
                v vVar = (v) dVar;
                if (vVar.f86553d == y.f97681b) {
                    this.f86445g.f86426a.add(vVar);
                    vVar.a(this);
                }
            }
        }
    }
}

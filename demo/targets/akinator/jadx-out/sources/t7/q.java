package t7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import r7.a0;
import r7.h0;
import u7.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q implements f, n, k, u7.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f86524a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final Path f86525b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final a0 f86526c;

    /* renamed from: d, reason: collision with root package name */
    public final a8.a f86527d;

    /* renamed from: e, reason: collision with root package name */
    public final String f86528e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f86529f;

    /* renamed from: g, reason: collision with root package name */
    public final u7.j f86530g;

    /* renamed from: h, reason: collision with root package name */
    public final u7.j f86531h;

    /* renamed from: i, reason: collision with root package name */
    public final x f86532i;

    /* renamed from: j, reason: collision with root package name */
    public e f86533j;

    public q(a0 a0Var, a8.a aVar, z7.p pVar) {
        this.f86526c = a0Var;
        this.f86527d = aVar;
        this.f86528e = pVar.getName();
        this.f86529f = pVar.isHidden();
        u7.j jVarCreateAnimation = pVar.getCopies().createAnimation();
        this.f86530g = jVarCreateAnimation;
        aVar.addAnimation(jVarCreateAnimation);
        jVarCreateAnimation.addUpdateListener(this);
        u7.j jVarCreateAnimation2 = pVar.getOffset().createAnimation();
        this.f86531h = jVarCreateAnimation2;
        aVar.addAnimation(jVarCreateAnimation2);
        jVarCreateAnimation2.addUpdateListener(this);
        x xVarCreateAnimation = pVar.getTransform().createAnimation();
        this.f86532i = xVarCreateAnimation;
        xVarCreateAnimation.addAnimationsToLayer(aVar);
        xVarCreateAnimation.addListener(this);
    }

    @Override // t7.k
    public void absorbContent(ListIterator<d> listIterator) {
        if (this.f86533j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.f86533j = new e(this.f86526c, this.f86527d, "Repeater", this.f86529f, arrayList, null);
    }

    @Override // t7.l, x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        if (this.f86532i.applyValueCallback(t10, cVar)) {
            return;
        }
        if (t10 == h0.f83933s) {
            this.f86530g.setValueCallback(cVar);
        } else if (t10 == h0.f83934t) {
            this.f86531h.setValueCallback(cVar);
        }
    }

    @Override // t7.f
    public void draw(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        float fFloatValue = ((Float) this.f86530g.getValue()).floatValue();
        float fFloatValue2 = ((Float) this.f86531h.getValue()).floatValue();
        x xVar = this.f86532i;
        float fFloatValue3 = ((Float) xVar.getStartOpacity().getValue()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) xVar.getEndOpacity().getValue()).floatValue() / 100.0f;
        for (int i11 = ((int) fFloatValue) - 1; i11 >= 0; i11--) {
            Matrix matrix2 = this.f86524a;
            matrix2.set(matrix);
            float f10 = i11;
            matrix2.preConcat(xVar.getMatrixForRepeater(f10 + fFloatValue2));
            this.f86533j.draw(canvas, matrix2, (int) (e8.j.lerp(fFloatValue3, fFloatValue4, f10 / fFloatValue) * i10), bVar);
        }
    }

    @Override // t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        this.f86533j.getBounds(rectF, matrix, z10);
    }

    @Override // t7.f, t7.d
    public String getName() {
        return this.f86528e;
    }

    @Override // t7.n
    public Path getPath() {
        Path path = this.f86533j.getPath();
        Path path2 = this.f86525b;
        path2.reset();
        float fFloatValue = ((Float) this.f86530g.getValue()).floatValue();
        float fFloatValue2 = ((Float) this.f86531h.getValue()).floatValue();
        for (int i10 = ((int) fFloatValue) - 1; i10 >= 0; i10--) {
            Matrix matrixForRepeater = this.f86532i.getMatrixForRepeater(i10 + fFloatValue2);
            Matrix matrix = this.f86524a;
            matrix.set(matrixForRepeater);
            path2.addPath(path, matrix);
        }
        return path2;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86526c.invalidateSelf();
    }

    @Override // t7.l, x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        e8.j.resolveKeyPath(fVar, i10, list, fVar2, this);
        for (int i11 = 0; i11 < this.f86533j.getContents().size(); i11++) {
            d dVar = this.f86533j.getContents().get(i11);
            if (dVar instanceof l) {
                e8.j.resolveKeyPath(fVar, i10, list, fVar2, (l) dVar);
            }
        }
    }

    @Override // t7.f, t7.d
    public void setContents(List<d> list, List<d> list2) {
        this.f86533j.setContents(list, list2);
    }
}

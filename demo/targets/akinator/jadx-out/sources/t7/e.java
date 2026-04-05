package t7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import e8.k;
import java.util.ArrayList;
import java.util.List;
import r7.a0;
import u7.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class e implements f, n, u7.a, x7.g {

    /* renamed from: a, reason: collision with root package name */
    public final k.a f86427a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f86428b;

    /* renamed from: c, reason: collision with root package name */
    public final e8.k f86429c;

    /* renamed from: d, reason: collision with root package name */
    public final Matrix f86430d;

    /* renamed from: e, reason: collision with root package name */
    public final Path f86431e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f86432f;

    /* renamed from: g, reason: collision with root package name */
    public final String f86433g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f86434h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f86435i;

    /* renamed from: j, reason: collision with root package name */
    public final a0 f86436j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f86437k;

    /* renamed from: l, reason: collision with root package name */
    public final x f86438l;

    public e(a0 a0Var, a8.a aVar, z7.t tVar, r7.h hVar) {
        y7.n nVar;
        String name = tVar.getName();
        boolean zIsHidden = tVar.isHidden();
        List<z7.c> items = tVar.getItems();
        ArrayList arrayList = new ArrayList(items.size());
        int i10 = 0;
        for (int i11 = 0; i11 < items.size(); i11++) {
            d content = items.get(i11).toContent(a0Var, hVar, aVar);
            if (content != null) {
                arrayList.add(content);
            }
        }
        List<z7.c> items2 = tVar.getItems();
        while (true) {
            if (i10 >= items2.size()) {
                nVar = null;
                break;
            }
            z7.c cVar = items2.get(i10);
            if (cVar instanceof y7.n) {
                nVar = (y7.n) cVar;
                break;
            }
            i10++;
        }
        this(a0Var, aVar, name, zIsHidden, arrayList, nVar);
    }

    public final List a() {
        if (this.f86437k == null) {
            this.f86437k = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f86435i;
                if (i10 >= arrayList.size()) {
                    break;
                }
                d dVar = (d) arrayList.get(i10);
                if (dVar instanceof n) {
                    this.f86437k.add((n) dVar);
                }
                i10++;
            }
        }
        return this.f86437k;
    }

    @Override // x7.g
    public <T> void addValueCallback(T t10, f8.c cVar) {
        x xVar = this.f86438l;
        if (xVar != null) {
            xVar.applyValueCallback(t10, cVar);
        }
    }

    public final boolean b() {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f86435i;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i10) instanceof f) && (i11 = i11 + 1) >= 2) {
                return true;
            }
            i10++;
        }
    }

    @Override // t7.f
    public void draw(Canvas canvas, Matrix matrix, int i10, e8.b bVar) {
        if (this.f86434h) {
            return;
        }
        Matrix matrix2 = this.f86430d;
        matrix2.set(matrix);
        x xVar = this.f86438l;
        if (xVar != null) {
            matrix2.preConcat(xVar.getMatrix());
            i10 = (int) (((((xVar.getOpacity() == null ? 100 : ((Integer) xVar.getOpacity().getValue()).intValue()) / 100.0f) * i10) / 255.0f) * 255.0f);
        }
        a0 a0Var = this.f86436j;
        boolean z10 = (a0Var.isApplyingOpacityToLayersEnabled() && b() && i10 != 255) || (bVar != null && a0Var.isApplyingShadowToLayersEnabled() && b());
        int i11 = z10 ? 255 : i10;
        e8.k kVar = this.f86429c;
        if (z10) {
            RectF rectF = this.f86428b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(rectF, matrix, true);
            k.a aVar = this.f86427a;
            aVar.f53968a = i10;
            if (bVar != null) {
                bVar.applyTo(aVar);
                bVar = null;
            } else {
                aVar.f53969b = null;
            }
            canvas = kVar.start(canvas, rectF, aVar);
        } else if (bVar != null) {
            e8.b bVar2 = new e8.b(bVar);
            bVar2.multiplyOpacity(i11);
            bVar = bVar2;
        }
        ArrayList arrayList = this.f86435i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof f) {
                ((f) obj).draw(canvas, matrix2, i11, bVar);
            }
        }
        if (z10) {
            kVar.finish();
        }
    }

    @Override // t7.f
    public void getBounds(RectF rectF, Matrix matrix, boolean z10) {
        Matrix matrix2 = this.f86430d;
        matrix2.set(matrix);
        x xVar = this.f86438l;
        if (xVar != null) {
            matrix2.preConcat(xVar.getMatrix());
        }
        RectF rectF2 = this.f86432f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.f86435i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof f) {
                ((f) dVar).getBounds(rectF2, matrix2, z10);
                rectF.union(rectF2);
            }
        }
    }

    public List<d> getContents() {
        return this.f86435i;
    }

    @Override // t7.f, t7.d
    public String getName() {
        return this.f86433g;
    }

    @Override // t7.n
    public Path getPath() {
        Matrix matrix = this.f86430d;
        matrix.reset();
        x xVar = this.f86438l;
        if (xVar != null) {
            matrix.set(xVar.getMatrix());
        }
        Path path = this.f86431e;
        path.reset();
        if (!this.f86434h) {
            ArrayList arrayList = this.f86435i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                d dVar = (d) arrayList.get(size);
                if (dVar instanceof n) {
                    path.addPath(((n) dVar).getPath(), matrix);
                }
            }
        }
        return path;
    }

    @Override // u7.a
    public void onValueChanged() {
        this.f86436j.invalidateSelf();
    }

    @Override // x7.g
    public void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2) {
        if (!fVar.matches(getName(), i10) && !"__container".equals(getName())) {
            return;
        }
        if (!"__container".equals(getName())) {
            fVar2 = fVar2.addKey(getName());
            if (fVar.fullyResolvesTo(getName(), i10)) {
                list.add(fVar2.resolve(this));
            }
        }
        if (!fVar.propagateToChildren(getName(), i10)) {
            return;
        }
        int iIncrementDepthBy = fVar.incrementDepthBy(getName(), i10) + i10;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f86435i;
            if (i11 >= arrayList.size()) {
                return;
            }
            d dVar = (d) arrayList.get(i11);
            if (dVar instanceof x7.g) {
                ((x7.g) dVar).resolveKeyPath(fVar, iIncrementDepthBy, list, fVar2);
            }
            i11++;
        }
    }

    @Override // t7.f, t7.d
    public void setContents(List<d> list, List<d> list2) {
        int size = list.size();
        ArrayList arrayList = this.f86435i;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            d dVar = (d) arrayList.get(size2);
            dVar.setContents(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(dVar);
        }
    }

    public e(a0 a0Var, a8.a aVar, String str, boolean z10, ArrayList arrayList, y7.n nVar) {
        this.f86427a = new k.a();
        this.f86428b = new RectF();
        this.f86429c = new e8.k();
        this.f86430d = new Matrix();
        this.f86431e = new Path();
        this.f86432f = new RectF();
        this.f86433g = str;
        this.f86436j = a0Var;
        this.f86434h = z10;
        this.f86435i = arrayList;
        if (nVar != null) {
            x xVarCreateAnimation = nVar.createAnimation();
            this.f86438l = xVarCreateAnimation;
            xVarCreateAnimation.addAnimationsToLayer(aVar);
            xVarCreateAnimation.addListener(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            d dVar = (d) arrayList.get(size);
            if (dVar instanceof k) {
                arrayList2.add((k) dVar);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((k) arrayList2.get(size2)).absorbContent(arrayList.listIterator(arrayList.size()));
        }
    }
}

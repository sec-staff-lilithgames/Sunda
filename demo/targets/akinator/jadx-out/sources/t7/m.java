package t7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import u7.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class m implements n, k {

    /* renamed from: d, reason: collision with root package name */
    public final String f86492d;

    /* renamed from: f, reason: collision with root package name */
    public final z7.l f86494f;

    /* renamed from: a, reason: collision with root package name */
    public final Path f86489a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Path f86490b = new Path();

    /* renamed from: c, reason: collision with root package name */
    public final Path f86491c = new Path();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f86493e = new ArrayList();

    public m(z7.l lVar) {
        this.f86492d = lVar.getName();
        this.f86494f = lVar;
    }

    public final void a(Path.Op op2) {
        Path path = this.f86490b;
        path.reset();
        Path path2 = this.f86489a;
        path2.reset();
        ArrayList arrayList = this.f86493e;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            n nVar = (n) arrayList.get(size);
            if (nVar instanceof e) {
                e eVar = (e) nVar;
                ArrayList arrayList2 = (ArrayList) eVar.a();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((n) arrayList2.get(size2)).getPath();
                    Matrix matrix = eVar.f86430d;
                    x xVar = eVar.f86438l;
                    if (xVar != null) {
                        matrix = xVar.getMatrix();
                    } else {
                        matrix.reset();
                    }
                    path3.transform(matrix);
                    path.addPath(path3);
                }
            } else {
                path.addPath(nVar.getPath());
            }
        }
        int i10 = 0;
        n nVar2 = (n) arrayList.get(0);
        if (nVar2 instanceof e) {
            e eVar2 = (e) nVar2;
            List listA = eVar2.a();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listA;
                if (i10 >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((n) arrayList3.get(i10)).getPath();
                Matrix matrix2 = eVar2.f86430d;
                x xVar2 = eVar2.f86438l;
                if (xVar2 != null) {
                    matrix2 = xVar2.getMatrix();
                } else {
                    matrix2.reset();
                }
                path4.transform(matrix2);
                path2.addPath(path4);
                i10++;
            }
        } else {
            path2.set(nVar2.getPath());
        }
        this.f86491c.op(path2, path, op2);
    }

    @Override // t7.k
    public void absorbContent(ListIterator<d> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVarPrevious = listIterator.previous();
            if (dVarPrevious instanceof n) {
                this.f86493e.add((n) dVarPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // t7.n, t7.d
    public String getName() {
        return this.f86492d;
    }

    @Override // t7.n
    public Path getPath() {
        Path path = this.f86491c;
        path.reset();
        z7.l lVar = this.f86494f;
        if (!lVar.isHidden()) {
            int iOrdinal = lVar.getMode().ordinal();
            if (iOrdinal == 0) {
                int i10 = 0;
                while (true) {
                    ArrayList arrayList = this.f86493e;
                    if (i10 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((n) arrayList.get(i10)).getPath());
                    i10++;
                }
            } else {
                if (iOrdinal == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iOrdinal == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iOrdinal == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iOrdinal == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }

    @Override // t7.n, t7.d
    public void setContents(List<d> list, List<d> list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f86493e;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i10)).setContents(list, list2);
            i10++;
        }
    }
}

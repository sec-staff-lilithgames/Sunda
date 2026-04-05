package wm;

import android.util.Pair;
import java.util.Comparator;
import ym.m;
import ym.n;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f90734b;

    public a(b bVar) {
        this.f90734b = bVar;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Pair<m, n> pair, Pair<m, n> pair2) {
        int height = ((n) pair.second).getHeight() * ((n) pair.second).getWidth();
        int height2 = ((n) pair2.second).getHeight() * ((n) pair2.second).getWidth();
        b bVar = this.f90734b;
        int iAbs = Math.abs(height - bVar.f90735b);
        int iAbs2 = Math.abs(height2 - bVar.f90735b);
        io.bidmachine.iab.vast.e.d("DefaultMediaPicker", "AreaComparator: obj1 - %d, obj2 - %d", Integer.valueOf(iAbs), Integer.valueOf(iAbs2));
        if (iAbs < iAbs2) {
            return -1;
        }
        return iAbs > iAbs2 ? 1 : 0;
    }
}

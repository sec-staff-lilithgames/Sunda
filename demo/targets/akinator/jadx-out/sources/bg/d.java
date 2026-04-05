package bg;

import com.google.android.material.button.MaterialButton;
import io.odeeo.internal.r.m;
import java.util.Comparator;
import kotlin.jvm.internal.e0;
import kv.l;
import m0.r;
import qe.b0;
import x1.d0;
import xn.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9495b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9496c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f9495b = i10;
        this.f9496c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int score;
        int score2;
        int i10 = this.f9495b;
        Object obj3 = this.f9496c;
        switch (i10) {
            case 0:
                f fVar = (f) obj3;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int i11 = f.f9498m;
                int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(fVar.indexOfChild(materialButton), fVar.indexOfChild(materialButton2));
            case 1:
                return m.a((m.g) obj3, obj, obj2);
            case 2:
                d0 containerLayoutCoordinates = (d0) obj3;
                r a10 = (r) obj;
                r b10 = (r) obj2;
                e0.checkNotNullParameter(containerLayoutCoordinates, "$containerLayoutCoordinates");
                e0.checkNotNullParameter(a10, "a");
                e0.checkNotNullParameter(b10, "b");
                d0 layoutCoordinates = a10.getLayoutCoordinates();
                d0 layoutCoordinates2 = b10.getLayoutCoordinates();
                long jMo7828localPositionOfR5De75A = layoutCoordinates != null ? containerLayoutCoordinates.mo7828localPositionOfR5De75A(layoutCoordinates, i1.h.f59344b.m4173getZeroF1C5BW0()) : i1.h.f59344b.m4173getZeroF1C5BW0();
                long jMo7828localPositionOfR5De75A2 = layoutCoordinates2 != null ? containerLayoutCoordinates.mo7828localPositionOfR5De75A(layoutCoordinates2, i1.h.f59344b.m4173getZeroF1C5BW0()) : i1.h.f59344b.m4173getZeroF1C5BW0();
                return i1.h.m4186getYimpl(jMo7828localPositionOfR5De75A) == i1.h.m4186getYimpl(jMo7828localPositionOfR5De75A2) ? xu.d.compareValues(Float.valueOf(i1.h.m4185getXimpl(jMo7828localPositionOfR5De75A)), Float.valueOf(i1.h.m4185getXimpl(jMo7828localPositionOfR5De75A2))) : xu.d.compareValues(Float.valueOf(i1.h.m4186getYimpl(jMo7828localPositionOfR5De75A)), Float.valueOf(i1.h.m4186getYimpl(jMo7828localPositionOfR5De75A2)));
            case 3:
                b0 b0Var = (b0) obj3;
                score = b0Var.getScore(obj2);
                score2 = b0Var.getScore(obj);
                break;
            case 4:
                g0 g0Var = (g0) obj3;
                score = g0Var.getScore(obj2);
                score2 = g0Var.getScore(obj);
                break;
            default:
                for (l lVar : (l[]) obj3) {
                    int iCompareValues = xu.d.compareValues((Comparable) lVar.invoke(obj), (Comparable) lVar.invoke(obj2));
                    if (iCompareValues != 0) {
                        return iCompareValues;
                    }
                }
                return 0;
        }
        return score - score2;
    }
}

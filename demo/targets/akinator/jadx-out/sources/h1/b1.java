package h1;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        z1.b0 layoutNode$ui_release;
        z1.b0 layoutNode$ui_release2;
        z1.u0 layoutNodeWrapper = ((s) obj).getLayoutNodeWrapper();
        Integer numValueOf = null;
        Integer numValueOf2 = (layoutNodeWrapper == null || (layoutNode$ui_release2 = layoutNodeWrapper.getLayoutNode$ui_release()) == null) ? null : Integer.valueOf(layoutNode$ui_release2.getPlaceOrder$ui_release());
        z1.u0 layoutNodeWrapper2 = ((s) obj2).getLayoutNodeWrapper();
        if (layoutNodeWrapper2 != null && (layoutNode$ui_release = layoutNodeWrapper2.getLayoutNode$ui_release()) != null) {
            numValueOf = Integer.valueOf(layoutNode$ui_release.getPlaceOrder$ui_release());
        }
        return xu.d.compareValues(numValueOf2, numValueOf);
    }
}

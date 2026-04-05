package bg;

import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import y3.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MaterialButtonToggleGroup f9532d;

    public h(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this.f9532d = materialButtonToggleGroup;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        int i11 = MaterialButtonToggleGroup.f29061t;
        if (view instanceof MaterialButton) {
            int i12 = 0;
            int i13 = 0;
            while (true) {
                MaterialButtonToggleGroup materialButtonToggleGroup = this.f9532d;
                if (i12 >= materialButtonToggleGroup.getChildCount()) {
                    break;
                }
                if (materialButtonToggleGroup.getChildAt(i12) == view) {
                    i10 = i13;
                    break;
                }
                if ((materialButtonToggleGroup.getChildAt(i12) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i12).getVisibility() != 8) {
                    i13++;
                }
                i12++;
            }
        } else {
            i10 = -1;
        }
        cVar.setCollectionItemInfo(k.obtain(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
    }
}

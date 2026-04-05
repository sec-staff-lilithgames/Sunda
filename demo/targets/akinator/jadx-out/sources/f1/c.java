package f1;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import j1.w1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import tu.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static final void performAutofill(a aVar, SparseArray<AutofillValue> values) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(values, "values");
        int size = values.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = values.keyAt(i10);
            AutofillValue value = values.get(iKeyAt);
            e0.checkNotNullExpressionValue(value, "value");
            f fVar = f.f55285a;
            if (fVar.isText(value)) {
                aVar.getAutofillTree().performAutofill(iKeyAt, fVar.textValue(value).toString());
            } else {
                if (fVar.isDate(value)) {
                    throw new u("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (fVar.isList(value)) {
                    throw new u("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (fVar.isToggle(value)) {
                    throw new u("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final void populateViewStructure(a aVar, ViewStructure root) {
        Rect androidRect;
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(root, "root");
        int size = aVar.getAutofillTree().getChildren().size();
        e eVar = e.f55284a;
        int iAddChildCount = eVar.addChildCount(root, size);
        for (Map.Entry<Integer, h> entry : aVar.getAutofillTree().getChildren().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            h value = entry.getValue();
            ViewStructure viewStructureNewChild = eVar.newChild(root, iAddChildCount);
            if (viewStructureNewChild != null) {
                f fVar = f.f55285a;
                AutofillId autofillId = fVar.getAutofillId(root);
                e0.checkNotNull(autofillId);
                fVar.setAutofillId(viewStructureNewChild, autofillId, iIntValue);
                eVar.setId(viewStructureNewChild, iIntValue, aVar.getView().getContext().getPackageName(), null, null);
                fVar.setAutofillType(viewStructureNewChild, 1);
                List<j> autofillTypes = value.getAutofillTypes();
                ArrayList arrayList = new ArrayList(autofillTypes.size());
                int size2 = autofillTypes.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    arrayList.add(b.getAndroidType(autofillTypes.get(i10)));
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                fVar.setAutofillHints(viewStructureNewChild, (String[]) array);
                if (value.getBoundingBox() == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                }
                i1.j boundingBox = value.getBoundingBox();
                if (boundingBox != null && (androidRect = w1.toAndroidRect(boundingBox)) != null) {
                    eVar.setDimens(viewStructureNewChild, androidRect.left, androidRect.top, 0, 0, androidRect.width(), androidRect.height());
                }
            }
            iAddChildCount++;
        }
    }
}

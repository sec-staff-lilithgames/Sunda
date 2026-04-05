package y3;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class l extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final n f94062a;

    public l(n nVar) {
        this.f94062a = nVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        c cVarCreateAccessibilityNodeInfo = this.f94062a.createAccessibilityNodeInfo(i10);
        if (cVarCreateAccessibilityNodeInfo == null) {
            return null;
        }
        return cVarCreateAccessibilityNodeInfo.unwrap();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
        List<c> listFindAccessibilityNodeInfosByText = this.f94062a.findAccessibilityNodeInfosByText(str, i10);
        if (listFindAccessibilityNodeInfosByText == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listFindAccessibilityNodeInfosByText.get(i11).unwrap());
        }
        return arrayList;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i10) {
        c cVarFindFocus = this.f94062a.findFocus(i10);
        if (cVarFindFocus == null) {
            return null;
        }
        return cVarFindFocus.unwrap();
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i10, int i11, Bundle bundle) {
        return this.f94062a.performAction(i10, i11, bundle);
    }
}

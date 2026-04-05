package y3;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i {
    public static int a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static void b(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
        accessibilityNodeInfo.setChecked(i10);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, View view, int i10) {
        accessibilityNodeInfo.addLabeledBy(view, i10);
    }

    public static ArrayList d(AccessibilityNodeInfo accessibilityNodeInfo) {
        List labeledByList = accessibilityNodeInfo.getLabeledByList();
        ArrayList arrayList = new ArrayList(labeledByList.size());
        Iterator it = labeledByList.iterator();
        while (it.hasNext()) {
            arrayList.add(c.wrap((AccessibilityNodeInfo) it.next()));
        }
        return arrayList;
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo, View view, int i10) {
        return accessibilityNodeInfo.removeLabeledBy(view, i10);
    }

    public static int getExpandedState(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence getSupplementalDescription(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean isFieldRequired(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static void setExpandedState(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
        accessibilityNodeInfo.setExpandedState(i10);
    }

    public static void setFieldRequired(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
        accessibilityNodeInfo.setFieldRequired(z10);
    }

    public static void setSupplementalDescription(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setSupplementalDescription(charSequence);
    }
}

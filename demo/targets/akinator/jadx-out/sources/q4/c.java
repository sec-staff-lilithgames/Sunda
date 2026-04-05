package q4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.drawerlayout.widget.DrawerLayout;
import java.util.List;
import x3.z1;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f82399d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f82400e;

    public c(DrawerLayout drawerLayout) {
        this.f82400e = drawerLayout;
    }

    @Override // x3.b
    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence drawerTitle;
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        List<CharSequence> text = accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.f82400e;
        View viewD = drawerLayout.d();
        if (viewD == null || (drawerTitle = drawerLayout.getDrawerTitle(drawerLayout.e(viewD))) == null) {
            return true;
        }
        text.add(drawerTitle);
        return true;
    }

    @Override // x3.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        if (DrawerLayout.O) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
        } else {
            y3.c cVarObtain = y3.c.obtain(cVar);
            super.onInitializeAccessibilityNodeInfo(view, cVarObtain);
            cVar.setSource(view);
            Object parentForAccessibility = z1.getParentForAccessibility(view);
            if (parentForAccessibility instanceof View) {
                cVar.setParent((View) parentForAccessibility);
            }
            Rect rect = this.f82399d;
            cVarObtain.getBoundsInScreen(rect);
            cVar.setBoundsInScreen(rect);
            cVar.setVisibleToUser(cVarObtain.isVisibleToUser());
            cVar.setPackageName(cVarObtain.getPackageName());
            cVar.setClassName(cVarObtain.getClassName());
            cVar.setContentDescription(cVarObtain.getContentDescription());
            cVar.setEnabled(cVarObtain.isEnabled());
            cVar.setFocused(cVarObtain.isFocused());
            cVar.setAccessibilityFocused(cVarObtain.isAccessibilityFocused());
            cVar.setSelected(cVarObtain.isSelected());
            cVar.addAction(cVarObtain.getActions());
            cVarObtain.recycle();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.g(childAt)) {
                    cVar.addChild(childAt);
                }
            }
        }
        cVar.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        cVar.setFocusable(false);
        cVar.setFocused(false);
        cVar.removeAction(c.a.f94037e);
        cVar.removeAction(c.a.f94038f);
    }

    @Override // x3.b
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.O || DrawerLayout.g(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}

package x3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.digidust.elokence.akinator.freemium.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f91536c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f91537a;

    /* renamed from: b, reason: collision with root package name */
    public final a f91538b;

    public b() {
        this(f91536c);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f91537a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public y3.n getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f91537a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new y3.n(accessibilityNodeProvider);
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f91537a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        this.f91537a.onInitializeAccessibilityNodeInfo(view, cVar.unwrap());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f91537a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f91537a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                zPerformAccessibilityAction = false;
                break;
            }
            c.a aVar = (c.a) list.get(i11);
            if (aVar.getId() == i10) {
                zPerformAccessibilityAction = aVar.perform(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f91537a.performAccessibilityAction(view, i10, bundle);
        }
        if (zPerformAccessibilityAction || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            ClickableSpan[] clickableSpans = y3.c.getClickableSpans(view.createAccessibilityNodeInfo().getText());
            for (int i13 = 0; clickableSpans != null && i13 < clickableSpans.length; i13++) {
                if (clickableSpan.equals(clickableSpans[i13])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public void sendAccessibilityEvent(View view, int i10) {
        this.f91537a.sendAccessibilityEvent(view, i10);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f91537a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f91537a = accessibilityDelegate;
        this.f91538b = new a(this);
    }
}

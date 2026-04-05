package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r2 extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f7233d;

    /* renamed from: e, reason: collision with root package name */
    public final a f7234e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends x3.b {

        /* renamed from: d, reason: collision with root package name */
        public final r2 f7235d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakHashMap f7236e = new WeakHashMap();

        public a(r2 r2Var) {
            this.f7235d = r2Var;
        }

        @Override // x3.b
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            x3.b bVar = (x3.b) this.f7236e.get(view);
            return bVar != null ? bVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // x3.b
        public y3.n getAccessibilityNodeProvider(View view) {
            x3.b bVar = (x3.b) this.f7236e.get(view);
            return bVar != null ? bVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // x3.b
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            x3.b bVar = (x3.b) this.f7236e.get(view);
            if (bVar != null) {
                bVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // x3.b
        public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
            r2 r2Var = this.f7235d;
            RecyclerView recyclerView = r2Var.f7233d;
            RecyclerView recyclerView2 = r2Var.f7233d;
            if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, cVar);
                return;
            }
            recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, cVar);
            x3.b bVar = (x3.b) this.f7236e.get(view);
            if (bVar != null) {
                bVar.onInitializeAccessibilityNodeInfo(view, cVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, cVar);
            }
        }

        @Override // x3.b
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            x3.b bVar = (x3.b) this.f7236e.get(view);
            if (bVar != null) {
                bVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // x3.b
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            x3.b bVar = (x3.b) this.f7236e.get(viewGroup);
            return bVar != null ? bVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // x3.b
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            r2 r2Var = this.f7235d;
            RecyclerView recyclerView = r2Var.f7233d;
            RecyclerView recyclerView2 = r2Var.f7233d;
            if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            x3.b bVar = (x3.b) this.f7236e.get(view);
            if (bVar != null) {
                if (bVar.performAccessibilityAction(view, i10, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i10, bundle);
        }

        @Override // x3.b
        public void sendAccessibilityEvent(View view, int i10) {
            x3.b bVar = (x3.b) this.f7236e.get(view);
            if (bVar != null) {
                bVar.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // x3.b
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            x3.b bVar = (x3.b) this.f7236e.get(view);
            if (bVar != null) {
                bVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public r2(RecyclerView recyclerView) {
        this.f7233d = recyclerView;
        x3.b itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.f7234e = new a(this);
        } else {
            this.f7234e = (a) itemDelegate;
        }
    }

    public x3.b getItemDelegate() {
        return this.f7234e;
    }

    @Override // x3.b
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f7233d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        RecyclerView recyclerView = this.f7233d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(cVar);
    }

    @Override // x3.b
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7233d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i10, bundle);
    }
}

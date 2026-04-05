package j6;

import android.R;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.applovin.shadow.okio.Segment;
import x3.z1;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends g {

    /* renamed from: a, reason: collision with root package name */
    public final j f69144a = new j(this);

    /* renamed from: b, reason: collision with root package name */
    public final k f69145b = new k(this);

    /* renamed from: c, reason: collision with root package name */
    public l f69146c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f69147d;

    public m(ViewPager2 viewPager2) {
        this.f69147d = viewPager2;
    }

    public final void a() {
        int itemCount;
        ViewPager2 viewPager2 = this.f69147d;
        int i10 = R.id.accessibilityActionPageLeft;
        z1.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageLeft);
        z1.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageRight);
        z1.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageUp);
        z1.removeAccessibilityAction(viewPager2, R.id.accessibilityActionPageDown);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.isUserInputEnabled()) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        k kVar = this.f69145b;
        j jVar = this.f69144a;
        if (orientation != 0) {
            if (viewPager2.f7384f < itemCount - 1) {
                z1.replaceAccessibilityAction(viewPager2, new c.a(R.id.accessibilityActionPageDown, (CharSequence) null), null, jVar);
            }
            if (viewPager2.f7384f > 0) {
                z1.replaceAccessibilityAction(viewPager2, new c.a(R.id.accessibilityActionPageUp, (CharSequence) null), null, kVar);
                return;
            }
            return;
        }
        boolean z10 = viewPager2.f7387i.getLayoutDirection() == 1;
        int i11 = z10 ? 16908360 : 16908361;
        if (z10) {
            i10 = 16908361;
        }
        if (viewPager2.f7384f < itemCount - 1) {
            z1.replaceAccessibilityAction(viewPager2, new c.a(i11, (CharSequence) null), null, jVar);
        }
        if (viewPager2.f7384f > 0) {
            z1.replaceAccessibilityAction(viewPager2, new c.a(i10, (CharSequence) null), null, kVar);
        }
    }

    public boolean handlesGetAccessibilityClassName() {
        return true;
    }

    public boolean handlesPerformAccessibilityAction(int i10, Bundle bundle) {
        return i10 == 8192 || i10 == 4096;
    }

    public void onAttachAdapter(RecyclerView.a aVar) {
        a();
        if (aVar != null) {
            aVar.registerAdapterDataObserver(this.f69146c);
        }
    }

    public void onDetachAdapter(RecyclerView.a aVar) {
        if (aVar != null) {
            aVar.unregisterAdapterDataObserver(this.f69146c);
        }
    }

    public String onGetAccessibilityClassName() {
        if (handlesGetAccessibilityClassName()) {
            return "androidx.viewpager.widget.ViewPager";
        }
        throw new IllegalStateException();
    }

    public void onInitialize(androidx.viewpager2.widget.a aVar, RecyclerView recyclerView) {
        z1.setImportantForAccessibility(recyclerView, 2);
        this.f69146c = new l(this);
        ViewPager2 viewPager2 = this.f69147d;
        if (z1.getImportantForAccessibility(viewPager2) == 0) {
            z1.setImportantForAccessibility(viewPager2, 1);
        }
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int itemCount;
        int itemCount2;
        int itemCount3;
        y3.c cVarWrap = y3.c.wrap(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.f69147d;
        if (viewPager2.getAdapter() == null) {
            itemCount = 0;
            itemCount2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            itemCount = viewPager2.getAdapter().getItemCount();
            itemCount2 = 1;
        } else {
            itemCount2 = viewPager2.getAdapter().getItemCount();
            itemCount = 1;
        }
        cVarWrap.setCollectionInfo(y3.j.obtain(itemCount, itemCount2, false, 0));
        RecyclerView.a adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount3 = adapter.getItemCount()) == 0 || !viewPager2.isUserInputEnabled()) {
            return;
        }
        if (viewPager2.f7384f > 0) {
            cVarWrap.addAction(Segment.SIZE);
        }
        if (viewPager2.f7384f < itemCount3 - 1) {
            cVarWrap.addAction(4096);
        }
        cVarWrap.setScrollable(true);
    }

    public boolean onPerformAccessibilityAction(int i10, Bundle bundle) {
        if (!handlesPerformAccessibilityAction(i10, bundle)) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = this.f69147d;
        int currentItem = i10 == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.isUserInputEnabled()) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    public void onRestorePendingState() {
        a();
    }

    public void onRvInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.f69147d);
        accessibilityEvent.setClassName(onGetAccessibilityClassName());
    }

    public void onSetLayoutDirection() {
        a();
    }

    public void onSetNewCurrentItem() {
        a();
    }

    public void onSetOrientation() {
        a();
    }

    public void onSetUserInputEnabled() {
        a();
    }
}

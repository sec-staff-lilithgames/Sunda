package j6;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends RecyclerView {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewPager2 f69149b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ViewPager2 viewPager2, Context context) {
        super(context);
        this.f69149b = viewPager2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f69149b.f7400v.getClass();
        return super.getAccessibilityClassName();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        ViewPager2 viewPager2 = this.f69149b;
        accessibilityEvent.setFromIndex(viewPager2.f7384f);
        accessibilityEvent.setToIndex(viewPager2.f7384f);
        viewPager2.f7400v.onRvInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f69149b.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f69149b.isUserInputEnabled() && super.onTouchEvent(motionEvent);
    }
}

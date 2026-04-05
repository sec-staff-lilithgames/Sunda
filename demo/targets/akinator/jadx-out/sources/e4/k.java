package e4;

import android.widget.ListView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k extends c {

    /* renamed from: u, reason: collision with root package name */
    public final ListView f53736u;

    public k(ListView listView) {
        super(listView);
        this.f53736u = listView;
    }

    @Override // e4.c
    public boolean canTargetScrollHorizontally(int i10) {
        return false;
    }

    @Override // e4.c
    public boolean canTargetScrollVertically(int i10) {
        ListView listView = this.f53736u;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // e4.c
    public void scrollTargetBy(int i10, int i11) {
        this.f53736u.scrollListBy(i11);
    }
}

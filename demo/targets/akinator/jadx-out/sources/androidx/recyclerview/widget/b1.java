package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7058a;

    /* renamed from: b, reason: collision with root package name */
    public int f7059b;

    /* renamed from: c, reason: collision with root package name */
    public int f7060c;

    /* renamed from: d, reason: collision with root package name */
    public int f7061d;

    /* renamed from: e, reason: collision with root package name */
    public int f7062e;

    /* renamed from: f, reason: collision with root package name */
    public int f7063f;

    /* renamed from: g, reason: collision with root package name */
    public int f7064g;

    /* renamed from: h, reason: collision with root package name */
    public int f7065h;

    /* renamed from: i, reason: collision with root package name */
    public int f7066i;

    /* renamed from: j, reason: collision with root package name */
    public int f7067j;

    /* renamed from: k, reason: collision with root package name */
    public List f7068k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7069l;

    public final View a(RecyclerView.j jVar) {
        List list = this.f7068k;
        if (list == null) {
            View viewForPosition = jVar.getViewForPosition(this.f7061d);
            this.f7061d += this.f7062e;
            return viewForPosition;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = ((RecyclerView.n) this.f7068k.get(i10)).itemView;
            RecyclerView.g gVar = (RecyclerView.g) view.getLayoutParams();
            if (!gVar.isItemRemoved() && this.f7061d == gVar.getViewLayoutPosition()) {
                assignPositionFromScrapList(view);
                return view;
            }
        }
        return null;
    }

    public void assignPositionFromScrapList() {
        assignPositionFromScrapList(null);
    }

    public View nextViewInLimitedList(View view) {
        int viewLayoutPosition;
        int size = this.f7068k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((RecyclerView.n) this.f7068k.get(i11)).itemView;
            RecyclerView.g gVar = (RecyclerView.g) view3.getLayoutParams();
            if (view3 != view && !gVar.isItemRemoved() && (viewLayoutPosition = (gVar.getViewLayoutPosition() - this.f7061d) * this.f7062e) >= 0 && viewLayoutPosition < i10) {
                if (viewLayoutPosition == 0) {
                    return view3;
                }
                view2 = view3;
                i10 = viewLayoutPosition;
            }
        }
        return view2;
    }

    public void assignPositionFromScrapList(View view) {
        View viewNextViewInLimitedList = nextViewInLimitedList(view);
        if (viewNextViewInLimitedList == null) {
            this.f7061d = -1;
        } else {
            this.f7061d = ((RecyclerView.g) viewNextViewInLimitedList.getLayoutParams()).getViewLayoutPosition();
        }
    }
}

package ja;

import android.database.DataSetObserver;
import com.digidust.elokence.akinator.graphic.vote.SwipeDeck;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDeck f69204a;

    public a(SwipeDeck swipeDeck) {
        this.f69204a = swipeDeck;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        super.onChanged();
        SwipeDeck swipeDeck = this.f69204a;
        int childCount = swipeDeck.getChildCount();
        if (childCount < SwipeDeck.f21797t) {
            while (childCount < SwipeDeck.f21797t) {
                swipeDeck.a();
                childCount++;
            }
            for (int i10 = 0; i10 < swipeDeck.getChildCount(); i10++) {
                swipeDeck.b(i10);
            }
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        SwipeDeck swipeDeck = this.f69204a;
        swipeDeck.f21809n = 0;
        swipeDeck.removeAllViews();
        swipeDeck.requestLayout();
    }
}

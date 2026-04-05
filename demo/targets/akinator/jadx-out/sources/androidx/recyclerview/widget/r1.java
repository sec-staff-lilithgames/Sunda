package androidx.recyclerview.widget;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7232b;

    public r1(RecyclerView recyclerView) {
        this.f7232b = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f7232b;
        if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
            return;
        }
        if (!recyclerView.mIsAttached) {
            recyclerView.requestLayout();
        } else if (recyclerView.mLayoutSuppressed) {
            recyclerView.mLayoutWasDefered = true;
        } else {
            recyclerView.consumePendingUpdateOperations();
        }
    }
}

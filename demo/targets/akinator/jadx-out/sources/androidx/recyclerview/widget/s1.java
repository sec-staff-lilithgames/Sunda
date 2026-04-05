package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f7266b;

    public s1(RecyclerView recyclerView) {
        this.f7266b = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        RecyclerView recyclerView = this.f7266b;
        RecyclerView.d dVar = recyclerView.mItemAnimator;
        if (dVar != null) {
            dVar.runPendingAnimations();
        }
        recyclerView.mPostedAnimatorRunner = false;
    }
}

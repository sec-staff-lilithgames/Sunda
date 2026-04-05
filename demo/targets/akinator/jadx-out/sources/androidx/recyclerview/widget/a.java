package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface a {
    RecyclerView.n findViewHolder(int i10);

    void markViewHoldersUpdated(int i10, int i11, Object obj);

    void offsetPositionsForAdd(int i10, int i11);

    void offsetPositionsForMove(int i10, int i11);

    void offsetPositionsForRemovingInvisible(int i10, int i11);

    void offsetPositionsForRemovingLaidOutOrNewView(int i10, int i11);

    void onDispatchFirstPass(b bVar);

    void onDispatchSecondPass(b bVar);
}

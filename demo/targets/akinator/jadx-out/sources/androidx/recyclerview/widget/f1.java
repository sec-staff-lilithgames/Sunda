package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f1 extends RecyclerView.a {
    final l mDiffer;
    private final j mListener;

    public f1(j0 j0Var) {
        e1 e1Var = new e1(this);
        this.mListener = e1Var;
        l lVar = new l(new d(this), new e(j0Var).build());
        this.mDiffer = lVar;
        lVar.addListListener(e1Var);
    }

    public List<Object> getCurrentList() {
        return this.mDiffer.getCurrentList();
    }

    public Object getItem(int i10) {
        return this.mDiffer.getCurrentList().get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.mDiffer.getCurrentList().size();
    }

    public void submitList(List<Object> list) {
        this.mDiffer.submitList(list);
    }

    public void submitList(List<Object> list, Runnable runnable) {
        this.mDiffer.submitList(list, runnable);
    }

    public void onCurrentListChanged(List<Object> list, List<Object> list2) {
    }
}

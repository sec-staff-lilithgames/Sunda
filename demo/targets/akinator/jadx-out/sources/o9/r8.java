package o9;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r8 implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s8 f78489b;

    public r8(s8 s8Var) {
        this.f78489b = s8Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        s8 s8Var = this.f78489b;
        if (s8Var.f78542i.getSelectedItemsIndex().contains(Integer.valueOf(i10))) {
            s8Var.f78542i.removeSelectedItem(Integer.valueOf(i10));
            return;
        }
        if (!ca.m.sharedInstance().isSignalementDoublonsEnabledForCurrentInstance()) {
            s8Var.f78542i.unselectAll(false);
        }
        s8Var.f78542i.addSelectedItem(Integer.valueOf(i10));
        if (ca.m.sharedInstance().isSignalementDoublonsEnabledForCurrentInstance()) {
            return;
        }
        s8Var.f78123b.manageNextFragment();
    }
}

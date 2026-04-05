package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f4760b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController f4761c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AlertController.a f4762e;

    public k(AlertController.a aVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f4762e = aVar;
        this.f4760b = recycleListView;
        this.f4761c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        AlertController.a aVar = this.f4762e;
        boolean[] zArr = aVar.E;
        AlertController.RecycleListView recycleListView = this.f4760b;
        if (zArr != null) {
            zArr[i10] = recycleListView.isItemChecked(i10);
        }
        aVar.I.onClick(this.f4761c.f4662b, i10, recycleListView.isItemChecked(i10));
    }
}

package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j implements AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f4757b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.a f4758c;

    public j(AlertController.a aVar, AlertController alertController) {
        this.f4758c = aVar;
        this.f4757b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        AlertController.a aVar = this.f4758c;
        DialogInterface.OnClickListener onClickListener = aVar.f4711w;
        v0 v0Var = this.f4757b.f4662b;
        onClickListener.onClick(v0Var, i10);
        if (aVar.G) {
            return;
        }
        v0Var.dismiss();
    }
}

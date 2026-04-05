package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import androidx.appcompat.app.AlertController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends CursorAdapter {

    /* renamed from: b, reason: collision with root package name */
    public final int f4748b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4749c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f4750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AlertController f4751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AlertController.a f4752g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(AlertController.a aVar, Context context, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super(context, cursor, false);
        this.f4752g = aVar;
        this.f4750e = recycleListView;
        this.f4751f = alertController;
        Cursor cursor2 = getCursor();
        this.f4748b = cursor2.getColumnIndexOrThrow(aVar.K);
        this.f4749c = cursor2.getColumnIndexOrThrow(aVar.L);
    }

    @Override // android.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f4748b));
        this.f4750e.setItemChecked(cursor.getPosition(), cursor.getInt(this.f4749c) == 1);
    }

    @Override // android.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4752g.f4690b.inflate(this.f4751f.M, viewGroup, false);
    }
}

package f4;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f extends c {

    /* renamed from: l, reason: collision with root package name */
    public int f55352l;

    /* renamed from: m, reason: collision with root package name */
    public int f55353m;

    /* renamed from: n, reason: collision with root package name */
    public final LayoutInflater f55354n;

    @Deprecated
    public f(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.f55353m = i10;
        this.f55352l = i10;
        this.f55354n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // f4.c
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f55354n.inflate(this.f55353m, viewGroup, false);
    }

    @Override // f4.c
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f55354n.inflate(this.f55352l, viewGroup, false);
    }

    public void setDropDownViewResource(int i10) {
        this.f55353m = i10;
    }

    public void setViewResource(int i10) {
        this.f55352l = i10;
    }

    @Deprecated
    public f(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f55353m = i10;
        this.f55352l = i10;
        this.f55354n = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public f(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.f55353m = i10;
        this.f55352l = i10;
        this.f55354n = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}

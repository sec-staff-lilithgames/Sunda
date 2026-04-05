package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p.c0;
import p.l;
import p.m;
import p.q;
import q.n3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements l, c0, AdapterView.OnItemClickListener {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4913c = {R.attr.background, R.attr.divider};

    /* renamed from: b, reason: collision with root package name */
    public m f4914b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // p.c0
    public int getWindowAnimations() {
        return 0;
    }

    @Override // p.c0
    public void initialize(m mVar) {
        this.f4914b = mVar;
    }

    @Override // p.l
    public boolean invokeItem(q qVar) {
        return this.f4914b.performItemAction(qVar, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        invokeItem((q) getAdapter().getItem(i10));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        n3 n3VarObtainStyledAttributes = n3.obtainStyledAttributes(context, attributeSet, f4913c, i10, 0);
        if (n3VarObtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable(n3VarObtainStyledAttributes.getDrawable(0));
        }
        if (n3VarObtainStyledAttributes.hasValue(1)) {
            setDivider(n3VarObtainStyledAttributes.getDrawable(1));
        }
        n3VarObtainStyledAttributes.recycle();
    }
}

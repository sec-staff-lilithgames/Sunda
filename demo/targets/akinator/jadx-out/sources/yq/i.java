package yq;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cr.q;
import dq.v;
import ir.t;
import o9.j0;
import um.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class i extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f94816e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final e f94817b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageView f94818c;

    public i(Context context) {
        this(context, null, 0);
    }

    public void a() {
        t.hideViewSafely(this);
        t.hideViewSafely(this.f94817b);
        t.hideViewSafely(this.f94818c);
    }

    public void c() {
        t.showViewSafely(this);
        t.hideViewSafely(this.f94817b);
        t.hideViewSafely(this.f94818c);
    }

    public i(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        ImageView imageView = new ImageView(context);
        imageView.setImageBitmap(v.b("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"));
        imageView.setOnClickListener(new j0(this, 16));
        imageView.setColorFilter(v.f52537c);
        this.f94818c = imageView;
        e eVar = new e(context);
        eVar.setOnClickListener(new j0(this, 16));
        eVar.setListener(new g(this));
        this.f94817b = eVar;
        um.d dVar = new um.d(context);
        dVar.setStyle(new p().copyWith(um.a.f88535n));
        int iDpToPx = q.dpToPx(getContext(), 48.0f);
        int iDpToPx2 = q.dpToPx(getContext(), 30.0f);
        addView(dVar, new FrameLayout.LayoutParams(iDpToPx, iDpToPx, 17));
        addView(eVar, new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, 8388661));
        addView(imageView, new FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, 8388661));
    }

    public void setListener(h hVar) {
    }
}

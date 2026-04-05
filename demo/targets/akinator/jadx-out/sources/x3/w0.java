package x3;

import android.view.ScrollFeedbackProvider;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 implements y0 {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f91698a;

    public w0(View view) {
        this.f91698a = ScrollFeedbackProvider.createProvider(view);
    }

    @Override // x3.y0
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f91698a.onScrollLimit(i10, i11, i12, z10);
    }

    @Override // x3.y0
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f91698a.onScrollProgress(i10, i11, i12, i13);
    }

    @Override // x3.y0
    public void onSnapToItem(int i10, int i11, int i12) {
        this.f91698a.onSnapToItem(i10, i11, i12);
    }
}

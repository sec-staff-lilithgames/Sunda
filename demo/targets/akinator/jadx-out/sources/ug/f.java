package ug;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f88484a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextPaint f88485b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f88486c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f88487d;

    public f(g gVar, Context context, TextPaint textPaint, i iVar) {
        this.f88487d = gVar;
        this.f88484a = context;
        this.f88485b = textPaint;
        this.f88486c = iVar;
    }

    @Override // ug.i
    public void onFontRetrievalFailed(int i10) {
        this.f88486c.onFontRetrievalFailed(i10);
    }

    @Override // ug.i
    public void onFontRetrieved(Typeface typeface, boolean z10) {
        this.f88487d.updateTextPaintMeasureState(this.f88484a, this.f88485b, typeface);
        this.f88486c.onFontRetrieved(typeface, z10);
    }
}

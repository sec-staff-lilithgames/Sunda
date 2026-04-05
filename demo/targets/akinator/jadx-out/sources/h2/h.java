package h2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f58648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CharSequence f58649f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextPaint f58650g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.f58648e = jVar;
        this.f58649f = charSequence;
        this.f58650g = textPaint;
    }

    @Override // kv.a
    public final Float invoke() {
        BoringLayout.Metrics boringMetrics = this.f58648e.getBoringMetrics();
        TextPaint textPaint = this.f58650g;
        CharSequence charSequence = this.f58649f;
        float desiredWidth = boringMetrics != null ? boringMetrics.width : Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint);
        if (k.access$shouldIncreaseMaxIntrinsic(desiredWidth, charSequence, textPaint)) {
            desiredWidth += 0.5f;
        }
        return Float.valueOf(desiredWidth);
    }
}

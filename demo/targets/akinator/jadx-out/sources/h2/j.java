package h2;

import android.text.BoringLayout;
import android.text.TextPaint;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final tu.o f58653a;

    /* renamed from: b, reason: collision with root package name */
    public final tu.o f58654b;

    /* renamed from: c, reason: collision with root package name */
    public final tu.o f58655c;

    public j(CharSequence charSequence, TextPaint textPaint, int i10) {
        e0.checkNotNullParameter(charSequence, "charSequence");
        e0.checkNotNullParameter(textPaint, "textPaint");
        tu.s sVar = tu.s.f87405e;
        this.f58653a = tu.q.lazy(sVar, (kv.a) new g(charSequence, textPaint, i10));
        this.f58654b = tu.q.lazy(sVar, (kv.a) new i(charSequence, textPaint));
        this.f58655c = tu.q.lazy(sVar, (kv.a) new h(this, charSequence, textPaint));
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        return (BoringLayout.Metrics) this.f58653a.getValue();
    }

    public final float getMaxIntrinsicWidth() {
        return ((Number) this.f58655c.getValue()).floatValue();
    }

    public final float getMinIntrinsicWidth() {
        return ((Number) this.f58654b.getValue()).floatValue();
    }
}

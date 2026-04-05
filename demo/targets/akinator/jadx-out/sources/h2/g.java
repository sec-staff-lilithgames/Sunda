package h2;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f58645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CharSequence f58646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ TextPaint f58647g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(CharSequence charSequence, TextPaint textPaint, int i10) {
        super(0);
        this.f58645e = i10;
        this.f58646f = charSequence;
        this.f58647g = textPaint;
    }

    @Override // kv.a
    public final BoringLayout.Metrics invoke() {
        TextDirectionHeuristic textDirectionHeuristic = x.getTextDirectionHeuristic(this.f58645e);
        return a.f58625a.measure(this.f58646f, this.f58647g, textDirectionHeuristic);
    }
}

package h2;

import android.text.TextPaint;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CharSequence f58651e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TextPaint f58652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.f58651e = charSequence;
        this.f58652f = textPaint;
    }

    @Override // kv.a
    public final Float invoke() {
        return Float.valueOf(k.minIntrinsicWidth(this.f58651e, this.f58652f));
    }
}

package h2;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f58625a = new a();

    public final BoringLayout create(CharSequence text, TextPaint paint, int i10, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z10, TextUtils.TruncateAt truncateAt, int i11) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(paint, "paint");
        e0.checkNotNullParameter(metrics, "metrics");
        e0.checkNotNullParameter(alignment, "alignment");
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i11 >= 0) {
            return truncateAt == null ? new BoringLayout(text, paint, i10, alignment, 1.0f, 0.0f, metrics, z10) : new BoringLayout(text, paint, i10, alignment, 1.0f, 0.0f, metrics, z10, truncateAt, i11);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final BoringLayout.Metrics measure(CharSequence text, TextPaint textPaint, TextDirectionHeuristic textDir) {
        e0.checkNotNullParameter(text, "text");
        e0.checkNotNullParameter(textDir, "textDir");
        if (textDir.isRtl(text, 0, text.length())) {
            return null;
        }
        return BoringLayout.isBoring(text, textPaint, null);
    }
}

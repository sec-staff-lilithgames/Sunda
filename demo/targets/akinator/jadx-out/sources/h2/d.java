package h2;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f58633a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f58634b = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: c, reason: collision with root package name */
    public static final TextDirectionHeuristic f58635c;

    static {
        TextDirectionHeuristic FIRSTSTRONG_LTR = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        e0.checkNotNullExpressionValue(FIRSTSTRONG_LTR, "FIRSTSTRONG_LTR");
        f58635c = FIRSTSTRONG_LTR;
    }

    public final Layout.Alignment getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() {
        return f58634b;
    }

    public final TextDirectionHeuristic getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() {
        return f58635c;
    }
}

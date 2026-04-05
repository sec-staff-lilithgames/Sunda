package p2;

import android.text.style.TtsSpan;
import g2.f2;
import g2.g2;
import kotlin.jvm.internal.e0;
import tu.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static final TtsSpan toSpan(f2 f2Var) {
        e0.checkNotNullParameter(f2Var, "<this>");
        if (f2Var instanceof g2) {
            return toSpan((g2) f2Var);
        }
        throw new t();
    }

    public static final TtsSpan toSpan(g2 g2Var) {
        e0.checkNotNullParameter(g2Var, "<this>");
        TtsSpan ttsSpanBuild = new TtsSpan.VerbatimBuilder(g2Var.getVerbatim()).build();
        e0.checkNotNullExpressionValue(ttsSpanBuild, "builder.build()");
        return ttsSpanBuild;
    }
}

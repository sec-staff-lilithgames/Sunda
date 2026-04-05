package z1;

import com.ironsource.C3191e4;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f97286a;

    /* renamed from: b, reason: collision with root package name */
    public final j f97287b;

    /* renamed from: c, reason: collision with root package name */
    public final List f97288c;

    public c1(b0 root, j relayoutNodes, List<b0> postponedMeasureRequests) {
        kotlin.jvm.internal.e0.checkNotNullParameter(root, "root");
        kotlin.jvm.internal.e0.checkNotNullParameter(relayoutNodes, "relayoutNodes");
        kotlin.jvm.internal.e0.checkNotNullParameter(postponedMeasureRequests, "postponedMeasureRequests");
        this.f97286a = root;
        this.f97287b = relayoutNodes;
        this.f97288c = postponedMeasureRequests;
    }

    public static final void c(c1 c1Var, StringBuilder sb2, b0 b0Var, int i10) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(b0Var);
        sb3.append(C3191e4.i.f36529d + b0Var.getLayoutState$ui_release() + AbstractJsonLexerKt.END_LIST);
        if (!b0Var.isPlaced()) {
            sb3.append("[!isPlaced]");
        }
        sb3.append("[measuredByParent=" + b0Var.getMeasuredByParent$ui_release() + AbstractJsonLexerKt.END_LIST);
        if (!c1Var.a(b0Var)) {
            sb3.append("[INCONSISTENT]");
        }
        String string = sb3.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "with(StringBuilder()) {\n…     toString()\n        }");
        if (string.length() > 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("..");
            }
            sb2.append(string);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append('\\n')");
            i10++;
        }
        List<b0> children$ui_release = b0Var.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            c(c1Var, sb2, children$ui_release.get(i12), i10);
        }
    }

    public final boolean a(b0 b0Var) {
        b0 parent$ui_release = b0Var.getParent$ui_release();
        if ((!b0Var.isPlaced() && (b0Var.getPlaceOrder$ui_release() == Integer.MAX_VALUE || parent$ui_release == null || !parent$ui_release.isPlaced())) || (b0Var.getMeasurePending$ui_release() && this.f97288c.contains(b0Var))) {
            return true;
        }
        c0 layoutState$ui_release = parent$ui_release != null ? parent$ui_release.getLayoutState$ui_release() : null;
        boolean measurePending$ui_release = b0Var.getMeasurePending$ui_release();
        c0 c0Var = c0.f97282b;
        j jVar = this.f97287b;
        return measurePending$ui_release ? jVar.contains(b0Var) || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || layoutState$ui_release == c0Var : !b0Var.getLayoutPending$ui_release() || jVar.contains(b0Var) || (parent$ui_release != null && parent$ui_release.getMeasurePending$ui_release()) || ((parent$ui_release != null && parent$ui_release.getLayoutPending$ui_release()) || layoutState$ui_release == c0Var || layoutState$ui_release == c0.f97283c);
    }

    public final void assertConsistent() {
        b0 b0Var = this.f97286a;
        if (b(b0Var)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Tree state:");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(value)");
        sb2.append('\n');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append('\\n')");
        c(this, sb2, b0Var, 0);
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        System.out.println((Object) string);
        throw new IllegalStateException("Inconsistency found!");
    }

    public final boolean b(b0 b0Var) {
        if (!a(b0Var)) {
            return false;
        }
        List<b0> children$ui_release = b0Var.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!b(children$ui_release.get(i10))) {
                return false;
            }
        }
        return true;
    }
}

package q;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c1 extends b1 {
    @Override // q.b1, q.d1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // q.d1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}

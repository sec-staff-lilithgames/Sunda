package a2;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import g2.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n {
    public static final g2.b convertToAnnotatedString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new g2.b(charSequence.toString(), null, null, 6, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotations = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(annotations, "annotations");
        int lastIndex = uu.k0.getLastIndex(annotations);
        if (lastIndex >= 0) {
            while (true) {
                Annotation annotation = annotations[i10];
                if (kotlin.jvm.internal.e0.areEqual(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    String value = annotation.getValue();
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(value, "span.value");
                    arrayList.add(new b.C0570b(new b3(value).decodeSpanStyle(), spanStart, spanEnd));
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return new g2.b(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence convertToCharSequence(g2.b bVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        if (bVar.getSpanStyles().isEmpty()) {
            return bVar.getText();
        }
        SpannableString spannableString = new SpannableString(bVar.getText());
        k3 k3Var = new k3();
        List<b.C0570b> spanStyles = bVar.getSpanStyles();
        int size = spanStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            b.C0570b c0570b = spanStyles.get(i10);
            g2.r1 r1Var = (g2.r1) c0570b.component1();
            int iComponent2 = c0570b.component2();
            int iComponent3 = c0570b.component3();
            k3Var.reset();
            k3Var.encode(r1Var);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", k3Var.encodedString()), iComponent2, iComponent3, 33);
        }
        return spannableString;
    }
}

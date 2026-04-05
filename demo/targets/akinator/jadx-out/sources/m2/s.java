package m2;

import android.view.inputmethod.ExtractedText;
import g2.a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s {
    public static final ExtractedText toExtractedText(j0 j0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(j0Var, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = j0Var.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = j0Var.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = a2.m3958getMinimpl(j0Var.m5591getSelectiond9O1mEE());
        extractedText.selectionEnd = a2.m3957getMaximpl(j0Var.m5591getSelectiond9O1mEE());
        extractedText.flags = !sv.n0.contains$default((CharSequence) j0Var.getText(), '\n', false, 2, (Object) null) ? 1 : 0;
        return extractedText;
    }
}

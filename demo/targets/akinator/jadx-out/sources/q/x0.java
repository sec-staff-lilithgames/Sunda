package q;

import android.view.textclassifier.TextClassifier;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class x0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppCompatTextView f82295a;

    public x0(AppCompatTextView appCompatTextView) {
        this.f82295a = appCompatTextView;
    }

    @Override // q.w0
    public int getAutoSizeMaxTextSize() {
        return super/*android.widget.TextView*/.getAutoSizeMaxTextSize();
    }

    @Override // q.w0
    public int getAutoSizeMinTextSize() {
        return super/*android.widget.TextView*/.getAutoSizeMinTextSize();
    }

    @Override // q.w0
    public int getAutoSizeStepGranularity() {
        return super/*android.widget.TextView*/.getAutoSizeStepGranularity();
    }

    @Override // q.w0
    public int[] getAutoSizeTextAvailableSizes() {
        return super/*android.widget.TextView*/.getAutoSizeTextAvailableSizes();
    }

    @Override // q.w0
    public int getAutoSizeTextType() {
        return super/*android.widget.TextView*/.getAutoSizeTextType();
    }

    @Override // q.w0
    public TextClassifier getTextClassifier() {
        return super/*android.widget.TextView*/.getTextClassifier();
    }

    @Override // q.w0
    public void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
    }

    @Override // q.w0
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
    }

    @Override // q.w0
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        super/*android.widget.TextView*/.setAutoSizeTextTypeWithDefaults(i10);
    }

    @Override // q.w0
    public void setTextClassifier(TextClassifier textClassifier) {
        super/*android.widget.TextView*/.setTextClassifier(textClassifier);
    }

    @Override // q.w0
    public void setFirstBaselineToTopHeight(int i10) {
    }

    @Override // q.w0
    public void setLastBaselineToBottomHeight(int i10) {
    }

    @Override // q.w0
    public void setLineHeight(int i10, float f10) {
    }
}

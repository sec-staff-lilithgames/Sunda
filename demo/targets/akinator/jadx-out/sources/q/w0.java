package q;

import android.view.textclassifier.TextClassifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface w0 {
    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    TextClassifier getTextClassifier();

    void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13);

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10);

    void setAutoSizeTextTypeWithDefaults(int i10);

    void setFirstBaselineToTopHeight(int i10);

    void setLastBaselineToBottomHeight(int i10);

    void setLineHeight(int i10, float f10);

    void setTextClassifier(TextClassifier textClassifier);
}

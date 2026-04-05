package io.bidmachine;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class LabelData {
    private final float heightDp;
    private final Bitmap image;
    private final PositionData positionData;
    private final float widthDp;

    public LabelData(float f10, float f11, Bitmap image, PositionData positionData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        kotlin.jvm.internal.e0.checkNotNullParameter(positionData, "positionData");
        this.widthDp = f10;
        this.heightDp = f11;
        this.image = image;
        this.positionData = positionData;
    }

    public static /* synthetic */ LabelData copy$default(LabelData labelData, float f10, float f11, Bitmap bitmap, PositionData positionData, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = labelData.widthDp;
        }
        if ((i10 & 2) != 0) {
            f11 = labelData.heightDp;
        }
        if ((i10 & 4) != 0) {
            bitmap = labelData.image;
        }
        if ((i10 & 8) != 0) {
            positionData = labelData.positionData;
        }
        return labelData.copy(f10, f11, bitmap, positionData);
    }

    public final float component1() {
        return this.widthDp;
    }

    public final float component2() {
        return this.heightDp;
    }

    public final Bitmap component3() {
        return this.image;
    }

    public final PositionData component4() {
        return this.positionData;
    }

    public final LabelData copy(float f10, float f11, Bitmap image, PositionData positionData) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        kotlin.jvm.internal.e0.checkNotNullParameter(positionData, "positionData");
        return new LabelData(f10, f11, image, positionData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelData)) {
            return false;
        }
        LabelData labelData = (LabelData) obj;
        return Float.compare(this.widthDp, labelData.widthDp) == 0 && Float.compare(this.heightDp, labelData.heightDp) == 0 && kotlin.jvm.internal.e0.areEqual(this.image, labelData.image) && this.positionData == labelData.positionData;
    }

    public final float getHeightDp() {
        return this.heightDp;
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final PositionData getPositionData() {
        return this.positionData;
    }

    public final float getWidthDp() {
        return this.widthDp;
    }

    public int hashCode() {
        return this.positionData.hashCode() + ((this.image.hashCode() + b0.e2.b(this.heightDp, Float.hashCode(this.widthDp) * 31, 31)) * 31);
    }

    public String toString() {
        return "LabelData(widthDp=" + this.widthDp + ", heightDp=" + this.heightDp + ", image=" + this.image + ", positionData=" + this.positionData + ')';
    }
}

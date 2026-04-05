package io.bidmachine;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class PrivacySheetData {
    private final LabelData labelData;
    private final br.p1 privacySheetParams;

    public PrivacySheetData(LabelData labelData, br.p1 privacySheetParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(labelData, "labelData");
        kotlin.jvm.internal.e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        this.labelData = labelData;
        this.privacySheetParams = privacySheetParams;
    }

    public static /* synthetic */ PrivacySheetData copy$default(PrivacySheetData privacySheetData, LabelData labelData, br.p1 p1Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            labelData = privacySheetData.labelData;
        }
        if ((i10 & 2) != 0) {
            p1Var = privacySheetData.privacySheetParams;
        }
        return privacySheetData.copy(labelData, p1Var);
    }

    public final LabelData component1() {
        return this.labelData;
    }

    public final br.p1 component2() {
        return this.privacySheetParams;
    }

    public final PrivacySheetData copy(LabelData labelData, br.p1 privacySheetParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(labelData, "labelData");
        kotlin.jvm.internal.e0.checkNotNullParameter(privacySheetParams, "privacySheetParams");
        return new PrivacySheetData(labelData, privacySheetParams);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySheetData)) {
            return false;
        }
        PrivacySheetData privacySheetData = (PrivacySheetData) obj;
        return kotlin.jvm.internal.e0.areEqual(this.labelData, privacySheetData.labelData) && kotlin.jvm.internal.e0.areEqual(this.privacySheetParams, privacySheetData.privacySheetParams);
    }

    public final LabelData getLabelData() {
        return this.labelData;
    }

    public final br.p1 getPrivacySheetParams() {
        return this.privacySheetParams;
    }

    public int hashCode() {
        return this.privacySheetParams.hashCode() + (this.labelData.hashCode() * 31);
    }

    public String toString() {
        return "PrivacySheetData(labelData=" + this.labelData + ", privacySheetParams=" + this.privacySheetParams + ')';
    }
}

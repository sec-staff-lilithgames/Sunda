package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class s5 extends GeneratedMessageLite.Builder implements t5 {
    public s5 clearAccessibilityCaptioningEnabled() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).clearAccessibilityCaptioningEnabled();
        return this;
    }

    public s5 clearAccessibilityLargePointerIcon() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).clearAccessibilityLargePointerIcon();
        return this;
    }

    public s5 clearFontScale() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).clearFontScale();
        return this;
    }

    public s5 clearReduceBrightColorsActivated() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).clearReduceBrightColorsActivated();
        return this;
    }

    @Override // com.moloco.sdk.t5
    public boolean getAccessibilityCaptioningEnabled() {
        return ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).getAccessibilityCaptioningEnabled();
    }

    @Override // com.moloco.sdk.t5
    public boolean getAccessibilityLargePointerIcon() {
        return ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).getAccessibilityLargePointerIcon();
    }

    @Override // com.moloco.sdk.t5
    public float getFontScale() {
        return ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).getFontScale();
    }

    @Override // com.moloco.sdk.t5
    public boolean getReduceBrightColorsActivated() {
        return ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).getReduceBrightColorsActivated();
    }

    @Override // com.moloco.sdk.t5
    public boolean hasAccessibilityCaptioningEnabled() {
        return ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).hasAccessibilityCaptioningEnabled();
    }

    @Override // com.moloco.sdk.t5
    public boolean hasAccessibilityLargePointerIcon() {
        return ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).hasAccessibilityLargePointerIcon();
    }

    @Override // com.moloco.sdk.t5
    public boolean hasFontScale() {
        return ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).hasFontScale();
    }

    @Override // com.moloco.sdk.t5
    public boolean hasReduceBrightColorsActivated() {
        return ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).hasReduceBrightColorsActivated();
    }

    public s5 setAccessibilityCaptioningEnabled(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).setAccessibilityCaptioningEnabled(z10);
        return this;
    }

    public s5 setAccessibilityLargePointerIcon(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).setAccessibilityLargePointerIcon(z10);
        return this;
    }

    public s5 setFontScale(float f10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).setFontScale(f10);
        return this;
    }

    public s5 setReduceBrightColorsActivated(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.AccessibilityInfo) this.instance).setReduceBrightColorsActivated(z10);
        return this;
    }
}

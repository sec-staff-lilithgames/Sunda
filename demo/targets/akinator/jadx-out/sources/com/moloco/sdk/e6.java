package com.moloco.sdk;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e6 extends GeneratedMessageLite.Builder implements f6 {
    public e6 clearBatteryStatus() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).clearBatteryStatus();
        return this;
    }

    public e6 clearLowPowMode() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).clearLowPowMode();
        return this;
    }

    public e6 clearMaxBatteryLevel() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).clearMaxBatteryLevel();
        return this;
    }

    @Override // com.moloco.sdk.f6
    public d6 getBatteryStatus() {
        return ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).getBatteryStatus();
    }

    @Override // com.moloco.sdk.f6
    public int getBatteryStatusValue() {
        return ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).getBatteryStatusValue();
    }

    @Override // com.moloco.sdk.f6
    public boolean getLowPowMode() {
        return ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).getLowPowMode();
    }

    @Override // com.moloco.sdk.f6
    public int getMaxBatteryLevel() {
        return ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).getMaxBatteryLevel();
    }

    @Override // com.moloco.sdk.f6
    public boolean hasBatteryStatus() {
        return ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).hasBatteryStatus();
    }

    @Override // com.moloco.sdk.f6
    public boolean hasLowPowMode() {
        return ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).hasLowPowMode();
    }

    @Override // com.moloco.sdk.f6
    public boolean hasMaxBatteryLevel() {
        return ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).hasMaxBatteryLevel();
    }

    public e6 setBatteryStatus(d6 d6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).setBatteryStatus(d6Var);
        return this;
    }

    public e6 setBatteryStatusValue(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).setBatteryStatusValue(i10);
        return this;
    }

    public e6 setLowPowMode(boolean z10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).setLowPowMode(z10);
        return this;
    }

    public e6 setMaxBatteryLevel(int i10) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents.BatteryInfo) this.instance).setMaxBatteryLevel(i10);
        return this;
    }
}

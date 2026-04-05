package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidToken$ClientBidTokenComponents;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g6 extends GeneratedMessageLite.Builder implements f7 {
    public g6 clearAccessibilityInfo() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearAccessibilityInfo();
        return this;
    }

    public g6 clearAdInfo() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearAdInfo();
        return this;
    }

    public g6 clearAudioInfo() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearAudioInfo();
        return this;
    }

    public g6 clearBatteryInfo() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearBatteryInfo();
        return this;
    }

    public g6 clearDevice() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearDevice();
        return this;
    }

    public g6 clearDirInfo() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearDirInfo();
        return this;
    }

    public g6 clearIdfv() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearIdfv();
        return this;
    }

    public g6 clearImpLvlRevData() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearImpLvlRevData();
        return this;
    }

    public g6 clearInfo() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearInfo();
        return this;
    }

    public g6 clearMemoryInfo() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearMemoryInfo();
        return this;
    }

    public g6 clearNetworkInfo() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearNetworkInfo();
        return this;
    }

    public g6 clearPrivacy() {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).clearPrivacy();
        return this;
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.AccessibilityInfo getAccessibilityInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getAccessibilityInfo();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.AdvertisingInfo getAdInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getAdInfo();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.AudioInfo getAudioInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getAudioInfo();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.BatteryInfo getBatteryInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getBatteryInfo();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.Device getDevice() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getDevice();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.DirInfo getDirInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getDirInfo();
    }

    @Override // com.moloco.sdk.f7
    public String getIdfv() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getIdfv();
    }

    @Override // com.moloco.sdk.f7
    public ByteString getIdfvBytes() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getIdfvBytes();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.ImpLvlRevData getImpLvlRevData() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getImpLvlRevData();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.SdkInfo getInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getInfo();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.MemoryInfo getMemoryInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getMemoryInfo();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.NetworkInfo getNetworkInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getNetworkInfo();
    }

    @Override // com.moloco.sdk.f7
    public BidToken$ClientBidTokenComponents.Privacy getPrivacy() {
        return ((BidToken$ClientBidTokenComponents) this.instance).getPrivacy();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasAccessibilityInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasAccessibilityInfo();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasAdInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasAdInfo();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasAudioInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasAudioInfo();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasBatteryInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasBatteryInfo();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasDevice() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasDevice();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasDirInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasDirInfo();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasIdfv() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasIdfv();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasImpLvlRevData() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasImpLvlRevData();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasInfo();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasMemoryInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasMemoryInfo();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasNetworkInfo() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasNetworkInfo();
    }

    @Override // com.moloco.sdk.f7
    public boolean hasPrivacy() {
        return ((BidToken$ClientBidTokenComponents) this.instance).hasPrivacy();
    }

    public g6 mergeAccessibilityInfo(BidToken$ClientBidTokenComponents.AccessibilityInfo accessibilityInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeAccessibilityInfo(accessibilityInfo);
        return this;
    }

    public g6 mergeAdInfo(BidToken$ClientBidTokenComponents.AdvertisingInfo advertisingInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeAdInfo(advertisingInfo);
        return this;
    }

    public g6 mergeAudioInfo(BidToken$ClientBidTokenComponents.AudioInfo audioInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeAudioInfo(audioInfo);
        return this;
    }

    public g6 mergeBatteryInfo(BidToken$ClientBidTokenComponents.BatteryInfo batteryInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeBatteryInfo(batteryInfo);
        return this;
    }

    public g6 mergeDevice(BidToken$ClientBidTokenComponents.Device device) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeDevice(device);
        return this;
    }

    public g6 mergeDirInfo(BidToken$ClientBidTokenComponents.DirInfo dirInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeDirInfo(dirInfo);
        return this;
    }

    public g6 mergeImpLvlRevData(BidToken$ClientBidTokenComponents.ImpLvlRevData impLvlRevData) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeImpLvlRevData(impLvlRevData);
        return this;
    }

    public g6 mergeInfo(BidToken$ClientBidTokenComponents.SdkInfo sdkInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeInfo(sdkInfo);
        return this;
    }

    public g6 mergeMemoryInfo(BidToken$ClientBidTokenComponents.MemoryInfo memoryInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeMemoryInfo(memoryInfo);
        return this;
    }

    public g6 mergeNetworkInfo(BidToken$ClientBidTokenComponents.NetworkInfo networkInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergeNetworkInfo(networkInfo);
        return this;
    }

    public g6 mergePrivacy(BidToken$ClientBidTokenComponents.Privacy privacy) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).mergePrivacy(privacy);
        return this;
    }

    public g6 setAccessibilityInfo(BidToken$ClientBidTokenComponents.AccessibilityInfo accessibilityInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setAccessibilityInfo(accessibilityInfo);
        return this;
    }

    public g6 setAdInfo(BidToken$ClientBidTokenComponents.AdvertisingInfo advertisingInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setAdInfo(advertisingInfo);
        return this;
    }

    public g6 setAudioInfo(BidToken$ClientBidTokenComponents.AudioInfo audioInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setAudioInfo(audioInfo);
        return this;
    }

    public g6 setBatteryInfo(BidToken$ClientBidTokenComponents.BatteryInfo batteryInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setBatteryInfo(batteryInfo);
        return this;
    }

    public g6 setDevice(BidToken$ClientBidTokenComponents.Device device) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setDevice(device);
        return this;
    }

    public g6 setDirInfo(BidToken$ClientBidTokenComponents.DirInfo dirInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setDirInfo(dirInfo);
        return this;
    }

    public g6 setIdfv(String str) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setIdfv(str);
        return this;
    }

    public g6 setIdfvBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setIdfvBytes(byteString);
        return this;
    }

    public g6 setImpLvlRevData(BidToken$ClientBidTokenComponents.ImpLvlRevData impLvlRevData) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setImpLvlRevData(impLvlRevData);
        return this;
    }

    public g6 setInfo(BidToken$ClientBidTokenComponents.SdkInfo sdkInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setInfo(sdkInfo);
        return this;
    }

    public g6 setMemoryInfo(BidToken$ClientBidTokenComponents.MemoryInfo memoryInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setMemoryInfo(memoryInfo);
        return this;
    }

    public g6 setNetworkInfo(BidToken$ClientBidTokenComponents.NetworkInfo networkInfo) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setNetworkInfo(networkInfo);
        return this;
    }

    public g6 setPrivacy(BidToken$ClientBidTokenComponents.Privacy privacy) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setPrivacy(privacy);
        return this;
    }

    public g6 setAccessibilityInfo(s5 s5Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setAccessibilityInfo((BidToken$ClientBidTokenComponents.AccessibilityInfo) s5Var.build());
        return this;
    }

    public g6 setAdInfo(u5 u5Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setAdInfo((BidToken$ClientBidTokenComponents.AdvertisingInfo) u5Var.build());
        return this;
    }

    public g6 setAudioInfo(w5 w5Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setAudioInfo((BidToken$ClientBidTokenComponents.AudioInfo) w5Var.build());
        return this;
    }

    public g6 setBatteryInfo(e6 e6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setBatteryInfo((BidToken$ClientBidTokenComponents.BatteryInfo) e6Var.build());
        return this;
    }

    public g6 setDevice(h6 h6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setDevice((BidToken$ClientBidTokenComponents.Device) h6Var.build());
        return this;
    }

    public g6 setDirInfo(m6 m6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setDirInfo((BidToken$ClientBidTokenComponents.DirInfo) m6Var.build());
        return this;
    }

    public g6 setImpLvlRevData(q6 q6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setImpLvlRevData((BidToken$ClientBidTokenComponents.ImpLvlRevData) q6Var.build());
        return this;
    }

    public g6 setInfo(d7 d7Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setInfo((BidToken$ClientBidTokenComponents.SdkInfo) d7Var.build());
        return this;
    }

    public g6 setMemoryInfo(u6 u6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setMemoryInfo((BidToken$ClientBidTokenComponents.MemoryInfo) u6Var.build());
        return this;
    }

    public g6 setNetworkInfo(w6 w6Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setNetworkInfo((BidToken$ClientBidTokenComponents.NetworkInfo) w6Var.build());
        return this;
    }

    public g6 setPrivacy(b7 b7Var) {
        copyOnWrite();
        ((BidToken$ClientBidTokenComponents) this.instance).setPrivacy((BidToken$ClientBidTokenComponents.Privacy) b7Var.build());
        return this;
    }
}

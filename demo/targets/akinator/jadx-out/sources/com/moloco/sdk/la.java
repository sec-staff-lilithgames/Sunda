package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.UserIntent$UserAdInteractionExt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class la extends GeneratedMessageLite.Builder implements lb {
    public la clearAdvertisingId() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearAdvertisingId();
        return this;
    }

    public la clearApp() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearApp();
        return this;
    }

    public la clearAppBackgroundingInteraction() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearAppBackgroundingInteraction();
        return this;
    }

    public la clearAppForegroundingInteraction() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearAppForegroundingInteraction();
        return this;
    }

    public la clearClickInteraction() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearClickInteraction();
        return this;
    }

    public la clearClientTimestamp() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearClientTimestamp();
        return this;
    }

    public la clearDevice() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearDevice();
        return this;
    }

    public la clearImpInteraction() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearImpInteraction();
        return this;
    }

    public la clearInfoExt() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearInfoExt();
        return this;
    }

    public la clearMref() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearMref();
        return this;
    }

    public la clearNetwork() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearNetwork();
        return this;
    }

    public la clearSdk() {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).clearSdk();
        return this;
    }

    @Override // com.moloco.sdk.lb
    public String getAdvertisingId() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getAdvertisingId();
    }

    @Override // com.moloco.sdk.lb
    public ByteString getAdvertisingIdBytes() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getAdvertisingIdBytes();
    }

    @Override // com.moloco.sdk.lb
    public UserIntent$UserAdInteractionExt.App getApp() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getApp();
    }

    @Override // com.moloco.sdk.lb
    public UserIntent$UserAdInteractionExt.AppBackgroundingInteraction getAppBackgroundingInteraction() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getAppBackgroundingInteraction();
    }

    @Override // com.moloco.sdk.lb
    public UserIntent$UserAdInteractionExt.AppForegroundingInteraction getAppForegroundingInteraction() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getAppForegroundingInteraction();
    }

    @Override // com.moloco.sdk.lb
    public UserIntent$UserAdInteractionExt.ClickInteraction getClickInteraction() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getClickInteraction();
    }

    @Override // com.moloco.sdk.lb
    public long getClientTimestamp() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getClientTimestamp();
    }

    @Override // com.moloco.sdk.lb
    public UserIntent$UserAdInteractionExt.Device getDevice() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getDevice();
    }

    @Override // com.moloco.sdk.lb
    public UserIntent$UserAdInteractionExt.ImpressionInteraction getImpInteraction() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getImpInteraction();
    }

    @Override // com.moloco.sdk.lb
    public za getInfoExtCase() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getInfoExtCase();
    }

    @Override // com.moloco.sdk.lb
    public String getMref() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getMref();
    }

    @Override // com.moloco.sdk.lb
    public ByteString getMrefBytes() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getMrefBytes();
    }

    @Override // com.moloco.sdk.lb
    public UserIntent$UserAdInteractionExt.Network getNetwork() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getNetwork();
    }

    @Override // com.moloco.sdk.lb
    public UserIntent$UserAdInteractionExt.MolocoSDK getSdk() {
        return ((UserIntent$UserAdInteractionExt) this.instance).getSdk();
    }

    @Override // com.moloco.sdk.lb
    public boolean hasApp() {
        return ((UserIntent$UserAdInteractionExt) this.instance).hasApp();
    }

    @Override // com.moloco.sdk.lb
    public boolean hasAppBackgroundingInteraction() {
        return ((UserIntent$UserAdInteractionExt) this.instance).hasAppBackgroundingInteraction();
    }

    @Override // com.moloco.sdk.lb
    public boolean hasAppForegroundingInteraction() {
        return ((UserIntent$UserAdInteractionExt) this.instance).hasAppForegroundingInteraction();
    }

    @Override // com.moloco.sdk.lb
    public boolean hasClickInteraction() {
        return ((UserIntent$UserAdInteractionExt) this.instance).hasClickInteraction();
    }

    @Override // com.moloco.sdk.lb
    public boolean hasDevice() {
        return ((UserIntent$UserAdInteractionExt) this.instance).hasDevice();
    }

    @Override // com.moloco.sdk.lb
    public boolean hasImpInteraction() {
        return ((UserIntent$UserAdInteractionExt) this.instance).hasImpInteraction();
    }

    @Override // com.moloco.sdk.lb
    public boolean hasNetwork() {
        return ((UserIntent$UserAdInteractionExt) this.instance).hasNetwork();
    }

    @Override // com.moloco.sdk.lb
    public boolean hasSdk() {
        return ((UserIntent$UserAdInteractionExt) this.instance).hasSdk();
    }

    public la mergeApp(UserIntent$UserAdInteractionExt.App app) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).mergeApp(app);
        return this;
    }

    public la mergeAppBackgroundingInteraction(UserIntent$UserAdInteractionExt.AppBackgroundingInteraction appBackgroundingInteraction) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).mergeAppBackgroundingInteraction(appBackgroundingInteraction);
        return this;
    }

    public la mergeAppForegroundingInteraction(UserIntent$UserAdInteractionExt.AppForegroundingInteraction appForegroundingInteraction) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).mergeAppForegroundingInteraction(appForegroundingInteraction);
        return this;
    }

    public la mergeClickInteraction(UserIntent$UserAdInteractionExt.ClickInteraction clickInteraction) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).mergeClickInteraction(clickInteraction);
        return this;
    }

    public la mergeDevice(UserIntent$UserAdInteractionExt.Device device) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).mergeDevice(device);
        return this;
    }

    public la mergeImpInteraction(UserIntent$UserAdInteractionExt.ImpressionInteraction impressionInteraction) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).mergeImpInteraction(impressionInteraction);
        return this;
    }

    public la mergeNetwork(UserIntent$UserAdInteractionExt.Network network) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).mergeNetwork(network);
        return this;
    }

    public la mergeSdk(UserIntent$UserAdInteractionExt.MolocoSDK molocoSDK) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).mergeSdk(molocoSDK);
        return this;
    }

    public la setAdvertisingId(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setAdvertisingId(str);
        return this;
    }

    public la setAdvertisingIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setAdvertisingIdBytes(byteString);
        return this;
    }

    public la setApp(UserIntent$UserAdInteractionExt.App app) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setApp(app);
        return this;
    }

    public la setAppBackgroundingInteraction(UserIntent$UserAdInteractionExt.AppBackgroundingInteraction appBackgroundingInteraction) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setAppBackgroundingInteraction(appBackgroundingInteraction);
        return this;
    }

    public la setAppForegroundingInteraction(UserIntent$UserAdInteractionExt.AppForegroundingInteraction appForegroundingInteraction) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setAppForegroundingInteraction(appForegroundingInteraction);
        return this;
    }

    public la setClickInteraction(UserIntent$UserAdInteractionExt.ClickInteraction clickInteraction) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setClickInteraction(clickInteraction);
        return this;
    }

    public la setClientTimestamp(long j10) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setClientTimestamp(j10);
        return this;
    }

    public la setDevice(UserIntent$UserAdInteractionExt.Device device) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setDevice(device);
        return this;
    }

    public la setImpInteraction(UserIntent$UserAdInteractionExt.ImpressionInteraction impressionInteraction) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setImpInteraction(impressionInteraction);
        return this;
    }

    public la setMref(String str) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setMref(str);
        return this;
    }

    public la setMrefBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setMrefBytes(byteString);
        return this;
    }

    public la setNetwork(UserIntent$UserAdInteractionExt.Network network) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setNetwork(network);
        return this;
    }

    public la setSdk(UserIntent$UserAdInteractionExt.MolocoSDK molocoSDK) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setSdk(molocoSDK);
        return this;
    }

    public la setApp(ga gaVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setApp((UserIntent$UserAdInteractionExt.App) gaVar.build());
        return this;
    }

    public la setAppBackgroundingInteraction(ha haVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setAppBackgroundingInteraction((UserIntent$UserAdInteractionExt.AppBackgroundingInteraction) haVar.build());
        return this;
    }

    public la setAppForegroundingInteraction(ia iaVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setAppForegroundingInteraction((UserIntent$UserAdInteractionExt.AppForegroundingInteraction) iaVar.build());
        return this;
    }

    public la setClickInteraction(ra raVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setClickInteraction((UserIntent$UserAdInteractionExt.ClickInteraction) raVar.build());
        return this;
    }

    public la setDevice(ta taVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setDevice((UserIntent$UserAdInteractionExt.Device) taVar.build());
        return this;
    }

    public la setImpInteraction(ya yaVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setImpInteraction((UserIntent$UserAdInteractionExt.ImpressionInteraction) yaVar.build());
        return this;
    }

    public la setNetwork(cb cbVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setNetwork((UserIntent$UserAdInteractionExt.Network) cbVar.build());
        return this;
    }

    public la setSdk(ab abVar) {
        copyOnWrite();
        ((UserIntent$UserAdInteractionExt) this.instance).setSdk((UserIntent$UserAdInteractionExt.MolocoSDK) abVar.build());
        return this;
    }
}

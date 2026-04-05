package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.Init$SDKInitResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class v8 extends GeneratedMessageLite.Builder implements w8 {
    public v8 clearCity() {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).clearCity();
        return this;
    }

    public v8 clearCountryIso2Code() {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).clearCountryIso2Code();
        return this;
    }

    public v8 clearCountryIso3Code() {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).clearCountryIso3Code();
        return this;
    }

    public v8 clearLatitude() {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).clearLatitude();
        return this;
    }

    public v8 clearLongitude() {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).clearLongitude();
        return this;
    }

    public v8 clearRegion() {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).clearRegion();
        return this;
    }

    public v8 clearZipCode() {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).clearZipCode();
        return this;
    }

    @Override // com.moloco.sdk.w8
    public String getCity() {
        return ((Init$SDKInitResponse.Geo) this.instance).getCity();
    }

    @Override // com.moloco.sdk.w8
    public ByteString getCityBytes() {
        return ((Init$SDKInitResponse.Geo) this.instance).getCityBytes();
    }

    @Override // com.moloco.sdk.w8
    public String getCountryIso2Code() {
        return ((Init$SDKInitResponse.Geo) this.instance).getCountryIso2Code();
    }

    @Override // com.moloco.sdk.w8
    public ByteString getCountryIso2CodeBytes() {
        return ((Init$SDKInitResponse.Geo) this.instance).getCountryIso2CodeBytes();
    }

    @Override // com.moloco.sdk.w8
    public String getCountryIso3Code() {
        return ((Init$SDKInitResponse.Geo) this.instance).getCountryIso3Code();
    }

    @Override // com.moloco.sdk.w8
    public ByteString getCountryIso3CodeBytes() {
        return ((Init$SDKInitResponse.Geo) this.instance).getCountryIso3CodeBytes();
    }

    @Override // com.moloco.sdk.w8
    public float getLatitude() {
        return ((Init$SDKInitResponse.Geo) this.instance).getLatitude();
    }

    @Override // com.moloco.sdk.w8
    public float getLongitude() {
        return ((Init$SDKInitResponse.Geo) this.instance).getLongitude();
    }

    @Override // com.moloco.sdk.w8
    public String getRegion() {
        return ((Init$SDKInitResponse.Geo) this.instance).getRegion();
    }

    @Override // com.moloco.sdk.w8
    public ByteString getRegionBytes() {
        return ((Init$SDKInitResponse.Geo) this.instance).getRegionBytes();
    }

    @Override // com.moloco.sdk.w8
    public String getZipCode() {
        return ((Init$SDKInitResponse.Geo) this.instance).getZipCode();
    }

    @Override // com.moloco.sdk.w8
    public ByteString getZipCodeBytes() {
        return ((Init$SDKInitResponse.Geo) this.instance).getZipCodeBytes();
    }

    public v8 setCity(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setCity(str);
        return this;
    }

    public v8 setCityBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setCityBytes(byteString);
        return this;
    }

    public v8 setCountryIso2Code(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setCountryIso2Code(str);
        return this;
    }

    public v8 setCountryIso2CodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setCountryIso2CodeBytes(byteString);
        return this;
    }

    public v8 setCountryIso3Code(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setCountryIso3Code(str);
        return this;
    }

    public v8 setCountryIso3CodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setCountryIso3CodeBytes(byteString);
        return this;
    }

    public v8 setLatitude(float f10) {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setLatitude(f10);
        return this;
    }

    public v8 setLongitude(float f10) {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setLongitude(f10);
        return this;
    }

    public v8 setRegion(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setRegion(str);
        return this;
    }

    public v8 setRegionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setRegionBytes(byteString);
        return this;
    }

    public v8 setZipCode(String str) {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setZipCode(str);
        return this;
    }

    public v8 setZipCodeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((Init$SDKInitResponse.Geo) this.instance).setZipCodeBytes(byteString);
        return this;
    }
}

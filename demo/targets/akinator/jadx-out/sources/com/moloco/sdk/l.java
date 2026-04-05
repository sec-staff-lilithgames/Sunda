package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.BidRequest$SdkBidRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l extends GeneratedMessageLite.ExtendableBuilder implements s {
    public l clearAccuracy() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearAccuracy();
        return this;
    }

    public l clearCity() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearCity();
        return this;
    }

    public l clearCountry() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearCountry();
        return this;
    }

    public l clearIpservice() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearIpservice();
        return this;
    }

    public l clearLastfix() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearLastfix();
        return this;
    }

    public l clearLat() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearLat();
        return this;
    }

    public l clearLon() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearLon();
        return this;
    }

    public l clearMetro() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearMetro();
        return this;
    }

    public l clearRegion() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearRegion();
        return this;
    }

    public l clearRegionfips104() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearRegionfips104();
        return this;
    }

    public l clearType() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearType();
        return this;
    }

    public l clearUtcoffset() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearUtcoffset();
        return this;
    }

    public l clearZip() {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).clearZip();
        return this;
    }

    @Override // com.moloco.sdk.s
    public int getAccuracy() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getAccuracy();
    }

    @Override // com.moloco.sdk.s
    public String getCity() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getCity();
    }

    @Override // com.moloco.sdk.s
    public ByteString getCityBytes() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getCityBytes();
    }

    @Override // com.moloco.sdk.s
    public String getCountry() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getCountry();
    }

    @Override // com.moloco.sdk.s
    public ByteString getCountryBytes() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getCountryBytes();
    }

    @Override // com.moloco.sdk.s
    public o getIpservice() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getIpservice();
    }

    @Override // com.moloco.sdk.s
    public int getLastfix() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getLastfix();
    }

    @Override // com.moloco.sdk.s
    public double getLat() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getLat();
    }

    @Override // com.moloco.sdk.s
    public double getLon() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getLon();
    }

    @Override // com.moloco.sdk.s
    public String getMetro() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getMetro();
    }

    @Override // com.moloco.sdk.s
    public ByteString getMetroBytes() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getMetroBytes();
    }

    @Override // com.moloco.sdk.s
    public String getRegion() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getRegion();
    }

    @Override // com.moloco.sdk.s
    public ByteString getRegionBytes() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getRegionBytes();
    }

    @Override // com.moloco.sdk.s
    public String getRegionfips104() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getRegionfips104();
    }

    @Override // com.moloco.sdk.s
    public ByteString getRegionfips104Bytes() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getRegionfips104Bytes();
    }

    @Override // com.moloco.sdk.s
    public r getType() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getType();
    }

    @Override // com.moloco.sdk.s
    public int getUtcoffset() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getUtcoffset();
    }

    @Override // com.moloco.sdk.s
    public String getZip() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getZip();
    }

    @Override // com.moloco.sdk.s
    public ByteString getZipBytes() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).getZipBytes();
    }

    @Override // com.moloco.sdk.s
    public boolean hasAccuracy() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasAccuracy();
    }

    @Override // com.moloco.sdk.s
    public boolean hasCity() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasCity();
    }

    @Override // com.moloco.sdk.s
    public boolean hasCountry() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasCountry();
    }

    @Override // com.moloco.sdk.s
    public boolean hasIpservice() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasIpservice();
    }

    @Override // com.moloco.sdk.s
    public boolean hasLastfix() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasLastfix();
    }

    @Override // com.moloco.sdk.s
    public boolean hasLat() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasLat();
    }

    @Override // com.moloco.sdk.s
    public boolean hasLon() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasLon();
    }

    @Override // com.moloco.sdk.s
    public boolean hasMetro() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasMetro();
    }

    @Override // com.moloco.sdk.s
    public boolean hasRegion() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasRegion();
    }

    @Override // com.moloco.sdk.s
    public boolean hasRegionfips104() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasRegionfips104();
    }

    @Override // com.moloco.sdk.s
    public boolean hasType() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasType();
    }

    @Override // com.moloco.sdk.s
    public boolean hasUtcoffset() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasUtcoffset();
    }

    @Override // com.moloco.sdk.s
    public boolean hasZip() {
        return ((BidRequest$SdkBidRequest.Device.Geo) this.instance).hasZip();
    }

    public l setAccuracy(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setAccuracy(i10);
        return this;
    }

    public l setCity(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setCity(str);
        return this;
    }

    public l setCityBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setCityBytes(byteString);
        return this;
    }

    public l setCountry(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setCountry(str);
        return this;
    }

    public l setCountryBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setCountryBytes(byteString);
        return this;
    }

    public l setIpservice(o oVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setIpservice(oVar);
        return this;
    }

    public l setLastfix(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setLastfix(i10);
        return this;
    }

    public l setLat(double d10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setLat(d10);
        return this;
    }

    public l setLon(double d10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setLon(d10);
        return this;
    }

    public l setMetro(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setMetro(str);
        return this;
    }

    public l setMetroBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setMetroBytes(byteString);
        return this;
    }

    public l setRegion(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setRegion(str);
        return this;
    }

    public l setRegionBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setRegionBytes(byteString);
        return this;
    }

    public l setRegionfips104(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setRegionfips104(str);
        return this;
    }

    public l setRegionfips104Bytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setRegionfips104Bytes(byteString);
        return this;
    }

    public l setType(r rVar) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setType(rVar);
        return this;
    }

    public l setUtcoffset(int i10) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setUtcoffset(i10);
        return this;
    }

    public l setZip(String str) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setZip(str);
        return this;
    }

    public l setZipBytes(ByteString byteString) {
        copyOnWrite();
        ((BidRequest$SdkBidRequest.Device.Geo) this.instance).setZipBytes(byteString);
        return this;
    }
}

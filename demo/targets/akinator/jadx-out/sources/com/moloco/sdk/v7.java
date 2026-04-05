package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class v7 extends GeneratedMessageLite.Builder implements w7 {
    public v7 addAllEvents(Iterable<? extends IlrdRequest$ImpressionLevelRevenue> iterable) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).addAllEvents(iterable);
        return this;
    }

    public v7 addEvents(IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).addEvents(ilrdRequest$ImpressionLevelRevenue);
        return this;
    }

    public v7 clearDeviceId() {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).clearDeviceId();
        return this;
    }

    public v7 clearEvents() {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).clearEvents();
        return this;
    }

    public v7 clearIdfv() {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).clearIdfv();
        return this;
    }

    public v7 clearOs() {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).clearOs();
        return this;
    }

    public v7 clearPublisherAppId() {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).clearPublisherAppId();
        return this;
    }

    public v7 clearPublisherId() {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).clearPublisherId();
        return this;
    }

    @Override // com.moloco.sdk.w7
    public String getDeviceId() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getDeviceId();
    }

    @Override // com.moloco.sdk.w7
    public ByteString getDeviceIdBytes() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getDeviceIdBytes();
    }

    @Override // com.moloco.sdk.w7
    public IlrdRequest$ImpressionLevelRevenue getEvents(int i10) {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getEvents(i10);
    }

    @Override // com.moloco.sdk.w7
    public int getEventsCount() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getEventsCount();
    }

    @Override // com.moloco.sdk.w7
    public List<IlrdRequest$ImpressionLevelRevenue> getEventsList() {
        return Collections.unmodifiableList(((IlrdRequest$ImpressionRevenueRequest) this.instance).getEventsList());
    }

    @Override // com.moloco.sdk.w7
    public String getIdfv() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getIdfv();
    }

    @Override // com.moloco.sdk.w7
    public ByteString getIdfvBytes() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getIdfvBytes();
    }

    @Override // com.moloco.sdk.w7
    public String getOs() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getOs();
    }

    @Override // com.moloco.sdk.w7
    public ByteString getOsBytes() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getOsBytes();
    }

    @Override // com.moloco.sdk.w7
    public String getPublisherAppId() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getPublisherAppId();
    }

    @Override // com.moloco.sdk.w7
    public ByteString getPublisherAppIdBytes() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getPublisherAppIdBytes();
    }

    @Override // com.moloco.sdk.w7
    public String getPublisherId() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getPublisherId();
    }

    @Override // com.moloco.sdk.w7
    public ByteString getPublisherIdBytes() {
        return ((IlrdRequest$ImpressionRevenueRequest) this.instance).getPublisherIdBytes();
    }

    public v7 removeEvents(int i10) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).removeEvents(i10);
        return this;
    }

    public v7 setDeviceId(String str) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setDeviceId(str);
        return this;
    }

    public v7 setDeviceIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setDeviceIdBytes(byteString);
        return this;
    }

    public v7 setEvents(int i10, IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setEvents(i10, ilrdRequest$ImpressionLevelRevenue);
        return this;
    }

    public v7 setIdfv(String str) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setIdfv(str);
        return this;
    }

    public v7 setIdfvBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setIdfvBytes(byteString);
        return this;
    }

    public v7 setOs(String str) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setOs(str);
        return this;
    }

    public v7 setOsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setOsBytes(byteString);
        return this;
    }

    public v7 setPublisherAppId(String str) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setPublisherAppId(str);
        return this;
    }

    public v7 setPublisherAppIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setPublisherAppIdBytes(byteString);
        return this;
    }

    public v7 setPublisherId(String str) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setPublisherId(str);
        return this;
    }

    public v7 setPublisherIdBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setPublisherIdBytes(byteString);
        return this;
    }

    public v7 addEvents(int i10, IlrdRequest$ImpressionLevelRevenue ilrdRequest$ImpressionLevelRevenue) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).addEvents(i10, ilrdRequest$ImpressionLevelRevenue);
        return this;
    }

    public v7 setEvents(int i10, s7 s7Var) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).setEvents(i10, (IlrdRequest$ImpressionLevelRevenue) s7Var.build());
        return this;
    }

    public v7 addEvents(s7 s7Var) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).addEvents((IlrdRequest$ImpressionLevelRevenue) s7Var.build());
        return this;
    }

    public v7 addEvents(int i10, s7 s7Var) {
        copyOnWrite();
        ((IlrdRequest$ImpressionRevenueRequest) this.instance).addEvents(i10, (IlrdRequest$ImpressionLevelRevenue) s7Var.build());
        return this;
    }
}

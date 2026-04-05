package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class n9 extends GeneratedMessageLite.Builder implements o9 {
    public n9 addAllTags(Iterable<String> iterable) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).addAllTags(iterable);
        return this;
    }

    public n9 addTags(String str) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).addTags(str);
        return this;
    }

    public n9 addTagsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).addTagsBytes(byteString);
        return this;
    }

    public n9 clearElapsedTimeMillis() {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).clearElapsedTimeMillis();
        return this;
    }

    public n9 clearName() {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).clearName();
        return this;
    }

    public n9 clearTags() {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).clearTags();
        return this;
    }

    @Override // com.moloco.sdk.o9
    public long getElapsedTimeMillis() {
        return ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).getElapsedTimeMillis();
    }

    @Override // com.moloco.sdk.o9
    public String getName() {
        return ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).getName();
    }

    @Override // com.moloco.sdk.o9
    public ByteString getNameBytes() {
        return ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).getNameBytes();
    }

    @Override // com.moloco.sdk.o9
    public String getTags(int i10) {
        return ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).getTags(i10);
    }

    @Override // com.moloco.sdk.o9
    public ByteString getTagsBytes(int i10) {
        return ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).getTagsBytes(i10);
    }

    @Override // com.moloco.sdk.o9
    public int getTagsCount() {
        return ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).getTagsCount();
    }

    @Override // com.moloco.sdk.o9
    public List<String> getTagsList() {
        return Collections.unmodifiableList(((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).getTagsList());
    }

    public n9 setElapsedTimeMillis(long j10) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).setElapsedTimeMillis(j10);
        return this;
    }

    public n9 setName(String str) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).setName(str);
        return this;
    }

    public n9 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).setNameBytes(byteString);
        return this;
    }

    public n9 setTags(int i10, String str) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.TimerEvent) this.instance).setTags(i10, str);
        return this;
    }
}

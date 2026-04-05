package com.moloco.sdk;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l9 extends GeneratedMessageLite.Builder implements m9 {
    public l9 addAllTags(Iterable<String> iterable) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).addAllTags(iterable);
        return this;
    }

    public l9 addTags(String str) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).addTags(str);
        return this;
    }

    public l9 addTagsBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).addTagsBytes(byteString);
        return this;
    }

    public l9 clearCount() {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).clearCount();
        return this;
    }

    public l9 clearName() {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).clearName();
        return this;
    }

    public l9 clearTags() {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).clearTags();
        return this;
    }

    @Override // com.moloco.sdk.m9
    public int getCount() {
        return ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).getCount();
    }

    @Override // com.moloco.sdk.m9
    public String getName() {
        return ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).getName();
    }

    @Override // com.moloco.sdk.m9
    public ByteString getNameBytes() {
        return ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).getNameBytes();
    }

    @Override // com.moloco.sdk.m9
    public String getTags(int i10) {
        return ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).getTags(i10);
    }

    @Override // com.moloco.sdk.m9
    public ByteString getTagsBytes(int i10) {
        return ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).getTagsBytes(i10);
    }

    @Override // com.moloco.sdk.m9
    public int getTagsCount() {
        return ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).getTagsCount();
    }

    @Override // com.moloco.sdk.m9
    public List<String> getTagsList() {
        return Collections.unmodifiableList(((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).getTagsList());
    }

    public l9 setCount(int i10) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).setCount(i10);
        return this;
    }

    public l9 setName(String str) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).setName(str);
        return this;
    }

    public l9 setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).setNameBytes(byteString);
        return this;
    }

    public l9 setTags(int i10, String str) {
        copyOnWrite();
        ((MetricsRequest$PostMetricsRequest.CountEvent) this.instance).setTags(i10, str);
        return this;
    }
}

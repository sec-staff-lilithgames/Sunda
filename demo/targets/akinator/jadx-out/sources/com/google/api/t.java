package com.google.api;

import com.google.api.MetricDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;
import kh.b2;
import kh.o2;
import kh.r2;
import kh.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t extends GeneratedMessageLite.Builder implements v {
    public t addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).addAllLabels(iterable);
        return this;
    }

    public t addLabels(LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).addLabels(labelDescriptor);
        return this;
    }

    public t clearDescription() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearDescription();
        return this;
    }

    public t clearDisplayName() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearDisplayName();
        return this;
    }

    public t clearLabels() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearLabels();
        return this;
    }

    public t clearLaunchStage() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearLaunchStage();
        return this;
    }

    public t clearMetadata() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearMetadata();
        return this;
    }

    public t clearMetricKind() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearMetricKind();
        return this;
    }

    public t clearName() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearName();
        return this;
    }

    public t clearType() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearType();
        return this;
    }

    public t clearUnit() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearUnit();
        return this;
    }

    public t clearValueType() {
        copyOnWrite();
        ((MetricDescriptor) this.instance).clearValueType();
        return this;
    }

    @Override // com.google.api.v
    public String getDescription() {
        return ((MetricDescriptor) this.instance).getDescription();
    }

    @Override // com.google.api.v
    public ByteString getDescriptionBytes() {
        return ((MetricDescriptor) this.instance).getDescriptionBytes();
    }

    @Override // com.google.api.v
    public String getDisplayName() {
        return ((MetricDescriptor) this.instance).getDisplayName();
    }

    @Override // com.google.api.v
    public ByteString getDisplayNameBytes() {
        return ((MetricDescriptor) this.instance).getDisplayNameBytes();
    }

    @Override // com.google.api.v
    public LabelDescriptor getLabels(int i10) {
        return ((MetricDescriptor) this.instance).getLabels(i10);
    }

    @Override // com.google.api.v
    public int getLabelsCount() {
        return ((MetricDescriptor) this.instance).getLabelsCount();
    }

    @Override // com.google.api.v
    public List<LabelDescriptor> getLabelsList() {
        return Collections.unmodifiableList(((MetricDescriptor) this.instance).getLabelsList());
    }

    @Override // com.google.api.v
    public b2 getLaunchStage() {
        return ((MetricDescriptor) this.instance).getLaunchStage();
    }

    @Override // com.google.api.v
    public int getLaunchStageValue() {
        return ((MetricDescriptor) this.instance).getLaunchStageValue();
    }

    @Override // com.google.api.v
    public MetricDescriptor.MetricDescriptorMetadata getMetadata() {
        return ((MetricDescriptor) this.instance).getMetadata();
    }

    @Override // com.google.api.v
    public o2 getMetricKind() {
        return ((MetricDescriptor) this.instance).getMetricKind();
    }

    @Override // com.google.api.v
    public int getMetricKindValue() {
        return ((MetricDescriptor) this.instance).getMetricKindValue();
    }

    @Override // com.google.api.v
    public String getName() {
        return ((MetricDescriptor) this.instance).getName();
    }

    @Override // com.google.api.v
    public ByteString getNameBytes() {
        return ((MetricDescriptor) this.instance).getNameBytes();
    }

    @Override // com.google.api.v
    public String getType() {
        return ((MetricDescriptor) this.instance).getType();
    }

    @Override // com.google.api.v
    public ByteString getTypeBytes() {
        return ((MetricDescriptor) this.instance).getTypeBytes();
    }

    @Override // com.google.api.v
    public String getUnit() {
        return ((MetricDescriptor) this.instance).getUnit();
    }

    @Override // com.google.api.v
    public ByteString getUnitBytes() {
        return ((MetricDescriptor) this.instance).getUnitBytes();
    }

    @Override // com.google.api.v
    public r2 getValueType() {
        return ((MetricDescriptor) this.instance).getValueType();
    }

    @Override // com.google.api.v
    public int getValueTypeValue() {
        return ((MetricDescriptor) this.instance).getValueTypeValue();
    }

    @Override // com.google.api.v
    public boolean hasMetadata() {
        return ((MetricDescriptor) this.instance).hasMetadata();
    }

    public t mergeMetadata(MetricDescriptor.MetricDescriptorMetadata metricDescriptorMetadata) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).mergeMetadata(metricDescriptorMetadata);
        return this;
    }

    public t removeLabels(int i10) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).removeLabels(i10);
        return this;
    }

    public t setDescription(String str) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setDescription(str);
        return this;
    }

    public t setDescriptionBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setDescriptionBytes(byteString);
        return this;
    }

    public t setDisplayName(String str) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setDisplayName(str);
        return this;
    }

    public t setDisplayNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setDisplayNameBytes(byteString);
        return this;
    }

    public t setLabels(int i10, LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setLabels(i10, labelDescriptor);
        return this;
    }

    public t setLaunchStage(b2 b2Var) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setLaunchStage(b2Var);
        return this;
    }

    public t setLaunchStageValue(int i10) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setLaunchStageValue(i10);
        return this;
    }

    public t setMetadata(MetricDescriptor.MetricDescriptorMetadata metricDescriptorMetadata) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setMetadata(metricDescriptorMetadata);
        return this;
    }

    public t setMetricKind(o2 o2Var) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setMetricKind(o2Var);
        return this;
    }

    public t setMetricKindValue(int i10) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setMetricKindValue(i10);
        return this;
    }

    public t setName(String str) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setName(str);
        return this;
    }

    public t setNameBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setNameBytes(byteString);
        return this;
    }

    public t setType(String str) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setType(str);
        return this;
    }

    public t setTypeBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setTypeBytes(byteString);
        return this;
    }

    public t setUnit(String str) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setUnit(str);
        return this;
    }

    public t setUnitBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setUnitBytes(byteString);
        return this;
    }

    public t setValueType(r2 r2Var) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setValueType(r2Var);
        return this;
    }

    public t setValueTypeValue(int i10) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setValueTypeValue(i10);
        return this;
    }

    public t addLabels(int i10, LabelDescriptor labelDescriptor) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).addLabels(i10, labelDescriptor);
        return this;
    }

    public t setLabels(int i10, u1 u1Var) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setLabels(i10, (LabelDescriptor) u1Var.build());
        return this;
    }

    public t setMetadata(u uVar) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).setMetadata((MetricDescriptor.MetricDescriptorMetadata) uVar.build());
        return this;
    }

    public t addLabels(u1 u1Var) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).addLabels((LabelDescriptor) u1Var.build());
        return this;
    }

    public t addLabels(int i10, u1 u1Var) {
        copyOnWrite();
        ((MetricDescriptor) this.instance).addLabels(i10, (LabelDescriptor) u1Var.build());
        return this;
    }
}

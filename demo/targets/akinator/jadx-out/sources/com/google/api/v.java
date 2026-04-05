package com.google.api;

import com.google.api.MetricDescriptor;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import kh.b2;
import kh.o2;
import kh.r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface v extends MessageLiteOrBuilder {
    String getDescription();

    ByteString getDescriptionBytes();

    String getDisplayName();

    ByteString getDisplayNameBytes();

    LabelDescriptor getLabels(int i10);

    int getLabelsCount();

    List<LabelDescriptor> getLabelsList();

    b2 getLaunchStage();

    int getLaunchStageValue();

    MetricDescriptor.MetricDescriptorMetadata getMetadata();

    o2 getMetricKind();

    int getMetricKindValue();

    String getName();

    ByteString getNameBytes();

    String getType();

    ByteString getTypeBytes();

    String getUnit();

    ByteString getUnitBytes();

    r2 getValueType();

    int getValueTypeValue();

    boolean hasMetadata();
}

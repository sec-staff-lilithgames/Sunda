package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.tb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SDKAnalyticProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n'bidmachine/protobuf/analytics/sdk.proto\u0012\u001dbidmachine.protobuf.analytics\u001a\u001fgoogle/protobuf/timestamp.proto\"Ä\u0005\n\u0012SDKAnalyticPayload\u0012I\n\u0007metrics\u0018\u0001 \u0003(\u000b28.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric\u001aâ\u0004\n\u0006Metric\u0012\u000f\n\u0007context\u0018\u0001 \u0001(\t\u0012Q\n\u0004data\u0018\u0002 \u0003(\u000b2C.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData\u001aó\u0003\n\nMetricData\u0012\u0015\n\ttimestamp\u0018\u0001 \u0001(\tB\u0002\u0018\u0001\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012a\n\ndimensions\u0018\u0003 \u0003(\u000b2M.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Dimension\u0012]\n\bmeasures\u0018\u0004 \u0003(\u000b2K.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Measure\u0012X\n\u0005error\u0018\u0005 \u0001(\u000b2I.bidmachine.protobuf.analytics.SDKAnalyticPayload.Metric.MetricData.Error\u0012&\n\u0002ts\u0018\u0006 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u001a(\n\tDimension\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t\u001a&\n\u0007Measure\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\u0001\u001a*\n\u0005Error\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bdescription\u0018\u0002 \u0001(\tB<\n io.bidmachine.protobuf.analyticsB\u0010SDKAnalyticProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{tb.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor;
    static final i7 internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor;
    static final i7 internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor;
    static final i7 internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor;
    static final i7 internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor;
    static final i7 internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor;
    static final i7 internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_fieldAccessorTable = new i7(descriptor2, new String[]{"Metrics"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_fieldAccessorTable = new i7(descriptor3, new String[]{"Context", "Data"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_fieldAccessorTable = new i7(descriptor4, new String[]{"Timestamp", "Name", "Dimensions", "Measures", "Error", "Ts"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Dimension_fieldAccessorTable = new i7(descriptor5, new String[]{"Name", "Value"});
        Descriptors.Descriptor descriptor6 = descriptor4.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Measure_fieldAccessorTable = new i7(descriptor6, new String[]{"Name", "Value"});
        Descriptors.Descriptor descriptor7 = descriptor4.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_analytics_SDKAnalyticPayload_Metric_MetricData_Error_fieldAccessorTable = new i7(descriptor7, new String[]{"Name", "Description"});
        tb.getDescriptor();
    }

    private SDKAnalyticProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}

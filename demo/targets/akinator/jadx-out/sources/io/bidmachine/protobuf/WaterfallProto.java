package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.id;
import com.explorestack.protobuf.kb;
import com.explorestack.protobuf.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class WaterfallProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n#bidmachine/protobuf/waterfall.proto\u0012\u0013bidmachine.protobuf\u001a\u001egoogle/protobuf/wrappers.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a$bidmachine/protobuf/extensions.proto\"ü\u0012\n\tWaterfall\u00128\n\u0007request\u0018\u0001 \u0001(\u000b2%.bidmachine.protobuf.Waterfall.ResultH\u0000\u0012@\n\bresponse\u0018\u0002 \u0001(\u000b2,.bidmachine.protobuf.Waterfall.ConfigurationH\u0000\u001aÿ\u0006\n\rConfiguration\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006format\u0018\u0002 \u0001(\t\u00125\n\u000frefresh_timeout\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.UInt64Value\u00121\n\u000brefresh_url\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00120\n\nretry_base\u0018\u0005 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u00126\n\u0010max_retry_degree\u0018\u0006 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u00120\n\ncache_size\u0018\u0007 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u0012E\n\bad_units\u0018\b \u0003(\u000b23.bidmachine.protobuf.Waterfall.Configuration.AdUnit\u0012\u0014\n\fshould_break\u0018\t \u0001(\b\u00123\n\rserver_params\u0018\n \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a¹\u0003\n\u0006AdUnit\u0012\u001a\n\u0012override_callbacks\u0018\u0001 \u0001(\b\u0012\u0017\n\u000fexpiration_time\u0018\u0002 \u0001(\r\u0012\u0012\n\nad_unit_id\u0018\u0003 \u0001(\t\u0012\u0015\n\rrequest_agent\u0018\u0004 \u0001(\t\u0012\r\n\u0005price\u0018\u0005 \u0001(\u0001\u0012b\n\u0010custom_targeting\u0018\u0006 \u0003(\u000b2H.bidmachine.protobuf.Waterfall.Configuration.AdUnit.CustomTargetingEntry\u00127\n\u0011sleep_time_before\u0018\u0007 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u00126\n\u0010sleep_time_after\u0018\b \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u00123\n\rserver_params\u0018\t \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a6\n\u0014CustomTargetingEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001aÈ\t\n\u0006Result\u0012\u0014\n\fwaterfall_id\u0018\u0001 \u0001(\t\u0012$\n\u0003ext\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012,\n\u0006format\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012E\n\u000fad_unit_results\u0018\u0004 \u0003(\u000b2,.bidmachine.protobuf.Waterfall.Result.AdUnit\u0012K\n\u000fcached_ad_units\u0018\u0005 \u0003(\u000b22.bidmachine.protobuf.Waterfall.Result.CachedAdUnit\u00123\n\rserver_params\u0018\u0006 \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a\u009e\u0001\n\u000eEstimatedPrice\u0012+\n\u0005value\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.DoubleValue\u0012/\n\tprecision\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u0012.\n\bcurrency\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\u001aî\u0003\n\u0006AdUnit\u0012\u0012\n\nad_unit_id\u0018\u0001 \u0001(\t\u0012\r\n\u0005price\u0018\u0002 \u0001(\u0001\u0012M\n\u000festimated_price\u0018\u0003 \u0001(\u000b24.bidmachine.protobuf.Waterfall.Result.EstimatedPrice\u00121\n\u000bad_response\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012C\n\u0006status\u0018\u0005 \u0001(\u000e23.bidmachine.protobuf.Waterfall.Result.AdUnit.Status\u0012A\n\u0005error\u0018\u0006 \u0001(\u000b22.bidmachine.protobuf.Waterfall.Result.AdUnit.Error\u00123\n\rserver_params\u0018\u0007 \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a*\n\u0005Error\u0012\f\n\u0004code\u0018\u0001 \u0001(\u0011\u0012\u0013\n\u000bdescription\u0018\u0002 \u0001(\t\"V\n\u0006Status\u0012\u0012\n\u000eSTATUS_INVALID\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u0010\n\fSTATUS_ERROR\u0010\u0002\u0012\u0012\n\u000eSTATUS_SKIPPED\u0010\u0003\u001aø\u0001\n\fCachedAdUnit\u0012\u0012\n\nad_unit_id\u0018\u0001 \u0001(\t\u0012\r\n\u0005price\u0018\u0002 \u0001(\u0001\u0012M\n\u000festimated_price\u0018\u0003 \u0001(\u000b24.bidmachine.protobuf.Waterfall.Result.EstimatedPrice\u00121\n\u000bad_response\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012\u000e\n\u0006frozen\u0018\u0005 \u0001(\b\u00123\n\rserver_params\u0018\u0006 \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a\u009a\u0001\n\u0007Context\u0012D\n\u000econfigurations\u0018\u0001 \u0003(\u000b2,.bidmachine.protobuf.Waterfall.Configuration\u0012I\n\fevent_config\u0018\u0002 \u0001(\u000b23.bidmachine.protobuf.AdExtension.EventConfigurationB\t\n\u0007payloadB0\n\u0016io.bidmachine.protobufB\u000eWaterfallProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{id.getDescriptor(), kb.getDescriptor(), ExtensionsProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_CustomTargetingEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_CustomTargetingEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Configuration_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Context_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Context_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_Result_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_Result_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Waterfall_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Waterfall_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_Waterfall_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_Waterfall_fieldAccessorTable = new i7(descriptor2, new String[]{"Request", "Response", "Payload"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Waterfall_Configuration_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_Waterfall_Configuration_fieldAccessorTable = new i7(descriptor3, new String[]{"Id", "Format", "RefreshTimeout", "RefreshUrl", "RetryBase", "MaxRetryDegree", "CacheSize", "AdUnits", "ShouldBreak", "ServerParams"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_fieldAccessorTable = new i7(descriptor4, new String[]{"OverrideCallbacks", "ExpirationTime", "AdUnitId", "RequestAgent", "Price", "CustomTargeting", "SleepTimeBefore", "SleepTimeAfter", "ServerParams"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_CustomTargetingEntry_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_Waterfall_Configuration_AdUnit_CustomTargetingEntry_fieldAccessorTable = new i7(descriptor5, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_Waterfall_Result_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_Waterfall_Result_fieldAccessorTable = new i7(descriptor6, new String[]{"WaterfallId", "Ext", "Format", "AdUnitResults", "CachedAdUnits", "ServerParams"});
        Descriptors.Descriptor descriptor7 = descriptor6.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_Waterfall_Result_EstimatedPrice_fieldAccessorTable = new i7(descriptor7, new String[]{"Value", "Precision", "Currency"});
        Descriptors.Descriptor descriptor8 = descriptor6.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_fieldAccessorTable = new i7(descriptor8, new String[]{"AdUnitId", "Price", "EstimatedPrice", "AdResponse", "Status", "Error", "ServerParams"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_Waterfall_Result_AdUnit_Error_fieldAccessorTable = new i7(descriptor9, new String[]{"Code", "Description"});
        Descriptors.Descriptor descriptor10 = descriptor6.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_descriptor = descriptor10;
        internal_static_bidmachine_protobuf_Waterfall_Result_CachedAdUnit_fieldAccessorTable = new i7(descriptor10, new String[]{"AdUnitId", "Price", "EstimatedPrice", "AdResponse", "Frozen", "ServerParams"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_Waterfall_Context_descriptor = descriptor11;
        internal_static_bidmachine_protobuf_Waterfall_Context_fieldAccessorTable = new i7(descriptor11, new String[]{"Configurations", "EventConfig"});
        id.getDescriptor();
        kb.getDescriptor();
        ExtensionsProto.getDescriptor();
    }

    private WaterfallProto() {
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

package io.bidmachine.protobuf;

import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.adcom.b;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.id;
import com.explorestack.protobuf.kb;
import com.explorestack.protobuf.m5;
import io.bidmachine.protobuf.sdk.SDKAnalyticV2Proto;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class InitProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001ebidmachine/protobuf/init.proto\u0012\u0013bidmachine.protobuf\u001a%bidmachine/protobuf/adcom/adcom.proto\u001a$bidmachine/protobuf/extensions.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001egoogle/protobuf/wrappers.proto\u001a*bidmachine/protobuf/sdk/analytics_v2.proto\"j\n\rInitRequestV2\u00123\n\u0007context\u0018\u0001 \u0001(\u000b2\".bidmachine.protobuf.adcom.Context\u0012$\n\u0003ext\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\"ø\u0006\n\u000bInitRequest\u0012\u0011\n\tseller_id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006bundle\u0018\u0002 \u0001(\t\u0012)\n\u0002os\u0018\u0003 \u0001(\u000e2\u001d.bidmachine.protobuf.adcom.OS\u0012\u000b\n\u0003osv\u0018\u0004 \u0001(\t\u00123\n\u0003geo\u0018\u0005 \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.Geo\u0012\u000b\n\u0003sdk\u0018\u0006 \u0001(\t\u0012\u000e\n\u0006sdkver\u0018\u0007 \u0001(\t\u0012\u000b\n\u0003ifa\u0018\b \u0001(\t\u0012\u000b\n\u0003ifv\u0018\u000b \u0001(\t\u0012\u000e\n\u0006bm_ifv\u0018\f \u0001(\t\u0012:\n\u000bdevice_type\u0018\t \u0001(\u000e2%.bidmachine.protobuf.adcom.DeviceType\u0012:\n\u0007contype\u0018\n \u0001(\u000e2).bidmachine.protobuf.adcom.ConnectionType\u0012\u000f\n\u0007app_ver\u0018\r \u0001(\t\u0012\u0012\n\nsession_id\u0018\u000e \u0001(\t\u0012$\n\u0003ext\u0018\u000f \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\f\n\u0004make\u0018\u0010 \u0001(\t\u0012\r\n\u0005model\u0018\u0011 \u0001(\t\u0012\u000b\n\u0003hwv\u0018\u0012 \u0001(\t\u00123\n\u0007context\u0018\u0013 \u0001(\u000b2\".bidmachine.protobuf.adcom.Context\u0012G\n\u0007android\u0018\u0014 \u0001(\u000b24.bidmachine.protobuf.InitRequest.AndroidPlatformDataH\u0000\u0012?\n\u0003ios\u0018\u0015 \u0001(\u000b20.bidmachine.protobuf.InitRequest.iOSPlatformDataH\u0000\u001aD\n\u0013AndroidPlatformData\u0012\u0015\n\rmin_api_level\u0018\u0001 \u0001(\r\u0012\u0016\n\u000ekotlin_version\u0018\u0002 \u0001(\t\u001a\u008e\u0001\n\u000fiOSPlatformData\u00124\n\u000emin_os_version\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012E\n\u0010os_execution_env\u0018\u0002 \u0001(\u000e2+.bidmachine.protobuf.OSExecutionEnvironmentB\u000f\n\rplatform_data\"\u0087\u0003\n\tAdNetwork\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\nclass_name\u0018\u0002 \u0001(\t\u0012G\n\rcustom_params\u0018\u0003 \u0003(\u000b20.bidmachine.protobuf.AdNetwork.CustomParamsEntry\u00127\n\bad_units\u0018\u0004 \u0003(\u000b2%.bidmachine.protobuf.AdNetwork.AdUnit\u001a3\n\u0011CustomParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a \u0001\n\u0006AdUnit\u0012\u0011\n\tad_format\u0018\u0001 \u0001(\t\u0012N\n\rcustom_params\u0018\u0002 \u0003(\u000b27.bidmachine.protobuf.AdNetwork.AdUnit.CustomParamsEntry\u001a3\n\u0011CustomParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"\\\n\u0017AdCachePlacementControl\u0012\u0016\n\u000emax_cache_size\u0018\u0002 \u0001(\r\u0012\u0018\n\u0010max_retain_count\u0018\u0004 \u0001(\r\u0012\u000f\n\u0007max_age\u0018\u0003 \u0001(\r\"â\u0001\n\u0011SdkAnalyticConfig\u0012\u000b\n\u0003url\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007context\u0018\u0002 \u0001(\t\u0012\u0010\n\binterval\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005count\u0018\u0004 \u0001(\u0005\u0012K\n\u000emetric_configs\u0018\u0005 \u0003(\u000b23.bidmachine.protobuf.SdkAnalyticConfig.MetricConfig\u001aA\n\fMetricConfig\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\ndimensions\u0018\u0002 \u0003(\t\u0012\u000f\n\u0007metrics\u0018\u0003 \u0003(\t\"P\n\u0012TokenConfiguration\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fexpiration_time\u0018\u0002 \u0001(\u0005\u0012\u0013\n\u000bad_networks\u0018\u0003 \u0003(\t\"\u008e\u0007\n\fInitResponse\u0012\u0010\n\bendpoint\u0018\u0001 \u0001(\t\u00122\n\u0005event\u0018\u0002 \u0003(\u000b2#.bidmachine.protobuf.adcom.Ad.Event\u0012\u001b\n\u0013session_reset_after\u0018\u0003 \u0001(\r\u00123\n\u000bad_networks\u0018\u0004 \u0003(\u000b2\u001e.bidmachine.protobuf.AdNetwork\u0012=\n\u0010ad_cache_control\u0018\u0005 \u0001(\u000e2#.bidmachine.protobuf.AdCacheControl\u0012\u0018\n\u0010ad_cache_max_age\u0018\u0006 \u0001(\r\u0012\u0017\n\u000fad_request_tmax\u0018\u0007 \u0001(\r\u0012b\n\u001aad_cache_placement_control\u0018\b \u0003(\u000b2>.bidmachine.protobuf.InitResponse.AdCachePlacementControlEntry\u0012#\n\u001bad_networks_loading_timeout\u0018\t \u0001(\r\u0012C\n\u0013sdk_analytic_config\u0018\n \u0001(\u000b2&.bidmachine.protobuf.SdkAnalyticConfig\u0012P\n\u0013event_configuration\u0018\u000b \u0001(\u000b23.bidmachine.protobuf.AdExtension.EventConfiguration\u0012E\n\u0014token_configurations\u0018\f \u0003(\u000b2'.bidmachine.protobuf.TokenConfiguration\u0012\u001d\n\u0015show_without_internet\u0018\r \u0001(\b\u0012+\n\u0006extras\u0018\u000e \u0001(\u000b2\u001b.bidmachine.protobuf.Extras\u0012S\n\u0016sdk_analytic_config_v2\u0018\u000f \u0001(\u000b23.bidmachine.protobuf.sdk.analytics_v2.Configuration\u001al\n\u001cAdCachePlacementControlEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012;\n\u0005value\u0018\u0002 \u0001(\u000b2,.bidmachine.protobuf.AdCachePlacementControl:\u00028\u0001\"û\u0003\n\u0012SdkAnalyticContext\u0012\u0011\n\tsource_id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006bundle\u0018\u0002 \u0001(\t\u0012)\n\u0002os\u0018\u0003 \u0001(\u000e2\u001d.bidmachine.protobuf.adcom.OS\u0012\u000b\n\u0003osv\u0018\u0004 \u0001(\t\u00123\n\u0003geo\u0018\u0005 \u0001(\u000b2&.bidmachine.protobuf.adcom.Context.Geo\u0012\u000b\n\u0003sdk\u0018\u0006 \u0001(\t\u0012\u000e\n\u0006sdkver\u0018\u0007 \u0001(\t\u0012\u000b\n\u0003ifa\u0018\b \u0001(\t\u0012\u000b\n\u0003ifv\u0018\u000b \u0001(\t\u0012\u000e\n\u0006bm_ifv\u0018\f \u0001(\t\u0012:\n\u000bdevice_type\u0018\t \u0001(\u000e2%.bidmachine.protobuf.adcom.DeviceType\u0012:\n\u0007contype\u0018\n \u0001(\u000e2).bidmachine.protobuf.adcom.ConnectionType\u0012\u000f\n\u0007app_ver\u0018\r \u0001(\t\u0012\u0012\n\nsession_id\u0018\u000e \u0001(\t\u0012\f\n\u0004dcid\u0018\u000f \u0001(\t\u0012$\n\u0003ext\u0018\u0010 \u0001(\u000b2\u0017.google.protobuf.Struct\u0012\u0013\n\u000bexperiments\u0018\u0011 \u0003(\t\u0012\f\n\u0004make\u0018\u0012 \u0001(\t\u0012\r\n\u0005model\u0018\u0013 \u0001(\t\u0012\u000b\n\u0003hwv\u0018\u0014 \u0001(\t*¸\u0001\n\u0016OSExecutionEnvironment\u0012$\n OS_EXECUTION_ENVIRONMENT_UNKNOWN\u0010\u0000\u0012)\n%OS_EXECUTION_ENVIRONMENT_MAC_CATALYST\u0010\u0001\u0012$\n OS_EXECUTION_ENVIRONMENT_MAC_IOS\u0010\u0002\u0012'\n#OS_EXECUTION_ENVIRONMENT_NATIVE_IOS\u0010\u0003B+\n\u0016io.bidmachine.protobufB\tInitProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{b.getDescriptor(), ExtensionsProto.getDescriptor(), kb.getDescriptor(), id.getDescriptor(), SDKAnalyticV2Proto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
    static final i7 internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor;
    static final i7 internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_AdNetwork_descriptor;
    static final i7 internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitRequestV2_descriptor;
    static final i7 internal_static_bidmachine_protobuf_InitRequestV2_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor;
    static final i7 internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitRequest_descriptor;
    static final i7 internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor;
    static final i7 internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_InitResponse_descriptor;
    static final i7 internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor;
    static final i7 internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor;
    static final i7 internal_static_bidmachine_protobuf_SdkAnalyticConfig_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor;
    static final i7 internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_TokenConfiguration_descriptor;
    static final i7 internal_static_bidmachine_protobuf_TokenConfiguration_fieldAccessorTable;

    private InitProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_InitRequestV2_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_InitRequestV2_fieldAccessorTable = new i7(descriptor2, new String[]{"Context", "Ext"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_InitRequest_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_InitRequest_fieldAccessorTable = new i7(descriptor3, new String[]{"SellerId", "Bundle", "Os", "Osv", "Geo", "Sdk", "Sdkver", "Ifa", "Ifv", "BmIfv", "DeviceType", "Contype", "AppVer", "SessionId", "Ext", PtLatqAYjEFT.qarSOPDYP, "Model", "Hwv", "Context", "Android", "Ios", "PlatformData"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_InitRequest_AndroidPlatformData_fieldAccessorTable = new i7(descriptor4, new String[]{"MinApiLevel", "KotlinVersion"});
        Descriptors.Descriptor descriptor5 = descriptor3.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_InitRequest_iOSPlatformData_fieldAccessorTable = new i7(descriptor5, new String[]{"MinOsVersion", "OsExecutionEnv"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_AdNetwork_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_AdNetwork_fieldAccessorTable = new i7(descriptor6, new String[]{"Name", "ClassName", "CustomParams", "AdUnits"});
        Descriptors.Descriptor descriptor7 = descriptor6.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_AdNetwork_CustomParamsEntry_fieldAccessorTable = new i7(descriptor7, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor8 = descriptor6.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_AdNetwork_AdUnit_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_AdNetwork_AdUnit_fieldAccessorTable = new i7(descriptor8, new String[]{"AdFormat", "CustomParams"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_AdNetwork_AdUnit_CustomParamsEntry_fieldAccessorTable = new i7(descriptor9, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(3);
        internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor = descriptor10;
        internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable = new i7(descriptor10, new String[]{"MaxCacheSize", "MaxRetainCount", "MaxAge"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(4);
        internal_static_bidmachine_protobuf_SdkAnalyticConfig_descriptor = descriptor11;
        internal_static_bidmachine_protobuf_SdkAnalyticConfig_fieldAccessorTable = new i7(descriptor11, new String[]{"Url", "Context", "Interval", "Count", "MetricConfigs"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_descriptor = descriptor12;
        internal_static_bidmachine_protobuf_SdkAnalyticConfig_MetricConfig_fieldAccessorTable = new i7(descriptor12, new String[]{"Name", "Dimensions", "Metrics"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(5);
        internal_static_bidmachine_protobuf_TokenConfiguration_descriptor = descriptor13;
        internal_static_bidmachine_protobuf_TokenConfiguration_fieldAccessorTable = new i7(descriptor13, new String[]{"Type", "ExpirationTime", "AdNetworks"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(6);
        internal_static_bidmachine_protobuf_InitResponse_descriptor = descriptor14;
        internal_static_bidmachine_protobuf_InitResponse_fieldAccessorTable = new i7(descriptor14, new String[]{"Endpoint", "Event", "SessionResetAfter", "AdNetworks", "AdCacheControl", "AdCacheMaxAge", "AdRequestTmax", "AdCachePlacementControl", "AdNetworksLoadingTimeout", "SdkAnalyticConfig", "EventConfiguration", "TokenConfigurations", "ShowWithoutInternet", "Extras", "SdkAnalyticConfigV2"});
        Descriptors.Descriptor descriptor15 = descriptor14.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_descriptor = descriptor15;
        internal_static_bidmachine_protobuf_InitResponse_AdCachePlacementControlEntry_fieldAccessorTable = new i7(descriptor15, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(7);
        internal_static_bidmachine_protobuf_SdkAnalyticContext_descriptor = descriptor16;
        internal_static_bidmachine_protobuf_SdkAnalyticContext_fieldAccessorTable = new i7(descriptor16, new String[]{"SourceId", "Bundle", "Os", "Osv", "Geo", "Sdk", "Sdkver", "Ifa", "Ifv", "BmIfv", "DeviceType", "Contype", "AppVer", "SessionId", "Dcid", "Ext", "Experiments", "Make", "Model", "Hwv"});
        b.getDescriptor();
        ExtensionsProto.getDescriptor();
        kb.getDescriptor();
        id.getDescriptor();
        SDKAnalyticV2Proto.getDescriptor();
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}

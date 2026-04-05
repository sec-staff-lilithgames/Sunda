package io.bidmachine.protobuf;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.adcom.b;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.kb;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.openrtb.d;
import com.explorestack.protobuf.tb;
import io.bidmachine.protobuf.headerbidding.HeaderBiddingProto;
import io.bidmachine.protobuf.sdk.SDKContextProto;
import io.bidmachine.protobuf.sdk.SDKProto;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class CacheProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fbidmachine/protobuf/cache.proto\u0012\u0013bidmachine.protobuf\u001a%bidmachine/protobuf/adcom/adcom.proto\u001a5bidmachine/protobuf/headerbidding/headerbidding.proto\u001a)bidmachine/protobuf/openrtb/openrtb.proto\u001a%bidmachine/protobuf/sdk/context.proto\u001a!bidmachine/protobuf/sdk/sdk.proto\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001cgoogle/protobuf/struct.proto\"ñ\u0001\n\u000fResponsePayload\u0012.\n\ncache_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012?\n\u0011request_item_spec\u0018\u0004 \u0001(\u000b2$.bidmachine.protobuf.adcom.Placement\u0012\u001c\n\u0012response_cache_url\u0018\u0002 \u0001(\tH\u0000\u0012>\n\u000eresponse_cache\u0018\u0003 \u0001(\u000b2$.bidmachine.protobuf.openrtb.OpenrtbH\u0000B\u000f\n\rpayload_oneof\"½\t\n\u0013RequestTokenPayload\u0012\u0018\n\u0010token_hash_value\u0018\b \u0001(\t\u0012\u0013\n\u0007ad_type\u0018\n \u0001(\tB\u0002\u0018\u0001\u0012<\n\u000eplacement_data\u0018\u0001 \u0001(\u000b2$.bidmachine.protobuf.sdk.context.SDK\u0012N\n\fsession_data\u0018\u0002 \u0001(\u000b24.bidmachine.protobuf.RequestTokenPayload.SessionDataB\u0002\u0018\u0001\u00129\n\u0007session\u0018\u000b \u0001(\u000b2(.bidmachine.protobuf.sdk.context.Session\u0012<\n\u000bdevice_data\u0018\u0003 \u0001(\u000b2'.bidmachine.protobuf.sdk.context.Device\u00128\n\tuser_data\u0018\u0005 \u0001(\u000b2%.bidmachine.protobuf.sdk.context.User\u00126\n\bapp_data\u0018\u0006 \u0001(\u000b2$.bidmachine.protobuf.sdk.context.App\u0012S\n\fhb_placement\u0018\t \u0001(\u000b29.bidmachine.protobuf.headerbidding.HeaderBiddingPlacementB\u0002\u0018\u0001\u0012Q\n\u000bcustom_data\u0018\u0004 \u0003(\u000b28.bidmachine.protobuf.RequestTokenPayload.CustomDataEntryB\u0002\u0018\u0001\u00125\n\tplacement\u0018\f \u0001(\u000b2\".bidmachine.protobuf.sdk.Placement\u0012$\n\u0003ext\u0018\u0007 \u0001(\u000b2\u0017.google.protobuf.Struct\u001aÅ\u0003\n\u000bSessionData\u0012\u0012\n\nsession_id\u0018\u0001 \u0001(\t\u0012\u0017\n\u000fsessionduration\u0018\u0002 \u0001(\u0004\u0012n\n\u0016session_placement_data\u0018\u0003 \u0003(\u000b2N.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementDataEntry\u001a\u008f\u0001\n\u0014SessionPlacementData\u0012\u0010\n\bimpdepth\u0018\u0001 \u0001(\r\u0012\u0012\n\nlastbundle\u0018\u0003 \u0001(\t\u0012\u0013\n\u000blastadomain\u0018\u0004 \u0001(\t\u0012\u0011\n\tclickrate\u0018\u0005 \u0001(\u0002\u0012\u0011\n\tlastclick\u0018\u0006 \u0001(\b\u0012\u0016\n\u000ecompletionrate\u0018\u0007 \u0001(\u0002\u001a\u0086\u0001\n\u0019SessionPlacementDataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012X\n\u0005value\u0018\u0002 \u0001(\u000b2I.bidmachine.protobuf.RequestTokenPayload.SessionData.SessionPlacementData:\u00028\u0001\u001a1\n\u000fCustomDataEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001B,\n\u0016io.bidmachine.protobufB\nCacheProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{b.getDescriptor(), HeaderBiddingProto.getDescriptor(), d.getDescriptor(), SDKContextProto.getDescriptor(), SDKProto.getDescriptor(), tb.getDescriptor(), kb.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_ResponsePayload_descriptor;
    static final i7 internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_ResponsePayload_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_ResponsePayload_fieldAccessorTable = new i7(descriptor2, new String[]{"CacheTime", "RequestItemSpec", "ResponseCacheUrl", "ResponseCache", "PayloadOneof"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_RequestTokenPayload_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_RequestTokenPayload_fieldAccessorTable = new i7(descriptor3, new String[]{"TokenHashValue", "AdType", "PlacementData", "SessionData", "Session", "DeviceData", "UserData", "AppData", "HbPlacement", "CustomData", "Placement", "Ext"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_fieldAccessorTable = new i7(descriptor4, new String[]{"SessionId", "Sessionduration", "SessionPlacementData"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementData_fieldAccessorTable = new i7(descriptor5, new String[]{"Impdepth", "Lastbundle", "Lastadomain", "Clickrate", "Lastclick", "Completionrate"});
        Descriptors.Descriptor descriptor6 = descriptor4.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_RequestTokenPayload_SessionData_SessionPlacementDataEntry_fieldAccessorTable = new i7(descriptor6, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor7 = descriptor3.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_RequestTokenPayload_CustomDataEntry_fieldAccessorTable = new i7(descriptor7, new String[]{"Key", "Value"});
        b.getDescriptor();
        HeaderBiddingProto.getDescriptor();
        d.getDescriptor();
        SDKContextProto.getDescriptor();
        SDKProto.getDescriptor();
        tb.getDescriptor();
        kb.getDescriptor();
    }

    private CacheProto() {
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

package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.adcom.b;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.tb;
import io.odeeo.internal.h.vfsA.QCmNMSGd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SDKContextProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%bidmachine/protobuf/sdk/context.proto\u0012\u001fbidmachine.protobuf.sdk.context\u001a\u001fgoogle/protobuf/timestamp.proto\u001a%bidmachine/protobuf/adcom/adcom.proto\"\u0095\u0002\n\u000eContextualData\u0012\u0011\n\tplacement\u0018\u0001 \u0001(\t\u0012\u0015\n\rmediator_name\u0018\u0002 \u0001(\t\u0012L\n\u0004data\u0018\u0003 \u0001(\u000b2>.bidmachine.protobuf.sdk.context.ContextualData.ImpressionData\u001a\u008a\u0001\n\u000eImpressionData\u0012\r\n\u0005imimd\u0018\u0001 \u0001(\r\u0012\u000b\n\u0003imd\u0018\u0002 \u0001(\r\u0012\f\n\u0004imwp\u0018\u0003 \u0001(\u0002\u0012\n\n\u0002wp\u0018\u0004 \u0001(\u0002\u0012\u0010\n\bimbundle\u0018\u0005 \u0001(\t\u0012\u000e\n\u0006bundle\u0018\u0006 \u0001(\t\u0012\u0010\n\bimagency\u0018\u0007 \u0001(\t\u0012\u000e\n\u0006agency\u0018\b \u0001(\t\"\u0082\u0002\n\u0007Session\u0012\u0012\n\nsession_id\u0018\u0001 \u0001(\t\u0012A\n\u0007context\u0018\u0002 \u0001(\u000b20.bidmachine.protobuf.sdk.context.Session.Context\u001a\u009f\u0001\n\u0007Context\u0012\u0017\n\u000fsessionduration\u0018\u0001 \u0001(\u0004\u0012\n\n\u0002sc\u0018\u0002 \u0001(\r\u0012\u0011\n\tretention\u0018\u0003 \u0001(\r\u0012=\n\u0004data\u0018\u0004 \u0003(\u000b2/.bidmachine.protobuf.sdk.context.ContextualData\u0012\u001d\n\u0015last_session_duration\u0018\u0005 \u0001(\u0004\"B\n\u0003SDK\u0012\u000b\n\u0003sdk\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006sdkver\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006omidpn\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006omidpv\u0018\u0004 \u0001(\t\"\u008a\u0002\n\u0003App\u0012\u0010\n\bapp_name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007app_ver\u0018\u0002 \u0001(\t\u0012?\n\u0007release\u0018\u0003 \u0001(\u000b2..bidmachine.protobuf.adcom.Context.App.Release\u00120\n\finstall_time\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u00125\n\u0011first_launch_time\u0018\u0005 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u0010\n\bstorecat\u0018\u0006 \u0001(\t\u0012\u0013\n\u000bstoresubcat\u0018\u0007 \u0003(\t\u0012\u000f\n\u0007fmwname\u0018\b \u0001(\t\"`\n\u0004User\u0012\u000f\n\u0007consent\u0018\u0001 \u0001(\t\u0012\f\n\u0004gdpr\u0018\u0002 \u0001(\b\u0012\f\n\u0004ccpa\u0018\u0003 \u0001(\t\u0012\u000b\n\u0003gpp\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007gpp_sid\u0018\u0005 \u0003(\r\u0012\r\n\u0005coppa\u0018\u0006 \u0001(\b\"\u00ad\u0005\n\u0006Device\u0012\u000b\n\u0003ifv\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006bm_ifv\u0018\u0002 \u0001(\t\u0012\u0015\n\rinputlanguage\u0018\u0003 \u0003(\t\u0012\u0011\n\tdiskspace\u0018\u0004 \u0001(\u0004\u0012\u0011\n\ttotaldisk\u0018\u0005 \u0001(\u0004\u0012\u0010\n\bringmute\u0018\u0006 \u0001(\b\u0012\u0010\n\bcharging\u0018\u0007 \u0001(\b\u0012\u000f\n\u0007headset\u0018\b \u0001(\b\u0012\u0014\n\fbatterylevel\u0018\t \u0001(\u0002\u0012\u0014\n\fbatterysaver\u0018\n \u0001(\b\u0012\u0010\n\bdarkmode\u0018\u000b \u0001(\b\u0012\u0010\n\bairplane\u0018\f \u0001(\b\u0012\u000b\n\u0003dnd\u0018\r \u0001(\b\u0012\u0012\n\ndevicename\u0018\u000e \u0001(\t\u0012\f\n\u0004time\u0018\u000f \u0001(\u0004\u0012\u0014\n\fscreenbright\u0018\u0010 \u0001(\u0002\u0012\u0011\n\tjailbreak\u0018\u0011 \u0001(\b\u0012\u0012\n\nlastbootup\u0018\u0012 \u0001(\u0004\u0012\u000e\n\u0006access\u0018\u0013 \u0001(\t\u0012\u0013\n\u000bheadsetname\u0018\u0014 \u0001(\t\u0012\u0010\n\btotalmem\u0018\u0015 \u0001(\u0004\u0012\f\n\u0004atts\u0018\u0016 \u0001(\r\u0012\u000f\n\u0007cpuname\u0018\u0019 \u0001(\t\u0012\u0011\n\tcpuvendor\u0018\u001a \u0001(\t\u0012\u000f\n\u0007gpuname\u0018\u001b \u0001(\t\u0012\u0011\n\tgpuvendor\u0018\u001c \u0001(\t\u0012\u0010\n\btimezone\u0018\u001d \u0001(\t\u0012\u000f\n\u0007freemem\u0018\u001e \u0001(\u0004\u0012\u0010\n\bapilevel\u0018\u001f \u0001(\r\u0012H\n\nconnection\u0018\u0017 \u0001(\u000b24.bidmachine.protobuf.adcom.Context.Device.Connection\u0012L\n\faudioContext\u0018\u0018 \u0001(\u000b26.bidmachine.protobuf.adcom.Context.Device.AudioContext\"\u0098\u0002\n\u0007Context\u00121\n\u0003sdk\u0018\u0001 \u0001(\u000b2$.bidmachine.protobuf.sdk.context.SDK\u00121\n\u0003app\u0018\u0002 \u0001(\u000b2$.bidmachine.protobuf.sdk.context.App\u00123\n\u0004user\u0018\u0003 \u0001(\u000b2%.bidmachine.protobuf.sdk.context.User\u00127\n\u0006device\u0018\u0004 \u0001(\u000b2'.bidmachine.protobuf.sdk.context.Device\u00129\n\u0007session\u0018\u0005 \u0001(\u000b2(.bidmachine.protobuf.sdk.context.SessionB/\n\u001aio.bidmachine.protobuf.sdkB\u000fSDKContextProtoP\u0001b\u0006proto3"}, new Descriptors.FileDescriptor[]{tb.getDescriptor(), b.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_App_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_Context_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_Context_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_ContextualData_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_ContextualData_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_Device_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_Device_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_SDK_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_SDK_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_Session_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_context_User_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_context_User_fieldAccessorTable;

    private SDKContextProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_context_ContextualData_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_sdk_context_ContextualData_fieldAccessorTable = new i7(descriptor2, new String[]{"Placement", "MediatorName", "Data"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_sdk_context_ContextualData_ImpressionData_fieldAccessorTable = new i7(descriptor3, new String[]{"Imimd", "Imd", "Imwp", "Wp", "Imbundle", "Bundle", "Imagency", "Agency"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_context_Session_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_sdk_context_Session_fieldAccessorTable = new i7(descriptor4, new String[]{"SessionId", "Context"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_context_Session_Context_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_sdk_context_Session_Context_fieldAccessorTable = new i7(descriptor5, new String[]{"Sessionduration", "Sc", "Retention", "Data", "LastSessionDuration"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_context_SDK_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_sdk_context_SDK_fieldAccessorTable = new i7(descriptor6, new String[]{"Sdk", "Sdkver", "Omidpn", "Omidpv"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(3);
        internal_static_bidmachine_protobuf_sdk_context_App_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_sdk_context_App_fieldAccessorTable = new i7(descriptor7, new String[]{"AppName", "AppVer", "Release", "InstallTime", "FirstLaunchTime", "Storecat", "Storesubcat", "Fmwname"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(4);
        internal_static_bidmachine_protobuf_sdk_context_User_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_sdk_context_User_fieldAccessorTable = new i7(descriptor8, new String[]{"Consent", "Gdpr", "Ccpa", "Gpp", "GppSid", "Coppa"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(5);
        internal_static_bidmachine_protobuf_sdk_context_Device_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_sdk_context_Device_fieldAccessorTable = new i7(descriptor9, new String[]{"Ifv", "BmIfv", "Inputlanguage", "Diskspace", "Totaldisk", "Ringmute", "Charging", "Headset", "Batterylevel", "Batterysaver", "Darkmode", "Airplane", "Dnd", "Devicename", "Time", "Screenbright", "Jailbreak", QCmNMSGd.IZIJSOuQ, "Access", "Headsetname", "Totalmem", "Atts", "Cpuname", "Cpuvendor", "Gpuname", "Gpuvendor", "Timezone", "Freemem", "Apilevel", "Connection", "AudioContext"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(6);
        internal_static_bidmachine_protobuf_sdk_context_Context_descriptor = descriptor10;
        internal_static_bidmachine_protobuf_sdk_context_Context_fieldAccessorTable = new i7(descriptor10, new String[]{"Sdk", "App", "User", "Device", "Session"});
        tb.getDescriptor();
        b.getDescriptor();
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}

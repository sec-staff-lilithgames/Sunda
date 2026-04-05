package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.id;
import com.explorestack.protobuf.kb;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.tb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class SDKAnalyticV2Proto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n*bidmachine/protobuf/sdk/analytics_v2.proto\u0012$bidmachine.protobuf.sdk.analytics_v2\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\u001cgoogle/protobuf/struct.proto\u001a\u001egoogle/protobuf/wrappers.proto\u001a$bidmachine/protobuf/sdk/errors.proto\"õ\u0003\n\u0007Monitor\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012E\n\u0007records\u0018\u0002 \u0003(\u000b24.bidmachine.protobuf.sdk.analytics_v2.Monitor.Record\u001aû\u0001\n\rConfiguration\u0012*\n\u0004name\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012)\n\u0003url\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00120\n\nbatch_size\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u0012.\n\binterval\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u00121\n\rshould_report\u0018\u0005 \u0001(\u000b2\u001a.google.protobuf.BoolValue\u001a\u0096\u0001\n\u0006Record\u0012-\n\ttimestamp\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012'\n\u0006fields\u0018\u0002 \u0001(\u000b2\u0017.google.protobuf.Struct\u00124\n\u0005error\u0018\u0003 \u0001(\u000b2%.bidmachine.protobuf.sdk.errors.Error\"\u0090\b\n\u0006Reader\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012-\n\ttimestamp\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012D\n\u0007records\u0018\u0003 \u0003(\u000b23.bidmachine.protobuf.sdk.analytics_v2.Reader.Record\u001a\u0090\u0002\n\rConfiguration\u0012*\n\u0004name\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012)\n\u0003url\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00125\n\u000fupdate_interval\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.UInt32Value\u0012/\n\u000bunique_only\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.BoolValue\u0012@\n\u0005rules\u0018\u0005 \u0003(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule\u001a¾\u0003\n\u0004Rule\u0012U\n\fgeneral_rule\u0018\u0001 \u0001(\u000b2=.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule.GeneralRuleH\u0000\u0012T\n\fios_log_rule\u0018\u0002 \u0001(\u000b2<.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule.IOSLogRuleH\u0000\u001ad\n\u000bGeneralRule\u0012)\n\u0003tag\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012*\n\u0004path\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a\u0094\u0001\n\nIOSLogRule\u0012)\n\u0003tag\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012,\n\u0006levels\u0018\u0002 \u0003(\u000b2\u001c.google.protobuf.StringValue\u0012-\n\u0007sources\u0018\u0003 \u0003(\u000b2\u001c.google.protobuf.StringValueB\f\n\nrule_oneof\u001a®\u0001\n\u0006Record\u0012?\n\u0004rule\u0018\u0001 \u0001(\u000b21.bidmachine.protobuf.sdk.analytics_v2.Reader.Rule\u0012-\n\braw_data\u0018\u0002 \u0001(\u000b2\u001b.google.protobuf.BytesValue\u00124\n\u0005error\u0018\u0003 \u0001(\u000b2%.bidmachine.protobuf.sdk.errors.Error\"Ö\u0001\n\rConfiguration\u0012M\n\bmonitors\u0018\u0001 \u0003(\u000b2;.bidmachine.protobuf.sdk.analytics_v2.Monitor.Configuration\u0012K\n\u0007readers\u0018\u0002 \u0003(\u000b2:.bidmachine.protobuf.sdk.analytics_v2.Reader.Configuration\u0012)\n\u0003bpk\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\"Å\u0001\n\u0005Event\u0012@\n\u0007monitor\u0018\u0001 \u0001(\u000b2-.bidmachine.protobuf.sdk.analytics_v2.MonitorH\u0000\u0012>\n\u0006reader\u0018\u0002 \u0001(\u000b2,.bidmachine.protobuf.sdk.analytics_v2.ReaderH\u0000\u0012/\n\u000eextras_private\u0018\u0003 \u0001(\u000b2\u0017.google.protobuf.StructB\t\n\u0007payload\"Â\u0001\n\u0005OSLog\u0012C\n\u0007records\u0018\u0001 \u0003(\u000b22.bidmachine.protobuf.sdk.analytics_v2.OSLog.Record\u001at\n\u0006Record\u0012-\n\ttimestamp\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.Timestamp\u0012\u000b\n\u0003tag\u0018\u0002 \u0001(\t\u0012\r\n\u0005level\u0018\u0003 \u0001(\t\u0012\u000e\n\u0006source\u0018\u0004 \u0001(\t\u0012\u000f\n\u0007message\u0018\u0005 \u0001(\tB8\n\u001aio.bidmachine.protobuf.sdkB\u0012SDKAnalyticV2ProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{tb.getDescriptor(), kb.getDescriptor(), id.getDescriptor(), SDKErrorsProto.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor;
    static final i7 internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_fieldAccessorTable = new i7(descriptor2, new String[]{"Name", "Records"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Configuration_fieldAccessorTable = new i7(descriptor3, new String[]{"Name", "Url", "BatchSize", "Interval", "ShouldReport"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Monitor_Record_fieldAccessorTable = new i7(descriptor4, new String[]{"Timestamp", "Fields", "Error"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_fieldAccessorTable = new i7(descriptor5, new String[]{"Name", "Timestamp", "Records"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Configuration_fieldAccessorTable = new i7(descriptor6, new String[]{"Name", "Url", "UpdateInterval", "UniqueOnly", "Rules"});
        Descriptors.Descriptor descriptor7 = descriptor5.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_fieldAccessorTable = new i7(descriptor7, new String[]{"GeneralRule", "IosLogRule", "RuleOneof"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_GeneralRule_fieldAccessorTable = new i7(descriptor8, new String[]{"Tag", "Path"});
        Descriptors.Descriptor descriptor9 = descriptor7.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Rule_IOSLogRule_fieldAccessorTable = new i7(descriptor9, new String[]{"Tag", "Levels", "Sources"});
        Descriptors.Descriptor descriptor10 = descriptor5.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_descriptor = descriptor10;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Reader_Record_fieldAccessorTable = new i7(descriptor10, new String[]{"Rule", "RawData", "Error"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(2);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor = descriptor11;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable = new i7(descriptor11, new String[]{"Monitors", "Readers", "Bpk"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(3);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_descriptor = descriptor12;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_Event_fieldAccessorTable = new i7(descriptor12, new String[]{"Monitor", "Reader", "ExtrasPrivate", "Payload"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(4);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_descriptor = descriptor13;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_fieldAccessorTable = new i7(descriptor13, new String[]{"Records"});
        Descriptors.Descriptor descriptor14 = descriptor13.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_descriptor = descriptor14;
        internal_static_bidmachine_protobuf_sdk_analytics_v2_OSLog_Record_fieldAccessorTable = new i7(descriptor14, new String[]{"Timestamp", "Tag", "Level", "Source", "Message"});
        tb.getDescriptor();
        kb.getDescriptor();
        id.getDescriptor();
        SDKErrorsProto.getDescriptor();
    }

    private SDKAnalyticV2Proto() {
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

package rb;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.m5;
import com.explorestack.protobuf.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final Descriptors.Descriptor f84100a;

    /* renamed from: b, reason: collision with root package name */
    public static final i7 f84101b;

    /* renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f84102c;

    /* renamed from: d, reason: collision with root package name */
    public static final i7 f84103d;

    /* renamed from: e, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f84104e = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n%google/protobuf/compiler/plugin.proto\u0012\u0018google.protobuf.compiler\u001a google/protobuf/descriptor.proto\"F\n\u0007Version\u0012\r\n\u0005major\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005minor\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005patch\u0018\u0003 \u0001(\u0005\u0012\u000e\n\u0006suffix\u0018\u0004 \u0001(\t\"º\u0001\n\u0014CodeGeneratorRequest\u0012\u0018\n\u0010file_to_generate\u0018\u0001 \u0003(\t\u0012\u0011\n\tparameter\u0018\u0002 \u0001(\t\u00128\n\nproto_file\u0018\u000f \u0003(\u000b2$.google.protobuf.FileDescriptorProto\u0012;\n\u0010compiler_version\u0018\u0003 \u0001(\u000b2!.google.protobuf.compiler.Version\"Á\u0002\n\u0015CodeGeneratorResponse\u0012\r\n\u0005error\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012supported_features\u0018\u0002 \u0001(\u0004\u0012B\n\u0004file\u0018\u000f \u0003(\u000b24.google.protobuf.compiler.CodeGeneratorResponse.File\u001a\u007f\n\u0004File\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0017\n\u000finsertion_point\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007content\u0018\u000f \u0001(\t\u0012?\n\u0013generated_code_info\u0018\u0010 \u0001(\u000b2\".google.protobuf.GeneratedCodeInfo\"8\n\u0007Feature\u0012\u0010\n\fFEATURE_NONE\u0010\u0000\u0012\u001b\n\u0017FEATURE_PROTO3_OPTIONAL\u0010\u0001BW\n\u001ccom.google.protobuf.compilerB\fPluginProtosZ)google.golang.org/protobuf/types/pluginpb"}, new Descriptors.FileDescriptor[]{x4.getDescriptor()});

    static {
        new i7(getDescriptor().getMessageTypes().get(0), new String[]{"Major", "Minor", "Patch", "Suffix"});
        new i7(getDescriptor().getMessageTypes().get(1), new String[]{"FileToGenerate", "Parameter", "ProtoFile", "CompilerVersion"});
        Descriptors.Descriptor descriptor = getDescriptor().getMessageTypes().get(2);
        f84100a = descriptor;
        f84101b = new i7(descriptor, new String[]{"Error", "SupportedFeatures", "File"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f84102c = descriptor2;
        f84103d = new i7(descriptor2, new String[]{"Name", "InsertionPoint", "Content", "GeneratedCodeInfo"});
        x4.getDescriptor();
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return f84104e;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}

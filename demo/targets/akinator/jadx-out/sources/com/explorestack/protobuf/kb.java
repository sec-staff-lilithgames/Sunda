package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class kb {

    /* renamed from: a, reason: collision with root package name */
    public static final Descriptors.Descriptor f22312a;

    /* renamed from: b, reason: collision with root package name */
    public static final i7 f22313b;

    /* renamed from: c, reason: collision with root package name */
    public static final Descriptors.Descriptor f22314c;

    /* renamed from: d, reason: collision with root package name */
    public static final Descriptors.Descriptor f22315d;

    /* renamed from: e, reason: collision with root package name */
    public static final i7 f22316e;

    /* renamed from: f, reason: collision with root package name */
    public static final Descriptors.Descriptor f22317f;

    /* renamed from: g, reason: collision with root package name */
    public static final i7 f22318g;

    /* renamed from: h, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f22319h = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001cgoogle/protobuf/struct.proto\u0012\u000fgoogle.protobuf\"\u0084\u0001\n\u0006Struct\u00123\n\u0006fields\u0018\u0001 \u0003(\u000b2#.google.protobuf.Struct.FieldsEntry\u001aE\n\u000bFieldsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012%\n\u0005value\u0018\u0002 \u0001(\u000b2\u0016.google.protobuf.Value:\u00028\u0001\"ê\u0001\n\u0005Value\u00120\n\nnull_value\u0018\u0001 \u0001(\u000e2\u001a.google.protobuf.NullValueH\u0000\u0012\u0016\n\fnumber_value\u0018\u0002 \u0001(\u0001H\u0000\u0012\u0016\n\fstring_value\u0018\u0003 \u0001(\tH\u0000\u0012\u0014\n\nbool_value\u0018\u0004 \u0001(\bH\u0000\u0012/\n\fstruct_value\u0018\u0005 \u0001(\u000b2\u0017.google.protobuf.StructH\u0000\u00120\n\nlist_value\u0018\u0006 \u0001(\u000b2\u001a.google.protobuf.ListValueH\u0000B\u0006\n\u0004kind\"3\n\tListValue\u0012&\n\u0006values\u0018\u0001 \u0003(\u000b2\u0016.google.protobuf.Value*\u001b\n\tNullValue\u0012\u000e\n\nNULL_VALUE\u0010\u0000B\u007f\n\u0013com.google.protobufB\u000bStructProtoP\u0001Z/google.golang.org/protobuf/types/known/structpbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = getDescriptor().getMessageTypes().get(0);
        f22312a = descriptor;
        f22313b = new i7(descriptor, new String[]{"Fields"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f22314c = descriptor2;
        new i7(descriptor2, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        f22315d = descriptor3;
        f22316e = new i7(descriptor3, new String[]{"NullValue", "NumberValue", "StringValue", "BoolValue", "StructValue", "ListValue", "Kind"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        f22317f = descriptor4;
        f22318g = new i7(descriptor4, new String[]{"Values"});
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return f22319h;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}

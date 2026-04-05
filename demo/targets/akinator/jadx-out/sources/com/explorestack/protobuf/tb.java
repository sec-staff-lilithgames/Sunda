package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class tb {

    /* renamed from: a, reason: collision with root package name */
    public static final Descriptors.Descriptor f22671a;

    /* renamed from: b, reason: collision with root package name */
    public static final i7 f22672b;

    /* renamed from: c, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f22673c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fgoogle/protobuf/timestamp.proto\u0012\u000fgoogle.protobuf\"+\n\tTimestamp\u0012\u000f\n\u0007seconds\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005nanos\u0018\u0002 \u0001(\u0005B\u0085\u0001\n\u0013com.google.protobufB\u000eTimestampProtoP\u0001Z2google.golang.org/protobuf/types/known/timestamppbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = getDescriptor().getMessageTypes().get(0);
        f22671a = descriptor;
        f22672b = new i7(descriptor, new String[]{"Seconds", "Nanos"});
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return f22673c;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}

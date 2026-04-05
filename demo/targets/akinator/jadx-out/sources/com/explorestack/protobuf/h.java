package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Descriptors.Descriptor f22181a;

    /* renamed from: b, reason: collision with root package name */
    public static final i7 f22182b;

    /* renamed from: c, reason: collision with root package name */
    public static final Descriptors.FileDescriptor f22183c = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019google/protobuf/any.proto\u0012\u000fgoogle.protobuf\"&\n\u0003Any\u0012\u0010\n\btype_url\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\fBv\n\u0013com.google.protobufB\bAnyProtoP\u0001Z,google.golang.org/protobuf/types/known/anypb¢\u0002\u0003GPBª\u0002\u001eGoogle.Protobuf.WellKnownTypesb\u0006proto3"}, new Descriptors.FileDescriptor[0]);

    static {
        Descriptors.Descriptor descriptor = getDescriptor().getMessageTypes().get(0);
        f22181a = descriptor;
        f22182b = new i7(descriptor, new String[]{"TypeUrl", "Value"});
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return f22183c;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}

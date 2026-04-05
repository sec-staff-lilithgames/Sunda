package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface a3 {
    Object parseDelimitedFrom(InputStream inputStream) throws u1;

    Object parseDelimitedFrom(InputStream inputStream, s0 s0Var) throws u1;

    Object parseFrom(c0 c0Var) throws u1;

    Object parseFrom(c0 c0Var, s0 s0Var) throws u1;

    Object parseFrom(x xVar) throws u1;

    Object parseFrom(x xVar, s0 s0Var) throws u1;

    Object parseFrom(InputStream inputStream) throws u1;

    Object parseFrom(InputStream inputStream, s0 s0Var) throws u1;

    Object parseFrom(ByteBuffer byteBuffer) throws u1;

    Object parseFrom(ByteBuffer byteBuffer, s0 s0Var) throws u1;

    Object parseFrom(byte[] bArr) throws u1;

    Object parseFrom(byte[] bArr, int i10, int i11) throws u1;

    Object parseFrom(byte[] bArr, int i10, int i11, s0 s0Var) throws u1;

    Object parseFrom(byte[] bArr, s0 s0Var) throws u1;

    Object parsePartialDelimitedFrom(InputStream inputStream) throws u1;

    Object parsePartialDelimitedFrom(InputStream inputStream, s0 s0Var) throws u1;

    Object parsePartialFrom(c0 c0Var) throws u1;

    Object parsePartialFrom(c0 c0Var, s0 s0Var) throws u1;

    Object parsePartialFrom(x xVar) throws u1;

    Object parsePartialFrom(x xVar, s0 s0Var) throws u1;

    Object parsePartialFrom(InputStream inputStream) throws u1;

    Object parsePartialFrom(InputStream inputStream, s0 s0Var) throws u1;

    Object parsePartialFrom(byte[] bArr) throws u1;

    Object parsePartialFrom(byte[] bArr, int i10, int i11) throws u1;

    Object parsePartialFrom(byte[] bArr, int i10, int i11, s0 s0Var) throws u1;

    Object parsePartialFrom(byte[] bArr, s0 s0Var) throws u1;
}

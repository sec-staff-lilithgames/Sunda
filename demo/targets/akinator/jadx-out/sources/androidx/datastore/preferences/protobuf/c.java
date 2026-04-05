package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c implements a3 {

    /* renamed from: a, reason: collision with root package name */
    public static final s0 f5825a = s0.getEmptyRegistry();

    public static void a(r2 r2Var) throws u1 {
        if (r2Var == null || r2Var.isInitialized()) {
        } else {
            throw (r2Var instanceof b ? new a4((b) r2Var) : new a4(r2Var)).asInvalidProtocolBufferException().setUnfinishedMessage(r2Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public abstract /* synthetic */ Object parsePartialFrom(c0 c0Var, s0 s0Var) throws u1;

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseDelimitedFrom(InputStream inputStream, s0 s0Var) throws IOException {
        r2 partialDelimitedFrom = parsePartialDelimitedFrom(inputStream, s0Var);
        a(partialDelimitedFrom);
        return partialDelimitedFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialDelimitedFrom(InputStream inputStream, s0 s0Var) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            return parsePartialFrom((InputStream) new a(inputStream, c0.readRawVarint32(i10, inputStream)), s0Var);
        } catch (IOException e10) {
            throw new u1(e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseDelimitedFrom(InputStream inputStream) throws u1 {
        return parseDelimitedFrom(inputStream, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialDelimitedFrom(InputStream inputStream) throws u1 {
        return parsePartialDelimitedFrom(inputStream, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(c0 c0Var) throws u1 {
        return (r2) parsePartialFrom(c0Var, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(x xVar, s0 s0Var) throws u1 {
        c0 c0VarNewCodedInput = xVar.newCodedInput();
        r2 r2Var = (r2) parsePartialFrom(c0VarNewCodedInput, s0Var);
        try {
            c0VarNewCodedInput.checkLastTagWas(0);
            return r2Var;
        } catch (u1 e10) {
            throw e10.setUnfinishedMessage(r2Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(c0 c0Var, s0 s0Var) throws u1 {
        r2 r2Var = (r2) parsePartialFrom(c0Var, s0Var);
        a(r2Var);
        return r2Var;
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(c0 c0Var) throws u1 {
        return parseFrom(c0Var, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(x xVar, s0 s0Var) throws u1 {
        r2 partialFrom = parsePartialFrom(xVar, s0Var);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(x xVar) throws u1 {
        return parsePartialFrom(xVar, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(x xVar) throws u1 {
        return parseFrom(xVar, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(byte[] bArr, int i10, int i11, s0 s0Var) throws u1 {
        c0 c0VarNewInstance = c0.newInstance(bArr, i10, i11);
        r2 r2Var = (r2) parsePartialFrom(c0VarNewInstance, s0Var);
        try {
            c0VarNewInstance.checkLastTagWas(0);
            return r2Var;
        } catch (u1 e10) {
            throw e10.setUnfinishedMessage(r2Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(ByteBuffer byteBuffer, s0 s0Var) throws u1 {
        c0 c0VarNewInstance = c0.newInstance(byteBuffer);
        r2 r2Var = (r2) parsePartialFrom(c0VarNewInstance, s0Var);
        try {
            c0VarNewInstance.checkLastTagWas(0);
            a(r2Var);
            return r2Var;
        } catch (u1 e10) {
            throw e10.setUnfinishedMessage(r2Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(byte[] bArr, int i10, int i11) throws u1 {
        return parsePartialFrom(bArr, i10, i11, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(byte[] bArr, s0 s0Var) throws u1 {
        return parsePartialFrom(bArr, 0, bArr.length, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(ByteBuffer byteBuffer) throws u1 {
        return parseFrom(byteBuffer, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(byte[] bArr) throws u1 {
        return parsePartialFrom(bArr, 0, bArr.length, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(byte[] bArr, int i10, int i11, s0 s0Var) throws u1 {
        r2 partialFrom = parsePartialFrom(bArr, i10, i11, s0Var);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(InputStream inputStream, s0 s0Var) throws u1 {
        c0 c0VarNewInstance = c0.newInstance(inputStream);
        r2 r2Var = (r2) parsePartialFrom(c0VarNewInstance, s0Var);
        try {
            c0VarNewInstance.checkLastTagWas(0);
            return r2Var;
        } catch (u1 e10) {
            throw e10.setUnfinishedMessage(r2Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(byte[] bArr, int i10, int i11) throws u1 {
        return parseFrom(bArr, i10, i11, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(byte[] bArr, s0 s0Var) throws u1 {
        return parseFrom(bArr, 0, bArr.length, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(byte[] bArr) throws u1 {
        return parseFrom(bArr, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(InputStream inputStream, s0 s0Var) throws u1 {
        r2 partialFrom = parsePartialFrom(inputStream, s0Var);
        a(partialFrom);
        return partialFrom;
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parsePartialFrom(InputStream inputStream) throws u1 {
        return parsePartialFrom(inputStream, f5825a);
    }

    @Override // androidx.datastore.preferences.protobuf.a3
    public r2 parseFrom(InputStream inputStream) throws u1 {
        return parseFrom(inputStream, f5825a);
    }
}

package androidx.datastore.preferences.protobuf;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b implements r2 {
    protected int memoizedHashCode = 0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public static abstract class a implements q2 {
        public abstract e1 b(b bVar);

        @Override // androidx.datastore.preferences.protobuf.q2
        public abstract /* synthetic */ r2 build();

        @Override // androidx.datastore.preferences.protobuf.q2
        public abstract /* synthetic */ r2 buildPartial();

        @Override // androidx.datastore.preferences.protobuf.q2
        public abstract /* synthetic */ q2 clear();

        @Override // 
        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public abstract a mo70clone();

        @Override // androidx.datastore.preferences.protobuf.q2, androidx.datastore.preferences.protobuf.s2
        public abstract /* synthetic */ r2 getDefaultInstanceForType();

        @Override // androidx.datastore.preferences.protobuf.q2, androidx.datastore.preferences.protobuf.s2
        public abstract /* synthetic */ boolean isInitialized();

        @Override // androidx.datastore.preferences.protobuf.q2
        public boolean mergeDelimitedFrom(InputStream inputStream, s0 s0Var) throws IOException {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return false;
            }
            mergeFrom((InputStream) new androidx.datastore.preferences.protobuf.a(inputStream, c0.readRawVarint32(i10, inputStream)), s0Var);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public abstract a mergeFrom(c0 c0Var, s0 s0Var) throws IOException;

        public final String a(String str) {
            return "Reading " + getClass().getName() + " from a " + str + OcvDtWCQ.HGWGBc;
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public boolean mergeDelimitedFrom(InputStream inputStream) throws IOException {
            return mergeDelimitedFrom(inputStream, s0.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(c0 c0Var) throws IOException {
            return mergeFrom(c0Var, s0.getEmptyRegistry());
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(x xVar) throws u1 {
            try {
                c0 c0VarNewCodedInput = xVar.newCodedInput();
                mergeFrom(c0VarNewCodedInput);
                c0VarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (u1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(a("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(x xVar, s0 s0Var) throws u1 {
            try {
                c0 c0VarNewCodedInput = xVar.newCodedInput();
                mergeFrom(c0VarNewCodedInput, s0Var);
                c0VarNewCodedInput.checkLastTagWas(0);
                return this;
            } catch (u1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(a("ByteString"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(byte[] bArr) throws u1 {
            return mergeFrom(bArr, 0, bArr.length);
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(byte[] bArr, int i10, int i11) throws u1 {
            try {
                c0 c0VarNewInstance = c0.newInstance(bArr, i10, i11);
                mergeFrom(c0VarNewInstance);
                c0VarNewInstance.checkLastTagWas(0);
                return this;
            } catch (u1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(a("byte array"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(byte[] bArr, s0 s0Var) throws u1 {
            return mergeFrom(bArr, 0, bArr.length, s0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(byte[] bArr, int i10, int i11, s0 s0Var) throws u1 {
            try {
                c0 c0VarNewInstance = c0.newInstance(bArr, i10, i11);
                mergeFrom(c0VarNewInstance, s0Var);
                c0VarNewInstance.checkLastTagWas(0);
                return this;
            } catch (u1 e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException(a("byte array"), e11);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(InputStream inputStream) throws IOException {
            c0 c0VarNewInstance = c0.newInstance(inputStream);
            mergeFrom(c0VarNewInstance);
            c0VarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(InputStream inputStream, s0 s0Var) throws IOException {
            c0 c0VarNewInstance = c0.newInstance(inputStream);
            mergeFrom(c0VarNewInstance, s0Var);
            c0VarNewInstance.checkLastTagWas(0);
            return this;
        }

        @Override // androidx.datastore.preferences.protobuf.q2
        public a mergeFrom(r2 r2Var) {
            if (getDefaultInstanceForType().getClass().isInstance(r2Var)) {
                return b((b) r2Var);
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    public int a() {
        throw new UnsupportedOperationException();
    }

    public int b(m3 m3Var) {
        int iA = a();
        if (iA != -1) {
            return iA;
        }
        int serializedSize = m3Var.getSerializedSize(this);
        d(serializedSize);
        return serializedSize;
    }

    public final String c(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void d(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.r2, androidx.datastore.preferences.protobuf.s2
    public abstract /* synthetic */ r2 getDefaultInstanceForType();

    @Override // androidx.datastore.preferences.protobuf.r2
    public abstract /* synthetic */ a3 getParserForType();

    @Override // androidx.datastore.preferences.protobuf.r2
    public abstract /* synthetic */ int getSerializedSize();

    @Override // androidx.datastore.preferences.protobuf.r2, androidx.datastore.preferences.protobuf.s2
    public abstract /* synthetic */ boolean isInitialized();

    @Override // androidx.datastore.preferences.protobuf.r2
    public abstract /* synthetic */ q2 newBuilderForType();

    @Override // androidx.datastore.preferences.protobuf.r2
    public abstract /* synthetic */ q2 toBuilder();

    @Override // androidx.datastore.preferences.protobuf.r2
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            l0 l0VarNewInstance = l0.newInstance(bArr);
            writeTo(l0VarNewInstance);
            l0VarNewInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException(c("byte array"), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r2
    public x toByteString() {
        try {
            int serializedSize = getSerializedSize();
            s sVar = x.f6099c;
            q qVar = new q(serializedSize);
            writeTo(qVar.getCodedOutput());
            return qVar.build();
        } catch (IOException e10) {
            throw new RuntimeException(c("ByteString"), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r2
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int iComputeUInt32SizeNoTag = l0.computeUInt32SizeNoTag(serializedSize) + serializedSize;
        if (iComputeUInt32SizeNoTag > 4096) {
            iComputeUInt32SizeNoTag = 4096;
        }
        l0 l0VarNewInstance = l0.newInstance(outputStream, iComputeUInt32SizeNoTag);
        l0VarNewInstance.writeUInt32NoTag(serializedSize);
        writeTo(l0VarNewInstance);
        l0VarNewInstance.flush();
    }

    @Override // androidx.datastore.preferences.protobuf.r2
    public abstract /* synthetic */ void writeTo(l0 l0Var) throws IOException;

    @Override // androidx.datastore.preferences.protobuf.r2
    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = l0.f5947c;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        l0 l0VarNewInstance = l0.newInstance(outputStream, serializedSize);
        writeTo(l0VarNewInstance);
        l0VarNewInstance.flush();
    }
}

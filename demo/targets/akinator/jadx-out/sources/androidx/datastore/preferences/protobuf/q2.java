package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface q2 extends s2, Cloneable {
    r2 build();

    r2 buildPartial();

    q2 clear();

    /* renamed from: clone */
    q2 mo70clone();

    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ r2 getDefaultInstanceForType();

    @Override // androidx.datastore.preferences.protobuf.s2
    /* synthetic */ boolean isInitialized();

    boolean mergeDelimitedFrom(InputStream inputStream) throws IOException;

    boolean mergeDelimitedFrom(InputStream inputStream, s0 s0Var) throws IOException;

    q2 mergeFrom(c0 c0Var) throws IOException;

    q2 mergeFrom(c0 c0Var, s0 s0Var) throws IOException;

    q2 mergeFrom(r2 r2Var);

    q2 mergeFrom(x xVar) throws u1;

    q2 mergeFrom(x xVar, s0 s0Var) throws u1;

    q2 mergeFrom(InputStream inputStream) throws IOException;

    q2 mergeFrom(InputStream inputStream, s0 s0Var) throws IOException;

    q2 mergeFrom(byte[] bArr) throws u1;

    q2 mergeFrom(byte[] bArr, int i10, int i11) throws u1;

    q2 mergeFrom(byte[] bArr, int i10, int i11, s0 s0Var) throws u1;

    q2 mergeFrom(byte[] bArr, s0 s0Var) throws u1;
}

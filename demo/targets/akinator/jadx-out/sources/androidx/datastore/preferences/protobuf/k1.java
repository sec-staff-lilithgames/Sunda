package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface k1 extends s1 {
    void addBoolean(boolean z10);

    boolean getBoolean(int i10);

    @Override // androidx.datastore.preferences.protobuf.s1
    /* synthetic */ boolean isModifiable();

    @Override // androidx.datastore.preferences.protobuf.s1
    /* synthetic */ void makeImmutable();

    @Override // androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    k1 mutableCopyWithCapacity(int i10);

    @Override // androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    /* bridge */ /* synthetic */ default s1 mutableCopyWithCapacity(int i10) {
        return ((h) this).mutableCopyWithCapacity(i10);
    }

    boolean setBoolean(int i10, boolean z10);
}

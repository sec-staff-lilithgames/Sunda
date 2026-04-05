package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface q1 extends s1 {
    void addInt(int i10);

    int getInt(int i10);

    @Override // androidx.datastore.preferences.protobuf.s1
    /* synthetic */ boolean isModifiable();

    @Override // androidx.datastore.preferences.protobuf.s1
    /* synthetic */ void makeImmutable();

    @Override // androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    q1 mutableCopyWithCapacity(int i10);

    @Override // androidx.datastore.preferences.protobuf.s1, androidx.datastore.preferences.protobuf.p1
    /* bridge */ /* synthetic */ default s1 mutableCopyWithCapacity(int i10) {
        return ((j1) this).mutableCopyWithCapacity(i10);
    }

    int setInt(int i10, int i11);
}

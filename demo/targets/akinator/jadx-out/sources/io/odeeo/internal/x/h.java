package io.odeeo.internal.x;

import io.odeeo.internal.b.a0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.s.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class h implements a.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f67511a;

    public h(String str) {
        this.f67511a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ t getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    @Override // io.odeeo.internal.s.a.b
    public /* bridge */ /* synthetic */ void populateMediaMetadata(a0.b bVar) {
        super.populateMediaMetadata(bVar);
    }

    public String toString() {
        return this.f67511a;
    }
}

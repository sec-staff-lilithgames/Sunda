package io.odeeo.internal.a0;

import android.net.Uri;
import io.odeeo.internal.p0.t;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f62458a = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements v {
        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public /* bridge */ /* synthetic */ t createMediaSource(Uri uri) {
            return super.createMediaSource(uri);
        }

        @Override // io.odeeo.internal.a0.v
        public int[] getSupportedTypes() {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public /* bridge */ /* synthetic */ v setStreamKeys(List list) {
            return super.setStreamKeys(list);
        }

        @Override // io.odeeo.internal.a0.v
        public t createMediaSource(io.odeeo.internal.b.z zVar) {
            throw new UnsupportedOperationException();
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public v setDrmHttpDataSourceFactory(t.b bVar) {
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public v setDrmSessionManager(io.odeeo.internal.f.h hVar) {
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        public v setDrmSessionManagerProvider(io.odeeo.internal.f.i iVar) {
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        @Deprecated
        public v setDrmUserAgent(String str) {
            return this;
        }

        @Override // io.odeeo.internal.a0.v
        public v setLoadErrorHandlingPolicy(io.odeeo.internal.p0.v vVar) {
            return this;
        }
    }

    @Deprecated
    default t createMediaSource(Uri uri) {
        return createMediaSource(io.odeeo.internal.b.z.fromUri(uri));
    }

    t createMediaSource(io.odeeo.internal.b.z zVar);

    int[] getSupportedTypes();

    @Deprecated
    v setDrmHttpDataSourceFactory(t.b bVar);

    @Deprecated
    v setDrmSessionManager(io.odeeo.internal.f.h hVar);

    v setDrmSessionManagerProvider(io.odeeo.internal.f.i iVar);

    @Deprecated
    v setDrmUserAgent(String str);

    v setLoadErrorHandlingPolicy(io.odeeo.internal.p0.v vVar);

    @Deprecated
    default v setStreamKeys(List<Object> list) {
        return this;
    }
}
